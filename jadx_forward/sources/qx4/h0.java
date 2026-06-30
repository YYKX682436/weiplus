package qx4;

/* loaded from: classes8.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final qx4.h0 f448942d = new qx4.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e3;
        for (java.util.Map.Entry entry : qx4.l0.f448956b.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            qx4.m0 m0Var = (qx4.m0) entry.getValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "MultiWebView-Trace destroy " + ((m0Var != null ? m0Var.f448960c : null) != null ? 1 : 0) + " webView for WebSearch, preloadScene:" + intValue);
            if (m0Var != null && (abstractC19224x1fe3df6e3 = m0Var.f448960c) != null) {
                abstractC19224x1fe3df6e3.mo120132x35d48587();
            }
            if (m0Var != null && (abstractC19224x1fe3df6e2 = m0Var.f448960c) != null) {
                abstractC19224x1fe3df6e2.mo120135xb4407692();
            }
            if (m0Var != null && (abstractC19224x1fe3df6e = m0Var.f448960c) != null) {
                abstractC19224x1fe3df6e.mo52095x5cd39ffa();
            }
            if (m0Var != null) {
                m0Var.f448960c = null;
            }
        }
        qx4.l0.f448956b.clear();
        return jz5.f0.f384359a;
    }
}
