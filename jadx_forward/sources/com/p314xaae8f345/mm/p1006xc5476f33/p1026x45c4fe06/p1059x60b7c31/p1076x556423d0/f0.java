package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes.dex */
public class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o {

    /* renamed from: CTRL_INDEX */
    private static final int f33996x366c91de = 969;

    /* renamed from: NAME */
    private static final java.lang.String f33997x24728b = "openChannelsUserProfile";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.m
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17) {
        java.lang.String optString;
        java.lang.String str = "";
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("implType", "");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
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
        mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
        if (c0Var != null) {
            mq0.z zVar = mq0.z.f412180u;
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("apiName", f33997x24728b);
            java.lang.String optString6 = jSONObject != null ? jSONObject.optString("reportExtraInfo", "") : null;
            if (optString6 != null) {
                str = optString6;
            }
            lVarArr[1] = new jz5.l("uxinfo", str);
            mq0.c0.ig(c0Var, zVar, str3, str4, str5, str6, str2, null, kz5.c1.k(lVarArr), 64, null);
        }
        super.C(lVar, jSONObject, jSONObject2, i17);
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f412096i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public java.lang.String E() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoJsonObj, "extInfoJsonObj");
        try {
            extInfoJsonObj.put("commentScene", 15);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsUserProfile", "preProcessExtInfo, fail since " + e17);
            return false;
        }
    }
}
