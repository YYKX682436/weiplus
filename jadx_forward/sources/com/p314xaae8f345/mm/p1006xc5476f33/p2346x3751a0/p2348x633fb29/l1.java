package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class l1 {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f258245J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public long W;

    /* renamed from: a, reason: collision with root package name */
    public int f258246a;

    /* renamed from: a0, reason: collision with root package name */
    public java.lang.String f258247a0;

    /* renamed from: b, reason: collision with root package name */
    public int f258248b;

    /* renamed from: c, reason: collision with root package name */
    public int f258249c;

    /* renamed from: d, reason: collision with root package name */
    public int f258250d;

    /* renamed from: e, reason: collision with root package name */
    public byte f258251e;

    /* renamed from: f, reason: collision with root package name */
    public byte f258252f;

    /* renamed from: g, reason: collision with root package name */
    public byte f258253g;

    /* renamed from: h, reason: collision with root package name */
    public byte f258254h;

    /* renamed from: i, reason: collision with root package name */
    public byte f258255i;

    /* renamed from: j, reason: collision with root package name */
    public byte f258256j;

    /* renamed from: k, reason: collision with root package name */
    public int f258257k;

    /* renamed from: m, reason: collision with root package name */
    public int f258259m;

    /* renamed from: n, reason: collision with root package name */
    public int f258260n;

    /* renamed from: o, reason: collision with root package name */
    public int f258261o;

    /* renamed from: p, reason: collision with root package name */
    public int f258262p;

    /* renamed from: q, reason: collision with root package name */
    public int f258263q;

    /* renamed from: r, reason: collision with root package name */
    public int f258264r;

    /* renamed from: s, reason: collision with root package name */
    public int f258265s;

    /* renamed from: t, reason: collision with root package name */
    public int f258266t;

    /* renamed from: u, reason: collision with root package name */
    public int f258267u;

    /* renamed from: v, reason: collision with root package name */
    public int f258268v;

    /* renamed from: w, reason: collision with root package name */
    public int f258269w;

    /* renamed from: x, reason: collision with root package name */
    public int f258270x;

    /* renamed from: y, reason: collision with root package name */
    public int f258271y;

    /* renamed from: z, reason: collision with root package name */
    public int f258272z;

    /* renamed from: l, reason: collision with root package name */
    public long f258258l = 0;
    public final long[] V = new long[6];
    public long X = 0;
    public long Y = 0;
    public int Z = 0;

    public l1() {
        f();
    }

    public void a() {
        if (this.f258245J == 0) {
            this.f258269w = 0;
        } else {
            this.f258269w = (int) (java.lang.System.currentTimeMillis() - this.f258245J);
        }
        vq4.d0.c("MicroMsg.VoipDailReport", "devin:answerInvite current:" + java.lang.System.currentTimeMillis());
        vq4.d0.c("MicroMsg.VoipDailReport", "devin:answerInvite:" + this.f258269w);
    }

    public void b() {
        this.B = java.lang.System.currentTimeMillis();
        vq4.d0.c("MicroMsg.VoipDailReport", "devin:beginTalk:" + this.B);
    }

    public void c() {
        if (this.f258258l == 0) {
            this.f258266t = 0;
        } else {
            this.f258266t = (int) (java.lang.System.currentTimeMillis() - this.f258258l);
        }
        vq4.d0.c("MicroMsg.VoipDailReport", "devin:beginTime:" + this.f258258l + ", CurrentTime: " + java.lang.System.currentTimeMillis());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("devin:endNewDial:");
        sb6.append(this.f258266t);
        vq4.d0.c("MicroMsg.VoipDailReport", sb6.toString());
    }

    public java.lang.String d() {
        return "," + ((int) this.f258256j);
    }

    public void e() {
        if (0 == this.F) {
            this.F = java.lang.System.currentTimeMillis();
            vq4.d0.c("MicroMsg.VoipDailReport", "rudp accept received timestamp:" + this.F);
        }
    }

    public void f() {
        this.B = 0L;
        this.H = 0L;
        this.I = 0L;
        this.f258245J = 0L;
        this.S = 0L;
        this.T = 0L;
        this.U = 0L;
        this.C = 0L;
        this.D = 0L;
        this.F = 0L;
        this.E = 0L;
        this.G = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = 0L;
        this.N = 0L;
        this.O = 0L;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.f258259m = 0;
        this.f258260n = 0;
        this.f258261o = 0;
        this.f258262p = 0;
        this.f258263q = 0;
        this.f258264r = 0;
        this.f258265s = 0;
        this.f258266t = 0;
        this.f258267u = 0;
        this.f258268v = 0;
        this.f258269w = 0;
        this.f258270x = 0;
        this.f258271y = 0;
        this.f258272z = 0;
        this.A = 0;
        java.util.Arrays.fill(this.V, 0L);
    }

    public void g(long j17) {
        if (j17 > 800000000) {
            return;
        }
        long[] jArr = this.V;
        if (0 <= j17 && j17 <= 500) {
            jArr[0] = jArr[0] + 1;
            return;
        }
        if (500 < j17 && j17 <= 1000) {
            jArr[1] = jArr[1] + 1;
            return;
        }
        if (1000 < j17 && j17 <= 2000) {
            jArr[2] = jArr[2] + 1;
            return;
        }
        if (2000 < j17 && j17 <= 4000) {
            jArr[3] = jArr[3] + 1;
        } else if (4000 >= j17 || j17 > 8000) {
            jArr[5] = jArr[5] + 1;
        } else {
            jArr[4] = jArr[4] + 1;
        }
    }
}
