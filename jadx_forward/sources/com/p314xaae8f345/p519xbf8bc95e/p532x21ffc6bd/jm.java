package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class jm {
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm F = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(1, null);
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm G = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(2, null, true);
    public static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm H = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(104, null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f131555i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f131556j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f131557k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f131558l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f131559m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f131560n = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f131561o = 100;

    /* renamed from: p, reason: collision with root package name */
    public static final int f131562p = 101;

    /* renamed from: q, reason: collision with root package name */
    public static final int f131563q = 102;

    /* renamed from: r, reason: collision with root package name */
    public static final int f131564r = 103;

    /* renamed from: s, reason: collision with root package name */
    public static final int f131565s = 104;

    /* renamed from: t, reason: collision with root package name */
    public static final int f131566t = 105;

    /* renamed from: u, reason: collision with root package name */
    public static final int f131567u = 10000;

    /* renamed from: v, reason: collision with root package name */
    public static final int f131568v = 108;

    /* renamed from: w, reason: collision with root package name */
    public static final int f131569w = 109;

    /* renamed from: x, reason: collision with root package name */
    public static final int f131570x = 110;

    /* renamed from: y, reason: collision with root package name */
    public static final int f131571y = 120;
    public double[] A;
    public long B;
    public boolean C;
    public boolean D;
    public java.lang.Runnable E;

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iv f131572a;

    /* renamed from: z, reason: collision with root package name */
    public int f131573z;

    public jm() {
        this.B = -1L;
        this.C = false;
    }

    private long c() {
        long j17 = this.B;
        return j17 >= 0 ? j17 : this.f131573z >= 100 ? 20L : 0L;
    }

    private static void d() {
    }

    public boolean a() {
        return true;
    }

    public void b() {
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iv ivVar) {
        this.f131572a = ivVar;
    }

    public boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jp jpVar) {
        boolean a17 = a();
        jpVar.c(this);
        return a17;
    }

    public jm(int i17, double[] dArr) {
        this(i17, dArr, false);
    }

    public jm(int i17, double[] dArr, boolean z17) {
        this.B = -1L;
        this.C = false;
        this.f131573z = i17;
        this.A = dArr;
        this.D = z17;
    }

    public jm(java.lang.Runnable runnable) {
        this.B = -1L;
        this.C = false;
        this.f131573z = 6;
        this.E = runnable;
    }
}
