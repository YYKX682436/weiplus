package en5;

/* loaded from: classes5.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f337067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(fn5.n0 n0Var) {
        super(3);
        this.f337067d = n0Var;
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
        fn5.p.i(this.f337067d, oVar, 8);
        return jz5.f0.f384359a;
    }
}
