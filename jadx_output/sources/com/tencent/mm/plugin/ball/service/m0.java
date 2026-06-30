package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp1.z f93187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s f93188f;

    public m0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, gp1.z zVar) {
        this.f93188f = sVar;
        this.f93186d = ballInfo;
        this.f93187e = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.service.s.F0(this.f93188f, this.f93186d, this.f93187e);
    }
}
