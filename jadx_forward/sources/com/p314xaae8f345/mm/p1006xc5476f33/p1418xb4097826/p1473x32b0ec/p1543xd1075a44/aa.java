package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes2.dex */
public final class aa extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f199281d;

    /* renamed from: e, reason: collision with root package name */
    public final int f199282e;

    public aa(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199281d = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f199282e = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        int i17 = u07 % 5;
        if (u07 / 5 < ((((parent.mo7946xf939df19() != null ? r4.mo1894x7e414b06() : 0) + 5) - 1) / 5) - 1) {
            outRect.bottom = this.f199281d;
        }
        int i18 = this.f199282e;
        if (i17 == 0) {
            outRect.left = 0;
            outRect.right = i18 / 2;
        } else if (i17 != 4) {
            outRect.left = i18 / 2;
            outRect.right = i18 / 2;
        } else {
            outRect.left = i18 / 2;
            outRect.right = 0;
        }
    }
}
