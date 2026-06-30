package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class o0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f260018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.p0 f260020c;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.p0 p0Var, android.app.Dialog dialog, java.lang.String str) {
        this.f260020c = p0Var;
        this.f260018a = dialog;
        this.f260019b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "on qryusrfunddetail finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        android.app.Dialog dialog = this.f260018a;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.p0 p0Var = this.f260020c;
        if (!p0Var.f260024d.isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe = p0Var.f260024d;
            if (!activityC19000x9000bdbe.isDestroyed()) {
                if (fVar.f152148a != 0 || fVar.f152149b != 0) {
                    return null;
                }
                r45.zg5 zg5Var = (r45.zg5) fVar.f152151d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zg5Var.f473542d), zg5Var.f473543e);
                if (zg5Var.f473542d != 0) {
                    return null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(zg5Var.f473569z1);
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
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0) new em5.i().a(activityC19000x9000bdbe.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0.class);
                if (z0Var == null || activityC19000x9000bdbe.isFinishing() || activityC19000x9000bdbe.isDestroyed()) {
                    return null;
                }
                z0Var.f259291e.b(zg5Var.C, 3);
                android.content.Intent intent = new android.content.Intent(activityC19000x9000bdbe.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class);
                intent.putExtra("lqt_save_fund_code", zg5Var.f473556r);
                intent.putExtra("lqt_save_fetch_mode", 1);
                intent.putExtra("lqt_is_show_protocol", zg5Var.f473551o == 1);
                intent.putExtra("lqt_is_agree_protocol", zg5Var.f473552p == 1);
                intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
                intent.putExtra("lqt_profile_wording", zg5Var.f473568z);
                intent.putExtra("lqt_account_type", zg5Var.C);
                intent.putExtra("lqt_fund_spid", zg5Var.D);
                intent.putExtra("operate_id", this.f260019b);
                intent.putExtra("entrance_type", 3);
                if (((h45.q) i95.n0.c(h45.q.class)).mo24819x8648fb0d(activityC19000x9000bdbe.mo55332x76847179(), intent, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.n0(this))) {
                    return null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe2 = p0Var.f260024d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC19000x9000bdbe2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI$11$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC19000x9000bdbe2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC19000x9000bdbe2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI$11$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBalanceManagerUI", "this activity has finished");
        return null;
    }
}
