package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f93211e;

    public q4(com.tencent.mm.plugin.ball.service.p4 p4Var, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        this.f93210d = ballInfo;
        this.f93211e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93210d;
        ballInfo.M.f93090m = 15;
        com.tencent.mm.plugin.ball.service.h.d(ballInfo, this.f93211e);
    }
}
