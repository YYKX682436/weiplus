package f2;

/* loaded from: classes14.dex */
public final class k implements f2.g {

    /* renamed from: a, reason: collision with root package name */
    public final f2.u f340340a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.x f340341b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.e0 f340342c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.o f340343d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.t f340344e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f340345f;

    public k(f2.u platformFontLoader, f2.x platformResolveInterceptor, f2.e0 typefaceRequestCache, f2.o fontListFontFamilyTypefaceAdapter, f2.t platformFamilyTypefaceAdapter, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 2) != 0) {
            int i18 = f2.x.f340363a;
            platformResolveInterceptor = f2.w.f340362a;
        }
        typefaceRequestCache = (i17 & 4) != 0 ? f2.l.f340346a : typefaceRequestCache;
        fontListFontFamilyTypefaceAdapter = (i17 & 8) != 0 ? new f2.o(f2.l.f340347b, null, 2, null) : fontListFontFamilyTypefaceAdapter;
        platformFamilyTypefaceAdapter = (i17 & 16) != 0 ? new f2.t() : platformFamilyTypefaceAdapter;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(platformFontLoader, "platformFontLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(platformResolveInterceptor, "platformResolveInterceptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typefaceRequestCache, "typefaceRequestCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.f340340a = platformFontLoader;
        this.f340341b = platformResolveInterceptor;
        this.f340342c = typefaceRequestCache;
        this.f340343d = fontListFontFamilyTypefaceAdapter;
        this.f340344e = platformFamilyTypefaceAdapter;
        this.f340345f = new f2.i(this);
    }

    public final n0.e5 a(f2.c0 typefaceRequest) {
        f2.g0 g0Var;
        f2.e0 e0Var = this.f340342c;
        f2.j jVar = new f2.j(this, typefaceRequest);
        e0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typefaceRequest, "typefaceRequest");
        synchronized (e0Var.f340332a) {
            g0Var = (f2.g0) e0Var.f340333b.a(typefaceRequest);
            if (g0Var != null) {
                if (!g0Var.a()) {
                }
            }
            try {
                g0Var = (f2.g0) jVar.mo146xb9724478(new f2.d0(e0Var, typefaceRequest));
                synchronized (e0Var.f340332a) {
                    if (e0Var.f340333b.a(typefaceRequest) == null && g0Var.a()) {
                        e0Var.f340333b.b(typefaceRequest, g0Var);
                    }
                }
            } catch (java.lang.Exception e17) {
                throw new java.lang.IllegalStateException("Could not load font", e17);
            }
        }
        return g0Var;
    }

    public n0.e5 b(f2.h hVar, f2.r fontWeight, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontWeight, "fontWeight");
        f2.x xVar = this.f340341b;
        f2.h c17 = xVar.c(hVar);
        f2.r b17 = xVar.b(fontWeight);
        int a17 = xVar.a(i17);
        int d17 = xVar.d(i18);
        this.f340340a.getClass();
        return a(new f2.c0(c17, b17, a17, d17, null, null));
    }
}
