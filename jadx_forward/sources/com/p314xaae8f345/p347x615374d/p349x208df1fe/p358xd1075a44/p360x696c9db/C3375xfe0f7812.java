package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.MMKViewUtil */
/* loaded from: classes9.dex */
public class C3375xfe0f7812 {
    private static final java.lang.String TAG = "MMKViewUtil";

    /* renamed from: density */
    private static float f13408x5c8c94e8 = -1.0f;

    /* renamed from: fontLevel */
    public static float[] f13409xa324f875 = {0.8f, 1.0f, 1.1f, 1.12f, 1.125f, 1.4f};

    /* renamed from: argbColor */
    public static int m27355x63f50df7(long j17) {
        return android.graphics.Color.argb((int) ((j17 >> 24) & 255), (int) ((j17 >> 16) & 255), (int) ((j17 >> 8) & 255), (int) (j17 & 255));
    }

    /* renamed from: colorToString */
    public static java.lang.String m27356xef6fd2ef(long j17) {
        return java.lang.String.format("#%08x", java.lang.Long.valueOf(j17));
    }

    /* renamed from: dpToPx */
    public static float m27357xb0f6c08f(android.content.Context context, float f17) {
        if (context != null) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "DpToPx method parameter is illegal! context is null! stack: \n" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return f17 * 2.0f;
    }

    /* renamed from: getScaleSize */
    public static float m27358x8f7e19b5(android.content.Context context) {
        float f17 = 1.0f;
        if (context == null) {
            return 1.0f;
        }
        float q17 = i65.a.q(context);
        if (!context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("screenResolution_isModifyDensity", true) || (!com.p314xaae8f345.mm.ui.bk.M(q17, 1.1f) && !com.p314xaae8f345.mm.ui.bk.M(q17, 0.8f))) {
            f17 = q17;
        }
        return (com.p314xaae8f345.mm.ui.bk.M(f17, i65.a.u(context)) || com.p314xaae8f345.mm.ui.bk.M(f17, i65.a.v(context))) ? i65.a.t(context) : f17;
    }

    /* renamed from: pxToDp */
    public static float m27359xc5e1a28f(android.content.Context context, float f17) {
        float f18;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "dpToPx method parameter is illegal! context is null! stack: \n" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            f18 = 2.0f;
        } else {
            f17 *= 160.0f;
            f18 = context.getResources().getDisplayMetrics().densityDpi;
        }
        return f17 / f18;
    }

    /* renamed from: setExpandSize */
    public static void m27360x3c905bbd(final android.view.View view, final float f17, final float f18) {
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
                if (touchDelegate instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7) {
                    ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7) touchDelegate).m27351xf6c38946(rect, view);
                } else {
                    view2.setTouchDelegate(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3373xd6442bb7(rect, view));
                }
            }
        });
    }

    /* renamed from: setId4KindaImplView */
    public static void m27361x5304a1db(android.content.Context context, java.lang.String str, android.view.View view) {
        if (context == null) {
            return;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }
}
