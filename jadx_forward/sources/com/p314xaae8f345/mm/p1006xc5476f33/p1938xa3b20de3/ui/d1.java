package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public final class d1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f234133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f234134b;

    public d1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, android.app.Activity activity) {
        this.f234133a = z2Var;
        this.f234134b = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        this.f234133a.B();
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234018q = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234019r = null;
        boolean z17 = true;
        yo3.b.b("offlinePayShortcutFallbackGoSetting", 1);
        try {
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            l34.i iVar = l34.i.f396969b;
            boolean b17 = iVar.b();
            android.app.Activity activity = this.f234134b;
            if (b17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutService", "jumpToShortcutPermissionSettingPage: vendor page");
                iVar.c(activity);
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "jumpToPermissionSettings: fallback to ACTION_APPLICATION_DETAILS_SETTINGS");
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.parse("package:" + activity.getPackageName()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$Companion", "jumpToPermissionSettings", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$Companion", "jumpToPermissionSettings", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflinePayShortcutGuideUI", "jumpToPermissionSettings failed: %s", e17.getMessage());
        }
    }
}
