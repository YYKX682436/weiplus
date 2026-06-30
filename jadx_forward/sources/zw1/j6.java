package zw1;

/* loaded from: classes8.dex */
public final class j6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f558217f;

    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.a3 a3Var, int i17) {
        this.f558215d = activityC13149x63b02cb3;
        this.f558216e = a3Var;
        this.f558217f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ww1.a3 a3Var = this.f558216e;
        int i18 = this.f558217f;
        if (i17 == 0) {
            this.f558215d.M7(a3Var, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 23, java.lang.Integer.valueOf(i18));
            return;
        }
        if (i17 != 1) {
            return;
        }
        r45.i34 a17 = zw1.n6.f558277a.a(a3Var);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "getCurrentJumpInfo returned null");
            return;
        }
        r45.uk4 uk4Var = a17.f458233e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("navigateToAddReceiveOptionsPage - username: ");
        sb6.append(uk4Var != null ? uk4Var.f468967g : null);
        sb6.append(", path: ");
        sb6.append(uk4Var != null ? uk4Var.f468968h : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", sb6.toString());
        if ((uk4Var != null ? uk4Var.f468968h : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "navigateToAddReceiveOptionsPage: waapp_path is null");
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            java.lang.String str = uk4Var.f468967g;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            nxVar.f89000b = uk4Var.f468968h;
            c6113xa3727625.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 24, java.lang.Integer.valueOf(i18));
    }
}
