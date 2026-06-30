package xc2;

/* loaded from: classes2.dex */
public final class p0 {
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public java.lang.Integer I;

    /* renamed from: J, reason: collision with root package name */
    public sc2.q8 f534766J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s R;
    public java.lang.String S;
    public xc2.c1 T;
    public final java.util.ArrayList U;
    public final java.util.HashMap V;
    public final java.util.HashMap W;
    public final java.util.HashMap X;
    public final java.util.HashMap Y;
    public final java.util.ArrayList Z;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f534767a;

    /* renamed from: a0, reason: collision with root package name */
    public java.util.Map f534768a0;

    /* renamed from: b, reason: collision with root package name */
    public long f534769b;

    /* renamed from: b0, reason: collision with root package name */
    public final java.util.ArrayList f534770b0;

    /* renamed from: c, reason: collision with root package name */
    public r45.l34 f534771c;

    /* renamed from: c0, reason: collision with root package name */
    public final java.util.ArrayList f534772c0;

    /* renamed from: d, reason: collision with root package name */
    public ad2.h f534773d;

    /* renamed from: d0, reason: collision with root package name */
    public xc2.l f534774d0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f534775e;

    /* renamed from: e0, reason: collision with root package name */
    public java.util.Map f534776e0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f534777f;

    /* renamed from: g, reason: collision with root package name */
    public long f534778g;

    /* renamed from: h, reason: collision with root package name */
    public xc2.o0 f534779h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f534780i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f534781j;

    /* renamed from: k, reason: collision with root package name */
    public ya2.b2 f534782k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f534783l;

    /* renamed from: m, reason: collision with root package name */
    public l81.b1 f534784m;

    /* renamed from: n, reason: collision with root package name */
    public int f534785n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f534786o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f534787p;

    /* renamed from: q, reason: collision with root package name */
    public int f534788q;

    /* renamed from: r, reason: collision with root package name */
    public int f534789r;

    /* renamed from: s, reason: collision with root package name */
    public int f534790s;

    /* renamed from: t, reason: collision with root package name */
    public long f534791t;

    /* renamed from: u, reason: collision with root package name */
    public int f534792u;

    /* renamed from: v, reason: collision with root package name */
    public int f534793v;

    /* renamed from: w, reason: collision with root package name */
    public int f534794w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f534795x;

    /* renamed from: y, reason: collision with root package name */
    public int f534796y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f534797z;

    public p0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        this.f534767a = jumpInfo;
        this.f534769b = android.os.SystemClock.elapsedRealtime();
        this.f534775e = new java.lang.Object();
        this.f534787p = "";
        this.f534790s = -1;
        this.C = true;
        this.U = new java.util.ArrayList();
        this.V = new java.util.HashMap();
        this.W = new java.util.HashMap();
        this.X = new java.util.HashMap();
        this.Y = new java.util.HashMap();
        this.Z = new java.util.ArrayList();
        this.f534770b0 = new java.util.ArrayList();
        this.f534772c0 = new java.util.ArrayList();
    }

    public final java.util.ArrayList a() {
        return this.f534770b0;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 b() {
        return this.f534767a;
    }

    public final sc2.q8 c() {
        return this.f534766J;
    }

    /* renamed from: equals */
    public boolean m175323xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc2.p0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f534767a, ((xc2.p0) obj).f534767a);
    }

    /* renamed from: hashCode */
    public int m175324x8cdac1b() {
        return this.f534767a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175325x9616526c() {
        return "FinderJumpInfoEx(jumpInfo=" + this.f534767a + ')';
    }
}
