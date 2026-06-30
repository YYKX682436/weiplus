package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e;

/* loaded from: classes8.dex */
public final class i extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f202400q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f202401r;

    public i(android.app.Activity activity, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d, android.view.View view) {
        super(activity, c21470xb673f8d);
        this.f202400q = view;
        this.f202401r = new android.graphics.Rect();
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        return true;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getContentView */
    public android.view.View mo2159xc2a54588() {
        return this.f87115d instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? super.mo2159xc2a54588() : this.f202400q;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getMaskView */
    public android.view.View mo2161x8c409d27() {
        return this.f87115d instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? super.mo2161x8c409d27() : mo2159xc2a54588();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ak3.i
    public boolean n(int i17, android.view.ViewGroup parent, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        int childCount = parent.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = parent.getChildAt(i18);
            if ((childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z) childAt).mo57364xc6ea780e(i17, parent, f17, f18)) {
                android.graphics.Rect rect = this.f202401r;
                childAt.getGlobalVisibleRect(rect);
                if (rect.contains((int) f17, (int) f18)) {
                    return true;
                }
            } else if ((childAt instanceof android.view.ViewGroup) && n(i17, (android.view.ViewGroup) childAt, f17, f18)) {
                return true;
            }
        }
        return false;
    }
}
