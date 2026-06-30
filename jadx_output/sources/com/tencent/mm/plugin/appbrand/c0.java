package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.c0 f77024a = new com.tencent.mm.plugin.appbrand.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f77025b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseArray f77026c = new android.util.SparseArray();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        kotlin.jvm.internal.o.g(n7Var, "<this>");
        if (n7Var.getRuntime() == null || n7Var.getRuntime().L0() || n7Var.getRuntime().q2()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 runtime = n7Var.getRuntime();
        oe1.b2.a(runtime != null ? runtime.f74803n : null);
        if (!n7Var.j2() || n7Var.getRuntime().u0().r() == k91.z3.TRANSPARENT || (n7Var.getRuntime().f74811t instanceof com.tencent.mm.plugin.appbrand.ui.uc)) {
            return;
        }
        if (n7Var.getRuntime().e3()) {
            com.tencent.mm.plugin.appbrand.ui.vc vcVar = n7Var.getRuntime().f74811t;
            com.tencent.mm.plugin.appbrand.ui.f6 f6Var = vcVar instanceof com.tencent.mm.plugin.appbrand.ui.f6 ? (com.tencent.mm.plugin.appbrand.ui.f6) vcVar : null;
            if (f6Var != null) {
                boolean N = f6Var.N();
                java.lang.String str = n7Var.getRuntime().f74803n;
                nf.y yVar = nf.x.f336616b;
                if (N != (yVar != null ? yVar.i(str) : false)) {
                    return;
                }
            }
        } else {
            if ((!n7Var.r1().f5746w || (n7Var.w1() instanceof com.tencent.mm.plugin.appbrand.page.y1)) == false) {
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(n7Var.getAppId(), true);
                if ((b17 != null ? b17.E : null) != com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated) {
                    return;
                }
            }
        }
        android.util.SparseArray sparseArray = f77026c;
        if (((java.lang.Runnable) sparseArray.get(n7Var.hashCode())) != null) {
            return;
        }
        java.lang.Boolean[] boolArr = {java.lang.Boolean.FALSE};
        android.view.View[] viewArr = new android.view.View[1];
        java.lang.Long[] lArr = {0L};
        sparseArray.put(n7Var.hashCode(), new com.tencent.mm.plugin.appbrand.z(boolArr, lArr, n7Var, viewArr));
        n7Var.P(new com.tencent.mm.plugin.appbrand.a0(n7Var));
        android.view.View contentView = n7Var.getContentView();
        if (contentView != null) {
            contentView.post(new com.tencent.mm.plugin.appbrand.b0(boolArr, n7Var, viewArr, lArr));
        }
    }

    public static final void c(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        kotlin.jvm.internal.o.g(n7Var, "<this>");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntryPageFastLoadHelper", "tryHideEntryPage " + n7Var);
        android.util.SparseArray sparseArray = f77026c;
        java.lang.Runnable runnable = (java.lang.Runnable) sparseArray.get(n7Var.hashCode());
        if (runnable != null) {
            runnable.run();
        }
        sparseArray.put(n7Var.hashCode(), null);
    }

    public final android.widget.ProgressBar a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(new com.tencent.mm.ui.xb(context, com.tencent.mm.R.style.f494787w9));
        progressBar.setIndeterminateDrawable(b3.l.getDrawable(progressBar.getContext(), com.tencent.mm.R.drawable.avi));
        return progressBar;
    }
}
