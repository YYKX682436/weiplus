package zw1;

/* loaded from: classes3.dex */
public final class l6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vk4 f558248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f558250f;

    public l6(r45.vk4 vk4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, int i17) {
        this.f558248d = vk4Var;
        this.f558249e = activityC13149x63b02cb3;
        this.f558250f = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.vk4 vk4Var = this.f558248d;
        java.lang.String str3 = vk4Var != null ? vk4Var.f469851e : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558249e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, activityC13149x63b02cb3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_r))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 23, java.lang.Integer.valueOf(this.f558250f));
        }
        int i17 = vk4Var.f469850d;
        boolean z17 = false;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC13149x63b02cb3, vk4Var.f469852f, false);
            return true;
        }
        if (i17 == 3) {
            if (!((vk4Var == null || (str2 = vk4Var.f469853g) == null || !r26.n0.N(str2)) ? false : true)) {
                if (vk4Var != null && (str = vk4Var.f469854h) != null && r26.n0.N(str)) {
                    z17 = true;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "MiniApp info - username: " + vk4Var.f469853g + ", path: " + vk4Var.f469854h);
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398545a = vk4Var != null ? vk4Var.f469853g : null;
                    b1Var.f398555f = vk4Var != null ? vk4Var.f469854h : null;
                    b1Var.f398565k = 1072;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
                    if (h6Var != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(activityC13149x63b02cb3, b1Var);
                    }
                    return true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "waapp_username or waapp_path is null");
        }
        return true;
    }
}
