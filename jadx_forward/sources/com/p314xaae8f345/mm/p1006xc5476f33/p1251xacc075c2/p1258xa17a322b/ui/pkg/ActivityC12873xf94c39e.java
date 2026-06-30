package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "zo1/x3", "zo1/k4", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI */
/* loaded from: classes5.dex */
public final class ActivityC12873xf94c39e extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: q, reason: collision with root package name */
    public static final zo1.x3 f174397q = new zo1.x3(null);

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.ref.WeakReference f174398r;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f174399e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f174400f;

    /* renamed from: i, reason: collision with root package name */
    public long f174403i;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f174406o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f174407p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f174401g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final zo1.k4 f174402h = new zo1.k4();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f174404m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f174405n = -1;

    public static final void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e, boolean z17) {
        if (!z17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC12873xf94c39e.f174400f;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("packageRecyclerView");
                throw null;
            }
            c1163xf1deaba4.setVisibility(0);
            android.widget.LinearLayout linearLayout = activityC12873xf94c39e.f174399e;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listEmptyLl");
                throw null;
            }
            linearLayout.setVisibility(8);
            activityC12873xf94c39e.mo74408xb0dfae51(true);
            activityC12873xf94c39e.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a7p);
            activityC12873xf94c39e.m78599xdf056fb4();
            int color = activityC12873xf94c39e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
            activityC12873xf94c39e.mo64405x4dab7448(color);
            activityC12873xf94c39e.mo78578x8b18f126(color);
            activityC12873xf94c39e.m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = activityC12873xf94c39e.f174400f;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("packageRecyclerView");
            throw null;
        }
        c1163xf1deaba42.setVisibility(8);
        activityC12873xf94c39e.mo74408xb0dfae51(false);
        activityC12873xf94c39e.mo54450xbf7c1df6("");
        activityC12873xf94c39e.mo78530x8b45058f();
        android.widget.LinearLayout linearLayout2 = activityC12873xf94c39e.f174399e;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listEmptyLl");
            throw null;
        }
        if (linearLayout2.getVisibility() != 0) {
            android.widget.LinearLayout linearLayout3 = activityC12873xf94c39e.f174399e;
            if (linearLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listEmptyLl");
                throw null;
            }
            linearLayout3.setAlpha(0.0f);
            android.widget.LinearLayout linearLayout4 = activityC12873xf94c39e.f174399e;
            if (linearLayout4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listEmptyLl");
                throw null;
            }
            linearLayout4.setVisibility(0);
            android.widget.LinearLayout linearLayout5 = activityC12873xf94c39e.f174399e;
            if (linearLayout5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listEmptyLl");
                throw null;
            }
            sa5.d.a(linearLayout5, new sa5.l(0.0f, 1, null), 300L, null);
        }
        int color2 = activityC12873xf94c39e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        activityC12873xf94c39e.mo64405x4dab7448(color2);
        activityC12873xf94c39e.mo78578x8b18f126(color2);
        activityC12873xf94c39e.m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
    }

    public final void a7() {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "hideLoadingToast");
        this.f174407p = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f174406o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f174406o = null;
    }

    public final void b7(boolean z17, yz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.g(z17, new zo1.o4(java.lang.System.currentTimeMillis(), this, z17, lVar));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dwb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult, resultCode=");
            sb6.append(i18);
            sb6.append(", data=");
            sb6.append(intent != null ? java.lang.Integer.valueOf(intent.hashCode()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectPackageUI", sb6.toString());
            return;
        }
        if (i17 == 122) {
            long longExtra = intent.getLongExtra("packageId", -1L);
            if (longExtra == -1) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "A new package created. pkgId=" + longExtra);
            ((java.util.ArrayList) this.f174401g).add(java.lang.Long.valueOf(longExtra));
            this.f174405n = longExtra;
            return;
        }
        if (i17 != 123) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectPackageUI", "[onActivityResult] request code = " + i17);
            return;
        }
        long longExtra2 = intent.getLongExtra("packageId", -1L);
        if (longExtra2 == -1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "Restore task is started. pkgId=" + longExtra2);
        this.f174405n = longExtra2;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().a(true);
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectPackageUI", "Roam is disable");
            finish();
        }
        f174398r = new java.lang.ref.WeakReference(this);
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new zo1.p4(this));
        m78478x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f79996xebd1f109, new zo1.q4(this));
        mo74408xb0dfae51(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.D);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 7L;
        c6839x89375b51.f141600e = 1L;
        c6839x89375b51.k();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.s0c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f174400f = c1163xf1deaba4;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f174400f;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("packageRecyclerView");
            throw null;
        }
        c1163xf1deaba42.m7964x8d4ad49c(new vo1.q());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f174400f;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("packageRecyclerView");
            throw null;
        }
        c1163xf1deaba43.mo7960x6cab2c8d(this.f174402h);
        this.f174402h.f556206d = new zo1.r4(this);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.s0b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174399e = (android.widget.LinearLayout) findViewById2;
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.s0a)).setOnClickListener(new zo1.s4(this));
        qo1.j1 j1Var = qo1.j1.f447056a;
        synchronized (j1Var.c()) {
            for (java.util.Map.Entry entry : j1Var.c().entrySet()) {
                long longValue = ((java.lang.Number) entry.getKey()).longValue();
                qo1.j0 j0Var = (qo1.j0) entry.getValue();
                if ((j0Var instanceof qo1.v0) && ((qo1.v0) j0Var).f447090x) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskManager", "Disable show auto backup error, pkgId=" + longValue);
                    ((qo1.v0) j0Var).f447090x = false;
                    if (!j0Var.b() && !((qo1.v0) j0Var).p()) {
                        ((qo1.v0) j0Var).f447011d = -1L;
                    }
                }
            }
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a;
        ((ku5.t0) u0Var).q(new java.lang.Runnable() { // from class: zo1.t4
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.this;
                c12844xf7745c1a2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Try to find the target accessory to open");
                jz5.l a17 = c12844xf7745c1a2.a();
                android.hardware.usb.UsbAccessory usbAccessory = (android.hardware.usb.UsbAccessory) a17.f384366d;
                boolean booleanValue = ((java.lang.Boolean) a17.f384367e).booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "accessory = %s, granted = %s", usbAccessory, java.lang.Boolean.valueOf(booleanValue));
                if (usbAccessory != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a3 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a;
                    if (booleanValue) {
                        c12844xf7745c1a3.c(usbAccessory);
                    } else {
                        c12844xf7745c1a3.e(usbAccessory);
                    }
                }
            }
        });
        onNewIntent(getIntent());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        f174398r = null;
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().a(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        if (intent.getBooleanExtra("expandCard", false)) {
            java.lang.String stringExtra = intent.getStringExtra("deviceId");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f174404m = stringExtra;
            this.f174405n = intent.getLongExtra("packageId", -1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "[onNewIntent] expandByDeviceId=" + this.f174404m + ", expandByPkgId=" + this.f174405n);
            return;
        }
        if (!intent.getBooleanExtra("sub-intent", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "This intent is not a sub intent.");
            return;
        }
        po1.d b17 = po1.d.f438827i.b(intent.getStringExtra("deviceInfo"));
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectPackageUI", "Try to start next activity, but not match any target.");
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "Find a bound device=" + b17);
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.class);
        intent2.putExtra("deviceInfo", b17.c());
        ((ku5.t0) ku5.t0.f394148d).B(new zo1.l4(this, intent2));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        a7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.p(this.f174402h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174223g = null;
        zo1.k4 listener = this.f174402h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174221e.remove(listener);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242587c = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
        android.text.style.TextAppearanceSpan textAppearanceSpan = zo1.k4.f556201i;
        zo1.k4.f556201i = new android.text.style.TextAppearanceSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30868x68b1db1.f576039yc);
        zo1.k4.f556203n = new android.text.style.TextAppearanceSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30868x68b1db1.f576038yb);
        new android.graphics.PorterDuffColorFilter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f174407p = true;
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: zo1.w4
            @Override // java.lang.Runnable
            public final void run() {
                zo1.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.f174397q;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.this;
                activityC12873xf94c39e.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
                if (!activityC12873xf94c39e.f174407p) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "Showing toast is not allowed.");
                } else if (activityC12873xf94c39e.f174406o != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "Loading toast is showing already.");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "showLoadingToast");
                    activityC12873xf94c39e.f174406o = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC12873xf94c39e, activityC12873xf94c39e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwe), true, 3, new zo1.h5(activityC12873xf94c39e));
                }
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 500L, false);
        if (java.lang.System.currentTimeMillis() - this.f174403i > 300000) {
            b7(false, new zo1.x4(this));
            b7(true, new zo1.y4(this));
        } else {
            b7(false, new zo1.z4(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.b(this.f174402h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174223g = new zo1.a5(this);
        zo1.k4 listener = this.f174402h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174221e.add(listener);
    }
}
