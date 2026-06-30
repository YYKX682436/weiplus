package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera */
/* loaded from: classes11.dex */
public class ActivityC17400xd8a304cf extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241783g;

    /* renamed from: h, reason: collision with root package name */
    public long f241784h;

    /* renamed from: i, reason: collision with root package name */
    public int f241785i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f241786m = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 3;
    }

    public final boolean X6(long j17) {
        return (j17 & c01.z1.i()) != 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576469c4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f241783g = m79336x8b97809d();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d.Y6()) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iwg);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iwf);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d5(this));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).h("settings_auto_mul_terminal_sync");
        boolean z17 = false;
        c21541x1c1b08fe.f279318v = false;
        c21541x1c1b08fe.O(booleanValue);
        boolean booleanValue2 = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, bool)).booleanValue();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).h("settings_take_photo_auto_save_photo");
        c21541x1c1b08fe2.f279318v = false;
        c21541x1c1b08fe2.O(booleanValue2);
        boolean booleanValue3 = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, bool)).booleanValue();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).h("settings_take_photo_auto_save_video");
        c21541x1c1b08fe3.O(booleanValue3);
        c21541x1c1b08fe3.f279318v = false;
        boolean booleanValue4 = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, bool)).booleanValue();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).h("settings_sns_auto_play_switch");
        c21541x1c1b08fe4.O(booleanValue4);
        c21541x1c1b08fe4.f279318v = false;
        if (((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ni()) {
            boolean X6 = X6(1L);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).h("setting_c2c_gallery_query");
            c21541x1c1b08fe5.O(X6);
            c21541x1c1b08fe5.f279318v = false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d.Y6()) {
            boolean z18 = (this.f241784h & 137438953472L) != 0;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe6 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).h("settings_voip_audio_switch_mobile_net");
            c21541x1c1b08fe6.O(!z18);
            c21541x1c1b08fe6.f279318v = false;
        }
        boolean z19 = !X6(137438953472L);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe7 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).h("setting_c2c_media_clear");
        c21541x1c1b08fe7.O(!z19);
        c21541x1c1b08fe7.f279318v = false;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).notifyDataSetChanged();
        if (this.f241785i == 1) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_sns_auto_play_switch", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_sns_auto_play_tip", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_take_photo_auto_save_photo", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_take_photo_auto_save_video", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_auto_mul_terminal_sync", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_auto_mul_terminal_sync_tip", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_take_photo_auto_save_tip", true);
        } else {
            boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_autoplay, 0) == 1;
            java.lang.String lowerCase = wo.w0.m().toLowerCase();
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_video_autoplay_disable_device, "", true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) || !Zi.contains(lowerCase)) {
                z17 = z27;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ui.settings.SettingsAboutCamera", "model %s is hit, expt:%s", lowerCase, Zi);
            }
            if (!z17) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_sns_auto_play_switch", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_sns_auto_play_tip", true);
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d.Y6()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_voip_audio_switch_mobile_net", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("settings_voip_audio_switch_mobile_net_tip", true);
            }
        }
        if (((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ni()) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("setting_c2c_gallery_query", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241783g).m("setting_c2c_gallery_query_tips", true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f241784h = c01.z1.j();
        this.f241785i = getIntent().getIntExtra("activity_caller_params", 0);
        this.f241786m = getIntent().getIntExtra("enter_scene", 0);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6873x79cc99ee c6873x79cc99ee = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6873x79cc99ee();
        c6873x79cc99ee.f141913d = 2;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        c6873x79cc99ee.f141914e = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue() ? 1 : 2;
        c6873x79cc99ee.f141915f = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        c6873x79cc99ee.f141916g = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        c6873x79cc99ee.f141917h = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        c6873x79cc99ee.f141918i = X6(1L) ? 1 : 2;
        c6873x79cc99ee.k();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        int i17;
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str.equals("settings_auto_mul_terminal_sync")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.valueOf(!((java.lang.Boolean) c17.m(r6, java.lang.Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_take_photo_auto_save_photo")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, java.lang.Boolean.valueOf(!((java.lang.Boolean) c18.m(r7, java.lang.Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_take_photo_auto_save_video")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, java.lang.Boolean.valueOf(!((java.lang.Boolean) c19.m(r8, java.lang.Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_sns_auto_play_switch")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.valueOf(!((java.lang.Boolean) c27.m(r9, java.lang.Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_voip_audio_switch_mobile_net")) {
            boolean N = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ui.settings.SettingsAboutCamera", "switch ext change : open = " + N + " item value = 137438953472 functionId = 58");
            if (N) {
                this.f241784h &= -137438953473L;
            } else {
                this.f241784h |= 137438953472L;
            }
            int i18 = N ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 58;
            p53Var.f464295e = i18;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f241784h));
        }
        if (str.equals("setting_c2c_gallery_query")) {
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).bj(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N());
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Di(3);
        }
        if (str.equals("setting_c2c_media_clear")) {
            boolean z17 = !((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ui.settings.SettingsAboutCamera", "switch ext2 change : open = " + z17 + " item value = 137438953472 functionId = 97");
            long i19 = c01.z1.i();
            long j17 = z17 ? i19 & (-137438953473L) : i19 | 137438953472L;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
            bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
            int i27 = z17 ? 2 : 1;
            r45.p53 p53Var2 = new r45.p53();
            p53Var2.f464294d = 97;
            p53Var2.f464295e = i27;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var2));
            i17 = 1;
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).qj(z17, this.f241786m == 1);
        } else {
            i17 = 1;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6873x79cc99ee c6873x79cc99ee = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6873x79cc99ee();
        c6873x79cc99ee.f141913d = 3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "settings_auto_mul_terminal_sync")) {
            c6873x79cc99ee.f141914e = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() ? i17 : 2;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "settings_take_photo_auto_save_photo")) {
            c6873x79cc99ee.f141915f = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() ? i17 : 2;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "settings_take_photo_auto_save_video")) {
            c6873x79cc99ee.f141916g = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() ? i17 : 2;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "settings_sns_auto_play_switch")) {
            c6873x79cc99ee.f141917h = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue() ? i17 : 2;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "setting_c2c_gallery_query")) {
            c6873x79cc99ee.f141918i = X6(1L) ? i17 : 2;
        }
        c6873x79cc99ee.k();
        W6(this.f241783g, c21560x1fce98fb.f279313q);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f241785i == 1) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
            qp1.h0.a(true, false, true);
        }
        W6(this.f241783g, "settings_auto_mul_terminal_sync");
        W6(this.f241783g, "settings_take_photo_auto_save_photo");
        W6(this.f241783g, "settings_take_photo_auto_save_video");
        W6(this.f241783g, "settings_sns_auto_play_switch");
        W6(this.f241783g, "settings_voip_audio_switch_mobile_net");
        W6(this.f241783g, "setting_c2c_gallery_query");
        W6(this.f241783g, "setting_c2c_media_clear");
    }
}
