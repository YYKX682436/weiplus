package com.tencent.mm.plugin.facedetect.ui;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes14.dex */
public class FaceDetectConfirmUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int S = 0;
    public int B;
    public android.widget.ImageView C;
    public android.widget.TextView D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f100048J;
    public r45.zd5 K;
    public java.lang.String L;
    public android.widget.TextView M;
    public android.view.ViewGroup N;
    public android.widget.CheckBox P;
    public android.widget.TextView Q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f100049d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f100050e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckBox f100051f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f100052g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f100053h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f100054i;

    /* renamed from: q, reason: collision with root package name */
    public float f100059q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f100060r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f100061s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f100062t;

    /* renamed from: u, reason: collision with root package name */
    public int f100063u;

    /* renamed from: v, reason: collision with root package name */
    public int f100064v;

    /* renamed from: w, reason: collision with root package name */
    public int f100065w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f100066x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f100067y;

    /* renamed from: m, reason: collision with root package name */
    public r45.zd5 f100055m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f100056n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f100057o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f100058p = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f100068z = true;
    public int A = 0;
    public java.lang.String G = "";
    public float H = 0.0f;
    public long I = 0;
    public boolean R = false;

    public static void T6(com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI, java.lang.String str) {
        faceDetectConfirmUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectConfirmUI", "jumpToWebView url is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(faceDetectConfirmUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void U6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("err_code", com.tencent.mm.plugin.facedetect.model.k0.a(90022));
        intent.putExtra("err_msg", "get confirm info error");
        intent.putExtra("verify_result", this.G);
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().c(this.f100063u, false, 3, 2, 90022);
        vz2.c.f(90022);
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().f99982p = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().b(this.f100062t, this.f100063u);
        setResult(-1, intent);
        finish();
    }

    public final void V6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("err_code", com.tencent.mm.plugin.facedetect.model.k0.a(90024));
        intent.putExtra("err_msg", "user cancel in confirm ui");
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().c(this.f100063u, false, 3, 1, 90024);
        vz2.c.k("msgVerify", "user cancel in confirm ui");
        vz2.c.f(90024);
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().f99982p = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().b(this.f100062t, this.f100063u);
        setResult(0, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f100053h;
        if (u3Var != null && u3Var.isShowing()) {
            this.f100053h.dismiss();
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488746aa1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "onActiviyResult reqeustCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().f99982p = java.lang.System.currentTimeMillis();
        if (intent != null && intent.hasExtra("err_code")) {
            intent.putExtra("err_code", com.tencent.mm.plugin.facedetect.model.k0.a(intent.getIntExtra("err_code", -1)));
        }
        setResult(i18, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.R) {
            U6();
        } else {
            V6();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        vz2.c.b().f56191p = java.lang.System.currentTimeMillis();
        hideActionbarLine();
        this.f100060r = getIntent().getStringExtra("appId");
        this.f100061s = getIntent().getStringExtra("request_verify_pre_info");
        this.f100062t = getIntent().getStringExtra("key_function_name");
        this.f100063u = getIntent().getIntExtra("key_business_type", -1);
        boolean z17 = false;
        this.f100064v = getIntent().getIntExtra("check_alive_type", 0);
        this.I = java.lang.System.currentTimeMillis();
        this.f100068z = !getIntent().getBooleanExtra("face_flash_no_use_id_card", false);
        this.A = getIntent().getIntExtra("identify_type", 0);
        this.B = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "appId:%s jsonData:%s functionName:%s businessType:%s check_alive_type_request:%s isUseIdCard: %b identify_type: %s", this.f100060r, this.f100061s, this.f100062t, java.lang.Integer.valueOf(this.f100063u), java.lang.Integer.valueOf(this.f100064v), java.lang.Boolean.valueOf(this.f100068z), java.lang.Integer.valueOf(this.A));
        this.f100048J = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.dmt);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new g72.g(this));
        this.f100049d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dmu);
        this.f100050e = (android.widget.Button) findViewById(com.tencent.mm.R.id.ngn);
        this.C = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a3f);
        this.D = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a3g);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.dmw)).setOnClickListener(new g72.h(this));
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.dmv);
        this.f100051f = checkBox;
        checkBox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: g72.a$$a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z18) {
                com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI = com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.this;
                boolean z19 = false;
                boolean z27 = faceDetectConfirmUI.N.getVisibility() == 8 || faceDetectConfirmUI.P.isChecked();
                android.widget.Button button = faceDetectConfirmUI.f100050e;
                if (z18 && z27) {
                    z19 = true;
                }
                button.setEnabled(z19);
            }
        });
        this.f100051f.setVisibility(8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dmx);
        this.f100052g = textView;
        textView.setOnClickListener(new g72.i(this));
        this.f100054i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dms);
        this.M = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pjj);
        this.N = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f484276dn0);
        this.Q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484277dn1);
        this.P = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.dmz);
        this.N.setVisibility(8);
        this.P.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: g72.a$$b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z18) {
                com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI = com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.this;
                faceDetectConfirmUI.f100050e.setEnabled(z18 && faceDetectConfirmUI.f100051f.isChecked());
            }
        });
        this.N.setOnClickListener(new android.view.View.OnClickListener() { // from class: g72.a$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.S;
                com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI = com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.this;
                faceDetectConfirmUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", faceDetectConfirmUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", faceDetectConfirmUI, array2);
                faceDetectConfirmUI.P.setChecked(!r8.isChecked());
                yj0.a.h(faceDetectConfirmUI, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(faceDetectConfirmUI, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f100050e.setOnClickListener(new g72.j(this));
        if (this.A == 1 && this.B == 5) {
            z17 = true;
        }
        if (z17) {
            this.f100050e.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "start get confirm info");
        this.f100053h = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), false, false, new g72.k(this));
        c72.p pVar = new c72.p(this.f100060r, this.f100061s, this.f100064v, this.f100068z, this.A);
        gm0.j1.d().a(1147, this);
        gm0.j1.d().g(pVar);
        wz2.e.f450770a.a(this);
        vz2.c.m(1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.hardware.SensorManager sensorManager;
        super.onDestroy();
        wz2.f fVar = wz2.e.f450770a;
        if (!fVar.f450773c || (sensorManager = fVar.f450771a) == null) {
            return;
        }
        fVar.f450773c = false;
        sensorManager.unregisterListener(fVar.f450772b);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "onRequestPermissionsResult");
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        if (i17 == 16) {
            if (iArr[0] == 0) {
                this.f100050e.performClick();
                return;
            } else {
                db5.e1.C(this, getString(com.tencent.mm.R.string.c7j), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new g72.c(this), new g72.d(this));
                return;
            }
        }
        if (i17 == 18 || i17 == 80) {
            if (iArr[0] == 0) {
                this.f100050e.performClick();
            } else {
                db5.e1.C(this, getString(com.tencent.mm.R.string.c7k), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new g72.e(this), new g72.f(this));
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "scene: %d, errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        vz2.c.k("confirmCode", java.lang.Integer.valueOf(i17));
        vz2.c.k("confirmMsg", str);
        c72.p pVar = (c72.p) m1Var;
        java.lang.String str3 = pVar.f39569n;
        this.f100057o = str3;
        this.G = pVar.f39577v;
        this.H = pVar.f39575t;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "mFeedbackUrl:%s", str3);
        if (i17 == 0 && i18 == 0) {
            this.f100055m = pVar.f39565g;
            this.f100056n = pVar.f39568m;
            this.f100058p = pVar.f39570o;
            this.f100059q = pVar.f39571p;
            this.f100065w = pVar.f39572q;
            this.f100066x = pVar.f39573r;
            this.f100067y = pVar.f39574s;
            this.E = pVar.f39566h;
            this.F = pVar.f39567i;
            this.L = pVar.f39579x;
            this.K = pVar.f39578w;
            m1Var.toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f100056n)) {
                this.f100056n = getString(com.tencent.mm.R.string.c6q);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f100053h;
            if (u3Var != null && u3Var.isShowing()) {
                this.f100053h.dismiss();
            }
            if (this.A == 1 && this.B == 5) {
                this.f100050e.performClick();
            } else {
                this.f100050e.setEnabled(true);
                this.f100049d.setText(this.f100056n);
                this.D.setText(java.lang.String.format(getString(com.tencent.mm.R.string.c6r), this.F));
                n11.a.b().g(this.E, this.C);
                r45.zd5 zd5Var = this.f100055m;
                if (zd5Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "protocol info: %s", zd5Var.f391937d);
                    java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(zd5Var.f391937d) ? getString(com.tencent.mm.R.string.c6p) : zd5Var.f391937d;
                    java.lang.String string2 = com.tencent.mm.sdk.platformtools.t8.K0(zd5Var.f391939f) ? getString(com.tencent.mm.R.string.c6o) : zd5Var.f391939f;
                    android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(string + string2);
                    newSpannable.setSpan(new g72.n(this), string.length(), string.length() + string2.length(), 33);
                    this.f100051f.setVisibility(0);
                    this.f100052g.setVisibility(0);
                    this.f100052g.setText(newSpannable);
                    this.f100052g.setMovementMethod(new g72.o(this, zd5Var));
                    int i19 = zd5Var.f391940g;
                    if (i19 == 0) {
                        this.f100051f.setChecked(false);
                        this.f100050e.setEnabled(false);
                    } else if (i19 == 1) {
                        this.f100051f.setChecked(true);
                        this.f100050e.setEnabled(true);
                    }
                    this.f100054i.setText(getString(com.tencent.mm.R.string.c6m));
                    this.f100054i.setOnClickListener(new g72.b(this));
                    this.f100054i.setVisibility(0);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "wechat header text: %s", this.L);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
                    this.M.setVisibility(0);
                    this.M.setText(this.L);
                }
                r45.zd5 zd5Var2 = this.K;
                if (zd5Var2 != null && (str2 = zd5Var2.f391937d) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "wechat promptInfo wording: %s, check status: %d", str2, java.lang.Integer.valueOf(zd5Var2.f391940g));
                    this.N.setVisibility(0);
                    int i27 = this.K.f391940g;
                    if (i27 == 0) {
                        this.P.setChecked(false);
                        this.f100050e.setEnabled(false);
                    } else if (i27 == 1) {
                        this.P.setChecked(true);
                        this.f100050e.setEnabled(true);
                    }
                    this.Q.setText(this.K.f391937d);
                }
                this.f100048J.setVisibility(8);
            }
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = getString(com.tencent.mm.R.string.c79);
            }
            java.lang.String str4 = pVar.f39576u;
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f100053h;
            if (u3Var2 != null && u3Var2.isShowing()) {
                this.f100053h.dismiss();
            }
            this.R = true;
            if (this.A == 1 && this.B == 5) {
                U6();
            } else {
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477770az);
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477771b0);
                android.widget.TextView textView = (android.widget.TextView) this.f100048J.findViewById(com.tencent.mm.R.id.dnt);
                android.widget.TextView textView2 = (android.widget.TextView) this.f100048J.findViewById(com.tencent.mm.R.id.dnq);
                android.widget.ImageView imageView = (android.widget.ImageView) this.f100048J.findViewById(com.tencent.mm.R.id.dnr);
                android.widget.Button button = (android.widget.Button) this.f100048J.findViewById(com.tencent.mm.R.id.dnm);
                android.widget.TextView textView3 = (android.widget.TextView) this.f100048J.findViewById(com.tencent.mm.R.id.dnl);
                android.widget.ImageView imageView2 = (android.widget.ImageView) this.f100048J.findViewById(com.tencent.mm.R.id.dnp);
                this.f100048J.setVisibility(0);
                button.setText(com.tencent.mm.R.string.f490507x1);
                button.setOnClickListener(new g72.l(this));
                imageView2.setImageResource(com.tencent.mm.R.drawable.f481431t6);
                imageView2.startAnimation(loadAnimation);
                imageView.setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.raw.icons_filled_error3));
                imageView.startAnimation(loadAnimation2);
                textView.setText(str);
                if (!android.text.TextUtils.isEmpty(str4)) {
                    textView2.setText(str4);
                }
                textView3.setVisibility(android.text.TextUtils.isEmpty(this.f100057o) ? 4 : 0);
                textView3.setOnClickListener(new g72.m(this, i18));
            }
        }
        gm0.j1.d().q(1147, this);
    }
}
