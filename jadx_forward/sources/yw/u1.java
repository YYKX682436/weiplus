package yw;

/* loaded from: classes11.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f548010d;

    public u1(long j17) {
        this.f548010d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f548010d != yw.w1.f548023d) {
            return;
        }
        yw.w1.f548024e = true;
        yw.w1.f548020a.b("Timer");
    }
}
