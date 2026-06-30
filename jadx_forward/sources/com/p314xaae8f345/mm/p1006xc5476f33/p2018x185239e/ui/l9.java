package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class l9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb f239345d;

    public l9(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb) {
        this.f239345d = activityC17155x7c2f4bb;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "click back btn");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb.X;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = this.f239345d;
        if (activityC17155x7c2f4bb.mo73847x7d641a7d()) {
            activityC17155x7c2f4bb.mo48674x36654fab();
            activityC17155x7c2f4bb.showDialog(1000);
        } else {
            activityC17155x7c2f4bb.a7(activityC17155x7c2f4bb.f239147w, 1);
            activityC17155x7c2f4bb.finish();
        }
        return true;
    }
}
