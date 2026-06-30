package qx4;

/* loaded from: classes8.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17) {
        super(0);
        this.f448945d = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qx4.l0 l0Var = qx4.l0.f448955a;
        int i17 = this.f448945d;
        qx4.m0 b17 = l0Var.b(i17);
        if (b17 != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = b17.f448960c;
                if (abstractC19224x1fe3df6e != null) {
                    abstractC19224x1fe3df6e.mo120132x35d48587();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e2 = b17.f448960c;
                if (abstractC19224x1fe3df6e2 != null) {
                    abstractC19224x1fe3df6e2.mo120135xb4407692();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e3 = b17.f448960c;
                if (abstractC19224x1fe3df6e3 != null) {
                    abstractC19224x1fe3df6e3.mo52095x5cd39ffa();
                }
                b17.f448960c = null;
                qx4.l0.f448956b.remove(java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchPreloadLogic", jz5.a.b(e17));
            }
        }
        return jz5.f0.f384359a;
    }
}
