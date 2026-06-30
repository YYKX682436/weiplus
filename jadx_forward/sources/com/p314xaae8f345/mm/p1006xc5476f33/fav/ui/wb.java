package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class wb implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f183053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f183054c;

    public wb(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a, int i17, long j17) {
        this.f183054c = activityC13579xef51058a;
        this.f183052a = i17;
        this.f183053b = j17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        o72.b3 b3Var = new o72.b3();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f183054c;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13579xef51058a.T;
        int headerViewsCount = activityC13579xef51058a.f181803h.getHeaderViewsCount();
        int i17 = this.f183052a;
        o72.r2 item = cVar.getItem(i17 - headerViewsCount);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "[OnCreateContextMMMenu] pos = " + i17 + ", id = " + this.f183053b + ", fav id = " + item.f67643xc8a07680);
        boolean c17 = b3Var.c(item, false, false);
        if (!c17) {
            g4Var.c(0, 3, 0, activityC13579xef51058a.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccj), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        if (c17 && o72.x1.l0(item)) {
            g4Var.c(0, 3, 0, activityC13579xef51058a.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccj), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        g4Var.c(0, 2, 0, activityC13579xef51058a.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572728ca4), com.p314xaae8f345.mm.R.raw.f81163x4709a7);
        g4Var.c(0, 0, 0, activityC13579xef51058a.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_f), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        g4Var.c(0, 1, 0, activityC13579xef51058a.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbi), com.p314xaae8f345.mm.R.raw.f79818xafe47098);
        boolean z17 = true;
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20264xc3c7e0d7()) == 1) {
            g4Var.add(0, 5, 0, com.p314xaae8f345.mm.R.C30867xcad56011.c9v);
        }
        activityC13579xef51058a.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && !z65.c.a()) {
            z17 = false;
        }
        if (z17) {
            g4Var.add(0, 7, 0, "删除本地文件");
        }
        if (item.B1) {
            int i18 = item.C1.f67657x2262335f;
            if (i18 == 18) {
                g4Var.c(0, 6, 0, i65.a.r(activityC13579xef51058a, com.p314xaae8f345.mm.R.C30867xcad56011.caz), com.p314xaae8f345.mm.R.raw.f80730x666e864f);
            } else if (i18 == 14) {
                g4Var.c(0, 6, 0, i65.a.r(activityC13579xef51058a, com.p314xaae8f345.mm.R.C30867xcad56011.caz), com.p314xaae8f345.mm.R.raw.f79672x41444803);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteIndexUI", "itemInfo exist detail but no note or record, error!");
            }
        }
    }
}
