package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class w implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93261a;

    public w(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93261a = ballInfo;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((gp1.x) nVar).V(this.f93261a);
        return false;
    }
}
