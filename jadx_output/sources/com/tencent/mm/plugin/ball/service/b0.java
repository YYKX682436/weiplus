package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class b0 implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93125a;

    public b0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93125a = ballInfo;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((gp1.x) nVar).V0(this.f93125a);
        return false;
    }
}
