package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class v0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259938b;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b, int i17) {
        this.f259938b = activityC19013x23c3e97b;
        this.f259937a = i17;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259938b;
        android.app.Dialog dialog = activityC19013x23c3e97b.Y;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "fetch detail failed: %s", obj);
        int i17 = this.f259937a - 1;
        if (i17 > 0) {
            activityC19013x23c3e97b.Y6(i17, false);
        } else if (obj != null) {
            db5.e1.y(activityC19013x23c3e97b.mo55332x76847179(), obj instanceof java.lang.String ? obj.toString() : activityC19013x23c3e97b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpu), "", activityC19013x23c3e97b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.i0(this));
        }
    }
}
