package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa f229304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f229305e;

    public z9(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa faVar, android.widget.LinearLayout linearLayout) {
        this.f229304d = faVar;
        this.f229305e = linearLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa faVar = this.f229304d;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(faVar.m158354x19263085());
        int a17 = com.p314xaae8f345.mm.ui.bl.a(faVar.m158354x19263085());
        android.widget.LinearLayout linearLayout = this.f229305e;
        int height = h17 + ((a17 - linearLayout.getHeight()) / 2);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = height;
        }
        linearLayout.setLayoutParams(marginLayoutParams);
        if (linearLayout.getHeight() != 0) {
            float height2 = linearLayout.getHeight() / 2;
            if (linearLayout != null) {
                linearLayout.setOutlineProvider(new zl5.a(true, true, height2));
            }
            if (linearLayout == null) {
                return;
            }
            linearLayout.setClipToOutline(true);
            return;
        }
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14);
        if (linearLayout != null) {
            linearLayout.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setClipToOutline(true);
    }
}
