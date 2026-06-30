package androidx.fragment.app;

/* loaded from: classes13.dex */
public enum l3 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static androidx.fragment.app.l3 b(int i17) {
        if (i17 == 0) {
            return VISIBLE;
        }
        if (i17 == 4) {
            return INVISIBLE;
        }
        if (i17 == 8) {
            return GONE;
        }
        throw new java.lang.IllegalArgumentException("Unknown visibility " + i17);
    }

    public static androidx.fragment.app.l3 d(android.view.View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
    }

    public void a(android.view.View view) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                java.util.Objects.toString(view);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (ordinal == 2) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                java.util.Objects.toString(view);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (ordinal != 3) {
            return;
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            java.util.Objects.toString(view);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
