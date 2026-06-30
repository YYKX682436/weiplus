package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes.dex */
public class s1 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 f262141a;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 activityC19107x609745b7) {
        this.f262141a = activityC19107x609745b7;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7.G;
        this.f262141a.getClass();
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:null"));
        intent.addFlags(268435456);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 activityC19107x609745b7 = this.f262141a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC19107x609745b7, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19107x609745b7.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC19107x609745b7, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
