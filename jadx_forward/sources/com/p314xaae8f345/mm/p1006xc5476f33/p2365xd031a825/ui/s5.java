package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes.dex */
public class s5 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f262147a;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1) {
        this.f262147a = activityC19116x82bf90f1;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1.f261555b2;
        this.f262147a.getClass();
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:null"));
        intent.addFlags(268435456);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f262147a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC19116x82bf90f1, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$26", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19116x82bf90f1.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC19116x82bf90f1, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$26", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
