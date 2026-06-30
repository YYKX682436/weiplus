package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class z7 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUI f90368d;

    public z7(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI) {
        this.f90368d = appBrandUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "onPause: isScreenOn = [%b]", bool);
        if (bool.booleanValue()) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI.g7(this.f90368d);
        return null;
    }
}
