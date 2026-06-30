package n3;

/* loaded from: classes14.dex */
public abstract class a1 {
    public static void a(android.view.WindowInsets windowInsets, android.view.View view) {
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(com.p314xaae8f345.mm.R.id.nxg);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static n3.g3 b(android.view.View view, n3.g3 g3Var, android.graphics.Rect rect) {
        android.view.WindowInsets h17 = g3Var.h();
        if (h17 != null) {
            return n3.g3.i(view.computeSystemWindowInsets(h17, rect), view);
        }
        rect.setEmpty();
        return g3Var;
    }

    public static boolean c(android.view.View view, float f17, float f18, boolean z17) {
        return view.dispatchNestedFling(f17, f18, z17);
    }

    public static boolean d(android.view.View view, float f17, float f18) {
        return view.dispatchNestedPreFling(f17, f18);
    }

    public static boolean e(android.view.View view, int i17, int i18, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i17, i18, iArr, iArr2);
    }

    public static boolean f(android.view.View view, int i17, int i18, int i19, int i27, int[] iArr) {
        return view.dispatchNestedScroll(i17, i18, i19, i27, iArr);
    }

    public static android.content.res.ColorStateList g(android.view.View view) {
        return view.getBackgroundTintList();
    }

    public static android.graphics.PorterDuff.Mode h(android.view.View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(android.view.View view) {
        return view.getElevation();
    }

    public static n3.g3 j(android.view.View view) {
        if (n3.t2.f415949d && view.isAttachedToWindow()) {
            try {
                java.lang.Object obj = n3.t2.f415946a.get(view.getRootView());
                if (obj != null) {
                    android.graphics.Rect rect = (android.graphics.Rect) n3.t2.f415947b.get(obj);
                    android.graphics.Rect rect2 = (android.graphics.Rect) n3.t2.f415948c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i17 = android.os.Build.VERSION.SDK_INT;
                        n3.x2 w2Var = i17 >= 30 ? new n3.w2() : i17 >= 29 ? new n3.v2() : new n3.u2();
                        w2Var.e(e3.d.b(rect.left, rect.top, rect.right, rect.bottom));
                        w2Var.g(e3.d.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        n3.g3 b17 = w2Var.b();
                        b17.f415871a.s(b17);
                        b17.f415871a.d(view.getRootView());
                        return b17;
                    }
                }
            } catch (java.lang.IllegalAccessException e17) {
                e17.getMessage();
            }
        }
        return null;
    }

    public static java.lang.String k(android.view.View view) {
        return view.getTransitionName();
    }

    public static float l(android.view.View view) {
        return view.getTranslationZ();
    }

    public static float m(android.view.View view) {
        return view.getZ();
    }

    public static boolean n(android.view.View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(android.view.View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(android.view.View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(android.view.View view, android.content.res.ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(android.view.View view, float f17) {
        view.setElevation(f17);
    }

    public static void t(android.view.View view, boolean z17) {
        view.setNestedScrollingEnabled(z17);
    }

    public static void u(android.view.View view, n3.k0 k0Var) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            view.setTag(com.p314xaae8f345.mm.R.id.f568747nx0, k0Var);
        }
        if (k0Var == null) {
            view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(com.p314xaae8f345.mm.R.id.nxg));
        } else {
            view.setOnApplyWindowInsetsListener(new n3.z0(view, k0Var));
        }
    }

    public static void v(android.view.View view, java.lang.String str) {
        view.setTransitionName(str);
    }

    public static void w(android.view.View view, float f17) {
        view.setTranslationZ(f17);
    }

    public static void x(android.view.View view, float f17) {
        view.setZ(f17);
    }

    public static boolean y(android.view.View view, int i17) {
        return view.startNestedScroll(i17);
    }

    public static void z(android.view.View view) {
        view.stopNestedScroll();
    }
}
