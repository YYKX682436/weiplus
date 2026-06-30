package yc1;

/* loaded from: classes7.dex */
public final class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77517x366c91de = 1442;

    /* renamed from: NAME */
    public static final java.lang.String f77518x24728b = "preFetchDNS";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        rk0.c.c("MicroMsg.JsApiPreFetchDNS", "start preFetchDNS", new java.lang.Object[0]);
        if (c0Var == null || jSONObject == null || (jSONArray = jSONObject.getJSONArray("domainList")) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yc1.b0(c0Var, i17, this, jSONArray, null), 2, null);
    }
}
