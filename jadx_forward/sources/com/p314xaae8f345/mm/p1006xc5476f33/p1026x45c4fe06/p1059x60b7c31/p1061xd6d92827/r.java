package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes.dex */
public abstract class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33697x366c91de = 476;

    /* renamed from: NAME */
    public static final java.lang.String f33698x24728b = "openADCanvas";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160304g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.C11957x6f90252d f160305h = null;

    public static void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, mq0.z zVar, java.lang.String str) {
        if (jSONObject == null) {
            return;
        }
        try {
            java.lang.String optString = jSONObject.optString("adInfoXml", "");
            java.lang.String optString2 = jSONObject.optString("traceId", "");
            java.lang.String optString3 = jSONObject.optString("frameSetName", "");
            java.lang.String optString4 = jSONObject.optString("implType", "");
            java.lang.String optString5 = jSONObject.optString("bizName", "");
            java.lang.String optString6 = jSONObject.optString("bizScene", "");
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            if (c0Var == null) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("apiName", f33698x24728b);
            if (!android.text.TextUtils.isEmpty(optString)) {
                hashMap.put("uxinfo", optString);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                hashMap.put("errMsg", str);
            }
            ((mq0.i0) c0Var).Ai(zVar, optString5, optString6, optString2, optString3, optString4, mq0.b0.f412070e, hashMap);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r22, org.json.JSONObject r23, int r24) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public abstract void C(int i17);

    public abstract void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar);

    public abstract void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, android.content.Intent intent, int i17);
}
