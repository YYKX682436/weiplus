package n0;

/* loaded from: classes14.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f415330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f415331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f415332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.p pVar, n0.y0 y0Var, java.lang.Object obj) {
        super(0);
        this.f415330d = pVar;
        this.f415331e = y0Var;
        this.f415332f = obj;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n0.y0 y0Var = this.f415331e;
        yz5.p pVar = this.f415330d;
        if (pVar != null) {
            y0Var.R(200, n0.e1.f415025a);
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(pVar, 2);
            pVar.mo149xb9724478(y0Var, 1);
            y0Var.o(false);
        } else {
            y0Var.getClass();
            if (((java.util.ArrayList) y0Var.f415311s).isEmpty()) {
                y0Var.f415305m += y0Var.E.m();
            } else {
                n0.j4 j4Var = y0Var.E;
                int e17 = j4Var.e();
                int i17 = j4Var.f415107f;
                int i18 = j4Var.f415108g;
                int[] iArr = j4Var.f415103b;
                java.lang.Object j17 = i17 < i18 ? j4Var.j(iArr, i17) : null;
                java.lang.Object d17 = j4Var.d();
                y0Var.a0(e17, j17, d17);
                y0Var.T(n0.l4.f(iArr, j4Var.f415107f), null);
                y0Var.F();
                j4Var.c();
                y0Var.b0(e17, j17, d17);
            }
        }
        return jz5.f0.f384359a;
    }
}
