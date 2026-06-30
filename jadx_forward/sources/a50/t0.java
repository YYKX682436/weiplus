package a50;

/* loaded from: classes11.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f83071d;

    public t0(long j17) {
        this.f83071d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f83071d != a50.v0.f83080d) {
            return;
        }
        a50.v0.f83081e = true;
        a50.v0.f83077a.b("Timer");
    }
}
