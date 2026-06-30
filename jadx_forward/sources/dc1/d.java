package dc1;

/* loaded from: classes8.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f65817x366c91de = 1040;

    /* renamed from: NAME */
    private static final java.lang.String f65818x24728b = "openCustomerServiceChat";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f310224g = new java.util.concurrent.ConcurrentHashMap();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2;
        java.lang.String optString = data != null ? data.optString("extInfo") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat extInfo: %s", optString);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f310224g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (data == null || (str = data.toString()) == null) {
            str = "";
        }
        concurrentHashMap.put(valueOf, str);
        G(lVar, data, mq0.z.f412180u, "");
        if (optString == null || optString.length() == 0) {
            E(lVar, i17, 1, "extInfo empty");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(optString);
        java.lang.String optString2 = jSONObject.optString("url");
        if (optString2 == null || optString2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat url invalid");
            E(lVar, i17, 1, "url empty");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 8);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString3 = jSONObject.optString("url", "");
        java.lang.String optString4 = jSONObject.optString("finder_context", "");
        u65.a aVar = new u65.a(2);
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
        c11207x71c7a1c1.f153805d = lVar != null ? lVar.mo50352x76847179() : null;
        c11207x71c7a1c1.f153806e = currentTimeMillis;
        c11207x71c7a1c1.f153807f = optInt;
        c11207x71c7a1c1.f153823y = optString4;
        r45.s4 s4Var = new r45.s4();
        s4Var.f467019d = optString3;
        r45.l05 l05Var = new r45.l05();
        l05Var.f460594f = optString3;
        l05Var.f460592d = c11207x71c7a1c1.f153807f;
        l05Var.f460593e = F(lVar, jSONObject, data);
        s4Var.f467022g = l05Var;
        c11207x71c7a1c1.f153810i = s4Var;
        c11207x71c7a1c1.f153809h = j41.f0.a(c11207x71c7a1c1.f153807f);
        r45.g15 g15Var = new r45.g15();
        boolean optBoolean = data.optBoolean("showMessageCard", false);
        g15Var.f456337d = optBoolean;
        if (optBoolean) {
            g15Var.f456338e = data.optString("sendMessageTitle");
            g15Var.f456339f = data.optString("sendMessagePath");
            java.lang.String optString5 = data.optString("sendMessageImg");
            g15Var.f456340g = optString5;
            g15Var.f456341h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString5);
            if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) {
                g15Var.f456342i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar).V0(), g15Var.f456340g, true));
            }
            if (D()) {
                g15Var.f456353w = data.optString("sendMessageHintTitle");
                org.json.JSONObject optJSONObject = data.optJSONObject("sendMessageParam");
                g15Var.f456354x = optJSONObject != null ? optJSONObject.toString() : null;
            }
        }
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar).V0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = (V0 == null || (mo32091x9a3f0ba2 = V0.mo32091x9a3f0ba2()) == null) ? null : mo32091x9a3f0ba2.E0();
            if (E0 != null) {
                g15Var.f456343m = V0.mo48798x74292566();
                g15Var.f456344n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.a(lVar);
                g15Var.f456345o = E0.f387374d;
                g15Var.f456346p = E0.f387376f;
                g15Var.f456347q = E0.f387385r.f156932d;
                g15Var.f456348r = E0.f387385r.f33456x1c82a56c;
                g15Var.f456349s = E0.f387385r.f156905md5;
                g15Var.f456351u = V0.X1();
                g15Var.f456352v = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.b(V0.mo48798x74292566());
            }
        }
        c11207x71c7a1c1.f153822x.putExtra("key_appbrand_chat_info", g15Var.mo14344x5f01b1f6());
        android.content.Intent intent = c11207x71c7a1c1.f153822x;
        java.lang.String mo48798x74292566 = lVar != null ? lVar.mo48798x74292566() : null;
        data.put("appId", mo48798x74292566 != null ? mo48798x74292566 : "");
        intent.putExtra("key_appbrand_check_bind_info", data.toString());
        android.content.Intent intent2 = new android.content.Intent();
        c11207x71c7a1c1.f153821w = intent2;
        android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77777x504cd8a2, "createFreeHandler(...)");
        intent2.putExtra("key_result_receiver", new com.p314xaae8f345.mm.p983xc3c3c8ee.p984x633fb29.ResultReceiverC11209x6faff39d(m77777x504cd8a2, new dc1.c(this, lVar, i17, aVar)));
        C(c11207x71c7a1c1);
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x) {
            int a17 = cf.b.a(this);
            j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
            if (zVar != null) {
                dc1.a aVar2 = new dc1.a(a17, aVar);
                l41.g2 g2Var = (l41.g2) zVar;
                g2Var.Ai(c11207x71c7a1c1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuStartConversationService", "startConversationForRequest %s", c11207x71c7a1c1);
                android.content.Intent intent3 = c11207x71c7a1c1.f153821w;
                if (intent3 == null) {
                    intent3 = new android.content.Intent();
                }
                g2Var.wi(intent3, c11207x71c7a1c1);
                intent3.setClassName(c11207x71c7a1c1.f153805d, "com.tencent.mm.openim.ui.OpenIMKefuConfirmUI");
                if (!(c11207x71c7a1c1.f153805d instanceof android.app.Activity)) {
                    intent3.addFlags(268435456);
                }
                if (com.p314xaae8f345.mm.ui.b2.a(c11207x71c7a1c1.f153805d, true, new android.content.Intent[]{intent3}, new java.lang.Object[0])) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuStartConversationService", "startConversationForResult hit duplicated start");
                } else {
                    android.content.Context context = c11207x71c7a1c1.f153805d;
                    if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78546x70d84175((com.p314xaae8f345.mm.ui.da) aVar2, intent3, a17);
                    } else if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                        ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).m78743x70d84175(new l41.f2(aVar2), intent3, a17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuStartConversationService", "startConversationForRequest context is not MMActivity or MMFragmentActivity");
                        intent3.addFlags(268435456);
                        android.content.Context context2 = c11207x71c7a1c1.f153805d;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent3);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationForResult", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;ILcom/tencent/mm/ui/MMActivity$IMMOnActivityResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context2.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context2, "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationForResult", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;ILcom/tencent/mm/ui/MMActivity$IMMOnActivityResult;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.putExtra("key_result_err_code", 0);
                        intent4.putExtra("key_result_err_msg", "ok");
                        aVar2.mo9729x757c998b(a17, 1, intent4);
                    }
                }
            }
        } else {
            aVar.b();
            j41.z zVar2 = (j41.z) i95.n0.c(j41.z.class);
            if (zVar2 != null) {
                ((l41.g2) zVar2).Bi(c11207x71c7a1c1);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat scene: %s, data: %s", java.lang.Integer.valueOf(optInt), data);
    }

    public void C(com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
    }

    public boolean D() {
        return false;
    }

    public final void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, int i18, java.lang.String str) {
        java.lang.String p17;
        if (lVar != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(i18));
            if (i18 != 0) {
                p17 = p("fail " + str, hashMap);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p17);
            } else {
                p17 = p("ok", hashMap);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p17);
            }
            lVar.a(i17, p17);
        }
        try {
            java.lang.String str2 = (java.lang.String) this.f310224g.remove(java.lang.Integer.valueOf(i17));
            if (str2 == null) {
                str2 = "";
            }
            G(lVar, str2.length() > 0 ? new org.json.JSONObject(str2) : null, i18 == 0 ? mq0.z.f412181v : mq0.z.f412182w, str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] onCallback parse cachedData failed", e17);
        }
    }

    public java.lang.String F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject extInfo, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String mo48798x74292566 = lVar != null ? lVar.mo48798x74292566() : null;
        return mo48798x74292566 == null ? "" : mo48798x74292566;
    }

    public final void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, mq0.z zVar, java.lang.String str) {
        java.lang.String optString;
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("bizInfo", "");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
                return;
            }
        } else {
            optString = null;
        }
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("traceId", "") : null;
        java.lang.String str2 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("frameSetName", "") : null;
        java.lang.String str3 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("implType", "") : null;
        java.lang.String str4 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("bizName", "") : null;
        java.lang.String str5 = optString5 == null ? "" : optString5;
        java.lang.String optString6 = jSONObject != null ? jSONObject.optString("bizScene", "") : null;
        java.lang.String str6 = optString6 == null ? "" : optString6;
        mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
        if (c0Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("apiName", f65818x24728b);
        boolean z17 = true;
        if (optString.length() > 0) {
            linkedHashMap.put("uxinfo", optString);
        }
        if (str.length() <= 0) {
            z17 = false;
        }
        if (z17) {
            linkedHashMap.put("errMsg", str);
        }
        mq0.c0.ig(c0Var, zVar, str5, str6, str2, str3, str4, null, linkedHashMap, 64, null);
    }
}
