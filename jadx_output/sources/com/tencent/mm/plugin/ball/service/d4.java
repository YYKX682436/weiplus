package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93144d;

    public d4(com.tencent.mm.plugin.ball.service.e4 e4Var, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93144d = ballInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.service.s.H0().c(this.f93144d);
    }
}
