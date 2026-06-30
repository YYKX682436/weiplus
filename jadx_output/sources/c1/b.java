package c1;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f37727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar) {
        super(3);
        this.f37727d = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(-1741761824);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        int i18 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        c1.a aVar = new c1.a((n0.v2) y17, this.f37727d);
        t1.f fVar = c1.h.f37741a;
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        z0.t a17 = z0.m.a(pVar, androidx.compose.ui.platform.e3.f10553d, new c1.g(aVar));
        y0Var.o(false);
        return a17;
    }
}
