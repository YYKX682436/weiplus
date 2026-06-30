package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/ScanPassportUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/scanner/ui/n1", "scan-card_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanPassportUI */
/* loaded from: classes11.dex */
public final class ActivityC17304x140e10a3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f240876i = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 f240878e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f240880g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f240877d = "MicroMsg.ScanPassportUI";

    /* renamed from: f, reason: collision with root package name */
    public boolean f240879f = true;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p1 f240881h = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p1(this);

    public final void T6() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e c5968xe69f472e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e();
        am.ws wsVar = c5968xe69f472e.f136266g;
        wsVar.f89852a = 3;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("scan_detail", 9);
        jSONObject.put("scan_time", java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var = this.f240878e;
        jSONObject.put("scan_session_id", t0Var != null ? t0Var.m68918x45bd482c() : 0L);
        wsVar.f89853b = jSONObject.toString();
        c5968xe69f472e.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e c5968xe69f472e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e();
        c5968xe69f472e2.f136266g.f89852a = 2;
        c5968xe69f472e2.e();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.chq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.util.HashMap hashMap;
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(5892);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f240878e = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0(this);
        java.lang.String stringExtra = getIntent().getStringExtra("key_basescanui_scan_detail_msg_map");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var = this.f240878e;
        if (t0Var != null) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra);
            java.lang.String str = this.f240877d;
            if (K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "parseHashMapFromJSONStr: objStr is null!");
            } else {
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                    org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra);
                    hashMap = new java.util.HashMap();
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.String string = jSONObject.getString(next);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                        hashMap.put(next, string);
                    }
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "parseHashMapFromJSONStr: JSON error!");
                }
                t0Var.m68922x9091d16b(hashMap);
            }
            hashMap = null;
            t0Var.m68922x9091d16b(hashMap);
        }
        frameLayout.addView(this.f240878e, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var2 = this.f240878e;
        if (t0Var2 != null) {
            t0Var2.m68920x73e19638(java.lang.System.currentTimeMillis());
        }
        android.widget.Button button = new android.widget.Button(this);
        button.setWidth(i65.a.b(mo55332x76847179(), 28));
        button.setHeight(i65.a.b(mo55332x76847179(), 28));
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f78541x155f196f);
        com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        button.setBackgroundDrawable(drawable);
        button.setContentDescription(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9a));
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o1(this));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn), 0, 0);
        frameLayout.addView(button, layoutParams);
        this.f240880g = button;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var3 = this.f240878e;
        if (t0Var3 != null) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onCreate");
            t0Var3.d();
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i9c);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var4 = this.f240878e;
        if (t0Var4 != null) {
            t0Var4.m68921xdf4c0b64(this.f240881h);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        android.widget.Button button = this.f240880g;
        java.lang.Integer num = null;
        android.view.ViewGroup.LayoutParams layoutParams = button != null ? button.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        if (!(mo55332x76847179 instanceof android.app.Activity)) {
            mo55332x76847179 = null;
        }
        if (mo55332x76847179 != null && (windowManager = mo55332x76847179.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            num = java.lang.Integer.valueOf(defaultDisplay.getRotation());
        }
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 2)) {
            layoutParams2.leftMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
            layoutParams2.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        } else {
            layoutParams2.leftMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
            layoutParams2.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        }
        android.widget.Button button2 = this.f240880g;
        if (button2 == null) {
            return;
        }
        button2.setLayoutParams(layoutParams2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(2);
        m78531x8f8cf1fb();
        mo43517x10010bd5();
        java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var = this.f240878e;
        if (t0Var != null) {
            t0Var.u();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f240877d, "summerper onRequestPermissionsResult requestCode[%d],grantResults len[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults.length), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if ((!(grantResults.length == 0)) && grantResults[0] == -1) {
                this.f240879f = false;
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.q1(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.r1(this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r10 = this;
            super.onResume()
            boolean r0 = r10.f240879f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "should check camera %s"
            java.lang.String r2 = r10.f240877d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1, r0)
            boolean r0 = r10.f240879f
            r1 = 1
            if (r0 == 0) goto L41
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            sb0.f r0 = (sb0.f) r0
            r0.getClass()
            r0 = 16
            r3 = 0
            java.lang.String r4 = "android.permission.CAMERA"
            boolean r0 = j35.u.a(r10, r4, r0, r3, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "summerper checkPermission checkCamera[%b]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r3)
            if (r0 != 0) goto L41
            r0 = 0
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 == 0) goto L7d
            boolean r0 = zo.e.d()
            if (r0 != 0) goto L76
            r0 = 2131772951(0x7f104617, float:1.9177276E38)
            java.lang.String r3 = r10.getString(r0)
            r0 = 2131772991(0x7f10463f, float:1.9177357E38)
            java.lang.String r4 = r10.getString(r0)
            r0 = 2131770054(0x7f103ac6, float:1.91714E38)
            java.lang.String r5 = r10.getString(r0)
            r0 = 2131756003(0x7f1003e3, float:1.9142901E38)
            java.lang.String r6 = r10.getString(r0)
            r7 = 0
            com.tencent.mm.plugin.scanner.ui.s1 r8 = new com.tencent.mm.plugin.scanner.ui.s1
            r8.<init>(r10)
            com.tencent.mm.plugin.scanner.ui.t1 r9 = new com.tencent.mm.plugin.scanner.ui.t1
            r9.<init>(r10)
            r2 = r10
            db5.e1.C(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L7d
        L76:
            com.tencent.mm.plugin.scanner.view.t0 r0 = r10.f240878e
            if (r0 == 0) goto L7d
            r0.f()
        L7d:
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.g(r0)
            if (r0 != 0) goto L9b
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.x(r0)
            if (r0 != 0) goto L9b
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.c(r0, r1)
            if (r0 == 0) goto L9e
        L9b:
            r10.T6()
        L9e:
            android.view.Window r0 = r10.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17304x140e10a3.onResume():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var = this.f240878e;
        if (t0Var != null) {
            t0Var.w();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n1.class);
    }
}
