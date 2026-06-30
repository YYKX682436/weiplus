package cm1;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final cm1.t f43316a = new cm1.t();

    /* renamed from: b, reason: collision with root package name */
    public static dm1.m f43317b;

    /* renamed from: c, reason: collision with root package name */
    public static cm1.f f43318c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f43319d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Runnable f43320e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.h5 f43321f;

    /* renamed from: g, reason: collision with root package name */
    public static final dz.n f43322g;

    static {
        com.tencent.mm.app.w.INSTANCE.a(new cm1.e());
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        f43322g = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f3();
    }

    public final void a(android.content.Context context, java.lang.String appId, java.lang.String enterPath, int i17, long j17, com.tencent.mm.plugin.appbrand.launching.bd bdVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        f(new cm1.h(j17, appId, enterPath, i17, bdVar, context));
    }

    public final void b(android.content.Context context, boolean z17) {
        cm1.f fVar = f43318c;
        if (fVar != null) {
            long j17 = fVar.f43292k;
            java.lang.String roomId = fVar.f43283b;
            kotlin.jvm.internal.o.g(roomId, "roomId");
            java.lang.String appId = fVar.f43282a;
            kotlin.jvm.internal.o.g(appId, "appId");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28142, roomId, 6, appId, java.lang.Long.valueOf(fVar.f43291j), java.lang.Long.valueOf(j17));
            f43316a.a(context, fVar.f43282a, z17 ? fVar.f43285d : fVar.f43284c, fVar.f43286e, fVar.f43287f, null);
        }
    }

    public final void c() {
        f(cm1.n.f43309d);
    }

    public final void d() {
        f(cm1.p.f43311d);
        dz.n nVar = f43322g;
        if (nVar != null) {
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f3 f3Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f3) nVar;
            f3Var.f95904a = null;
            f3Var.b();
        }
    }

    public final void e(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        bundle.putBoolean("isVideoCall", true);
        bundle.putBoolean("isOutCall", false);
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.WMPF_CALL_IN, bundle);
    }

    public final void f(java.lang.Runnable runnable) {
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            runnable.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(runnable);
        }
    }
}
