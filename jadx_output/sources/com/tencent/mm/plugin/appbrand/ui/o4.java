package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f89897d;

    public o4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var) {
        this.f89897d = w4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.w4 w4Var = this.f89897d;
        if (w4Var.Q) {
            return;
        }
        w4Var.T = true;
        w4Var.N.setVisibility(0);
        w4Var.H.f();
    }
}
