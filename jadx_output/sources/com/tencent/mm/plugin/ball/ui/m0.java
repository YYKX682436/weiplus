package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f93313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f93314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.q0 f93315f;

    public m0(com.tencent.mm.plugin.ball.ui.q0 q0Var, boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f93315f = q0Var;
        this.f93313d = z17;
        this.f93314e = animatorListenerAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93315f.d(this.f93313d, this.f93314e);
    }
}
