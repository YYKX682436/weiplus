package pl2;

/* loaded from: classes3.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438160d;

    public h(pl2.s sVar) {
        this.f438160d = sVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = this.f438160d.c().m0(view);
        int dimension = ((int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)) - i65.a.b(view.getContext(), 2);
        if (m07 != null && m07.m8183xf806b362() == 0) {
            outRect.left = dimension;
            outRect.right = dimension;
            outRect.bottom = 0;
            outRect.top = 0;
            return;
        }
        outRect.left = dimension;
        outRect.right = dimension;
        outRect.bottom = 0;
        outRect.top = dimension;
    }
}
