package ha1;

/* loaded from: classes7.dex */
public final class l extends ha1.v {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f361310f;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f361311c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f361312d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f361313e;

    static {
        ha1.k kVar = new ha1.k(null);
        f361310f = new java.util.HashMap();
        ha1.k.a(kVar, new ha1.l("localso", false, false, 4, null));
        ha1.k.a(kVar, new ha1.l("renderprofiler", false, false, 4, null));
        ha1.k.a(kVar, new ha1.l("debugNode", false, false, 4, null));
        ha1.k.a(kVar, new ha1.l("tracejstask", false, false, 4, null));
    }

    public l(java.lang.String kv6, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z18 = (i17 & 4) != 0 ? true : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kv6, "kv");
        this.f361311c = kv6;
        this.f361312d = z17;
        this.f361313e = z18;
        r26.n0.N(kv6);
    }

    @Override // ha1.v
    public boolean c() {
        return this.f361313e;
    }

    @Override // ha1.v
    public java.lang.String d() {
        return this.f361311c;
    }

    @Override // ha1.v
    public java.lang.Object f() {
        return java.lang.Boolean.valueOf(this.f361312d);
    }

    @Override // ha1.v
    public java.lang.Object g(java.lang.String str) {
        return h(str);
    }
}
