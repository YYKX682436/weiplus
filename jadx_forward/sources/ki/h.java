package ki;

/* loaded from: classes12.dex */
public final class h implements android.content.ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public long f389630d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f389631e;

    public h() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(new ki.e(this));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f389630d < java.util.concurrent.TimeUnit.MINUTES.toMillis(this.f389631e + 1) || this.f389631e >= 10) {
            oj.j.f("Matrix.TrimMemoryNotifier", "onLowMemory skip for frequency", new java.lang.Object[0]);
            return;
        }
        this.f389630d = currentTimeMillis;
        this.f389631e++;
        oj.j.b("Matrix.TrimMemoryNotifier", "onLowMemory post", new java.lang.Object[0]);
        oj.g.a().post(ki.f.f389628d);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (i17 <= 15) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f389630d < java.util.concurrent.TimeUnit.MINUTES.toMillis(this.f389631e + 1) || this.f389631e >= 10) {
                oj.j.f("Matrix.TrimMemoryNotifier", "onLowMemory skip for frequency", new java.lang.Object[0]);
                return;
            }
            this.f389630d = currentTimeMillis;
            this.f389631e++;
            oj.j.b("Matrix.TrimMemoryNotifier", "onTrimMemory post: " + i17, new java.lang.Object[0]);
            oj.g.a().post(new ki.g(i17));
        }
    }
}
