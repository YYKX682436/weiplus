package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget */
/* loaded from: classes9.dex */
public class C19151x10374577 extends android.widget.FrameLayout {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f262265d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f262266e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f262267f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f262268g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f262269h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f262270i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f262271m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a f262272n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 f262273o;

    /* renamed from: p, reason: collision with root package name */
    public a36.c f262274p;

    /* renamed from: q, reason: collision with root package name */
    public a36.i f262275q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f262276r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f262277s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f262278t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f262279u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f262280v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f262281w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f262282x;

    /* renamed from: y, reason: collision with root package name */
    public a36.a f262283y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f262284z;

    public C19151x10374577(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f262279u = false;
        this.f262280v = false;
        this.f262281w = true;
        this.f262282x = false;
        this.f262283y = null;
        this.f262284z = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.A = false;
        h(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        c19151x10374577.f262277s.m83098x5406100e(new ss4.o(c19151x10374577.f262274p.f82641h.f82629i, c19151x10374577.f262278t));
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "doDrawLottery, is_query_other: %s", java.lang.Integer.valueOf(c19151x10374577.f262274p.f82638e));
        a36.c cVar = c19151x10374577.f262274p;
        if (cVar.f82638e != 0) {
            c19151x10374577.f262277s.m83099x5406100e(new ss4.m(cVar.f82639f, i17, c19151x10374577.f262278t), z17);
        }
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "delayCheckStartMiniApp, isMiniAppReturn: %s", java.lang.Boolean.valueOf(c19151x10374577.A));
        if (c19151x10374577.A) {
            return;
        }
        c19151x10374577.p();
        c19151x10374577.A = true;
    }

    public static boolean e(a36.c cVar) {
        java.util.LinkedList linkedList;
        return cVar != null && (((linkedList = cVar.f82637d) != null && linkedList.size() > 0) || cVar.f82647q != null);
    }

    /* renamed from: getAccImagesPath */
    private java.lang.String m73929xcd058268() {
        return lp0.b.D() + "wallet/images/";
    }

    public final java.lang.String d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(new java.lang.String[0])) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.w6.u(m73929xcd058268());
        java.lang.String str2 = m73929xcd058268() + kk.k.g(str.getBytes());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "buildImagePathByUrl, url: %s, path: %s", str, str2);
        return str2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a c19149x469f632a = this.f262272n;
        if (c19149x469f632a != null && c19149x469f632a.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a c19149x469f632a2 = this.f262272n;
            boolean z17 = false;
            if (c19149x469f632a2 != null) {
                gt4.r1 r1Var = c19149x469f632a2.f262260d;
                if (r1Var != null) {
                    r1Var.a(motionEvent);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a c19149x469f632a3 = this.f262272n;
                gt4.r1 r1Var2 = c19149x469f632a3.f262260d;
                if (!(r1Var2 != null ? r1Var2.A : true)) {
                    z17 = c19149x469f632a3.dispatchTouchEvent(motionEvent);
                }
            }
            android.view.ViewGroup viewGroup = this.f262269h;
            if (viewGroup != null && !z17) {
                return viewGroup.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final java.lang.String f(a36.c cVar) {
        if (cVar != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.LinkedList linkedList = cVar.f82637d;
                if (linkedList != null && linkedList.size() > 0) {
                    java.util.Iterator it = cVar.f82637d.iterator();
                    while (it.hasNext()) {
                        a36.i iVar = (a36.i) it.next();
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("logo", iVar.f82682d);
                        jSONObject2.put("award_name", iVar.f82683e);
                        jSONObject2.put("award_description", iVar.f82684f);
                        jSONObject2.put("background_img", iVar.f82685g);
                        jSONObject2.put("award_name_color", iVar.f82686h);
                        jSONObject2.put("award_description_color", iVar.f82687i);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("single_exposure_info_list", jSONArray);
                jSONObject.put("is_query_others", cVar.f82638e);
                jSONObject.put("draw_lottery_params", cVar.f82639f);
                jSONObject.put("is_show_btn", cVar.f82640g);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                a36.a aVar = cVar.f82641h;
                if (aVar != null) {
                    jSONObject3.put("btn_words", aVar.f82624d);
                    jSONObject3.put("btn_color", cVar.f82641h.f82625e);
                    jSONObject3.put("btn_op_type", cVar.f82641h.f82626f);
                    jSONObject3.put("url", cVar.f82641h.f82627g);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    a36.g gVar = cVar.f82641h.f82628h;
                    if (gVar != null) {
                        jSONObject4.put("activity_tinyapp_username", gVar.f82675d);
                        jSONObject4.put("activity_tinyapp_path", cVar.f82641h.f82628h.f82676e);
                        jSONObject4.put("activity_tinyapp_version", cVar.f82641h.f82628h.f82677f);
                    }
                    jSONObject3.put("mini_app_info", jSONObject4);
                    jSONObject3.put("get_lottery_params", cVar.f82641h.f82629i);
                }
                jSONObject.put("btn_info", jSONObject3);
                jSONObject.put("exposure_info_modify_params", cVar.f82642i);
                jSONObject.put("user_opertaion_type", cVar.f82643m);
                jSONObject.put("is_show_layer", cVar.f82644n);
                jSONObject.put("background_img_whole", cVar.f82646p);
                if (cVar.f82647q != null) {
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("animation_wording", cVar.f82647q.f82632f);
                    jSONObject5.put("animation_wording_color", cVar.f82647q.f82633g);
                    jSONObject5.put("url", cVar.f82647q.f82631e);
                    jSONObject5.put("op_type", cVar.f82647q.f82634h);
                    jSONObject5.put("after_animation_wording", cVar.f82647q.f82635i);
                    jSONObject5.put("after_animation_wording_color", cVar.f82647q.f82636m);
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                    a36.g gVar2 = cVar.f82647q.f82630d;
                    if (gVar2 != null) {
                        jSONObject6.put("activity_tinyapp_username", gVar2.f82675d);
                        jSONObject6.put("activity_tinyapp_path", cVar.f82647q.f82630d.f82676e);
                        jSONObject6.put("activity_tinyapp_version", cVar.f82647q.f82630d.f82677f);
                    }
                    jSONObject5.put("mini_app_info", jSONObject6);
                    jSONObject.put("draw_lottery_info", jSONObject5);
                }
                return jSONObject.toString();
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }

    public void g() {
        if (this.f262277s != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
            this.f262277s.m83090x14f40144(1859);
            this.f262277s.m83090x14f40144(2547);
            this.f262277s.m83090x14f40144(2803);
            this.f262277s.m83090x14f40144(2508);
            this.f262277s.m83090x14f40144(2529);
            this.f262277s.m83090x14f40144(2888);
        }
    }

    public final void h(android.content.Context context) {
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d8e, (android.view.ViewGroup) this, true);
        this.f262269h = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.che);
        this.f262265d = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.ipk);
        this.f262266e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k3s);
        this.f262267f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cut);
        this.f262268g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b2z);
        this.f262272n = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a) findViewById(com.p314xaae8f345.mm.R.id.f568272mb2);
        this.f262270i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aai);
        this.f262273o = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18) findViewById(com.p314xaae8f345.mm.R.id.msb);
        this.f262266e.setTextSize(1, 17.0f);
        this.f262267f.setTextSize(1, 14.0f);
        this.f262268g.setTextSize(1, 16.0f);
        this.f262265d.m75394x3288e7c1(true);
        this.f262265d.m75397xc185581c(true);
    }

    public final void i() {
        a36.a aVar;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "initBaseLotteryView");
        java.util.LinkedList linkedList = this.f262274p.f82637d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = linkedList;
        objArr[1] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfoList %s, size: %s", objArr);
        if (linkedList != null && linkedList.size() > 0) {
            this.f262275q = (a36.i) linkedList.get(0);
            a36.i iVar = this.f262275q;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfo %s, award_name: %s, award_description: %s, logo: %s", 0, iVar.f82683e, iVar.f82684f, iVar.f82682d);
            this.f262265d.m75396xca029dad(this.f262275q.f82682d);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82682d)) {
                this.f262265d.setVisibility(0);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82683e)) {
                z17 = false;
            } else {
                this.f262266e.setText(this.f262275q.f82683e);
                this.f262266e.setVisibility(0);
                try {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82686h)) {
                        this.f262266e.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(this.f262275q.f82686h, true));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSuccPageAwardWidget", e17, "parse award_name_color error: %s", e17.getMessage());
                }
                z17 = true;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82684f)) {
                this.f262267f.setText(this.f262275q.f82684f);
                this.f262267f.setVisibility(0);
                try {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82687i)) {
                        this.f262267f.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(this.f262275q.f82687i, true));
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSuccPageAwardWidget", e18, "parse award_description_color error: %s", e18.getMessage());
                }
                z17 = true;
            }
            if (z17) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f262266e.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f262267f.getLayoutParams();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82683e) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82684f)) {
                    layoutParams.addRule(15, -1);
                    layoutParams2.addRule(15, 0);
                    this.f262266e.setLayoutParams(layoutParams);
                    this.f262267f.setLayoutParams(layoutParams2);
                    this.f262266e.setVisibility(0);
                    this.f262267f.setVisibility(8);
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82683e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82684f)) {
                    layoutParams.addRule(15, 0);
                    layoutParams2.addRule(15, 0);
                    this.f262266e.setLayoutParams(layoutParams);
                    this.f262267f.setLayoutParams(layoutParams2);
                    this.f262266e.setVisibility(0);
                    this.f262267f.setVisibility(0);
                } else {
                    layoutParams.addRule(15, 0);
                    layoutParams2.addRule(15, -1);
                    this.f262266e.setLayoutParams(layoutParams);
                    this.f262267f.setLayoutParams(layoutParams2);
                    this.f262266e.setVisibility(8);
                    this.f262267f.setVisibility(0);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262275q.f82685g)) {
                this.f262270i.setVisibility(8);
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kks);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.kkt);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "background_img: %s", this.f262275q.f82685g);
                o11.f fVar = new o11.f();
                fVar.f423611b = true;
                fVar.f423612c = true;
                fVar.f423615f = d(this.f262275q.f82685g);
                n11.a.b().j(this.f262275q.f82685g, null, fVar.a(), new gt4.e2(this));
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = java.lang.Integer.valueOf(this.f262274p.f82640g);
        a36.a aVar2 = this.f262274p.f82641h;
        objArr2[1] = aVar2;
        objArr2[2] = aVar2 != null ? aVar2.f82624d : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "is_show_btn: %s, btn_info: %s, btn_words: %s", objArr2);
        a36.c cVar = this.f262274p;
        if (cVar.f82640g == 0 || (aVar = cVar.f82641h) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f82624d)) {
            this.f262268g.setVisibility(8);
        } else {
            a36.a aVar3 = this.f262274p.f82641h;
            if (aVar3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "btn_words: %s, type: %s, color: %s, url: %s", aVar3.f82624d, java.lang.Integer.valueOf(aVar3.f82626f), aVar3.f82625e, aVar3.f82627g);
                this.f262268g.setText(aVar3.f82624d);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar3.f82625e)) {
                    android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk);
                    drawable.setColorFilter(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(aVar3.f82625e, false), android.graphics.PorterDuff.Mode.SRC);
                    this.f262268g.setBackground(drawable);
                }
                this.f262268g.setOnClickListener(new gt4.h2(this));
                this.f262268g.setVisibility(0);
                if (this.f262281w || this.f262279u) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[0] = 1;
                    objArr3[1] = java.lang.Integer.valueOf(this.f262279u ? 2 : 1);
                    g0Var.d(15225, objArr3);
                }
            }
        }
        if (this.f262266e.getVisibility() == 0) {
            this.f262266e.setSingleLine();
            this.f262266e.post(new gt4.i2(this));
        }
        if (this.f262268g.getVisibility() != 0) {
            this.f262266e.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        int i17 = this.f262274p.f82644n;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "exposureInfo.is_show_layer is true: %s, direct show layer", java.lang.Integer.valueOf(i17));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262274p.f82646p)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "background_img_whole: %s", this.f262274p.f82646p);
        android.widget.ImageView imageView = this.f262271m;
        if (imageView != null) {
            imageView.setVisibility(0);
            o11.f fVar2 = new o11.f();
            fVar2.f423611b = true;
            fVar2.f423612c = true;
            fVar2.f423615f = d(this.f262274p.f82646p);
            n11.a.b().j(this.f262274p.f82646p, null, fVar2.a(), new gt4.k2(this));
        }
    }

    public void j() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f262277s;
        if (abstractActivityC22902xe37969e != null) {
            abstractActivityC22902xe37969e.m83121xf6ff5b27(1859);
            this.f262277s.m83121xf6ff5b27(2547);
            this.f262277s.m83121xf6ff5b27(2803);
            this.f262277s.m83121xf6ff5b27(2508);
            this.f262277s.m83121xf6ff5b27(2529);
            this.f262277s.m83121xf6ff5b27(2888);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onDestroy, isShakeOrScratch: %s, isClickAwardButton: %s", java.lang.Boolean.valueOf(this.f262280v), java.lang.Boolean.valueOf(this.f262282x));
            if (!this.f262280v && !this.f262282x) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = 6;
                objArr[1] = java.lang.Integer.valueOf(this.f262279u ? 2 : 1);
                g0Var.d(15225, objArr);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "user do nothing and quit ui, call drawlottery");
                this.f262277s.m83099x5406100e(new ss4.m(this.f262274p.f82639f, 4, this.f262278t), false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19149x469f632a c19149x469f632a = this.f262272n;
        if (c19149x469f632a != null) {
            c19149x469f632a.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 c19146xd2600a18 = this.f262273o;
        if (c19146xd2600a18 != null) {
            c19146xd2600a18.a();
        }
    }

    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onResume, isClickH5OrTinyApp: %s, exposureInfo: %s, isMiniAppReturn: %s", java.lang.Boolean.valueOf(this.f262279u), f(this.f262274p), java.lang.Boolean.valueOf(this.A));
        if (this.A) {
            return;
        }
        this.A = true;
        p();
    }

    public boolean l(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        a36.g gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        java.lang.String str2 = "";
        if (m1Var instanceof ss4.o) {
            ss4.o oVar = (ss4.o) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.di3 di3Var = oVar.f493645d;
                if (di3Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, response is null!!");
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "getLottery ret_code: %s, ret_msg: %s, alert_wording: %s, exposure_info: %s", java.lang.Integer.valueOf(di3Var.f454037d), di3Var.f454038e, di3Var.f454040g, di3Var.f454039f);
                if (di3Var.f454037d != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "getLotteryFailed");
                    o();
                } else {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(di3Var.f454040g)) {
                        dp.a.m125854x26a183b(getContext(), di3Var.f454040g, 1).show();
                        return true;
                    }
                    a36.c cVar = di3Var.f454039f;
                    if (cVar != null) {
                        a36.a aVar = this.f262274p.f82641h;
                        int i19 = aVar != null ? aVar.f82626f : 0;
                        this.f262274p = cVar;
                        a36.a aVar2 = cVar.f82641h;
                        if (aVar2 != null && aVar2 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, btn_op_type: %s", java.lang.Integer.valueOf(aVar2.f82626f));
                            if (di3Var.f454039f.f82641h.f82626f == 4) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                                this.f262274p.f82641h.f82626f = i19;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo");
                        m();
                    }
                    a36.a aVar3 = this.f262283y;
                    if (aVar3 != null && this.f262282x) {
                        int i27 = aVar3.f82626f;
                        if (i27 == 8) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_URL, goto h5");
                            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f262277s, this.f262283y.f82627g, false);
                            this.f262279u = true;
                        } else if (i27 == 9 && (gVar = aVar3.f82628h) != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_MINI_APP, jump tiny app, userName: %s, path: %s, version: %s", gVar.f82675d, gVar.f82676e, java.lang.Integer.valueOf(gVar.f82677f));
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                            java.lang.String str3 = gVar.f82675d;
                            am.nx nxVar = c6113xa3727625.f136390g;
                            nxVar.f88999a = str3;
                            java.lang.String str4 = gVar.f82676e;
                            java.lang.String str5 = str2;
                            if (str4 != null) {
                                str5 = str4;
                            }
                            nxVar.f89000b = str5;
                            nxVar.f89002d = ad1.d.f23x366c91de;
                            nxVar.f89003e = this.f262276r;
                            nxVar.f89001c = 0;
                            int i28 = gVar.f82677f;
                            if (i28 > 0) {
                                nxVar.f89007i = i28;
                            }
                            nxVar.f89004f = this.f262277s;
                            c6113xa3727625.e();
                            this.f262279u = true;
                            this.A = false;
                            this.f262284z.mo50297x7c4d7ca2(new gt4.w1(this), 3000L);
                        }
                    }
                    this.f262283y = null;
                }
            } else {
                o();
            }
            return true;
        }
        if (m1Var instanceof ss4.p) {
            ss4.p pVar = (ss4.p) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.fm0 fm0Var = pVar.f493653d;
                if (fm0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure end, response is null!!");
                    return true;
                }
                java.lang.Object[] objArr = new java.lang.Object[6];
                objArr[0] = java.lang.Integer.valueOf(fm0Var.f455969d);
                objArr[1] = fm0Var.f455970e;
                java.util.LinkedList linkedList2 = fm0Var.f455971f;
                objArr[2] = linkedList2;
                objArr[3] = java.lang.Integer.valueOf(fm0Var.f455972g);
                a36.a aVar4 = fm0Var.f455973h;
                objArr[4] = aVar4;
                objArr[5] = java.lang.Integer.valueOf(aVar4 != null ? aVar4.f82626f : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure, ret_code: %s, ret_msg: %s, single_exposure_info_list: %s, is_show_btn: %s, btn_info: %s, btn_op_type: %s", objArr);
                if (fm0Var.f455969d == 0) {
                    a36.c cVar2 = this.f262274p;
                    cVar2.f82637d = linkedList2;
                    cVar2.f82640g = fm0Var.f455972g;
                    a36.a aVar5 = cVar2.f82641h;
                    int i29 = aVar5 != null ? aVar5.f82626f : 0;
                    a36.a aVar6 = fm0Var.f455973h;
                    if (aVar6 != null) {
                        cVar2.f82641h = aVar6;
                        if (aVar6 != null && aVar6.f82626f == 4) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                            this.f262274p.f82641h.f82626f = i29;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "after modify, exposureInfo: %s", f(this.f262274p));
                    i();
                }
            }
            this.f262279u = false;
            return true;
        }
        if (!(m1Var instanceof ss4.m)) {
            return false;
        }
        ss4.m mVar = (ss4.m) m1Var;
        if (i17 == 0 && i18 == 0) {
            r45.yf0 yf0Var = mVar.f493625d;
            if (yf0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, response is null!!");
                return true;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = java.lang.Integer.valueOf(yf0Var.f472564d);
            objArr2[1] = yf0Var.f472565e;
            a36.c cVar3 = yf0Var.f472566f;
            objArr2[2] = cVar3;
            java.lang.Object obj = str2;
            if (cVar3 != null) {
                obj = cVar3.f82637d;
            }
            objArr2[3] = obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, retcode: %s, retmsg: %s, exposure_info: %s, single_exposure_info_list: %s", objArr2);
            a36.c cVar4 = yf0Var.f472566f;
            if (cVar4 == null || (linkedList = cVar4.f82637d) == null || linkedList.size() <= 0) {
                o();
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[3];
                a36.c cVar5 = yf0Var.f472566f;
                objArr3[0] = cVar5;
                a36.a aVar7 = cVar5.f82641h;
                objArr3[1] = aVar7;
                objArr3[2] = java.lang.Integer.valueOf(aVar7 != null ? aVar7.f82626f : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, exposureInfo: %s, btninfo: %s, btn_op_type: %s", objArr3);
                a36.a aVar8 = this.f262274p.f82641h;
                int i37 = aVar8 != null ? aVar8.f82626f : 0;
                a36.c cVar6 = yf0Var.f472566f;
                this.f262274p = cVar6;
                a36.a aVar9 = cVar6.f82641h;
                if (aVar9 != null && aVar9 != null && aVar9.f82626f == 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                    this.f262274p.f82641h.f82626f = i37;
                }
                m();
            }
        } else {
            o();
        }
        return true;
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo: %s, isFirstShow: %s", f(this.f262274p), java.lang.Boolean.valueOf(this.f262281w));
        a36.c cVar = this.f262274p;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo is null!");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, user_operation_type: %s, single_exposure_info_list size: %s, isClickH5OrTinyApp: %s", java.lang.Integer.valueOf(cVar.f82643m), java.lang.Integer.valueOf(this.f262274p.f82637d.size()), java.lang.Boolean.valueOf(this.f262279u));
        a36.c cVar2 = this.f262274p;
        int i17 = cVar2.f82643m;
        if (i17 < 1 || i17 > 5 || !e(cVar2)) {
            return;
        }
        int i18 = this.f262274p.f82643m;
        if (i18 == 4) {
            i();
            if (this.f262272n.getVisibility() != 8) {
                this.f262272n.setVisibility(8);
                this.f262272n.a();
            }
            if (this.f262273o.getVisibility() != 8) {
                this.f262273o.setVisibility(8);
                this.f262273o.a();
            }
        } else if (i18 == 1 || i18 == 2 || i18 == 3) {
            i();
            if (this.f262273o.getVisibility() != 8) {
                this.f262273o.setVisibility(8);
                this.f262273o.a();
            }
            if (this.f262272n.getVisibility() != 0) {
                this.f262272n.setVisibility(0);
                this.f262272n.post(new gt4.x1(this));
            }
        } else if (i18 == 5) {
            i();
            if (this.f262272n.getVisibility() != 8) {
                this.f262272n.setVisibility(8);
                this.f262272n.a();
            }
            a36.b bVar = this.f262274p.f82647q;
            if (bVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, op_type: %s", java.lang.Integer.valueOf(bVar.f82634h));
                a36.b bVar2 = this.f262274p.f82647q;
                int i19 = bVar2.f82634h;
                if (i19 != 1) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f262284z;
                    if (i19 == 2) {
                        a36.g gVar = bVar2.f82630d;
                        if (gVar != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, jump tiny app, userName: %s, path: %s, version: %s", gVar.f82675d, gVar.f82676e, java.lang.Integer.valueOf(gVar.f82677f));
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                            java.lang.String str = gVar.f82675d;
                            am.nx nxVar = c6113xa3727625.f136390g;
                            nxVar.f88999a = str;
                            java.lang.String str2 = gVar.f82676e;
                            if (str2 == null) {
                                str2 = "";
                            }
                            nxVar.f89000b = str2;
                            nxVar.f89002d = ad1.d.f23x366c91de;
                            nxVar.f89003e = this.f262276r;
                            nxVar.f89001c = 0;
                            int i27 = gVar.f82677f;
                            if (i27 > 0) {
                                nxVar.f89007i = i27;
                            }
                            nxVar.f89004f = this.f262277s;
                            c6113xa3727625.e();
                            this.f262279u = true;
                            this.A = false;
                            n3Var.mo50297x7c4d7ca2(new gt4.a2(this), 3000L);
                        }
                    } else if (i19 == 3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, goto h5, url: %s", bVar2.f82631e);
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f262277s, this.f262274p.f82647q.f82631e, false);
                        this.f262279u = true;
                        this.A = false;
                        n3Var.mo50297x7c4d7ca2(new gt4.b2(this), 3000L);
                    } else if (i19 != 4) {
                        this.f262273o.setVisibility(8);
                        this.f262273o.a();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, directly show info");
                        this.f262272n.setVisibility(8);
                        this.f262272n.a();
                        this.f262273o.setVisibility(8);
                        this.f262273o.a();
                    }
                } else {
                    if (this.f262273o.getVisibility() != 0) {
                        this.f262273o.setVisibility(0);
                        this.f262273o.post(new gt4.y1(this));
                    }
                    this.f262273o.a();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262274p.f82647q.f82632f)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording: %s", this.f262274p.f82647q.f82632f);
                        this.f262273o.m73921x86175ad(this.f262274p.f82647q.f82632f);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262274p.f82647q.f82633g)) {
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording_color: %s", this.f262274p.f82647q.f82633g);
                            this.f262273o.m73922xde5a4db6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(this.f262274p.f82647q.f82633g, true));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSuccPageAwardWidget", e17, "parse animation_wording_color %s error %s", this.f262274p.f82647q.f82633g, e17.getMessage());
                        }
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262274p.f82647q.f82635i)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording: %s", this.f262274p.f82647q.f82635i);
                        this.f262273o.m73919x8d23d17(this.f262274p.f82647q.f82635i);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262274p.f82647q.f82636m)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording_color: %s", this.f262274p.f82647q.f82636m);
                        try {
                            this.f262273o.m73920xed2f988c(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(this.f262274p.f82647q.f82636m, true));
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSuccPageAwardWidget", e18, "parse after_animation_wording_color %s error %s", this.f262274p.f82647q.f82636m, e18.getMessage());
                        }
                    }
                    this.f262273o.m73923x6af7f466(new gt4.z1(this));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 c19146xd2600a18 = this.f262273o;
                    c19146xd2600a18.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletAwardShakeAnimView", "startShake");
                    q35.d dVar = new q35.d(c19146xd2600a18.getContext());
                    c19146xd2600a18.f262237f = dVar;
                    dVar.a(new gt4.u(c19146xd2600a18));
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    c19146xd2600a18.f262238g = android.os.SystemClock.elapsedRealtime();
                    c19146xd2600a18.setOnClickListener(new gt4.v(c19146xd2600a18));
                    java.lang.Runnable runnable = c19146xd2600a18.f262247s;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 3000L);
                }
            } else {
                this.f262273o.setVisibility(8);
                this.f262273o.a();
            }
        }
        if (this.f262281w || this.f262279u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 3;
            objArr[1] = java.lang.Integer.valueOf(this.f262279u ? 2 : 1);
            g0Var.d(15225, objArr);
        }
        this.f262281w = false;
    }

    public void n(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, a36.c cVar, java.lang.String str, boolean z17, android.widget.ImageView imageView) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = f(cVar);
        objArr[1] = java.lang.Boolean.valueOf(cVar == null || cVar.f82645o == null);
        objArr[2] = java.lang.Boolean.valueOf(imageView == null);
        objArr[3] = java.lang.Boolean.valueOf(this.f262279u);
        objArr[4] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "setWidgetData, exposureInfo: %s, layerInfo==null: %s, hostUIBackgroundView==null:%s, isClickH5OrTinyApp: %s, isF2F: %s", objArr);
        this.f262277s = abstractActivityC22902xe37969e;
        this.f262274p = cVar;
        this.f262278t = z17;
        this.f262276r = str;
        this.f262271m = imageView;
        m();
    }

    public final void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "showNetFailedView");
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f262266e.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f262267f.getLayoutParams();
        layoutParams.addRule(15, -1);
        layoutParams2.addRule(15, 0);
        this.f262266e.setLayoutParams(layoutParams);
        this.f262267f.setLayoutParams(layoutParams2);
        this.f262266e.setVisibility(0);
        this.f262267f.setVisibility(8);
        this.f262266e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kzx);
        this.f262266e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f262267f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        this.f262270i.setVisibility(8);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kks);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.kkt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f262268g.setVisibility(8);
        this.f262265d.setVisibility(0);
        this.f262265d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chx);
        this.f262272n.setVisibility(8);
        this.f262272n.a();
        this.f262273o.setVisibility(8);
        this.f262273o.a();
    }

    public final void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "updateViewAfterMiniAppReturn");
        a36.b bVar = this.f262274p.f82647q;
        if (bVar != null && bVar.f82634h != 1) {
            this.f262272n.setVisibility(8);
            this.f262272n.a();
            this.f262273o.setVisibility(8);
            this.f262273o.a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "tryDoModifyExposure, isClickH5OrTinyApp: %s", java.lang.Boolean.valueOf(this.f262279u));
        if (this.f262279u) {
            this.f262277s.m83099x5406100e(new ss4.p(this.f262274p.f82642i, this.f262278t), false);
        }
    }

    public C19151x10374577(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f262279u = false;
        this.f262280v = false;
        this.f262281w = true;
        this.f262282x = false;
        this.f262283y = null;
        this.f262284z = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.A = false;
        h(context);
    }
}
