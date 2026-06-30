package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9 f210729g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y9();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f210730h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.h(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f210731i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m(this));

    /* renamed from: m, reason: collision with root package name */
    public final int f210732m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final int f210733n = 1;

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 A(r45.qt2 qt2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15107xbe61a985 c15107xbe61a985 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15107xbe61a985(qt2Var, false);
        c15107xbe61a985.f210669e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.i(this, c15107xbe61a985);
        return c15107xbe61a985;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public boolean g() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGlobalFavPresenter", "[onItemLongClick] position = " + i17);
        rl5.r rVar = new rl5.r(view.getContext(), view);
        rVar.C = true;
        rVar.f478888y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.n(this, view);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.o(this, view, i17);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i18 = iArr[0];
        if ((i17 + 1) % 2 == 0) {
            i18 += v(view);
        }
        rVar.n((i18 + view.getWidth()) / 2, iArr[1]);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(z(), false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(z(), false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a
    public void q() {
        z().mo56155xd210094c();
    }

    public int v(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return view.getWidth();
    }

    public java.lang.String y(so2.j5 feed, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        return "FavSourceId" + j17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 z() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28) ((jz5.n) this.f210731i).mo141623x754a37bb();
    }
}
