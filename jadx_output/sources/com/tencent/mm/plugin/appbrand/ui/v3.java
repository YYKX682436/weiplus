package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f90270d;

    public v3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f90270d = appBrandDebugUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.Toast.makeText((android.content.Context) this.f90270d, (java.lang.CharSequence) "fail", 0).show();
    }
}
