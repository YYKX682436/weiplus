package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class k extends gp1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.n f93305a;

    public k(com.tencent.mm.plugin.ball.ui.n nVar) {
        this.f93305a = nVar;
    }

    @Override // gp1.k
    public android.graphics.Point a(int i17, int i18) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93305a.f93318c;
        if (floatBallView == null) {
            return new android.graphics.Point(i17, i18);
        }
        if (floatBallView.L != null && floatBallView.Y1 && (floatBallView.W() || floatBallView.f93539l2 || floatBallView.Z1)) {
            i18 = floatBallView.L.getCollapseViewPosY();
        }
        return new android.graphics.Point(i17 + qp1.e0.a(qp1.c0.f365707p), i18 + qp1.e0.a(qp1.c0.f365704m));
    }

    @Override // gp1.k
    public android.graphics.Point b() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93305a.f93318c;
        if (floatBallView != null) {
            return floatBallView.getFloatBallCurrentSizeExceptShadow();
        }
        return null;
    }

    @Override // gp1.k
    public android.graphics.Point c() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93305a.f93318c;
        if (floatBallView != null) {
            return floatBallView.getFloatBallCurrentPositionExceptShadow();
        }
        return null;
    }

    @Override // gp1.k
    public android.graphics.Point d(int i17, int i18) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93305a.f93318c;
        return floatBallView != null ? floatBallView.v(i17, i18) : new android.graphics.Point(i17, i18);
    }

    @Override // gp1.k
    public java.lang.Boolean e() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93305a.f93318c;
        if (floatBallView != null) {
            return java.lang.Boolean.valueOf(floatBallView.f93563x1);
        }
        return null;
    }

    @Override // gp1.k
    public java.lang.Integer f() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93305a.f93318c;
        if (floatBallView != null) {
            return java.lang.Integer.valueOf(floatBallView.getCurrentOrientation());
        }
        return null;
    }
}
