package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI */
/* loaded from: classes11.dex */
public class ActivityC17444xf577339 extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef implements l75.z0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242096g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f242097h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f242098i;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.SparseIntArray f242099m;

    public ActivityC17444xf577339() {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        this.f242099m = sparseIntArray;
        sparseIntArray.put(0, com.p314xaae8f345.mm.R.C30867xcad56011.iqc);
        sparseIntArray.put(-82, com.p314xaae8f345.mm.R.C30867xcad56011.inx);
        sparseIntArray.put(-83, com.p314xaae8f345.mm.R.C30867xcad56011.inu);
        sparseIntArray.put(-84, com.p314xaae8f345.mm.R.C30867xcad56011.inv);
        sparseIntArray.put(-85, com.p314xaae8f345.mm.R.C30867xcad56011.inq);
        sparseIntArray.put(-86, com.p314xaae8f345.mm.R.C30867xcad56011.iny);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 3;
    }

    public final void X6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).h("settings_facebook");
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsMoreSafeUI", "updateFacebook Preference null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityFacebook.h() || !c01.z1.C()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).v(h17);
        } else if (c01.z1.u()) {
            h17.H((java.lang.String) gm0.j1.u().c().l(65826, null));
        } else {
            h17.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipy));
        }
    }

    public final void Y6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).h("settings_email_addr");
        iz5.a.d(null, c16742x4f474056);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(5, null);
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        c16742x4f474056.b0(0);
        c16742x4f474056.f279285p1 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r;
        android.widget.TextView textView = c16742x4f474056.J1;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(r6, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(c16742x4f474056.Q1));
        }
        if (num != null && (num.intValue() & 2) != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c16742x4f474056.d0(w14.a.f523758a.a(str), -1, getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c16742x4f474056.d0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.inp), -1, getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        } else {
            c16742x4f474056.d0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqj), -1, getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r1.k(r2.f102805d) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6() {
        /*
            r6 = this;
            com.tencent.mm.ui.base.preference.r r0 = r6.f242096g
            com.tencent.mm.ui.base.preference.h0 r0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) r0
            java.lang.String r1 = "settings_phone_security"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.h(r1)
            com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference r0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21551x7269e8da) r0
            if (r0 != 0) goto L16
            java.lang.String r0 = "MicroMsg.SettingsMoreSafeUI"
            java.lang.String r1 = "phone_security preference is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
            return
        L16:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()
            r3 = 1
            if (r2 != 0) goto L63
            boolean r2 = c01.e2.a0()
            if (r2 == 0) goto L24
            goto L63
        L24:
            java.lang.Class<d70.i> r1 = d70.i.class
            i95.m r1 = i95.n0.c(r1)
            d70.i r1 = (d70.i) r1
            c70.e r1 = (c70.e) r1
            r1.getClass()
            bk0.a r1 = bk0.a.g()
            com.tencent.mm.storage.u3 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC
            boolean r4 = r1.f102795c
            r5 = 0
            if (r4 != 0) goto L45
            java.lang.String r1 = "MicroMsg.NewBadge"
            java.lang.String r2 = "queryHasDotSourceValue NewBadge has not initialized"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r2)
        L43:
            r3 = r5
            goto L57
        L45:
            bk0.g r4 = r1.f102793a
            bk0.e r2 = r4.b(r2)
            if (r2 != 0) goto L4e
        L4d:
            goto L43
        L4e:
            java.lang.String r2 = r2.f102805d
            int r1 = r1.k(r2)
            if (r1 != 0) goto L57
            goto L4d
        L57:
            if (r3 == 0) goto L5d
            r0.c0(r5)
            goto L62
        L5d:
            r1 = 8
            r0.c0(r1)
        L62:
            return
        L63:
            com.tencent.mm.ui.base.preference.r r0 = r6.f242096g
            com.tencent.mm.ui.base.preference.h0 r0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) r0
            r0.m(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17444xf577339.Z6():void");
    }

    public final void a7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).h("settings_bind_qq");
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsMoreSafeUI", "updateUin Preference null");
            return;
        }
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(9, 0)).intValue();
        if (intValue == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMoreSafeUI", "updateUin 0 Preference");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) != 1) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).m("settings_uin", true);
            } else {
                h17.G(com.p314xaae8f345.mm.R.C30867xcad56011.ipy);
            }
        } else {
            h17.H("" + new kk.v(intValue));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityQQ.h()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).v(h17);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        a7();
        Y6();
        X6();
        Z6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576475ca;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iti);
        this.f242096g = m79336x8b97809d();
        if (((java.lang.Integer) gm0.j1.u().c().l(9, 0)).intValue() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch bindqq");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) != 1) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).m("settings_uin", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch off");
        }
        this.f242097h = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CloseAcctUrl");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ui(this));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).m("settings_email_bind_tip_wechat", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).h("settings_email_addr");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) rn3.i.Di().c(new vn3.c(53)).first) == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).m("settings_email_bind_tip_wechat", false);
            c16742x4f474056.e0(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 2 && i18 == -1) {
            if (gm0.j1.d() != null && gm0.j1.d().f152297d != null) {
                gm0.j1.d().f152297d.C(false);
            }
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5435xbb30424e().e();
            ((com.p314xaae8f345.mm.app.o7) f14.g.a()).getClass();
            com.p314xaae8f345.mm.p642xad8b531f.q2.c();
            gm0.j1.u().c().e(this);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10();
            am.hj hjVar = c5691xc916fb10.f136017g;
            hjVar.getClass();
            hjVar.f88369a = 3;
            c5691xc916fb10.e();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1 c5180xccb1ebb1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1();
            c5180xccb1ebb1.f135526g.f88523a = true;
            c5180xccb1ebb1.e();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("show_whatsnew");
            gm0.k2.a(this, true);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            intent2.putExtra("Intro_Switch", true);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).u(intent2, mo55332x76847179());
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(256, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMoreSafeUI", str + " item has been clicked!");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (str.equals("settings_facebook")) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityFacebook.k(this, null)) {
                m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8.class);
            }
            return true;
        }
        if (str.equals("settings_email_addr")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).w("settings_email_bind_tip_wechat");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).h("settings_email_addr")).e0(false);
            gm0.j1.d().q(256, this);
            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).cj(mo55332x76847179());
            rn3.i.Di().a(53);
            return true;
        }
        if (str.equals("settings_bind_qq")) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityQQ.k(this, null)) {
                ((com.p314xaae8f345.mm.app.y7) f14.g.b()).i(new android.content.Intent(), this);
            }
            return true;
        }
        if (str.equals("settings_phone_security")) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().q(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) c21560x1fce98fb).c0(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10939, java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DEVICE_PROTECT_SECURITY_STATUS_INT_SYNC, 0)).intValue()));
            gw4.f fVar = new gw4.f(this);
            fVar.f357690b = "mmdownloadapp_HMNgrd6q8lVpXoJy7Y";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        } else if (str.equals("settings_delete_account")) {
            android.content.Intent intent = new android.content.Intent();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f242097h)) {
                intent.putExtra("rawUrl", this.f242097h + "&lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(mo55332x76847179()));
                intent.putExtra("showShare", true);
                intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                j45.l.n(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, 2);
            }
        } else if (str.equals("settings_dump_personal_data")) {
            android.content.Intent intent2 = new android.content.Intent();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f242098i)) {
                intent2.putExtra("rawUrl", this.f242098i);
                intent2.putExtra("showShare", false);
                intent2.putExtra("needRedirect", false);
                intent2.putExtra("neverGetA8Key", false);
                intent2.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent2, null);
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        a7();
        Y6();
        X6();
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowExportUserDataEntry");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            this.f242098i = "";
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).m("settings_dump_personal_data", true);
        } else {
            this.f242098i = d17;
        }
        Z6();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).v(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).h("settings_about_domainmail"));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f242097h)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).v(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242096g).h("settings_delete_account"));
        }
        gm0.j1.d().a(256, this);
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        if (m1Var.mo808xfb85f7b0() == 256) {
            if (i17 != 0 || i18 != 0) {
                ((com.p314xaae8f345.mm.app.o7) f14.g.a()).getClass();
                if (com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
                    return;
                }
            }
            int i19 = this.f242099m.get(i18);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i19 != 0) {
                try {
                    string = getString(i19);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsMoreSafeUI", "try get string by id %d, fail:%s", java.lang.Integer.valueOf(i19), e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsMoreSafeUI", e17, "", new java.lang.Object[0]);
                }
            }
            db5.e1.T(mo55332x76847179(), string);
        }
    }
}
