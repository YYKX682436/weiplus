package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class u7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259934b;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, int i17) {
        this.f259934b = activityC19020x7623dbfb;
        this.f259933a = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.an5 an5Var = (r45.an5) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "redeem succ: %s, is_realtime_arrivial: %s, is_redeem_into_pocket: %s", an5Var, java.lang.Boolean.valueOf(an5Var.f451677f), java.lang.Boolean.valueOf(an5Var.f451678g));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259934b;
        activityC19020x7623dbfb.j7();
        if (an5Var.f451677f && an5Var.f451678g) {
            android.content.Intent intent = new android.content.Intent(activityC19020x7623dbfb, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae.class);
            intent.putExtra("key_amount", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j("" + this.f259933a, "100", 2, java.math.RoundingMode.HALF_UP));
            intent.putExtra("key_mode", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb2 = this.f259934b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC19020x7623dbfb2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$53", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC19020x7623dbfb2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC19020x7623dbfb2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$53", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent(activityC19020x7623dbfb, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19018xebab698d.class);
            try {
                intent2.putExtra("key_redeem_res", an5Var.mo14344x5f01b1f6());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtSaveFetchUI", e17, "pass redeemFundRes error: %s", e17.getMessage());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb3 = this.f259934b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC19020x7623dbfb3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$53", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC19020x7623dbfb3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC19020x7623dbfb3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$53", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        activityC19020x7623dbfb.finish();
        return null;
    }
}
