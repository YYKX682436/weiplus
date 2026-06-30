package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI */
/* loaded from: classes11.dex */
public class ActivityC17404xbaa82c2d extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f241808o = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241809g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241810h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f241811i;

    /* renamed from: m, reason: collision with root package name */
    public int f241812m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241813n;

    public ActivityC17404xbaa82c2d() {
        new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        this.f241811i = -1;
        this.f241812m = -1;
        this.f241813n = false;
    }

    public static boolean Y6() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.mmvoip_multipath_switch, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 2;
    }

    public final void X6(android.widget.LinearLayout linearLayout, int i17, int i18, boolean z17, android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = (android.widget.TextView) android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cbx, null);
        textView.setText(i17);
        textView.setTag(java.lang.Integer.valueOf(i18));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (z17) {
            textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
        }
    }

    public final void Z6(boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_nfc_switch");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putBoolean("settings_nfc_switch", z17).commit();
        c21541x1c1b08fe.O(z17);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).notifyDataSetChanged();
    }

    public final void a7(boolean z17) {
        if (z17) {
            getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 1);
        } else {
            getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 2);
        }
    }

    public final boolean b7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetTextSize", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetTextSize", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final void c7() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SilentDownloadApkAtWiFi"), 0) != 0;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273971a & 1) != 0) {
            z17 = true;
        }
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).m("settings_silence_update_mode", true);
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).m("settings_silence_update_mode", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_silence_update_mode").H(getString((((java.lang.Integer) gm0.j1.u().c().l(7, 0)).intValue() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0 ? com.p314xaae8f345.mm.R.C30867xcad56011.iya : com.p314xaae8f345.mm.R.C30867xcad56011.iy_));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).notifyDataSetChanged();
    }

    public final void d7() {
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTAutoLoadNetwork"), 1);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(327686, null), P);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAboutSystemUI", "auto getSightViewSummary %d, %d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(j17));
        if (this.f241811i == -1) {
            this.f241811i = j17;
        }
        this.f241812m = j17;
        int i17 = 3 == j17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iyn : 2 == j17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iyp : com.p314xaae8f345.mm.R.C30867xcad56011.iym;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_sns_sight_auto_download");
        if (h17 != null && i17 != 0) {
            h17.H(getString(i17));
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).notifyDataSetChanged();
    }

    public final void e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_plugins");
        rn3.i.Di().k(c16742x4f474056);
        c16742x4f474056.n0(this.f241809g);
        c16742x4f474056.h0();
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262158, 266266);
        boolean e17 = rn3.i.Ai().e(1);
        if (c16742x4f474056.o0(b17 || e17)) {
            return;
        }
        c16742x4f474056.a0(8);
        c16742x4f474056.V = "";
        c16742x4f474056.W = -1;
        if (b17 || e17) {
            c16742x4f474056.c0(0);
            c16742x4f474056.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
        } else {
            c16742x4f474056.c0(8);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576483ci;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574551ip0);
        this.f241809g = m79336x8b97809d();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b6(this));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).m("settings_swipeback_mode", !db5.f.g());
        j45.l.g("backup");
        e7();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).m("settings_traffic_statistic", true);
        if (Y6()) {
            if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_take_photo") != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_take_photo").J(com.p314xaae8f345.mm.R.C30867xcad56011.iwg);
            }
        } else if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_take_photo") != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_take_photo").J(com.p314xaae8f345.mm.R.C30867xcad56011.iwf);
        }
        boolean z17 = x51.o1.f533575a;
        if (!j65.m.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (com.p314xaae8f345.mm.ui.bk.G()) {
                return;
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).m("settings_dark", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).m("small_divider", true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f241810h = false;
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f241813n) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(this.f241812m);
            objArr[1] = java.lang.Boolean.valueOf(this.f241811i == this.f241812m);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAboutSystemUI", "kvstat, autodownload sight change: %d, %b", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = 1;
            objArr2[1] = java.lang.Integer.valueOf(this.f241812m);
            objArr2[2] = java.lang.Boolean.valueOf(this.f241811i == this.f241812m);
            g0Var.d(11437, objArr2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        boolean z17;
        java.lang.String str = c21560x1fce98fb.f279313q;
        boolean z18 = true;
        if (str.equals("settings_landscape_mode")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAboutSystemUI", "set ScreenOrientation，now is ： %s", java.lang.Boolean.valueOf(m79333x58c0be88().getBoolean("settings_landscape_mode", false)));
            if (m79333x58c0be88().getBoolean("settings_landscape_mode", false)) {
                com.p314xaae8f345.mm.ui.ee.c(1);
                setRequestedOrientation(-1);
            } else {
                com.p314xaae8f345.mm.ui.ee.c(0);
                setRequestedOrientation(1);
            }
        } else if (str.equals("settings_voicerecorder_mode")) {
            if (!m79333x58c0be88().getBoolean("settings_voicerecorder_mode", wo.v1.f529356c.f529138i != 1)) {
                db5.e1.n(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574639j16, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h6(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i6(this));
            }
        } else if (str.equals("settings_nfc_switch")) {
            android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this);
            if (defaultAdapter == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch phone not suppot nfc");
            } else {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0)).intValue();
                int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, 0)).intValue();
                if ((intValue == 2 || (intValue == 0 && intValue2 != 1)) && !defaultAdapter.isEnabled() && m79333x58c0be88().getBoolean("settings_nfc_switch", false)) {
                    Z6(false);
                    db5.e1.A(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.h9c), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.h9d), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f6(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g6(this));
                } else {
                    a7(m79333x58c0be88().getBoolean("settings_nfc_switch", false));
                }
            }
        } else if (str.equals("settings_voice_play_mode")) {
            gm0.j1.u().c().w(26, java.lang.Boolean.valueOf(!((java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE)).booleanValue()));
        } else if (str.equals("settings_enter_button_send")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241809g).h("settings_enter_button_send");
            if (c21541x1c1b08fe != null) {
                gm0.j1.u().c().w(66832, java.lang.Boolean.valueOf(c21541x1c1b08fe.N()));
            }
        } else if (str.equals("settings_sns_sight_auto_download")) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293266w = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            aVar.f293242a = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyo);
            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bxx, null);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.nua);
            int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(327686, null), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTAutoLoadNetwork"), 1));
            android.view.View.OnClickListener m6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m6(this, linearLayout, j17);
            X6(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.iym, 1, 1 == j17, m6Var);
            X6(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.iyp, 2, 2 == j17, m6Var);
            X6(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.iyn, 3, 3 == j17, m6Var);
            aVar.L = inflate;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            linearLayout.setTag(j0Var);
            j0Var.show();
            mo53058xe5d1a549(j0Var);
            this.f241813n = true;
        } else if (str.equals("settings_silence_update_mode")) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar2.f293266w = of5.b.a(mo55332x768471792).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            aVar2.f293242a = of5.b.a(mo55332x768471792).getString(com.p314xaae8f345.mm.R.C30867xcad56011.iy9);
            android.view.View inflate2 = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bxx, null);
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate2.findViewById(com.p314xaae8f345.mm.R.id.nua);
            android.view.View.OnClickListener k6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k6(this, linearLayout2);
            boolean z19 = (((java.lang.Integer) gm0.j1.u().c().l(7, 0)).intValue() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0;
            X6(linearLayout2, com.p314xaae8f345.mm.R.C30867xcad56011.iya, 0, z19, k6Var);
            X6(linearLayout2, com.p314xaae8f345.mm.R.C30867xcad56011.iy_, 1, !z19, k6Var);
            aVar2.L = inflate2;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x768471792, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var2.e(aVar2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar2.f293256m;
            if (d0Var2 != null) {
                d0Var2.a(j0Var2.f293370r);
            }
            linearLayout2.setTag(j0Var2);
            j0Var2.show();
            mo53058xe5d1a549(j0Var2);
        } else if (str.equals("settings_language")) {
            android.content.Intent intent = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17431x39cec8f.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetLanguage", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetLanguage", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_translate_language_introduce")) {
            android.content.Intent intent2 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTranslateLanguageIntroduce", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTranslateLanguageIntroduce", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_text_size")) {
            b7();
        } else if (str.equals("settings_chatting_bg")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17416xb325f68b.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(mo55332x768471793, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x768471793.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(mo55332x768471793, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_manage_findmoreui")) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17434x64616b86.class);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToManageFindMoreUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToManageFindMoreUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str.equals("settings_plugins")) {
            rn3.i.Di().a(32);
            android.content.Intent intent5 = new android.content.Intent();
            intent5.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17455x7f8b531.class);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(intent5);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetPlugins", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList5.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetPlugins", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262158, 266266);
        } else {
            if (!str.equals("settings_reset")) {
                if (str.equals("settings_emoji_manager")) {
                    android.content.Intent intent6 = new android.content.Intent();
                    intent6.putExtra(java.lang.String.valueOf(10931), 2);
                    j45.l.j(mo55332x76847179(), "emoji", ".ui.EmojiMineUI", intent6, null);
                } else if (str.equals("settngs_clean")) {
                    if (gm0.j1.u().l()) {
                        j45.l.j(mo55332x76847179(), "clean", ".ui.CleanUI", new android.content.Intent().putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1), null);
                    } else {
                        db5.t7.k(mo55332x76847179(), null);
                    }
                } else if (str.equals("settings_traffic_statistic")) {
                    android.content.Intent intent7 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17448xb1d592e2.class);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(intent7);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTrafficStatistic", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList6.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSetTrafficStatistic", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str.equals("settings_text_size")) {
                    b7();
                } else if (str.equals("settings_swipeback_mode")) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
                    boolean a17 = ep.a.a();
                    db5.e1.u(mo55332x76847179(), getString(!a17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iyu : com.p314xaae8f345.mm.R.C30867xcad56011.iyt), null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d6(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e6(this, c21541x1c1b08fe2, a17));
                } else if (str.equals("settings_take_photo")) {
                    android.content.Intent intent8 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17400xd8a304cf.class);
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(intent8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(this, arrayList7.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList7.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "doClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str.equalsIgnoreCase("settngs_matrix_trace")) {
                    if (!ih.d.c()) {
                        dp.a.m125854x26a183b(this, "Matrix is never installed", 0).show();
                        z18 = false;
                    }
                } else if (str.equals("settings_dark")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_red_dot", false);
                    android.content.Intent intent9 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17390xeb03cc89.class);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(intent9);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(this, arrayList8.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetDarkMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList8.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goTosetDarkMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (str.equals("settings_music_and_audio")) {
                    android.content.Intent intent10 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17447xe0fa39b6.class);
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(intent10);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(this, arrayList9.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSettingMusic", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    z17 = false;
                    startActivity((android.content.Intent) arrayList9.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI", "goToSettingMusic", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    z18 = z17;
                }
            }
            z17 = false;
            z18 = z17;
        }
        W6(this.f241809g, c21560x1fce98fb.f279313q);
        return z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b7  */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d.onResume():void");
    }
}
