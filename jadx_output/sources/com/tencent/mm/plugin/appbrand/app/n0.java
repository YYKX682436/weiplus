package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f75192a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseIntArray f75193b;

    public n0(com.tencent.mm.plugin.appbrand.app.l0 l0Var) {
        this.f75192a = com.tencent.mm.plugin.appbrand.ui.t7.h() && bm5.f1.a().equals(com.tencent.mm.plugin.appbrand.task.z0.f89222n);
        this.f75193b = new android.util.SparseIntArray();
    }

    public static void a(com.tencent.mm.plugin.appbrand.app.n0 n0Var, android.app.Activity activity) {
        if (activity == null) {
            n0Var.getClass();
            return;
        }
        android.util.SparseIntArray sparseIntArray = n0Var.f75193b;
        sparseIntArray.delete(activity.hashCode());
        if (sparseIntArray.size() <= 0) {
            com.tencent.mm.plugin.appbrand.app.n0 n0Var2 = com.tencent.mm.plugin.appbrand.app.o0.f75203a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "setSkipMiscPreload %b", java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.appbrand.app.o0.f75204b = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "alive activity count %d", java.lang.Integer.valueOf(n0Var.f75193b.size()));
    }
}
