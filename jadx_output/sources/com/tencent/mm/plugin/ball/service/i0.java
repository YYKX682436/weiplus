package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f93170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s f93171f;

    public i0(com.tencent.mm.plugin.ball.service.s sVar, int i17, int i18) {
        this.f93171f = sVar;
        this.f93169d = i17;
        this.f93170e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.service.s sVar = this.f93171f;
        sVar.a1(this.f93169d, this.f93170e, true, true, sVar.f93231q != 0, null);
    }
}
