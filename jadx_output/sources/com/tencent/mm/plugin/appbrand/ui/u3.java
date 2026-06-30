package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f90250d;

    public u3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f90250d = appBrandDebugUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.Toast.makeText((android.content.Context) this.f90250d, (java.lang.CharSequence) ya.b.SUCCESS, 0).show();
    }
}
