package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87110d;

    public t2(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        this.f87110d = w2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87110d;
        w2Var.setLayoutParams(layoutParams);
        w2Var.setScrimColor(0);
        w2Var.H = w2Var.p();
        w2Var.addView(w2Var.getContentView());
        w2Var.setContentView(w2Var.getContentView());
        w2Var.c(w2Var.T);
    }
}
