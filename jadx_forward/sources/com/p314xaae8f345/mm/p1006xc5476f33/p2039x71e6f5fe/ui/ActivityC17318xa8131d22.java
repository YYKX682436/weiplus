package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

@db5.a(m123858x6ac9171 = 35)
/* renamed from: com.tencent.mm.plugin.scanner.ui.TranslationResultUI */
/* loaded from: classes3.dex */
public class ActivityC17318xa8131d22 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f241001d;

    /* renamed from: e, reason: collision with root package name */
    public long f241002e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f241003f;

    /* renamed from: g, reason: collision with root package name */
    public int f241004g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f241005h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f241006i;

    /* renamed from: m, reason: collision with root package name */
    public dm.aa f241007m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f241008n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.k4 f241009o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f241010p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f241011q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f241012r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f241013s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f241014t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f241015u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Rect f241016v;

    /* renamed from: w, reason: collision with root package name */
    public float f241017w;

    /* renamed from: x, reason: collision with root package name */
    public float f241018x;

    /* renamed from: y, reason: collision with root package name */
    public float f241019y;

    /* renamed from: z, reason: collision with root package name */
    public float f241020z;

    public final void T6() {
        android.graphics.Rect rect = this.f241016v;
        if (rect == null) {
            finish();
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        } else {
            if (this.A) {
                return;
            }
            this.A = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslationResultUI", "runExitAnimation, thumbRect %s", rect);
            this.B.a(this.f241012r, this.f241014t, new com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3(this.f241016v), new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.h4(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.i4(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bkl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f241014t = findViewById(com.p314xaae8f345.mm.R.id.m7j);
        this.f241013s = findViewById(com.p314xaae8f345.mm.R.id.m9u);
        this.f241012r = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ght);
        this.B = (com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae) findViewById(com.p314xaae8f345.mm.R.id.f564589vf);
        this.f241015u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oje);
        this.f241001d = getIntent().getStringExtra("original_file_path");
        this.f241002e = getIntent().getLongExtra("msg_id", -1L);
        this.f241003f = getIntent().getStringExtra("msg_talker");
        this.f241004g = getIntent().getIntExtra("translate_source", 0);
        this.f241016v = (android.graphics.Rect) getIntent().getParcelableExtra("thumb_location");
        this.f241005h = getIntent().getStringExtra("fileid");
        this.f241006i = getIntent().getStringExtra("aeskey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslationResultUI", "file path %s", this.f241001d);
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f241001d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TranslationResultUI", "translation original file not exist!");
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m9o);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.bottomMargin += com.p314xaae8f345.mm.ui.bk.j(this);
        findViewById.setLayoutParams(layoutParams);
        mo2533x106ab264().o();
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78514x143f1b92().E0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f241010p = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById(com.p314xaae8f345.mm.R.id.oji);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.k4(this, null);
        this.f241009o = k4Var;
        this.f241010p.setAdapter((android.widget.SpinnerAdapter) k4Var);
        this.f241010p.mo55657x3be48126(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.c4(this));
        dm.aa bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z.class))).bj(this.f241001d);
        this.f241007m = bj6;
        if (bj6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TranslationResultUI", "translation result not found!");
            T6();
            return;
        }
        android.graphics.Bitmap bitmap = this.f241008n;
        if (bitmap == null) {
            s75.d.f486168a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.e4(this), "decode_translate_result_img", true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.k4 k4Var2 = this.f241009o;
            k4Var2.f241113d = bitmap;
            k4Var2.notifyDataSetChanged();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f241007m.f65911x28e32c02)) {
            this.f241015u.setText(this.f241007m.f65911x28e32c02);
            this.f241015u.setVisibility(0);
        }
        this.f241013s.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f4(this));
        android.view.View view = this.f241013s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f241010p.mo55654x9bfee16e(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.g4(this));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f241003f, this.f241002e);
        if (this.f241002e != -1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5245x7a3faa94 c5245x7a3faa94 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5245x7a3faa94();
            c5245x7a3faa94.f135577g.f88428a = Li;
            c5245x7a3faa94.e();
            android.graphics.Rect rect = new android.graphics.Rect();
            this.f241016v = rect;
            am.j2 j2Var = c5245x7a3faa94.f135578h;
            int i17 = j2Var.f88532a;
            rect.left = i17;
            int i18 = j2Var.f88533b;
            rect.top = i18;
            rect.right = j2Var.f88534c + i17;
            rect.bottom = j2Var.f88535d + i18;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f241008n = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        getWindow().getDecorView().setBackgroundDrawable(null);
        getWindow().getDecorView().setSystemUiVisibility(5892);
    }
}
