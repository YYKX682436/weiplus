package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class y9 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f183164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f183165b;

    public y9(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar, int i17) {
        this.f183164a = daVar;
        this.f183165b = i17;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f183164a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        o72.r2 item = cVar.getItem(this.f183165b - daVar.R6().getHeaderViewsCount());
        boolean c17 = b3Var.c(item, false, false);
        if (!c17) {
            g4Var.c(0, 3, 0, daVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccj), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (c17 && o72.x1.l0(item)) {
            g4Var.c(0, 3, 0, daVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccj), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        g4Var.c(0, 2, 0, daVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572728ca4), com.p314xaae8f345.mm.R.raw.f81163x4709a7);
        g4Var.c(0, 0, 0, daVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_f), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        if (item.B1) {
            int i17 = item.C1.f67657x2262335f;
            if (i17 == 14) {
                g4Var.c(0, 5, 0, daVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.caz), com.p314xaae8f345.mm.R.raw.f79672x41444803);
            } else if (i17 != 18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchManager", "itemInfo exist detail but no note or record, error!");
            } else {
                g4Var.c(0, 5, 0, daVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.caz), com.p314xaae8f345.mm.R.raw.f80730x666e864f);
            }
        }
        g4Var.c(0, 1, 0, daVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbi), com.p314xaae8f345.mm.R.raw.f79818xafe47098);
    }
}
