package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class x1 extends p3325xe03a0797.p3326xc267989b.z1 {

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f392230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.b2 f392231g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p3325xe03a0797.p3326xc267989b.b2 b2Var, long j17, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(j17);
        this.f392231g = b2Var;
        this.f392230f = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((p3325xe03a0797.p3326xc267989b.r) this.f392230f).u(this.f392231g, jz5.f0.f384359a);
    }

    @Override // p3325xe03a0797.p3326xc267989b.z1
    /* renamed from: toString */
    public java.lang.String mo144128x9616526c() {
        return super.mo144128x9616526c() + this.f392230f;
    }
}
