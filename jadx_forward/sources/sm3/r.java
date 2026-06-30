package sm3;

/* loaded from: classes10.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 f491437d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0) {
        this.f491437d = c16708x2eab1ea0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = this.f491437d;
        c16708x2eab1ea0.f233547g.getClass();
        int i17 = u07 - 1;
        if (i17 >= 0 && i17 < c16708x2eab1ea0.mo67409x317d5b7e().size()) {
            if (i17 < c16708x2eab1ea0.mo67409x317d5b7e().size() - 1 || c16708x2eab1ea0.mo67405x2a6997fd() > 0) {
                outRect.set(0, 0, c16708x2eab1ea0.getSpaceSize(), 0);
            }
        }
    }
}
