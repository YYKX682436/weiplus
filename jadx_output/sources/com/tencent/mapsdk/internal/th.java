package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class th extends com.tencent.mapsdk.internal.jm {

    /* renamed from: b, reason: collision with root package name */
    public static final long f51600b = 500;

    /* renamed from: c, reason: collision with root package name */
    public static final int f51601c = 10000;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f51602J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public double P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    int U;
    int V;
    int W;
    int X;
    int Y;
    int Z;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.th.a f51603a;

    /* renamed from: aa, reason: collision with root package name */
    public int f51604aa;

    /* renamed from: ab, reason: collision with root package name */
    public int f51605ab;

    /* renamed from: ac, reason: collision with root package name */
    public boolean f51606ac;

    /* renamed from: ad, reason: collision with root package name */
    float f51607ad;

    /* renamed from: ae, reason: collision with root package name */
    float f51608ae;

    /* renamed from: af, reason: collision with root package name */
    float f51609af;

    /* renamed from: ag, reason: collision with root package name */
    public float f51610ag;

    /* renamed from: ah, reason: collision with root package name */
    public boolean f51611ah;

    /* renamed from: ai, reason: collision with root package name */
    float f51612ai;

    /* renamed from: aj, reason: collision with root package name */
    float f51613aj;

    /* renamed from: ak, reason: collision with root package name */
    float f51614ak;

    /* renamed from: al, reason: collision with root package name */
    public float f51615al;

    /* renamed from: am, reason: collision with root package name */
    private final java.lang.Runnable f51616am;

    /* renamed from: an, reason: collision with root package name */
    private final java.lang.Runnable f51617an;

    /* renamed from: ao, reason: collision with root package name */
    private boolean f51618ao;

    /* renamed from: ap, reason: collision with root package name */
    private android.view.animation.Interpolator f51619ap;

    /* renamed from: aq, reason: collision with root package name */
    private boolean f51620aq;

    /* renamed from: ar, reason: collision with root package name */
    private int f51621ar;

    /* renamed from: as, reason: collision with root package name */
    private int f51622as;

    /* renamed from: at, reason: collision with root package name */
    private boolean f51623at;

    /* renamed from: au, reason: collision with root package name */
    private float f51624au;

    /* renamed from: av, reason: collision with root package name */
    private float f51625av;

    /* renamed from: aw, reason: collision with root package name */
    private double f51626aw;

    /* renamed from: ax, reason: collision with root package name */
    private double f51627ax;

    /* renamed from: ay, reason: collision with root package name */
    private double f51628ay;

    /* renamed from: az, reason: collision with root package name */
    private double f51629az;

    /* renamed from: d, reason: collision with root package name */
    protected long f51630d;

    /* renamed from: e, reason: collision with root package name */
    protected long f51631e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback f51632f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f51633g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f51634h;

    /* loaded from: classes13.dex */
    public interface a {
        float a();

        void a(java.lang.Runnable runnable);

        int b();

        com.tencent.map.lib.models.GeoPoint c();

        float d();

        float e();

        float f();

        com.tencent.map.lib.models.GeoPoint g();

        boolean h();
    }

    public th() {
        super(10000, null);
        this.f51616am = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.th.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.th.this.f51632f == null) {
                    return;
                }
                com.tencent.mapsdk.internal.th.this.f51632f.onFinish();
            }
        };
        this.f51617an = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.th.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.th.this.f51632f == null) {
                    return;
                }
                com.tencent.mapsdk.internal.th.this.f51632f.onCancel();
            }
        };
        this.f51603a = null;
        this.f51630d = 500L;
        this.f51618ao = false;
        this.f51631e = 0L;
        this.f51619ap = new android.view.animation.LinearInterpolator();
        this.f51632f = null;
        this.f51633g = false;
        this.f51620aq = false;
        this.f51634h = false;
        this.I = 0;
        this.f51602J = 0;
        this.K = 0;
        this.f51621ar = 0;
        this.L = 0;
        this.f51622as = 0;
        this.M = false;
        this.N = false;
        this.O = false;
        this.f51623at = false;
        this.f51624au = 0.0f;
        this.f51625av = 0.0f;
        this.f51626aw = 0.0d;
        this.f51627ax = 0.0d;
        this.P = 0.0d;
        this.f51628ay = 0.0d;
        this.f51629az = 1.0d;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f51604aa = 0;
        this.f51605ab = 0;
        this.f51606ac = false;
        this.f51607ad = 0.0f;
        this.f51608ae = 0.0f;
        this.f51609af = 0.0f;
        this.f51610ag = 0.0f;
        this.f51611ah = false;
        this.f51612ai = 0.0f;
        this.f51613aj = 0.0f;
        this.f51614ak = 0.0f;
        this.f51615al = 0.0f;
    }

    private static long c() {
        return android.os.SystemClock.uptimeMillis();
    }

    private boolean d() {
        return this.f51634h;
    }

    private static float e(float f17) {
        return ((f17 % 360.0f) + 360.0f) % 360.0f;
    }

    private static float f(float f17) {
        return ((f17 % 360.0f) + 360.0f) % 360.0f;
    }

    private boolean g() {
        return this.N || this.M || this.O;
    }

    private float h() {
        return (float) this.P;
    }

    private boolean i() {
        return this.Q;
    }

    private int j() {
        return this.R;
    }

    private int k() {
        return this.S;
    }

    private boolean l() {
        return this.T;
    }

    private int m() {
        return this.f51604aa;
    }

    private int n() {
        return this.f51605ab;
    }

    private float o() {
        return this.f51610ag;
    }

    private boolean p() {
        return this.f51606ac;
    }

    private boolean q() {
        return this.f51611ah;
    }

    private float r() {
        return this.f51615al;
    }

    private void s() {
        this.f51633g = true;
    }

    private boolean t() {
        return this.f51633g;
    }

    public final void b(float f17) {
        if (f17 == 0.0f) {
            return;
        }
        this.f51625av = f17;
        this.N = true;
    }

    private void a(com.tencent.mapsdk.internal.th.a aVar) {
        this.f51603a = aVar;
    }

    private void c(int i17, int i18) {
        if (i17 == 0 && i18 == 0) {
            this.f51634h = false;
        }
        this.I = i17;
        this.f51602J = i18;
        this.f51634h = true;
    }

    private int e() {
        return this.K;
    }

    private int f() {
        return this.L;
    }

    public final void d(float f17) {
        this.f51612ai = f(f17);
        this.f51611ah = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011e, code lost:
    
        if (r0 > 1.0f) goto L65;
     */
    @Override // com.tencent.mapsdk.internal.jm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.th.a():boolean");
    }

    public final void b(int i17, int i18) {
        this.U = i17;
        this.V = i18;
        this.T = true;
    }

    @Override // com.tencent.mapsdk.internal.jm
    public final void b() {
        com.tencent.mapsdk.internal.th.a aVar;
        super.b();
        this.f51620aq = true;
        if (this.f51632f == null || (aVar = this.f51603a) == null) {
            return;
        }
        aVar.a(this.f51617an);
    }

    public final void c(float f17) {
        this.f51607ad = e(f17);
        this.f51606ac = true;
    }

    public final void a(float f17) {
        if (f17 <= 0.0f) {
            return;
        }
        this.f51624au = f17;
        this.M = true;
    }

    private void a(double d17) {
        this.f51626aw = d17;
        this.O = true;
    }

    public final void a(int i17, int i18) {
        this.R = i17;
        this.S = i18;
        this.Q = true;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        this.f51632f = cancelableCallback;
    }

    public final void a(long j17) {
        this.f51630d = j17;
    }
}
