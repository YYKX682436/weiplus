package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class b extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.n f93278a;

    public b(com.tencent.mm.plugin.ball.ui.n nVar) {
        this.f93278a = nVar;
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (qp1.w.t(ballInfo)) {
            com.tencent.mm.plugin.ball.ui.n nVar = this.f93278a;
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
            if (contentFloatBallView != null) {
                contentFloatBallView.h();
            }
            nVar.n();
        }
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (qp1.w.t(ballInfo)) {
            com.tencent.mm.plugin.ball.ui.n nVar = this.f93278a;
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
            if (contentFloatBallView != null) {
                contentFloatBallView.h();
            }
            nVar.n();
        }
    }

    @Override // gp1.a0, gp1.z
    public void a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93278a;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
        if (contentFloatBallView != null) {
            contentFloatBallView.h();
        }
        nVar.n();
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93278a;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
        if (contentFloatBallView != null) {
            contentFloatBallView.h();
        }
        nVar.n();
    }
}
