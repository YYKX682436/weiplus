package gc4;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final gc4.n f351998a = new gc4.n();

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("disableWechatCutSame", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_maas_disable_wechat_cutsame, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThirdAppJumpHelper", "disableWechatCutSame " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("disableWechatCutSame", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return z17;
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        java.lang.String str3 = "";
        if ((str2 == null || str2.length() == 0) || !r26.n0.D(str2, "miaojianExtInfo", false, 2, null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        try {
            java.lang.String mo15082x48bce8a4 = new cl0.g(str2).mo15082x48bce8a4("miaojianExtInfo");
            if (android.text.TextUtils.isEmpty(mo15082x48bce8a4)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            } else {
                cl0.g gVar = new cl0.g();
                gVar.h("APP_TYPE", "APP_TYPE_SECOND_CUP");
                gVar.h("MSG_EXT", mo15082x48bce8a4);
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                str3 = gVar2;
            }
        } catch (cl0.f unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ThirdAppJumpHelper", "parse SecondCutSimpleStyle JSON error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            try {
                if (android.text.TextUtils.isEmpty(str2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                } else {
                    java.lang.String mo15082x48bce8a42 = new cl0.g(m21.y.u(str2)).mo15082x48bce8a4("miaojianExtInfo");
                    if (android.text.TextUtils.isEmpty(mo15082x48bce8a42)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                    } else {
                        cl0.g gVar3 = new cl0.g();
                        gVar3.h("APP_TYPE", "APP_TYPE_SECOND_CUP");
                        gVar3.h("MSG_EXT", mo15082x48bce8a42);
                        java.lang.String gVar4 = gVar3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                        str3 = gVar4;
                    }
                }
            } catch (cl0.f unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ThirdAppJumpHelper", "parse SecondCutSimpleStyle JSON error");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return str3;
    }

    public final gc4.l c(java.lang.String str) {
        java.lang.Object m143895xf1229813;
        gc4.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parsedMiaojianCutSameInfo", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            byte[] decode = android.util.Base64.decode(str, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(new java.lang.String(decode, r26.c.f450398a)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ThirdAppJumpHelper", m143898xd4a2fc34, "getJson fail", new java.lang.Object[0]);
        }
        gc4.l lVar2 = null;
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) m143895xf1229813;
        if (jSONObject != null) {
            if (jSONObject.has("templateId")) {
                java.lang.String string = jSONObject.getString("templateId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String optString = jSONObject.optString("musicKey", "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                lVar = new gc4.l(string, optString);
            } else {
                lVar = null;
            }
            if (lVar != null) {
                uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                ((ez0.i) hVar).getClass();
                java.lang.String templateId = lVar.f351993a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
                nz0.o.f423063a.e(templateId, 4);
                lVar2 = lVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThirdAppJumpHelper", "parsedMiaojianCutSameInfo: " + lVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parsedMiaojianCutSameInfo", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return lVar2;
    }
}
