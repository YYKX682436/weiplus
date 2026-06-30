package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v f272474d;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar) {
        this.f272474d = vVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar = this.f272474d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.h(), "onMMMenuItemSelected, menuItem: " + menuItem + ", i: " + i17);
        db5.t4 t4Var = vVar.f272544l;
        if (t4Var != null) {
            t4Var.mo888x34063ac(menuItem, i17);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) vVar.f272545m.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (wVar != null) {
            lb0.q.f399221a.d(vVar.f272533a, vVar.f272534b.f270848h, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.f(vVar, wVar));
            kb0.b bVar = vVar.f272542j;
            if (bVar != null) {
                int itemId = menuItem.getItemId();
                wVar.a();
                bVar.a(wVar, itemId, "view_clk");
            }
        }
    }
}
