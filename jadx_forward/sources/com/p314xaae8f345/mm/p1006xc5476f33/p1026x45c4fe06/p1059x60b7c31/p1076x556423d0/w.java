package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes.dex */
public class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r {

    /* renamed from: CTRL_INDEX */
    public static final int f34019x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34020x24728b = "private_openChannelsLive";

    /* renamed from: h, reason: collision with root package name */
    public final boolean f161811h = true;

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
            lVarArr[0] = new jz5.l("apiName", f34020x24728b);
            java.lang.String optString6 = jSONObject != null ? jSONObject.optString("reportExtraInfo", "") : null;
            if (optString6 != null) {
                str = optString6;
            }
            lVarArr[1] = new jz5.l("uxinfo", str);
            mq0.c0.ig(c0Var, zVar, str3, str4, str5, str6, str2, null, kz5.c1.k(lVarArr), 64, null);
        }
        super.C(lVar, jSONObject, jSONObject2, i17);
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f412092e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public boolean F() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public boolean G() {
        return this.f161811h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public org.json.JSONObject I(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("feedbackInfo", new org.json.JSONArray(jSONObject.getString("feedbackInfo")));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLivePrivate", "process feedbackInfo failure since " + e17);
        }
        return jSONObject;
    }
}
