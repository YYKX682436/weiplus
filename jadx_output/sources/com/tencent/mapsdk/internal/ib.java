package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ib {

    /* renamed from: b, reason: collision with root package name */
    public boolean f49870b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f49872d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f49875g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f49876h;

    /* renamed from: a, reason: collision with root package name */
    protected long f49869a = 1500;

    /* renamed from: c, reason: collision with root package name */
    protected long f49871c = 0;

    /* renamed from: i, reason: collision with root package name */
    private android.view.animation.Interpolator f49877i = new android.view.animation.LinearInterpolator();

    /* renamed from: e, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.ib.a f49873e = null;

    /* renamed from: f, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.ib.b f49874f = null;

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
        return this.f49877i;
    }

    private static long d() {
        return android.os.SystemClock.uptimeMillis();
    }

    private void e() {
        this.f49870b = false;
    }

    private boolean f() {
        return this.f49870b;
    }

    private boolean g() {
        return this.f49875g;
    }

    private boolean h() {
        return this.f49876h;
    }

    private boolean i() {
        return this.f49872d;
    }

    public final void a(com.tencent.mapsdk.internal.ib.a aVar) {
        this.f49873e = aVar;
    }

    public final void b() {
        if (!this.f49870b && this.f49876h && this.f49871c == 0) {
            this.f49871c = android.os.SystemClock.uptimeMillis();
            this.f49870b = true;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        float f17 = ((float) (uptimeMillis - this.f49871c)) / ((float) this.f49869a);
        if (f17 > 1.0f) {
            if (this.f49875g) {
                this.f49871c = uptimeMillis;
            } else {
                this.f49870b = false;
            }
            f17 = 1.0f;
        }
        android.view.animation.Interpolator interpolator = this.f49877i;
        if (interpolator != null) {
            f17 = interpolator.getInterpolation(f17);
        }
        a(f17);
        if (this.f49870b) {
            return;
        }
        this.f49872d = true;
    }

    private void a(com.tencent.mapsdk.internal.ib.b bVar) {
        this.f49874f = bVar;
    }

    private void a(android.view.animation.Interpolator interpolator) {
        this.f49877i = interpolator;
    }

    public final void a(long j17) {
        this.f49869a = j17;
    }

    public final boolean a() {
        return a(false);
    }

    public final boolean a(boolean z17) {
        if (this.f49869a <= 0 || this.f49876h) {
            return false;
        }
        this.f49876h = true;
        this.f49875g = z17;
        return true;
    }

    public void a(float f17) {
        com.tencent.mapsdk.internal.ib.a aVar = this.f49873e;
        if (aVar != null) {
            aVar.a(f17);
        }
    }

    private float b(float f17) {
        android.view.animation.Interpolator interpolator = this.f49877i;
        return interpolator != null ? interpolator.getInterpolation(f17) : f17;
    }
}
