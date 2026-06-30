package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93160d;

    public f4(com.tencent.mm.plugin.ball.service.g4 g4Var, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93160d = ballInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.service.s.H0().b(this.f93160d);
    }
}
