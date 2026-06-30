package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI */
/* loaded from: classes13.dex */
public class ActivityC13460xef0a2250 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f180728y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f180729d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 f180730e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f180731f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f180732g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180733h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f180734i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ScrollView f180735m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f180736n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f180737o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f180738p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 f180739q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f180740r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f180741s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 f180742t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.b2 f180743u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f180744v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f180745w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f180746x = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void D3(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", str, str2, java.lang.Boolean.valueOf(z17));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0(this, null);
        t0Var.f181198b = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0.CONNECT_PROTO_TYPE_BLUE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q0(this, null);
        t0Var.f181199c = q0Var;
        q0Var.f181158a = str;
        q0Var.f181159b = a42.i.g(a42.i.h(str2));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.j0(this, t0Var));
    }

    public void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 t0Var) {
        if (this.f180730e.a(t0Var.b()) >= 0) {
            return;
        }
        t0Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 o0Var = this.f180730e;
        o0Var.getClass();
        if (!(o0Var.a(t0Var.b()) >= 0)) {
            t0Var.f181197a = o0Var.c(t0Var);
            ((java.util.ArrayList) o0Var.f181128d).add(t0Var);
        }
        this.f180730e.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0 p0Var = t0Var.f181198b;
        if (p0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0.CONNECT_PROTO_TYPE_BLUE) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice doScene, mac(%s), brandName(%s),categoryId(%s)", t0Var.f181199c.f181159b, this.f180741s, this.f180740r);
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m2(t0Var.f181199c.f181159b, this.f180741s, this.f180740r));
        } else {
            if (p0Var != com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p0.CONNECT_PROTO_TYPE_WIFI) {
                iz5.a.g(null, false);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r0 r0Var = t0Var.f181200d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice doScene, deviceType(%s), deviceId(%s)", r0Var.f181169a, r0Var.f181170b);
            com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r0 r0Var2 = t0Var.f181200d;
            r1Var.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o2(r0Var2.f181169a, r0Var2.f181170b, t0Var.f181205i));
        }
    }

    public final void U6(int i17) {
        if (i17 == 0) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2_);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), 0, string.length(), 33);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.l0(this), 0, string.length(), 33);
            this.f180733h.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.f180733h.setText(spannableString);
        } else if (i17 == 1) {
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2c);
            java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2x);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(string2 + string3);
            spannableString2.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), string2.length(), string2.length() + string3.length(), 33);
            spannableString2.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.c0(this), string2.length(), string2.length() + string3.length(), 33);
            this.f180733h.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.f180733h.setText(spannableString2);
        } else if (i17 == 2) {
            java.lang.String string4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2b);
            java.lang.String string5 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2a);
            android.text.SpannableString spannableString3 = new android.text.SpannableString(string4 + string5);
            spannableString3.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), string4.length(), string4.length() + string5.length(), 33);
            spannableString3.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m0(this), string4.length(), string4.length() + string5.length(), 33);
            this.f180733h.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.f180733h.setText(spannableString3);
        }
        if (i17 == 0 || i17 == 1 || i17 == 2 || i17 == 3) {
            this.f180734i.setImageResource(com.p314xaae8f345.mm.R.raw.f78667xd67389c);
            this.f180736n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2j);
            this.f180737o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c28);
        } else if (i17 == 4) {
            this.f180734i.setImageResource(com.p314xaae8f345.mm.R.raw.f78667xd67389c);
            this.f180736n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2h);
            this.f180737o.setText("");
        } else if (i17 == 5) {
            this.f180734i.setImageResource(com.p314xaae8f345.mm.R.raw.f81428x5380f495);
            this.f180736n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2j);
            this.f180737o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2e);
        }
        if (i17 == 0 || i17 == 1 || i17 == 2) {
            android.view.View view = this.f180731f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f180729d.setVisibility(0);
            this.f180733h.setVisibility(0);
            this.f180734i.setVisibility(8);
            this.f180736n.setVisibility(8);
            this.f180737o.setVisibility(8);
            return;
        }
        if (i17 == 3 || i17 == 4 || i17 == 5) {
            this.f180735m.setVisibility(8);
            android.view.View view2 = this.f180731f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f180729d.setVisibility(8);
            this.f180733h.setVisibility(8);
            this.f180734i.setVisibility(0);
            this.f180736n.setVisibility(0);
            if (i17 == 4) {
                this.f180737o.setVisibility(8);
            } else {
                this.f180737o.setVisibility(0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void V0(java.lang.String str, int i17, long j17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9k;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f180729d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.a9m, null);
        android.view.View inflate2 = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.a_j, null);
        this.f180738p = inflate2;
        this.f180731f = inflate2.findViewById(com.p314xaae8f345.mm.R.id.mfu);
        this.f180732g = (android.widget.TextView) this.f180738p.findViewById(com.p314xaae8f345.mm.R.id.o_y);
        this.f180733h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.m__);
        this.f180734i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ipj);
        this.f180736n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dh_);
        this.f180737o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dha);
        this.f180735m = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.cwq);
        this.f180729d.addHeaderView(inflate, null, false);
        this.f180729d.addFooterView(this.f180738p, null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0(this.f180741s, this.f180739q, this.f180740r);
        this.f180730e = o0Var;
        this.f180729d.setAdapter((android.widget.ListAdapter) o0Var);
        this.f180729d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h0(this));
        if (this.f180745w && !this.f180744v) {
            if (!lq1.a.d(mo55332x76847179())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "now sdk version not support ble device : %d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                U6(4);
                return;
            } else if (!lq1.a.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "Bluetooth is not open, Just leave");
                U6(3);
                return;
            }
        }
        if (!this.f180745w && this.f180744v && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(mo55332x76847179())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "wifi is not open, Just leave");
            U6(5);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 s0Var = this.f180739q;
        if (s0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0.SCAN_MY_DEVICE) {
            U6(0);
            return;
        }
        if (s0Var != com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0.SCAN_CATALOG) {
            if (s0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0.SCAN_ALL) {
                iz5.a.g(null, false);
                return;
            } else {
                iz5.a.g(null, false);
                return;
            }
        }
        boolean z17 = this.f180745w;
        if (z17 && this.f180744v) {
            iz5.a.g(null, false);
            U6(1);
        } else if (z17) {
            U6(2);
        } else if (this.f180744v) {
            U6(1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void o1(java.lang.String str, byte[] bArr, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 o0Var = this.f180730e;
        int i19 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) o0Var.f181128d;
            if (i19 >= arrayList.size()) {
                this.f180730e.notifyDataSetChanged();
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) arrayList.get(i19);
                t0Var.f181197a = o0Var.c(t0Var);
                i19++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d0(this));
        android.content.Intent intent = getIntent();
        this.f180740r = intent.getStringExtra("device_category_id");
        this.f180741s = intent.getStringExtra("device_brand_name");
        java.lang.String stringExtra = intent.getStringExtra("device_type");
        if (stringExtra != null) {
            stringExtra.length();
        }
        java.lang.String stringExtra2 = intent.getStringExtra("device_scan_conn_proto");
        java.lang.String stringExtra3 = intent.getStringExtra("device_scan_mode");
        java.lang.String stringExtra4 = intent.getStringExtra("device_title");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
            stringExtra4 = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c3_);
        }
        boolean contains = stringExtra3.contains("SCAN_MY_DEVICE");
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0.SCAN_CATALOG;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0.SCAN_MY_DEVICE;
        if (contains) {
            this.f180739q = s0Var2;
            str = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572664c23);
        } else if (stringExtra3.compareTo("SCAN_CATALOG") == 0) {
            this.f180739q = s0Var;
            str = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572662c21);
        } else {
            iz5.a.g(null, false);
            str = "";
        }
        mo54450xbf7c1df6(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s0 s0Var3 = this.f180739q;
        if (s0Var3 == s0Var) {
            this.f180744v = stringExtra2.contains("wifi");
            this.f180745w = stringExtra2.contains("blue");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "mIsScanWifi(%b), mIsScanBlue(%b)", java.lang.Boolean.valueOf(this.f180744v), java.lang.Boolean.valueOf(this.f180745w));
        } else if (s0Var3 == s0Var2) {
            this.f180745w = true;
            this.f180744v = true;
        }
        this.f180742t = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f0(this);
        this.f180743u = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.g0(this);
        mo43517x10010bd5();
        this.f180732g.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c4q, stringExtra4));
        gm0.j1.n().f354821b.a(1264, this);
        gm0.j1.n().f354821b.a(1706, this);
        gm0.j1.n().f354821b.a(1270, this);
        gm0.j1.n().f354821b.a(1719, this);
        if (this.f180745w) {
            java.util.LinkedList linkedList = (java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().f180545a;
            if (!linkedList.contains(this)) {
                linkedList.add(this);
            }
        }
        if (this.f180744v) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().c(10, this.f180742t);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().c(11, this.f180743u);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55003x7c991ace();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f180744v) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i0(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().d(10, this.f180742t);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c2.a().d(11, this.f180743u);
        }
        if (this.f180745w) {
            ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().f180545a).remove(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ni().e();
        }
        gm0.j1.n().f354821b.q(1264, this);
        gm0.j1.n().f354821b.q(1706, this);
        gm0.j1.n().f354821b.q(1270, this);
        gm0.j1.n().f354821b.q(1719, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onPause stop scan.");
        if (this.f180744v) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55040x17c7d680();
        }
        if (this.f180745w) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ni().e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d]", java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]));
        if (i17 == 144 && iArr[0] == 0) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.RunnableC13461x4c4f8791());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onResume start scan.");
        if (this.f180745w) {
            if (this.f180746x || lq1.a.a() || android.os.Build.VERSION.SDK_INT < 31) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().f();
            } else {
                this.f180746x = true;
                z2.h.a(this, new java.lang.String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"}, 144);
            }
        }
        int i17 = 0;
        if (this.f180744v) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55032xdcb76620(new byte[0], 1000);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o0 o0Var = this.f180730e;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) o0Var.f181128d;
            if (i17 >= arrayList.size()) {
                this.f180730e.notifyDataSetChanged();
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t0) arrayList.get(i17);
                t0Var.f181197a = o0Var.c(t0Var);
                i17++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, scene is null.");
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.k0(this, i17, i18, str, m1Var));
        }
    }
}
