package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public final class a8 implements nk5.c {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f134863c;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.a8 f134862b = new com.p314xaae8f345.mm.app.a8();

    /* renamed from: d, reason: collision with root package name */
    public static final uk5.f f134864d = new com.p314xaae8f345.mm.app.z7();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f134865e = kz5.z.D0(new java.lang.String[]{"com.tencent.mm.plugin.setting.ui.setting.SettingsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI", "com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI", "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI", "com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI", "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode", "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera", "com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI"});

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f134866f = kz5.p1.e("com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI", "com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI", "com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI", "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI", "com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI", "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode", "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera", "com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI", "com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI", "com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f134867g = kz5.o1.c("com.tencent.mm.plugin.profile.ui.ContactInfoUI");

    @Override // nk5.c
    public boolean a(java.lang.String str) {
        return kz5.n0.O(f134867g, str);
    }

    @Override // nk5.c
    public void b() {
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2554x6e06889c.C20589x3cba22b0()) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VAS.WxVAS", "sendSyncBarrier");
            com.p314xaae8f345.mm.ui.cf.f279625d.c();
        }
    }

    @Override // nk5.c
    public void c(boolean z17) {
        f134863c = java.lang.Boolean.valueOf(z17);
    }

    @Override // nk5.c
    public boolean d(java.lang.String str) {
        return kz5.n0.O(f134866f, str);
    }

    @Override // nk5.c
    public boolean e() {
        java.lang.Boolean bool = f134863c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20292x7561fb7d()) == 1;
        f134863c = java.lang.Boolean.valueOf(z17);
        return z17;
    }

    @Override // nk5.c
    public void f() {
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2554x6e06889c.C20589x3cba22b0()) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VAS.WxVAS", "removeSyncBarrier");
            com.p314xaae8f345.mm.ui.cf.f279625d.b();
        }
    }
}
