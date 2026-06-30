package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class k8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f182761d;

    public k8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var) {
        this.f182761d = y8Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        int f17 = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        switch (this.f182761d.mo863xcdaf1228(u07)) {
            case 18:
            case 19:
                if (u07 != 0) {
                    outRect.top = f17;
                } else {
                    outRect.top = f17 / 2;
                }
                outRect.bottom = f17;
                outRect.right = f17;
                outRect.left = f17;
                return;
            case 20:
                if (u07 % 3 == 0) {
                    outRect.right = f17;
                }
                outRect.left = f17;
                outRect.bottom = f17;
                return;
            case 21:
                if (((u07 - r5.f183158d.size()) - 1) % 3 == 0) {
                    outRect.right = f17;
                }
                outRect.left = f17;
                outRect.bottom = f17;
                return;
            default:
                return;
        }
    }
}
