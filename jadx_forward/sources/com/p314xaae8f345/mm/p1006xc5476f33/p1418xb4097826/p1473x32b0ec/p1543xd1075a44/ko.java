package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ko extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lo f200382d;

    public ko(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lo loVar) {
        this.f200382d = loVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lo loVar = this.f200382d;
        int size = loVar.f200499j.size();
        if (size == 1) {
            outRect.left = (loVar.f200492c - loVar.f200494e) / 2;
            return;
        }
        if (size == 2) {
            if (u07 == 0) {
                outRect.left = loVar.f200495f;
                outRect.right = loVar.f200493d;
                return;
            }
            return;
        }
        if (u07 == 0) {
            outRect.left = loVar.f200491b + loVar.f200496g;
        } else {
            outRect.left = loVar.f200491b;
        }
        if (u07 == loVar.f200499j.size() - 1) {
            outRect.right = loVar.f200491b;
        }
    }
}
