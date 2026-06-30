package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.h9 f89736d;

    public g9(com.tencent.mm.plugin.appbrand.ui.h9 h9Var) {
        this.f89736d = h9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, hide ends && remove splash");
        com.tencent.mm.plugin.appbrand.ui.h9 h9Var = this.f89736d;
        h9Var.f89757f.f89809d.setVisibility(8);
        ((android.view.ViewGroup) h9Var.f89756e).removeView(h9Var.f89757f.f89809d);
        com.tencent.mm.plugin.appbrand.ui.c9.K(h9Var.f89757f.f89809d);
    }
}
