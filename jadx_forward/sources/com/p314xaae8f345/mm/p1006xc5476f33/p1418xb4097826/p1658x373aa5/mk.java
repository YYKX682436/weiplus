package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class mk extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 f214200d;

    public mk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4) {
        this.f214200d = c15346x1cf713c4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int dimension = (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        int dimension2 = (int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561952xe);
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f214200d.m62375x4905e9fa().mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        if (u07 == 0) {
            outRect.left = dimension;
            outRect.right = dimension2;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        if (u07 == mo1894x7e414b06 - 1) {
            outRect.left = dimension2;
            outRect.right = dimension;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        outRect.left = dimension2;
        outRect.right = dimension2;
        outRect.bottom = 0;
        outRect.top = 0;
    }
}
