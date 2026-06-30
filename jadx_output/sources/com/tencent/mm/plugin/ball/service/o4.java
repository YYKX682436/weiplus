package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class o4 implements gp1.v {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.ball.service.o4 f93192a;

    @Override // gp1.v
    public void A0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.n2.class, new com.tencent.mm.plugin.ball.service.d1(this));
    }

    @Override // gp1.v
    public void B(boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), com.tencent.mm.plugin.ball.service.y2.class, new com.tencent.mm.plugin.ball.service.i1(this));
    }

    @Override // gp1.v
    public void B0(com.tencent.mm.plugin.ball.model.BallInfo info, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.ball.service.g gVar = com.tencent.mm.plugin.ball.service.g.f93161a;
        kotlin.jvm.internal.o.g(info, "info");
        gVar.c(bitmap, gVar.b(info));
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, info, com.tencent.mm.plugin.ball.service.h4.class, new com.tencent.mm.plugin.ball.service.u0(this));
    }

    @Override // gp1.v
    public void C(android.view.View view) {
    }

    @Override // gp1.v
    public void C0() {
        com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.u3.class);
    }

    @Override // gp1.v
    public android.graphics.Point D(int i17, int i18, int i19, android.graphics.Point point) {
        return (android.graphics.Point) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$GetFloatBallPositionForAnimationParcel(i17, i18, i19, point), com.tencent.mm.plugin.ball.service.w2.class);
    }

    @Override // gp1.v
    public void D0(gp1.d0 d0Var) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.q2.class, new com.tencent.mm.plugin.ball.service.r0(this, d0Var));
    }

    @Override // gp1.v
    public void E(long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "markEnterChattingUI not implemented in non-MM process");
    }

    @Override // gp1.v
    public void E0(boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), com.tencent.mm.plugin.ball.service.w3.class, new com.tencent.mm.plugin.ball.service.r1(this));
    }

    @Override // gp1.v
    public void F(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "switchVoipVoice not implemented in non-MM process");
    }

    @Override // gp1.v
    public android.graphics.Point G() {
        return (android.graphics.Point) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.s2.class);
    }

    @Override // gp1.v
    public void H(gp1.y yVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "addFloatBallInfoChangedListener not implemented in non-MM process");
    }

    @Override // gp1.v
    public void I(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "showOtherContentView not implemented in non-MM process");
    }

    @Override // gp1.v
    public long J() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "getEnterChattingUITimestamp not implemented in non-MM process");
        return 0L;
    }

    @Override // gp1.v
    public int K() {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.t2.class);
        if (iPCInteger != null) {
            return iPCInteger.f68404d;
        }
        gp1.j[] jVarArr = gp1.j.f274185d;
        return -1;
    }

    @Override // gp1.v
    public void L(int i17, gp1.z zVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "removeFloatBallInfoEventListener not implemented in non-MM process");
    }

    @Override // gp1.v
    public void M(int i17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(i17), com.tencent.mm.plugin.ball.service.v3.class, new com.tencent.mm.plugin.ball.service.b1(this));
    }

    @Override // gp1.v
    public void N(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$UpdateBallVisibilityParcel(z17, ballInfo), com.tencent.mm.plugin.ball.service.k4.class, new com.tencent.mm.plugin.ball.service.n1(this));
    }

    @Override // gp1.v
    public boolean O() {
        return qp1.u.f365743a.a();
    }

    @Override // gp1.v
    public android.graphics.Point P() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "getCurrentCustomBallSize not implemented in non-MM process");
        return null;
    }

    @Override // gp1.v
    public void Q(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "markNeedProcessFloatViewLayoutParamsFlag not implemented in non-MM process");
    }

    @Override // gp1.v
    public void R(boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), com.tencent.mm.plugin.ball.service.k3.class, new com.tencent.mm.plugin.ball.service.a2(this));
    }

    @Override // gp1.v
    public void S() {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.i2.class, new com.tencent.mm.plugin.ball.service.z0(this));
    }

    @Override // gp1.v
    public android.graphics.Point T(int i17, android.graphics.Point point) {
        return (android.graphics.Point) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$GetFloatBallPositionForAnimationParcel(-1, i17, 0, point), com.tencent.mm.plugin.ball.service.w2.class);
    }

    @Override // gp1.v
    public void U(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.s3.class, new com.tencent.mm.plugin.ball.service.w0(this));
    }

    @Override // gp1.v
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.i4.class, new com.tencent.mm.plugin.ball.service.v0(this));
    }

    @Override // gp1.v
    public void W(float f17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "updateFloatBallViewAlpha not implemented in non-MM process");
    }

    @Override // gp1.v
    public void X(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "markForceHideAllFloatBall not implemented in non-MM process");
    }

    @Override // gp1.v
    public boolean Y() {
        qp1.u uVar = qp1.u.f365743a;
        return com.tencent.mm.sdk.platformtools.x2.n() ? ((java.lang.Boolean) ((jz5.n) qp1.u.f365744b).getValue()).booleanValue() : ((java.lang.Boolean) ((jz5.n) qp1.u.f365745c).getValue()).booleanValue();
    }

    @Override // gp1.v
    public void Z() {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.q3.class, new com.tencent.mm.plugin.ball.service.q0(this));
    }

    @Override // gp1.v
    public void a() {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.p3.class, new com.tencent.mm.plugin.ball.service.z1(this));
    }

    @Override // gp1.v
    public void a0(int i17, gp1.z zVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "addFloatBallInfoEventListener not implemented in non-MM process");
    }

    @Override // gp1.v
    public void b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.g4.class, new com.tencent.mm.plugin.ball.service.o1(this));
    }

    @Override // gp1.v
    public void b0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallServiceProxy", "updateCustomViewInMMProcess");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.l4.class, new com.tencent.mm.plugin.ball.service.u1(this));
    }

    @Override // gp1.v
    public void c(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.e4.class, new com.tencent.mm.plugin.ball.service.p1(this));
    }

    @Override // gp1.v
    public boolean c0() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "hasCustomViewShowing not implemented in non-MM process");
        return false;
    }

    @Override // gp1.v
    public void d(boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), com.tencent.mm.plugin.ball.service.z2.class, new com.tencent.mm.plugin.ball.service.v1(this));
    }

    @Override // gp1.v
    public android.graphics.Point d0() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "getFloatBallPosition not implemented in non-MM process");
        return null;
    }

    @Override // gp1.v
    public void e(int i17, qp1.i0 i0Var) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "addFloatBallPermissionCheckCallback not implemented in non-MM process");
    }

    @Override // gp1.v
    public void e0() {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.o2.class, new com.tencent.mm.plugin.ball.service.o0(this));
    }

    @Override // gp1.v
    public void f(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, android.os.ResultReceiver resultReceiver) {
        java.lang.Boolean bool = qp1.w.f365755a;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        android.os.ResultReceiver resultReceiver2 = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$FloatBallInfoEventReceiverParcel(ballInfo, resultReceiver2), com.tencent.mm.plugin.ball.service.r3.class, new com.tencent.mm.plugin.ball.service.j1(this));
    }

    @Override // gp1.v
    public boolean f0() {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.f3.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }

    @Override // gp1.v
    public void g(int i17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(i17), com.tencent.mm.plugin.ball.service.y3.class, new com.tencent.mm.plugin.ball.service.s1(this));
    }

    @Override // gp1.v
    public void g0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.x2.class, new com.tencent.mm.plugin.ball.service.e1(this));
    }

    @Override // gp1.v
    public void h(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            return;
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.d2.class, new com.tencent.mm.plugin.ball.service.l1(this));
    }

    @Override // gp1.v
    public void h0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.j2.class, new com.tencent.mm.plugin.ball.service.c1(this));
    }

    @Override // gp1.v
    public void i(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.m2.class, new com.tencent.mm.plugin.ball.service.h1(this));
    }

    @Override // gp1.v
    public void i0(int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "addFloatBallViewLayoutParamsFlag not implemented in non-MM process");
    }

    @Override // gp1.v
    public boolean j() {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.i3.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }

    @Override // gp1.v
    public void j0(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "setAnimatingPageAnimation not implemented in non-MM process");
    }

    @Override // gp1.v
    public void k(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, float f17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$SetFloatBallAlphaParcel(f17, ballInfo), com.tencent.mm.plugin.ball.service.b4.class, new com.tencent.mm.plugin.ball.service.m1(this));
    }

    @Override // gp1.v
    public void k0() {
    }

    @Override // gp1.v
    public void l(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.t3.class, new com.tencent.mm.plugin.ball.service.k1(this));
    }

    @Override // gp1.v
    public boolean l0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.h2.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }

    @Override // gp1.v
    public void m(int i17, int i18, boolean z17, long j17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$IPCKeyBoardChangedInfo(i17, i18, z17, j17), com.tencent.mm.plugin.ball.service.m4.class, new com.tencent.mm.plugin.ball.service.p0(this));
    }

    @Override // gp1.v
    public void m0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.l2.class, new com.tencent.mm.plugin.ball.service.g1(this));
    }

    @Override // gp1.v
    public void n(gp1.y yVar) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "removeFloatBallInfoChangedListener not implemented in non-MM process");
    }

    @Override // gp1.v
    public void n0() {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.o3.class, new com.tencent.mm.plugin.ball.service.y1(this));
    }

    @Override // gp1.v
    public void o(boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), com.tencent.mm.plugin.ball.service.a3.class, new com.tencent.mm.plugin.ball.service.x1(this));
    }

    @Override // gp1.v
    public void o0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.j3.class, new com.tencent.mm.plugin.ball.service.x0(this));
    }

    @Override // gp1.v
    public void p() {
    }

    @Override // gp1.v
    public java.util.List p0() {
        return null;
    }

    @Override // gp1.v
    public void q(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "showCustomBallView not implemented in non-MM process");
    }

    @Override // gp1.v
    public boolean q0() {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.n3.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }

    @Override // gp1.v
    public com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo r(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        return (com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.u2.class);
    }

    @Override // gp1.v
    public void r0() {
    }

    @Override // gp1.v
    public void s(int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "removeFloatBallViewLayoutParamsFlag not implemented in non-MM process");
    }

    @Override // gp1.v
    public void s0() {
    }

    @Override // gp1.v
    public boolean t(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "updateContentBallVisibilityByPosition not implemented in non-MM process");
        return false;
    }

    @Override // gp1.v
    public com.tencent.mm.plugin.ball.model.BallInfo t0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        return (com.tencent.mm.plugin.ball.model.BallInfo) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.r2.class);
    }

    @Override // gp1.v
    public void u(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.c2.class, new com.tencent.mm.plugin.ball.service.s0(this));
    }

    @Override // gp1.v
    public void u0(boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), com.tencent.mm.plugin.ball.service.z3.class, new com.tencent.mm.plugin.ball.service.q1(this));
    }

    @Override // gp1.v
    public boolean v(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "updateBallVisibilityByPosition not implemented in non-MM process");
        return false;
    }

    @Override // gp1.v
    public void v0(boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), com.tencent.mm.plugin.ball.service.l3.class, new com.tencent.mm.plugin.ball.service.y0(this));
    }

    @Override // gp1.v
    public void w(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, gp1.z zVar) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.c2.class, new com.tencent.mm.plugin.ball.service.t0(this, zVar, ballInfo));
    }

    @Override // gp1.v
    public void w0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.k2.class, new com.tencent.mm.plugin.ball.service.f1(this));
    }

    @Override // gp1.v
    public void x(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, gp1.u uVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallServiceProxy", "initCustomViewInMMProcess");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, ballInfo, com.tencent.mm.plugin.ball.service.d3.class, new com.tencent.mm.plugin.ball.service.t1(this, uVar));
    }

    @Override // gp1.v
    public void x0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
    }

    @Override // gp1.v
    public void y(boolean z17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17), com.tencent.mm.plugin.ball.service.x3.class, new com.tencent.mm.plugin.ball.service.w1(this));
    }

    @Override // gp1.v
    public java.util.Set y0() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallServiceProxy", "getFloatBallViewListeners not implemented in non-MM process");
        return null;
    }

    @Override // gp1.v
    public void z(long j17, gp1.t tVar) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCLong(j17), com.tencent.mm.plugin.ball.service.f2.class, new com.tencent.mm.plugin.ball.service.a1(this, tVar));
    }

    @Override // gp1.v
    public boolean z0() {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.ball.service.h3.class);
        return iPCBoolean != null && iPCBoolean.f68400d;
    }
}
