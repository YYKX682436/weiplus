package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class u implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93255a;

    public u(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93255a = ballInfo;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((gp1.x) nVar).G0(this.f93255a);
        return false;
    }
}
