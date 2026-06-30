package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w6 f90276d;

    public v6(com.tencent.mm.plugin.appbrand.ui.w6 w6Var) {
        this.f90276d = w6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.w6 w6Var = this.f90276d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = w6Var.f90302b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        w6Var.a();
    }
}
