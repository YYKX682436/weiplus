package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.ShortCutDispatchActivity */
/* loaded from: classes11.dex */
public class ActivityC21436x424f420f extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f278598d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f278599e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f278600f = "";

    /* renamed from: g, reason: collision with root package name */
    public qg0.y f278601g;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean T6() {
        if (gm0.j1.b().n() && !gm0.m.r()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ControlLauncherActivity", "not login");
        android.content.Intent intent = new android.content.Intent(this, getClass());
        intent.putExtras(getIntent());
        intent.addFlags(268468224);
        intent.setDataAndType(getIntent().getData(), getIntent().getType());
        intent.setAction(getIntent().getAction());
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtras(getIntent());
        j45.l.C(this, "account", "com.tencent.mm.plugin.account.ui.LoginPasswordUI", intent2, intent);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p pVar, android.content.Intent intent) {
        java.util.Objects.toString(pVar);
        if (pVar.ordinal() != 0) {
            return;
        }
        java.lang.String str = this.f278598d;
        if (str == null || !str.equals("launch_type_manual_recycle")) {
            boolean z17 = this.f278599e;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalScan;
            if (!z17) {
                java.lang.String str2 = this.f278598d;
                if (str2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ControlLauncherActivity", "error: launchType == null! ");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClassName(this, "com.tencent.mm.ui.LauncherUI").addFlags(67108864);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str2.equals("launch_type_scan_qrcode")) {
                    if (f9Var.k(this, null)) {
                        getIntent().putExtra("LauncherUI.Shortcut.LaunchType", "");
                        r45.t54 t54Var = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "BaseScanUI", 3, r45.t54.class);
                        if (t54Var != null) {
                            t54Var.f467690d = "launch_type_scan_qrcode";
                        }
                        android.content.Intent className = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.scanner.ui.BaseScanUI");
                        className.putExtra("key_enable_multi_code", true);
                        className.putExtra("key_scan_goods_enable_dynamic_wording", true);
                        className.putExtra("key_enable_scan_code_product_merge", true);
                        className.putExtra("key_check_camera_using", true);
                        className.putExtra("key_scan_report_enter_scene", 13);
                        className.putExtra("key_scan_shortcut_caller_string", this.f278600f);
                        a7(className);
                        className.addFlags(67108864);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(className);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        ((ty3.e) i95.n0.c(ty3.e.class)).getClass();
                        int j17 = iq.b.j();
                        if (j17 != 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27693, java.lang.Integer.valueOf(j17), 13);
                        }
                    }
                } else if (this.f278598d.equals("launch_type_my_qrcode")) {
                    getIntent().putExtra("LauncherUI.Shortcut.LaunchType", "");
                    r45.t54 t54Var2 = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "SelfQRCodeUI", 3, r45.t54.class);
                    if (t54Var2 != null) {
                        t54Var2.f467690d = "launch_type_my_qrcode";
                    }
                    kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
                    c01.ka kaVar = new c01.ka(4);
                    ((hs.d0) i2Var).getClass();
                    e04.g2.a(this, kaVar);
                } else if (this.f278598d.equals("launch_type_voip")) {
                    android.content.Intent putExtra = new android.content.Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(putExtra);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11034, 2, 0);
                } else if (this.f278598d.equals("launch_type_voip_audio")) {
                    android.content.Intent putExtra2 = new android.content.Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(putExtra2);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11034, 2, 1);
                } else if (this.f278598d.equals("launch_type_offline_wallet")) {
                    getIntent().putExtra("LauncherUI.Shortcut.LaunchType", "");
                    r45.t54 t54Var3 = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "WalletOfflineEntranceUI", 3, r45.t54.class);
                    if (t54Var3 != null) {
                        t54Var3.f467690d = "launch_type_offline_wallet";
                    }
                    boolean booleanExtra = getIntent().getBooleanExtra("from_pinned_shortcut", false);
                    int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                    if (intValue == 0 || intValue == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ControlLauncherActivity", "start offlinepay from shortcut");
                        android.content.Intent className2 = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI");
                        className2.putExtra("key_from_scene", 4);
                        className2.putExtra("from_pinned_shortcut", booleanExtra);
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(className2);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList5.get(0));
                        yj0.a.f(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else if (intValue == 8) {
                        if (this.f278601g == null) {
                            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
                            this.f278601g = new nt4.e();
                        }
                        ((nt4.e) this.f278601g).b(this);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ControlLauncherActivity", "error: launchType:%s doesn`t match all types! ", this.f278598d);
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.setClassName(this, "com.tencent.mm.ui.LauncherUI").addFlags(67108864);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(intent3);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList6.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (f9Var.k(this, null)) {
                getIntent().putExtra("LauncherUI.Shortcut.LaunchType", "");
                r45.t54 t54Var4 = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "BaseScanUI", 3, r45.t54.class);
                if (t54Var4 != null) {
                    t54Var4.f467690d = "launch_type_scan_qrcode";
                }
                android.content.Intent className3 = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.scanner.ui.BaseScanUI");
                className3.putExtra("key_enable_multi_code", true);
                className3.putExtra("key_scan_goods_enable_dynamic_wording", true);
                className3.putExtra("key_enable_scan_code_product_merge", true);
                className3.putExtra("key_check_camera_using", true);
                className3.putExtra("key_scan_report_enter_scene", 14);
                className3.putExtra("key_scan_shortcut_caller_string", this.f278600f);
                a7(className3);
                className3.addFlags(67108864);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(className3);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(this, arrayList7.toArray(), "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList7.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/ShortCutDispatchActivity", "switchLaunchType", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ((ty3.e) i95.n0.c(ty3.e.class)).getClass();
                int j18 = iq.b.j();
                if (j18 != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27693, java.lang.Integer.valueOf(j18), 14);
                }
            }
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
            dr0.a3 a17 = dr0.a3.f323936d.a();
            a17.getClass();
            if (dr0.j2.f323981j.a()) {
                a17.q("关闭微信中(" + android.os.Process.myPid() + ")...");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "recycle schedule: from-8, delayMin=0");
                a17.d("post-8");
                dr0.q3.j(dr0.q3.f324044r, ((long) 0) * 60000, null, 2, null);
            } else {
                a17.q("微信正在前台，无法关闭");
            }
            finish();
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final void a7(android.content.Intent intent) {
        android.net.Uri referrer = getReferrer();
        intent.putExtra("key_scan_launch_referrer", referrer != null ? referrer.getAuthority() : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ControlLauncherActivity", "fillReferForScan refer: %s", referrer);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent = getIntent();
        if (getIntent() == null) {
            finish();
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.a(intent)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ControlLauncherActivity", "checkIntentSafe error");
            finish();
            return;
        }
        this.f278598d = intent.getStringExtra("LauncherUI.Shortcut.LaunchType");
        this.f278599e = intent.getBooleanExtra("LauncherUI.From.Scaner.Shortcut", false);
        this.f278600f = m78512xb8359e85();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ControlLauncherActivity", "launchType: " + this.f278598d + "  isFromHomeScan " + this.f278599e + " caller " + this.f278600f);
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
