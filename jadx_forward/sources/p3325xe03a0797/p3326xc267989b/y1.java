package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class y1 extends p3325xe03a0797.p3326xc267989b.z1 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f392234f;

    public y1(long j17, java.lang.Runnable runnable) {
        super(j17);
        this.f392234f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f392234f.run();
    }

    @Override // p3325xe03a0797.p3326xc267989b.z1
    /* renamed from: toString */
    public java.lang.String mo144128x9616526c() {
        return super.mo144128x9616526c() + this.f392234f;
    }
}
