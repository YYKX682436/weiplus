package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class MMKViewUtil {
    private static final java.lang.String TAG = "MMKViewUtil";
    private static float density = -1.0f;
    public static float[] fontLevel = {0.8f, 1.0f, 1.1f, 1.12f, 1.125f, 1.4f};

    public static int argbColor(long j17) {
        return android.graphics.Color.argb((int) ((j17 >> 24) & 255), (int) ((j17 >> 16) & 255), (int) ((j17 >> 8) & 255), (int) (j17 & 255));
    }

    public static java.lang.String colorToString(long j17) {
        return java.lang.String.format("#%08x", java.lang.Long.valueOf(j17));
    }

    public static float dpToPx(android.content.Context context, float f17) {
        if (context != null) {
            return com.tencent.mm.sdk.platformtools.j.d(context, f17);
        }
        com.tencent.mars.xlog.Log.e(TAG, "DpToPx method parameter is illegal! context is null! stack: \n" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return f17 * 2.0f;
    }

    public static float getScaleSize(android.content.Context context) {
        float f17 = 1.0f;
        if (context == null) {
            return 1.0f;
        }
        float q17 = i65.a.q(context);
        if (!context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("screenResolution_isModifyDensity", true) || (!com.tencent.mm.ui.bk.M(q17, 1.1f) && !com.tencent.mm.ui.bk.M(q17, 0.8f))) {
            f17 = q17;
        }
        return (com.tencent.mm.ui.bk.M(f17, i65.a.u(context)) || com.tencent.mm.ui.bk.M(f17, i65.a.v(context))) ? i65.a.t(context) : f17;
    }

    public static float pxToDp(android.content.Context context, float f17) {
        float f18;
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "dpToPx method parameter is illegal! context is null! stack: \n" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            f18 = 2.0f;
        } else {
            f17 *= 160.0f;
            f18 = context.getResources().getDisplayMetrics().densityDpi;
        }
        return f17 / f18;
    }

    public static void setExpandSize(final android.view.View view, final float f17, final float f18) {
        view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.tools.MMKViewUtil.1
            @Override // java.lang.Runnable
            public void run() {
                android.view.View view2 = (android.view.View) view.getParent();
                if (view2 == null) {
                    return;
                }
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getHitRect(rect);
                rect.inset((int) ((-i65.a.a(view.getContext(), f17)) / 2.0f), (int) ((-i65.a.a(view.getContext(), f18)) / 2.0f));
                android.view.TouchDelegate touchDelegate = view2.getTouchDelegate();
                if (touchDelegate instanceof com.tencent.kinda.framework.widget.tools.KindaTouchDelegate) {
                    ((com.tencent.kinda.framework.widget.tools.KindaTouchDelegate) touchDelegate).addDelegate(rect, view);
                } else {
                    view2.setTouchDelegate(new com.tencent.kinda.framework.widget.tools.KindaTouchDelegate(rect, view));
                }
            }
        });
    }

    public static void setId4KindaImplView(android.content.Context context, java.lang.String str, android.view.View view) {
        if (context == null) {
            return;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
    }
}
