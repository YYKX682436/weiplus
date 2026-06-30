package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87508d;

    public m0(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87508d = o0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87508d;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "transferTo, run pendingCancelableShowTask");
        com.tencent.mm.plugin.appbrand.utils.z3 z3Var = o0Var.f87541x;
        java.lang.String str = o0Var.f87518a;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.i(str, "transferTo, pendingCancelableShowTask is null");
            return;
        }
        z3Var.a();
        if (!(o0Var.f87541x.f90639g.get() <= 0) && (runnable = o0Var.f87541x.f90637e) != null) {
            com.tencent.mars.xlog.Log.i(str, "transferTo, run extraTask");
            runnable.run();
        }
        o0Var.f87541x = null;
    }
}
