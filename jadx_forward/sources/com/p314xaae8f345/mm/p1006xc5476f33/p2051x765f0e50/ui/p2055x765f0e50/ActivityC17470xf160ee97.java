package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI */
/* loaded from: classes11.dex */
public class ActivityC17470xf160ee97 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f242248n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c f242249d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f242250e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f242251f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f242252g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f242253h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242254i;

    /* renamed from: m, reason: collision with root package name */
    public k14.g0 f242255m;

    public final void V6() {
        if (this.f242255m != null) {
            gm0.j1.d().d(this.f242255m);
            this.f242255m.f384870h = null;
        }
        this.f242255m = null;
    }

    public final void W6() {
        this.f242249d = null;
        try {
            android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("BundleKey_SettingsTranslateLanguageParams");
            if (parcelableExtra != null) {
                this.f242249d = (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c) parcelableExtra;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsTranslateLanguageUI", e17, "initSettingsRequest", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String[] strArr;
        java.lang.String[] stringArray;
        java.lang.String str;
        super.onCreate(bundle);
        W6();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.lxy);
        mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.f242248n;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97 activityC17470xf160ee97 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.this;
                activityC17470xf160ee97.mo48674x36654fab();
                activityC17470xf160ee97.finish();
                return true;
            }
        });
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.lxx), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$b
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3 f3Var;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.f242248n;
                final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97 activityC17470xf160ee97 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.this;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = activityC17470xf160ee97.m79336x8b97809d();
                if (m79336x8b97809d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTranslateLanguageUI", "save translate language failed, preferenceScreen is null.");
                } else {
                    java.util.ArrayList arrayList = (java.util.ArrayList) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).j();
                    if (arrayList.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTranslateLanguageUI", "save translate language failed, preferences is empty.");
                    } else {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) it.next();
                            if ((c21560x1fce98fb instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73) && (f3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73) c21560x1fce98fb).L) != null && f3Var.f155374d) {
                                break;
                            }
                        }
                    }
                }
                f3Var = null;
                if (f3Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTranslateLanguageUI", "on save clicked, but selectedLanguageInfo is null.");
                    return true;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.f242248n;
                        final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97 activityC17470xf160ee972 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.this;
                        activityC17470xf160ee972.getClass();
                        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = new com.p314xaae8f345.mm.p944x882e457a.u0() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$d
                            @Override // com.p314xaae8f345.mm.p944x882e457a.u0
                            /* renamed from: onSceneEnd */
                            public final void mo815x76e0bfae(final int i19, final int i27, final java.lang.String str2, final com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.f242248n;
                                final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97 activityC17470xf160ee973 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.this;
                                activityC17470xf160ee973.getClass();
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI$$e
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.f242248n;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97 activityC17470xf160ee974 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17470xf160ee97.this;
                                        activityC17470xf160ee974.getClass();
                                        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = m1Var;
                                        if (m1Var2 instanceof k14.g0) {
                                            ((k14.g0) m1Var2).f384870h = null;
                                            int i37 = i19;
                                            int i38 = i27;
                                            if (i37 == 0 && i38 == 0) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTranslateLanguageUI", "onTranslateLanguageSynced, sync successful.");
                                            } else if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTranslateLanguageUI", "onTranslateLanguageSynced, sync failed, network not connected.");
                                            } else if (i37 == 1 || i37 == 2 || i37 == 7 || i37 == 8) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTranslateLanguageUI", "onTranslateLanguageSynced, sync failed: network error, errType: " + i37 + ", errCode: " + i38 + ", errMsg: " + str2);
                                            }
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTranslateLanguageUI", "onTranslateLanguageSynced, lastTranslateLanguageCode: " + activityC17470xf160ee974.f242252g + ", newTranslateLanguageCode: " + activityC17470xf160ee974.f242253h);
                                            k14.g0 g0Var = activityC17470xf160ee974.f242255m;
                                            if (g0Var != null) {
                                                g0Var.f384870h = null;
                                                activityC17470xf160ee974.f242255m = null;
                                            }
                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC17470xf160ee974.f242254i;
                                            if (u3Var != null && u3Var.isShowing()) {
                                                activityC17470xf160ee974.f242254i.dismiss();
                                            }
                                            com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.r(activityC17470xf160ee974, activityC17470xf160ee974.f242253h);
                                            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).aj(activityC17470xf160ee974.f242249d, new wd0.l2(activityC17470xf160ee974.f242252g, activityC17470xf160ee974.f242253h));
                                        }
                                        activityC17470xf160ee974.finish();
                                    }
                                });
                            }
                        };
                        if (activityC17470xf160ee972.f242254i == null) {
                            activityC17470xf160ee972.f242254i = db5.e1.Q(activityC17470xf160ee972, null, activityC17470xf160ee972.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, false, null);
                        }
                        if (!activityC17470xf160ee972.f242254i.isShowing()) {
                            activityC17470xf160ee972.f242254i.show();
                        }
                        activityC17470xf160ee972.f242252g = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.q(activityC17470xf160ee972);
                        java.lang.String str2 = f3Var.f155373c;
                        activityC17470xf160ee972.f242253h = str2;
                        boolean k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.k(str2);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.k(str2)) {
                            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                        }
                        if (activityC17470xf160ee972.f242255m != null) {
                            activityC17470xf160ee972.V6();
                        }
                        k14.g0 g0Var = new k14.g0(k17, str2);
                        activityC17470xf160ee972.f242255m = g0Var;
                        g0Var.f384870h = u0Var;
                        if (gm0.j1.d().h(activityC17470xf160ee972.f242255m, 0)) {
                            return;
                        }
                        activityC17470xf160ee972.V6();
                    }
                });
                return true;
            }
        }, null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78500x43e00957(0, false);
        if (this.f242251f == null) {
            this.f242251f = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.q(this);
        }
        this.f242252g = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.q(this);
        java.util.List list = this.f242250e;
        if (list == null) {
            this.f242250e = new java.util.ArrayList();
        } else {
            ((java.util.ArrayList) list).clear();
        }
        java.lang.String str2 = this.f242252g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.c()) {
            strArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.l2.f274352b;
            stringArray = getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559541w);
        } else {
            strArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.l2.f274351a;
            stringArray = getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559540v);
        }
        if (strArr.length != stringArray.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTranslateLanguageUI", "languageCodes not paired with languageNames, languageCodes: " + java.util.Arrays.toString(strArr) + ", languageNames: " + java.util.Arrays.toString(stringArray));
        } else {
            for (int i17 = 0; i17 < strArr.length; i17++) {
                java.lang.String str3 = strArr[i17];
                java.lang.String str4 = stringArray[i17];
                boolean equals = android.text.TextUtils.equals(str2, str3);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.k(str3)) {
                    str4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572112bs1);
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.b(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), com.p314xaae8f345.mm.R.C30856x58c7259.f559540v, null);
                } else {
                    str = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3 f3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3(str4, "", str3, equals);
                f3Var.f155372b = str;
                ((java.util.ArrayList) this.f242250e).add(f3Var);
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        if (m79336x8b97809d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTranslateLanguageUI", "reload preferences failed, preferenceScreen is null.");
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d;
        h0Var.t();
        java.util.List list2 = this.f242250e;
        if (list2 == null || ((java.util.ArrayList) list2).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsTranslateLanguageUI", "no available translate language to display.");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f242250e).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3 f3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3) it.next();
            if (f3Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73 c11407x90269a73 = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73(this, null);
                c11407x90269a73.M(f3Var2);
                h0Var.d(c11407x90269a73, -1);
            }
        }
        h0Var.d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19(this), -1);
        h0Var.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3 f3Var;
        if (!(c21560x1fce98fb instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73) || (f3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73) c21560x1fce98fb).L) == null) {
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f242250e).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3) it.next()).f155374d = false;
        }
        f3Var.f155374d = true;
        m78500x43e00957(0, !android.text.TextUtils.equals(this.f242251f, f3Var.f155373c));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        if (m79336x8b97809d != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).notifyDataSetChanged();
        }
        return true;
    }
}
