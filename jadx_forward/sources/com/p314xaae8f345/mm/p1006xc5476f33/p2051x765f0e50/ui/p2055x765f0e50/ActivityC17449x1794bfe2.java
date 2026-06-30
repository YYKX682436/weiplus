package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI */
/* loaded from: classes11.dex */
public class ActivityC17449x1794bfe2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f242122o = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242123g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242124h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f242125i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f242126m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f242127n;

    public ActivityC17449x1794bfe2() {
        new android.graphics.Rect();
        this.f242127n = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 2;
    }

    public final void X6(j35.g0 g0Var, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        if (!fp.h.c(26)) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", getPackageName());
            intent.putExtra("app_uid", getApplicationInfo().uid);
            intent.addFlags(268435456);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (u75.d.c() && (!u75.d.f() || (u75.d.f() && !u75.d.d()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationUI", "openSysSetting() ifNotificationChannelSupportNativeActionJump = false");
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.MAIN");
            intent2.setClassName("com.android.settings", "com.android.settings.Settings$NotificationFilterActivity");
            intent2.putExtra("appName", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp));
            intent2.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, getPackageName());
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).aj(intent2, g0Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationUI", "openSysSetting() native notificationchannel jump");
        if (new z2.n1(mo55332x76847179()).a()) {
            intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.CHANNEL_ID", str);
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).aj(intent, g0Var);
    }

    public final void Y6(boolean z17, long j17, int i17) {
        if (z17) {
            this.f242126m = (int) (j17 | this.f242126m);
        } else {
            this.f242126m = (int) ((~j17) & this.f242126m);
        }
        this.f242127n.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576478cd;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03a5  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17449x1794bfe2.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242126m = c01.z1.p();
        c01.z1.n();
        ip.b.p();
        w14.d.f523767d.c();
        l14.e eVar = l14.e.f396541a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationReporter", "reportNotificationMainPage");
        java.util.Map map = l14.e.f396542b;
        ((java.util.LinkedHashMap) map).clear();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Gj(50237, "page_in", map, 33328);
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.oho);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.a9.a(3);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f242126m));
        java.util.HashMap hashMap = this.f242127n;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = intValue;
            p53Var.f464295e = intValue2;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        boolean z17 = true;
        if (str.equals("settings_sns_notify")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242123g).m("settings_sns_notify", true);
        } else {
            if (str.equals("settings_notification_finder")) {
                boolean N = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationUI", "settings_notification_finder isEnable=%s", java.lang.Boolean.valueOf(N));
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().R(N);
            } else if (str.equals("settings_notification_finder_live")) {
                boolean N2 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationUI", "settings_notification_finder_live isEnable=%s", java.lang.Boolean.valueOf(N2));
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().z0(N2);
            } else if (str.equals("settings_notification_finder_nearby")) {
                boolean N3 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationUI", "settings_notification_finder_nearby isEnable=%s", java.lang.Boolean.valueOf(N3));
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I(N3);
                if (N3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22479, java.lang.Long.valueOf(c01.id.c()), 1);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22479, java.lang.Long.valueOf(c01.id.c()), 0);
                }
            } else if (str.equals("settings_voip_notification_both_shake_and_sound")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                boolean N4 = c21541x1c1b08fe.N();
                ip.l.m(N4);
                ip.l.q(N4);
                mo43517x10010bd5();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(this, c21541x1c1b08fe.N());
            } else if (str.equals("settings_voip_shake")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                ip.l.m(c21541x1c1b08fe2.N());
                mo43517x10010bd5();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(this, c21541x1c1b08fe2.N());
            } else if (str.equals("settings_voip_sound")) {
                ip.l.q(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N());
                mo43517x10010bd5();
            }
            if (str.equals("settings_sound")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                ip.l.o(c21541x1c1b08fe3.N());
                mo43517x10010bd5();
                if (c21541x1c1b08fe3.N()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 10L, 1L, false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 11L, 1L, false);
                }
            } else if (str.equals("settings_shake")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                ip.l.k(c21541x1c1b08fe4.N());
                mo43517x10010bd5();
                if (c21541x1c1b08fe4.N()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 16L, 1L, false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 17L, 1L, false);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(this, c21541x1c1b08fe4.N());
            } else if (str.equals("settings_special_scene_notification_sound_and_shake")) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17462x62129595.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingsSpecialSceneNotificationUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingsSpecialSceneNotificationUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (str.equals("settings_msg_notification_content_title")) {
                w14.d dVar = w14.d.f523767d;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2556x237a88eb.C20593xde5e9794()) == 1) {
                    android.content.Intent putExtra = new android.content.Intent().putExtra("key_config_item", "SettingGroup_Main_Notify_Content_Content_2");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
                    j45.l.j(context, "setting", ".ui.setting_new.CommonSettingsUI", putExtra, null);
                } else {
                    android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
                    lk5.s.e(intent2, true);
                    pf5.j0.a(intent2, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jj.class);
                    java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef.f243040f.iterator();
                    while (it.hasNext()) {
                        pf5.j0.a(intent2, (java.lang.Class) it.next());
                        if (!r26.n0.N("SettingsNotificationBannerUI")) {
                            intent2.putExtra("KEY_CUSTOM_PAGE_NAME", "SettingsNotificationBannerUI");
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/utils/SettingsNotificationHelper", "gotoDetail", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting/utils/SettingsNotificationHelper", "gotoDetail", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                if (str.equals("settings_new_msg_notification_switch")) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                    if (c21541x1c1b08fe5.N()) {
                        ip.l.r(true);
                        mo43517x10010bd5();
                        l14.e.f396541a.b(l14.d.f396536e);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = 3;
                        objArr[1] = java.lang.Integer.valueOf(this.f242124h ? 1 : 2);
                        g0Var.d(29634, objArr);
                    } else {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, false);
                        k0Var.s(com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dmw, (android.view.ViewGroup) null), false);
                        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sj(this);
                        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tj(this);
                        k0Var.m("取消");
                        k0Var.C = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uj(this);
                        k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vj(this);
                        k0Var.v();
                    }
                    if (!fp.h.c(26) || ip.b.u()) {
                        ip.l.r(c21541x1c1b08fe5.N());
                        mo43517x10010bd5();
                        if (c21541x1c1b08fe5.N()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 0L, 1L, false);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 1L, 1L, false);
                        }
                        c01.a9.b(true, false);
                    } else {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
                        u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574523df4));
                        u1Var.a(false);
                        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oj(this));
                        u1Var.q(false);
                    }
                } else if (str.equals("settings_new_voip_msg_invite_notification")) {
                    if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N()) {
                        ip.l.s(true);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.mo68477x336bdfd8(500L, 2L, 1L, false);
                        c01.a9.b(false, true);
                        mo43517x10010bd5();
                        l14.e.f396541a.b(l14.d.f396537f);
                        java.lang.Object[] objArr2 = new java.lang.Object[2];
                        objArr2[0] = 4;
                        objArr2[1] = java.lang.Integer.valueOf(this.f242124h ? 1 : 2);
                        g0Var2.d(29634, objArr2);
                    } else {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, false);
                        k0Var2.s(com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dmx, (android.view.ViewGroup) null), false);
                        k0Var2.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wj(this);
                        k0Var2.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xj(this);
                        k0Var2.m("取消");
                        k0Var2.C = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yj(this);
                        k0Var2.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kj(this);
                        k0Var2.v();
                    }
                } else if (str.equals("settings_new_msg_show_detail")) {
                    boolean N5 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                    ip.l.n(N5);
                    Y6(!N5, 2048L, 10);
                } else {
                    if (str.equals("setting_news_notification")) {
                        X6(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lj(this), n25.a.a());
                    }
                    if (str.equals("setting_voip_notification")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mj mjVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mj(this);
                        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
                        X6(mjVar, mx3.i0.h(""));
                    }
                    if (str.equals("settings_new_msg_notification_channel_sound") || str.equals("settings_new_msg_notification_ringtone")) {
                        android.content.Intent intent3 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd.class);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingWechatRingtone", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingWechatRingtone", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        if (str.equals("settings_notification_ringtone")) {
                            ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).wi(this, 1);
                        }
                        if (str.equals("settings_notification_hear_ringtone_when_call_me")) {
                            boolean N6 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                            ip.l.j(N6);
                            Y6(N6, 1073741824L, 71);
                        }
                        if (str.equals("settings_new_msg_notification_sound")) {
                            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe6 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                            ip.l.o(c21541x1c1b08fe6.N());
                            mo43517x10010bd5();
                            if (c21541x1c1b08fe6.N()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 10L, 1L, false);
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 11L, 1L, false);
                            }
                        } else if (str.equals("settings_new_msg_notification_shake")) {
                            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe7 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                            ip.l.k(c21541x1c1b08fe7.N());
                            mo43517x10010bd5();
                            if (c21541x1c1b08fe7.N()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 16L, 1L, false);
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 17L, 1L, false);
                            }
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(this, c21541x1c1b08fe7.N());
                        } else {
                            z17 = false;
                        }
                    }
                }
            }
        }
        W6(this.f242123g, c21560x1fce98fb.f279313q);
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo43517x10010bd5();
    }
}
