package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.c7 f89504d;

    public a7(com.tencent.mm.plugin.appbrand.ui.c7 c7Var) {
        this.f89504d = c7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.d7 d7Var = this.f89504d.f89626e;
        int i17 = com.tencent.mm.plugin.appbrand.ui.d7.A;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) d7Var.findViewById(com.tencent.mm.R.id.lbi);
        if (progressBar == null || !(progressBar.getIndeterminateDrawable() instanceof android.graphics.drawable.Animatable)) {
            return;
        }
        ((android.graphics.drawable.Animatable) progressBar.getIndeterminateDrawable()).stop();
    }
}
