package zw1;

/* loaded from: classes8.dex */
public class i3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 f558196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5) {
        super(false);
        this.f558196d = activityC13148x64d0f1c5;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5 = this.f558196d;
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(activityC13148x64d0f1c5.f177960d.m83183xfb85ada3(), 0.0d);
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "wallet region: %s", java.lang.Integer.valueOf(intValue));
        if (!activityC13148x64d0f1c5.f177960d.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5.U6(activityC13148x64d0f1c5, activityC13148x64d0f1c5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfm));
            return;
        }
        if (F < 0.01d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5.U6(activityC13148x64d0f1c5, activityC13148x64d0f1c5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hye));
            return;
        }
        if (intValue == 8) {
            activityC13148x64d0f1c5.m83096xe7b1ccf7(new ww1.t1(java.lang.Math.round(F * 100.0d), 1, activityC13148x64d0f1c5.f177963g, c01.z1.m()));
            return;
        }
        int intExtra = activityC13148x64d0f1c5.getIntent().getIntExtra("key_type", 1);
        int i07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(activityC13148x64d0f1c5.f177960d.m83183xfb85ada3(), "100");
        if (intExtra != 2) {
            ww1.i iVar = new ww1.i(i07, "1", activityC13148x64d0f1c5.f177963g, false, "", 1);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13148x64d0f1c5.mo55332x76847179();
            iVar.f295437m = true;
            iVar.f295439o = mo55332x76847179;
            pq5.g l17 = iVar.l();
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC13148x64d0f1c5.mo55332x76847179());
            l17.h(new zw1.h3(this));
            return;
        }
        ww1.j jVar = new ww1.j(i07, "1", activityC13148x64d0f1c5.f177963g, false, "", 1, activityC13148x64d0f1c5.getIntent().getLongExtra("ftf_fixed_current_shop_id", 0L));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC13148x64d0f1c5.mo55332x76847179();
        jVar.f295437m = true;
        jVar.f295439o = mo55332x768471792;
        pq5.g l18 = jVar.l();
        l18.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC13148x64d0f1c5.mo55332x76847179());
        l18.h(new zw1.g3(this));
    }
}
