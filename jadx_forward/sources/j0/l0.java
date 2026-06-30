package j0;

/* loaded from: classes14.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f377953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f377954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f377955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.l f377956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(g2.g0 g0Var, j0.c5 c5Var, g2.e0 e0Var, g2.l lVar) {
        super(1);
        this.f377953d = g0Var;
        this.f377954e = c5Var;
        this.f377955f = e0Var;
        this.f377956g = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        if (this.f377953d != null) {
            j0.c5 c5Var = this.f377954e;
            if (c5Var.b()) {
                c5Var.f377769d = j0.t3.f378103a.a(this.f377953d, this.f377955f, c5Var.f377768c, this.f377956g, c5Var.f377780o, c5Var.f377781p);
            }
        }
        return new j0.k0();
    }
}
