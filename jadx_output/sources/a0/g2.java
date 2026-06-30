package a0;

/* loaded from: classes14.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.f f139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f141f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(p2.f fVar, n0.e5 e5Var, n0.v2 v2Var) {
        super(0);
        this.f139d = fVar;
        this.f140e = e5Var;
        this.f141f = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17 = ((d1.e) ((yz5.l) this.f140e.getValue()).invoke(this.f139d)).f225627a;
        n0.v2 v2Var = this.f141f;
        return new d1.e((d1.f.c(((d1.e) v2Var.getValue()).f225627a) && d1.f.c(j17)) ? d1.e.f(((d1.e) v2Var.getValue()).f225627a, j17) : d1.e.f225625d);
    }
}
