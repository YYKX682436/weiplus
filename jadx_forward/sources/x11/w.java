package x11;

/* loaded from: classes12.dex */
public final class w implements x11.a {

    /* renamed from: a, reason: collision with root package name */
    public final x11.f0 f532946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f532947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f532948c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f532949d;

    /* renamed from: e, reason: collision with root package name */
    public final w11.k0 f532950e;

    public w(x11.f0 reporter, int i17, int i18, java.lang.String str, w11.k0 initScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initScene, "initScene");
        this.f532946a = reporter;
        this.f532947b = i17;
        this.f532948c = i18;
        this.f532949d = str;
        this.f532950e = initScene;
    }

    @Override // x11.a
    public x11.y a(x11.t initController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initController, "initController");
        java.lang.Object l17 = gm0.j1.u().c().l(8198, null);
        w11.c2.f523524a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(l17 instanceof java.lang.String ? (java.lang.String) l17 : null), false);
        gm0.j1.u().c().w(8197, "");
        gm0.j1.u().c().w(8198, "");
        gm0.j1.u().c().w(15, 1);
        gm0.j1.u().c().i(true);
        p01.f fVar = p01.f.f431897a;
        boolean a17 = fVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "InitEnd isNetSceneOpt:%s", java.lang.Boolean.valueOf(a17));
        if (a17) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = initController.f532927h;
            int i17 = this.f532948c;
            int i18 = this.f532947b;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i17, this.f532949d, this.f532950e);
            }
            this.f532946a.c(i18, i17, initController.f532930n, initController.f532924e);
            fVar.b();
            t4.a.b("NewInitAll", 10086);
        } else {
            gm0.j1.e().j(new x11.v(initController, this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "removeBlockDetect");
        ((ku5.t0) ku5.t0.f394148d).A("initBlockDetector");
        initController.f532941y = true;
        return x11.y.f532953d;
    }

    @Override // x11.a
    public java.lang.String b() {
        return "InitTaskEnd@" + hashCode();
    }
}
