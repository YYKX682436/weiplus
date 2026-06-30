package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/CreatePackageUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lro1/e;", "<init>", "()V", "zo1/y0", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI */
/* loaded from: classes5.dex */
public final class ActivityC12868xd8a7d79e extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements ro1.e {

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.ref.WeakReference f174347u;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174348d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f174349e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f174350f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f174351g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f174352h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f174353i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f174354m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f174355n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f174356o;

    /* renamed from: p, reason: collision with root package name */
    public final long f174357p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f174358q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 f174359r;

    /* renamed from: s, reason: collision with root package name */
    public po1.d f174360s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f174361t;

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, po1.d dVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        java.lang.String str;
        activityC12868xd8a7d79e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "begin save new package");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h hVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h();
        hVar.f297371d = 0L;
        hVar.f297372e = 0;
        java.lang.String str2 = dVar.f438828a;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.g(false, new zo1.g1(f0Var, countDownLatch, str2));
        countDownLatch.await();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "getMaxPackageNumberByDevice maxNumber = " + f0Var.f391649d + ", targetDeviceId=" + str2);
        int i17 = f0Var.f391649d + 1;
        if (i17 <= 1) {
            str = "WXGBACKUPPACKAGEPREFIX_" + activityC12868xd8a7d79e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwy);
        } else {
            str = "WXGBACKUPPACKAGEPREFIX_" + activityC12868xd8a7d79e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwz, java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g();
        gVar.f297363e = 0;
        gVar.f297364f = str;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u();
        uVar.f297522e = dVar.f438828a;
        uVar.f297521d = dVar.f438829b.h();
        uVar.f297524g = dVar.b();
        uVar.f297523f = dVar.f438832e;
        gVar.f297365g = uVar;
        gVar.f297366h = "source_device_id";
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12868xd8a7d79e.f174359r;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        gVar.f297367i = c12853x6acde7c9.b();
        gVar.f297368m = activityC12868xd8a7d79e.f174358q;
        gVar.f297370o = hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Try save package to SDK and backend");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.e().a(kz5.c0.d(gVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w(new zo1.a1(u3Var, activityC12868xd8a7d79e, dVar)));
    }

    public final void V6(yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.mx8), true, 3, new zo1.f1(h0Var));
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(lVar);
        h0Var.f391656d = ((ku5.t0) ku5.t0.f394148d).q(new zo1.e1(f17, weakReference));
    }

    public final void W6() {
        if ((this.f174358q & 1) != 0) {
            android.widget.TextView textView = this.f174354m;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mxw);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoBackupTv");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.f174354m;
        if (textView2 != null) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mxu);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoBackupTv");
            throw null;
        }
    }

    @Override // ro1.e
    public void X4(java.util.List devices) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devices, "devices");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "[onVolumeUnmounted] deviceListSize=" + devices.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.X6():void");
    }

    public final void Y6(po1.d dVar) {
        this.f174360s = dVar;
        android.widget.TextView textView = this.f174349e;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.TextView textView2 = this.f174349e;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
            throw null;
        }
        textView2.setText(dVar.b());
        android.widget.TextView textView3 = this.f174349e;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceNameTv");
            throw null;
        }
        textView3.setTextColor(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f174348d;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
            throw null;
        }
        c22699x3dcdb352.setVisibility(0);
        int ordinal = dVar.f438829b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f174348d;
            if (c22699x3dcdb3522 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
                throw null;
            }
            c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f80080x185fe337);
        } else if (ordinal != 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f174348d;
            if (c22699x3dcdb3523 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
                throw null;
            }
            c22699x3dcdb3523.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f174348d;
            if (c22699x3dcdb3524 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceIcon");
                throw null;
            }
            c22699x3dcdb3524.setImageResource(com.p314xaae8f345.mm.R.raw.f80343xde51652c);
        }
        if (!r26.i0.A(dVar.f438828a, "#OnlineDeviceId@", false, 2, null) && !ro1.v.f479547a.f(dVar)) {
            oo1.o.f428684a.a(dVar.f438828a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Target device is a unbound device=" + dVar + ", skip saving to mmkv");
    }

    @Override // ro1.e
    public void e5(java.util.List devices) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devices, "devices");
        if (devices.isEmpty()) {
            return;
        }
        V6(new zo1.x1(devices, this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && intent != null && i17 == 125) {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra("convParcelRange");
            if (parcelableExtra == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CreatePackageUI", "Fail to parse backup range from result intent");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9) parcelableExtra;
            this.f174359r = c12853x6acde7c9;
            if (c12853x6acde7c9.f174267h > 0) {
                this.f174358q &= -2;
            }
            android.widget.TextView textView = this.f174356o;
            if (textView != null) {
                textView.setVisibility(8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("estimatedSizeTv");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreatePackageUI", "Roam is disable");
            finish();
        }
        f174347u = new java.lang.ref.WeakReference(this);
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new zo1.h1(this), com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0);
        mo78530x8b45058f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174474i);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 2L;
        c6839x89375b51.f141600e = 1L;
        c6839x89375b51.k();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.rhj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174348d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.rhk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174349e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rhn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174350f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.rho);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174351g = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.rhp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f174352h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.rhq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f174353i = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.rcs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f174354m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.rht);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f174356o = (android.widget.TextView) findViewById8;
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rhs)).setOnClickListener(new zo1.i1(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rhm)).setOnClickListener(new zo1.j1(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rcr)).setOnClickListener(new zo1.l1(this));
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.rhr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById9;
        this.f174355n = button;
        button.setOnClickListener(new zo1.m1(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "setup default rule");
        this.f174359r = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9(null, null, null, 0L, 0L, 31, null);
        android.widget.TextView textView = this.f174356o;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("estimatedSizeTv");
            throw null;
        }
        textView.setVisibility(8);
        onNewIntent(getIntent());
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f174347u = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onNewIntent(intent);
        if (intent != null && (stringExtra = intent.getStringExtra("deviceInfo")) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "onNewIntent updateTargetDevice, defaultDevice = ".concat(stringExtra));
            po1.d b17 = po1.d.f438827i.b(stringExtra);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreatePackageUI", "Fail to parse device from ".concat(stringExtra));
            } else {
                Y6(b17);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f174361t;
        if (y1Var != null) {
            y1Var.q();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a2.INSTANCE.h();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ro1.t tVar = ro1.t.f479541d;
        ro1.t.f479543f.remove(this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        W6();
        ro1.t tVar = ro1.t.f479541d;
        ro1.t.f479543f.add(this);
    }
}
