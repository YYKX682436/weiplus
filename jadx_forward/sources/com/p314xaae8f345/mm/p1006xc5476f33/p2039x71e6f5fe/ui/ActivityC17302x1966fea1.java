package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

@db5.a(m123858x6ac9171 = 2179)
/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanCardUI */
/* loaded from: classes10.dex */
public class ActivityC17302x1966fea1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements rz3.f {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f240863r = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f240864d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 f240865e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240866f;

    /* renamed from: h, reason: collision with root package name */
    public az3.b f240868h;

    /* renamed from: i, reason: collision with root package name */
    public long f240869i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240867g = true;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f240870m = java.lang.Boolean.FALSE;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f240871n = "";

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7054xe161b683 f240872o = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7054xe161b683();

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.q f240873p = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.e1(this);

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.q f240874q = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f1(this);

    public final void T6() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b c5969xdb95834b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b();
        c5969xdb95834b.f136267g.f89933a = 1;
        c5969xdb95834b.e();
        setResult(0);
        x();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.chq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        getWindow().getDecorView().setSystemUiVisibility(5892);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.m7j);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116(this);
        this.f240865e = c17345xe981d116;
        frameLayout.addView(c17345xe981d116, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.Button button = new android.widget.Button(this);
        button.setWidth(i65.a.b(mo55332x76847179(), 36));
        button.setHeight(i65.a.b(mo55332x76847179(), 36));
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79679xe7836e52);
        com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        button.setBackgroundDrawable(drawable);
        button.setContentDescription(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9a));
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.g1(this));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn), 0, 0);
        frameLayout.addView(button, layoutParams);
        this.f240865e.m68909x764d6925(this.f240864d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d1162 = this.f240865e;
        c17345xe981d1162.getClass();
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onCreate");
        c17345xe981d1162.d();
        int i17 = this.f240864d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.q qVar = this.f240874q;
        switch (i17) {
            case 7:
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i98);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7054xe161b683 c7054xe161b683 = this.f240872o;
                c7054xe161b683.f143652d = 1L;
                c7054xe161b683.k();
                this.f240865e.m68910xdf4c0b64(this.f240873p);
                this.f240871n = getIntent().getStringExtra("scan_bankcard_cert_pem");
                az3.b bVar = new az3.b(this.f240864d, this.f240865e, this, this.f240872o, this.f240870m, this.f240871n, getIntent().getStringExtra("scan_bankcard_baserequest"));
                this.f240868h = bVar;
                bVar.f97698i = this.f240866f;
                return;
            case 8:
            default:
                mo54450xbf7c1df6("");
                return;
            case 9:
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i9b);
                this.f240865e.m68910xdf4c0b64(qVar);
                return;
            case 10:
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i9_);
                this.f240865e.m68910xdf4c0b64(qVar);
                return;
            case 11:
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i9c);
                this.f240865e.m68910xdf4c0b64(qVar);
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("scan_bankcard_use_http", false));
        this.f240870m = valueOf;
        if (!valueOf.booleanValue() && !gm0.j1.a()) {
            T6();
            return;
        }
        m78531x8f8cf1fb();
        int intExtra = getIntent().getIntExtra("BaseScanUI_select_scan_mode", -1);
        this.f240864d = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCardUI", "scanMode %d", java.lang.Integer.valueOf(intExtra));
        this.f240866f = getIntent().getBooleanExtra("scan_bankcard_with_confirm_ui", false);
        mo43517x10010bd5();
        this.f240869i = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = this.f240865e;
        if (c17345xe981d116 != null) {
            c17345xe981d116.m();
        }
        az3.b bVar = this.f240868h;
        if (bVar != null) {
            bVar.mo9410x5cd39ffa();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCardUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults len[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr.length), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16 && iArr.length > 0 && iArr[0] == -1) {
            this.f240867g = false;
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.j1(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.k1(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r10 = this;
            super.onResume()
            boolean r0 = r10.f240867g
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "should check camera %s"
            java.lang.String r2 = "MicroMsg.ScanCardUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1, r0)
            boolean r0 = r10.f240867g
            r1 = 1
            if (r0 == 0) goto L42
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
            if (r0 != 0) goto L42
            r0 = 0
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 == 0) goto L7c
            boolean r0 = zo.e.d()
            if (r0 != 0) goto L77
            r0 = 2131772951(0x7f104617, float:1.9177276E38)
            java.lang.String r3 = r10.getString(r0)
            r0 = 2131772991(0x7f10463f, float:1.9177357E38)
            java.lang.String r4 = r10.getString(r0)
            r0 = 2131770054(0x7f103ac6, float:1.91714E38)
            java.lang.String r5 = r10.getString(r0)
            r0 = 2131756003(0x7f1003e3, float:1.9142901E38)
            java.lang.String r6 = r10.getString(r0)
            r7 = 0
            com.tencent.mm.plugin.scanner.ui.h1 r8 = new com.tencent.mm.plugin.scanner.ui.h1
            r8.<init>(r10)
            com.tencent.mm.plugin.scanner.ui.i1 r9 = new com.tencent.mm.plugin.scanner.ui.i1
            r9.<init>(r10)
            r2 = r10
            db5.e1.C(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L7c
        L77:
            com.tencent.mm.plugin.scanner.view.ScanCardRectView r0 = r10.f240865e
            r0.f()
        L7c:
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.g(r0)
            if (r0 != 0) goto L9a
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.x(r0)
            if (r0 != 0) goto L9a
            android.content.Context r0 = r10.getApplicationContext()
            boolean r0 = iq.b.c(r0, r1)
            if (r0 == 0) goto L9d
        L9a:
            r10.T6()
        L9d:
            android.view.Window r0 = r10.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17302x1966fea1.onResume():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f240865e.n();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.l1.class);
    }

    @Override // rz3.f
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCardUI", "finishUI");
        if (this.f240864d == 7) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7054xe161b683 c7054xe161b683 = this.f240872o;
            if (c7054xe161b683.f143652d == 1) {
                c7054xe161b683.f143652d = 4L;
            }
            c7054xe161b683.f143653e = java.lang.System.currentTimeMillis() - this.f240869i;
            c7054xe161b683.k();
        }
        finish();
        overridePendingTransition(0, 0);
    }
}
