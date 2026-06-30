package zw1;

/* loaded from: classes9.dex */
public class e0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 f558148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 activityC13142x725f2ac0) {
        super(false);
        this.f558148d = activityC13142x725f2ac0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 activityC13142x725f2ac0 = this.f558148d;
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(activityC13142x725f2ac0.f177910d.m83183xfb85ada3(), 0.0d);
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "wallet region: %s", java.lang.Integer.valueOf(intValue));
        if (!activityC13142x725f2ac0.f177910d.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0.U6(activityC13142x725f2ac0, activityC13142x725f2ac0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfm));
            return;
        }
        if (F < 0.01d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0.U6(activityC13142x725f2ac0, activityC13142x725f2ac0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hye));
        } else if (intValue == 8) {
            activityC13142x725f2ac0.m83096xe7b1ccf7(new ww1.t1(java.lang.Math.round(F * 100.0d), 1, activityC13142x725f2ac0.f177913g, c01.z1.m()));
        } else {
            activityC13142x725f2ac0.m83098x5406100e(new ww1.z1(F, "1", activityC13142x725f2ac0.f177913g));
        }
    }
}
