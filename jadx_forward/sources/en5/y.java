package en5;

/* loaded from: classes5.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f337063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f337064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(fn5.n0 n0Var, yz5.l lVar) {
        super(3);
        this.f337063d = n0Var;
        this.f337064e = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        e0.g item = (e0.g) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        fn5.n0 n0Var = this.f337063d;
        fn5.p.i(n0Var, oVar, 8);
        yz5.l lVar = this.f337064e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        en5.w.b(lVar, n0Var, oVar, 64);
        return jz5.f0.f384359a;
    }
}
