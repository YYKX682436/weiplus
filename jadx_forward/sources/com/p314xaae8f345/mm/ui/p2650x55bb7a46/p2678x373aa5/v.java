package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public abstract class v {
    public static final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039;
        java.lang.Object tag = k3Var.f3639x46306858.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) tag : null;
        if (aoVar == null) {
            aoVar = null;
        }
        if (aoVar != null && (c22624x85d69039 = aoVar.f284912b) != null) {
            return c22624x85d69039;
        }
        android.view.View findViewById = k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.bkl);
        if (findViewById == null || !(findViewById instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039)) {
            return null;
        }
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById;
    }

    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w b(android.view.View view) {
        int width = view.getWidth() > 0 ? view.getWidth() : view.getMeasuredWidth();
        int height = view.getHeight() > 0 ? view.getHeight() : view.getMeasuredHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w(width, height, 0);
    }

    public static final void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        c1163xf1deaba4.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t(c1163xf1deaba4, animator));
    }
}
