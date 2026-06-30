package a50;

/* loaded from: classes11.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1538d;

    public t0(long j17) {
        this.f1538d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1538d != a50.v0.f1547d) {
            return;
        }
        a50.v0.f1548e = true;
        a50.v0.f1544a.b("Timer");
    }
}
