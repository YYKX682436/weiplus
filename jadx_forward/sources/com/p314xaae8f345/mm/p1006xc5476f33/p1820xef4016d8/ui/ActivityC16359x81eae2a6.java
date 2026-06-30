package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI */
/* loaded from: classes9.dex */
public class ActivityC16359x81eae2a6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {
    public static final /* synthetic */ int P = 0;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ap f227520J;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f227521g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f227522h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f227523i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f227524m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f227525n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f227526o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a f227527p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f227528q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f227529r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f227530s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f227531t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f227532u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f227533v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f227534w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f227535x;

    /* renamed from: y, reason: collision with root package name */
    public int f227536y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f227537z = true;
    public boolean A = false;
    public int G = 0;
    public final java.util.List H = new java.util.LinkedList();
    public final java.util.Map I = new java.util.HashMap();
    public java.lang.String K = "";
    public boolean L = false;
    public boolean M = false;
    public final android.widget.AbsListView.OnScrollListener N = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.w(this);

    /* renamed from: fixBackgroundRepeat */
    public static void m66170x92715a9e(android.view.View view) {
        android.graphics.drawable.Drawable background;
        if (view == null || (background = view.getBackground()) == null || !(background instanceof android.graphics.drawable.BitmapDrawable)) {
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) background;
        bitmapDrawable.mutate();
        bitmapDrawable.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
    }

