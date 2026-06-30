package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public class c3 implements gp1.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f93130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93131b;

    public c3(com.tencent.mm.plugin.ball.service.d3 d3Var, com.tencent.mm.ipcinvoker.r rVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93130a = rVar;
        this.f93131b = ballInfo;
    }

    @Override // gp1.u
    public void a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93130a.a(this.f93131b);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallServiceProxy", "onClickCover callback in task");
    }
}
