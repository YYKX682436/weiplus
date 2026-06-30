package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class he {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar, android.view.ViewGroup viewGroup) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.view.ViewGroup viewGroup2 = iaVar.f168290a;
        if (viewGroup2.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup2.getParent();
            for (int childCount = viewGroup3.getChildCount() - 1; childCount >= 0; childCount--) {
                if (viewGroup3.getChildAt(childCount) == viewGroup2) {
                    viewGroup3.addView(viewGroup, childCount, new android.view.ViewGroup.LayoutParams(-1, -1));
                    return;
                }
            }
        }
    }
}