    public final void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a c16407x72652a1a = this.f227527p;
        if (c16407x72652a1a == null || c16407x72652a1a.getVisibility() == 8) {
            return;
        }
        this.f227527p.setVisibility(8);
    }

    public final void W6() {
        this.A = true;
        if (this.f227536y > 0) {
            java.util.List list = this.H;
            if (((java.util.LinkedList) list).size() > 0) {
                if (((java.util.LinkedList) list).get(((java.util.LinkedList) list).size() - 1) != null) {
                    m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(this.C, 11, this.f227536y, this.E, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) ((java.util.LinkedList) list).get(((java.util.LinkedList) list).size() - 1)).f226848g, 0L), "v1.0", this.K));
                    return;
                }
            }
        }
        this.K = "";
        m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(this.C, 11, this.f227536y, this.E, "v1.0", "", ""));
    }

    public final void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var) {
        int i17;
        java.lang.String str;
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0 h0Var;
        if (e1Var == null) {
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.v() && (h0Var = e1Var.C) != null && h0Var.f226837d != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "is not atomic luckymoney, go to LuckyMoneyDetailUI");
            gb3.l.b(this.C, e1Var);
            android.content.Intent intent = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Zi() ? new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.class) : new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d.class);
            intent.putExtras(getIntent());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.M = true;
            finish();
            return;
        }
        getWindow().setStatusBarColor(-1186093);
        this.M = false;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1);
        loadAnimation.setDuration(250L);
        m78513xc2a54588().startAnimation(loadAnimation);
        mo67598xf0aced2e(0);
        this.f227537z = e1Var.f226786y == 1;
        if (this.f227536y == 0) {
            java.lang.String str2 = e1Var.f226783v;
            this.D = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ap apVar = this.f227520J;
            apVar.f228258e = str2;
            apVar.f228263m = e1Var.f226766J;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            if (e1Var.f226766J == 2) {
                this.f227522h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c9b);
                if (e1Var.K != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "busi logo load from file:" + e1Var.K);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5602xa4b30420 c5602xa4b30420 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5602xa4b30420();
                    c5602xa4b30420.f135927g.getClass();
                    c5602xa4b30420.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s(this, c5602xa4b30420, e1Var);
                    c5602xa4b30420.b(android.os.Looper.myLooper());
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f226773m)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(this.f227522h, e1Var.f226773m, e1Var.Q);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(this.f227522h, e1Var.f226773m, e1Var.Q);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179, this.f227523i, e1Var.f226772i);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179, this.f227524m, e1Var.f226771h);
            if (e1Var.A != 2 || this.B == 3) {
                android.view.View view2 = this.f227525n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f227526o.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(e1Var.f226778q / 100.0d));
                if (e1Var.f226784w != 1) {
                    this.f227520J.f228259f = true;
                } else {
                    this.f227520J.f228259f = false;
                }
                android.view.View view3 = this.f227525n;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.E)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyBusiDetailUI", "detail.changeWording is empty");
                android.view.View view4 = this.f227528q;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view5 = this.f227528q;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f227529r.setText(e1Var.E);
                if (e1Var.D == 1) {
                    if (android.text.TextUtils.isEmpty(e1Var.N) || e1Var.N.startsWith("weixin://wxpay")) {
                        this.f227530s.setVisibility(8);
                    } else {
                        this.f227530s.setVisibility(0);
                    }
                    this.f227529r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t(this, e1Var, mo55332x76847179));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyBusiDetailUI", "detail.jumpChange is false");
                    this.f227529r.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560900xm));
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f226787z)) {
                this.f227532u.setText((java.lang.CharSequence) null);
            } else {
                this.f227532u.setText(e1Var.f226787z);
            }
            java.util.LinkedList linkedList = e1Var.F;
            if (linkedList != null && linkedList.size() > 0) {
                android.view.View findViewById = this.f227535x.findViewById(com.p314xaae8f345.mm.R.id.b2k);
                android.view.View findViewById2 = this.f227535x.findViewById(com.p314xaae8f345.mm.R.id.b2l);
                android.view.View findViewById3 = this.f227535x.findViewById(com.p314xaae8f345.mm.R.id.b2m);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f227535x.findViewById(com.p314xaae8f345.mm.R.id.b2h);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f227535x.findViewById(com.p314xaae8f345.mm.R.id.b2i);
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.f227535x.findViewById(com.p314xaae8f345.mm.R.id.b2j);
                android.view.View findViewById4 = this.f227535x.findViewById(com.p314xaae8f345.mm.R.id.b2c);
                android.view.View findViewById5 = this.f227535x.findViewById(com.p314xaae8f345.mm.R.id.b2d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok();
                okVar3.f228816a = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560880x2);
                okVar3.f228818c = true;
                okVar3.f228820e = e1Var.K;
                okVar3.f228819d = this.G;
                if (linkedList.size() > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rk.a(this, viewGroup, (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6) linkedList.get(0), okVar3);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    okVar = okVar3;
                    view = findViewById3;
                    yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    okVar = okVar3;
                    view = findViewById3;
                }
                if (linkedList.size() > 1) {
                    okVar2 = okVar;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rk.a(this, viewGroup2, (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6) linkedList.get(1), okVar2);
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    okVar2 = okVar;
                }
                if (linkedList.size() > 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rk.a(this, viewGroup3, (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6) linkedList.get(2), okVar2);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    android.view.View view6 = view;
                    yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById.getVisibility() == 0 && (findViewById2.getVisibility() == 0 || view.getVisibility() == 0)) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(0);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(findViewById4, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById2.getVisibility() == 0 && view.getVisibility() == 0) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(0);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(findViewById5, arrayList10.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById.getVisibility() == 0 || findViewById2.getVisibility() == 0 || view.getVisibility() == 0) {
                    this.f227533v.requestLayout();
                    android.view.View view7 = this.f227533v;
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(0);
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(view7, arrayList11.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) this.f227531t.findViewById(com.p314xaae8f345.mm.R.id.b2e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok();
            okVar4.f228816a = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560880x2);
            okVar4.f228817b = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rk.a(this, viewGroup4, e1Var.G, okVar4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(e1Var.f226766J == 2 ? 13 : 7), 0, 0, 0, 1);
        }
        int i18 = e1Var.f226768e;
        boolean z17 = (i18 == 3 || i18 == 2) && e1Var.f226785x == 1 && !this.f227537z && e1Var.B == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0 h0Var2 = e1Var.C;
        boolean z18 = (h0Var2 == null || h0Var2.f226837d != 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h0Var2.f226838e)) ? false : true;
        android.widget.TextView textView = (android.widget.TextView) this.f227531t.findViewById(com.p314xaae8f345.mm.R.id.b2r);
        if (z17 || z18) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.u(this, e1Var));
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0 h0Var3 = e1Var.C;
                this.F = h0Var3.f226838e;
                textView.setText(h0Var3.f226839f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(e1Var.f226766J == 2 ? 13 : 7), 0, 0, 0, 2);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) this.f227531t.findViewById(com.p314xaae8f345.mm.R.id.b2o);
        int i19 = this.B;
        if (i19 == 1 || i19 == 3 || textView.getVisibility() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.v(this, e1Var));
            textView2.setVisibility(0);
        }
        if (!this.L) {
            this.f227521g.addFooterView(this.f227531t);
            this.L = true;
        }
        java.util.LinkedList linkedList2 = e1Var.M;
        if (linkedList2 != null) {
            int i27 = 0;
            while (true) {
                int size = linkedList2.size();
                list = this.H;
                if (i27 >= size) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) linkedList2.get(i27);
                java.util.HashMap hashMap = (java.util.HashMap) this.I;
                if (!hashMap.containsKey(h5Var.f226850i)) {
                    ((java.util.LinkedList) list).add((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) linkedList2.get(i27));
                    hashMap.put(h5Var.f226850i, 1);
                }
                i27++;
            }
            this.f227536y += linkedList2.size();
            this.A = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ap apVar2 = this.f227520J;
            if (list == null) {
                apVar2.getClass();
                new java.util.LinkedList();
            } else {
                apVar2.f228257d = list;
            }
            apVar2.notifyDataSetChanged();
        }
        java.lang.String str3 = e1Var.I;
        java.lang.String str4 = e1Var.P;
        this.f227534w.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c9a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "renderAdImage: no adImage");
            this.f227534w.setVisibility(8);
            i17 = 0;
        } else {
            new android.util.DisplayMetrics();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics() != null) {
                android.view.ViewGroup.LayoutParams layoutParams = this.f227534w.getLayoutParams();
                layoutParams.height = (int) (((r2.widthPixels - (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a4k) * 2)) - (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a4j) * 2)) * 0.75f);
                this.f227534w.setLayoutParams(layoutParams);
            }
            i17 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.u(this.f227534w, str3, str4, false);
            this.f227534w.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[i17] = java.lang.Integer.valueOf(this.G);
        objArr[1] = 1;
        objArr[2] = e1Var.I;
        java.util.LinkedList linkedList3 = e1Var.F;
        if (linkedList3 == null || linkedList3.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyUtil", "splitOperationField is empty!");
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            for (int i28 = i17; i28 < linkedList3.size(); i28++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6) linkedList3.get(i28);
                if (o6Var != null) {
                    if (i28 != 0) {
                        sb6.append("|");
                    }
                    sb6.append(o6Var.f227052f);
                    sb6.append("|");
                    sb6.append(o6Var.f227051e);
                }
            }
            str = sb6.toString();
        }
        objArr[3] = str;
        objArr[4] = "";
        objArr[5] = "";
        objArr[6] = "";
        objArr[7] = "";
        objArr[8] = e1Var.f226772i;
        objArr[9] = java.lang.Integer.valueOf(e1Var.K);
        g0Var.d(13051, objArr);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.f227527p.getVisibility() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f227527p.setVisibility(8);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (this.M) {
            super.finish();
            return;
        }
        if (!getIntent().hasExtra("key_realname_guide_helper")) {
            super.finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1) getIntent().getParcelableExtra("key_realname_guide_helper");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
        bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiDetailUI");
        boolean a17 = c19088xa4b300c1.a(this, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.r(this), null);
        getIntent().removeExtra("key_realname_guide_helper");
        if (a17) {
            return;
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570772bu2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                java.lang.String str = this.F;
                if (str == null || !str.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao")) {
                    m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n6(stringExtra.replaceAll(",", "|"), this.C, 1, "v1.0"));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiDetailUI", "Not expected branch since 2015 fesitval");
                }
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a c16407x72652a1a = this.f227527p;
        if (c16407x72652a1a == null || c16407x72652a1a.f228216r == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "commentfooter release");
        c16407x72652a1a.f228216r.l();
        c16407x72652a1a.f228216r.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5) {
            if (i17 != 0 || i18 != 0) {
                db5.e1.T(this, str);
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5) m1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = v5Var.f227198h;
            this.K = v5Var.f227199i;
            X6(e1Var);
            return true;
        }
        int i19 = 0;
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e6)) {
            if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n6)) {
                return false;
            }
            if (i17 == 0 && i18 == 0) {
                db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
                return true;
            }
            db5.e1.T(this, str);
            return true;
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.T(this, str);
            return true;
        }
        db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
        this.f227520J.f228259f = false;
        V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e6 e6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e6) m1Var;
        java.util.List list = this.H;
        if (list != null) {
            while (true) {
                if (i19 >= ((java.util.LinkedList) list).size()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) ((java.util.LinkedList) list).get(i19);
                if (h5Var.f226850i.equalsIgnoreCase(e6Var.f226796h)) {
                    h5Var.f226849h = e6Var.f226797i;
                    this.f227520J.notifyDataSetChanged();
                    break;
                }
                i19++;
            }
        }
        return true;
    }
}
