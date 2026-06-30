package fs1;

/* loaded from: classes7.dex */
public final class k extends sd.l0 implements sd.a {

    /* renamed from: f, reason: collision with root package name */
    public static final fs1.k f347829f = new fs1.k();

    /* renamed from: g, reason: collision with root package name */
    public static fs1.j f347830g;

    public static final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r context, java.lang.String str, yz5.p initCallback, mu4.h0 contextReporter) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initCallback, "initCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextReporter, "contextReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePrefetchJsCoreAdapter", "initGameJsPrefetchJsCore");
        fs1.j.f347825e = context;
        fs1.j jVar = fs1.j.f347824d;
        fs1.j.f347826f = new od.l(jVar);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new fs1.h(contextReporter, initCallback, str, null), 3, null);
        f347830g = jVar;
        java.util.ArrayList arrayList = gs1.a.f356580a;
        fs1.k runtime = f347829f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.e0) ((s43.k) i95.n0.c(s43.k.class))).getClass();
            synchronized (h53.k.class) {
                h53.k.f360593a = new java.util.LinkedList();
                h53.k.b();
                linkedList = h53.k.f360593a;
            }
            for (java.lang.Class cls : new java.util.LinkedList(linkedList)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cls, "null cannot be cast to non-null type java.lang.Class<com.tencent.luggage.container.LuggageJsApi<com.tencent.luggage.container.LuggageJsApiContext>>");
                runtime.f(cls, runtime);
            }
            for (java.lang.Class cls2 : gs1.a.f356580a) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cls2, "null cannot be cast to non-null type java.lang.Class<com.tencent.luggage.container.LuggageJsApi<com.tencent.luggage.container.LuggageJsApiContext>>");
                runtime.f(cls2, runtime);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GamePrefetchJsApiPool", e17, "[game-web-prefetch] init jsApiPool exception", new java.lang.Object[0]);
        }
    }

    @Override // sd.l0
    public od.l d() {
        if (f347830g != null) {
            return fs1.j.f347826f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsCore");
        throw null;
    }

    @Override // sd.l0
    public java.lang.String e() {
        fs1.j jVar = f347830g;
        if (jVar != null) {
            java.lang.String mo32054x11fd7f44 = jVar.mo32054x11fd7f44();
            return mo32054x11fd7f44 == null ? "" : mo32054x11fd7f44;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsCore");
        throw null;
    }

    @Override // sd.a
    /* renamed from: getContext */
    public android.content.Context mo64555x76847179() {
        if (f347830g != null) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsCore");
        throw null;
    }

    @Override // sd.a
    /* renamed from: getRuntime */
    public sd.l0 mo64556x9a3f0ba2() {
        return this;
    }
}
