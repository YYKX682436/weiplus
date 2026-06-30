package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.k0 f93173d;

    public j0(com.tencent.mm.plugin.ball.service.k0 k0Var) {
        this.f93173d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.service.k0 k0Var = this.f93173d;
        com.tencent.mm.plugin.ball.service.s.F0(k0Var.f93176c, k0Var.f93174a, k0Var.f93175b);
    }
}
