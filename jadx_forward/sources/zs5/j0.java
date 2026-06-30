package zs5;

/* loaded from: classes15.dex */
public final class j0 {
    public static final zs5.j0 P = new zs5.j0(new zs5.i0("scan"));
    public static final zs5.j0 Q = new zs5.j0(new zs5.i0("file"));
    public int A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f556949J;
    public int K;
    public int L;
    public java.lang.String M;
    public java.lang.Boolean N;
    public java.lang.Boolean O;

    /* renamed from: a, reason: collision with root package name */
    public final zs5.i0 f556950a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f556951b;

    /* renamed from: c, reason: collision with root package name */
    public long f556952c;

    /* renamed from: d, reason: collision with root package name */
    public long f556953d;

    /* renamed from: e, reason: collision with root package name */
    public int f556954e;

    /* renamed from: f, reason: collision with root package name */
    public long f556955f;

    /* renamed from: g, reason: collision with root package name */
    public int f556956g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Point f556957h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Point f556958i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f556959j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f556960k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f556961l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 f556962m;

    /* renamed from: n, reason: collision with root package name */
    public int f556963n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f556964o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f556965p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f556966q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f556967r;

    /* renamed from: s, reason: collision with root package name */
    public int f556968s;

    /* renamed from: t, reason: collision with root package name */
    public int f556969t;

    /* renamed from: u, reason: collision with root package name */
    public int f556970u;

    /* renamed from: v, reason: collision with root package name */
    public long f556971v;

    /* renamed from: w, reason: collision with root package name */
    public long f556972w;

    /* renamed from: x, reason: collision with root package name */
    public int f556973x;

    /* renamed from: y, reason: collision with root package name */
    public int f556974y;

    /* renamed from: z, reason: collision with root package name */
    public int f556975z;

    public j0(zs5.i0 scanStats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanStats, "scanStats");
        this.f556950a = scanStats;
        this.f556951b = "decodeCost-" + scanStats.f556939a;
        this.f556952c = -1L;
        this.f556960k = "";
        this.f556964o = "";
        this.f556965p = "";
        this.f556966q = "";
        this.M = "";
    }

    public final void a(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeReporter", "[" + this.f556951b + "] addScanTime: " + j17 + ", scanFrameCount: " + this.f556954e + ", tryHarder:" + z17);
        this.f556953d = this.f556953d + j17;
        this.f556954e = this.f556954e + 1;
        if (z17) {
            this.f556970u++;
            this.f556972w += j17;
        } else {
            this.f556969t++;
            this.f556971v += j17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0500, code lost:
    
        if (r0 == 2) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0525  */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [int] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r31) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs5.j0.b(long):void");
    }

    public final java.lang.String c() {
        zs5.i0 i0Var = this.f556950a;
        i0Var.f556942d = (((float) i0Var.f556940b) * 1.0f) / i0Var.f556941c;
        i0Var.f556945g = (i0Var.f556943e * 1.0f) / i0Var.f556944f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeReporter", "scanStats(" + i0Var.f556939a + ") success: (total: %s, count: %s, avg: %s), all: (total: %s, count: %s, avg: %s)", java.lang.Long.valueOf(i0Var.f556940b), java.lang.Integer.valueOf(i0Var.f556941c), java.lang.Float.valueOf(i0Var.f556942d), java.lang.Float.valueOf(i0Var.f556943e), java.lang.Integer.valueOf(i0Var.f556944f), java.lang.Float.valueOf(i0Var.f556945g));
        java.lang.String format = java.lang.String.format("成功耗时：" + i0Var.f556942d + ", 次数：" + i0Var.f556941c + "\n单帧耗时：" + i0Var.f556945g + ", 次数：" + i0Var.f556944f, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        i0Var.f556940b = 0L;
        i0Var.f556941c = 0;
        i0Var.f556943e = 0.0f;
        i0Var.f556944f = 0;
        return format;
    }

    public final void d() {
        this.f556967r = false;
        this.f556952c = -1L;
        this.f556953d = 0L;
        this.f556954e = 0;
        this.f556956g = 0;
        this.f556957h = null;
        this.f556958i = null;
        this.f556961l = null;
        this.f556955f = 0L;
        this.f556959j = false;
        this.f556964o = "";
        this.f556965p = "";
        this.f556968s = 0;
        this.f556973x = 0;
        this.G = 0;
        this.H = false;
        this.f556974y = 0;
        this.f556975z = 0;
        this.A = 0;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.f556969t = 0;
        this.f556970u = 0;
        this.f556971v = 0L;
        this.f556972w = 0L;
        this.f556949J = 0;
        this.K = 0;
        this.L = 0;
        this.I = false;
        this.f556962m = null;
        this.f556963n = 0;
        this.M = "";
        this.N = null;
        this.O = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeReporter", "reset");
    }

    public final void e(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeReporter", "[" + this.f556951b + "] setDecodeImageSize (" + i17 + ", " + i18 + ')');
        this.f556958i = new android.graphics.Point(i17, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r21, java.util.List r22, com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 r23) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs5.j0.f(java.util.List, java.util.List, com.tencent.mm.modelscan.ScanCodeInfo):void");
    }
}
