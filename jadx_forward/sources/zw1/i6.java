package zw1;

/* loaded from: classes8.dex */
public final class i6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558203e;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.a3 a3Var) {
        this.f558202d = activityC13149x63b02cb3;
        this.f558203e = a3Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        r45.uk4 uk4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558202d;
        g4Var.f(0, activityC13149x63b02cb3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_7));
        r45.i34 a17 = zw1.n6.f558277a.a(this.f558203e);
        java.lang.String str = (a17 == null || (uk4Var = a17.f458233e) == null) ? null : uk4Var.f468965e;
        if (str == null) {
            java.lang.String string = activityC13149x63b02cb3 != null ? activityC13149x63b02cb3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_r) : null;
            str = string == null ? "" : string;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "getReceiptSettingText result: ".concat(str));
        g4Var.f(1, str);
    }
}
