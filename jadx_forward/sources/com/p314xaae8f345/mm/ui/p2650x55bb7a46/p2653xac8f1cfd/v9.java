package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class v9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9 f281656f;

    public v9(int i17, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9 w9Var) {
        this.f281654d = str;
        this.f281655e = f9Var;
        this.f281656f = w9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("framesetname:");
            java.lang.String str = this.f281654d;
            sb6.append(str);
            sb6.append(", msg id:");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281655e;
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", sb6.toString());
            if (f9Var != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9 w9Var = this.f281656f;
                db5.e1.B(w9Var.f280113d.g(), w9Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", w9Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), w9Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u9(f9Var, w9Var, str), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
            }
        }
    }
}
