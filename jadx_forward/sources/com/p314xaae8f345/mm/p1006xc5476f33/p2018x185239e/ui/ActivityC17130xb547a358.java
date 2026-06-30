package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI */
/* loaded from: classes9.dex */
public class ActivityC17130xb547a358 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {
    public static final /* synthetic */ int A1 = 0;
    public java.lang.String A;
    public double B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;
    public java.lang.String K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.C17122x2c1fc2f7 L;
    public r45.vo M;
    public int N;
    public android.os.ResultReceiver Q;
    public android.widget.LinearLayout R;
    public android.widget.LinearLayout S;
    public int W;
    public java.lang.String X;
    public a36.c Y;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 Z;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f238698d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f238699e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f238700f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f238701g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f238702h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f238703i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f238705m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f238706n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f238707o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f238708p;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f238709p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f238710p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f238711q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f238712r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f238713s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f238714t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f238715u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f238716v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f238717w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f238718x;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f238719x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f238721y;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewGroup f238722y0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f238724z;

    /* renamed from: J, reason: collision with root package name */
    public boolean f238697J = false;
    public boolean P = false;
    public final java.lang.Runnable T = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t1(this);
    public final r45.k6 U = new r45.k6();
    public final r45.yr V = new r45.yr();

    /* renamed from: l1, reason: collision with root package name */
    public boolean f238704l1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f238720x1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.2
        {
            this.f39173x3fe91575 = 520089918;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "receive pay result event, do finish");
            int i17 = c6249x2aa12f2e.f136498g.f89395b;
            if (i17 != 1000 && i17 != 1001) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358.this.finish();
            return false;
        }
    };

    /* renamed from: y1, reason: collision with root package name */
    public boolean f238723y1 = true;

    /* renamed from: z1, reason: collision with root package name */
    public final java.lang.Runnable f238725z1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.z1(this);

    public final boolean U6(android.view.View view) {
        return view == null || view.getVisibility() == 8;
    }

    public final void V6() {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.e(this.Y)) {
            this.Z.setVisibility(8);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "setAwardWidget, mTransId: %s", this.D);
        this.Z.n(this, this.Y, this.D, true, (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aai));
        this.Z.g();
        this.Z.setVisibility(0);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aai);
        imageView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.v1(this, imageView, (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.mcr)));
        Z6(this.Z);
    }

    public final void W6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r rVar) {
        r45.ep epVar;
        java.lang.String str;
        this.f238719x0.setVisibility(8);
        this.f238709p0.setVisibility(8);
        this.f238722y0.setVisibility(8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ohi);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ohj);
        if (rVar == null || (epVar = rVar.f238519e) == null || epVar.f455167i.size() <= 0) {
            return;
        }
        java.util.LinkedList linkedList = rVar.f238519e.f455167i;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = linkedList;
        objArr[1] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
        objArr[2] = java.lang.Long.valueOf(rVar.f238519e.f455166h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "discountInfoList: %s, size: %s received_amount: %s", objArr);
        int size = linkedList.size();
        if (linkedList.size() > 0) {
            this.f238719x0.removeAllViews();
            this.f238709p0.setOnClickListener(null);
            if (size > 1) {
                str = rVar.f238519e.f455170o;
                this.f238723y1 = true;
                findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.x1(this, findViewById));
                this.f238709p0.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.y1(this, findViewById));
            } else {
                str = "";
            }
            if (size == 1 && linkedList.get(0) != null) {
                str = (java.lang.String) linkedList.get(0);
            }
            for (int i17 = 0; i17 < linkedList.size(); i17++) {
                java.lang.String str2 = (java.lang.String) linkedList.get(i17);
                android.widget.TextView textView2 = new android.widget.TextView(mo55332x76847179());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = i65.a.b(this, 6);
                textView2.setLayoutParams(layoutParams);
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
                textView2.setText(str2);
                this.f238719x0.addView(textView2);
            }
            this.f238719x0.setVisibility(0);
            this.f238709p0.setVisibility(0);
        } else {
            str = "";
        }
        if (this.f238723y1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(str.concat(" "));
            if (size > 1) {
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ohk);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ohk);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView.setText(spannableString);
            this.f238709p0.setVisibility(8);
        }
    }

    public final void X6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r rVar) {
        java.lang.String I;
        this.f238717w.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.C17122x2c1fc2f7 c17122x2c1fc2f7 = this.L;
        if (c17122x2c1fc2f7 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17122x2c1fc2f7.f238300s)) {
            I = this.L.f238300s;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238718x)) {
            I = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.I(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(this.A), 6);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.K)) {
                I = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyz, I, this.K);
            }
        } else {
            I = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.I(this.f238718x, 6);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.K)) {
                I = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyz, I, this.K);
            }
        }
        if (U6(this.f238712r) && U6(this.f238713s) && U6(this.f238722y0) && U6(this.f238714t) && U6(this.f238715u) && !com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577.e(this.Y) && U6(findViewById(com.p314xaae8f345.mm.R.id.ohj)) && U6(this.f238709p0)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_v, (android.view.ViewGroup) this.f238717w, false);
            this.f238717w.addView(viewGroup);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.lut);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568056lj2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.X)) {
                if (this.W == 1) {
                    c19659x677e0913.m75394x3288e7c1(true);
                }
                c19659x677e0913.m75396xca029dad(this.X);
            } else if (this.W == 1) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(c19659x677e0913, this.A);
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(c19659x677e0913, this.A, null);
            }
            textView.setText(I);
        } else {
            this.f238717w.addView((android.view.ViewGroup) getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cdz, (android.view.ViewGroup) this.f238717w, false));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09132 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.lut);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568056lj2);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.hxf);
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568055lj1);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, I));
            c19659x677e09132.setVisibility(0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.X)) {
                if (this.W == 1) {
                    c19659x677e09132.m75394x3288e7c1(true);
                }
                c19659x677e09132.m75396xca029dad(this.X);
            } else if (this.W == 1) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(c19659x677e09132, this.A);
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(c19659x677e09132, this.A, null);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setVisibility(8);
            if (rVar != null) {
                if (rVar.f238519e.f455169n == 1) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView3.setVisibility(0);
                    textView3.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(rVar.f238519e.f455166h / 100.0d));
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView3.setVisibility(8);
                }
            }
        }
        Z6(this.f238717w);
    }

    public final void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r rVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f238519e.f455171p)) {
            this.f238714t.setVisibility(8);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f238519e.f455172q)) {
            this.f238703i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a09));
        } else {
            this.f238703i.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(rVar.f238519e.f455172q, true));
        }
        this.f238703i.setText(rVar.f238519e.f455171p);
        this.f238714t.setVisibility(0);
    }

    public final void Z6(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.k8.b(this, (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcr), findViewById(com.p314xaae8f345.mm.R.id.b2x), findViewById(com.p314xaae8f345.mm.R.id.f564553uh), findViewById(com.p314xaae8f345.mm.R.id.auj), 32, 0.0f, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "finish this %s %s", this, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (this.f238704l1) {
            return;
        }
        super.finish();
        this.f238704l1 = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570923ce0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f238698d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568057lj3);
        this.f238699e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lit);
        this.f238700f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.liu);
        this.f238701g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568054lj0);
        this.f238702h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.liw);
        this.f238703i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.liy);
        this.f238712r = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.liz);
        this.f238713s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.liv);
        this.f238714t = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.lix);
        this.f238705m = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.lio);
        this.f238706n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.liq);
        this.f238707o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lip);
        this.f238708p = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.lim);
        this.f238715u = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.lin);
        this.f238711q = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.lir);
        this.f238716v = findViewById(com.p314xaae8f345.mm.R.id.mza);
        this.f238717w = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.lug);
        this.R = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.dma);
        this.S = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.lis);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kra)).getPaint(), 0.8f);
        this.f238699e.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(this.B));
        this.f238699e.setTextSize(1, 48.0f);
        this.f238700f.setTextSize(1, 48.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f238725z1, 500L);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238721y)) {
            this.f238712r.setVisibility(8);
        } else {
            this.f238701g.setText(this.f238721y);
            this.f238712r.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238724z)) {
            this.f238713s.setVisibility(8);
        } else {
            this.f238702h.setText(this.f238724z);
            this.f238713s.setVisibility(0);
        }
        this.f238711q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u1(this));
        this.Z = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577) findViewById(com.p314xaae8f345.mm.R.id.a_t);
        this.f238709p0 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.d0g);
        this.f238719x0 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.d0e);
        this.f238722y0 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f567745km3);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "onBackPressed()");
        if (this.F == 65 && this.Q != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS");
            this.Q.send(-1, null);
        } else if (this.E == 71) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1().e();
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(1537);
        m83090x14f40144(1680);
        m83090x14f40144(2504);
        m83090x14f40144(4587);
        this.f238720x1.mo48813x58998cd();
        if (fp.h.c(21)) {
            if (fp.h.c(23)) {
                getWindow().setStatusBarColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            } else {
                getWindow().setStatusBarColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
            }
        }
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        mo54448x9c8c0d33(null);
        m78600x5843c740(false);
        m78499x92e71989(false);
        this.f238718x = getIntent().getStringExtra("key_mch_name");
        this.L = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.C17122x2c1fc2f7) getIntent().getParcelableExtra("BusiRemittanceResp");
        this.B = getIntent().getDoubleExtra("key_money", 0.0d);
        this.A = getIntent().getStringExtra("key_rcver_name");
        this.K = getIntent().getStringExtra("key_rcver_true_name");
        this.f238721y = getIntent().getStringExtra("key_rcv_desc");
        this.f238724z = getIntent().getStringExtra("key_pay_desc");
        this.C = getIntent().getStringExtra("key_f2f_id");
        this.D = getIntent().getStringExtra("key_trans_id");
        this.H = getIntent().getStringExtra("key_rcvr_open_id");
        this.I = getIntent().getStringExtra("key_check_sign");
        getIntent().getStringExtra("key_pay_desc");
        getIntent().getStringExtra("key_rcv_desc");
        getIntent().getIntExtra("key_scan_sceen", 0);
        this.E = getIntent().getIntExtra("key_channel", 0);
        this.G = getIntent().getStringExtra("key_succ_page_extend");
        java.lang.String stringExtra = getIntent().getStringExtra("key_succ_fault_config");
        r45.vo voVar = new r45.vo();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra);
            voVar.f469935d = jSONObject.optInt("flag");
            voVar.f469936e = jSONObject.optInt("succpage_first_delay_ms");
            voVar.f469937f = jSONObject.optInt("succpage_max_retry_cnt");
            voVar.f469938g = jSONObject.optInt("succpage_retry_waiting_ms");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBusiF2fPlaceOrder", "createBusiF2FFaultConfigFromJSONObject() Exception: %s", e17.getMessage());
        }
        this.M = voVar;
        this.Q = (android.os.ResultReceiver) getIntent().getParcelableExtra("key_open_result_receiver");
        int intExtra = getIntent().getIntExtra("pay_scene", 0);
        this.F = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "mPayScene:%s", java.lang.Integer.valueOf(intExtra));
        int i17 = this.F;
        r45.yr yrVar = this.V;
        if (i17 == 65) {
            try {
                yrVar.mo11468x92b714fd(getIntent().getByteArrayExtra("AfterPlaceOrderCommReqC2C"));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceBusiResultUI", e18, "parse reqC2C failed", new java.lang.Object[0]);
            }
        } else {
            try {
                this.U.mo11468x92b714fd(getIntent().getByteArrayExtra("AfterPlaceOrderCommReq"));
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceBusiResultUI", e19, "parse req failed", new java.lang.Object[0]);
            }
        }
        this.W = getIntent().getIntExtra("key_succ_show_avatar_type", 0);
        getIntent().getIntExtra("key_succ_show_avatar_show", 0);
        this.X = getIntent().getStringExtra("key_succ_show_avatar_url");
        this.f238710p1 = getIntent().getStringExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
        this.f238697J = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "fetch data");
        if (this.F == 65) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS，do NetSceneC2CSuccPage");
            m83098x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i0(yrVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "fetchData() mBusiF2FFaultConfig.flag:%s mBusiF2FFaultConfig.succpage_first_delay_ms:%s", java.lang.Integer.valueOf(this.M.f469935d), java.lang.Integer.valueOf(this.M.f469936e));
            int i18 = this.M.f469935d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (i18 == 1) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.T, r0.f469936e);
            } else {
                m83098x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r(this.U, this.G, 0, 0, 0L));
            }
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1537);
        m83121xf6ff5b27(1680);
        m83121xf6ff5b27(2504);
        m83121xf6ff5b27(4587);
        this.f238720x1.mo48814x2efc64();
        if (this.Y != null) {
            this.Z.j();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f238725z1);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f238697J) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "do act qry");
            m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.k(this.C, this.D, this.H, (int) java.lang.Math.round(this.B * 100.0d), null, this.I), false);
            this.f238697J = false;
        }
        if (this.Y != null) {
            this.Z.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02be  */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo48630x76e0bfae(int r17, int r18, java.lang.String r19, com.p314xaae8f345.mm.p944x882e457a.m1 r20) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358.mo48630x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setContentViewVisibility */
    public void mo67598xf0aced2e(int i17) {
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
