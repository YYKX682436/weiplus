package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class ExdeviceConnectWifiUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int I = 0;
    public n32.b B;
    public com.tencent.mm.plugin.exdevice.ui.s1 C;
    public com.tencent.mm.network.s0 D;
    public com.tencent.mm.plugin.exdevice.model.b2 E;
    public android.net.wifi.WifiManager.MulticastLock F;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f99214d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f99215e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f99216f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f99217g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f99218h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.TextWatcher f99219i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99220m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f99221n;

    /* renamed from: o, reason: collision with root package name */
    public n32.a f99222o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f99223p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f99224q;

    /* renamed from: r, reason: collision with root package name */
    public int f99225r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f99226s;

    /* renamed from: t, reason: collision with root package name */
    public int f99227t;

    /* renamed from: u, reason: collision with root package name */
    public int f99228u;

    /* renamed from: v, reason: collision with root package name */
    public int f99229v;

    /* renamed from: y, reason: collision with root package name */
    public int f99232y;

    /* renamed from: z, reason: collision with root package name */
    public long f99233z;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f99230w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f99231x = "";
    public boolean A = false;
    public final java.lang.Runnable G = new com.tencent.mm.plugin.exdevice.ui.e1(this);
    public boolean H = true;

    public static void T6(com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        exdeviceConnectWifiUI.A = true;
        exdeviceConnectWifiUI.f99233z = java.lang.System.currentTimeMillis();
        exdeviceConnectWifiUI.a7(3);
        java.lang.String X6 = exdeviceConnectWifiUI.X6();
        java.lang.String str = exdeviceConnectWifiUI.f99221n;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "do start AirKiss, ssid(%s).", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid is invalid");
            dp.a.makeText(exdeviceConnectWifiUI.getContext(), "SSID is invalid", 0).show();
        } else {
            exdeviceConnectWifiUI.b7(com.tencent.mm.plugin.exdevice.ui.s1.SETTING);
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.exdevice.ui.v0(exdeviceConnectWifiUI, X6, str));
        }
    }

    public final void U6(boolean z17, boolean z18, boolean z19) {
        android.view.View view = this.f99214d;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI", "changeUiStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI", "changeUiStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z18) {
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.a1(this));
        } else {
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.b1(this));
            if (this.F.isHeld()) {
                this.F.release();
            }
        }
        if (z19) {
            dp.a.makeText(getContext(), com.tencent.mm.R.string.c2z, 0).show();
        }
    }

    public final void V6() {
        n32.a aVar = this.f99222o;
        aVar.f334475f = "";
        aVar.f334474e = "";
        java.lang.String str = this.f99221n;
        n32.a W6 = W6(this.f99225r, str);
        if (W6 == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(W6.f334475f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Do not have a local password to fill for the current wifi.");
            this.B.f334476d.remove(W6);
            this.f99223p = true;
            return;
        }
        n32.a aVar2 = this.f99222o;
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        java.lang.String str2 = W6.f334475f;
        java.lang.String a17 = com.tencent.mm.plugin.exdevice.ui.r1.a(this.f99225r, W6.f334474e);
        ((zd0.e) hVar).getClass();
        aVar2.f334475f = xp1.c.h(str2, a17);
        this.f99222o.f334474e = W6.f334474e;
        com.tencent.mm.sdk.platformtools.u3.h(this.G);
    }

    public final n32.a W6(int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || this.B == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid or wifiInfoList is null or nil.");
            return null;
        }
        int i18 = 0;
        while (i18 < this.B.f334476d.size()) {
            n32.a aVar = (n32.a) this.B.f334476d.get(i18);
            if (aVar == null) {
                this.B.f334476d.remove(i18);
                this.f99223p = true;
                i18--;
            } else if (aVar.f334473d == i17 && str.equals(aVar.f334474e)) {
                return aVar;
            }
            i18++;
        }
        return null;
    }

    public final java.lang.String X6() {
        if (this.f99217g.getText() != null) {
            return this.f99217g.getText().toString();
        }
        return null;
    }

    public final void Y6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("device_scan_mode", getIntent().getStringExtra("device_scan_mode"));
        intent.putExtra("device_scan_conn_proto", getIntent().getStringExtra("device_scan_conn_proto"));
        intent.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, getIntent().getStringExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID));
        intent.putExtra("device_type", getIntent().getStringExtra("device_type"));
        intent.putExtra("device_title", getIntent().getStringExtra("device_title"));
        intent.putExtra("device_desc", getIntent().getStringExtra("device_desc"));
        intent.putExtra("device_icon_url", getIntent().getStringExtra("device_icon_url"));
        intent.putExtra("device_category_id", getIntent().getStringExtra("device_category_id"));
        intent.putExtra("device_brand_name", getIntent().getStringExtra("device_brand_name"));
        intent.putExtra("bind_ticket", getIntent().getStringExtra("bind_ticket"));
        j45.l.j(getContext(), "exdevice", ".ui.ExdeviceBindDeviceUI", intent, null);
    }

    public final void Z6(boolean z17) {
        com.tencent.mm.plugin.exdevice.ui.s1 s1Var = z17 ? com.tencent.mm.plugin.exdevice.ui.s1.NORMAL : this.C;
        if (com.tencent.mars.comm.NetStatusUtil.getNetType(this) != 0) {
            s1Var = com.tencent.mm.plugin.exdevice.ui.s1.NO_WIFI_CONNECTED;
        } else {
            java.lang.String e17 = com.tencent.mm.sdk.platformtools.v0.f193027a.e(false);
            this.f99221n = e17;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Get SSID(%s)", e17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99221n)) {
                this.f99215e.setText("");
            } else {
                this.f99215e.setText(this.f99221n);
            }
        }
        b7(s1Var);
    }

    public final void a7(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13503, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f99229v), java.lang.Long.valueOf(i17 == 4 ? java.lang.System.currentTimeMillis() - this.f99233z : 0L), this.f99230w, this.f99231x, java.lang.Integer.valueOf(this.f99232y));
    }

    public synchronized void b7(com.tencent.mm.plugin.exdevice.ui.s1 s1Var) {
        if (s1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Status is null.");
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
            this.f99224q = true;
            setResult(-1);
            gm0.j1.e().j(new com.tencent.mm.plugin.exdevice.ui.y0(this));
            if (getIntent().getBooleanExtra("jumpToBindDevice", false)) {
                Y6();
            }
            finish();
        } else if (ordinal == 4) {
            a7(5);
            this.f99224q = true;
            setResult(1);
            finish();
        }
        if (s1Var != com.tencent.mm.plugin.exdevice.ui.s1.NORMAL) {
            this.f99217g.clearFocus();
            hideVKB();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a9n;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.c2x);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.m1(this));
        this.f99214d = findViewById(com.tencent.mm.R.id.mn8);
        this.f99215e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k3h);
        this.f99216f = findViewById(com.tencent.mm.R.id.f482928s3);
        this.f99217g = (android.widget.EditText) findViewById(com.tencent.mm.R.id.kpu);
        this.f99218h = findViewById(com.tencent.mm.R.id.f483865ca0);
        this.f99219i = new com.tencent.mm.plugin.exdevice.ui.n1(this);
        this.f99214d.setOnTouchListener(new com.tencent.mm.plugin.exdevice.ui.o1(this));
        this.f99218h.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.p1(this));
        this.f99217g.setTransformationMethod(new android.text.method.PasswordTransformationMethod());
        this.f99217g.addTextChangedListener(this.f99219i);
        this.f99217g.setOnEditorActionListener(new com.tencent.mm.plugin.exdevice.ui.q1(this));
        this.f99217g.setOnKeyListener(new com.tencent.mm.plugin.exdevice.ui.u0(this));
        this.f99217g.requestFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r12 == false) goto L20;
     */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.A) {
            a7(2);
        }
        com.tencent.mm.plugin.exdevice.model.c2.a().d(0, this.E);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 77 && iArr.length > 0 && iArr[0] == -1) {
            this.H = false;
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.exdevice.ui.c1(this), new com.tencent.mm.plugin.exdevice.ui.d1(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Z6(false);
        gm0.j1.n().a(this.D);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.n().d(this.D);
    }
}
