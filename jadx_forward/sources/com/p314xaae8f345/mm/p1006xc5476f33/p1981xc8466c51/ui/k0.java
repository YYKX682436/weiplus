package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes4.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 f236962d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 abstractActivityC16965x338d8695) {
        this.f236962d = abstractActivityC16965x338d8695;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        int b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 abstractActivityC16965x338d8695 = this.f236962d;
        android.widget.ListView listView = abstractActivityC16965x338d8695.f236799m;
        android.view.View childAt = listView.getChildAt(listView.getLastVisiblePosition());
        if (childAt == null || (view = abstractActivityC16965x338d8695.f236804r) == null || view.getVisibility() != 0) {
            return;
        }
        int bottom = childAt.getBottom();
        int bottom2 = abstractActivityC16965x338d8695.f236799m.getBottom();
        int b18 = i65.a.b(abstractActivityC16965x338d8695.mo55332x76847179(), 64);
        int i17 = bottom2 - bottom;
        if (i17 <= 0 || (b17 = i17 + i65.a.b(abstractActivityC16965x338d8695.mo55332x76847179(), 15)) <= b18) {
            return;
        }
        abstractActivityC16965x338d8695.f236804r.setPadding(0, b17, 0, 0);
    }
}
