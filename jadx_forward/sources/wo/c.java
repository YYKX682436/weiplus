package wo;

/* loaded from: classes14.dex */
public class c {
    public int A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f529121J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f529123a0;

    /* renamed from: b, reason: collision with root package name */
    public int f529124b;

    /* renamed from: b0, reason: collision with root package name */
    public int f529125b0;

    /* renamed from: c, reason: collision with root package name */
    public int f529126c;

    /* renamed from: c0, reason: collision with root package name */
    public int f529127c0;

    /* renamed from: d, reason: collision with root package name */
    public int f529128d;

    /* renamed from: d0, reason: collision with root package name */
    public int f529129d0;

    /* renamed from: e, reason: collision with root package name */
    public int f529130e;

    /* renamed from: e0, reason: collision with root package name */
    public int f529131e0;

    /* renamed from: f, reason: collision with root package name */
    public int f529132f;

    /* renamed from: f0, reason: collision with root package name */
    public int f529133f0;

    /* renamed from: g, reason: collision with root package name */
    public int f529134g;

    /* renamed from: g0, reason: collision with root package name */
    public int f529135g0;

    /* renamed from: h, reason: collision with root package name */
    public int f529136h;

    /* renamed from: h0, reason: collision with root package name */
    public int f529137h0;

    /* renamed from: i, reason: collision with root package name */
    public int f529138i;

    /* renamed from: i0, reason: collision with root package name */
    public int f529139i0;

    /* renamed from: j, reason: collision with root package name */
    public int f529140j;

    /* renamed from: j0, reason: collision with root package name */
    public int f529141j0;

    /* renamed from: k, reason: collision with root package name */
    public int f529142k;

    /* renamed from: k0, reason: collision with root package name */
    public int f529143k0;

    /* renamed from: l, reason: collision with root package name */
    public int f529144l;

    /* renamed from: l0, reason: collision with root package name */
    public int f529145l0;

    /* renamed from: m, reason: collision with root package name */
    public int f529146m;

    /* renamed from: m0, reason: collision with root package name */
    public int f529147m0;

    /* renamed from: n, reason: collision with root package name */
    public int f529148n;

    /* renamed from: n0, reason: collision with root package name */
    public int f529149n0;

    /* renamed from: o, reason: collision with root package name */
    public int f529150o;

    /* renamed from: p, reason: collision with root package name */
    public int f529152p;

    /* renamed from: q, reason: collision with root package name */
    public int f529154q;

    /* renamed from: q0, reason: collision with root package name */
    public int f529155q0;

    /* renamed from: s0, reason: collision with root package name */
    public int f529159s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f529161t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f529163u0;

    /* renamed from: v, reason: collision with root package name */
    public int f529164v;

    /* renamed from: v0, reason: collision with root package name */
    public int f529165v0;

    /* renamed from: w, reason: collision with root package name */
    public int f529166w;

    /* renamed from: w0, reason: collision with root package name */
    public int f529167w0;

    /* renamed from: x, reason: collision with root package name */
    public int f529168x;

    /* renamed from: x0, reason: collision with root package name */
    public int f529169x0;

    /* renamed from: y, reason: collision with root package name */
    public int f529170y;

    /* renamed from: y0, reason: collision with root package name */
    public int f529171y0;

    /* renamed from: z, reason: collision with root package name */
    public int f529172z;

    /* renamed from: z0, reason: collision with root package name */
    public int f529173z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f529122a = false;

    /* renamed from: r, reason: collision with root package name */
    public int f529156r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f529158s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f529160t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f529162u = -1;

    /* renamed from: o0, reason: collision with root package name */
    public final short[] f529151o0 = new short[15];

    /* renamed from: p0, reason: collision with root package name */
    public final short[] f529153p0 = new short[2];

    /* renamed from: r0, reason: collision with root package name */
    public boolean f529157r0 = false;

    public c() {
        f();
    }

    public boolean a() {
        return this.f529132f >= 0;
    }

    public boolean b() {
        int i17 = this.f529126c;
        if (i17 < 0 || this.f529128d >= 0) {
            return (i17 < 0 && this.f529128d >= 0) || this.f529130e > 0;
        }
        return true;
    }

    public void c() {
        short[] sArr = this.f529153p0;
        short s17 = sArr[0];
        short s18 = sArr[1];
    }

    public int d() {
        int i17;
        if (!a() || (i17 = (this.f529132f & 14) >> 1) == 7) {
            return -1;
        }
        return i17;
    }

    public int e() {
        int i17;
        if (!a() || (i17 = (this.f529132f & 224) >> 5) == 7) {
            return -1;
        }
        return i17;
    }

    public void f() {
        this.f529122a = false;
        this.f529124b = -1;
        this.f529126c = -1;
        this.f529128d = -1;
        this.f529130e = -1;
        this.f529132f = -1;
        this.f529134g = -1;
        this.f529136h = -1;
        this.f529140j = -1;
        this.f529138i = -1;
        this.O = -1;
        this.f529142k = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = false;
        this.H = -1;
        this.I = -1;
        this.f529121J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f529123a0 = -1;
        this.f529125b0 = -1;
        this.f529127c0 = -1;
        this.f529129d0 = -1;
        this.f529131e0 = -1;
        this.f529133f0 = -1;
        this.f529135g0 = -1;
        this.f529137h0 = -1;
        this.f529139i0 = -1;
        this.f529141j0 = -1;
        this.f529143k0 = -1;
        this.f529144l = -1;
        this.f529146m = -1;
        this.f529148n = -1;
        this.f529150o = -1;
        this.f529164v = -1;
        this.f529166w = -1;
        this.f529168x = -1;
        this.f529170y = -1;
        this.f529145l0 = 0;
        this.f529147m0 = 0;
        this.f529149n0 = -1;
        this.f529154q = -1;
        this.f529152p = -1;
        short[] sArr = this.f529153p0;
        sArr[0] = -1;
        sArr[1] = -1;
        this.f529155q0 = -1;
        this.f529171y0 = -1;
        this.f529173z0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.f529172z = -1;
    }
}
