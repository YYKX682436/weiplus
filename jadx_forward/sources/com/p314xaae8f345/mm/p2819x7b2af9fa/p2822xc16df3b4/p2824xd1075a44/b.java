package com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final android.view.ViewGroup.MarginLayoutParams f296288a;

    static {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
        f296288a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public b(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0 e0Var) {
    }

    public static boolean a(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            android.animation.LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                if (a(viewGroup.getChildAt(i17))) {
                    return true;
                }
            }
        }
        return false;
    }
}
