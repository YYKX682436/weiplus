package rb2;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rb2.m0 f475361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(in5.s0 s0Var, rb2.m0 m0Var) {
        super(1);
        this.f475360d = s0Var;
        this.f475361e = m0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yw2.a0 a0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.Object obj2 = this.f475360d.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedComment");
        ((so2.y0) obj2).f492249t = booleanValue;
        if (!booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f475361e.f475219e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = nPresenter instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7) nPresenter : null;
            if (a7Var != null && (a0Var = a7Var.f187749o) != null) {
                a0Var.s().y(false);
            }
        }
        return jz5.f0.f384359a;
    }
}
