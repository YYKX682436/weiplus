package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class p4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n85 f259855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 f259856e;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4, r45.n85 n85Var) {
        this.f259856e = activityC19016xf99a44c4;
        this.f259855d = n85Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        r45.n85 n85Var = this.f259855d;
        int i18 = n85Var.f462705p;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4 = this.f259856e;
        activityC19016xf99a44c4.f259555z = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanDetailUI", "operType：%s", java.lang.Integer.valueOf(itemId));
        if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4.U6(activityC19016xf99a44c4, itemId);
            return;
        }
        if (itemId == 2) {
            db5.e1.L(activityC19016xf99a44c4.mo55332x76847179(), true, activityC19016xf99a44c4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kql), "", activityC19016xf99a44c4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqk), activityC19016xf99a44c4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.n4(this, itemId), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.o4(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            return;
        }
        if (itemId == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4.U6(activityC19016xf99a44c4, itemId);
            return;
        }
        if (itemId != 4) {
            return;
        }
        activityC19016xf99a44c4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanDetailUI", "go to add plan ui -> modify");
        android.content.Intent intent = new android.content.Intent(activityC19016xf99a44c4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.class);
        intent.putExtra("key_mode", 2);
        try {
            intent.putExtra("key_plan_item", n85Var.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtPlanDetailUI", e17, "", new java.lang.Object[0]);
        }
        activityC19016xf99a44c4.startActivityForResult(intent, 65281);
    }
}
