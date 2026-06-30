package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class v4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PauseDownloadChatFile", "invoke pauseDownloadChatFile.");
        java.lang.String optString = jSONObject.optString("messageSvrId");
        java.lang.String optString2 = jSONObject.optString("chatName");
        java.lang.String optString3 = jSONObject.optString("extInfo");
        if (optString.isEmpty() || optString2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PauseDownloadChatFile", "invalid param %s", jSONObject.toString());
            this.f224975e.b("invalid param");
        } else {
            h40.f fVar = new h40.f(optString2, java.lang.Long.parseLong(optString));
            fVar.f360277e = new h40.a(optString3);
            fVar.f360276d = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u4(this);
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).Zi(fVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
