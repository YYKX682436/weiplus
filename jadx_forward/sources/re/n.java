package re;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f475811a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f475812b;

    /* renamed from: c, reason: collision with root package name */
    public int f475813c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f475814d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f475815e;

    /* renamed from: f, reason: collision with root package name */
    public final int f475816f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f475817g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f475818h;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f475811a = runtime;
        re.g gVar = new re.g(this);
        java.lang.String str = runtime.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        gVar.mo146xb9724478(mVar);
        runtime.N.a(mVar);
        this.f475812b = runtime.f156336n;
        this.f475813c = 2;
        this.f475814d = true;
        this.f475815e = true;
        this.f475816f = 1;
        this.f475817g = jz5.h.b(new re.h(this));
        this.f475818h = jz5.h.b(new re.j(this));
    }

    public static final void a(re.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        ni1.f fVar;
        ni1.f fVar2;
        nVar.getClass();
        if (!(w2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = w2Var.mo14682x9dee9c37();
            if (mo14682x9dee9c37 == null || (fVar = (ni1.f) mo14682x9dee9c37.B1(ni1.f.class)) == null) {
                return;
            }
            fVar.V();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) w2Var;
        y1Var.getClass();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var : ((java.util.HashMap) y1Var.f168803x1).values()) {
            if (v5Var != null && (fVar2 = (ni1.f) v5Var.B1(ni1.f.class)) != null) {
                fVar2.V();
            }
        }
    }

    public static final void b(re.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 r17;
        se.a aVar;
        java.lang.String str = nVar.f475812b;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = nVar.f475811a.x0();
            if (x07 == null || (r17 = x07.r(x07.m52169xfdaa7672())) == null || (aVar = (se.a) r17.mo14682x9dee9c37().B1(se.a.class)) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]tryReloadNearestInvisiblePage appId[" + str + "] reload[" + aVar.m() + "] type[" + wdVar + ']');
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]tryReloadNearestInvisiblePage appId[" + str + "] type[" + wdVar + ']', new java.lang.Object[0]);
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        ni1.f fVar;
        ni1.f fVar2;
        if (!(w2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = w2Var.mo14682x9dee9c37();
            if (mo14682x9dee9c37 == null || (fVar = (ni1.f) mo14682x9dee9c37.B1(ni1.f.class)) == null) {
                return;
            }
            fVar.P();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) w2Var;
        y1Var.getClass();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var : y1Var.f168803x1.values()) {
            if (v5Var != null && (fVar2 = (ni1.f) v5Var.B1(ni1.f.class)) != null) {
                fVar2.P();
            }
        }
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 r17;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = this.f475811a.x0();
            if (x07 == null || (r17 = x07.r(x07.m52169xfdaa7672())) == null) {
                return;
            }
            c(r17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]tryRestoreRenderingOfNearestInvisiblePage appId[" + this.f475812b + "] type[" + wdVar + ']', new java.lang.Object[0]);
        }
    }
}
