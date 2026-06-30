package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class q6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 f259875b;

    public q6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 u6Var, int i17) {
        this.f259875b = u6Var;
        this.f259874a = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.vg5 vg5Var = (r45.vg5) obj;
        if (vg5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "save failed, qryPurchaseResultRes is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "save finish: %s", java.lang.Integer.valueOf(vg5Var.f469747f));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u6 u6Var = this.f259875b;
        u6Var.f259932d.j7();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = u6Var.f259932d;
        android.content.Intent intent = new android.content.Intent(activityC19020x7623dbfb, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae.class);
        intent.putExtra("key_amount", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j("" + this.f259874a, "100", 2, java.math.RoundingMode.HALF_UP));
        intent.putExtra("key_mode", 1);
        intent.putExtra("profile_date_wording", vg5Var.f469749h);
        r45.iu3 iu3Var = vg5Var.f469750i;
        if (iu3Var != null) {
            try {
                intent.putExtra("key_guide_cell", iu3Var.mo14344x5f01b1f6());
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtSaveFetchUI", e17, "", new java.lang.Object[0]);
            }
        }
        r45.du4 du4Var = vg5Var.f469753o;
        if (du4Var != null) {
            try {
                intent.putExtra("key_operation_view", du4Var.mo14344x5f01b1f6());
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtSaveFetchUI", e18, "", new java.lang.Object[0]);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vg5Var.f469751m)) {
            intent.putExtra("KEY_Purchase_Result_Wording", vg5Var.f469751m);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vg5Var.f469752n)) {
            intent.putExtra("KEY_Confirm_Result_Wording", vg5Var.f469752n);
        }
        intent.putExtra("entrance_type", activityC19020x7623dbfb.getIntent().getIntExtra("entrance_type", 0));
        if (activityC19020x7623dbfb.getIntent().getIntExtra("is_from_kinda_balance", 0) == 1) {
            intent.putExtra("is_from_kinda_balance", 1);
            activityC19020x7623dbfb.startActivityForResult(intent, 4097);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb2 = u6Var.f259932d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC19020x7623dbfb2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$2", "call", "(Lcom/tencent/mm/protocal/protobuf/QryPurchaseResultRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19020x7623dbfb2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC19020x7623dbfb2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$2", "call", "(Lcom/tencent/mm/protocal/protobuf/QryPurchaseResultRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19020x7623dbfb.finish();
        return null;
    }
}
