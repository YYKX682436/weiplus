package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes3.dex */
public final class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI f89920d;

    public p7(com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI appBrandStorageUsageUI) {
        this.f89920d = appBrandStorageUsageUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f89920d.d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
