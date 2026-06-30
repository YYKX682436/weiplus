package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class ib {

    /* renamed from: b, reason: collision with root package name */
    public boolean f131403b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f131405d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f131408g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f131409h;

    /* renamed from: a, reason: collision with root package name */
    protected long f131402a = 1500;

    /* renamed from: c, reason: collision with root package name */
    protected long f131404c = 0;

    /* renamed from: i, reason: collision with root package name */
    private android.view.animation.Interpolator f131410i = new android.view.animation.LinearInterpolator();

    /* renamed from: e, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.ib.a f131406e = null;

    /* renamed from: f, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.ib.b f131407f = null;

    /* loaded from: classes13.dex */
    public static abstract class a {
        private static void a() {
        }

        private static void b() {
        }

        public void a(float f17) {
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    private android.view.animation.Interpolator c() {
        return this.f131410i;
    }

    private static long d() {
        return android.os.SystemClock.uptimeMillis();
    }

    private void e() {
        this.f131403b = false;
    }

    private boolean f() {
        return this.f131403b;
    }

    private boolean g() {
        return this.f131408g;
    }

    private boolean h() {
        return this.f131409h;
    }

    private boolean i() {
        return this.f131405d;
    }

    public final void a(com.tencent.mapsdk.internal.ib.a aVar) {
        this.f131406e = aVar;
    }

    public final void b() {
        if (!this.f131403b && this.f131409h && this.f131404c == 0) {
            this.f131404c = android.os.SystemClock.uptimeMillis();
            this.f131403b = true;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        float f17 = ((float) (uptimeMillis - this.f131404c)) / ((float) this.f131402a);
        if (f17 > 1.0f) {
            if (this.f131408g) {
                this.f131404c = uptimeMillis;
            } else {
                this.f131403b = false;
            }
            f17 = 1.0f;
        }
        android.view.animation.Interpolator interpolator = this.f131410i;
        if (interpolator != null) {
            f17 = interpolator.getInterpolation(f17);
        }
        a(f17);
        if (this.f131403b) {
            return;
        }
        this.f131405d = true;
    }

    private void a(com.tencent.mapsdk.internal.ib.b bVar) {
        this.f131407f = bVar;
    }

    private void a(android.view.animation.Interpolator interpolator) {
        this.f131410i = interpolator;
    }

    public final void a(long j17) {
        this.f131402a = j17;
    }

    public final boolean a() {
        return a(false);
    }

    public final boolean a(boolean z17) {
        if (this.f131402a <= 0 || this.f131409h) {
            return false;
        }
        this.f131409h = true;
        this.f131408g = z17;
        return true;
    }

    public void a(float f17) {
        com.tencent.mapsdk.internal.ib.a aVar = this.f131406e;
        if (aVar != null) {
            aVar.a(f17);
        }
    }

    private float b(float f17) {
        android.view.animation.Interpolator interpolator = this.f131410i;
        return interpolator != null ? interpolator.getInterpolation(f17) : f17;
    }
}
