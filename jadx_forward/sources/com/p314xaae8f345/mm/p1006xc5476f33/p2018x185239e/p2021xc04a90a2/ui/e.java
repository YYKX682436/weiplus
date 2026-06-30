package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.f f238195d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.f fVar) {
        this.f238195d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "kinda transfer to bank pay success, go to launcherUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.LauncherUI"));
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 activityC17114xc078d367 = this.f238195d.f238198a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17114xc078d367, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17114xc078d367.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17114xc078d367, "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
