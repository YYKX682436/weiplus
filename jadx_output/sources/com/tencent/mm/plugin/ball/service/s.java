package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class s implements gp1.v, com.tencent.mm.plugin.appbrand.backgroundrunning.w0 {

    /* renamed from: x, reason: collision with root package name */
    public static com.tencent.mm.plugin.ball.service.s f93214x;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f93215a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f93216b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f93217c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f93218d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f93219e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f93220f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.ball.model.BallInfo f93221g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.ball.model.BallInfo f93222h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f93223i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f93224j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f93225k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f93226l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f93227m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f93228n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f93229o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f93230p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f93231q;

    /* renamed from: r, reason: collision with root package name */
    public volatile int f93232r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f93233s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f93234t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f93235u;

    /* renamed from: v, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.ball.model.BallInfo f93236v;

    /* renamed from: w, reason: collision with root package name */
    public int f93237w;

    public s() {
        new java.util.concurrent.CopyOnWriteArrayList();
        this.f93216b = new java.util.concurrent.CopyOnWriteArraySet();
        this.f93217c = new java.util.concurrent.CopyOnWriteArraySet();
        this.f93218d = new android.util.SparseArray();
        this.f93219e = new android.util.SparseArray();
        this.f93220f = new java.util.concurrent.ConcurrentHashMap();
        this.f93221g = null;
        this.f93222h = null;
        this.f93223i = false;
        this.f93224j = false;
        this.f93225k = false;
        this.f93226l = false;
        this.f93227m = false;
        this.f93228n = false;
        this.f93229o = true;
        this.f93230p = 0L;
        this.f93231q = 0;
        this.f93232r = 0;
        this.f93233s = 0;
        this.f93234t = false;
        this.f93236v = null;
        this.f93237w = -1;
    }

    public static void F0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, gp1.z zVar) {
        boolean z17;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2;
        boolean z18;
        sVar.getClass();
        if (qp1.w.r(ballInfo) && !sVar.l0(ballInfo)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallService", "addBallInfo, already add max count balls:%s", 5);
            return;
        }
        java.util.List list = sVar.f93215a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
        if (copyOnWriteArrayList.contains(ballInfo)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "addBallInfo, existed:true, replaceExisted: %b, ballInfo:%s", java.lang.Boolean.valueOf(ballInfo.F), ballInfo);
            if (ballInfo.F) {
                ballInfo.F = false;
                sVar.V(ballInfo);
                return;
            }
            return;
        }
        if (qp1.w.t(ballInfo)) {
            if (qp1.w.a(list)) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (qp1.w.t((com.tencent.mm.plugin.ball.model.BallInfo) it.next())) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (z18) {
                com.tencent.mm.plugin.ball.model.BallInfo j17 = qp1.w.j(list);
                if (j17 != null) {
                    int i17 = j17.f93046d;
                    r5 = i17 != 9;
                    com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallService", "addBallInfo video ball is already exist, type: %s, key: %s, canReplaced: %s", java.lang.Integer.valueOf(i17), j17.f93049g, java.lang.Boolean.valueOf(r5));
                    if (r5) {
                        sVar.Y0(j17, ballInfo);
                        if (zVar != null) {
                            zVar.X0(ballInfo);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallService", "addBallInfo video ball is already exist, but video ball info is null");
            }
        }
        if (ballInfo.H == 2) {
            if (qp1.w.a(list)) {
                java.util.Iterator it6 = copyOnWriteArrayList.iterator();
                while (it6.hasNext()) {
                    if (((com.tencent.mm.plugin.ball.model.BallInfo) it6.next()).H == 2) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                if (qp1.w.a(list)) {
                    java.util.Iterator it7 = copyOnWriteArrayList.iterator();
                    while (it7.hasNext()) {
                        ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) it7.next();
                        if (ballInfo2.H == 2) {
                            break;
                        }
                    }
                }
                ballInfo2 = null;
                sVar.Y0(ballInfo2, ballInfo);
                if (zVar != null) {
                    zVar.X0(ballInfo);
                    return;
                }
                return;
            }
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ballInfo.B = currentTimeMillis;
        ballInfo.C = currentTimeMillis;
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = ballInfo.M;
        ballReportInfo.f93090m = -1;
        if (ballInfo.f93046d != 20) {
            ballReportInfo.f93084d = (ballInfo.I && ballReportInfo.f93084d == 0) ? 3 : ballReportInfo.f93084d;
        } else {
            int i18 = ballReportInfo.f93084d;
            ballReportInfo.f93084d = i18 != 0 ? i18 : 5;
        }
        copyOnWriteArrayList.add(ballInfo);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "addBallInfoInner, existed:false, ballInfo:%s", ballInfo);
        if (!ballInfo.L) {
            com.tencent.mm.plugin.ball.service.h.a(ballInfo, list);
        }
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        int size = copyOnWriteArrayList.size();
        e17.getClass();
        if (size == 1) {
            if (ballInfo.H != 0 && !ballInfo.f93045J) {
                r5 = true;
            }
            if (r5) {
                e17.f93347e = ballInfo.f93058s;
            }
        }
        sVar.W0(true);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", ballInfo.f93046d);
        bundle.putString("key", ballInfo.f93049g);
        sVar.M0(1, bundle);
        sVar.L0(ballInfo);
        if (zVar != null) {
            zVar.X0(ballInfo);
        }
        ((d73.i) i95.n0.c(d73.i.class)).Ce(ballInfo);
        if (qp1.w.t(ballInfo)) {
            ((ku5.t0) ku5.t0.f312615d).h(new qp1.g(ballInfo), "MicroMsg.FloatBallCollapseHelper");
        }
    }

    public static void G0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        android.util.SparseArray sparseArray = sVar.f93219e;
        java.util.Set<qp1.i0> set = (java.util.Set) sparseArray.get(ballInfo.f93046d);
        if (qp1.w.a(set)) {
            for (qp1.i0 i0Var : set) {
                if (z17) {
                    ((sl4.b) i0Var).d();
                } else {
                    ((sl4.b) i0Var).c();
                }
            }
        }
        java.util.Set<qp1.i0> set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            for (qp1.i0 i0Var2 : set2) {
                if (z17) {
                    ((sl4.b) i0Var2).d();
                } else {
                    ((sl4.b) i0Var2).c();
                }
            }
        }
    }

    public static com.tencent.mm.plugin.ball.service.s H0() {
        synchronized (com.tencent.mm.plugin.ball.service.s.class) {
            if (f93214x == null) {
                synchronized (com.tencent.mm.plugin.ball.service.s.class) {
                    f93214x = new com.tencent.mm.plugin.ball.service.s();
                }
            }
        }
        return f93214x;
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.w0
    public void A(java.util.List list, com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onBackgroundRunningAppChanged, operation:%s, change:%s", appBrandBackgroundRunningOperationParcel, java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            return;
        }
        int i18 = appBrandBackgroundRunningOperationParcel.f76935g;
        if (i18 != 2 && i18 != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onBackgroundRunningAppChanged, operation ignored");
            return;
        }
        if ((appBrandBackgroundRunningOperationParcel.f76934f & 2) > 0) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = new com.tencent.mm.plugin.ball.model.BallInfo(7, qp1.n.b(appBrandBackgroundRunningOperationParcel.f76932d, appBrandBackgroundRunningOperationParcel.f76933e), null);
            ballInfo.f93048f = 2;
            X0(ballInfo);
        }
        if ((appBrandBackgroundRunningOperationParcel.f76934f & 4) > 0) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = new com.tencent.mm.plugin.ball.model.BallInfo(17, java.lang.String.format(java.util.Locale.US, "%s#%d", appBrandBackgroundRunningOperationParcel.f76932d, java.lang.Integer.valueOf(appBrandBackgroundRunningOperationParcel.f76933e)), null);
            ballInfo2.f93048f = 2;
            X0(ballInfo2);
        }
        if ((appBrandBackgroundRunningOperationParcel.f76934f & 8) > 0) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo3 = new com.tencent.mm.plugin.ball.model.BallInfo(18, qp1.n.a(appBrandBackgroundRunningOperationParcel.f76932d, appBrandBackgroundRunningOperationParcel.f76933e), null);
            ballInfo3.f93048f = 2;
            X0(ballInfo3);
        }
        if ((appBrandBackgroundRunningOperationParcel.f76934f & 16) > 0) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo4 = new com.tencent.mm.plugin.ball.model.BallInfo(19, qp1.n.a(appBrandBackgroundRunningOperationParcel.f76932d, appBrandBackgroundRunningOperationParcel.f76933e), null);
            ballInfo4.f93048f = 2;
            X0(ballInfo4);
        }
        if ((appBrandBackgroundRunningOperationParcel.f76934f & 32) > 0) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo5 = new com.tencent.mm.plugin.ball.model.BallInfo(33, qp1.n.a(appBrandBackgroundRunningOperationParcel.f76932d, appBrandBackgroundRunningOperationParcel.f76933e), null);
            ballInfo5.f93048f = 2;
            X0(ballInfo5);
        }
        if ((appBrandBackgroundRunningOperationParcel.f76934f & 64) > 0) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo6 = new com.tencent.mm.plugin.ball.model.BallInfo(40, qp1.n.a(appBrandBackgroundRunningOperationParcel.f76932d, appBrandBackgroundRunningOperationParcel.f76933e), null);
            ballInfo6.f93048f = 3;
            X0(ballInfo6);
        }
    }

    @Override // gp1.v
    public void A0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (!((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).contains(ballInfo)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "exposeBallInfo, existed:false");
            return;
        }
        android.util.SparseArray sparseArray = this.f93218d;
        java.util.Set set = (java.util.Set) sparseArray.get(ballInfo.f93046d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).V(ballInfo);
            }
        }
        fs.g.c(gp1.x.class, java.lang.Integer.valueOf(ballInfo.f93046d), new com.tencent.mm.plugin.ball.service.v(this, ballInfo));
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((gp1.z) it6.next()).V(ballInfo);
            }
        }
        fs.g.c(gp1.x.class, 0, new com.tencent.mm.plugin.ball.service.w(this, ballInfo));
    }

    @Override // gp1.v
    public void B(boolean z17) {
        J0(z17, null);
    }

    @Override // gp1.v
    public void B0(com.tencent.mm.plugin.ball.model.BallInfo info, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.ball.service.g gVar = com.tencent.mm.plugin.ball.service.g.f93161a;
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String e17 = info.e();
        kotlin.jvm.internal.o.f(e17, "generateHashKey(...)");
        gVar.c(bitmap, gVar.a(e17));
    }

    @Override // gp1.v
    public void C(android.view.View view) {
        this.f93235u = view;
    }

    @Override // gp1.v
    public void C0() {
        synchronized (this.f93215a) {
            java.util.List d17 = qp1.w.d(this.f93215a);
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = null;
            if (qp1.w.a(d17)) {
                java.util.Iterator it = ((java.util.Vector) d17).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
                    if (ballInfo != null && ballInfo2.B >= ballInfo.B) {
                    }
                    ballInfo = ballInfo2;
                }
            }
            if (ballInfo != null) {
                U(ballInfo);
            }
        }
    }

    @Override // gp1.v
    public android.graphics.Point D(int i17, int i18, int i19, android.graphics.Point point) {
        if (i17 != 1) {
            return T(i18, point);
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        int rotation = windowManager != null ? windowManager.getDefaultDisplay().getRotation() : 0;
        rp1.h hVar = com.tencent.mm.plugin.ball.view.ContentFloatBallView.T;
        android.graphics.Point point2 = new android.graphics.Point();
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        int b17 = hVar.b(i19, com.tencent.mm.plugin.ball.service.p4.f93199m);
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        if (com.tencent.mm.plugin.ball.service.p4.f93201o) {
            point2.x = (int) (pp1.b.f357397f - (hVar.a() * qp1.c0.f365694c));
            point2.y = (int) (b17 + pp1.b.f357396e + ((qp1.c0.f365695d * (1 - hVar.a())) / 2));
        } else {
            point2.x = (int) (i18 - ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.ball.view.ContentFloatBallView.f93415p0).getValue()).floatValue());
            point2.y = (int) (b17 + pp1.b.f357396e + ((qp1.c0.f365695d * (1 - hVar.a())) / 2));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "getFloatBallPositionForAnimation viewWidth: %s, viewHeight: %s, dockLeft: %s, ballSize: %s, position: %s, rotation: %s", valueOf, valueOf2, java.lang.Boolean.valueOf(com.tencent.mm.plugin.ball.service.p4.f93201o), point, point2, java.lang.Integer.valueOf(rotation));
        return point2;
    }

    @Override // gp1.v
    public void D0(gp1.d0 d0Var) {
        if (d0Var != null) {
            java.util.List list = this.f93215a;
            if (qp1.w.a(list)) {
                d0Var.a(new java.util.ArrayList(list));
            } else {
                d0Var.a(new java.util.ArrayList());
            }
        }
    }

    @Override // gp1.v
    public void E(long j17) {
        this.f93230p = j17;
    }

    @Override // gp1.v
    public void E0(boolean z17) {
        Z0(z17, true, null);
    }

    @Override // gp1.v
    public void F(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.plugin.ball.model.BallInfo I0 = I0();
        if (I0 != null) {
            I0.H = ballInfo.H;
            I0.P = ballInfo.P;
            com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
            if (nVar == null || (floatBallView = nVar.f93318c) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "switchVoipVoice");
            if (I0.P == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallView", "switchVoip animationInfo invalid and ignore");
                return;
            }
            android.graphics.Point point = new android.graphics.Point(I0.P.f338791a);
            android.graphics.Point point2 = new android.graphics.Point(I0.P.f338792b);
            if (!floatBallView.b0(point) || !floatBallView.b0(point2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallView", "switchVoip animationInfo size invalid and ignore");
                return;
            }
            floatBallView.A0((floatBallView.f93563x1 ? 8388611 : 8388613) | floatBallView.R1, true);
            android.widget.FrameLayout frameLayout = floatBallView.f93560w;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "animateVoipSwitch state: %d, startSize: %s, endSize: %s, current: %d, %d", java.lang.Integer.valueOf(I0.H), point, point2, java.lang.Integer.valueOf(layoutParams.width), java.lang.Integer.valueOf(layoutParams.height));
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            if (animatorListenerAdapter != null) {
                ofFloat.addListener(animatorListenerAdapter);
            }
            ofFloat.addListener(new rp1.k1(floatBallView, I0, point, point2));
            ofFloat.addUpdateListener(new rp1.m1(floatBallView, layoutParams, point, point2, frameLayout));
            ofFloat.start();
        }
    }

    @Override // gp1.v
    public android.graphics.Point G() {
        android.graphics.Point point;
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar != null) {
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            point = floatBallView != null ? floatBallView.getBallPosition() : new android.graphics.Point(qp1.w.k(), qp1.w.l());
            if (point == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallUIManager", "getBallPosition, position is null, return default position");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "getBallPosition, position:[%s, %s]", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
            return point;
        }
        point = new android.graphics.Point(qp1.w.k(), qp1.w.l());
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "getBallPosition, position:[%s, %s]", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
        return point;
    }

    @Override // gp1.v
    public void H(gp1.y yVar) {
        ((java.util.concurrent.CopyOnWriteArraySet) this.f93216b).add(yVar);
    }

    @Override // gp1.v
    public void I(boolean z17) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar == null || (floatBallView = nVar.f93318c) == null || !nVar.f93325j) {
            return;
        }
        floatBallView.B.setAlpha(z17 ? 1.0f : 0.0f);
    }

    public final com.tencent.mm.plugin.ball.model.BallInfo I0() {
        java.util.List list = this.f93215a;
        if (!qp1.w.a(list)) {
            return null;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (qp1.w.t(ballInfo)) {
                return ballInfo;
            }
        }
        return null;
    }

    @Override // gp1.v
    public long J() {
        return this.f93230p;
    }

    public void J0(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.f93226l) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "hideFloatBall, has marked QB file view page, ignore hiding");
            return;
        }
        boolean z18 = q0() && !this.f93225k;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "hideFloatBall forceHide: %b, canShowFloatBall: %b, videoBallInfo: %s", java.lang.Boolean.valueOf(this.f93225k), java.lang.Boolean.valueOf(z18), I0());
        if (z18) {
            return;
        }
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        e17.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.n0(e17, z17, animatorListenerAdapter));
    }

    @Override // gp1.v
    public int K() {
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar == null) {
            gp1.j[] jVarArr = gp1.j.f274185d;
            return -1;
        }
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
        if (floatBallView != null) {
            return floatBallView.getCurrentCollapseState();
        }
        gp1.j[] jVarArr2 = gp1.j.f274185d;
        return -1;
    }

    public void K0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "markNoFloatBallPage:%s", java.lang.Boolean.valueOf(z17));
        boolean z18 = this.f93224j;
        this.f93224j = z17;
        if (z17 != z18) {
            M0(11, null);
        }
    }

    @Override // gp1.v
    public void L(int i17, gp1.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "removeFloatBallInfoEventListener, type:%s", java.lang.Integer.valueOf(i17));
        if (zVar != null) {
            synchronized (this.f93218d) {
                java.util.Set set = (java.util.Set) this.f93218d.get(i17);
                if (set != null) {
                    set.remove(zVar);
                }
            }
        }
    }

    public final void L0(final com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        android.util.SparseArray sparseArray = this.f93218d;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Set set = (java.util.Set) sparseArray.get(sparseArray.keyAt(i17));
            if (qp1.w.a(set)) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((gp1.z) it.next()).X0(ballInfo);
                }
            }
        }
        fs.g.b(gp1.x.class, new fs.o() { // from class: com.tencent.mm.plugin.ball.service.s$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((gp1.x) nVar).X0(com.tencent.mm.plugin.ball.model.BallInfo.this);
                return false;
            }
        });
    }

    @Override // gp1.v
    public void M(int i17) {
        if (this.f93221g == null || this.f93221g.f93047e != i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "removeMessageBall type: %d", java.lang.Integer.valueOf(i17));
        synchronized (this.f93215a) {
            U(this.f93221g);
        }
    }

    public final void M0(int i17, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f93220f).values().iterator();
        while (it.hasNext()) {
            ((android.os.ResultReceiver) it.next()).send(i17, bundle);
        }
    }

    @Override // gp1.v
    public void N(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(ballInfo);
        if (t07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallVisibility, existed:false");
            return;
        }
        t07.f93045J = !z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallVisibility, existed:true, visible:%s, ballInfo:%s", java.lang.Boolean.valueOf(z17), t07);
        Q0();
    }

    public final void N0(java.util.List list) {
        int size;
        java.util.Map map = this.f93220f;
        if (((java.util.concurrent.ConcurrentHashMap) map).isEmpty() || this.f93237w == (size = ((java.util.Vector) qp1.w.d(list)).size())) {
            return;
        }
        this.f93237w = size;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ActiveCount", size);
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).values().iterator();
        while (it.hasNext()) {
            ((android.os.ResultReceiver) it.next()).send(5, bundle);
        }
    }

    @Override // gp1.v
    public boolean O() {
        return qp1.u.f365743a.a();
    }

    public void O0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        try {
            synchronized (this.f93218d) {
                java.util.Set set = (java.util.Set) this.f93218d.get(ballInfo.f93046d);
                if (qp1.w.a(set)) {
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((gp1.z) it.next()).N0(ballInfo);
                    }
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(ballInfo.f93046d);
                for (fs.q qVar : ((fs.c) fs.g.f(gp1.x.class)).all()) {
                    if (qVar.hasKey(valueOf) && fs.g.d(fs.g.f266086c, qVar)) {
                        ((gp1.x) ((fs.n) qVar.get())).N0(ballInfo);
                    }
                }
                java.util.Set set2 = (java.util.Set) this.f93218d.get(0);
                if (qp1.w.a(set2)) {
                    java.util.Iterator it6 = set2.iterator();
                    while (it6.hasNext()) {
                        ((gp1.z) it6.next()).N0(ballInfo);
                    }
                }
                for (fs.q qVar2 : ((fs.c) fs.g.f(gp1.x.class)).all()) {
                    if (qVar2.hasKey(0) && fs.g.d(fs.g.f266086c, qVar2)) {
                        ((gp1.x) ((fs.n) qVar2.get())).N0(ballInfo);
                    }
                }
            }
            S0(ballInfo, 7);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallService", e17, "notifyBallDeleteButtonClicked exception", new java.lang.Object[0]);
        }
    }

    @Override // gp1.v
    public android.graphics.Point P() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar == null || (floatBallView = nVar.f93318c) == null) {
            return null;
        }
        return floatBallView.getCurrentCustomBallSize();
    }

    public void P0(com.tencent.mm.plugin.ball.model.BallInfo target) {
        try {
            java.util.List ballList = this.f93215a;
            kotlin.jvm.internal.o.g(target, "target");
            kotlin.jvm.internal.o.g(ballList, "ballList");
            com.tencent.mm.plugin.ball.service.i.c(target, ballList, target.f93054o.f93069d ? 2 : 3);
            synchronized (this.f93218d) {
                java.util.Set set = (java.util.Set) this.f93218d.get(target.f93046d);
                if (qp1.w.a(set)) {
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((gp1.z) it.next()).V0(target);
                    }
                }
                fs.g.c(gp1.x.class, java.lang.Integer.valueOf(target.f93046d), new com.tencent.mm.plugin.ball.service.a0(this, target));
                java.util.Set set2 = (java.util.Set) this.f93218d.get(0);
                if (qp1.w.a(set2)) {
                    java.util.Iterator it6 = set2.iterator();
                    while (it6.hasNext()) {
                        ((gp1.z) it6.next()).V0(target);
                    }
                }
                fs.g.c(gp1.x.class, 0, new com.tencent.mm.plugin.ball.service.b0(this, target));
            }
            S0(target, 6);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallService", e17, "notifyBallPlayButtonClicked exception", new java.lang.Object[0]);
        }
    }

    @Override // gp1.v
    public void Q(boolean z17) {
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar != null) {
            nVar.f93324i = z17;
        }
    }

    public final void Q0() {
        ov.m0 m0Var = (ov.m0) i95.n0.c(ov.m0.class);
        m0Var.getClass();
        if (gm0.j1.a()) {
            m0Var.requireAccountInitialized();
        }
        synchronized (this.f93215a) {
            java.util.Vector vector = new java.util.Vector(this.f93215a);
            if (Y()) {
                if (qp1.w.a(vector)) {
                    java.util.Collections.sort(vector, new qp1.w$$a());
                } else {
                    vector = new java.util.Vector();
                }
            } else if (qp1.w.a(vector)) {
                java.util.Collections.sort(vector, new qp1.x());
            } else {
                vector = new java.util.Vector();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "notifyFloatBallInfoChanged, originSize: %d, sortedSize: %d, ballInfoList:%s", java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).size()), java.lang.Integer.valueOf(vector.size()), vector);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93216b).iterator();
            while (it.hasNext()) {
                ((gp1.y) it.next()).X(vector, this.f93236v);
                N0(vector);
            }
        }
    }

    @Override // gp1.v
    public void R(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "markQBFileViewPage:%s", java.lang.Boolean.valueOf(z17));
        this.f93226l = z17;
    }

    public final void R0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, android.os.Bundle bundle) {
        java.lang.String e17 = ballInfo.e();
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((java.util.concurrent.ConcurrentHashMap) this.f93220f).get(e17);
        if (resultReceiver != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "notifyResultReceiver, event:%s, ballInfoHashKey:%s, receiver:%s", java.lang.Integer.valueOf(i17), e17, java.lang.Integer.valueOf(resultReceiver.hashCode()));
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            resultReceiver.send(i17, bundle);
        }
    }

    @Override // gp1.v
    public void S() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resetReadyStatusBallInfo");
        this.f93222h = null;
    }

    public final void S0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", ballInfo.f93046d);
        bundle.putString("key", ballInfo.f93049g);
        R0(ballInfo, i17, bundle);
    }

    @Override // gp1.v
    public android.graphics.Point T(int i17, android.graphics.Point point) {
        android.graphics.Point point2 = new android.graphics.Point();
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        if (com.tencent.mm.plugin.ball.service.p4.f93197h) {
            point2.set(qp1.e0.a(com.tencent.mm.plugin.ball.view.FloatBallView.G2), qp1.w.l() + qp1.e0.a(qp1.c0.f365704m));
        } else {
            point2.set((i17 - point.x) - qp1.e0.a(com.tencent.mm.plugin.ball.view.FloatBallView.G2), qp1.w.l() + qp1.e0.a(qp1.c0.f365704m));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "getFloatBallPositionForAnimation viewWidth: %s, dockLeft: %s, ballSize: %s, position:[%s, %s]", valueOf, java.lang.Boolean.valueOf(com.tencent.mm.plugin.ball.service.p4.f93197h), point, java.lang.Integer.valueOf(point2.x), java.lang.Integer.valueOf(point2.y));
        return point2;
    }

    public void T0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("type", ballInfo.f93046d);
        bundle2.putString("key", ballInfo.f93049g);
        bundle2.putInt("function_type", i18);
        if (bundle != null) {
            bundle2.putBundle("function_param", bundle);
        }
        R0(ballInfo, i17, bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // gp1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(com.tencent.mm.plugin.ball.model.BallInfo r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.f93215a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.contains(r6)
            java.lang.String r1 = "MicroMsg.FloatBallService"
            if (r0 == 0) goto Ldd
            java.util.List r0 = r5.f93215a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.remove(r6)
            com.tencent.mm.plugin.ball.service.p4 r0 = com.tencent.mm.plugin.ball.service.p4.f()
            r0.j(r6)
            java.util.List r0 = r5.f93215a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            com.tencent.mm.plugin.ball.service.h.d(r6, r0)
            java.util.List r0 = r5.f93215a
            r2 = 4
            com.tencent.mm.plugin.ball.service.i.c(r6, r0, r2)
            java.lang.String r0 = "removeBallInfo, existed:true, ballInfo:%s"
            java.lang.Object[] r2 = new java.lang.Object[]{r6}
            com.tencent.mars.xlog.Log.i(r1, r0, r2)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r5.f93236v
            r2 = 0
            if (r0 == 0) goto L48
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r5.f93236v
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L48
            java.lang.String r0 = "removeBallInfo, remove last enteredBallInfo"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r5.f93236v = r2
        L48:
            com.tencent.mm.plugin.ball.ui.q0 r0 = com.tencent.mm.plugin.ball.ui.q0.e()
            java.util.List r1 = r5.f93215a
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            int r1 = r1.size()
            r0.getClass()
            r3 = 1
            if (r1 != 0) goto L72
            boolean r1 = r0.f()
            if (r1 == 0) goto L72
            int r1 = r6.H
            if (r1 == 0) goto L6a
            boolean r1 = r6.f93045J
            if (r1 != 0) goto L6a
            r1 = r3
            goto L6b
        L6a:
            r1 = 0
        L6b:
            if (r1 == 0) goto L72
            boolean r1 = r6.f93059t
            r0.f93347e = r1
            goto L92
        L72:
            boolean r1 = qp1.w.t(r6)
            if (r1 == 0) goto L92
            com.tencent.mm.plugin.ball.ui.f0 r1 = new com.tencent.mm.plugin.ball.ui.f0
            r1.<init>(r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r0 != r4) goto L8b
            r1.run()
            goto L92
        L8b:
            ku5.u0 r0 = ku5.t0.f312615d
            ku5.t0 r0 = (ku5.t0) r0
            r0.B(r1)
        L92:
            r5.W0(r3)
            r0 = 3
            r5.R0(r6, r0, r2)
            r5.U0(r6)
            java.lang.Class<d73.i> r0 = d73.i.class
            i95.m r0 = i95.n0.c(r0)
            d73.i r0 = (d73.i) r0
            java.lang.String r1 = r6.f93049g
            r0.A8(r1)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r5.f93221g
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb3
            r5.f93221g = r2
        Lb3:
            boolean r0 = qp1.w.t(r6)
            if (r0 == 0) goto Lc4
            ku5.u0 r0 = ku5.t0.f312615d
            qp1.h r1 = qp1.h.f365724d
            java.lang.String r2 = "MicroMsg.FloatBallCollapseHelper"
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r1, r2)
        Lc4:
            com.tencent.mm.plugin.ball.service.g r0 = com.tencent.mm.plugin.ball.service.g.f93161a
            java.lang.String r6 = r6.e()
            java.lang.String r1 = "generateHashKey(...)"
            kotlin.jvm.internal.o.f(r6, r1)
            java.lang.String r6 = r0.a(r6)
            boolean r0 = com.tencent.mm.vfs.w6.j(r6)
            if (r0 == 0) goto Le2
            com.tencent.mm.vfs.w6.h(r6)
            goto Le2
        Ldd:
            java.lang.String r6 = "removeBallInfo, existed:false"
            com.tencent.mars.xlog.Log.i(r1, r6)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.service.s.U(com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    public final void U0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        android.util.SparseArray sparseArray = this.f93218d;
        java.util.Set set = (java.util.Set) sparseArray.get(ballInfo.f93046d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).G0(ballInfo);
            }
        }
        fs.g.c(gp1.x.class, java.lang.Integer.valueOf(ballInfo.f93046d), new com.tencent.mm.plugin.ball.service.t(this, ballInfo));
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((gp1.z) it6.next()).G0(ballInfo);
            }
        }
        fs.g.c(gp1.x.class, 0, new com.tencent.mm.plugin.ball.service.u(this, ballInfo));
    }

    @Override // gp1.v
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(ballInfo);
        if (t07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallInfo, existed:false");
            return;
        }
        t07.o(ballInfo);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallInfo, existed:true, ballInfo:%s", t07);
        Q0();
        if (ballInfo.f93055p == t07.f93055p) {
            c(ballInfo);
        }
    }

    public final void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(ballInfo);
        if (t07 == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = ballInfo != null ? ballInfo.e() : "null";
            objArr[1] = java.lang.Boolean.valueOf(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onEnterBallInfoPage, no this ball info:%s, withFloatBall: %s", objArr);
            return;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        t07.B = java.lang.System.currentTimeMillis();
        this.f93236v = t07;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onEnterBallInfoPage, set lastEnteredBallInfo:%s, withFloatBall: %s", this.f93236v.e(), java.lang.Boolean.valueOf(z17));
        W0(z17);
    }

    @Override // gp1.v
    public void W(float f17) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar == null || (floatBallView = nVar.f93318c) == null || !nVar.f93325j) {
            return;
        }
        floatBallView.setFloatBallAlpha(f17);
    }

    public final void W0(boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(this.f93236v);
        if (t07 == null || !qp1.w.a(this.f93215a)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = this.f93236v != null ? this.f93236v.e() : "null";
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "recheckBallInfoList, last enteredBallInfo:%s", objArr);
        } else {
            java.util.List list = this.f93215a;
            if (qp1.w.a(list)) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
                while (it.hasNext()) {
                    if (!((com.tencent.mm.plugin.ball.model.BallInfo) it.next()).equals(t07)) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "recheckBallInfoList, has other balls, hidden current ball info");
                com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
                boolean z19 = nVar != null && nVar.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "recheckBallInfoList, canNotShowFloatBall:%s, withFloatBall:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17));
                if (!z19 && z17) {
                    k(t07, 1.0f);
                }
                java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it6.next();
                    if (qp1.w.r(ballInfo) && ballInfo.f93045J && !ballInfo.equals(t07)) {
                        ballInfo.f93045J = false;
                        R0(ballInfo, 4, null);
                    } else if (ballInfo.equals(t07)) {
                        ballInfo.f93045J = true;
                    }
                }
            } else if (qp1.w.b(this.f93215a, t07)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "recheckBallInfoList, no other balls, make float ball transparent");
                if (qp1.w.r(t07) && Y()) {
                    t07.f93045J = true;
                } else {
                    t07.f93045J = false;
                    k(t07, 0.0f);
                }
            }
        }
        Q0();
    }

    @Override // gp1.v
    public void X(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "markForceHideAllFloatBall %b", java.lang.Boolean.valueOf(z17));
        this.f93225k = z17;
        com.tencent.mm.plugin.ball.ui.q0.e().f93348f = z17;
    }

    public final void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(ballInfo);
        if (t07 == null || !t07.I) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "removeAppBrandPassiveBallInfo, remove existedBallInfo:%s", t07);
        t07.M.f93090m = 10;
        U(t07);
    }

    @Override // gp1.v
    public boolean Y() {
        qp1.u uVar = qp1.u.f365743a;
        return com.tencent.mm.sdk.platformtools.x2.n() ? ((java.lang.Boolean) ((jz5.n) qp1.u.f365744b).getValue()).booleanValue() : ((java.lang.Boolean) ((jz5.n) qp1.u.f365745c).getValue()).booleanValue();
    }

    public void Y0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        if (!((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).contains(ballInfo) || ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).contains(ballInfo2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallService", "replacedBalInfo invalid");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "replaceBallInfo, replaced.type: %s, target.type: %s", java.lang.Integer.valueOf(ballInfo.f93046d), java.lang.Integer.valueOf(ballInfo2.f93046d));
        if (qp1.w.t(ballInfo)) {
            com.tencent.mm.plugin.ball.ui.q0.e().b();
            ballInfo.f93050h = null;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).remove(ballInfo);
        com.tencent.mm.plugin.ball.service.p4.f().j(ballInfo);
        com.tencent.mm.plugin.ball.service.h.d(ballInfo, ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).isEmpty());
        com.tencent.mm.plugin.ball.service.i.c(ballInfo, this.f93215a, 4);
        if (this.f93236v != null && this.f93236v.equals(ballInfo)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "replacedBallInfo, remove last enteredBallInfo");
            this.f93236v = null;
        }
        ((d73.i) i95.n0.c(d73.i.class)).A8(ballInfo.f93049g);
        if (ballInfo.equals(this.f93221g)) {
            this.f93221g = null;
        }
        R0(ballInfo, 3, null);
        U0(ballInfo);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ballInfo2.B = currentTimeMillis;
        ballInfo2.C = currentTimeMillis;
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = ballInfo2.M;
        ballReportInfo.f93090m = -1;
        if (ballInfo2.f93046d != 20) {
            ballReportInfo.f93084d = (ballInfo2.I && ballReportInfo.f93084d == 0) ? 3 : ballReportInfo.f93084d;
        } else {
            int i17 = ballReportInfo.f93084d;
            if (i17 == 0) {
                i17 = 5;
            }
            ballReportInfo.f93084d = i17;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).add(ballInfo2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "replacedBallInfo addBallInfo, existed:false, ballInfo:%s", ballInfo2);
        if (!ballInfo2.L) {
            com.tencent.mm.plugin.ball.service.h.a(ballInfo2, this.f93215a);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", ballInfo2.f93046d);
        bundle.putString("key", ballInfo2.f93049g);
        M0(1, bundle);
        L0(ballInfo2);
        ((d73.i) i95.n0.c(d73.i.class)).Ce(ballInfo2);
        int i18 = ballInfo.f93046d;
        if (i18 == 20) {
            i18 = ballInfo.f93047e;
        }
        android.util.SparseArray sparseArray = this.f93218d;
        java.util.Set set = (java.util.Set) sparseArray.get(i18);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).F0(ballInfo, ballInfo2);
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(ballInfo.f93046d);
        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(gp1.x.class)).all()).iterator();
        while (true) {
            fs.f fVar = (fs.f) it6;
            if (!fVar.hasNext()) {
                break;
            }
            fs.q qVar = (fs.q) fVar.next();
            if (qVar.hasKey(valueOf) && fs.g.d(fs.g.f266086c, qVar)) {
                ((gp1.x) ((fs.n) qVar.get())).F0(ballInfo, ballInfo2);
            }
        }
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it7 = set2.iterator();
            while (it7.hasNext()) {
                ((gp1.z) it7.next()).F0(ballInfo, ballInfo2);
            }
        }
        java.util.Iterator it8 = ((fs.e) ((fs.c) fs.g.f(gp1.x.class)).all()).iterator();
        while (true) {
            fs.f fVar2 = (fs.f) it8;
            if (!fVar2.hasNext()) {
                break;
            }
            fs.q qVar2 = (fs.q) fVar2.next();
            if (qVar2.hasKey(0) && fs.g.d(fs.g.f266086c, qVar2)) {
                ((gp1.x) ((fs.n) qVar2.get())).F0(ballInfo, ballInfo2);
            }
        }
        W0(true);
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        e17.getClass();
        pm0.v.W(new com.tencent.mm.plugin.ball.ui.j0(e17, true));
        if (qp1.w.t(ballInfo2)) {
            ((ku5.t0) ku5.t0.f312615d).h(new qp1.g(ballInfo2), "MicroMsg.FloatBallCollapseHelper");
        }
    }

    @Override // gp1.v
    public void Z() {
        com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493669l73);
    }

    public final void Z0(boolean z17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo;
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resumeFloatBall, no float window permission");
            java.util.List list = this.f93215a;
            if (qp1.w.a(list)) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ballInfo = null;
                        break;
                    } else {
                        ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
                        if (ballInfo.f93046d == 7) {
                            break;
                        }
                    }
                }
                if (ballInfo != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "removeLocationBackgroundBallInfoIfNeed, removed");
                    U(ballInfo);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "removeLocationBackgroundBallInfoIfNeed, ignore");
                }
            }
            com.tencent.mm.plugin.ball.ui.q0.e().c();
            this.f93223i = false;
            ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "ballinfo clear2");
            com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
            synchronized (f17) {
                com.tencent.mm.sdk.platformtools.o4.M(f17.d()).remove("balls");
            }
            Q0();
            return;
        }
        if (this.f93223i) {
            if (this.f93224j && !q0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resumeFloatBall, has marked no float ball page, ignore resuming");
                return;
            }
            if (this.f93225k) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resumeFloatBall, has marked forceHideAllFloatBall, ignore resuming");
                return;
            }
            if (this.f93227m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resumeFloatBall, hasHideForKeyboardHeightChange, ignore resuming");
                return;
            }
            com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(this.f93236v);
            if (!((t07 == null || !qp1.w.a(this.f93215a)) ? false : qp1.w.b(this.f93215a, t07))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resumeFloatBall not singleBallInfoCondition, withAnimation:%s", java.lang.Boolean.valueOf(z17));
                com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
                e17.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.o0(e17, z17, z18, animatorListenerAdapter));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resumeFloatBall singleBallInfoCondition, withAnimation:false");
            com.tencent.mm.plugin.ball.ui.q0 e18 = com.tencent.mm.plugin.ball.ui.q0.e();
            e18.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.o0(e18, false, z18, animatorListenerAdapter));
            V0(this.f93236v, true);
        }
    }

    @Override // gp1.v
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onAccountRelease:%s", java.lang.Integer.valueOf(hashCode()));
        n(com.tencent.mm.plugin.ball.ui.q0.e());
        n(com.tencent.mm.plugin.ball.service.p4.f());
        this.f93223i = false;
        com.tencent.mm.plugin.ball.ui.q0.e().c();
    }

    @Override // gp1.v
    public void a0(int i17, gp1.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "addFloatBallInfoEventListener, type:%s", java.lang.Integer.valueOf(i17));
        if (zVar != null) {
            synchronized (this.f93218d) {
                java.util.Set set = (java.util.Set) this.f93218d.get(i17);
                if (set == null) {
                    set = new java.util.HashSet();
                    this.f93218d.put(i17, set);
                }
                set.add(zVar);
            }
        }
    }

    public final boolean a1(int i17, int i18, boolean z17, boolean z18, boolean z19, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        int l17;
        boolean q07 = q0();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallVisibilityByKbHeight needShowFloatBall: %b", java.lang.Boolean.valueOf(q07));
        if (!q07 || this.f93234t || !this.f93227m) {
            int i19 = qp1.c0.f365693b + qp1.c0.f365704m + qp1.c0.f365706o;
            android.view.View view = this.f93235u;
            if (view != null) {
                i19 = java.lang.Math.max(view.getMeasuredHeight(), i19);
            }
            com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
            if (nVar != null) {
                com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
                l17 = floatBallView != null ? floatBallView.getPositionY() : qp1.w.l();
            } else {
                l17 = qp1.w.l();
            }
            boolean z27 = ((l17 + i19) + i17) + (z19 ? i18 : 0) >= this.f93233s && i17 > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallVisibilityByKbHeight, ballPositionY:[%s, %s], keyboardHeight:%s, screenHeight:%s, extraHeight: %d, hide: %b, checkBottomShadow: %b, checkExtraHeight: %b", java.lang.Integer.valueOf(l17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f93233s), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            if (z27) {
                this.f93227m = true;
                J0(z17, animatorListenerAdapter);
                return true;
            }
            if (!this.f93227m) {
                return false;
            }
            this.f93227m = false;
            Z0(z17, true, animatorListenerAdapter);
            return true;
        }
        this.f93227m = false;
        android.view.View view2 = this.f93235u;
        if (view2 != null) {
            if (!((view2 == null || !(view2 instanceof com.tencent.mm.plugin.ball.view.FloatBallView)) ? false : ((com.tencent.mm.plugin.ball.view.FloatBallView) view2).a0())) {
                android.view.View view3 = this.f93235u;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f93235u;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                Z0(z17, false, animatorListenerAdapter);
                return true;
            }
        }
        return false;
    }

    @Override // gp1.v
    public void b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        dp1.l lVar;
        com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView baseFloatBallButtonView;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2;
        com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(ballInfo);
        if (t07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updatePlayButton, existed:false");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updatePlayButton, existed:true, ballInfo:%s", t07);
        t07.f93054o.a(ballInfo.f93054o);
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        if (e17.f()) {
            com.tencent.mm.plugin.ball.ui.n nVar = e17.f93346d;
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            if (floatBallView != null && (baseFloatBallButtonView = floatBallView.f93567z) != null && (ballInfo2 = floatBallView.M1) != null && ballInfo2 == t07) {
                baseFloatBallButtonView.a(t07);
            }
            com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = nVar.f93319d;
            if (!(floatMenuView != null && floatMenuView.getVisibility() == 0) || (lVar = nVar.f93319d.f93579g) == null) {
                return;
            }
            pm0.v.W(new dp1.b(lVar, t07));
        }
    }

    @Override // gp1.v
    public void b0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateCustomViewInMMProcess");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.service.g0(this, ballInfo));
    }

    public final void b1(int i17, int i18, boolean z17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar != null ? nVar.f93320e : null;
        if (contentFloatBallView != null && contentFloatBallView.s()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByKbHeight keyboardHeight: %s, extraHeight: %s, withAnimation: %s, checkExtraHeight: %s, animatorListenerAdapter: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), animatorListenerAdapter);
            if (!this.f93234t) {
                if (this.f93228n) {
                    this.f93228n = false;
                    if (contentFloatBallView.y()) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByKbHeight keyboard hide and try to showContentBall");
                    contentFloatBallView.J(true, false, animatorListenerAdapter);
                    return;
                }
                return;
            }
            int floatBallHeight = contentFloatBallView.getFloatBallHeight();
            int currentBallPositionY = contentFloatBallView.getCurrentBallPositionY();
            boolean z19 = ((currentBallPositionY + floatBallHeight) + i17) + (z18 ? i18 : 0) >= this.f93233s && i17 > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByKbHeight, ballPositionY:[%s, %s], keyboardHeight:%s, screenHeight:%s, extraHeight: %d, hide: %b, checkExtraHeight: %b", java.lang.Integer.valueOf(currentBallPositionY), java.lang.Integer.valueOf(floatBallHeight), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f93233s), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18));
            if (z19) {
                this.f93228n = true;
                contentFloatBallView.t(z17, animatorListenerAdapter);
            } else if (this.f93228n) {
                this.f93228n = false;
                contentFloatBallView.J(z17, false, animatorListenerAdapter);
            }
        }
    }

    @Override // gp1.v
    public void c(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2;
        com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(ballInfo);
        if (t07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallBlurInfo, existed:false");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallBlurInfo, existed:true, ballInfo:%s", t07);
        com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = ballInfo.f93055p;
        com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo2 = t07.f93055p;
        ballBlurInfo2.getClass();
        ballBlurInfo2.f93066d = ballBlurInfo.f93066d;
        ballBlurInfo2.f93067e = ballBlurInfo.f93067e;
        ballBlurInfo2.f93068f = ballBlurInfo.f93068f;
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        if (!e17.f() || (floatBallView = e17.f93346d.f93318c) == null || floatBallView.f93564y == null || (ballInfo2 = floatBallView.L1) == null || ballInfo2 != t07) {
            return;
        }
        floatBallView.x0(ballBlurInfo2);
        qp1.b.a(ballBlurInfo2, floatBallView.f93564y);
    }

    @Override // gp1.v
    public boolean c0() {
        java.util.List list = this.f93215a;
        if (qp1.w.a(list)) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
                if (!ballInfo.f93045J) {
                    if (qp1.w.q(ballInfo.H, 2048) || qp1.w.q(ballInfo.H, 4) || qp1.w.q(ballInfo.H, 8) || qp1.w.q(ballInfo.H, 512) || qp1.w.q(ballInfo.H, 1024)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void c1(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (this.f93221g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallService", "updateMessageBall messageBallInfo is null and ignore");
            return;
        }
        if (t0(this.f93221g) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallService", "updateMessageBall messageBallInfo not null but not added!!");
            return;
        }
        this.f93221g.o(ballInfo);
        this.f93221g.f93049g = ballInfo.f93049g;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateMessageBall existed: true, and update %s", this.f93221g);
        V(this.f93221g);
    }

    @Override // gp1.v
    public void d(boolean z17) {
        K0(true);
        J0(z17, null);
    }

    @Override // gp1.v
    public android.graphics.Point d0() {
        android.graphics.Point point;
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar != null) {
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            point = (floatBallView == null || !nVar.f93325j) ? new android.graphics.Point(qp1.w.k(), qp1.w.l()) : floatBallView.getFloatBallPosition();
        } else {
            point = new android.graphics.Point(qp1.w.k(), qp1.w.l());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "getFloatBallPosition, position:[%s, %s]", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
        return point;
    }

    @Override // gp1.v
    public void e(int i17, qp1.i0 i0Var) {
        if (i0Var != null) {
            synchronized (this.f93219e) {
                java.util.Set set = (java.util.Set) this.f93219e.get(i17);
                if (set == null) {
                    set = new java.util.HashSet();
                    this.f93219e.put(i17, set);
                }
                set.add(i0Var);
            }
        }
    }

    @Override // gp1.v
    public void e0() {
        R(false);
        K0(false);
        if (this.f93236v == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "fixFloatBallIfNeed, safe");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "fixFloatBallIfNeed, lastEnteredBallInfo:%s", this.f93236v);
            i(t0(this.f93236v));
        }
    }

    @Override // gp1.v
    public void f(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, android.os.ResultReceiver resultReceiver) {
        if (ballInfo == null || resultReceiver == null) {
            return;
        }
        java.lang.String e17 = ballInfo.e();
        java.util.Map map = this.f93220f;
        ((java.util.concurrent.ConcurrentHashMap) map).put(e17, resultReceiver);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "registerFloatBallEventReceiver, key:%s, receiver:%s, size: %s", e17, java.lang.Integer.valueOf(resultReceiver.hashCode()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) map).size()));
    }

    @Override // gp1.v
    public boolean f0() {
        return this.f93225k;
    }

    @Override // gp1.v
    public void g(int i17) {
        this.f93233s = i17;
    }

    @Override // gp1.v
    public void g0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (!((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).contains(ballInfo)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "hideBallInfo, existed:false");
            return;
        }
        android.util.SparseArray sparseArray = this.f93218d;
        java.util.Set set = (java.util.Set) sparseArray.get(ballInfo.f93046d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).w(ballInfo);
            }
        }
        fs.g.c(gp1.x.class, java.lang.Integer.valueOf(ballInfo.f93046d), new com.tencent.mm.plugin.ball.service.x(this, ballInfo));
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((gp1.z) it6.next()).w(ballInfo);
            }
        }
        fs.g.c(gp1.x.class, 0, new com.tencent.mm.plugin.ball.service.y(this, ballInfo));
    }

    @Override // gp1.v
    public void h(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null) {
            com.tencent.mm.plugin.ball.service.h.a(ballInfo, this.f93215a);
        }
    }

    @Override // gp1.v
    public void h0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        x0(ballInfo, ballInfo.N);
    }

    @Override // gp1.v
    public void i(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = this.f93236v != null ? this.f93236v.e() : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onExitBallInfoPage, lastEnteredBallInfo:%s", objArr);
        this.f93236v = null;
        com.tencent.mm.plugin.ball.model.BallInfo t07 = t0(ballInfo);
        if (t07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onExitBallInfoPage, no this ball info");
            com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
            com.tencent.mm.plugin.ball.service.n0 n0Var = new com.tencent.mm.plugin.ball.service.n0(this, ballInfo);
            e17.getClass();
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                e17.d(true, n0Var);
                return;
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.m0(e17, true, n0Var));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onExitBallInfoPage, ballInfo:%s", t07);
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = t07.M;
        int i17 = ballReportInfo.f93090m;
        if (i17 == -1) {
            ballReportInfo.f93090m = 0;
        } else if (i17 != -1) {
            if (!(i17 == 7 || i17 == 4 || i17 == 5 || i17 == 12 || i17 == 13)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallReportLogic", "minimizeBallReport unexpected opType:%d", java.lang.Integer.valueOf(i17));
                ballReportInfo.f93090m = 6;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.ball.service.h.c(t07, ballReportInfo.f93090m, 0L, 0L, 0L, java.lang.System.currentTimeMillis() - t07.B, 0L);
        }
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar != null && nVar.c()) {
            com.tencent.mm.plugin.ball.ui.q0 e18 = com.tencent.mm.plugin.ball.ui.q0.e();
            com.tencent.mm.plugin.ball.service.n0 n0Var2 = new com.tencent.mm.plugin.ball.service.n0(this, ballInfo);
            e18.getClass();
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                e18.d(true, n0Var2);
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.m0(e18, true, n0Var2));
            }
        } else if (!this.f93225k) {
            k(ballInfo, 1.0f);
        }
        if (t07.f93045J) {
            t07.f93045J = false;
            Q0();
        }
    }

    @Override // gp1.v
    public void i0(int i17) {
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar != null) {
            qp1.j.a(i17, nVar.f93318c);
            qp1.j.a(i17, nVar.f93320e);
        }
    }

    @Override // gp1.v
    public boolean j() {
        return this.f93226l;
    }

    @Override // gp1.v
    public void j0(boolean z17) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar == null || (floatBallView = nVar.f93318c) == null || !nVar.f93325j) {
            return;
        }
        floatBallView.setFloatBallPageAnimating(z17);
    }

    @Override // gp1.v
    public void k(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, float f17) {
        if (f17 == 1.0f || qp1.w.b(this.f93215a, ballInfo)) {
            com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
            e17.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.k0(e17, f17));
        }
    }

    @Override // gp1.v
    public void k0() {
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        e17.getClass();
        pm0.v.W(new com.tencent.mm.plugin.ball.ui.i0(e17, 2));
    }

    @Override // gp1.v
    public void l(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null) {
            java.lang.String e17 = ballInfo.e();
            android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((java.util.concurrent.ConcurrentHashMap) this.f93220f).remove(e17);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = e17;
            objArr[1] = resultReceiver != null ? java.lang.Integer.valueOf(resultReceiver.hashCode()) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "removeFloatBallEventReceiver, key:%s, receiver:%s", objArr);
        }
    }

    @Override // gp1.v
    public boolean l0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (t0(ballInfo) != null) {
            return true;
        }
        synchronized (this.f93215a) {
            if (qp1.w.m(this.f93215a) >= 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "canAddBallInfo, false");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "canAddBallInfo, true");
            return true;
        }
    }

    @Override // gp1.v
    public void m(int i17, int i18, boolean z17, long j17) {
        this.f93231q = i17;
        this.f93232r = i18;
        this.f93234t = z17;
        if (!com.tencent.mm.plugin.ball.ui.q0.e().f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "KeyboardHeightChanged, no float ball");
            return;
        }
        b1(i17, i18, true, this.f93231q != 0, null);
        if (z17) {
            X(true);
        } else {
            X(false);
        }
        if (j17 != 0) {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.ball.service.i0(this, i17, i18), j17);
        } else {
            a1(i17, i18, true, true, this.f93231q != 0, null);
        }
    }

    @Override // gp1.v
    public void m0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        V0(ballInfo, false);
    }

    @Override // gp1.v
    public void n(gp1.y yVar) {
        ((java.util.concurrent.CopyOnWriteArraySet) this.f93216b).remove(yVar);
    }

    @Override // gp1.v
    public void n0() {
        android.os.Bundle bundle;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "onAccountInitialized:%s", java.lang.Integer.valueOf(hashCode()));
        H(com.tencent.mm.plugin.ball.ui.q0.e());
        H(com.tencent.mm.plugin.ball.service.p4.f());
        this.f93223i = false;
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.ball.service.p4.f().getClass();
            java.util.List<com.tencent.mm.plugin.ball.model.BallInfo> list = com.tencent.mm.plugin.ball.service.p4.f93193d;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "restoreProcessNameWithFileType");
            if (list != null && list.size() != 0) {
                for (com.tencent.mm.plugin.ball.model.BallInfo ballInfo : list) {
                    if (ballInfo != null && ballInfo.f93046d == 4 && (bundle = ballInfo.G) != null) {
                        java.lang.String string = bundle.getString("processName");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "restore with process name: %s", string);
                            ballInfo.G.putString("processName", "");
                        }
                    }
                }
            }
            synchronized (this.f93215a) {
                if (!this.f93223i) {
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).clear();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "ballinfo clear1");
                    java.util.List i17 = qp1.w.i(list);
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).addAll(i17);
                    java.util.Vector vector = (java.util.Vector) i17;
                    if (!vector.isEmpty()) {
                        java.util.Iterator it = vector.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
                            fs.g.c(gp1.x.class, java.lang.Integer.valueOf(ballInfo2.f93046d), new com.tencent.mm.plugin.ball.service.z(this, ballInfo2));
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "ballinfo add1, size:" + ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).size());
                    if (Y()) {
                        ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).addAll(qp1.w.d(list));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "ballinfo add2, size:" + ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).size());
                    this.f93223i = true;
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.ball.service.h0(this), 100L);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "restoreDataFromStorage, account not ready");
        }
        E0(true);
    }

    @Override // gp1.v
    public void o(boolean z17) {
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        com.tencent.mm.plugin.ball.service.c0 c0Var = new com.tencent.mm.plugin.ball.service.c0(this);
        e17.getClass();
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            e17.d(z17, c0Var);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.m0(e17, z17, c0Var));
        }
    }

    @Override // gp1.v
    public void o0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null) {
            if (this.f93222h == null) {
                this.f93222h = new com.tencent.mm.plugin.ball.model.BallInfo(20, ballInfo.f93049g, null);
            }
            this.f93222h.o(ballInfo);
            this.f93222h.f93049g = ballInfo.f93049g;
            this.f93222h.f93046d = 20;
            this.f93222h.f93048f = ballInfo.f93048f;
            this.f93222h.H = 256;
            this.f93222h.f93045J = false;
            this.f93222h.I = false;
            this.f93222h.D = java.lang.System.currentTimeMillis();
            if (ballInfo.f93046d != 4 || this.f93222h.G == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f93222h.G.getString("processName"))) {
                return;
            }
            this.f93222h.G.putString("processName", "");
        }
    }

    @Override // gp1.v
    public void p() {
        com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
        synchronized (f17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallStorage", "clearFloatBallStorage");
            com.tencent.mm.sdk.platformtools.o4.M(f17.d()).clear();
        }
    }

    @Override // gp1.v
    public java.util.List p0() {
        return this.f93215a;
    }

    @Override // gp1.v
    public void q(boolean z17) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        com.tencent.mm.view.shadow.layout.WxShadowLinearLayout wxShadowLinearLayout;
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar == null || (floatBallView = nVar.f93318c) == null || !nVar.f93325j || (wxShadowLinearLayout = floatBallView.f93561x) == null) {
            return;
        }
        wxShadowLinearLayout.setAlpha(z17 ? 1.0f : 0.0f);
    }

    @Override // gp1.v
    public boolean q0() {
        java.util.List list = this.f93215a;
        if (qp1.w.a(list)) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
                if (!ballInfo.f93045J) {
                    if (!qp1.w.t(ballInfo)) {
                        int i17 = ballInfo.f93046d;
                        if (i17 == 17 || i17 == 19) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gp1.v
    public com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo r(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        qp1.c cVar;
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        qp1.c cVar2 = qp1.g0.f365723b;
        android.graphics.Point point = null;
        com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo ballSizeAndPosInfo = (kotlin.jvm.internal.o.b(cVar2 != null ? cVar2.f365690a : null, ballInfo) && (cVar = qp1.g0.f365723b) != null) ? cVar.f365691b : null;
        if (ballSizeAndPosInfo != null) {
            qp1.g0.f365723b = null;
            return ballSizeAndPosInfo;
        }
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar != null && (floatBallView = nVar.f93318c) != null) {
            point = floatBallView.getCurrentCustomBallSize();
        }
        return new com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo(point, G());
    }

    @Override // gp1.v
    public void r0() {
        com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
        e17.getClass();
        pm0.v.W(new com.tencent.mm.plugin.ball.ui.j0(e17, false));
    }

    @Override // gp1.v
    public void s(int i17) {
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar != null) {
            nVar.m(i17);
        }
    }

    @Override // gp1.v
    public void s0() {
        this.f93235u = null;
    }

    @Override // gp1.v
    public boolean t(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (!com.tencent.mm.plugin.ball.ui.q0.e().f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByPosition, no float ball");
            return false;
        }
        if (this.f93234t) {
            b1(this.f93231q, this.f93232r, z17, false, animatorListenerAdapter);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByPosition keyboard not show and ignore");
        return false;
    }

    @Override // gp1.v
    public com.tencent.mm.plugin.ball.model.BallInfo t0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        synchronized (this.f93215a) {
            if (!((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).contains(ballInfo)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "getBallInfo, existed:false");
                return null;
            }
            int indexOf = ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).indexOf(ballInfo);
            if (indexOf < 0 || indexOf >= ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).size()) {
                return null;
            }
            try {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) ((java.util.concurrent.CopyOnWriteArrayList) this.f93215a).get(indexOf);
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "getBallInfo, existed:true, responseBallInfo:%s", ballInfo2);
                return ballInfo2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallService", e17, "getBallInfo exception", new java.lang.Object[0]);
                return null;
            }
        }
    }

    @Override // gp1.v
    public void u(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        w(ballInfo, null);
    }

    @Override // gp1.v
    public void u0(boolean z17) {
        com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
        if (nVar != null) {
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            if (floatBallView != null) {
                floatBallView.setEnableClick(z17);
            }
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
            if (contentFloatBallView != null) {
                contentFloatBallView.setEnableClick(z17);
            }
        }
    }

    @Override // gp1.v
    public boolean v(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (!com.tencent.mm.plugin.ball.ui.q0.e().f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallVisibilityByPosition, no float ball");
            return false;
        }
        if (this.f93234t) {
            return a1(this.f93231q, this.f93232r, z17, false, false, animatorListenerAdapter);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "updateBallVisibilityByPosition keyboard not show and ignore");
        return false;
    }

    @Override // gp1.v
    public void v0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "markWechatInForeground, foreground:%s", java.lang.Boolean.valueOf(z17));
        this.f93229o = z17;
        if (this.f93226l) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "markWechatInForeground, has marked QB file view page, mark Wechat in foreground");
            com.tencent.mm.plugin.ball.ui.q0 e17 = com.tencent.mm.plugin.ball.ui.q0.e();
            e17.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.h0(e17, true));
        } else {
            com.tencent.mm.plugin.ball.ui.q0 e18 = com.tencent.mm.plugin.ball.ui.q0.e();
            e18.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.h0(e18, z17));
        }
        if (this.f93229o) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "resetReadyStatusBallInfo");
        this.f93222h = null;
    }

    @Override // gp1.v
    public void w(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, gp1.z zVar) {
        boolean z17 = false;
        if ((ballInfo.f93046d == 6 && ballInfo.M.f93085e == 11) && !qp1.q.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "isAskForPermissionAlready, no permission & no ask for");
            return;
        }
        int i17 = ballInfo.f93046d;
        if (i17 == 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: location");
        } else if (i17 == 17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: appbrand_voip");
        } else if (i17 == 18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: audio_of_video_background_play");
        } else if (i17 == 33) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: appbrand bluetooth");
        } else {
            z17 = true;
        }
        if (z17) {
            qp1.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a, ballInfo.f93046d, true, new com.tencent.mm.plugin.ball.service.k0(this, ballInfo, zVar), new com.tencent.mm.plugin.ball.service.l0(this, ballInfo));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.service.m0(this, ballInfo, zVar));
        }
    }

    @Override // gp1.v
    public void w0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        V0(ballInfo, true);
    }

    @Override // gp1.v
    public void x(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, gp1.u uVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "initCustomViewInMMProcess");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.service.f0(this, ballInfo, uVar));
    }

    @Override // gp1.v
    public void x0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "clickBallInfo, ballInfo:%s enterPage:%s", ballInfo, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = ballInfo.M;
        int i17 = ballReportInfo.f93090m;
        if (!(i17 == 1 || i17 == 2 || i17 == 3)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallReportLogic", "activeBallTypeReport unexpected opType:%d", java.lang.Integer.valueOf(i17));
            ballReportInfo.f93090m = 3;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.ball.service.h.c(ballInfo, ballReportInfo.f93090m, java.lang.System.currentTimeMillis() - ballInfo.B, 0L, 0L, 0L, 0L);
        if (z17) {
            V0(ballInfo, true);
        }
        com.tencent.mm.plugin.ball.service.i.c(ballInfo, this.f93215a, 1);
        int i18 = ballInfo.f93046d;
        if (i18 == 20) {
            i18 = ballInfo.f93047e;
        }
        android.util.SparseArray sparseArray = this.f93218d;
        java.util.Set set = (java.util.Set) sparseArray.get(i18);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).r0(ballInfo);
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        for (fs.q qVar : ((fs.c) fs.g.f(gp1.x.class)).all()) {
            if (qVar.hasKey(valueOf) && fs.g.d(fs.g.f266086c, qVar)) {
                ((gp1.x) ((fs.n) qVar.get())).r0(ballInfo);
            }
        }
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((gp1.z) it6.next()).r0(ballInfo);
            }
        }
        for (fs.q qVar2 : ((fs.c) fs.g.f(gp1.x.class)).all()) {
            if (qVar2.hasKey(0) && fs.g.d(fs.g.f266086c, qVar2)) {
                ((gp1.x) ((fs.n) qVar2.get())).r0(ballInfo);
            }
        }
    }

    @Override // gp1.v
    public void y(boolean z17) {
        K0(false);
        E0(z17);
    }

    @Override // gp1.v
    public java.util.Set y0() {
        return this.f93217c;
    }

    @Override // gp1.v
    public void z(long j17, gp1.t tVar) {
        int i17;
        if (this.f93222h == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallService", "addMessageBall readyMessageBallInfo is invalid and ignore");
            return;
        }
        if (!this.f93229o && !this.f93226l) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallService", "addMessageBall isWechatForeground: %b", java.lang.Boolean.valueOf(this.f93229o));
            if (tVar != null) {
                tVar.a(6);
            }
            this.f93222h = null;
            return;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93222h;
        java.lang.Boolean bool = qp1.w.f365755a;
        long j18 = ballInfo.D;
        boolean z17 = false;
        if (!((j18 == 0 || j17 == 0 || j17 - j18 > ((long) qp1.w.f365757c.intValue())) ? false : true)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.Integer num = qp1.w.f365757c;
            objArr[0] = java.lang.Integer.valueOf(num != null ? num.intValue() : -1);
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallService", "addMessageBall can not add message ball because of time over limit %s", objArr);
            if (tVar != null) {
                tVar.a(5);
            }
            this.f93222h = null;
            return;
        }
        if (this.f93221g == null || t0(this.f93221g) == null) {
            this.f93221g = new com.tencent.mm.plugin.ball.model.BallInfo(20, this.f93222h.f93049g, null);
            this.f93221g.o(this.f93222h);
            i17 = 1;
        } else {
            i17 = 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallService", "addMessageBall addResult: %s, and add: %s", java.lang.Integer.valueOf(i17), this.f93221g);
        if (i17 == 1) {
            this.f93222h.M.f93084d = 5;
        } else if (i17 == 2) {
            this.f93222h.M.f93084d = 6;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93222h;
        int i18 = ballInfo2.f93046d;
        if (i18 == 20) {
            i18 = ballInfo2.f93047e;
        }
        java.util.Set set = (java.util.Set) this.f93218d.get(i18);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((gp1.z) it.next()).Y0(ballInfo2)) {
                    break;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(gp1.x.class)).all()).iterator();
        while (it6.hasNext()) {
            fs.q qVar = (fs.q) it6.next();
            if (qVar.hasKey(valueOf) && fs.g.d(fs.g.f266086c, qVar) && ((gp1.x) ((fs.n) qVar.get())).Y0(ballInfo2)) {
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        if (i17 == 1) {
            this.f93221g.M.f93084d = 5;
            w(this.f93221g, null);
        } else if (i17 == 2) {
            c1(this.f93222h);
            if (this.f93221g != null && !this.f93221g.L) {
                this.f93221g.M.f93084d = 6;
                com.tencent.mm.plugin.ball.service.h.a(this.f93221g, this.f93215a);
            }
        }
        this.f93222h = null;
        if (tVar != null) {
            tVar.a(i17);
        }
    }

    @Override // gp1.v
    public boolean z0() {
        return this.f93224j;
    }
}
