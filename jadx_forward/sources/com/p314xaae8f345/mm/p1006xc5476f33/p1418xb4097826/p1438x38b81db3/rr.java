package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class rr extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f186033d;

    /* renamed from: e, reason: collision with root package name */
    public final int f186034e;

    public rr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr wrVar, int i17, int i18) {
        this.f186033d = i17;
        this.f186034e = i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo8217x5db88677(android.graphics.Rect outRect, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        super.mo8217x5db88677(outRect, i17, parent);
        int i18 = i17 % 3;
        int i19 = this.f186033d;
        if (i18 == 0) {
            outRect.left = i19;
            return;
        }
        outRect.left = this.f186034e;
        if (i18 == 2) {
            outRect.right = i19;
        }
    }
}
