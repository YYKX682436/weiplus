package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class he {
    public static void a(com.tencent.mm.plugin.appbrand.page.ia iaVar, android.view.ViewGroup viewGroup) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        android.view.ViewGroup viewGroup2 = iaVar.f86757a;
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
