package ec2;

/* loaded from: classes2.dex */
public final class f extends fc2.a {
    public int A;
    public boolean B;
    public int C;
    public android.util.Size D;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public final int f332492d;

    /* renamed from: e, reason: collision with root package name */
    public cw2.wa f332493e;

    /* renamed from: f, reason: collision with root package name */
    public r45.mb4 f332494f;

    /* renamed from: g, reason: collision with root package name */
    public mn2.j4 f332495g;

    /* renamed from: h, reason: collision with root package name */
    public int f332496h;

    /* renamed from: i, reason: collision with root package name */
    public int f332497i;

    /* renamed from: j, reason: collision with root package name */
    public long f332498j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f332499k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f332500l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f332501m;

    /* renamed from: n, reason: collision with root package name */
    public int f332502n;

    /* renamed from: o, reason: collision with root package name */
    public int f332503o;

    /* renamed from: p, reason: collision with root package name */
    public int f332504p;

    /* renamed from: q, reason: collision with root package name */
    public dn.o f332505q;

    /* renamed from: r, reason: collision with root package name */
    public dn.h f332506r;

    /* renamed from: s, reason: collision with root package name */
    public int f332507s;

    /* renamed from: t, reason: collision with root package name */
    public int f332508t;

    /* renamed from: u, reason: collision with root package name */
    public long f332509u;

    /* renamed from: v, reason: collision with root package name */
    public nk4.t f332510v;

    /* renamed from: w, reason: collision with root package name */
    public nk4.a f332511w;

    /* renamed from: x, reason: collision with root package name */
    public kz2.a f332512x;

    /* renamed from: y, reason: collision with root package name */
    public int f332513y;

    /* renamed from: z, reason: collision with root package name */
    public int f332514z;

    public f(int i17) {
        this.f332492d = i17;
    }

    public final int b() {
        return this.f332503o;
    }

    public final java.lang.String c() {
        return this.f332499k;
    }

    public final long d() {
        return this.f332498j;
    }

    public final r45.mb4 e() {
        return this.f332494f;
    }

    /* renamed from: equals */
    public boolean m127255xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec2.f) && this.f332492d == ((ec2.f) obj).f332492d;
    }

    public final int f() {
        return this.f332496h;
    }

    public final int g() {
        return this.f332504p;
    }

    public final int h() {
        return this.f332497i;
    }

    /* renamed from: hashCode */
    public int m127256x8cdac1b() {
        return java.lang.Integer.hashCode(this.f332492d);
    }

    public final int i() {
        return this.f332492d;
    }

    /* renamed from: toString */
    public java.lang.String m127257x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(type=");
        sb6.append(this.f332492d);
        sb6.append(", mediaObject=");
        sb6.append(this.f332494f);
        sb6.append(", mediaId=");
        r45.mb4 mb4Var = this.f332494f;
        if (mb4Var == null || (str = mb4Var.m75945x2fec8307(9)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", offset=");
        sb6.append(this.f332496h);
        sb6.append(", total=");
        sb6.append(this.f332497i);
        sb6.append(", feedId=");
        sb6.append(this.f332498j);
        sb6.append(", objectNonceId='");
        sb6.append(this.f332500l);
        sb6.append("' mediaListSize=");
        java.util.LinkedList linkedList = this.f332501m;
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(')');
        return sb6.toString();
    }
}
