package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f290069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj5.q f290071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290073h;

    public o0(qj5.n nVar, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var, qj5.q qVar, android.app.Activity activity, java.util.HashMap hashMap) {
        this.f290069d = nVar;
        this.f290070e = j1Var;
        this.f290071f = qVar;
        this.f290072g = activity;
        this.f290073h = hashMap;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f290069d.f445519t2;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotShareService", "image is null");
            return;
        }
        int itemId = menuItem.getItemId();
        java.util.HashMap hashMap = this.f290073h;
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290070e;
        if (itemId != 910524420) {
            if (itemId != 910524424) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "saveToLocal onClick");
            j1Var.getClass();
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.app.Activity activity = this.f290072g;
            ((yb0.g) b0Var).Ni(activity, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.x0(activity, str, j1Var, this.f290071f), new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.y0(activity));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("function_usage_btn", "view_clk", kz5.c1.n(hashMap, new jz5.l("function_type", 5)), 36458);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "edit onClick");
        j1Var.Bi(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w.f290102n);
        android.app.Activity activity2 = this.f290072g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(str, "");
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap2 = (java.util.HashMap) map;
        hashMap2.put("plugin_filter", bool);
        hashMap2.put("plugin_poi", bool);
        hashMap2.put("plugin_tip", bool);
        hashMap2.put("plugin_menu", bool);
        b17.f237210o = c10402x5bc41468;
        fu3.e.f348413a.b(b17);
        ut3.m.f512715a.g(activity2, 910524420, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 2, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.a0(j1Var));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("function_usage_btn", "view_clk", kz5.c1.n(hashMap, new jz5.l("function_type", 1)), 36458);
    }
}
