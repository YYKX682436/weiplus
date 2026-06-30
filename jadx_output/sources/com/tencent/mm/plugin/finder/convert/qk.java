package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f104399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104401f;

    public qk(android.view.ViewGroup viewGroup, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f104399d = viewGroup;
        this.f104400e = h0Var;
        this.f104401f = h0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f104400e;
        this.f104399d.removeView((android.view.View) h0Var.f310123d);
        kotlin.jvm.internal.h0 h0Var2 = this.f104401f;
        ((android.widget.FrameLayout) h0Var2.f310123d).getLayoutParams().height = -2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        ((android.widget.FrameLayout) h0Var2.f310123d).addView((android.view.View) h0Var.f310123d, layoutParams);
    }
}
