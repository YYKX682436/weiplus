package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f239391d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f239392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239393f;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883, android.app.Dialog dialog) {
        this.f239393f = activityC17133x39d21883;
        this.f239392e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f239391d));
        if (!this.f239391d) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883.f238869u2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = this.f239393f;
            activityC17133x39d21883.getClass();
            android.app.Dialog dialog = this.f239392e;
            if (dialog != null) {
                dialog.dismiss();
            }
            android.content.Intent intent = new android.content.Intent(activityC17133x39d21883, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.class);
            intent.putExtra("key_account_type", 0);
            activityC17133x39d21883.v7(intent, true);
        }
        this.f239391d = true;
    }
}
