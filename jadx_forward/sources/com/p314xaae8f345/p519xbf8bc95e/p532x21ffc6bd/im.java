package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class im {

    /* renamed from: a, reason: collision with root package name */
    protected long f131436a = 1500;

    /* renamed from: b, reason: collision with root package name */
    public boolean f131437b = false;

    /* renamed from: c, reason: collision with root package name */
    protected long f131438c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f131439d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f131440e = false;

    /* renamed from: f, reason: collision with root package name */
    public android.view.animation.Interpolator f131441f = new android.view.animation.LinearInterpolator();

    /* renamed from: g, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.im.a f131442g = null;

    /* renamed from: h, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.im.b f131443h = null;

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
        return this.f131441f;
    }

    private static long d() {
        return android.os.SystemClock.uptimeMillis();
    }

    private void e() {
        this.f131437b = false;
    }

    private boolean f() {
        return this.f131437b;
    }

    private boolean g() {
        return this.f131439d;
    }

    private boolean h() {
        return this.f131440e;
    }

    public abstract void a(float f17, android.view.animation.Interpolator interpolator);

    public final void a(com.tencent.mapsdk.internal.im.a aVar) {
        this.f131442g = aVar;
    }

    public final void b() {
        com.tencent.mapsdk.internal.im.a aVar;
        if (!this.f131437b) {
            if (!this.f131439d || this.f131440e || (aVar = this.f131442g) == null) {
                return;
            }
            aVar.b();
            return;
        }
        float uptimeMillis = ((float) (android.os.SystemClock.uptimeMillis() - this.f131438c)) / ((float) this.f131436a);
        if (uptimeMillis <= 1.0f) {
            a(uptimeMillis, this.f131441f);
            return;
        }
        this.f131437b = false;
        a(1.0f, this.f131441f);
        com.tencent.mapsdk.internal.im.a aVar2 = this.f131442g;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.f131440e = true;
    }

    public void a(com.tencent.mapsdk.internal.im.b bVar) {
        this.f131443h = bVar;
    }

    private void a(android.view.animation.Interpolator interpolator) {
        this.f131441f = interpolator;
    }

    public void a(long j17) {
        this.f131436a = j17;
    }

    public final long a() {
        return this.f131436a;
    }

    public boolean a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2) {
        if (this.f131436a <= 0) {
            return false;
        }
        this.f131439d = true;
        this.f131438c = android.os.SystemClock.uptimeMillis();
        this.f131437b = true;
        com.tencent.mapsdk.internal.im.a aVar = this.f131442g;
        if (aVar != null) {
            aVar.a();
        }
        return true;
    }
}
