package b0;

/* loaded from: classes14.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.m3 f16350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f16351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(b0.m3 m3Var, b0.p2 p2Var) {
        super(1);
        this.f16350d = m3Var;
        this.f16351e = p2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17 = ((d1.e) obj).f225627a;
        b0.p2 p2Var = this.f16351e;
        b0.m3 m3Var = this.f16350d;
        long a17 = m3Var.a(p2Var, m3Var.f16433b ? d1.e.g(j17, -1.0f) : j17, null, 2);
        if (m3Var.f16433b) {
            a17 = d1.e.g(a17, -1.0f);
        }
        return new d1.e(d1.e.e(j17, a17));
    }
}
