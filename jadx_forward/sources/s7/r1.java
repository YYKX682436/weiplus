package s7;

/* loaded from: classes16.dex */
public class r1 implements java.lang.Cloneable {
    public s7.n1 A;
    public java.lang.Boolean B;
    public s7.g0 C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.Boolean G;
    public java.lang.Boolean H;
    public s7.b2 I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.Float f485321J;
    public java.lang.String K;
    public s7.i1 L;
    public java.lang.String M;
    public s7.b2 N;
    public java.lang.Float P;
    public s7.b2 Q;
    public java.lang.Float R;
    public s7.q1 S;
    public s7.m1 T;

    /* renamed from: d, reason: collision with root package name */
    public long f485322d = 0;

    /* renamed from: e, reason: collision with root package name */
    public s7.b2 f485323e;

    /* renamed from: f, reason: collision with root package name */
    public s7.i1 f485324f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f485325g;

    /* renamed from: h, reason: collision with root package name */
    public s7.b2 f485326h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Float f485327i;

    /* renamed from: m, reason: collision with root package name */
    public s7.t0 f485328m;

    /* renamed from: n, reason: collision with root package name */
    public s7.k1 f485329n;

    /* renamed from: o, reason: collision with root package name */
    public s7.l1 f485330o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Float f485331p;

    /* renamed from: q, reason: collision with root package name */
    public s7.t0[] f485332q;

    /* renamed from: r, reason: collision with root package name */
    public s7.t0 f485333r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Float f485334s;

    /* renamed from: t, reason: collision with root package name */
    public s7.j0 f485335t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f485336u;

    /* renamed from: v, reason: collision with root package name */
    public s7.t0 f485337v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f485338w;

    /* renamed from: x, reason: collision with root package name */
    public s7.j1 f485339x;

    /* renamed from: y, reason: collision with root package name */
    public s7.o1 f485340y;

    /* renamed from: z, reason: collision with root package name */
    public s7.p1 f485341z;

    public static s7.r1 a() {
        s7.r1 r1Var = new s7.r1();
        r1Var.f485322d = -1L;
        s7.j0 j0Var = s7.j0.f485222e;
        r1Var.f485323e = j0Var;
        s7.i1 i1Var = s7.i1.NonZero;
        r1Var.f485324f = i1Var;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        r1Var.f485325g = valueOf;
        r1Var.f485326h = null;
        r1Var.f485327i = valueOf;
        r1Var.f485328m = new s7.t0(1.0f);
        r1Var.f485329n = s7.k1.Butt;
        r1Var.f485330o = s7.l1.Miter;
        r1Var.f485331p = java.lang.Float.valueOf(4.0f);
        r1Var.f485332q = null;
        r1Var.f485333r = new s7.t0(0.0f);
        r1Var.f485334s = valueOf;
        r1Var.f485335t = j0Var;
        r1Var.f485336u = null;
        r1Var.f485337v = new s7.t0(12.0f, s7.q2.pt);
        r1Var.f485338w = 400;
        r1Var.f485339x = s7.j1.Normal;
        r1Var.f485340y = s7.o1.None;
        r1Var.f485341z = s7.p1.LTR;
        r1Var.A = s7.n1.Start;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        r1Var.B = bool;
        r1Var.C = null;
        r1Var.D = null;
        r1Var.E = null;
        r1Var.F = null;
        r1Var.G = bool;
        r1Var.H = bool;
        r1Var.I = j0Var;
        r1Var.f485321J = valueOf;
        r1Var.K = null;
        r1Var.L = i1Var;
        r1Var.M = null;
        r1Var.N = null;
        r1Var.P = valueOf;
        r1Var.Q = null;
        r1Var.R = valueOf;
        r1Var.S = s7.q1.None;
        r1Var.T = s7.m1.auto;
        return r1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m164025x5a5dd5d() {
        s7.r1 r1Var = (s7.r1) super.clone();
        s7.t0[] t0VarArr = this.f485332q;
        if (t0VarArr != null) {
            r1Var.f485332q = (s7.t0[]) t0VarArr.clone();
        }
        return r1Var;
    }
}
