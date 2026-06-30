package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class th extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm {

    /* renamed from: b, reason: collision with root package name */
    public static final long f133133b = 500;

    /* renamed from: c, reason: collision with root package name */
    public static final int f133134c = 10000;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f133135J;
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
    public com.tencent.mapsdk.internal.th.a f133136a;

    /* renamed from: aa, reason: collision with root package name */
    public int f133137aa;

    /* renamed from: ab, reason: collision with root package name */
    public int f133138ab;

    /* renamed from: ac, reason: collision with root package name */
    public boolean f133139ac;

    /* renamed from: ad, reason: collision with root package name */
    float f133140ad;

    /* renamed from: ae, reason: collision with root package name */
    float f133141ae;

    /* renamed from: af, reason: collision with root package name */
    float f133142af;

    /* renamed from: ag, reason: collision with root package name */
    public float f133143ag;

    /* renamed from: ah, reason: collision with root package name */
    public boolean f133144ah;

    /* renamed from: ai, reason: collision with root package name */
    float f133145ai;

    /* renamed from: aj, reason: collision with root package name */
    float f133146aj;

    /* renamed from: ak, reason: collision with root package name */
    float f133147ak;

    /* renamed from: al, reason: collision with root package name */
    public float f133148al;

    /* renamed from: am, reason: collision with root package name */
    private final java.lang.Runnable f133149am;

    /* renamed from: an, reason: collision with root package name */
    private final java.lang.Runnable f133150an;

    /* renamed from: ao, reason: collision with root package name */
    private boolean f133151ao;

    /* renamed from: ap, reason: collision with root package name */
    private android.view.animation.Interpolator f133152ap;

    /* renamed from: aq, reason: collision with root package name */
    private boolean f133153aq;

    /* renamed from: ar, reason: collision with root package name */
    private int f133154ar;

    /* renamed from: as, reason: collision with root package name */
    private int f133155as;

    /* renamed from: at, reason: collision with root package name */
    private boolean f133156at;

    /* renamed from: au, reason: collision with root package name */
    private float f133157au;

    /* renamed from: av, reason: collision with root package name */
    private float f133158av;

    /* renamed from: aw, reason: collision with root package name */
    private double f133159aw;

    /* renamed from: ax, reason: collision with root package name */
    private double f133160ax;

    /* renamed from: ay, reason: collision with root package name */
    private double f133161ay;

    /* renamed from: az, reason: collision with root package name */
    private double f133162az;

    /* renamed from: d, reason: collision with root package name */
    protected long f133163d;

    /* renamed from: e, reason: collision with root package name */
    protected long f133164e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback f133165f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f133166g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f133167h;

    /* loaded from: classes13.dex */
    public interface a {
        float a();

        void a(java.lang.Runnable runnable);

        int b();

        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c();

        float d();

        float e();

        float f();

        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df g();

        boolean h();
    }

    public th() {
        super(10000, null);
        this.f133149am = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.th.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th.this.f133165f == null) {
                    return;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th.this.f133165f.mo99150x42fe6352();
            }
        };
        this.f133150an = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.th.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th.this.f133165f == null) {
                    return;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th.this.f133165f.mo99149x3d6f0539();
            }
        };
        this.f133136a = null;
        this.f133163d = 500L;
        this.f133151ao = false;
        this.f133164e = 0L;
        this.f133152ap = new android.view.animation.LinearInterpolator();
        this.f133165f = null;
        this.f133166g = false;
        this.f133153aq = false;
        this.f133167h = false;
        this.I = 0;
        this.f133135J = 0;
        this.K = 0;
        this.f133154ar = 0;
        this.L = 0;
        this.f133155as = 0;
        this.M = false;
        this.N = false;
        this.O = false;
        this.f133156at = false;
        this.f133157au = 0.0f;
        this.f133158av = 0.0f;
        this.f133159aw = 0.0d;
        this.f133160ax = 0.0d;
        this.P = 0.0d;
        this.f133161ay = 0.0d;
        this.f133162az = 1.0d;
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
        this.f133137aa = 0;
        this.f133138ab = 0;
        this.f133139ac = false;
        this.f133140ad = 0.0f;
        this.f133141ae = 0.0f;
        this.f133142af = 0.0f;
        this.f133143ag = 0.0f;
        this.f133144ah = false;
        this.f133145ai = 0.0f;
        this.f133146aj = 0.0f;
        this.f133147ak = 0.0f;
        this.f133148al = 0.0f;
    }

    private static long c() {
        return android.os.SystemClock.uptimeMillis();
    }

    private boolean d() {
        return this.f133167h;
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
        return this.f133137aa;
    }

    private int n() {
        return this.f133138ab;
    }

    private float o() {
        return this.f133143ag;
    }

    private boolean p() {
        return this.f133139ac;
    }

    private boolean q() {
        return this.f133144ah;
    }

    private float r() {
        return this.f133148al;
    }

    private void s() {
        this.f133166g = true;
    }

    private boolean t() {
        return this.f133166g;
    }

    public final void b(float f17) {
        if (f17 == 0.0f) {
            return;
        }
        this.f133158av = f17;
        this.N = true;
    }

    private void a(com.tencent.mapsdk.internal.th.a aVar) {
        this.f133136a = aVar;
    }

    private void c(int i17, int i18) {
        if (i17 == 0 && i18 == 0) {
            this.f133167h = false;
        }
        this.I = i17;
        this.f133135J = i18;
        this.f133167h = true;
    }

    private int e() {
        return this.K;
    }

    private int f() {
        return this.L;
    }

    public final void d(float f17) {
        this.f133145ai = f(f17);
        this.f133144ah = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011e, code lost:
    
        if (r0 > 1.0f) goto L65;
     */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th.a():boolean");
    }

    public final void b(int i17, int i18) {
        this.U = i17;
        this.V = i18;
        this.T = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm
    public final void b() {
        com.tencent.mapsdk.internal.th.a aVar;
        super.b();
        this.f133153aq = true;
        if (this.f133165f == null || (aVar = this.f133136a) == null) {
            return;
        }
        aVar.a(this.f133150an);
    }

    public final void c(float f17) {
        this.f133140ad = e(f17);
        this.f133139ac = true;
    }

    public final void a(float f17) {
        if (f17 <= 0.0f) {
            return;
        }
        this.f133157au = f17;
        this.M = true;
    }

    private void a(double d17) {
        this.f133159aw = d17;
        this.O = true;
    }

    public final void a(int i17, int i18) {
        this.R = i17;
        this.S = i18;
        this.Q = true;
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        this.f133165f = cancelableCallback;
    }

    public final void a(long j17) {
        this.f133163d = j17;
    }
}
