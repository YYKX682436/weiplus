package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public final class c1 {
    public c1(kotlin.jvm.internal.i iVar) {
    }

    public final int a(android.content.Context context) {
        float f17;
        float f18;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            if (context.getResources().getConfiguration().orientation != 2) {
                f17 = context.getResources().getConfiguration().screenWidthDp;
                f18 = displayMetrics.density;
            } else {
                if (com.tencent.mm.ui.bk.u(context, false)) {
                    android.graphics.Point h17 = com.tencent.mm.ui.bk.h(context);
                    return java.lang.Math.min(h17.x, h17.y);
                }
                f17 = context.getResources().getConfiguration().screenHeightDp;
                f18 = displayMetrics.density;
            }
            return (int) (f17 * f18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandTask.AppBrandTaskItemDecorationHelper", e17, "getScreenWidth exception", new java.lang.Object[0]);
            return 0;
        }
    }

    public final float b(android.content.Context context) {
        kotlin.jvm.internal.o.d(context);
        return (((a(context) - (i65.a.h(context, com.tencent.mm.R.dimen.f479688cn) * 2)) - (i65.a.h(context, com.tencent.mm.R.dimen.f479704cz) * 2)) - (i65.a.h(context, com.tencent.mm.R.dimen.f479738dv) * 3)) / 4;
    }

    public final float c(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.d(context);
        return (((a(context) - (i65.a.h(context, com.tencent.mm.R.dimen.f479688cn) * 2)) - (i65.a.h(context, com.tencent.mm.R.dimen.f479704cz) * 2)) - ((i17 - 1) * i65.a.h(context, com.tencent.mm.R.dimen.f479672c9))) / i17;
    }
}
