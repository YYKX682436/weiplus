package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI */
/* loaded from: classes15.dex */
public class ActivityC13462x5ea70b8a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int I = 0;
    public n32.b B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1 C;
    public com.p314xaae8f345.mm.p971x6de15a2e.s0 D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 E;
    public android.net.wifi.WifiManager.MulticastLock F;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f180747d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180748e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f180749f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f180750g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f180751h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.TextWatcher f180752i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f180753m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f180754n;

    /* renamed from: o, reason: collision with root package name */
    public n32.a f180755o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f180756p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f180757q;

    /* renamed from: r, reason: collision with root package name */
    public int f180758r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f180759s;

    /* renamed from: t, reason: collision with root package name */
    public int f180760t;

    /* renamed from: u, reason: collision with root package name */
    public int f180761u;

    /* renamed from: v, reason: collision with root package name */
    public int f180762v;

    /* renamed from: y, reason: collision with root package name */
    public int f180765y;

    /* renamed from: z, reason: collision with root package name */
    public long f180766z;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f180763w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f180764x = "";
    public boolean A = false;
    public final java.lang.Runnable G = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e1(this);
    public boolean H = true;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a) {
        activityC13462x5ea70b8a.A = true;
        activityC13462x5ea70b8a.f180766z = java.lang.System.currentTimeMillis();
        activityC13462x5ea70b8a.a7(3);
        java.lang.String X6 = activityC13462x5ea70b8a.X6();
        java.lang.String str = activityC13462x5ea70b8a.f180754n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "do start AirKiss, ssid(%s).", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid is invalid");
            dp.a.m125854x26a183b(activityC13462x5ea70b8a.mo55332x76847179(), "SSID is invalid", 0).show();
        } else {
            activityC13462x5ea70b8a.b7(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1.SETTING);
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v0(activityC13462x5ea70b8a, X6, str));
        }
    }

    public final void U6(boolean z17, boolean z18, boolean z19) {
        android.view.View view = this.f180747d;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI", "changeUiStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI", "changeUiStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z18) {
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.a1(this));
        } else {
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.b1(this));
            if (this.F.isHeld()) {
                this.F.release();
            }
        }
        if (z19) {
            dp.a.m125853x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.c2z, 0).show();
        }
    }

    public final void V6() {
        n32.a aVar = this.f180755o;
        aVar.f416008f = "";
        aVar.f416007e = "";
        java.lang.String str = this.f180754n;
        n32.a W6 = W6(this.f180758r, str);
        if (W6 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W6.f416008f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Do not have a local password to fill for the current wifi.");
            this.B.f416009d.remove(W6);
            this.f180756p = true;
            return;
        }
        n32.a aVar2 = this.f180755o;
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        java.lang.String str2 = W6.f416008f;
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r1.a(this.f180758r, W6.f416007e);
        ((zd0.e) hVar).getClass();
        aVar2.f416008f = xp1.c.h(str2, a17);
        this.f180755o.f416007e = W6.f416007e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.G);
    }

    public final n32.a W6(int i17, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || this.B == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid or wifiInfoList is null or nil.");
            return null;
        }
        int i18 = 0;
        while (i18 < this.B.f416009d.size()) {
            n32.a aVar = (n32.a) this.B.f416009d.get(i18);
            if (aVar == null) {
                this.B.f416009d.remove(i18);
                this.f180756p = true;
                i18--;
            } else if (aVar.f416006d == i17 && str.equals(aVar.f416007e)) {
                return aVar;
            }
            i18++;
        }
        return null;
    }

    public final java.lang.String X6() {
        if (this.f180750g.getText() != null) {
            return this.f180750g.getText().toString();
        }
        return null;
    }

    public final void Y6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("device_scan_mode", getIntent().getStringExtra("device_scan_mode"));
        intent.putExtra("device_scan_conn_proto", getIntent().getStringExtra("device_scan_conn_proto"));
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, getIntent().getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030));
        intent.putExtra("device_type", getIntent().getStringExtra("device_type"));
        intent.putExtra("device_title", getIntent().getStringExtra("device_title"));
        intent.putExtra("device_desc", getIntent().getStringExtra("device_desc"));
        intent.putExtra("device_icon_url", getIntent().getStringExtra("device_icon_url"));
        intent.putExtra("device_category_id", getIntent().getStringExtra("device_category_id"));
        intent.putExtra("device_brand_name", getIntent().getStringExtra("device_brand_name"));
        intent.putExtra("bind_ticket", getIntent().getStringExtra("bind_ticket"));
        j45.l.j(mo55332x76847179(), "exdevice", ".ui.ExdeviceBindDeviceUI", intent, null);
    }

    public final void Z6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1 s1Var = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1.NORMAL : this.C;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(this) != 0) {
            s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1.NO_WIFI_CONNECTED;
        } else {
            java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.e(false);
            this.f180754n = e17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Get SSID(%s)", e17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180754n)) {
                this.f180748e.setText("");
            } else {
                this.f180748e.setText(this.f180754n);
            }
        }
        b7(s1Var);
    }

    public final void a7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13503, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f180762v), java.lang.Long.valueOf(i17 == 4 ? java.lang.System.currentTimeMillis() - this.f180766z : 0L), this.f180763w, this.f180764x, java.lang.Integer.valueOf(this.f180765y));
    }

    public synchronized void b7(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1 s1Var) {
        if (s1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Status is null.");
            return;
        }
        this.C = s1Var;
        int ordinal = s1Var.ordinal();
        if (ordinal == 0) {
            U6(true, false, false);
        } else if (ordinal == 1) {
            U6(false, false, false);
        } else if (ordinal == 2) {
            U6(true, true, false);
        } else if (ordinal == 3) {
            a7(4);
            U6(true, false, true);
            this.f180757q = true;
            setResult(-1);
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.y0(this));
            if (getIntent().getBooleanExtra("jumpToBindDevice", false)) {
                Y6();
            }
            finish();
        } else if (ordinal == 4) {
            a7(5);
            this.f180757q = true;
            setResult(1);
            finish();
        }
        if (s1Var != com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1.NORMAL) {
            this.f180750g.clearFocus();
            mo48674x36654fab();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9n;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c2x);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m1(this));
        this.f180747d = findViewById(com.p314xaae8f345.mm.R.id.mn8);
        this.f180748e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k3h);
        this.f180749f = findViewById(com.p314xaae8f345.mm.R.id.f564461s3);
        this.f180750g = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.kpu);
        this.f180751h = findViewById(com.p314xaae8f345.mm.R.id.f565398ca0);
        this.f180752i = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n1(this);
        this.f180747d.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o1(this));
        this.f180751h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p1(this));
        this.f180750g.setTransformationMethod(new android.text.method.PasswordTransformationMethod());
        this.f180750g.addTextChangedListener(this.f180752i);
        this.f180750g.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q1(this));
        this.f180750g.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u0(this));
        this.f180750g.requestFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r12 == false) goto L20;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.A) {
            a7(2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().d(0, this.E);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 77 && iArr.length > 0 && iArr[0] == -1) {
            this.H = false;
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.c1(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        Z6(false);
        gm0.j1.n().a(this.D);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.n().d(this.D);
    }
}
