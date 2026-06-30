package go0;

/* loaded from: classes14.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo0.k f355441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f355442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(go0.f0 f0Var, lo0.k kVar, double d17) {
        super(0);
        this.f355440d = f0Var;
        this.f355441e = kVar;
        this.f355442f = d17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.t1 t1Var;
        go0.a aVar;
        go0.f1 f1Var = this.f355440d.f355300p;
        if (f1Var != null) {
            lo0.k kVar = this.f355441e;
            double d17 = this.f355442f;
            if (kVar != null && (t1Var = f1Var.I) != null && (aVar = t1Var.f355389c) != null) {
                aVar.c(kVar, d17);
            }
        }
        return jz5.f0.f384359a;
    }
}
