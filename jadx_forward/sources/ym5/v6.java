package ym5;

/* loaded from: classes3.dex */
public abstract class v6 {
    public static final boolean a(android.view.View view, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i19 = iArr[0];
        int i27 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i19;
        int measuredHeight = view.getMeasuredHeight() + i27;
        if (i19 <= i17 && i17 <= measuredWidth) {
            return i27 <= i18 && i18 <= measuredHeight;
        }
        return false;
    }

    public static final void b(android.view.View view, android.view.View view2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        c(view, view2, null);
    }

    public static final void c(android.view.View view, android.view.View view2, android.view.ViewGroup.LayoutParams layoutParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (view2 != null && (view instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = view2.getParent();
            if (parent != null) {
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(view2);
                } else {
                    parent.toString();
                }
            }
            try {
                if (layoutParams == null) {
                    ((android.view.ViewGroup) view).addView(view2);
                } else {
                    ((android.view.ViewGroup) view).addView(view2, layoutParams);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ViewExtension", th6, "safeAddView err parent:" + view2.getParent(), new java.lang.Object[0]);
                throw th6;
            }
        }
    }
}
