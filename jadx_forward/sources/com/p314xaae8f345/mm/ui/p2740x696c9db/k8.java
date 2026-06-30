package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public abstract class k8 {
    public static void a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        b(context, viewGroup, view, view2, view3, i17, 0.0f, false);
    }

    public static void b(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, int i17, float f17, boolean z17) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.h8(view, view3, context, i17, view2, f17, viewGroup, z17));
    }

    public static void c(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89, long j17) {
        if (c1095x65355f89 == null || c1095x65355f89.getChildCount() == 0 || c1095x65355f89.getChildAt(0) == null || c1095x65355f89.getHeight() > c1095x65355f89.getChildAt(0).getHeight()) {
            return;
        }
        c1095x65355f89.postDelayed(new com.p314xaae8f345.mm.ui.p2740x696c9db.j8(c1095x65355f89), j17);
    }
}
