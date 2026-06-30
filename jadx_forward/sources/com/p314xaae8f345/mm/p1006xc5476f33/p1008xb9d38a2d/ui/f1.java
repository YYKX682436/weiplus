package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class f1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11401x465afc4c f155369a;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11401x465afc4c activityC11401x465afc4c) {
        this.f155369a = activityC11401x465afc4c;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(this.f155369a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11401x465afc4c.class);
        intent2.setAction(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290739j);
        java.lang.String str = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290735f;
        intent2.putExtra(str, intent.getStringExtra(str));
        intent2.addFlags(603979776);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11401x465afc4c activityC11401x465afc4c = this.f155369a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11401x465afc4c, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/CustomTabMainActivity$1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11401x465afc4c.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11401x465afc4c, "com/tencent/mm/plugin/account/ui/CustomTabMainActivity$1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
