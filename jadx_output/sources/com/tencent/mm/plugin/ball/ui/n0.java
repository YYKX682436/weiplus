package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f93331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f93332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93333f;

    public n0(com.tencent.mm.plugin.ball.ui.q0 q0Var, boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f93333f = q0Var;
        this.f93331d = z17;
        this.f93332e = animatorListenerAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93333f.f93346d;
        if (nVar != null) {
            nVar.h(this.f93331d, this.f93332e);
        }
    }
}
