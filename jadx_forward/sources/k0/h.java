package k0;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f384450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l2.e f384451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f384452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, l2.e eVar, boolean z18) {
        super(3);
        this.f384450d = z17;
        this.f384451e = eVar;
        this.f384452f = z18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-1538687176);
        long j17 = ((k0.j1) y0Var.i(k0.l1.f384477a)).f384467a;
        int i17 = z0.t.f550455q1;
        z0.t k17 = composed.k(b1.j.b(z0.p.f550454d, new k0.g(j17, this.f384450d, this.f384451e, this.f384452f)));
        y0Var.o(false);
        return k17;
    }
}
