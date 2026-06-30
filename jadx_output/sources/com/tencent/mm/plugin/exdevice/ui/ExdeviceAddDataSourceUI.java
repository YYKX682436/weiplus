package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class ExdeviceAddDataSourceUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.exdevice.model.m0, com.tencent.mm.modelbase.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f99162s = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f99163d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.t f99164e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f99165f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f99166g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f99167h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f99168i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f99169m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f99170n;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99172p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.e2 f99173q;

    /* renamed from: o, reason: collision with root package name */
    public boolean f99171o = false;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.BroadcastReceiver f99174r = new com.tencent.mm.plugin.exdevice.ui.i(this);

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void D3(java.lang.String str, java.lang.String str2, boolean z17) {
        if (z17) {
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.n(this));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", str, str2, java.lang.Boolean.valueOf(z17));
            return;
        }
        int i17 = 0;
        while (i17 < this.f99165f.size()) {
            com.tencent.mm.plugin.exdevice.ui.u uVar = (com.tencent.mm.plugin.exdevice.ui.u) this.f99165f.get(i17);
            if (uVar == null || com.tencent.mm.sdk.platformtools.t8.K0(uVar.f99682b)) {
                this.f99165f.remove(i17);
                i17--;
            } else if (uVar.f99682b.equalsIgnoreCase(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "the device(%s) has added into the list before.", str2);
                return;
            }
            i17++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "SearchBLEHardDevice doScene result(%s), mac(%s)", java.lang.Boolean.valueOf(gm0.j1.n().f273288b.h(new com.tencent.mm.plugin.exdevice.model.m2(str2.replaceAll(":", ""), null, null), 0)), str2);
    }

    public final void T6(int i17) {
        if (i17 == 1) {
            this.f99170n.setVisibility(8);
            this.f99167h.setText(com.tencent.mm.R.string.c2j);
            this.f99168i.setText(com.tencent.mm.R.string.c28);
            return;
        }
        if (i17 == 2) {
            this.f99170n.setVisibility(8);
            this.f99167h.setText(com.tencent.mm.R.string.c2h);
            this.f99168i.setText("");
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            this.f99170n.setVisibility(8);
            this.f99167h.setText(com.tencent.mm.R.string.c2j);
            this.f99168i.setText(com.tencent.mm.R.string.c3j);
            return;
        }
        this.f99170n.setVisibility(0);
        android.view.View view = this.f99169m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean U6(java.lang.String str, boolean z17) {
        com.tencent.mm.autogen.events.ExDeviceSimpleBTConnectDeviceEvent exDeviceSimpleBTConnectDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceSimpleBTConnectDeviceEvent();
        am.f7 f7Var = exDeviceSimpleBTConnectDeviceEvent.f54171g;
        f7Var.f6642a = str;
        f7Var.f6643b = z17;
        if (exDeviceSimpleBTConnectDeviceEvent.e()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "connect failed, mac(%s).", str);
        return false;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void V0(java.lang.String str, int i17, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, mac is null or nil.");
            return;
        }
        com.tencent.mm.plugin.exdevice.ui.u a17 = this.f99164e.a(str);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, info is null.(%s)", str);
            return;
        }
        com.tencent.mm.plugin.exdevice.ui.v vVar = a17.f99685e;
        com.tencent.mm.plugin.exdevice.ui.v vVar2 = com.tencent.mm.plugin.exdevice.ui.v.ADDING;
        com.tencent.mm.plugin.exdevice.ui.v vVar3 = com.tencent.mm.plugin.exdevice.ui.v.NORMAL;
        if (vVar == vVar2 && i17 == 4) {
            a17.f99685e = vVar3;
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.a(this));
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.q(this, a17));
        } else if (i17 == 2) {
            if (vVar == vVar2) {
                a17.f99685e = com.tencent.mm.plugin.exdevice.ui.v.ADDED;
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Bind Hard device, mac(%s), name(%s)", a17.f99682b, a17.f99681a);
                java.lang.String str2 = a17.f99683c;
                if (str2 != null) {
                    this.f99173q = new com.tencent.mm.plugin.exdevice.model.e2(str2, 0);
                    gm0.j1.n().f273288b.g(this.f99173q);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "try to disconnect, mac : %s.", str);
                U6(str, false);
            }
        } else if (i17 == 1 || i17 == 2) {
            return;
        } else {
            a17.f99685e = vVar3;
        }
        runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.r(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a9e;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f99163d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.a9g, null);
        this.f99170n = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.md9);
        this.f99169m = android.view.View.inflate(this, com.tencent.mm.R.layout.a9f, null);
        this.f99166g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m__);
        this.f99167h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dh_);
        this.f99168i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dha);
        java.lang.String string = getString(com.tencent.mm.R.string.c4p);
        java.lang.String string2 = getString(com.tencent.mm.R.string.c2r);
        android.text.SpannableString spannableString = new android.text.SpannableString(string + string2);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.R.color.f479308vo), string.length(), string.length() + string2.length(), 33);
        spannableString.setSpan(new com.tencent.mm.plugin.exdevice.ui.j(this), string.length(), string.length() + string2.length(), 33);
        this.f99166g.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        this.f99166g.setText(spannableString);
        this.f99163d.addHeaderView(inflate, null, false);
        this.f99163d.addFooterView(this.f99169m, null, false);
        com.tencent.mm.plugin.exdevice.ui.t tVar = new com.tencent.mm.plugin.exdevice.ui.t();
        this.f99164e = tVar;
        this.f99163d.setAdapter((android.widget.ListAdapter) tVar);
        this.f99163d.setOnItemClickListener(new com.tencent.mm.plugin.exdevice.ui.k(this));
    }

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void o1(java.lang.String str, byte[] bArr, boolean z17) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.d(this));
        setMMTitle(com.tencent.mm.R.string.f491130c22);
        if (fp.h.c(23)) {
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            if (!str.equalsIgnoreCase("6.0") && !str.equalsIgnoreCase("6.0.0")) {
                this.f99171o = true;
            }
        }
        this.f99165f = new java.util.LinkedList();
        initView();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.location.MODE_CHANGED");
        getContext().registerReceiver(this.f99174r, intentFilter);
        gm0.j1.n().f273288b.a(536, this);
        gm0.j1.n().f273288b.a(1706, this);
        java.util.LinkedList linkedList = (java.util.LinkedList) com.tencent.mm.plugin.exdevice.model.l3.Di().f99012a;
        if (!linkedList.contains(this)) {
            linkedList.add(this);
        }
        if (!lq1.a.d(getContext())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "now sdk version not support ble device : %d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            T6(2);
            return;
        }
        if (!lq1.a.e()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Bluetooth is not open, Just leave");
            T6(1);
            return;
        }
        if (this.f99171o && !com.tencent.mm.sdk.platformtools.n2.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Android 6.0.1, gps not open");
            T6(4);
        } else if (!lq1.a.a() && android.os.Build.VERSION.SDK_INT >= 31) {
            z2.h.a(this, new java.lang.String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"}, 144);
        } else {
            try {
                com.tencent.mm.plugin.exdevice.model.l3.Di().f();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.e().j(new com.tencent.mm.plugin.exdevice.ui.l(this));
        gm0.j1.n().f273288b.q(536, this);
        gm0.j1.n().f273288b.q(1706, this);
        getContext().unregisterReceiver(this.f99174r);
        ((java.util.LinkedList) com.tencent.mm.plugin.exdevice.model.l3.Di().f99012a).remove(this);
        com.tencent.mm.plugin.exdevice.model.l3.Ni().e();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d]", java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]));
        if (i17 == 144 && iArr[0] == 0) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI$$a());
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "errType(%d), errCode(%d), errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "netscene is null.");
            return;
        }
        r45.yh yhVar = null;
        if (m1Var.getType() == 536) {
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.a(this));
            this.f99173q = null;
            com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.exdevice.model.e2) m1Var).f98883e;
            if (oVar != null && (fVar = oVar.f70711b.f70700a) != null) {
                yhVar = (r45.yh) fVar;
            }
            if (i17 == 0 && i18 == 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("device_mac", a42.i.h(a42.i.k(yhVar.f391074e.f382540f)));
                U6(a42.i.k(yhVar.f391074e.f382540f), false);
                setResult(-1, intent);
                finish();
                return;
            }
            com.tencent.mm.plugin.exdevice.ui.u a17 = this.f99164e.a(a42.i.k(yhVar.f391074e.f382540f));
            if (a17 != null) {
                a17.f99685e = com.tencent.mm.plugin.exdevice.ui.v.NORMAL;
                U6(a17.f99682b, false);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "doScene failed.");
            return;
        }
        if (m1Var.getType() == 1706) {
            r45.zv5 zv5Var = (r45.zv5) ((com.tencent.mm.plugin.exdevice.model.m2) m1Var).f98994e.f70711b.f70700a;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "NetSceneSearchBLEHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "HardDeviceAttr_bleSimpleProtol(%d)", java.lang.Long.valueOf(zv5Var.f392411e.f382555x));
            if (0 != (zv5Var.f392411e.f382555x & 1)) {
                v32.c Ui = com.tencent.mm.plugin.exdevice.model.l3.Ui();
                r45.nv3 nv3Var = zv5Var.f392410d;
                if (Ui.L0(nv3Var.f381692e, nv3Var.f381691d) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "(%s)has been bound.", zv5Var.f392411e.f382540f);
                    return;
                }
                com.tencent.mm.plugin.exdevice.ui.u uVar = new com.tencent.mm.plugin.exdevice.ui.u(null);
                r45.du5 du5Var = zv5Var.f392413g.f386590e;
                uVar.f99681a = du5Var == null ? "" : x51.j1.g(du5Var);
                uVar.f99682b = a42.i.k(zv5Var.f392411e.f382540f);
                uVar.f99683c = zv5Var.f392412f;
                uVar.f99684d = zv5Var.f392411e.f382548q;
                ((java.util.LinkedList) this.f99165f).add(uVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Add device, mac(%s), name(%s)", uVar.f99682b, uVar.f99681a);
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.m(this));
            }
        }
    }
}
