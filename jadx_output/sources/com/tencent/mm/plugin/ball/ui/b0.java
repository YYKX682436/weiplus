package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes3.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.d0 f93279d;

    public b0(com.tencent.mm.plugin.ball.ui.d0 d0Var) {
        this.f93279d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.d0 d0Var = this.f93279d;
        if (d0Var.f93285e.getParent() != null) {
            ((android.view.ViewGroup) d0Var.f93285e.getParent()).removeView(d0Var.f93285e);
        }
    }
}
