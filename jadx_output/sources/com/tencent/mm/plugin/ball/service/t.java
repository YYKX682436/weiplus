package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class t implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93250a;

    public t(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93250a = ballInfo;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((gp1.x) nVar).G0(this.f93250a);
        return false;
    }
}
