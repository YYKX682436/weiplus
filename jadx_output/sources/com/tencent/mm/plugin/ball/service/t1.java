package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public class t1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1.u f93253d;

    public t1(com.tencent.mm.plugin.ball.service.o4 o4Var, gp1.u uVar) {
        this.f93253d = uVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) obj;
        gp1.u uVar = this.f93253d;
        if (uVar != null) {
            uVar.a(ballInfo);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallServiceProxy", "onClickCover callback");
        }
    }
}
