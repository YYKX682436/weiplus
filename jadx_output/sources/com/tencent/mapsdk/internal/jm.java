package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class jm {
    public static final com.tencent.mapsdk.internal.jm F = new com.tencent.mapsdk.internal.jm(1, null);
    public static final com.tencent.mapsdk.internal.jm G = new com.tencent.mapsdk.internal.jm(2, null, true);
    public static final com.tencent.mapsdk.internal.jm H = new com.tencent.mapsdk.internal.jm(104, null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f50022i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f50023j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f50024k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f50025l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f50026m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f50027n = 6;

    /* renamed from: o, reason: collision with root package name */
    public static final int f50028o = 100;

    /* renamed from: p, reason: collision with root package name */
    public static final int f50029p = 101;

    /* renamed from: q, reason: collision with root package name */
    public static final int f50030q = 102;

    /* renamed from: r, reason: collision with root package name */
    public static final int f50031r = 103;

    /* renamed from: s, reason: collision with root package name */
    public static final int f50032s = 104;

    /* renamed from: t, reason: collision with root package name */
    public static final int f50033t = 105;

    /* renamed from: u, reason: collision with root package name */
    public static final int f50034u = 10000;

    /* renamed from: v, reason: collision with root package name */
    public static final int f50035v = 108;

    /* renamed from: w, reason: collision with root package name */
    public static final int f50036w = 109;

    /* renamed from: x, reason: collision with root package name */
    public static final int f50037x = 110;

    /* renamed from: y, reason: collision with root package name */
    public static final int f50038y = 120;
    public double[] A;
    public long B;
    public boolean C;
    public boolean D;
    public java.lang.Runnable E;

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.iv f50039a;

    /* renamed from: z, reason: collision with root package name */
    public int f50040z;

    public jm() {
        this.B = -1L;
        this.C = false;
    }

    private long c() {
        long j17 = this.B;
        return j17 >= 0 ? j17 : this.f50040z >= 100 ? 20L : 0L;
    }

    private static void d() {
    }

    public boolean a() {
        return true;
    }

    public void b() {
    }

    private void a(com.tencent.mapsdk.internal.iv ivVar) {
        this.f50039a = ivVar;
    }

    public boolean a(com.tencent.mapsdk.internal.jp jpVar) {
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
        this.f50040z = i17;
        this.A = dArr;
        this.D = z17;
    }

    public jm(java.lang.Runnable runnable) {
        this.B = -1L;
        this.C = false;
        this.f50040z = 6;
        this.E = runnable;
    }
}
