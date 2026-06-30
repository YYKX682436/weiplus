package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public abstract class gk {
    public static final float a(float f17) {
        return (f17 * j65.f.g()) / 400;
    }

    public static final float b() {
        if (com.p314xaae8f345.mm.ui.bk.Q()) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            return i65.a.b(context, java.lang.Math.min(context.getResources().getConfiguration().screenWidthDp, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration().screenHeightDp));
        }
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        return com.p314xaae8f345.mm.ui.bk.y() ? com.p314xaae8f345.mm.ui.bk.g() : java.lang.Math.min(h17.x, h17.y);
    }

    public static final double c() {
        return b() * 0.125d;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0040 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(android.content.Context r2) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            boolean r0 = r2 instanceof android.app.Activity
            r1 = 1140457472(0x43fa0000, float:500.0)
            if (r0 == 0) goto L21
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = b()
            float r0 = r0 / r2
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L40
            goto L3e
        L21:
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenWidthDp
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.screenHeightDp
            int r2 = java.lang.Math.min(r0, r2)
            float r2 = (float) r2
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 < 0) goto L40
        L3e:
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.gk.d(android.content.Context):boolean");
    }
}
