package jq;

/* loaded from: classes8.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public com.p314xaae8f345.mm.p944x882e457a.q0 b1(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        return c01.ad.f118594a.b1(p0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public void x5(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
        r45.tp tpVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if (r0Var != null) {
            java.lang.Object obj = r0Var.f152292c;
            if ((obj instanceof qk.h6) && (tpVar = ((qk.h6) obj).f66761xe40d67b3) != null && (gVar = tpVar.f468170e) != null) {
                try {
                    java.lang.String i17 = gVar.i();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.NewXmlMsgExtension", "bussinessInfo:%s", i17);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(i17);
                    r0Var.f152294e = jSONObject.optString("msgid");
                    r0Var.f152293d = jSONObject.optString("msgtype");
                } catch (org.json.JSONException unused) {
                }
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f118594a.x5(r0Var);
    }
}
