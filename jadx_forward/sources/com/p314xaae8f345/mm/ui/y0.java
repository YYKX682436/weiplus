package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class y0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 f294102d;

    public y0(com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 activityC21346x5cfbe046) {
        this.f294102d = activityC21346x5cfbe046;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 activityC21346x5cfbe046 = this.f294102d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC21346x5cfbe046.f278115f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.t7.m123882x26a183b(activityC21346x5cfbe046, com.p314xaae8f345.mm.R.C30867xcad56011.hcs, 0).show();
            return 0;
        }
        r45.zs3 zs3Var = (r45.zs3) oVar.f152244b.f152233a;
        if (zs3Var.f473881e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNotifySettingsUI", "wxa_msg_config_list not exist");
            return 0;
        }
        activityC21346x5cfbe046.runOnUiThread(new com.p314xaae8f345.mm.ui.x0(this, zs3Var));
        return 0;
    }
}
