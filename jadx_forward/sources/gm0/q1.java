package gm0;

/* loaded from: classes12.dex */
public class q1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm0.z1 f354802a;

    public q1(gm0.z1 z1Var) {
        this.f354802a = z1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        i95.n0.b("calling preloadServicesWithOnSplashMode()");
        com.p314xaae8f345.mm.app.u6 u6Var = com.p314xaae8f345.mm.app.u6.INSTANCE;
        u6Var.h(com.p314xaae8f345.mm.app.t6.UNTIL_PRELOAD_ON_SPLASH_BEGIN);
        i95.y yVar = i95.n0.f371351b;
        j95.a aVar = j95.a.ON_SPLASH;
        yVar.getClass();
        i95.n0.a(new fs.e(((fs.c) fs.g.f(i95.w.class)).all(), new com.p314xaae8f345.mm.app.o0((com.p314xaae8f345.mm.app.p0) yVar, aVar)), i95.r.INITIALIZED, true, false);
        u6Var.h(com.p314xaae8f345.mm.app.t6.UNTIL_PRELOAD_ON_SPLASH_END);
        gm0.z1 z1Var = this.f354802a;
        gm0.v1 v1Var = z1Var.f354834f;
        if (v1Var != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.p815xbe0af3c9.app.b0((com.p314xaae8f345.mm.p815xbe0af3c9.app.l0) v1Var));
            z1Var.f354834f = null;
        }
        return null;
    }
}
