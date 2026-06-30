package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p f210726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f210728f;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p pVar, android.view.View view, int i17) {
        this.f210726d = pVar;
        this.f210727e = view;
        this.f210728f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        jz5.f0 f0Var = null;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p pVar = this.f210726d;
            if (itemId == pVar.f210732m) {
                android.content.Context context = this.f210727e.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
                k0Var.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dep), 17, i65.a.b(context, 12), null);
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.j(pVar, context);
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.l(pVar, this.f210728f);
                k0Var.v();
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderGlobalFavPresenter", "[OnMMMenuItemSelectedListener] item = null!!");
        }
    }
}
