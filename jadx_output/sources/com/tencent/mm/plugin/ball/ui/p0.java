package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93342d;

    public p0(com.tencent.mm.plugin.ball.ui.q0 q0Var) {
        this.f93342d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.q0 q0Var = this.f93342d;
        com.tencent.mm.plugin.ball.ui.n nVar = q0Var.f93346d;
        if (nVar != null) {
            nVar.f();
            q0Var.f93346d = null;
        }
    }
}
