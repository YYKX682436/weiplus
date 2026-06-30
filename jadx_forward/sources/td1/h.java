package td1;

/* loaded from: classes7.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76804x366c91de = 853;

    /* renamed from: NAME */
    public static final java.lang.String f76805x24728b = "getRecentUsageList";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null || jSONObject == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetRecentUsageList", "data=" + jSONObject);
        int optInt = jSONObject.optInt("count", Integer.MAX_VALUE);
        if (optInt < 0) {
            lVar.a(i17, o("fail:illegal count"));
            return;
        }
        int optInt2 = jSONObject.optInt("requestId", Integer.MAX_VALUE);
        if (optInt2 == Integer.MAX_VALUE) {
            lVar.a(i17, o("fail:illegal requestId"));
            return;
        }
        long optLong = jSONObject.optLong("lastUpdateTime", com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        if (optLong < 0) {
            lVar.a(i17, o("fail:illegal lastUpdateTime"));
        } else {
            lVar.a(i17, o("ok"));
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c(optInt, optLong, optInt2), td1.f.class, new td1.g(lVar, optInt2));
        }
    }
}
