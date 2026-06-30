package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.y1 f86391d;

    public a2(com.tencent.mm.plugin.appbrand.page.y1 y1Var) {
        this.f86391d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        com.tencent.mm.plugin.appbrand.page.y1 y1Var = this.f86391d;
        if (n3.x0.b(y1Var) && (y1Var.f87271y0.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && ((android.view.ViewGroup.MarginLayoutParams) y1Var.f87271y0.getLayoutParams()).topMargin != y1Var.f87271y0.getTop()) {
            y1Var.f87271y0.requestLayout();
        }
    }
}
