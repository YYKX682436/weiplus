package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87501d;

    public j0(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87501d = o0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87501d;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "transferFrom, dismissTask run");
        o0Var.f87540w = null;
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = o0Var.f87523f;
        if (appBrandPipContainerView == null || (view = o0Var.f87527j) == null || o0Var.f87529l == null) {
            return;
        }
        appBrandPipContainerView.f91005z.removeView(view);
        o0Var.f87529l.b(o0Var.f87527j);
        o0Var.f87523f.setVisibility(4);
        o0Var.f87527j = null;
        o0Var.f87528k = null;
    }
}
