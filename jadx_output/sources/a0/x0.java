package a0;

/* loaded from: classes14.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(boolean z17, c0.o oVar) {
        super(3);
        this.f330d = z17;
        this.f331e = oVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-618949501);
        a0.w0 w0Var = new a0.w0((l1.b) y0Var.i(androidx.compose.ui.platform.m2.f10651j));
        t1.f fVar = c1.b0.f37728a;
        androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
        z0.t a17 = z0.m.a(new c1.c0(w0Var, e3Var), e3Var, new a0.v0(this.f331e, this.f330d));
        y0Var.o(false);
        return a17;
    }
}
