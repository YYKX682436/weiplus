package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ha implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la f155443d;

    public ha(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la laVar) {
        this.f155443d = laVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la laVar = this.f155443d;
        if (itemId == 2001) {
            laVar.c();
            return;
        }
        if (itemId != 2002) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 c6968xc4cd5a52 = laVar.f155542e;
        c6968xc4cd5a52.f142767d = 1L;
        c6968xc4cd5a52.f142768e = 10L;
        c6968xc4cd5a52.k();
        android.content.Intent intent = new android.content.Intent(laVar.f155541d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = laVar.f155541d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11453xa58e34bc, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginFacebook", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11453xa58e34bc.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11453xa58e34bc, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginFacebook", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
