package com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf;

@com.p314xaae8f345.mm.ui.a2
/* renamed from: com.tencent.mm.pluginsdk.permission.PermissionActivity */
/* loaded from: classes5.dex */
public class ActivityC19627x87d09a1e extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f271046s = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String[] f271047e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f271048f;

    /* renamed from: g, reason: collision with root package name */
    public int f271049g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f271050h;

    /* renamed from: i, reason: collision with root package name */
    public int f271051i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Intent f271052m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f271053n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f271054o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f271055p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f271056q;

    /* renamed from: r, reason: collision with root package name */
    public wu5.c f271057r;

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "onActivityResult(),  scene=%d, requestCode=%d, resultCode=%d", java.lang.Integer.valueOf(this.f271051i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = this.f271051i;
        if (i19 == 2) {
            j35.g0 g0Var = (j35.g0) j35.u.f379055b.remove(this.f271048f);
            if (g0Var != null) {
                g0Var.a(i17, i18, intent);
            }
            finish();
            return;
        }
        if (i19 == 3) {
            if (i18 == -1) {
                android.content.Intent intent2 = this.f271052m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.h9z, 1).show();
            }
            finish();
            return;
        }
        if (i19 != 4) {
            finish();
            return;
        }
        boolean b17 = com.p314xaae8f345.mm.p642xad8b531f.o.b(this);
        if (b17) {
            if (com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("954_84_first", true)) {
                jx3.f.INSTANCE.mo68477x336bdfd8(954L, 84L, 1L, false);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p642xad8b531f.o.a();
                a17.getClass();
                a17.putBoolean("954_84_first", false);
            }
            com.p314xaae8f345.mm.p642xad8b531f.o.h(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "onActivityResult ADD_IGNORING_BATTERY_OPTIMIZATIONS result=%s", java.lang.Boolean.valueOf(b17));
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.e(this);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.bk.k0(getWindow());
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        if (com.p314xaae8f345.mm.ui.b4.c(this)) {
            getWindow().setNavigationBarColor(0);
        }
        if (getIntent() == null || !getIntent().hasExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            finish();
            return;
        }
        this.f271050h = true;
        this.f271051i = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        this.f271053n = getIntent().getStringExtra("reasonTitle");
        this.f271054o = getIntent().getStringExtra("reasonMsg");
        this.f271055p = getIntent().getStringExtra("forceReasonMsg");
        this.f271056q = getIntent().getStringExtra("forceBusiness");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271053n) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271054o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "scene: %d, reasonTitle: %s, reasonMsg: %s", java.lang.Integer.valueOf(this.f271051i), this.f271053n, this.f271054o);
        }
        this.f271048f = getIntent().getStringExtra("key");
        int i17 = this.f271051i;
        if (i17 != 1) {
            if (i17 == 2) {
                this.f271052m = getIntent().getSelector();
                return;
            }
            if (i17 != 3) {
                if (i17 == 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "scene: %d", java.lang.Integer.valueOf(i17));
                    return;
                }
                return;
            } else {
                android.content.Intent selector = getIntent().getSelector();
                this.f271052m = selector;
                if (selector != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "scene: %d, intent: %s", java.lang.Integer.valueOf(this.f271051i), this.f271052m.toString());
                    return;
                }
                return;
            }
        }
        overridePendingTransition(0, 0);
        this.f271047e = getIntent().getStringArrayExtra("permission");
        this.f271049g = getIntent().getIntExtra("requestCode", 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(this.f271047e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "scene: %d, permission: %s, requestCode: %d", java.lang.Integer.valueOf(this.f271051i), this.f271047e.toString(), java.lang.Integer.valueOf(this.f271049g));
        }
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.c9g);
        ku5.u0 u0Var = ku5.t0.f394148d;
        j35.v vVar = new j35.v(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f271057r = t0Var.z(vVar, 500L, false);
        java.lang.String[] strArr = this.f271047e;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (getResources().getConfiguration().orientation == 2) {
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h5n);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.topMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
            imageView.setLayoutParams(layoutParams);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h5n);
        android.content.res.Resources resources = getResources();
        java.lang.String str = this.f271047e[0];
        boolean equals = "android.permission.ACCESS_FINE_LOCATION".equals(str);
        int i18 = com.p314xaae8f345.mm.R.raw.f79787x448e46cd;
        if (!equals && !"android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str) || "android.permission.READ_MEDIA_IMAGES".equals(str) || "android.permission.READ_MEDIA_VIDEO".equals(str) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str)) {
                i18 = com.p314xaae8f345.mm.R.raw.f79746xeccaa986;
            } else if ("android.permission.RECORD_AUDIO".equals(str)) {
                i18 = com.p314xaae8f345.mm.R.raw.f79805xc851170e;
            } else if ("android.permission.CAMERA".equals(str)) {
                i18 = com.p314xaae8f345.mm.R.raw.f79656xe6e7503d;
            } else if ("android.permission.READ_CONTACTS".equals(str)) {
                i18 = com.p314xaae8f345.mm.R.raw.f79688xb16c076b;
            } else if ("android.permission.ACTIVITY_RECOGNITION".equals(str)) {
                i18 = com.p314xaae8f345.mm.R.raw.f80312x5e8026d7;
            } else if ("android.permission.BLUETOOTH_CONNECT".equals(str) || "android.permission.BLUETOOTH_SCAN".equals(str)) {
                i18 = com.p314xaae8f345.mm.R.raw.f79650x9f0fe96;
            } else if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                i18 = com.p314xaae8f345.mm.R.raw.f79643x577cfe2a;
            }
        }
        android.graphics.drawable.Drawable drawable = resources.getDrawable(i18);
        com.p314xaae8f345.mm.ui.uk.f(drawable, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        imageView2.setImageDrawable(drawable);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str2 = "";
        objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271055p) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572460ba3) : "";
        java.lang.String str3 = this.f271047e[0];
        objArr[1] = ("android.permission.ACCESS_FINE_LOCATION".equals(str3) || "android.permission.ACCESS_COARSE_LOCATION".equals(str3)) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.ba_) : ("android.permission.READ_EXTERNAL_STORAGE".equals(str3) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str3) || "android.permission.READ_MEDIA_IMAGES".equals(str3) || "android.permission.READ_MEDIA_VIDEO".equals(str3) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str3)) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bai) : "android.permission.RECORD_AUDIO".equals(str3) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.baf) : "android.permission.CAMERA".equals(str3) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.ba8) : "android.permission.READ_CONTACTS".equals(str3) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.ba9) : "android.permission.ACTIVITY_RECOGNITION".equals(str3) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bag) : ("android.permission.BLUETOOTH_CONNECT".equals(str3) || "android.permission.BLUETOOTH_SCAN".equals(str3)) ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? "Bluetooth" : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572466mf3) : "android.permission.POST_NOTIFICATIONS".equals(str3) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572467mf4) : "android.permission.NEARBY_WIFI_DEVICES".equals(str3) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572843nk5) : this.f271053n;
        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.baj, objArr));
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        java.lang.String str4 = this.f271047e[0];
        java.lang.String str5 = this.f271054o;
        java.lang.String str6 = this.f271055p;
        if (str6 == null || str6.isEmpty()) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.il9);
            if ("android.permission.ACCESS_FINE_LOCATION".equals(str4) || "android.permission.ACCESS_COARSE_LOCATION".equals(str4)) {
                java.lang.String bj6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.LOCAION.f308725d, null);
                str2 = bj6.isEmpty() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bab) : string + bj6;
            }
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str4) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str4) || "android.permission.READ_MEDIA_IMAGES".equals(str4) || "android.permission.READ_MEDIA_VIDEO".equals(str4) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str4)) {
                java.lang.String bj7 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.STORAGE.f308725d, null);
                str2 = bj7.isEmpty() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bah) : string + bj7;
            }
            if ("android.permission.RECORD_AUDIO".equals(str4)) {
                java.lang.String bj8 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.MICRO_PHONE.f308725d, null);
                str2 = bj8.isEmpty() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bac) : string + bj8;
            }
            if ("android.permission.CAMERA".equals(str4)) {
                java.lang.String bj9 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.CAMERA.f308725d, null);
                str2 = bj9.isEmpty() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.baa) : string + bj9;
            }
            if ("android.permission.READ_CONTACTS".equals(str4)) {
                java.lang.String bj10 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.CONTRACT.f308725d, null);
                str2 = bj10.isEmpty() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bad) : string + bj10;
            }
            if ("android.permission.ACTIVITY_RECOGNITION".equals(str4)) {
                java.lang.String bj11 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.HEALTHY.f308725d, null);
                str2 = bj11.isEmpty() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bae) : string + bj11;
            }
            if ("android.permission.NEARBY_WIFI_DEVICES".equals(str4)) {
                str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.nk6);
            }
            if ("android.permission.BLUETOOTH_CONNECT".equals(str4)) {
                str2 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? "After tapping \"Allow\" in the pop-up window below, you can use Bluetooth device to send voice messages, make audio/video calls in chats." : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572468mf5);
            }
            if ("android.permission.POST_NOTIFICATIONS".equals(str4)) {
                str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.mf6);
            }
            str6 = str2.isEmpty() ? str5 : str2;
        }
        textView2.setText(str6);
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        java.lang.String[] permission = this.f271047e;
        java.lang.Long l17 = 151L;
        java.lang.String str7 = this.f271056q;
        d85.d1 d1Var = (d85.d1) m0Var;
        d1Var.getClass();
        long longValue = l17.longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str8 : permission) {
            d85.g0 g0Var = (d85.g0) e85.i.f331849b.get(str8);
            if (g0Var != null && !linkedList.contains(g0Var)) {
                linkedList.add(g0Var);
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            d1Var.tj((d85.g0) it.next(), longValue, str7);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "onDestroy(), scene=%d", java.lang.Integer.valueOf(this.f271051i));
        int i17 = this.f271051i;
        if (i17 == 1) {
        } else if (i17 == 2) {
        }
        super.onDestroy();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        wu5.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "onRequestPermissionsResult(),  scene=%d, requestCode=%d, permissions=%s, grantResults=%s", java.lang.Integer.valueOf(this.f271051i), java.lang.Integer.valueOf(i17), java.util.Arrays.toString(strArr), java.util.Arrays.toString(iArr));
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            java.lang.String str = strArr[i18];
            int i19 = iArr[i18];
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            d85.g0 g0Var = (d85.g0) e85.i.f331849b.get(str);
            if (g0Var != null) {
                hashMap.put(g0Var, i19 == -1 ? z2.h.b(this, str) ? 163L : 164L : 162L);
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            d85.g0 g0Var2 = (d85.g0) entry.getKey();
            java.lang.Long l17 = (java.lang.Long) entry.getValue();
            d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
            java.lang.String str2 = this.f271056q;
            d85.d1 d1Var = (d85.d1) m0Var;
            d1Var.getClass();
            d1Var.tj(g0Var2, l17.longValue(), str2);
        }
        boolean z17 = true;
        if (this.f271051i == 1) {
            j35.b0 b0Var = (j35.b0) j35.u.f379054a.remove(this.f271048f);
            if (b0Var != null) {
                b0Var.mo2413x953457f1(i17, strArr, iArr);
            }
        }
        for (int i27 = 0; i27 < strArr.length; i27++) {
            if (iArr[i27] != -1 || z2.h.b(this, strArr[i27])) {
                z17 = false;
                break;
            }
        }
        if (z17 && (cVar = this.f271057r) != null) {
            cVar.cancel(false);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "onResume(), scene=%d", java.lang.Integer.valueOf(this.f271051i));
        super.onResume();
        if (!this.f271050h) {
            this.f271050h = true;
            return;
        }
        int i17 = this.f271051i;
        if (i17 == 1) {
            j35.u.l(this, this.f271047e, this.f271049g);
        } else if (i17 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271054o) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271053n)) {
                try {
                    startActivityForResult(this.f271052m, 1);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", java.lang.Integer.valueOf(this.f271051i), e17.getMessage());
                }
            } else {
                db5.e1.K(this, false, this.f271054o, this.f271053n, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new j35.w(this), new j35.x(this));
            }
        } else if (i17 == 3) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                android.content.Intent intent = this.f271052m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (getPackageManager().canRequestPackageInstalls()) {
                android.content.Intent intent2 = this.f271052m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                try {
                    startActivityForResult(new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", android.net.Uri.parse("package:" + getPackageName())), 1);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", java.lang.Integer.valueOf(this.f271051i), e18.getMessage());
                }
            }
        } else if (i17 == 4) {
            if (com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("954_95_first", true)) {
                jx3.f.INSTANCE.mo68477x336bdfd8(954L, 95L, 1L, false);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p642xad8b531f.o.a();
                a17.getClass();
                a17.putBoolean("954_95_first", false);
            }
            jx3.f.INSTANCE.mo68477x336bdfd8(954L, 96L, 1L, false);
            db5.e1.K(this, false, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhj), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new j35.y(this), new j35.z(this));
        }
        this.f271050h = false;
    }
}
