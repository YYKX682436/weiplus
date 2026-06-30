package com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI */
/* loaded from: classes14.dex */
public class ActivityC13534x1dc4b4e7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f181706J = 0;
    public k72.i A;
    public int B;
    public int C;
    public int D;
    public long E;
    public long F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f181707d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f181708e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f181709f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f181710g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1409x9e7e39d6.ui.C13539x6248de2f f181711h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.C13533xbf67dc9f f181712i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 f181713m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f181714n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f181715o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f181716p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f181717q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f181718r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f181719s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f181720t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f181721u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f181722v;

    /* renamed from: x, reason: collision with root package name */
    public int f181724x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f181725y;

    /* renamed from: z, reason: collision with root package name */
    public n72.q f181726z;

    /* renamed from: w, reason: collision with root package name */
    public boolean f181723w = false;
    public java.lang.String H = "";
    public int I = 0;

    public void T6(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "callbackDetectFailed（）");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("token", str2);
        bundle.putString("serial_id", str3);
        U6(str, i17, bundle, java.lang.Boolean.valueOf(this.f181723w));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void U6(java.lang.String str, int i17, android.os.Bundle bundle, java.lang.Boolean bool) {
        char c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "finishWithResult errMsg: %s, errCode: %d", str, java.lang.Integer.valueOf(i17));
        java.lang.String str2 = bool.booleanValue() ? "yes" : "no";
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("click_other_verify_btn", str2);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "seriaId:%s", this.H);
        bundle2.putString("serial_id", this.H);
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putInt("err_code", i17);
        bundle3.putString("err_msg", str);
        bundle3.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.C);
        bundle3.putInt("countFace", this.D);
        bundle3.putInt("err_type", this.G);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.F = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "endTime：" + this.F);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "startTime：" + this.E);
        bundle3.putLong("totalTime", this.F - this.E);
        bundle3.putAll(bundle2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle3);
        str.getClass();
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case 3548:
                if (str.equals("ok")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 3135262:
                if (str.equals("fail")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                vz2.c.j("usrCancel");
                setResult(0, intent);
                break;
            case 1:
                setResult(-1, intent);
                break;
            case 2:
                setResult(1, intent);
                break;
            default:
                setResult(-1, intent);
                break;
        }
        if (i17 != 0) {
            vz2.c.h(i17);
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "errCode == ConstantsFace.UploadErrCode.OK");
        ku5.u0 u0Var = ku5.t0.f394148d;
        l72.q qVar = new l72.q(this, i17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(qVar, 1500L, false);
    }

    public final void V6() {
        this.f181707d = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.do8);
        this.f181711h = (com.p314xaae8f345.mm.p1006xc5476f33.p1409x9e7e39d6.ui.C13539x6248de2f) findViewById(com.p314xaae8f345.mm.R.id.f565817do2);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 c21518xd171d8a0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0) findViewById(com.p314xaae8f345.mm.R.id.f565816do1);
        this.f181713m = c21518xd171d8a0;
        c21518xd171d8a0.setVisibility(4);
        this.f181712i = (com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.C13533xbf67dc9f) findViewById(com.p314xaae8f345.mm.R.id.f565818do3);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dme);
        this.f181717q = imageView;
        imageView.post(new l72.k(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565819do4);
        this.f181715o = textView;
        textView.post(new l72.l(this));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dmd)).setOnClickListener(new l72.m(this));
        this.I = 0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a_w;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.I == 3) {
            T6("fail", this.B, "", this.H);
        } else {
            k72.u.B.a();
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "onCreate()");
        super.onCreate(bundle);
        vz2.c.c().f137736e = 1L;
        vz2.c.j("enter");
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(2097280);
        this.C = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.D = 0;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.E = android.os.SystemClock.elapsedRealtime();
        this.G = 4;
        getWindow().getDecorView().setSystemUiVisibility(1280);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f181714n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aar);
        V6();
        this.f181708e = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.dox);
        this.f181709f = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.doy);
        this.f181710g = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.dow);
        this.f181708e.setVisibility(4);
        this.f181709f.setVisibility(4);
        this.f181710g.setVisibility(4);
        this.f181716p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dna);
        this.f181718r = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dn6);
        this.f181719s = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dng);
        this.f181722v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dne);
        this.f181720t = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dnc);
        this.f181721u = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dnd);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k72.u.B.f386287i)) {
            this.f181721u.setVisibility(8);
        } else {
            this.f181721u.setText(k72.u.B.f386287i);
            this.f181721u.setOnClickListener(new l72.n(this));
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.b(this)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "carson: no camera permission. request permission");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "carson: checkFacePermissionAnd Request true and do init ");
        this.A = new l72.c(this);
        k72.u uVar = k72.u.B;
        uVar.f386293r = new l72.j(this);
        uVar.f386294s = this;
        uVar.c(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "onDestroy");
        k72.u.B.b(true);
        k72.u.B.f386294s = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRequestPermissionsResult(int r9, java.lang.String[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "preview");
        n72.q qVar = this.f181726z;
        if (qVar != null) {
            qVar.f416815q = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "mCamera ！= null");
        }
        this.f181715o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c7o);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        n72.q qVar = this.f181726z;
        if (qVar != null) {
            qVar.f(this.f181713m);
            this.f181726z.g();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "onStop");
        super.onStop();
        n72.q qVar = this.f181726z;
        if (qVar != null) {
            qVar.f416816r = false;
        }
    }
}
