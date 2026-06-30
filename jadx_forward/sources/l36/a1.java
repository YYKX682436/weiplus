package l36;

/* loaded from: classes16.dex */
public final class a1 implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final l36.w0 f396988d;

    /* renamed from: e, reason: collision with root package name */
    public final l36.r0 f396989e;

    /* renamed from: f, reason: collision with root package name */
    public final int f396990f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f396991g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.g0 f396992h;

    /* renamed from: i, reason: collision with root package name */
    public final l36.i0 f396993i;

    /* renamed from: m, reason: collision with root package name */
    public final l36.c1 f396994m;

    /* renamed from: n, reason: collision with root package name */
    public final l36.a1 f396995n;

    /* renamed from: o, reason: collision with root package name */
    public final l36.a1 f396996o;

    /* renamed from: p, reason: collision with root package name */
    public final l36.a1 f396997p;

    /* renamed from: q, reason: collision with root package name */
    public final long f396998q;

    /* renamed from: r, reason: collision with root package name */
    public final long f396999r;

    /* renamed from: s, reason: collision with root package name */
    public volatile l36.l f397000s;

    public a1(l36.z0 z0Var) {
        this.f396988d = z0Var.f397224a;
        this.f396989e = z0Var.f397225b;
        this.f396990f = z0Var.f397226c;
        this.f396991g = z0Var.f397227d;
        this.f396992h = z0Var.f397228e;
        l36.h0 h0Var = z0Var.f397229f;
        h0Var.getClass();
        this.f396993i = new l36.i0(h0Var);
        this.f396994m = z0Var.f397230g;
        this.f396995n = z0Var.f397231h;
        this.f396996o = z0Var.f397232i;
        this.f396997p = z0Var.f397233j;
        this.f396998q = z0Var.f397234k;
        this.f396999r = z0Var.f397235l;
    }

    public l36.l a() {
        l36.l lVar = this.f397000s;
        if (lVar != null) {
            return lVar;
        }
        l36.l a17 = l36.l.a(this.f396993i);
        this.f397000s = a17;
        return a17;
    }

    public java.lang.String b(java.lang.String str) {
        java.lang.String c17 = this.f396993i.c(str);
        if (c17 != null) {
            return c17;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        l36.c1 c1Var = this.f396994m;
        if (c1Var == null) {
            throw new java.lang.IllegalStateException("response is not eligible for a body and must not be closed");
        }
        c1Var.close();
    }

    /* renamed from: toString */
    public java.lang.String m145010x9616526c() {
        return "Response{protocol=" + this.f396989e + ", code=" + this.f396990f + ", message=" + this.f396991g + ", url=" + this.f396988d.f397214a + '}';
    }
}
