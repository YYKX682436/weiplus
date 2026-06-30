package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class f1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.CustomTabMainActivity f73836a;

    public f1(com.tencent.mm.plugin.account.ui.CustomTabMainActivity customTabMainActivity) {
        this.f73836a = customTabMainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(this.f73836a, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.CustomTabMainActivity.class);
        intent2.setAction(com.tencent.mm.ui.mmfb.sdk.l.f209206j);
        java.lang.String str = com.tencent.mm.ui.mmfb.sdk.l.f209202f;
        intent2.putExtra(str, intent.getStringExtra(str));
        intent2.addFlags(603979776);
        com.tencent.mm.plugin.account.ui.CustomTabMainActivity customTabMainActivity = this.f73836a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(customTabMainActivity, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/CustomTabMainActivity$1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        customTabMainActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(customTabMainActivity, "com/tencent/mm/plugin/account/ui/CustomTabMainActivity$1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
