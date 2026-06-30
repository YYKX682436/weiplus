package a0;

/* loaded from: classes14.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.r2 f81880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.f f81881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81885i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f81887n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81888o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a0.r2 r2Var, p2.f fVar, n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3, n0.v2 v2Var, n0.e5 e5Var4, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, n0.e5 e5Var5) {
        super(0);
        this.f81880d = r2Var;
        this.f81881e = fVar;
        this.f81882f = e5Var;
        this.f81883g = e5Var2;
        this.f81884h = e5Var3;
        this.f81885i = v2Var;
        this.f81886m = e5Var4;
        this.f81887n = g0Var;
        this.f81888o = e5Var5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean booleanValue = ((java.lang.Boolean) this.f81882f.mo128745x754a37bb()).booleanValue();
        a0.r2 r2Var = this.f81880d;
        if (booleanValue) {
            long j17 = ((d1.e) this.f81883g.mo128745x754a37bb()).f307160a;
            yz5.l lVar = (yz5.l) this.f81884h.mo128745x754a37bb();
            p2.f fVar = this.f81881e;
            long j18 = ((d1.e) lVar.mo146xb9724478(fVar)).f307160a;
            r2Var.a(j17, d1.f.c(j18) ? d1.e.f(((d1.e) this.f81885i.mo128745x754a37bb()).f307160a, j18) : d1.e.f307158d, ((java.lang.Number) this.f81886m.mo128745x754a37bb()).floatValue());
            android.widget.Magnifier magnifier = ((a0.t2) r2Var).f81831a;
            long a17 = p2.r.a(magnifier.getWidth(), magnifier.getHeight());
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f81887n;
            if (!p2.q.a(a17, g0Var.f391654d)) {
                g0Var.f391654d = a17;
                yz5.l lVar2 = (yz5.l) this.f81888o.mo128745x754a37bb();
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(new p2.k(fVar.e(p2.r.b(a17))));
                }
            }
        } else {
            ((a0.t2) r2Var).f81831a.dismiss();
        }
        return jz5.f0.f384359a;
    }
}
