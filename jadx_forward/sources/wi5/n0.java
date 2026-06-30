package wi5;

/* loaded from: classes.dex */
public final class n0 extends j75.a {
    public boolean A;
    public boolean G;
    public boolean R;

    /* renamed from: g, reason: collision with root package name */
    public int f527847g;

    /* renamed from: h, reason: collision with root package name */
    public int f527848h;

    /* renamed from: i, reason: collision with root package name */
    public int f527849i;

    /* renamed from: m, reason: collision with root package name */
    public int f527850m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f527854q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f527855r;

    /* renamed from: s, reason: collision with root package name */
    public int f527856s;

    /* renamed from: t, reason: collision with root package name */
    public co.a f527857t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f527858u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f527859v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.HashMap f527860w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f527861x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f527862y;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f527845e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f527846f = "";

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f527851n = new java.util.HashSet();
    public final java.util.HashSet Q = new java.util.HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f527852o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f527853p = new java.util.HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f527863z = new java.util.HashMap();
    public java.lang.String B = "";
    public java.lang.String C = "";
    public final java.util.List D = new java.util.ArrayList();
    public final java.util.HashMap E = new java.util.HashMap();
    public final java.util.Map F = new java.util.LinkedHashMap();
    public int H = 3;

    @Override // j75.a
    /* renamed from: clone */
    public java.lang.Object mo8755x5a5dd5d() {
        return super.mo8755x5a5dd5d();
    }

    public final boolean d(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return this.f527851n.contains(username);
    }

    public final boolean e() {
        return (this.f527847g & 64) > 0;
    }

    public final boolean f(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return this.f527852o.contains(username);
    }

    public final java.lang.String g(java.lang.String preShowHeadDisplay, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preShowHeadDisplay, "preShowHeadDisplay");
        return !this.A ? preShowHeadDisplay : z17 ? this.B : this.C;
    }

    public final boolean e(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return this.Q.contains(username);
    }
}
