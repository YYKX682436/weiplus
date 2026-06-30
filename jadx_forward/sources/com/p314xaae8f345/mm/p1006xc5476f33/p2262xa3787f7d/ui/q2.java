package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes3.dex */
public final class q2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f254644d;

    /* renamed from: e, reason: collision with root package name */
    public final int f254645e;

    /* renamed from: f, reason: collision with root package name */
    public final int f254646f;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2 w2Var, int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 3 : i19;
        this.f254644d = i17;
        this.f254645e = i18;
        this.f254646f = i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int v07 = parent.v0(view);
        int i17 = this.f254645e;
        int i18 = this.f254646f;
        int i19 = ((i17 / i18) * i18) - (i17 % i18 > 0 ? 0 : i18);
        int i27 = (i19 + i18) - 1;
        int i28 = this.f254644d;
        if (v07 < i18) {
            outRect.bottom = i28;
        } else {
            if (i19 <= v07 && v07 <= i27) {
                outRect.top = i28;
            } else {
                outRect.top = i28;
                outRect.bottom = i28;
            }
        }
        if (v07 % i18 == 0) {
            outRect.left = 0;
            outRect.right = i28;
        } else if (v07 % i18 == i18 - 1) {
            outRect.left = i28;
            outRect.right = 0;
        } else {
            outRect.left = i28;
            outRect.right = i28;
        }
    }
}
