package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f216439d;

    /* renamed from: e, reason: collision with root package name */
    public final int f216440e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s sVar, int i17, int i18) {
        this.f216439d = i17;
        this.f216440e = i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo8217x5db88677(android.graphics.Rect outRect, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        super.mo8217x5db88677(outRect, i17, parent);
        int i18 = i17 % 3;
        int i19 = this.f216439d;
        if (i18 == 0) {
            outRect.left = i19;
            outRect.right = 0;
            return;
        }
        outRect.left = this.f216440e;
        if (i18 == 2) {
            outRect.right = i19;
        } else {
            outRect.right = 0;
        }
    }
}
