package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public final class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f33992x366c91de = 1001;

    /* renamed from: NAME */
    private static final java.lang.String f33993x24728b = "openChannelsRewardedVideoAd";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f412091d);
        C(jSONObject, mq0.z.f412180u, kz5.q0.f395534d);
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, env is null");
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, context is null");
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject.put("action", f33993x24728b);
            jSONObject2.put("extInfo", jSONObject);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            android.content.Intent a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e.a(mo50352x76847179);
            android.content.Context mo50352x768471792 = lVar.mo50352x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12054x196d9359 c12054x196d9359 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12054x196d9359(jSONObject3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.a0(lVar, i17, this, jSONObject);
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(mo50352x768471792, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12054x196d9359, a0Var, a17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, put fail since " + e17);
            lVar.a(i17, o("fail:internal error"));
        }
    }

    public final void C(org.json.JSONObject jSONObject, mq0.z zVar, java.util.Map map) {
        java.lang.String optString;
        java.lang.String str = "";
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("implType", "");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
                return;
            }
        } else {
            optString = null;
        }
        java.lang.String str2 = optString == null ? "" : optString;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("bizName", "") : null;
        java.lang.String str3 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("bizScene", "") : null;
        java.lang.String str4 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("traceId", "") : null;
        java.lang.String str5 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("frameSetName", "") : null;
        java.lang.String str6 = optString5 == null ? "" : optString5;
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("apiName", f33993x24728b);
        java.lang.String optString6 = jSONObject != null ? jSONObject.optString("reportExtraInfo", "") : null;
        if (optString6 != null) {
            str = optString6;
        }
        lVarArr[1] = new jz5.l("uxinfo", str);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        l17.putAll(map);
        mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
        if (c0Var != null) {
            mq0.c0.ig(c0Var, zVar, str3, str4, str5, str6, str2, null, l17, 64, null);
        }
    }
}
