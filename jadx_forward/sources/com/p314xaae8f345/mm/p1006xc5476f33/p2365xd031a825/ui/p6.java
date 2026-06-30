package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes.dex */
public class p6 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 f262106a;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8) {
        this.f262106a = activityC19117x82d08fb8;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8 = this.f262106a;
        activityC19117x82d08fb8.C = false;
        activityC19117x82d08fb8.getClass();
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:null"));
        intent.addFlags(268435456);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb82 = this.f262106a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC19117x82d08fb82, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19117x82d08fb82.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC19117x82d08fb82, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
