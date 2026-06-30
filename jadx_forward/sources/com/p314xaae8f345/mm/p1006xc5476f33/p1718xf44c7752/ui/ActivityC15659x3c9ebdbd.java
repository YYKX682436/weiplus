package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.gallery.ui.SmartGalleryUI */
/* loaded from: classes10.dex */
public class ActivityC15659x3c9ebdbd extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f220154w = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f220155d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f220156e;

    /* renamed from: f, reason: collision with root package name */
    public e33.y5 f220157f;

    /* renamed from: g, reason: collision with root package name */
    public e33.g6 f220158g;

    /* renamed from: h, reason: collision with root package name */
    public e33.b6 f220159h;

    /* renamed from: i, reason: collision with root package name */
    public e33.i6 f220160i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f220161m;

    /* renamed from: n, reason: collision with root package name */
    public int f220162n;

    /* renamed from: o, reason: collision with root package name */
    public int f220163o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f220164p;

    /* renamed from: r, reason: collision with root package name */
    public android.app.ProgressDialog f220166r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 f220167s;

    /* renamed from: q, reason: collision with root package name */
    public boolean f220165q = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f220168t = true;

    /* renamed from: u, reason: collision with root package name */
    public final e33.z5 f220169u = new e33.s5(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f220170v = false;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd, java.lang.String str, boolean z17) {
        activityC15659x3c9ebdbd.f220165q = true;
        if (z17) {
            activityC15659x3c9ebdbd.mo48674x36654fab();
            activityC15659x3c9ebdbd.f220156e.clearFocus();
        }
        activityC15659x3c9ebdbd.f220155d.S0(activityC15659x3c9ebdbd.f220167s);
        activityC15659x3c9ebdbd.f220159h.f328696d = str;
        t23.y0 n17 = t23.p0.n();
        e33.b6 b6Var = activityC15659x3c9ebdbd.f220159h;
        java.util.concurrent.ExecutorService executorService = n17.f496838f;
        if (executorService != null) {
            ((ku5.f) executorService).execute(b6Var);
        }
    }

    public final void U6() {
        android.net.Uri uri = t23.o2.f496749e;
        int size = ((java.util.ArrayList) t23.n2.f496742a.f496753d).size();
        if (size > 0) {
            this.f220161m.setEnabled(true);
        } else {
            this.f220161m.setEnabled(false);
        }
        this.f220161m.setText(j33.d0.i(this, this.f220162n, size, this.f220163o, this.f220164p, false, null, true, false));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571010co4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "requestCode: %d, resultCode: %d.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("send_raw_img", false);
            this.f220170v = booleanExtra;
            intent.putExtra("send_raw_img", booleanExtra);
            android.os.Bundle extras = intent.getExtras();
            if (extras != null) {
                for (java.lang.String str : extras.keySet()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "key: %s, value: %s.", str, extras.get(str));
                }
            }
        }
        if (1 == i17) {
            if (-2 == i18 || i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "just back from AlbumPreviewUI.");
                U6();
            } else {
                setResult(i18, intent);
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f220162n = getIntent().getIntExtra("query_source_type", 3);
        this.f220163o = getIntent().getIntExtra("max_select_count", 9);
        this.f220164p = getIntent().getStringExtra("album_business_tag");
        this.f220170v = getIntent().getBooleanExtra("send_raw_img", false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 0, null);
        this.f220166r = c17;
        c17.show();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560696rn));
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560696rn));
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569439b8, (android.view.ViewGroup) new android.widget.LinearLayout(this), false);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.n0m).setOnClickListener(new e33.m5(this));
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.n0o);
        this.f220156e = editText;
        editText.setOnTouchListener(new e33.n5(this));
        this.f220156e.setOnEditorActionListener(new e33.o5(this));
        this.f220156e.addTextChangedListener(new e33.p5(this));
        this.f220161m = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.n0p);
        U6();
        this.f220161m.setOnClickListener(new e33.q5(this));
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.I(new android.graphics.drawable.ColorDrawable(mo55332x76847179().getResources().getColor(android.R.color.transparent)));
            mo2533x106ab264.F(false);
            mo2533x106ab264.B(false);
            mo2533x106ab264.E(false);
            mo2533x106ab264.D(true);
            mo2533x106ab264.y(inflate);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SmartGalleryUI", "actionbar is null.");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(this, 1);
        this.f220167s = i0Var;
        i0Var.d(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b0n));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.n0n);
        this.f220155d = c1163xf1deaba4;
        c1163xf1deaba4.i(new e33.r5(this));
        this.f220155d.N(this.f220167s);
        e33.y5 y5Var = new e33.y5(this);
        this.f220157f = y5Var;
        e33.z5 z5Var = this.f220169u;
        y5Var.f329090f = z5Var;
        e33.g6 g6Var = new e33.g6(this);
        this.f220158g = g6Var;
        g6Var.f328772f = z5Var;
        this.f220155d.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f220155d.mo7960x6cab2c8d(this.f220157f);
        e33.i6 i6Var = new e33.i6(this.f220155d, this.f220158g);
        this.f220160i = i6Var;
        this.f220159h = new e33.b6(i6Var);
        t23.y0 n17 = t23.p0.n();
        e33.a6 a6Var = new e33.a6(this.f220157f, this.f220166r, this.f220156e);
        java.util.concurrent.ExecutorService executorService = n17.f496838f;
        if (executorService != null) {
            ((ku5.f) executorService).execute(a6Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.net.Uri uri = t23.o2.f496749e;
        t23.o2 o2Var = t23.n2.f496742a;
        o2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryQueryUtil", "clearSelectedMediaPath");
        ((java.util.ArrayList) o2Var.f496753d).clear();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.f220156e.getText())) {
            this.f220156e.setText("");
            return true;
        }
        setResult(-2, getIntent().putExtra("send_raw_img", this.f220170v));
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f220156e.clearFocus();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
    }
}
