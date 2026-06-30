package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.x1 f86984d;

    public p1(com.tencent.mm.plugin.appbrand.page.x1 x1Var) {
        this.f86984d = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.x1 x1Var = this.f86984d;
        android.view.ViewParent parent = x1Var.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(x1Var);
        }
    }
}
