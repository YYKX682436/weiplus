package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f90357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.a0 f90358e;

    public z(com.tencent.mm.plugin.appbrand.ui.a0 a0Var, android.graphics.Bitmap bitmap) {
        this.f90358e = a0Var;
        this.f90357d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.a0 a0Var = this.f90358e;
        a0Var.f89498d.R(this.f90357d);
        a0Var.f89498d.T(0);
        a0Var.f89498d.Y(0);
    }
}
