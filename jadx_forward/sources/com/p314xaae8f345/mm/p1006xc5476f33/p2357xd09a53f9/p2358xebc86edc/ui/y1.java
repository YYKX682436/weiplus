package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class y1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 f260065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f260066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 f260067c;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 z0Var, android.app.Dialog dialog) {
        this.f260067c = activityC19003x7959c734;
        this.f260065a = z0Var;
        this.f260066b = dialog;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        if (zg5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "fetch detail failed");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
        this.f260065a.f259291e.b(zg5Var.C, 8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "goWalletLqtSaveFetchUI()");
        android.app.Dialog dialog = this.f260066b;
        if (dialog != null) {
            dialog.dismiss();
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.LinkedList linkedList = zg5Var.f473555q;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.if0 if0Var = (r45.if0) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(if0Var.f458514d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(if0Var.f458516f)) {
                    arrayList.add(java.lang.String.format("%s||%s", if0Var.f458514d, if0Var.f458516f));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734 = this.f260067c;
        android.content.Intent intent = new android.content.Intent(activityC19003x7959c734.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class);
        intent.putExtra("lqt_save_fund_code", zg5Var.f473556r);
        intent.putExtra("lqt_account_type", zg5Var.C);
        intent.putExtra("lqt_fund_spid", zg5Var.D);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("lqt_is_show_protocol", zg5Var.f473551o == 1);
        intent.putExtra("lqt_is_agree_protocol", zg5Var.f473552p == 1);
        intent.putExtra("operate_id", activityC19003x7959c734.f259375r.f493633e);
        intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
        intent.putExtra("lqt_profile_wording", zg5Var.f473568z);
        intent.putExtra("entrance_type", 8);
        intent.putExtra("fill_money", activityC19003x7959c734.f259368h.m83183xfb85ada3());
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC19003x7959c734.f259366f;
        if (c19091x9511676c != null) {
            intent.putExtra("card_serial", c19091x9511676c.f69225xed6d60f6);
        }
        if (((h45.q) i95.n0.c(h45.q.class)).mo24819x8648fb0d(activityC19003x7959c734.mo55332x76847179(), intent, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.x1(this))) {
            return null;
        }
        activityC19003x7959c734.startActivityForResult(intent, 3);
        return null;
    }
}
