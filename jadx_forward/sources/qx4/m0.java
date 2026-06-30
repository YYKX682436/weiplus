package qx4;

/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448958a;

    /* renamed from: b, reason: collision with root package name */
    public final int f448959b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e f448960c;

    /* renamed from: d, reason: collision with root package name */
    public av4.q f448961d;

    /* renamed from: e, reason: collision with root package name */
    public nw4.p2 f448962e;

    /* renamed from: f, reason: collision with root package name */
    public qx4.d0 f448963f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f448964g;

    public m0(java.lang.String url, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f448958a = url;
        this.f448959b = i17;
        this.f448964g = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.net.Uri parse = android.net.Uri.parse(url);
        try {
            java.lang.String queryParameter = parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            if (queryParameter != null) {
                java.lang.Integer.parseInt(queryParameter);
            }
        } catch (java.lang.Exception unused) {
        }
        parse.getQueryParameter(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
    }

    /* renamed from: equals */
    public boolean m161082xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx4.m0)) {
            return false;
        }
        qx4.m0 m0Var = (qx4.m0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f448958a, m0Var.f448958a) && this.f448959b == m0Var.f448959b;
    }

    /* renamed from: hashCode */
    public int m161083x8cdac1b() {
        return (this.f448958a.hashCode() * 31) + java.lang.Integer.hashCode(this.f448959b);
    }

    /* renamed from: toString */
    public java.lang.String m161084x9616526c() {
        return "WebSearchPreloadObj(url=" + this.f448958a + ", preloadScene=" + this.f448959b + ')';
    }
}
