package ri5;

/* loaded from: classes.dex */
public final class j extends xm3.a {
    public static final ri5.h I = new ri5.h(null);

    /* renamed from: J, reason: collision with root package name */
    public static final int f477638J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f477639p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f477640x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final java.util.Set f477641y0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public java.lang.String E;
    public int F;
    public int G;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f477642d;

    /* renamed from: e, reason: collision with root package name */
    public final int f477643e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f477644f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f477645g;

    /* renamed from: h, reason: collision with root package name */
    public final si5.c f477646h;

    /* renamed from: i, reason: collision with root package name */
    public final int f477647i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f477648l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f477649m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f477650n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f477651o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f477652p;

    /* renamed from: q, reason: collision with root package name */
    public int f477653q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f477654r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f477655s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f477656t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f477657u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f477658v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f477659w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f477660x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f477661y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f477662z;

    static {
        ri5.i[] iVarArr = ri5.i.f477637d;
        f477638J = 18;
        ri5.i[] iVarArr2 = ri5.i.f477637d;
        K = 1;
        ri5.i[] iVarArr3 = ri5.i.f477637d;
        L = 2;
        ri5.i[] iVarArr4 = ri5.i.f477637d;
        M = 3;
        ri5.i[] iVarArr5 = ri5.i.f477637d;
        N = 4;
        ri5.i[] iVarArr6 = ri5.i.f477637d;
        P = 5;
        ri5.i[] iVarArr7 = ri5.i.f477637d;
        Q = 6;
        ri5.i[] iVarArr8 = ri5.i.f477637d;
        R = 7;
        ri5.i[] iVarArr9 = ri5.i.f477637d;
        S = 8;
        ri5.i[] iVarArr10 = ri5.i.f477637d;
        T = 9;
        ri5.i[] iVarArr11 = ri5.i.f477637d;
        U = 10;
        ri5.i[] iVarArr12 = ri5.i.f477637d;
        V = 11;
        ri5.i[] iVarArr13 = ri5.i.f477637d;
        W = 12;
        ri5.i[] iVarArr14 = ri5.i.f477637d;
        X = 13;
        ri5.i[] iVarArr15 = ri5.i.f477637d;
        Y = 14;
        ri5.i[] iVarArr16 = ri5.i.f477637d;
        Z = 15;
        ri5.i[] iVarArr17 = ri5.i.f477637d;
        f477639p0 = 16;
        ri5.i[] iVarArr18 = ri5.i.f477637d;
        f477640x0 = 17;
        f477641y0 = kz5.z.D0(new java.lang.Integer[]{1, 2, 3, 4});
    }

    public /* synthetic */ j(java.lang.String str, int i17, java.lang.String str2, java.lang.CharSequence charSequence, si5.c cVar, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, str2, charSequence, cVar, (i19 & 32) != 0 ? i17 : i18);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ri5.j other = (ri5.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477644f, other.f477644f) && this.f477651o == other.f477651o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477652p, other.f477652p) && this.f477653q == other.f477653q && this.f477655s == other.f477655s && this.f477658v == other.f477658v && this.f477648l1 == other.f477648l1 && this.f477659w == other.f477659w && this.f477660x == other.f477660x && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477645g, other.f477645g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477649m, other.f477649m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477650n, other.f477650n) && this.f477651o == other.f477651o && this.f477661y == other.f477661y && this.f477646h.e(other.f477646h) && this.B == other.B;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ri5.j other = (ri5.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f477646h.b(this, other, other.f477646h);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f477643e;
    }

    public final void n(java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2 = this.f477650n;
        if ((charSequence2 == null || r26.n0.N(charSequence2)) && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20035x4adfea79()) == 1) {
            charSequence = this.f477642d;
        }
        this.f477650n = charSequence;
    }

    public final void o(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f477652p = str;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f477642d;
    }

    public j(java.lang.String id6, int i17, java.lang.String username, java.lang.CharSequence title, si5.c extension, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extension, "extension");
        this.f477642d = id6;
        this.f477643e = i17;
        this.f477644f = username;
        this.f477645g = title;
        this.f477646h = extension;
        this.f477647i = i18;
        this.f477649m = "";
        this.f477650n = "";
        this.f477652p = "";
        this.f477654r = true;
        this.f477655s = true;
        this.f477661y = true;
        this.E = "";
        this.G = -1;
        this.H = -1;
    }
}
