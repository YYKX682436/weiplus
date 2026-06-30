package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f89613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.d0 f89614e;

    public c0(com.tencent.mm.plugin.appbrand.ui.d0 d0Var, android.graphics.Bitmap bitmap) {
        this.f89614e = d0Var;
        this.f89613d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.d0 d0Var = this.f89614e;
        d0Var.f89654d.R(this.f89613d);
        d0Var.f89654d.T(0);
        d0Var.f89654d.Y(0);
    }
}
