package t00;

/* loaded from: classes7.dex */
public final class n2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495868p;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray;
        org.json.JSONArray optJSONArray2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        t00.m2 m2Var = new t00.m2();
        m2Var.f495852a = callback;
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.u[] uVarArr = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.u.f147535d;
        int optInt = optJSONObject != null ? optJSONObject.optInt("showShareType", 0) : 0;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShareToContactsEcsActionHandler", "share to contact context is null");
            m2Var.a("share to contact context is null");
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.s sVar = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.s.f147534a;
        java.util.ArrayList arrayList = null;
        if (optInt == 0) {
            if (optJSONObject != null && (optJSONArray2 = optJSONObject.optJSONArray("encryptUserNames")) != null) {
                e06.k m17 = e06.p.m(0, optJSONArray2.length());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m17, 10));
                java.util.Iterator it = m17.iterator();
                while (((e06.j) it).hasNext()) {
                    arrayList2.add(optJSONArray2.optString(((kz5.x0) it).b()));
                }
                arrayList = arrayList2;
            }
            sVar.b(context, optJSONObject, jSONObject, arrayList, m2Var, true);
            return;
        }
        if (optInt != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShareToContactsEcsActionHandler", "share to contact use unKnown shareType: " + optInt);
            m2Var.a("unKnown shareType: " + optInt);
            return;
        }
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("encryptUserNames")) != null) {
            e06.k m18 = e06.p.m(0, optJSONArray.length());
            arrayList = new java.util.ArrayList(kz5.d0.q(m18, 10));
            java.util.Iterator it6 = m18.iterator();
            while (((e06.j) it6).hasNext()) {
                arrayList.add(optJSONArray.optString(((kz5.x0) it6).b()));
            }
        }
        if (!(arrayList == null || arrayList.isEmpty())) {
            sVar.b(context, optJSONObject, jSONObject, arrayList, m2Var, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShareToContactsEcsActionHandler", "share to contact encryptUserNames is empty");
            m2Var.a("share direct encryptUserNames is empty");
        }
    }

    @Override // t00.r0
    public org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envHandler, "envHandler");
        org.json.JSONObject mo13732x1456a638 = envHandler.mo13732x1456a638();
        if (mo13732x1456a638 == null) {
            mo13732x1456a638 = new org.json.JSONObject();
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if ((optJSONObject != null ? optJSONObject.optInt("ecsSharMsgType") : -1) == 4) {
            org.json.JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("imageParams") : null;
            java.lang.String optString = optJSONObject2 != null ? optJSONObject2.optString("imagePath") : null;
            boolean z17 = true;
            if (!(optString == null || optString.length() == 0)) {
                if (r26.i0.A(optString, "http://", false, 2, null) || r26.i0.y(optString, "https://", false)) {
                    com.p314xaae8f345.mm.vfs.r6 mo13730x6665a5c5 = envHandler.mo13730x6665a5c5("ecs_share_image_" + java.lang.System.currentTimeMillis());
                    if (mo13730x6665a5c5 != null) {
                        mo13732x1456a638.put("outputPath", mo13730x6665a5c5.o());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShareToContactsEcsActionHandler", "prepareEnvData, network image, outputPath: " + mo13730x6665a5c5.u() + ", url: " + optString);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShareToContactsEcsActionHandler", "prepareEnvData, allocTempFile failed for network image");
                    }
                } else {
                    java.lang.String mo13731xbb4d21ce = envHandler.mo13731xbb4d21ce(optString);
                    if (mo13731xbb4d21ce != null && mo13731xbb4d21ce.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShareToContactsEcsActionHandler", "prepareEnvData, failed to resolve local path: ".concat(optString));
                    } else {
                        mo13732x1456a638.put("inputPath", mo13731xbb4d21ce);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShareToContactsEcsActionHandler", "prepareEnvData, local image path: " + mo13731xbb4d21ce);
                    }
                }
            }
        }
        return mo13732x1456a638;
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
