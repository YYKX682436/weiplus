package cm1;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final cm1.t f124849a = new cm1.t();

    /* renamed from: b, reason: collision with root package name */
    public static dm1.m f124850b;

    /* renamed from: c, reason: collision with root package name */
    public static cm1.f f124851c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f124852d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Runnable f124853e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 f124854f;

    /* renamed from: g, reason: collision with root package name */
    public static final dz.n f124855g;

    static {
        com.p314xaae8f345.mm.app.w.INSTANCE.a(new cm1.e());
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        f124855g = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.f3();
    }

    public final void a(android.content.Context context, java.lang.String appId, java.lang.String enterPath, int i17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.bd bdVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        f(new cm1.h(j17, appId, enterPath, i17, bdVar, context));
    }

    public final void b(android.content.Context context, boolean z17) {
        cm1.f fVar = f124851c;
        if (fVar != null) {
            long j17 = fVar.f124825k;
            java.lang.String roomId = fVar.f124816b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
            java.lang.String appId = fVar.f124815a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28142, roomId, 6, appId, java.lang.Long.valueOf(fVar.f124824j), java.lang.Long.valueOf(j17));
            f124849a.a(context, fVar.f124815a, z17 ? fVar.f124818d : fVar.f124817c, fVar.f124819e, fVar.f124820f, null);
        }
    }

    public final void c() {
        f(cm1.n.f124842d);
    }

    public final void d() {
        f(cm1.p.f124844d);
        dz.n nVar = f124855g;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.f3 f3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.f3) nVar;
            f3Var.f177437a = null;
            f3Var.b();
        }
    }

    public final void e(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
        bundle.putBoolean("isVideoCall", true);
        bundle.putBoolean("isOutCall", false);
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.WMPF_CALL_IN, bundle);
    }

    public final void f(java.lang.Runnable runnable) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            runnable.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(runnable);
        }
    }
}
