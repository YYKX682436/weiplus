package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes8.dex */
public abstract class y {
    public static float a(android.content.Context context) {
        return i65.a.f(context, com.tencent.mm.R.dimen.f480042me) * c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r7, float r8) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 2
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics     // Catch: java.lang.Exception -> L51
            r2.<init>()     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = "window"
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Exception -> L51
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch: java.lang.Exception -> L51
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L51
            r3.getMetrics(r2)     // Catch: java.lang.Exception -> L51
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Exception -> L51
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Exception -> L51
            int r3 = r3.orientation     // Catch: java.lang.Exception -> L51
            if (r3 != r1) goto L41
            boolean r3 = com.tencent.mm.ui.bk.u(r7, r0)     // Catch: java.lang.Exception -> L51
            if (r3 == 0) goto L33
            android.graphics.Point r2 = com.tencent.mm.ui.bk.h(r7)     // Catch: java.lang.Exception -> L51
            int r2 = r2.x     // Catch: java.lang.Exception -> L51
            goto L5c
        L33:
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Exception -> L51
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Exception -> L51
            int r3 = r3.screenHeightDp     // Catch: java.lang.Exception -> L51
            float r3 = (float) r3     // Catch: java.lang.Exception -> L51
            float r2 = r2.density     // Catch: java.lang.Exception -> L51
            goto L4e
        L41:
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Exception -> L51
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Exception -> L51
            int r3 = r3.screenWidthDp     // Catch: java.lang.Exception -> L51
            float r3 = (float) r3     // Catch: java.lang.Exception -> L51
            float r2 = r2.density     // Catch: java.lang.Exception -> L51
        L4e:
            float r3 = r3 * r2
            int r2 = (int) r3
            goto L5c
        L51:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r4 = "MicroMsg.AppBrandRecentSizeHelper"
            java.lang.String r5 = "getScreenWidth exception"
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r2, r5, r3)
            r2 = r0
        L5c:
            r3 = 2131166357(0x7f070495, float:1.7946957E38)
            int r3 = i65.a.f(r7, r3)
            float r3 = (float) r3
            float r4 = c(r7)
            float r3 = r3 * r4
            int r3 = (int) r3
            float r4 = com.tencent.mm.plugin.appbrand.widget.recent.w.f92074a
            android.content.res.Resources r4 = r7.getResources()
            r5 = 2131166358(0x7f070496, float:1.794696E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            float r5 = c(r7)
            i65.a.x(r7)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto Lbd
            float r6 = i65.a.y(r7)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 != 0) goto L8d
            goto Lbd
        L8d:
            float r4 = i65.a.w(r7)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 == 0) goto Lb2
            float r4 = i65.a.z(r7)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 == 0) goto Lb2
            float r4 = i65.a.s(r7)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto La6
            goto Lb2
        La6:
            android.content.res.Resources r7 = r7.getResources()
            r4 = 2131165796(0x7f070264, float:1.794582E38)
            int r4 = r7.getDimensionPixelOffset(r4)
            goto Lbd
        Lb2:
            android.content.res.Resources r7 = r7.getResources()
            r4 = 2131165757(0x7f07023d, float:1.794574E38)
            int r4 = r7.getDimensionPixelOffset(r4)
        Lbd:
            int r7 = r4 * 2
            int r7 = r2 - r7
            int r8 = (int) r8
            int r3 = r3 * r8
            int r7 = r7 - r3
            int r5 = r8 + (-1)
            int r5 = r5 * r1
            int r7 = r7 / r5
            if (r7 <= r4) goto Lce
            int r2 = r2 - r3
            int r8 = r8 * r1
            int r7 = r2 / r8
        Lce:
            if (r7 >= 0) goto Ld1
            goto Ld2
        Ld1:
            r0 = r7
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.recent.y.b(android.content.Context, float):int");
    }

    public static float c(android.content.Context context) {
        float q17 = i65.a.q(context);
        return (q17 == i65.a.t(context) || q17 == i65.a.u(context) || q17 == i65.a.v(context)) ? i65.a.s(context) : q17;
    }
}
