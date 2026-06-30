package k24;

/* loaded from: classes11.dex */
public final class i implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e f385293a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e c17590x59bbde0e) {
        this.f385293a = c17590x59bbde0e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e c17590x59bbde0e = this.f385293a;
        if (!z17) {
            c17590x59bbde0e.s7();
            return;
        }
        k24.h hVar = new k24.h(c17590x59bbde0e);
        java.lang.String a17 = n25.a.a();
        c17590x59bbde0e.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (!fp.h.c(26)) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", c17590x59bbde0e.m80379x76847179().getPackageName());
            intent.putExtra("app_uid", c17590x59bbde0e.m80379x76847179().getApplicationInfo().uid);
            intent.addFlags(268435456);
            android.app.Activity m80379x76847179 = c17590x59bbde0e.m80379x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingSwitchNotifyNewMsg", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m80379x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(m80379x76847179, "com/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingSwitchNotifyNewMsg", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (u75.d.c() && (!u75.d.f() || (u75.d.f() && !u75.d.d()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "openSysSetting() ifNotificationChannelSupportNativeActionJump = false");
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.MAIN");
            intent2.setClassName("com.android.settings", "com.android.settings.Settings$NotificationFilterActivity");
            intent2.putExtra("appName", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp));
            intent2.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, c17590x59bbde0e.m80379x76847179().getPackageName());
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).aj(intent2, hVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "openSysSetting() native notificationchannel jump");
        if (new z2.n1(c17590x59bbde0e.m80379x76847179()).a()) {
            intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.CHANNEL_ID", a17);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", c17590x59bbde0e.m80379x76847179().getPackageName());
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).aj(intent, hVar);
    }
}
