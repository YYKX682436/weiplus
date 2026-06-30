package t93;

/* loaded from: classes.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String optString = jSONObject.optString("encryptedId");
            java.lang.String optString2 = jSONObject.optString("nonceId");
            java.lang.String optString3 = jSONObject.optString("requestId");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).sk(optString, optString2, null, new t93.b(this, hashMap, optString3), null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiGetFinderLivePreviewMicCover", e17, "getFinderLivePreviewMicCover fail", new java.lang.Object[0]);
            this.f224976f.a("Invalid input parameters");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
