package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f195480d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, int i17) {
        this.f195480d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            int mo1894x7e414b06 = mo7946xf939df19.mo1894x7e414b06();
            int u07 = parent.u0(view);
            int i17 = mo1894x7e414b06 % 3 == 0 ? mo1894x7e414b06 / 3 : (mo1894x7e414b06 / 3) + 1;
            if (i17 <= 1) {
                outRect.bottom = 0;
            } else if (u07 >= (i17 - 1) * 3) {
                outRect.bottom = 0;
            } else {
                outRect.bottom = this.f195480d;
            }
        }
    }
}
