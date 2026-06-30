package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes.dex */
public class m implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19023x5fcee04a f260169a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19023x5fcee04a activityC19023x5fcee04a) {
        this.f260169a = activityC19023x5fcee04a;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + this.f260169a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfv)));
        intent.addFlags(268435456);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19023x5fcee04a activityC19023x5fcee04a = this.f260169a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC19023x5fcee04a, arrayList.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$8", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19023x5fcee04a.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC19023x5fcee04a, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$8", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
