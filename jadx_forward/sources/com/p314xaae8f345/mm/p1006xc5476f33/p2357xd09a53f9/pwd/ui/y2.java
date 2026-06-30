package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class y2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f260656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c f260657c;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c, int i17, int i18) {
        this.f260657c = activityC19056xd4c1806c;
        this.f260655a = i17;
        this.f260656b = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c = this.f260657c;
        android.app.Dialog dialog = activityC19056xd4c1806c.f260501q;
        if (dialog != null) {
            dialog.dismiss();
        }
        int i17 = fVar.f152148a;
        int i18 = this.f260656b;
        int i19 = this.f260655a;
        if (i17 != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC19056xd4c1806c.mo55332x76847179(), "");
            activityC19056xd4c1806c.f260492e.a(i19, i18);
            activityC19056xd4c1806c.f260492e.notifyDataSetChanged();
            return null;
        }
        r45.xs6 xs6Var = (r45.xs6) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(xs6Var.f471915d), ((r45.xs6) fVar.f152151d).f471916e);
        if (xs6Var.f471915d == 0) {
            activityC19056xd4c1806c.setResult(-1);
            return null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.L(xs6Var.f471916e);
        activityC19056xd4c1806c.f260492e.a(i19, i18);
        activityC19056xd4c1806c.f260492e.notifyDataSetChanged();
        return null;
    }
}
