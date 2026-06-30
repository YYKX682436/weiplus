package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsManageFindMoreV2UI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI */
/* loaded from: classes8.dex */
public final class ActivityC17434x64616b86 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public long f242035d;

    /* renamed from: e, reason: collision with root package name */
    public int f242036e;

    /* renamed from: f, reason: collision with root package name */
    public long f242037f;

    /* renamed from: g, reason: collision with root package name */
    public long f242038g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f242039h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f242040i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fg.f242570d);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f242041m = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.eg.f242531d);

    public final int V6(boolean z17, int i17) {
        return z17 ? i17 | 2 : i17 & (-3);
    }

    public final void W6(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54) {
        c21549x15041e54.X1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gg(c21549x15041e54);
    }

    public final boolean X6(long j17) {
        return (j17 & this.f242035d) != 0;
    }

    public final boolean Y6(int i17, int i18) {
        return (i17 & i18) == i18;
    }

    public final boolean Z6(long j17) {
        return (this.f242037f & j17) == j17;
    }

    public final boolean a7(long j17) {
        return (j17 & ((long) this.f242036e)) == 0;
    }

    public final void b7(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54) {
        int i17 = c21549x15041e54.i().getInt("perf_extra_flag");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("perf_key", c21549x15041e54.f279313q);
        intent.putExtra("perf_title", c21549x15041e54.f279307h);
        intent.putExtra("perf_icon_res", c21549x15041e54.f279310n);
        intent.putExtra("perf_icon_color", c21549x15041e54.f279311o);
        intent.putExtra("is_show_in_findmore", !Y6(i17, 1));
        intent.putExtra("is_new_notify", !Y6(i17, 2));
        intent.putExtra("is_show_nearby", !Y6(i17, 4));
        intent.putExtra("KEY_ENTER_SCENE", this.f242038g);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startHalfActivity  INTENT_PERF_IS_SHOW = ");
        sb6.append(!Y6(i17, 1));
        sb6.append(" INTENT_PERF_IS_NOTIFY = ");
        sb6.append(!Y6(i17, 2));
        sb6.append(" INTENT_PERF_IS_SHOW_NEARBY = ");
        sb6.append(!Y6(i17, 4));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFindMoreV2UI", sb6.toString());
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = mo55332x76847179();
        cVar.d(intent);
        cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17396xe3eb6353.class);
        cVar.a("com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI");
        cVar.h(1);
    }

    public final void c7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var, java.lang.String str) {
        if (f9Var.n()) {
            if (f9Var.h()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m(str, true);
                l14.b.f396527a.d(str);
                return;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.IconPreference");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) h17;
            c21549x15041e54.U1 = true;
            c21549x15041e54.f279305f = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ig(f9Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d7(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54, int i17) {
        java.lang.StringBuilder sb6;
        boolean Y6;
        try {
            l14.b bVar = l14.b.f396527a;
            java.lang.String str = c21549x15041e54.f279313q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getKey(...)");
            if (!l14.b.f396532f.contains(java.lang.Long.valueOf(bVar.a(str)))) {
                l14.b.f396531e.add(java.lang.Long.valueOf(bVar.a(str)));
                l14.b.f396529c = true;
            }
            java.lang.String str2 = "";
            if (i17 == 0) {
                c21549x15041e54.H("");
                sb6 = new java.lang.StringBuilder("updatePreference  IS_SHOW = ");
                sb6.append(!Y6(i17, 1));
                sb6.append(" IS_NOTIFY = ");
                Y6 = Y6(i17, 2);
            } else {
                if (!Y6(i17, 1)) {
                    if (Y6(i17, 2)) {
                        java.util.Map map = v24.p0.f514475a;
                        java.lang.String str3 = c21549x15041e54.f279313q;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getKey(...)");
                        java.lang.Integer num = (java.lang.Integer) v24.p0.f514475a.get(str3);
                        if (num != null ? v24.p0.f514477c.contains(java.lang.Integer.valueOf(num.intValue())) : false) {
                            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.isf);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
                        }
                    }
                    if (Y6(i17, 4)) {
                        java.util.Map map2 = v24.p0.f514475a;
                        java.lang.String str4 = c21549x15041e54.f279313q;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getKey(...)");
                        java.lang.Integer num2 = (java.lang.Integer) v24.p0.f514475a.get(str4);
                        if (num2 != null ? v24.p0.f514478d.contains(java.lang.Integer.valueOf(num2.intValue())) : false) {
                            if (str2.length() > 0) {
                                str2 = str2.concat("\n");
                            }
                            str2 = str2 + getString(com.p314xaae8f345.mm.R.C30867xcad56011.isd);
                        }
                    }
                    c21549x15041e54.H(str2);
                    return;
                }
                c21549x15041e54.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ise));
                sb6 = new java.lang.StringBuilder("updatePreference  IS_SHOW = ");
                sb6.append(!Y6(i17, 1));
                sb6.append(" IS_NOTIFY = ");
                Y6 = Y6(i17, 2);
            }
            sb6.append(!Y6);
            sb6.append(" IS_SHOW_NEARBY = ");
            sb6.append(!Y6(i17, 4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFindMoreV2UI", sb6.toString());
            c21549x15041e54.i().putInt("perf_extra_flag", i17);
        } finally {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updatePreference  IS_SHOW = ");
            sb7.append(!Y6(i17, 1));
            sb7.append(" IS_NOTIFY = ");
            sb7.append(!Y6(i17, 2));
            sb7.append(" IS_SHOW_NEARBY = ");
            sb7.append(!Y6(i17, 4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFindMoreV2UI", sb7.toString());
            c21549x15041e54.i().putInt("perf_extra_flag", i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cld;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cle;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return c01.e2.a0() ? com.p314xaae8f345.mm.R.xml.c_ : com.p314xaae8f345.mm.R.xml.f576473c8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x056d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x067d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0705  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17434x64616b86.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1 && intent != null) {
            int i19 = !intent.getBooleanExtra("is_show_in_findmore", false) ? 1 : 0;
            if (!intent.getBooleanExtra("is_new_notify", false)) {
                i19 |= 2;
            }
            if (!intent.getBooleanExtra("is_show_nearby", false)) {
                i19 |= 4;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h(intent.getStringExtra("perf_key"));
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) h17 : null;
            if (c21549x15041e54 != null) {
                d7(c21549x15041e54, i19);
                kc2.g1 b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).b1();
                if (b17 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c21549x15041e54.f279313q, "getKey(...)");
                    kc2.q f17 = b17.f();
                    f17.getClass();
                    f17.f388011i.set(true);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        this.f39322x2305be9.G0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f242035d = c01.z1.j();
        this.f242036e = c01.z1.n();
        this.f242037f = c01.z1.h();
        android.content.Intent intent = getIntent();
        java.lang.Long NORMAL = com.p314xaae8f345.mm.ui.t2.f291401b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(NORMAL, "NORMAL");
        this.f242038g = intent.getLongExtra("KEY_ENTER_SCENE", NORMAL.longValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFindMoreV2UI", "onCreate extStatus %d, pluginFlag %d, discoveryCtrlFlag %d", java.lang.Long.valueOf(this.f242035d), java.lang.Integer.valueOf(this.f242036e), java.lang.Long.valueOf(this.f242037f));
        l14.b bVar = l14.b.f396527a;
        l14.b.f396528b = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        l14.b.f396531e.clear();
        l14.b.f396532f.clear();
        mo43517x10010bd5();
        bVar.b(1L, bVar.a("settings_ignore"), 0L, this.f242038g);
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Ni(true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb pref) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pref, "pref");
        java.lang.String str = pref.f279313q;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_scan_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalScan.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_search_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoverySearch.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_shopping_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryShop.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_game_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryGame.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_miniprogram_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryAppbrand.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_wechatout_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryWeChatOut.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_shake_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryShake.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_nearby_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryNearby.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_nearby_live_friend_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryNearbyLiveFriends.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_look_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryLooks.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_finder_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryChannels.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi())) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryFinderLive.k(this, null)) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_ting_switch") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryTing.k(this, null)) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = pref instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) pref : null;
        if (c21549x15041e54 != null) {
            l14.b bVar = l14.b.f396527a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            bVar.b(2L, bVar.a(str), 0L, this.f242038g);
            b7(c21549x15041e54);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f242035d = c01.z1.j();
        this.f242036e = c01.z1.n();
        this.f242037f = c01.z1.h();
    }
}
