package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI */
/* loaded from: classes13.dex */
public class ActivityC13457xf0c8f0d1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f180695s = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f180696d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t f180697e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f180698f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f180699g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180700h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f180701i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f180702m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f180703n;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f180705p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e2 f180706q;

    /* renamed from: o, reason: collision with root package name */
    public boolean f180704o = false;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.BroadcastReceiver f180707r = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void D3(java.lang.String str, java.lang.String str2, boolean z17) {
        if (z17) {
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", str, str2, java.lang.Boolean.valueOf(z17));
            return;
        }
        int i17 = 0;
        while (i17 < this.f180698f.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u) this.f180698f.get(i17);
            if (uVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.f181215b)) {
                this.f180698f.remove(i17);
                i17--;
            } else if (uVar.f181215b.equalsIgnoreCase(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "the device(%s) has added into the list before.", str2);
                return;
            }
            i17++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "SearchBLEHardDevice doScene result(%s), mac(%s)", java.lang.Boolean.valueOf(gm0.j1.n().f354821b.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m2(str2.replaceAll(":", ""), null, null), 0)), str2);
    }

    public final void T6(int i17) {
        if (i17 == 1) {
            this.f180703n.setVisibility(8);
            this.f180700h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2j);
            this.f180701i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c28);
            return;
        }
        if (i17 == 2) {
            this.f180703n.setVisibility(8);
            this.f180700h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2h);
            this.f180701i.setText("");
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            this.f180703n.setVisibility(8);
            this.f180700h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c2j);
            this.f180701i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c3j);
            return;
        }
        this.f180703n.setVisibility(0);
        android.view.View view = this.f180702m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI", "switchUiState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean U6(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5372x33079727 c5372x33079727 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5372x33079727();
        am.f7 f7Var = c5372x33079727.f135704g;
        f7Var.f88175a = str;
        f7Var.f88176b = z17;
        if (c5372x33079727.e()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "connect failed, mac(%s).", str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void V0(java.lang.String str, int i17, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, mac is null or nil.");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u a17 = this.f180697e.a(str);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, info is null.(%s)", str);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v vVar = a17.f181218e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v vVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v.ADDING;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v vVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v.NORMAL;
        if (vVar == vVar2 && i17 == 4) {
            a17.f181218e = vVar3;
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.a(this));
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q(this, a17));
        } else if (i17 == 2) {
            if (vVar == vVar2) {
                a17.f181218e = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v.ADDED;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Bind Hard device, mac(%s), name(%s)", a17.f181215b, a17.f181214a);
                java.lang.String str2 = a17.f181216c;
                if (str2 != null) {
                    this.f180706q = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e2(str2, 0);
                    gm0.j1.n().f354821b.g(this.f180706q);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "try to disconnect, mac : %s.", str);
                U6(str, false);
            }
        } else if (i17 == 1 || i17 == 2) {
            return;
        } else {
            a17.f181218e = vVar3;
        }
        runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f180696d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.a9g, null);
        this.f180703n = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.md9);
        this.f180702m = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.a9f, null);
        this.f180699g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.m__);
        this.f180700h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dh_);
        this.f180701i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dha);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c4p);
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c2r);
        android.text.SpannableString spannableString = new android.text.SpannableString(string + string2);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), string.length(), string.length() + string2.length(), 33);
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.j(this), string.length(), string.length() + string2.length(), 33);
        this.f180699g.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        this.f180699g.setText(spannableString);
        this.f180696d.addHeaderView(inflate, null, false);
        this.f180696d.addFooterView(this.f180702m, null, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t();
        this.f180697e = tVar;
        this.f180696d.setAdapter((android.widget.ListAdapter) tVar);
        this.f180696d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.k(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m0
    public void o1(java.lang.String str, byte[] bArr, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572663c22);
        if (fp.h.c(23)) {
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            if (!str.equalsIgnoreCase("6.0") && !str.equalsIgnoreCase("6.0.0")) {
                this.f180704o = true;
            }
        }
        this.f180698f = new java.util.LinkedList();
        mo43517x10010bd5();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.location.MODE_CHANGED");
        mo55332x76847179().registerReceiver(this.f180707r, intentFilter);
        gm0.j1.n().f354821b.a(536, this);
        gm0.j1.n().f354821b.a(1706, this);
        java.util.LinkedList linkedList = (java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().f180545a;
        if (!linkedList.contains(this)) {
            linkedList.add(this);
        }
        if (!lq1.a.d(mo55332x76847179())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "now sdk version not support ble device : %d", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            T6(2);
            return;
        }
        if (!lq1.a.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Bluetooth is not open, Just leave");
            T6(1);
            return;
        }
        if (this.f180704o && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Android 6.0.1, gps not open");
            T6(4);
        } else if (!lq1.a.a() && android.os.Build.VERSION.SDK_INT >= 31) {
            z2.h.a(this, new java.lang.String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"}, 144);
        } else {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().f();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.l(this));
        gm0.j1.n().f354821b.q(536, this);
        gm0.j1.n().f354821b.q(1706, this);
        mo55332x76847179().unregisterReceiver(this.f180707r);
        ((java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().f180545a).remove(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ni().e();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d]", java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]));
        if (i17 == 144 && iArr[0] == 0) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.RunnableC13458x67b09d70());
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "errType(%d), errCode(%d), errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "netscene is null.");
            return;
        }
        r45.yh yhVar = null;
        if (m1Var.mo808xfb85f7b0() == 536) {
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.a(this));
            this.f180706q = null;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e2) m1Var).f180416e;
            if (oVar != null && (fVar = oVar.f152244b.f152233a) != null) {
                yhVar = (r45.yh) fVar;
            }
            if (i17 == 0 && i18 == 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("device_mac", a42.i.h(a42.i.k(yhVar.f472607e.f464073f)));
                U6(a42.i.k(yhVar.f472607e.f464073f), false);
                setResult(-1, intent);
                finish();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u a17 = this.f180697e.a(a42.i.k(yhVar.f472607e.f464073f));
            if (a17 != null) {
                a17.f181218e = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v.NORMAL;
                U6(a17.f181215b, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "doScene failed.");
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 1706) {
            r45.zv5 zv5Var = (r45.zv5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m2) m1Var).f180527e.f152244b.f152233a;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceAddDataSourceUI", "NetSceneSearchBLEHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "HardDeviceAttr_bleSimpleProtol(%d)", java.lang.Long.valueOf(zv5Var.f473944e.f464088x));
            if (0 != (zv5Var.f473944e.f464088x & 1)) {
                v32.c Ui = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui();
                r45.nv3 nv3Var = zv5Var.f473943d;
                if (Ui.L0(nv3Var.f463225e, nv3Var.f463224d) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "(%s)has been bound.", zv5Var.f473944e.f464073f);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u(null);
                r45.du5 du5Var = zv5Var.f473946g.f468123e;
                uVar.f181214a = du5Var == null ? "" : x51.j1.g(du5Var);
                uVar.f181215b = a42.i.k(zv5Var.f473944e.f464073f);
                uVar.f181216c = zv5Var.f473945f;
                uVar.f181217d = zv5Var.f473944e.f464081q;
                ((java.util.LinkedList) this.f180698f).add(uVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "Add device, mac(%s), name(%s)", uVar.f181215b, uVar.f181214a);
                runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m(this));
            }
        }
    }
}
