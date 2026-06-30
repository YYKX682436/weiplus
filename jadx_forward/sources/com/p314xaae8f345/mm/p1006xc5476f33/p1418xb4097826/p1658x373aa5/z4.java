package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class z4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f214983d;

    public z4(int i17) {
        this.f214983d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        jz5.l lVar;
        jz5.l lVar2;
        java.lang.Integer valueOf;
        java.lang.Integer valueOf2;
        java.lang.Integer valueOf3;
        java.lang.Integer valueOf4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        boolean z17 = view.getResources().getConfiguration().getLayoutDirection() == 1;
        int i17 = this.f214983d;
        int b17 = a06.d.b(i17 * 1.6f);
        int i18 = i17 / 2;
        if (mo1894x7e414b06 == 1) {
            lVar = new jz5.l(java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(b17));
        } else {
            if (u07 == 0) {
                if (z17) {
                    valueOf3 = java.lang.Integer.valueOf(i18);
                    valueOf4 = java.lang.Integer.valueOf(b17);
                } else {
                    valueOf3 = java.lang.Integer.valueOf(b17);
                    valueOf4 = java.lang.Integer.valueOf(i18);
                }
                lVar2 = new jz5.l(valueOf3, valueOf4);
            } else if (u07 == mo1894x7e414b06 - 1) {
                if (z17) {
                    valueOf = java.lang.Integer.valueOf(b17);
                    valueOf2 = java.lang.Integer.valueOf(i18);
                } else {
                    valueOf = java.lang.Integer.valueOf(i18);
                    valueOf2 = java.lang.Integer.valueOf(b17);
                }
                lVar2 = new jz5.l(valueOf, valueOf2);
            } else {
                lVar = new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i18));
            }
            lVar = lVar2;
        }
        outRect.set(((java.lang.Number) lVar.f384366d).intValue(), 0, ((java.lang.Number) lVar.f384367e).intValue(), 0);
    }
}
