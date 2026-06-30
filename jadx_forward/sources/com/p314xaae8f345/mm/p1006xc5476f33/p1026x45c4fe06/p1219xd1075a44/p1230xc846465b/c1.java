package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public final class c1 {
    public c1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(android.content.Context context) {
        float f17;
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            java.lang.Object systemService = context.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            if (context.getResources().getConfiguration().orientation != 2) {
                f17 = context.getResources().getConfiguration().screenWidthDp;
                f18 = displayMetrics.density;
            } else {
                if (com.p314xaae8f345.mm.ui.bk.u(context, false)) {
                    android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(context);
                    return java.lang.Math.min(h17.x, h17.y);
                }
                f17 = context.getResources().getConfiguration().screenHeightDp;
                f18 = displayMetrics.density;
            }
            return (int) (f17 * f18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandTask.AppBrandTaskItemDecorationHelper", e17, "getScreenWidth exception", new java.lang.Object[0]);
            return 0;
        }
    }

    public final float b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return (((a(context) - (i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) * 2)) - (i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) * 2)) - (i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) * 3)) / 4;
    }

    public final float c(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return (((a(context) - (i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) * 2)) - (i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) * 2)) - ((i17 - 1) * i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9))) / i17;
    }
}
