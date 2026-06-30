package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class im {

    /* renamed from: a, reason: collision with root package name */
    protected long f49903a = 1500;

    /* renamed from: b, reason: collision with root package name */
    public boolean f49904b = false;

    /* renamed from: c, reason: collision with root package name */
    protected long f49905c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f49906d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f49907e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.view.animation.Interpolator f49908f = new android.view.animation.LinearInterpolator();

    /* renamed from: g, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.im.a f49909g = null;

    /* renamed from: h, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.im.b f49910h = null;

    /* loaded from: classes13.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes13.dex */
    public interface b {
        void a(float f17);

        void a(float f17, float f18);

        void a(float f17, float f18, float f19, float f27);

        void a(int i17, int i18);

        void b(float f17);
    }

    private android.view.animation.Interpolator c() {
        return this.f49908f;
    }

    private static long d() {
        return android.os.SystemClock.uptimeMillis();
    }

    private void e() {
        this.f49904b = false;
    }

    private boolean f() {
        return this.f49904b;
    }

    private boolean g() {
        return this.f49906d;
    }

    private boolean h() {
        return this.f49907e;
    }

    public abstract void a(float f17, android.view.animation.Interpolator interpolator);

    public final void a(com.tencent.mapsdk.internal.im.a aVar) {
        this.f49909g = aVar;
    }

    public final void b() {
        com.tencent.mapsdk.internal.im.a aVar;
        if (!this.f49904b) {
            if (!this.f49906d || this.f49907e || (aVar = this.f49909g) == null) {
                return;
            }
            aVar.b();
            return;
        }
        float uptimeMillis = ((float) (android.os.SystemClock.uptimeMillis() - this.f49905c)) / ((float) this.f49903a);
        if (uptimeMillis <= 1.0f) {
            a(uptimeMillis, this.f49908f);
            return;
        }
        this.f49904b = false;
        a(1.0f, this.f49908f);
        com.tencent.mapsdk.internal.im.a aVar2 = this.f49909g;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.f49907e = true;
    }

    public void a(com.tencent.mapsdk.internal.im.b bVar) {
        this.f49910h = bVar;
    }

    private void a(android.view.animation.Interpolator interpolator) {
        this.f49908f = interpolator;
    }

    public void a(long j17) {
        this.f49903a = j17;
    }

    public final long a() {
        return this.f49903a;
    }

    public boolean a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        if (this.f49903a <= 0) {
            return false;
        }
        this.f49906d = true;
        this.f49905c = android.os.SystemClock.uptimeMillis();
        this.f49904b = true;
        com.tencent.mapsdk.internal.im.a aVar = this.f49909g;
        if (aVar != null) {
            aVar.a();
        }
        return true;
    }
}
