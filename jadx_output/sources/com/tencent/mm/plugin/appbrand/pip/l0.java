package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87507d;

    public l0(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87507d = o0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87507d;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "transferTo, hideTask run");
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = o0Var.f87523f;
        if (appBrandPipContainerView == null) {
            return;
        }
        appBrandPipContainerView.setVisibility(4);
    }
}
