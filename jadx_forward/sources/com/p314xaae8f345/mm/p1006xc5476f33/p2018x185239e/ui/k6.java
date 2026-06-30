package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class k6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704 f239328d;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704 activityC17134x89ac8704) {
        this.f239328d = activityC17134x89ac8704;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704 activityC17134x89ac8704 = this.f239328d;
        if (activityC17134x89ac8704.mo73847x7d641a7d()) {
            activityC17134x89ac8704.mo48674x36654fab();
            activityC17134x89ac8704.showDialog(1000);
            return true;
        }
        activityC17134x89ac8704.setResult(0, new android.content.Intent().putExtra("key_pay_reslut_type", 4));
        activityC17134x89ac8704.finish();
        return true;
    }
}
