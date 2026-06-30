package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class x implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93263a;

    public x(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93263a = ballInfo;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((gp1.x) nVar).w(this.f93263a);
        return false;
    }
}
