package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class ExdeviceBindDeviceUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.exdevice.model.m0, com.tencent.mm.modelbase.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f99195y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f99196d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.o0 f99197e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f99198f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f99199g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f99200h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f99201i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ScrollView f99202m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f99203n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f99204o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f99205p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.s0 f99206q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f99207r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f99208s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.b2 f99209t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.b2 f99210u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f99211v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f99212w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f99213x = false;

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void D3(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", str, str2, java.lang.Boolean.valueOf(z17));
            return;
        }
        com.tencent.mm.plugin.exdevice.ui.t0 t0Var = new com.tencent.mm.plugin.exdevice.ui.t0(this, null);
        t0Var.f99665b = com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_BLUE;
        com.tencent.mm.plugin.exdevice.ui.q0 q0Var = new com.tencent.mm.plugin.exdevice.ui.q0(this, null);
        t0Var.f99666c = q0Var;
        q0Var.f99625a = str;
        q0Var.f99626b = a42.i.g(a42.i.h(str2));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.exdevice.ui.j0(this, t0Var));
    }

    public void T6(com.tencent.mm.plugin.exdevice.ui.t0 t0Var) {
        if (this.f99197e.a(t0Var.b()) >= 0) {
            return;
        }
        t0Var.a();
        com.tencent.mm.plugin.exdevice.ui.o0 o0Var = this.f99197e;
        o0Var.getClass();
        if (!(o0Var.a(t0Var.b()) >= 0)) {
            t0Var.f99664a = o0Var.c(t0Var);
            ((java.util.ArrayList) o0Var.f99595d).add(t0Var);
        }
        this.f99197e.notifyDataSetChanged();
        com.tencent.mm.plugin.exdevice.ui.p0 p0Var = t0Var.f99665b;
        if (p0Var == com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_BLUE) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice doScene, mac(%s), brandName(%s),categoryId(%s)", t0Var.f99666c.f99626b, this.f99208s, this.f99207r);
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.exdevice.model.m2(t0Var.f99666c.f99626b, this.f99208s, this.f99207r));
        } else {
            if (p0Var != com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_WIFI) {
                iz5.a.g(null, false);
                return;
            }
            com.tencent.mm.plugin.exdevice.ui.r0 r0Var = t0Var.f99667d;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice doScene, deviceType(%s), deviceId(%s)", r0Var.f99636a, r0Var.f99637b);
            com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
            com.tencent.mm.plugin.exdevice.ui.r0 r0Var2 = t0Var.f99667d;
            r1Var.g(new com.tencent.mm.plugin.exdevice.model.o2(r0Var2.f99636a, r0Var2.f99637b, t0Var.f99672i));
        }
    }

    public final void U6(int i17) {
        if (i17 == 0) {
            java.lang.String string = getString(com.tencent.mm.R.string.c2_);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.R.color.f479308vo), 0, string.length(), 33);
            spannableString.setSpan(new com.tencent.mm.plugin.exdevice.ui.l0(this), 0, string.length(), 33);
            this.f99200h.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.f99200h.setText(spannableString);
        } else if (i17 == 1) {
            java.lang.String string2 = getString(com.tencent.mm.R.string.c2c);
            java.lang.String string3 = getString(com.tencent.mm.R.string.c2x);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(string2 + string3);
            spannableString2.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.R.color.f479308vo), string2.length(), string2.length() + string3.length(), 33);
            spannableString2.setSpan(new com.tencent.mm.plugin.exdevice.ui.c0(this), string2.length(), string2.length() + string3.length(), 33);
            this.f99200h.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.f99200h.setText(spannableString2);
        } else if (i17 == 2) {
            java.lang.String string4 = getString(com.tencent.mm.R.string.c2b);
            java.lang.String string5 = getString(com.tencent.mm.R.string.c2a);
            android.text.SpannableString spannableString3 = new android.text.SpannableString(string4 + string5);
            spannableString3.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.R.color.f479308vo), string4.length(), string4.length() + string5.length(), 33);
            spannableString3.setSpan(new com.tencent.mm.plugin.exdevice.ui.m0(this), string4.length(), string4.length() + string5.length(), 33);
            this.f99200h.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.f99200h.setText(spannableString3);
        }
        if (i17 == 0 || i17 == 1 || i17 == 2 || i17 == 3) {
            this.f99201i.setImageResource(com.tencent.mm.R.raw.bluetooth_logo);
            this.f99203n.setText(com.tencent.mm.R.string.c2j);
            this.f99204o.setText(com.tencent.mm.R.string.c28);
        } else if (i17 == 4) {
            this.f99201i.setImageResource(com.tencent.mm.R.raw.bluetooth_logo);
            this.f99203n.setText(com.tencent.mm.R.string.c2h);
            this.f99204o.setText("");
        } else if (i17 == 5) {
            this.f99201i.setImageResource(com.tencent.mm.R.raw.wifi_logo);
            this.f99203n.setText(com.tencent.mm.R.string.c2j);
            this.f99204o.setText(com.tencent.mm.R.string.c2e);
        }
        if (i17 == 0 || i17 == 1 || i17 == 2) {
            android.view.View view = this.f99198f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f99196d.setVisibility(0);
            this.f99200h.setVisibility(0);
            this.f99201i.setVisibility(8);
            this.f99203n.setVisibility(8);
            this.f99204o.setVisibility(8);
            return;
        }
        if (i17 == 3 || i17 == 4 || i17 == 5) {
            this.f99202m.setVisibility(8);
            android.view.View view2 = this.f99198f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f99196d.setVisibility(8);
            this.f99200h.setVisibility(8);
            this.f99201i.setVisibility(0);
            this.f99203n.setVisibility(0);
            if (i17 == 4) {
                this.f99204o.setVisibility(8);
            } else {
                this.f99204o.setVisibility(0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void V0(java.lang.String str, int i17, long j17) {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a9k;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f99196d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.a9m, null);
        android.view.View inflate2 = android.view.View.inflate(this, com.tencent.mm.R.layout.a_j, null);
        this.f99205p = inflate2;
        this.f99198f = inflate2.findViewById(com.tencent.mm.R.id.mfu);
        this.f99199g = (android.widget.TextView) this.f99205p.findViewById(com.tencent.mm.R.id.o_y);
        this.f99200h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m__);
        this.f99201i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ipj);
        this.f99203n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dh_);
        this.f99204o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dha);
        this.f99202m = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.cwq);
        this.f99196d.addHeaderView(inflate, null, false);
        this.f99196d.addFooterView(this.f99205p, null, false);
        com.tencent.mm.plugin.exdevice.ui.o0 o0Var = new com.tencent.mm.plugin.exdevice.ui.o0(this.f99208s, this.f99206q, this.f99207r);
        this.f99197e = o0Var;
        this.f99196d.setAdapter((android.widget.ListAdapter) o0Var);
        this.f99196d.setOnItemClickListener(new com.tencent.mm.plugin.exdevice.ui.h0(this));
        if (this.f99212w && !this.f99211v) {
            if (!lq1.a.d(getContext())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "now sdk version not support ble device : %d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                U6(4);
                return;
            } else if (!lq1.a.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "Bluetooth is not open, Just leave");
                U6(3);
                return;
            }
        }
        if (!this.f99212w && this.f99211v && !com.tencent.mars.comm.NetStatusUtil.isWifi(getContext())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "wifi is not open, Just leave");
            U6(5);
            return;
        }
        com.tencent.mm.plugin.exdevice.ui.s0 s0Var = this.f99206q;
        if (s0Var == com.tencent.mm.plugin.exdevice.ui.s0.SCAN_MY_DEVICE) {
            U6(0);
            return;
        }
        if (s0Var != com.tencent.mm.plugin.exdevice.ui.s0.SCAN_CATALOG) {
            if (s0Var == com.tencent.mm.plugin.exdevice.ui.s0.SCAN_ALL) {
                iz5.a.g(null, false);
                return;
            } else {
                iz5.a.g(null, false);
                return;
            }
        }
        boolean z17 = this.f99212w;
        if (z17 && this.f99211v) {
            iz5.a.g(null, false);
            U6(1);
        } else if (z17) {
            U6(2);
        } else if (this.f99211v) {
            U6(1);
        }
    }

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void o1(java.lang.String str, byte[] bArr, boolean z17) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.exdevice.ui.o0 o0Var = this.f99197e;
        int i19 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) o0Var.f99595d;
            if (i19 >= arrayList.size()) {
                this.f99197e.notifyDataSetChanged();
                return;
            } else {
                com.tencent.mm.plugin.exdevice.ui.t0 t0Var = (com.tencent.mm.plugin.exdevice.ui.t0) arrayList.get(i19);
                t0Var.f99664a = o0Var.c(t0Var);
                i19++;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.d0(this));
        android.content.Intent intent = getIntent();
        this.f99207r = intent.getStringExtra("device_category_id");
        this.f99208s = intent.getStringExtra("device_brand_name");
        java.lang.String stringExtra = intent.getStringExtra("device_type");
        if (stringExtra != null) {
            stringExtra.length();
        }
        java.lang.String stringExtra2 = intent.getStringExtra("device_scan_conn_proto");
        java.lang.String stringExtra3 = intent.getStringExtra("device_scan_mode");
        java.lang.String stringExtra4 = intent.getStringExtra("device_title");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
            stringExtra4 = getContext().getString(com.tencent.mm.R.string.c3_);
        }
        boolean contains = stringExtra3.contains("SCAN_MY_DEVICE");
        com.tencent.mm.plugin.exdevice.ui.s0 s0Var = com.tencent.mm.plugin.exdevice.ui.s0.SCAN_CATALOG;
        com.tencent.mm.plugin.exdevice.ui.s0 s0Var2 = com.tencent.mm.plugin.exdevice.ui.s0.SCAN_MY_DEVICE;
        if (contains) {
            this.f99206q = s0Var2;
            str = getContext().getString(com.tencent.mm.R.string.f491131c23);
        } else if (stringExtra3.compareTo("SCAN_CATALOG") == 0) {
            this.f99206q = s0Var;
            str = getContext().getString(com.tencent.mm.R.string.f491129c21);
        } else {
            iz5.a.g(null, false);
            str = "";
        }
        setMMTitle(str);
        com.tencent.mm.plugin.exdevice.ui.s0 s0Var3 = this.f99206q;
        if (s0Var3 == s0Var) {
            this.f99211v = stringExtra2.contains("wifi");
            this.f99212w = stringExtra2.contains("blue");
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "mIsScanWifi(%b), mIsScanBlue(%b)", java.lang.Boolean.valueOf(this.f99211v), java.lang.Boolean.valueOf(this.f99212w));
        } else if (s0Var3 == s0Var2) {
            this.f99212w = true;
            this.f99211v = true;
        }
        this.f99209t = new com.tencent.mm.plugin.exdevice.ui.f0(this);
        this.f99210u = new com.tencent.mm.plugin.exdevice.ui.g0(this);
        initView();
        this.f99199g.setText(getContext().getString(com.tencent.mm.R.string.c4q, stringExtra4));
        gm0.j1.n().f273288b.a(1264, this);
        gm0.j1.n().f273288b.a(1706, this);
        gm0.j1.n().f273288b.a(1270, this);
        gm0.j1.n().f273288b.a(1719, this);
        if (this.f99212w) {
            java.util.LinkedList linkedList = (java.util.LinkedList) com.tencent.mm.plugin.exdevice.model.l3.Di().f99012a;
            if (!linkedList.contains(this)) {
                linkedList.add(this);
            }
        }
        if (this.f99211v) {
            com.tencent.mm.plugin.exdevice.model.c2.a().c(10, this.f99209t);
            com.tencent.mm.plugin.exdevice.model.c2.a().c(11, this.f99210u);
            com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.initWCLanDeviceLibV2();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f99211v) {
            gm0.j1.e().j(new com.tencent.mm.plugin.exdevice.ui.i0(this));
            com.tencent.mm.plugin.exdevice.model.c2.a().d(10, this.f99209t);
            com.tencent.mm.plugin.exdevice.model.c2.a().d(11, this.f99210u);
        }
        if (this.f99212w) {
            ((java.util.LinkedList) com.tencent.mm.plugin.exdevice.model.l3.Di().f99012a).remove(this);
            com.tencent.mm.plugin.exdevice.model.l3.Ni().e();
        }
        gm0.j1.n().f273288b.q(1264, this);
        gm0.j1.n().f273288b.q(1706, this);
        gm0.j1.n().f273288b.q(1270, this);
        gm0.j1.n().f273288b.q(1719, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onPause stop scan.");
        if (this.f99211v) {
            com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.stopScanWCLanDeviceV2();
        }
        if (this.f99212w) {
            com.tencent.mm.plugin.exdevice.model.l3.Ni().e();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d]", java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]));
        if (i17 == 144 && iArr[0] == 0) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI$$a());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onResume start scan.");
        if (this.f99212w) {
            if (this.f99213x || lq1.a.a() || android.os.Build.VERSION.SDK_INT < 31) {
                com.tencent.mm.plugin.exdevice.model.l3.Di().f();
            } else {
                this.f99213x = true;
                z2.h.a(this, new java.lang.String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"}, 144);
            }
        }
        int i17 = 0;
        if (this.f99211v) {
            com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.startScanWCLanDeviceV2(new byte[0], 1000);
        }
        com.tencent.mm.plugin.exdevice.ui.o0 o0Var = this.f99197e;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) o0Var.f99595d;
            if (i17 >= arrayList.size()) {
                this.f99197e.notifyDataSetChanged();
                return;
            } else {
                com.tencent.mm.plugin.exdevice.ui.t0 t0Var = (com.tencent.mm.plugin.exdevice.ui.t0) arrayList.get(i17);
                t0Var.f99664a = o0Var.c(t0Var);
                i17++;
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, scene is null.");
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.exdevice.ui.k0(this, i17, i18, str, m1Var));
        }
    }
}
