package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI */
/* loaded from: classes8.dex */
public final class ActivityC13996x5a58c237 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {
    public static final /* synthetic */ int S = 0;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 A;
    public android.widget.ImageView B;
    public android.view.View C;
    public android.widget.Button D;
    public int E;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f190887J;
    public java.lang.String K;
    public java.lang.String L;
    public int N;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 P;
    public int Q;
    public long R;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f190891y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f190892z;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f190888v = "FinderLiveCreateVisitorModeUI";

    /* renamed from: w, reason: collision with root package name */
    public final int f190889w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public final int f190890x = 1001;
    public boolean F = true;
    public int M = 28;

    public static final void d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237) {
        java.lang.String str = activityC13996x5a58c237.L;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13996x5a58c237.f190888v, "continuePost nickNameStr:" + activityC13996x5a58c237.L + " is empty!");
            activityC13996x5a58c237.e7(true);
            return;
        }
        java.lang.String str2 = activityC13996x5a58c237.f190887J;
        if (!(str2 == null || str2.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC13996x5a58c237.f190887J, activityC13996x5a58c237.K) && activityC13996x5a58c237.F) {
            java.lang.String str3 = activityC13996x5a58c237.f190887J;
            str2 = str3 != null ? r26.n0.Z(str3, "/96") : null;
        }
        java.lang.String str4 = activityC13996x5a58c237.L;
        java.lang.String str5 = str4 == null ? "" : str4;
        if (str2 == null) {
            str2 = "";
        }
        new ke2.j0(str5, str2, activityC13996x5a58c237.Q, activityC13996x5a58c237.R, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.q8(activityC13996x5a58c237)).l();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: X6, reason: from getter */
    public java.lang.String getF190888v() {
        return this.f190888v;
    }

    public final void e7(boolean z17) {
        android.widget.Button button = this.D;
        if (button != null) {
            button.setEnabled(z17);
        }
        if (z17) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                android.widget.Button button2 = this.D;
                if (button2 != null) {
                    button2.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                    return;
                }
                return;
            }
            android.widget.Button button3 = this.D;
            if (button3 != null) {
                button3.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            android.widget.Button button4 = this.D;
            if (button4 != null) {
                button4.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77671x8113c22a));
                return;
            }
            return;
        }
        android.widget.Button button5 = this.D;
        if (button5 != null) {
            button5.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.apr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.graphics.Bitmap T;
        java.lang.String str;
        android.text.Editable text;
        int i19 = this.f190889w;
        int i27 = this.f190890x;
        java.lang.String str2 = this.f190888v;
        boolean z17 = true;
        if (i17 == i19) {
            if (intent == null || i18 != -1) {
                return;
            }
            setIntent(new android.content.Intent());
            java.lang.String b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(mo55332x76847179(), intent, g83.a.a());
            if (b17 != null && b17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "imgPath is null or empty");
                db5.t7.m123883x26a183b(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbk), 0).show();
                return;
            } else {
                getIntent().putExtra("key_source_img_path", b17);
                ((w40.e) i95.n0.c(w40.e.class)).getClass();
                qs2.v.f447860a.b(this, getIntent(), i27);
                return;
            }
        }
        if (i17 == i27 && intent != null && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("key_result_img_path");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "cropped avatar path is null or empty");
                return;
            }
            this.I = stringExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "avatar path %s file length %d KB", stringExtra, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(stringExtra) / 1024));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || (T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(stringExtra, 256, 256, false)) == null) {
                return;
            }
            android.widget.ImageView imageView = this.f190892z;
            if (imageView != null) {
                imageView.setImageBitmap(T);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.A;
            if (c22621x7603e017 == null || (text = c22621x7603e017.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            java.lang.String b18 = hc2.l.b(str);
            this.L = b18;
            e7(!(b18.length() == 0));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String d17;
        super.onCreate(bundle);
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85244c2).mo141623x754a37bb()).r()).intValue();
        if (intValue > 0 && intValue < Integer.MAX_VALUE) {
            this.M = intValue;
        }
        java.lang.String str = "";
        mo54450xbf7c1df6("");
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x8(this), com.p314xaae8f345.mm.R.raw.f79636xc84bf7ff);
        this.F = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85254d2).mo141623x754a37bb()).r()).intValue() == 0;
        java.lang.String str2 = "initConfigValue filterMyAvatarUrl:" + this.F;
        java.lang.String str3 = this.f190888v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        android.content.Intent intent = getIntent();
        this.H = intent != null ? intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME") : null;
        android.content.Intent intent2 = getIntent();
        this.G = intent2 != null ? intent2.getStringExtra("KEY_ALIAS_VISITOR_AVATAR") : null;
        android.content.Intent intent3 = getIntent();
        this.E = intent3 != null ? intent3.getIntExtra("KEY_SOURCE", 0) : 0;
        android.content.Intent intent4 = getIntent();
        this.Q = intent4 != null ? intent4.getIntExtra("KEY_REPORT_TO_SVR_SCENE", 0) : 0;
        android.content.Intent intent5 = getIntent();
        this.R = intent5 != null ? intent5.getLongExtra("KEY_REPORT_TO_SVR_TS", 0L) : 0L;
        this.f190891y = findViewById(com.p314xaae8f345.mm.R.id.a_0);
        this.f190892z = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.kbn);
        this.A = c22621x7603e017;
        if (c22621x7603e017 != null) {
            java.lang.String str4 = this.H;
            if (str4 == null) {
                str4 = "";
            }
            c22621x7603e017.setText(str4);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kbi);
        this.B = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.r8(this));
        }
        this.D = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.c9z);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(c01.z1.r());
        if (n07 != null && (d17 = n07.d()) != null) {
            str = d17;
        }
        this.K = str;
        java.lang.String str5 = this.G;
        this.f190887J = str5 == null || str5.length() == 0 ? this.K : this.G;
        android.widget.ImageView imageView2 = this.f190892z;
        if (imageView2 != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.l().c(new mn2.n(this.f190887J, null, 2, null), imageView2, g1Var.h(mn2.f1.f411494o));
        }
        android.view.View view = this.f190891y;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.s8(this));
        }
        int i17 = this.M;
        int i18 = i17 / 2;
        zl2.r4.f555483a.Z2(this.A, null, i17, i18 <= 0 ? i17 : i18, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.t8(this));
        this.C = findViewById(com.p314xaae8f345.mm.R.id.f568610nf2);
        e7(false);
        android.widget.Button button = this.D;
        if (button != null) {
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.w8(this));
        }
        android.widget.Button button2 = this.D;
        java.lang.Object layoutParams = button2 != null ? button2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i19 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        this.N = i19;
        if (i19 <= 0) {
            this.N = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        }
        if (this.E == 1) {
            android.widget.Button button3 = this.D;
            if (button3 != null) {
                button3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563270a52);
            }
        } else {
            android.widget.Button button4 = this.D;
            if (button4 != null) {
                button4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a0z);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "initConfirmBtnConfig:" + this.N + ", sourceType:" + this.E);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("maxNickNameLength:");
        sb6.append(this.M);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.P;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        android.view.View decorView;
        super.onResume();
        android.view.Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.z8(this));
    }
}
