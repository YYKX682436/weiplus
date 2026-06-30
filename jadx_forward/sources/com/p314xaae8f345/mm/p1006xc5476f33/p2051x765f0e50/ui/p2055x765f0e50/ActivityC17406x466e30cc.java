package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI */
/* loaded from: classes11.dex */
public class ActivityC17406x466e30cc extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f241819n = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/readtemplate?check=false&t=weixin_faq_verifyaccount&platform=android&lang=%s";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241820g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f241821h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f241822i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f241823m = "";

    public ActivityC17406x466e30cc() {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sparseIntArray.put(0, com.p314xaae8f345.mm.R.C30867xcad56011.iqc);
        sparseIntArray.put(-82, com.p314xaae8f345.mm.R.C30867xcad56011.inx);
        sparseIntArray.put(-83, com.p314xaae8f345.mm.R.C30867xcad56011.inu);
        sparseIntArray.put(-84, com.p314xaae8f345.mm.R.C30867xcad56011.inv);
        sparseIntArray.put(-85, com.p314xaae8f345.mm.R.C30867xcad56011.inq);
        sparseIntArray.put(-86, com.p314xaae8f345.mm.R.C30867xcad56011.iny);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 2;
    }

    public final java.lang.String X6(boolean z17, boolean z18) {
        return z18 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9n) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9m);
    }

    public final void Y6() {
        boolean z17 = false;
        if (!(com.p314xaae8f345.mm.ui.bk.A() || c01.z1.x())) {
            if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).Zi(c01.z1.r())) {
                if (((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ui(mo55332x76847179(), false)) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21575x1b6b730e) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_fingerprint_title")).H(X6(true, ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ni(c01.z1.r())));
                    z17 = true;
                }
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).m("settings_fingerprint_title", !z17);
    }

    public final void Z6() {
        if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_manage_login_device") == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsAccountInfoUI", "safedevicesate preference is null");
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).m("settings_manage_login_device", false);
        if (c01.z1.e() != 1) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).m("settings_manage_login_device", true);
        }
    }

    public final void a7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityVoicePrint.h() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) != 1) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).m("settings_voiceprint_title", true);
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsAccountInfoUI", "update voiceprint dot, account not ready!");
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_voiceprint_title");
        int q17 = gm0.j1.u().c().q(40, 0);
        boolean z17 = (65536 & q17) != 0;
        int i17 = q17 & 131072;
        c21549x15041e54.H(X6(z17, i17 != 0));
        if (((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue() && i17 == 0) {
            c21549x15041e54.V = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
            c21549x15041e54.W = com.p314xaae8f345.mm.R.C30861xcebc809e.asx;
            c21549x15041e54.a0(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAccountInfoUI", "show voiceprint dot");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: autoRefresh */
    public boolean mo48678xedc85a2c() {
        return true;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        Z6();
        Y6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576467c2;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574552ip1);
        this.f241820g = m79336x8b97809d();
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.ckf, null);
        this.f241821h = inflate;
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mmq)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.irg));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) this.f241821h.findViewById(com.p314xaae8f345.mm.R.id.mmp)).getEditText().setInputType(129);
        if (c01.z1.e() != 1) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).m("settings_manage_login_device", true);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o6(this));
        rn3.i.Di().k((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_more_safe"));
        this.f241823m = getIntent().getStringExtra("highlight_item_id");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        new r45.nn3().b().l().h(new gm5.a() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI$$b
            @Override // gm5.a
            /* renamed from: call */
            public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                r45.on3 on3Var;
                r45.iu5 iu5Var;
                int i17;
                com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc.f241819n;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc activityC17406x466e30cc = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc.this;
                activityC17406x466e30cc.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAccountInfoUI", "GetSafetyInfoRespsonse cgiBack, errType:%s, errCode:%s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
                if (fVar.f152148a == 0 && (on3Var = (r45.on3) fVar.f152151d) != null && (iu5Var = on3Var.f463910d) != null) {
                    boolean z17 = iu5Var.f458875e;
                    boolean z18 = iu5Var.f458876f;
                    int o17 = c01.z1.o();
                    if (z17) {
                        int i18 = 65536 | o17;
                        i17 = z18 ? 131072 | i18 : (-131073) & i18;
                    } else {
                        i17 = (-65537) & o17;
                    }
                    if (i17 != o17) {
                        c01.b9.f118602c.d("last_login_use_voice", i17 + "");
                        gm0.j1.u().c().z(40, i17);
                        activityC17406x466e30cc.a7();
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17406x466e30cc.f241820g).notifyDataSetChanged();
                    }
                }
                return fVar;
            }
        });
        mo43517x10010bd5();
        gm0.j1.u().c().a(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.u().c().e(this);
        this.f241822i.mo50302x6b17ad39(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAccountInfoUI", str + " item has been clicked!");
        c01.z1.r();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (str.equals("settings_about_vuser_about")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.b1(mo55332x76847179(), java.lang.String.format(f241819n, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
        } else if (str.equals("settings_independent_password")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("kintent_hint", getString(com.p314xaae8f345.mm.R.C30867xcad56011.itc));
            m78604xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class, intent);
        } else if (str.equals("settings_manage_login_device")) {
            j45.l.h(this, "account", ".security.ui.MySafeDeviceListUI");
        } else if (str.equals("settings_security_center")) {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeChatSafeCenterUrl");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAccountInfoUI", "safe center url %s", d17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                d17 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8n) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", d17);
            intent2.putExtra("showShare", true);
            intent2.putExtra("show_bottom", false);
            intent2.putExtra("needRedirect", false);
            intent2.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
            intent2.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
            j45.l.j(mo55332x76847179, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, null);
        } else if (str.equals("settings_voiceprint_title")) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 && (gm0.j1.u().c().q(40, 0) & 131072) == 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_voiceprint_title")).a0(8);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).notifyDataSetChanged();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAccountInfoUI", "unset setting account info new show");
            }
            j45.l.h(mo55332x76847179(), "voiceprint", "com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI");
        } else if (str.equals("settings_facedect_title")) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5929xbd8235e5 c5929xbd8235e5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5929xbd8235e5();
            c5929xbd8235e5.f136234g.f89273a = this;
            c5929xbd8235e5.e();
            boolean z17 = c5929xbd8235e5.f136235h.f89369a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAccountInfoUI", "hy: is start to face settings succ: %b", java.lang.Boolean.valueOf(z17));
            if (!z17) {
                db5.t7.m123883x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7s), 0).show();
            }
        } else if (str.equals("settings_trust_friend")) {
            m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7.class);
        } else if (str.equals("settings_more_safe")) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_SETTINGS_MORE_SAFE_STRING_SYNC);
            rn3.i.Di().a(52);
            m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17444xf577339.class);
        } else if (str.equals("settings_no_pwd_title")) {
            android.content.Intent intent3 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
            pf5.j0.a(intent3, q14.d.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x768471792, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x768471792.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x768471792, "com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_fingerprint_title")) {
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_more_safe");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean z17 = false;
        if (bk0.a.g().d(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_SETTINGS_MORE_SAFE_STRING_SYNC)) {
            c21549x15041e54.c0(0);
        } else {
            c21549x15041e54.c0(8);
        }
        Z6();
        Y6();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).m("settings_facedect_title", true);
        if (!(com.p314xaae8f345.mm.ui.bk.A() || c01.z1.x())) {
            if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).bj(c01.z1.r())) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21575x1b6b730e) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_no_pwd_title")).H(X6(true, ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ri()));
                z17 = true;
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).m("settings_no_pwd_title", !z17);
        a7();
        if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).cj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAccountInfoUI", "show trusted friend entry");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAccountInfoUI", "hide trusted friend entry");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).m("settings_trust_friend", true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21559xfbc1641b c21559xfbc1641b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21559xfbc1641b) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_about_vusertitle");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17389x293f2bf0 c17389x293f2bf0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17389x293f2bf0) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_about_vuserinfo");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_about_vuser_about");
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66049, null));
        if (q17 != 0) {
            c21559xfbc1641b.R = 8;
            c21559xfbc1641b.P = c21559xfbc1641b.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bjb);
            c17389x293f2bf0.L = new android.graphics.drawable.BitmapDrawable(getResources(), c01.n8.b() != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(((xf4.d) c01.n8.b()).b(q17, true), 2.0f) : null);
            c17389x293f2bf0.M = (java.lang.String) gm0.j1.u().c().l(66050, null);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).v(c21559xfbc1641b);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).v(c17389x293f2bf0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).v(h17);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21578x692cd608 c21578x692cd608 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21578x692cd608) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241820g).h("settings_security_center_tip");
        if (c21578x692cd608 != null) {
            java.lang.CharSequence text = getText(com.p314xaae8f345.mm.R.C30867xcad56011.ixy);
            c21578x692cd608.M = text;
            c21578x692cd608.L = 3;
            android.widget.TextView textView = c21578x692cd608.N;
            if (textView != null) {
                textView.setText(text);
                c21578x692cd608.N.setGravity(c21578x692cd608.L);
            }
        }
        super.onResume();
        this.f241822i.mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc activityC17406x466e30cc = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc.this;
                java.lang.String str = activityC17406x466e30cc.f241823m;
                if (str == null || str.isEmpty()) {
                    return;
                }
                final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17406x466e30cc.f241820g).h(activityC17406x466e30cc.f241823m);
                if (h18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsAccountInfoUI", "cannot find pref: " + activityC17406x466e30cc.f241823m);
                    return;
                }
                if (!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17406x466e30cc.f241820g).q(activityC17406x466e30cc.f241823m)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsAccountInfoUI", "pref is hide: " + activityC17406x466e30cc.f241823m);
                } else if (h18 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21575x1b6b730e) {
                    int color = activityC17406x466e30cc.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ahd);
                    android.view.View view = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21575x1b6b730e) h18).N;
                    if (view != null) {
                        view.setBackgroundColor(color);
                    }
                    activityC17406x466e30cc.f241822i.mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc.f241819n;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc activityC17406x466e30cc2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc.this;
                            activityC17406x466e30cc2.getClass();
                            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21575x1b6b730e c21575x1b6b730e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21575x1b6b730e) h18;
                            int color2 = activityC17406x466e30cc2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ahk);
                            android.view.View view2 = c21575x1b6b730e.N;
                            if (view2 != null) {
                                view2.setBackgroundColor(color2);
                            }
                        }
                    }, 1000L);
                    activityC17406x466e30cc.f241823m = "";
                }
            }
        }, 500L);
    }
}
