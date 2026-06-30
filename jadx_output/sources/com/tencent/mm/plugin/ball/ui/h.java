package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class h extends gp1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.n f93296a;

    public h(com.tencent.mm.plugin.ball.ui.n nVar) {
        this.f93296a = nVar;
    }

    @Override // gp1.k
    public android.graphics.Point a(int i17, int i18) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93296a.f93320e;
        return contentFloatBallView != null ? contentFloatBallView.j(i17, i18) : new android.graphics.Point(i17, i18);
    }

    @Override // gp1.k
    public android.graphics.Point b() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93296a.f93320e;
        if (contentFloatBallView != null) {
            return contentFloatBallView.getCurrentBallSizeForConflict();
        }
        return null;
    }

    @Override // gp1.k
    public android.graphics.Point c() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93296a.f93320e;
        if (contentFloatBallView != null) {
            return contentFloatBallView.getCurrentBallPosForConflict();
        }
        return null;
    }

    @Override // gp1.k
    public android.graphics.Point d(int i17, int i18) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93296a.f93320e;
        return contentFloatBallView != null ? contentFloatBallView.k(i17, i18) : new android.graphics.Point(i17, i18);
    }

    @Override // gp1.k
    public java.lang.Boolean e() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93296a.f93320e;
        if (contentFloatBallView != null) {
            return java.lang.Boolean.valueOf(contentFloatBallView.A);
        }
        return null;
    }

    @Override // gp1.k
    public java.lang.Integer f() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93296a.f93320e;
        if (contentFloatBallView != null) {
            return java.lang.Integer.valueOf(contentFloatBallView.getF93438z());
        }
        return null;
    }
}
