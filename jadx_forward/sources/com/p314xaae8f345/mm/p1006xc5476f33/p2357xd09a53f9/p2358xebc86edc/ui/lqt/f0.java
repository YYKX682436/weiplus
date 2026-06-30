package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19011x4781ed06 f259700b;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19011x4781ed06 activityC19011x4781ed06, android.app.Dialog dialog) {
        this.f259700b = activityC19011x4781ed06;
        this.f259699a = dialog;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBeforeSaveUI", "on qryusrfunddetail finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        this.f259699a.dismiss();
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19011x4781ed06 activityC19011x4781ed06 = this.f259700b;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.zg5 zg5Var = (r45.zg5) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBeforeSaveUI", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zg5Var.f473542d), zg5Var.f473543e);
            if (zg5Var.f473542d == 0) {
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
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0) new em5.i().a(activityC19011x4781ed06.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0.class)).f259291e.b(zg5Var.C, 1);
                android.content.Intent intent = new android.content.Intent(activityC19011x4781ed06.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class);
                intent.putExtra("lqt_save_fund_code", zg5Var.f473556r);
                intent.putExtra("lqt_save_fetch_mode", 1);
                intent.putExtra("lqt_is_show_protocol", zg5Var.f473551o == 1);
                intent.putExtra("lqt_is_agree_protocol", zg5Var.f473552p == 1);
                intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
                intent.putExtra("lqt_profile_wording", zg5Var.f473568z);
                intent.putExtra("lqt_account_type", zg5Var.C);
                intent.putExtra("lqt_fund_spid", zg5Var.D);
                if (!((h45.q) i95.n0.c(h45.q.class)).mo24819x8648fb0d(activityC19011x4781ed06.mo55332x76847179(), intent, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.e0(this))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19011x4781ed06 activityC19011x4781ed062 = this.f259700b;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC19011x4781ed062, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBeforeSaveUI$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC19011x4781ed062.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC19011x4781ed062, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBeforeSaveUI$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                activityC19011x4781ed06.setResult(-1);
            }
        }
        activityC19011x4781ed06.finish();
        return null;
    }
}
