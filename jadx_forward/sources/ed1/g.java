package ed1;

/* loaded from: classes15.dex */
public final class g implements ed1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ed1.h f332777a;

    public g(ed1.h hVar) {
        this.f332777a = hVar;
    }

    @Override // ed1.i
    /* renamed from: onResult */
    public final void mo127322x57429edc(int i17, java.lang.String str) {
        new java.util.HashMap().put("errCode", java.lang.Integer.valueOf(i17));
        ed1.h hVar = this.f332777a;
        if (i17 == 0) {
            android.content.Context context = hVar.f332779c;
            if (context instanceof android.app.Activity) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                hVar.f332778b = (android.app.Activity) context;
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                try {
                    org.json.JSONObject jSONObject = hVar.f332781e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
                    org.json.JSONArray jSONArray = jSONObject.getJSONArray("aidList");
                    int length = jSONArray.length();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceRegisterService", "mData: %s, aidList: %s, length: %d", java.lang.String.valueOf(hVar.f332781e), jSONArray.toString(), java.lang.Integer.valueOf(length));
                    for (int i18 = 0; i18 < length; i18++) {
                        java.lang.String upperCase = jSONArray.get(i18).toString().toUpperCase(java.util.Locale.ROOT);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
                        arrayList.add(upperCase);
                    }
                    android.app.Activity activity = hVar.f332778b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
                    dd1.a aVar = hVar.f332780d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                    java.util.List a17 = hVar.a(activity, aVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceRegisterService", "checkAidCanRegister registeredAidList: " + a17 + ", deltaAidList=" + arrayList);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : a17) {
                        if (arrayList.contains((java.lang.String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HceRegisterService", "aid register conflict, but liteapp use for payment first");
                    }
                    android.content.Intent intent = new android.content.Intent(hVar.f332778b, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab.class);
                    org.json.JSONObject jSONObject2 = hVar.f332781e;
                    java.lang.String str2 = "";
                    if (jSONObject2 != null) {
                        str2 = jSONObject2.optString("liteAppId", "");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "optString(...)");
                    }
                    intent.putExtra("key_appid", str2);
                    intent.putStringArrayListExtra("key_aid_list", arrayList);
                    intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0, 1);
                    android.app.Activity activity2 = hVar.f332778b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity2);
                    activity2.startService(intent);
                    arrayList.addAll(a17);
                    android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(hVar.f332778b);
                    if (defaultAdapter == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HceRegisterService", "NfcAdapter is null when register aids");
                        dd1.a aVar2 = hVar.f332780d;
                        if (aVar2 != null) {
                            aVar2.b(hVar.b("NfcAdapter is null when register aids"));
                        }
                    } else {
                        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter);
                        if (cardEmulation != null) {
                            try {
                                android.app.Activity activity3 = hVar.f332778b;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity3);
                                android.content.ComponentName componentName = new android.content.ComponentName(activity3, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce.C12193x5bbe54ab.class);
                                boolean registerAidsForService = cardEmulation.registerAidsForService(componentName, "payment", arrayList);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HceRegisterService", "register aids result: %b", java.lang.Boolean.valueOf(registerAidsForService));
                                if (registerAidsForService) {
                                    java.util.List<java.lang.String> aidsForService = cardEmulation.getAidsForService(componentName, "payment");
                                    if (aidsForService != null && aidsForService.size() > 0) {
                                        int size = aidsForService.size();
                                        for (int i19 = 0; i19 < size; i19++) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HceRegisterService", "dynamicAIDList aid=" + aidsForService.get(i19));
                                        }
                                    }
                                    dd1.a aVar3 = hVar.f332780d;
                                    if (aVar3 != null) {
                                        aVar3.b(ed1.k.e(hVar, null, 1, null));
                                    }
                                } else {
                                    dd1.a aVar4 = hVar.f332780d;
                                    if (aVar4 != null) {
                                        aVar4.b(hVar.b("registerAidsForService result failed"));
                                    }
                                }
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HceRegisterService", e17, "HceRegisterService aid exception", new java.lang.Object[0]);
                                dd1.a aVar5 = hVar.f332780d;
                                if (aVar5 != null) {
                                    aVar5.b(hVar.b("registerAidsForService exception"));
                                }
                            }
                        }
                    }
                } catch (java.lang.Exception unused) {
                    dd1.a aVar6 = hVar.f332780d;
                    if (aVar6 != null) {
                        aVar6.b(hVar.c(13003, "failed: aid_list invalid"));
                    }
                }
            } else {
                dd1.a aVar7 = hVar.f332780d;
                if (aVar7 != null) {
                    aVar7.b(hVar.b("fail: unknown error"));
                }
            }
        } else {
            dd1.a aVar8 = hVar.f332780d;
            if (aVar8 != null) {
                aVar8.b(hVar.c(i17, "checkIsSupportHCE fail: " + str));
            }
        }
        hVar.f332780d = null;
        hVar.f332779c = null;
        hVar.f332778b = null;
        hVar.f332781e = null;
    }
}
