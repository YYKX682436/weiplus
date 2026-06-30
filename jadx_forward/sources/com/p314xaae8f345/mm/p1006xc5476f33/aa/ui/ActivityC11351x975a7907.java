package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAAUI */
/* loaded from: classes9.dex */
public class ActivityC11351x975a7907 extends com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public static final /* synthetic */ int S1 = 0;
    public android.widget.ImageView A;
    public android.app.Dialog A1;
    public android.widget.TextView B;
    public android.view.ViewGroup C;
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 D;
    public android.widget.TextView E;
    public y63.a E1;
    public android.view.ViewGroup F;
    public android.view.ViewGroup G;
    public android.view.ViewGroup I;
    public android.view.ViewGroup I1;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f154035J;
    public android.widget.TextView J1;
    public android.view.ViewGroup K;
    public android.view.ViewGroup L;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 L1;
    public android.view.ViewGroup M;
    public android.widget.TextView N;
    public android.widget.ScrollView O1;
    public android.widget.TextView P;
    public android.view.View P1;
    public android.view.ViewGroup Q;
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d Q1;
    public android.widget.Button T;
    public android.app.Dialog U;
    public android.widget.TextView V;
    public java.lang.String Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f154039l1;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f154043p;

    /* renamed from: p0, reason: collision with root package name */
    public long f154044p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f154046q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f154047r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f154048s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f154049t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f154050u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f154051v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.RelativeLayout f154052w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f154053x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f154054x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f154055x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f154056y;

    /* renamed from: y0, reason: collision with root package name */
    public int f154057y0;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f154059z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f154060z1;

    /* renamed from: g, reason: collision with root package name */
    public final k61.m f154036g = (k61.m) this.f154007e.a(this, k61.m.class);

    /* renamed from: h, reason: collision with root package name */
    public int f154037h = 2;

    /* renamed from: i, reason: collision with root package name */
    public int f154038i = 4;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154040m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f154041n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f154042o = false;
    public java.util.List H = new java.util.ArrayList();
    public final java.util.Map R = new java.util.HashMap();
    public final java.util.Map S = new java.util.HashMap();
    public h61.i W = new h61.i();
    public boolean X = false;
    public long Y = 0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f154045p1 = "";

    /* renamed from: y1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11336x34865b36 f154058y1 = null;
    public boolean B1 = false;
    public android.app.Dialog C1 = null;
    public int D1 = 0;
    public final java.util.ArrayList F1 = new java.util.ArrayList();
    public final java.util.ArrayList G1 = new java.util.ArrayList();
    public java.util.List H1 = new java.util.ArrayList();
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d K1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5671x289e9b27>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.aa.ui.LaunchAAUI.1
        {
            this.f39173x3fe91575 = 1137642263;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5671x289e9b27 c5671x289e9b27) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5671x289e9b27 c5671x289e9b272 = c5671x289e9b27;
            if (c5671x289e9b272 != null) {
                am.mi miVar = c5671x289e9b272.f135996g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "launchAAEventIListener %s", miVar.f88883c);
                android.content.Context context = miVar.f88881a;
                java.lang.String str = miVar.f88883c;
                java.util.ArrayList arrayList = miVar.f88882b;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.S1;
                com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.this.u7(context, str, true, arrayList);
            }
            return true;
        }
    };
    public int M1 = 0;
    public int N1 = 0;
    public final android.view.View.OnClickListener R1 = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n5(this);

    public static void g7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        jz5.f0 f0Var;
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11351x975a7907.W.f360685f);
        boolean z18 = activityC11351x975a7907.W.f360684e && !activityC11351x975a7907.k7() && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(activityC11351x975a7907.f154040m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "initImportEntrance，isShowTransactionsEntrance :%s, isShowSolitaireEntrance: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC11351x975a7907.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11352x53f4a81c c11352x53f4a81c = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11352x53f4a81c) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11352x53f4a81c.class);
        java.lang.String str = activityC11351x975a7907.W.f360685f;
        android.view.View.OnClickListener onClickListener = activityC11351x975a7907.R1;
        c11352x53f4a81c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAUIC", "initImportEntrance，isShowTransactionsEntrance :%s, isShowSolitaireEntrance: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c11352x53f4a81c.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a79072 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 ? (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907) m158354x19263085 : null;
        if (activityC11351x975a79072 != null) {
            if (z18) {
                android.widget.TextView textView = c11352x53f4a81c.f154063e;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = c11352x53f4a81c.f154063e;
                if (textView2 != null) {
                    textView2.setOnClickListener(onClickListener);
                }
            } else {
                android.widget.TextView textView3 = c11352x53f4a81c.f154063e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            if (z18 && z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAUIC", "show entrances layout divider");
                android.view.View view = c11352x53f4a81c.f154064f;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View view2 = c11352x53f4a81c.f154064f;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (z17) {
                android.widget.TextView textView4 = c11352x53f4a81c.f154065g;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                android.widget.TextView textView5 = c11352x53f4a81c.f154065g;
                if (textView5 != null) {
                    textView5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v5(activityC11351x975a79072, str));
                }
            } else {
                android.widget.TextView textView6 = c11352x53f4a81c.f154065g;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
            }
            if (z17 && z18) {
                float b17 = (com.p314xaae8f345.mm.ui.bl.b(activityC11351x975a79072).x - i65.a.b(activityC11351x975a79072, 64)) - ((android.widget.LinearLayout) c11352x53f4a81c.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.hty)).getWidth();
                android.text.TextPaint textPaint = new android.text.TextPaint();
                android.widget.TextView textView7 = c11352x53f4a81c.f154065g;
                textPaint.setTextSize(textView7 != null ? textView7.getTextSize() : 0.0f);
                if (b17 < textPaint.measureText(c11352x53f4a81c.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p2c)) + textPaint.measureText(c11352x53f4a81c.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ga7)) + i65.a.b(activityC11351x975a79072, 8)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAUIC", "availableSpace is not enough, show entrances in two lines");
                    android.view.View view3 = c11352x53f4a81c.f154064f;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView8 = c11352x53f4a81c.f154065g;
                    android.view.ViewGroup.LayoutParams layoutParams = textView8 != null ? textView8.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.removeRule(0);
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.addRule(10);
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.addRule(11);
                    }
                    android.widget.TextView textView9 = c11352x53f4a81c.f154065g;
                    if (textView9 != null) {
                        textView9.setLayoutParams(layoutParams2);
                    }
                    android.widget.TextView textView10 = c11352x53f4a81c.f154065g;
                    if (textView10 != null) {
                        textView10.setMaxWidth((int) b17);
                    }
                    android.widget.TextView textView11 = c11352x53f4a81c.f154063e;
                    android.view.ViewGroup.LayoutParams layoutParams3 = textView11 != null ? textView11.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.removeRule(0);
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.addRule(3, com.p314xaae8f345.mm.R.id.u4j);
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.addRule(11);
                    }
                    android.widget.TextView textView12 = c11352x53f4a81c.f154063e;
                    if (textView12 != null) {
                        textView12.setLayoutParams(layoutParams4);
                    }
                    android.widget.RelativeLayout relativeLayout = c11352x53f4a81c.f154062d;
                    android.view.ViewGroup.LayoutParams layoutParams5 = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
                    if (layoutParams6 != null) {
                        layoutParams6.removeRule(11);
                    }
                    if (layoutParams6 != null) {
                        layoutParams6.width = -1;
                    }
                    android.widget.RelativeLayout relativeLayout2 = c11352x53f4a81c.f154062d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.setLayoutParams(layoutParams6);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAUIC", "availableSpace is enough, show entrances in one line");
                    android.widget.TextView textView13 = c11352x53f4a81c.f154063e;
                    android.view.ViewGroup.LayoutParams layoutParams7 = textView13 != null ? textView13.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
                    if (layoutParams8 != null) {
                        layoutParams8.removeRule(3);
                    }
                    if (layoutParams8 != null) {
                        layoutParams8.removeRule(11);
                    }
                    if (layoutParams8 != null) {
                        layoutParams8.addRule(11);
                    }
                    android.widget.TextView textView14 = c11352x53f4a81c.f154063e;
                    if (textView14 != null) {
                        textView14.setLayoutParams(layoutParams8);
                    }
                    android.view.View view4 = c11352x53f4a81c.f154064f;
                    if (view4 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView15 = c11352x53f4a81c.f154065g;
                    android.view.ViewGroup.LayoutParams layoutParams9 = textView15 != null ? textView15.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams9 : null;
                    if (layoutParams10 != null) {
                        layoutParams10.removeRule(10);
                    }
                    if (layoutParams10 != null) {
                        layoutParams10.removeRule(11);
                    }
                    if (layoutParams10 != null) {
                        layoutParams10.addRule(0, com.p314xaae8f345.mm.R.id.u4g);
                    }
                    android.widget.TextView textView16 = c11352x53f4a81c.f154065g;
                    if (textView16 != null) {
                        textView16.setLayoutParams(layoutParams10);
                    }
                    android.widget.RelativeLayout relativeLayout3 = c11352x53f4a81c.f154062d;
                    android.view.ViewGroup.LayoutParams layoutParams11 = relativeLayout3 != null ? relativeLayout3.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams11 : null;
                    if (layoutParams12 != null) {
                        layoutParams12.addRule(11);
                    }
                    if (layoutParams12 != null) {
                        layoutParams12.width = -2;
                    }
                    android.widget.RelativeLayout relativeLayout4 = c11352x53f4a81c.f154062d;
                    if (relativeLayout4 != null) {
                        relativeLayout4.setLayoutParams(layoutParams12);
                    }
                }
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchAAUIC", "initImportEntrance activity cast to LunchAAUI failed");
        }
    }

    public static void h7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, int i17, java.util.List list) {
        int min;
        activityC11351x975a7907.getClass();
        android.content.Intent intent = new android.content.Intent(activityC11351x975a7907, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11344x4cd4d8d8.class);
        intent.putExtra("titile", activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gaq));
        intent.putExtra("list_type", 12);
        intent.putExtra("chatroomName", activityC11351x975a7907.f154040m);
        intent.putExtra("enter_scene", activityC11351x975a7907.f154057y0);
        intent.putExtra("enter_mode", activityC11351x975a7907.f154037h);
        intent.putExtra("enter_sub_mode", activityC11351x975a7907.f154038i);
        intent.putExtra("group_solitatire_flag", activityC11351x975a7907.D1);
        if (activityC11351x975a7907.t7()) {
            intent.putStringArrayListExtra("group_solitatire_username_list", activityC11351x975a7907.F1);
            intent.putStringArrayListExtra("group_solitatire_desc_list", activityC11351x975a7907.G1);
        }
        if (list != null) {
            intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ","));
        }
        if (activityC11351x975a7907.k7() && activityC11351x975a7907.f154058y1.f153950f != null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.Iterator it = activityC11351x975a7907.f154058y1.f153950f.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11334x8cc8d4b8) it.next()).f153939d);
            }
            intent.putStringArrayListExtra("third_party_usernamelist", arrayList);
        }
        if (activityC11351x975a7907.k7()) {
            min = activityC11351x975a7907.f154058y1.f153950f.size();
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(activityC11351x975a7907.f154040m)) {
            min = java.lang.Math.min(activityC11351x975a7907.W.c(), activityC11351x975a7907.m7(activityC11351x975a7907.f154037h == 3 && activityC11351x975a7907.f154038i == 4).size());
        } else {
            min = java.lang.Math.min(activityC11351x975a7907.W.c(), 2);
        }
        intent.putExtra("max_select_num", min);
        intent.putExtra("select_type", 1);
        activityC11351x975a7907.startActivityForResult(intent, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 2, 2);
    }

    public static void i7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, java.lang.String str) {
        if (!activityC11351x975a7907.k7()) {
            str = activityC11351x975a7907.getIntent().getStringExtra("chatroom_name");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "[goToChattingUI] username:%s", str);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Main_User", str);
        putExtra.putExtra("From_fail_notify", true);
        putExtra.addFlags(67108864);
        putExtra.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        j45.l.u(activityC11351x975a7907, "com.tencent.mm.ui.LauncherUI", putExtra, null);
    }

    public static int j7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, android.view.View view, android.view.View view2, int i17) {
        if (activityC11351x975a7907.L == null) {
            return 0;
        }
        int i18 = com.p314xaae8f345.mm.ui.bl.b(activityC11351x975a7907.mo55332x76847179()).y;
        int c17 = ((i18 - com.p314xaae8f345.mm.ui.bl.c(activityC11351x975a7907.mo55332x76847179())) - activityC11351x975a7907.L.getHeight()) - i17;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        return c17 - (iArr[1] + view2.getHeight());
    }

    public static boolean q7(java.util.List list) {
        if (list == null) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) it.next(), c01.z1.r())) {
                return true;
            }
        }
        return false;
    }

    public final void A7() {
        boolean k76 = k7();
        java.util.Map map = this.R;
        if (!k76) {
            if (t7()) {
                ((java.util.HashMap) map).clear();
                L7();
                return;
            }
            return;
        }
        try {
            java.util.ArrayList arrayList = this.f154058y1.f153950f;
            ((java.util.HashMap) map).clear();
            if (arrayList != null && arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((java.util.HashMap) map).put(((com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11334x8cc8d4b8) it.next()).f153939d, java.lang.Double.valueOf(r2.f153940e / 100.0d));
                }
            }
            L7();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.LaunchAAUI", "initPersonLaunchView error:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public void B7(android.view.View view, android.view.View view2) {
        if (view == null || view2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.LaunchAAUI", "setBottomButtonMargin bottomView or aboveView is null");
        } else {
            this.f154035J.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f5(this, view2, view), 100L);
        }
    }

    public final void C7() {
        if (k7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "fromThirdParty(),user launch by person mode");
            this.f154037h = 3;
            this.f154038i = 5;
            return;
        }
        if (this.f154057y0 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "fromOrderDetail(),user launch by money mode");
            this.f154037h = 2;
            return;
        }
        this.W.getClass();
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AA_DEFAULT_INT, 2)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "defaultMode is ：%s", java.lang.Integer.valueOf(intValue));
        if (intValue == 1) {
            this.f154037h = 3;
            this.f154038i = 4;
        } else if (intValue != 3) {
            this.f154037h = 2;
        } else {
            this.f154037h = 3;
            this.f154038i = 5;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "aaPayCustomizeOpen switch is ：%s", java.lang.Boolean.TRUE);
        if (this.f154037h == 3 && k7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "mode == AAConstants.MODE_LAUNCH_BY_PERSON && fromThirdParty()");
            this.f154038i = 5;
        }
    }

    public final void D7() {
        int i17 = com.p314xaae8f345.mm.ui.bl.b(mo55332x76847179()).y;
        int[] iArr = new int[2];
        this.C.getLocationOnScreen(iArr);
        int height = i17 - (iArr[1] + this.C.getHeight());
        int b17 = i65.a.b(mo55332x76847179(), 48);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.P1.getLayoutParams();
        int b18 = i65.a.b(mo55332x76847179(), 5) + height;
        int i18 = this.N1;
        if (b18 < i18 + b17) {
            int b19 = ((i18 + b17) - height) + i65.a.b(mo55332x76847179(), 10);
            layoutParams.height = i65.a.b(mo55332x76847179(), 500);
            this.P1.setLayoutParams(layoutParams);
            this.P1.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i5(this, b19), 100L);
        }
    }

    public final void E7(boolean z17) {
        this.T.setEnabled(z17);
        if (z17) {
            this.f154046q.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            this.f154047r.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.f154048s.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        } else {
            this.f154046q.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            this.f154047r.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560090ar));
            this.f154048s.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560090ar));
        }
    }

    public final void F7(java.lang.String str) {
        this.X = true;
        this.V.setVisibility(0);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559347c8);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z3(this));
        this.V.startAnimation(loadAnimation);
        this.V.setText(str);
    }

    public final void G7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "showLaunchComfirmDialog() from scene:%s", java.lang.Integer.valueOf(this.f154057y0));
        java.lang.String obj = this.f154043p.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            obj = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_z);
        }
        if (t7()) {
            obj = obj.replaceAll("\n", "");
        }
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        ((r35.k1) q1Var).Ai(mo78514x143f1b92(), str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571261a1) + obj, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571260a0), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a4(this, str));
        f7(11);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 8, 3);
    }

    public final void H7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "switchMode");
        this.f154041n = false;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams.addRule(3, com.p314xaae8f345.mm.R.id.hua);
        this.C.setLayoutParams(layoutParams);
        if (this.f154037h == 3) {
            if (this.f154038i == 4) {
                this.I.setVisibility(8);
                this.Q.setVisibility(8);
                this.K.setVisibility(0);
                java.util.List n76 = n7();
                if (t7()) {
                    if (this.H1.size() == 0) {
                        this.H1 = m7(true);
                    }
                    this.I1.setVisibility(0);
                    this.J1.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_c, java.lang.Integer.valueOf(((java.util.ArrayList) n76).size()), java.lang.Integer.valueOf(this.H1.size())));
                    this.P.setVisibility(8);
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.C.getLayoutParams();
                    layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.hu9);
                    this.C.setLayoutParams(layoutParams2);
                    this.I1.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u3(this));
                } else {
                    this.I1.setVisibility(8);
                    this.P.setVisibility(0);
                    this.P.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_t, java.lang.Integer.valueOf(((java.util.ArrayList) n76).size())));
                }
            } else {
                this.I.setVisibility(0);
                this.P.setVisibility(8);
                this.Q.setVisibility(0);
                this.K.setVisibility(8);
                this.I1.setVisibility(8);
            }
            this.f154049t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g_m);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.f154046q.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_u, 0));
            java.util.Map map = this.R;
            if (map != null && ((java.util.HashMap) map).size() > this.W.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 8);
                this.f154041n = true;
            }
            if (this.f154041n) {
                F7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_s, java.lang.Integer.valueOf(this.W.a())));
            } else {
                p7();
            }
            f7(5);
        } else {
            this.f154037h = 2;
            this.F.setVisibility(0);
            this.G.setVisibility(0);
            this.I.setVisibility(8);
            this.K.setVisibility(8);
            this.P.setVisibility(8);
            this.I1.setVisibility(8);
            this.f154046q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g_g);
            B7(this.L, this.M);
            this.f154041n = false;
            if (this.H.size() > this.W.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 8);
                this.f154041n = true;
            }
            I7();
            f7(4);
        }
        mo48632xd46dd964();
        mo48674x36654fab();
        s7();
        J7();
        K7();
        B7(this.L, this.M);
    }

    public final void I7() {
        boolean z17 = this.f154041n;
        if (z17 && !this.X) {
            if (this.f154037h == 2) {
                F7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_s, java.lang.Integer.valueOf(this.W.c())));
                return;
            } else {
                F7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_s, java.lang.Integer.valueOf(this.W.a())));
                return;
            }
        }
        boolean z18 = this.f154042o;
        if (z18 && !this.X) {
            F7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gae, java.lang.Float.valueOf(((float) this.W.b()) / 100.0f)));
        } else {
            if (z17 || z18) {
                return;
            }
            p7();
        }
    }

    public final void J7() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.hta);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "updateAmountTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "updateAmountTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f154037h == 2) {
            java.util.List list = this.H;
            if (list == null || list.size() <= 0) {
                this.f154047r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571254u));
            } else {
                this.f154047r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571249p, java.lang.Double.valueOf(h61.o.d(this.D.m83183xfb85ada3(), "" + this.H.size(), 2, 2))));
            }
            this.f154046q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g_g);
            this.f154047r.setVisibility(0);
            this.f154048s.setVisibility(0);
            this.f154046q.setVisibility(0);
            return;
        }
        if (this.f154038i == 4) {
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "updateAmountTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "updateAmountTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f154047r.setVisibility(8);
            this.f154048s.setVisibility(8);
            this.f154046q.setVisibility(8);
            return;
        }
        java.util.Map map = this.R;
        if (map == null || ((java.util.HashMap) map).size() == 0) {
            this.f154046q.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_u, 0));
            this.f154047r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571254u));
            this.f154047r.setVisibility(0);
            this.f154048s.setVisibility(0);
            this.f154046q.setVisibility(0);
            return;
        }
        java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
        double d17 = 0.0d;
        while (it.hasNext()) {
            d17 += ((java.lang.Double) it.next()).doubleValue();
        }
        this.f154047r.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571249p, java.lang.Double.valueOf(d17)));
        this.f154046q.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_u, java.lang.Integer.valueOf(((java.util.HashMap) map).size())));
        this.L.setVisibility(0);
        this.f154047r.setVisibility(0);
        this.f154048s.setVisibility(0);
        this.f154046q.setVisibility(0);
    }

    public final void K7() {
        if (this.f154037h == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D.m83183xfb85ada3())) {
                E7(false);
                return;
            }
            if (this.f154042o) {
                E7(false);
                return;
            }
            java.util.List list = this.H;
            if (list == null || list.size() == 0) {
                E7(false);
                return;
            }
            if (this.H.size() > this.W.c() || this.f154041n) {
                E7(false);
                return;
            }
            if (t7()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(h61.o.k(this.H, this.f154040m, false, true));
                if (arrayList.size() == 1 && ((java.lang.String) arrayList.get(0)).equals(c01.z1.r())) {
                    E7(false);
                    return;
                }
            }
            double d17 = h61.o.d(this.D.m83183xfb85ada3(), "" + this.H.size(), 5, 4);
            this.D.m83183xfb85ada3();
            this.H.size();
            if (d17 < 0.01d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "less than 0.01");
                E7(false);
                return;
            }
        } else {
            if (this.f154038i == 4) {
                if (!t7()) {
                    E7(true);
                    return;
                }
                java.util.List list2 = this.H1;
                if (list2 == null || list2.size() == 0) {
                    E7(false);
                    return;
                } else if (this.H1.size() > this.W.c() || this.f154041n) {
                    E7(false);
                    return;
                } else {
                    E7(true);
                    return;
                }
            }
            java.util.Map map = this.R;
            if (map == null || ((java.util.HashMap) map).size() == 0) {
                E7(false);
                return;
            } else if (((java.util.HashMap) map).size() > this.W.c() || this.f154041n) {
                E7(false);
                return;
            }
        }
        E7(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L7() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.L7():void");
    }

    public void f7(int i17) {
        if (k7()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6641xe68217f2 c6641xe68217f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6641xe68217f2();
            c6641xe68217f2.f139928d = i17;
            c6641xe68217f2.k();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        try {
            mo48674x36654fab();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.LaunchAAUI", "%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bnn;
    }

    public final boolean k7() {
        return this.f154057y0 == 6;
    }

    public java.lang.String l7() {
        return new com.p314xaae8f345.mm.vfs.r6(mo55332x76847179().getCacheDir() + "/aaTempPho", "aa_share_bitmap.jpg").o();
    }

    public java.util.ArrayList m7(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (t7()) {
            arrayList.addAll(h61.o.k(n7(), this.f154040m, z17, true));
        } else {
            arrayList.addAll(n7());
        }
        return arrayList;
    }

    public java.util.List n7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (t7()) {
            arrayList.addAll(this.F1);
        } else {
            arrayList.addAll(h61.o.i(this.f154040m));
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needExecuteBackListener */
    public boolean mo48644xb863f65a() {
        return false;
    }

    public final void o7(java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "go to contact");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 3);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", false);
        intent.putExtra("mutil_select_is_ret", false);
        intent.putExtra("Select_block_List", c01.z1.r());
        if (arrayList != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(",");
            }
            if (sb6.length() - 1 >= 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "gotoSelectContactUI %s", sb6.toString());
            intent.putExtra("recent_remittance_contact_list", sb6.toString());
        }
        if (this.f154037h == 2) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.Iterator it6 = this.H.iterator();
            while (it6.hasNext()) {
                sb7.append((java.lang.String) it6.next());
                sb7.append(",");
            }
            if (sb7.length() - 1 >= 0) {
                sb7.deleteCharAt(sb7.length() - 1);
            }
            intent.putExtra("key_include_username_list", sb7.toString());
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.util.Iterator it7 = ((java.util.HashMap) this.R).keySet().iterator();
            while (it7.hasNext()) {
                sb8.append((java.lang.String) it7.next());
                sb8.append(",");
            }
            if (sb8.length() - 1 >= 0) {
                sb8.deleteCharAt(sb8.length() - 1);
            }
            intent.putExtra("key_include_username_list", sb8.toString());
        }
        if (k7()) {
            intent.putExtra("key_title", this.f154043p.getText().toString());
        }
        j45.l.n(mo55332x76847179(), "remittance", ".ui.SelectRemittanceContactUI", intent, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e);
        f7(10);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "onActivityResult requestCode:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 233) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (this.f154037h == 2) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        java.lang.String[] split = stringExtra.split(",");
                        this.H.clear();
                        this.H.addAll(java.util.Arrays.asList(split));
                    }
                    java.util.List n76 = n7();
                    java.util.List list = this.H;
                    if (list == null || list.size() != ((java.util.ArrayList) n76).size() || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f154040m)) {
                        android.widget.TextView textView = this.E;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        java.util.List list2 = this.H;
                        objArr[0] = java.lang.Integer.valueOf(list2 != null ? list2.size() : 0);
                        textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_h, objArr));
                    } else if (t7()) {
                        android.widget.TextView textView2 = this.E;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        java.util.List list3 = this.H;
                        objArr2[0] = java.lang.Integer.valueOf(list3 != null ? list3.size() : 0);
                        textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_e, objArr2));
                    } else {
                        android.widget.TextView textView3 = this.E;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        java.util.List list4 = this.H;
                        objArr3[0] = java.lang.Integer.valueOf(list4 != null ? list4.size() : 0);
                        textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_d, objArr3));
                    }
                }
                p7();
                java.util.List list5 = this.H;
                if (list5 == null || list5.size() <= this.W.c()) {
                    this.f154041n = false;
                } else {
                    this.f154041n = true;
                }
                double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.D.m83183xfb85ada3(), 0.0d);
                if (this.H == null || (F * 100.0d) / r0.size() <= this.W.b()) {
                    this.f154042o = false;
                } else {
                    this.f154042o = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 2);
                }
                K7();
                J7();
                I7();
                return;
            }
            return;
        }
        if (i17 == 330) {
            if (i18 == -1 && t7() && this.f154037h == 3 && this.f154038i == 4) {
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    java.lang.String[] split2 = stringExtra2.split(",");
                    ((java.util.ArrayList) this.H1).clear();
                    ((java.util.ArrayList) this.H1).addAll(java.util.Arrays.asList(split2));
                }
                java.util.List n77 = n7();
                java.util.List list6 = this.H1;
                if (list6 != null && ((java.util.ArrayList) list6).size() == ((java.util.ArrayList) n77).size() && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f154040m)) {
                    android.widget.TextView textView4 = this.J1;
                    java.lang.Object[] objArr4 = new java.lang.Object[2];
                    objArr4[0] = java.lang.Integer.valueOf(((java.util.ArrayList) n7()).size());
                    java.util.List list7 = this.H1;
                    objArr4[1] = java.lang.Integer.valueOf(list7 != null ? ((java.util.ArrayList) list7).size() : 0);
                    textView4.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_c, objArr4));
                } else {
                    android.widget.TextView textView5 = this.J1;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    java.util.List list8 = this.H1;
                    objArr5[0] = java.lang.Integer.valueOf(list8 != null ? ((java.util.ArrayList) list8).size() : 0);
                    textView5.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_h, objArr5));
                }
                p7();
                java.util.List list9 = this.H1;
                if (list9 == null || ((java.util.ArrayList) list9).size() <= this.W.c()) {
                    this.f154041n = false;
                } else {
                    this.f154041n = true;
                }
                double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.D.m83183xfb85ada3(), 0.0d);
                if (this.H1 == null || (F2 * 100.0d) / ((java.util.ArrayList) r0).size() <= this.W.b()) {
                    this.f154042o = false;
                } else {
                    this.f154042o = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13722, 2);
                }
                K7();
                J7();
                I7();
                return;
            }
            return;
        }
        if (i17 == 236) {
            if (i18 == -1) {
                try {
                    r7(intent.getStringArrayListExtra("selectUI"));
                    L7();
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.LaunchAAUI", "onActivityResult, SELECT_AMOUNT_SELECT_REQUEST_CODE error: %s", e17.getMessage());
                    return;
                }
            }
            return;
        }
        if (i17 != 300) {
            if (i17 == 310) {
                if (i18 == -1) {
                    this.f154039l1 = 2;
                    this.f154055x1 = "";
                    this.A.setVisibility(8);
                    this.f154056y.setVisibility(0);
                    this.f154059z.setVisibility(0);
                    f7(7);
                }
                if (this.A.getVisibility() == 0) {
                    this.f154053x.setClickable(false);
                    return;
                } else {
                    this.f154053x.setClickable(true);
                    return;
                }
            }
            return;
        }
        if (i18 == -1 && intent != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_image_list");
            if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                java.lang.String b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(this, intent, g83.a.a());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                    this.f154055x1 = b17;
                }
            } else {
                this.f154055x1 = stringArrayListExtra.get(0);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154055x1)) {
                this.f154039l1 = 2;
                this.A.setVisibility(0);
                this.f154056y.setVisibility(8);
                this.f154059z.setVisibility(8);
                com.p314xaae8f345.mm.p786x600aa8b.e.c(this.f154055x1);
                this.A.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u4(this));
                f7(8);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "SELECT_IMAGE_REQUEST_CODE imagePath:%s", this.f154055x1);
        }
        if (this.A.getVisibility() == 0) {
            this.f154053x.setClickable(false);
        } else {
            this.f154053x.setClickable(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ac  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d;
        super.onDestroy();
        if (k7() && (abstractC20980x9b9ad01d = this.K1) != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11352x53f4a81c) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11352x53f4a81c.class)).f154066h.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.L1;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.L1;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        java.util.Map map = this.S;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.L1;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    public final void p7() {
        this.X = false;
        if (this.V.getVisibility() != 8) {
            this.V.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559367cs));
            this.V.setVisibility(8);
        }
    }

    public final void r7(java.util.ArrayList arrayList) {
        java.util.Map map = this.R;
        ((java.util.HashMap) map).clear();
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String[] split = ((java.lang.String) it.next()).split(",");
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put(split[0], java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(split[1], 0.0d)));
        }
    }

    public final void s7() {
        java.lang.String string = this.f154037h == 3 ? this.f154038i == 4 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.gal) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.gak) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.gaj);
        com.p314xaae8f345.mm.ui.bk.r0(this.B.getPaint(), 0.8f);
        this.B.setText(string);
        int i17 = com.p314xaae8f345.mm.ui.bl.b(mo55332x76847179()).x;
        int b17 = i65.a.b(mo55332x76847179(), 20);
        android.widget.ImageView imageView = this.f154051v;
        if (imageView != null) {
            b17 = imageView.getWidth();
        }
        this.B.setMaxWidth((i17 - i65.a.b(mo55332x76847179(), 114)) - b17);
        this.f154050u.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gam) + ((java.lang.Object) this.B.getText()));
        this.f154050u.setClickable(true);
        this.f154050u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.s3(this));
        this.f154050u.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t3(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(h61.b.class);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11352x53f4a81c.class);
    }

    public final boolean t7() {
        return this.D1 == 1;
    }

    public final void u7(android.content.Context context, java.lang.String str, boolean z17, java.util.ArrayList arrayList) {
        java.util.List list;
        int size;
        double F;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var;
        f7(9);
        if (this.f154037h != 2) {
            p7();
            android.app.Dialog dialog = this.U;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.U = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(context, false, false, null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154055x1)) {
                if (this.f154039l1 == 2 && y7(this.f154055x1) && com.p314xaae8f345.mm.vfs.w6.j(l7())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "set local imagePath :%s", l7());
                    this.f154055x1 = l7();
                }
                new h61.h(this.f154055x1, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g4(this, context, str, z17, arrayList)).a();
                return;
            }
            if (this.f154038i != 4) {
                w7(context, str, "", "", z17, arrayList);
                return;
            } else if (t7()) {
                x7(context, str, "", "", z17, this.H1);
                return;
            } else {
                x7(context, str, "", "", z17, arrayList);
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D.m83183xfb85ada3()) || (list = this.H) == null || list.size() == 0) {
            return;
        }
        p7();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.d(13721, 2, 3);
        try {
            if (z17) {
                size = arrayList != null ? arrayList.size() : 0;
                F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f154047r.getText().toString(), 0.0d) * size;
            } else {
                java.util.List list2 = this.H;
                size = list2 != null ? list2.size() : 0;
                F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.D.m83183xfb85ada3(), 0.0d);
            }
            int i18 = size;
            double d17 = F;
            java.lang.String obj = this.f154043p.getText().toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                obj = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_z);
            }
            java.lang.String str2 = obj;
            if (i18 > 0) {
                android.app.Dialog dialog2 = this.U;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                this.U = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(context, false, false, null);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154055x1)) {
                    i17 = 1;
                    g0Var = g0Var2;
                    if (z17) {
                        v7(context, str, i18, str2, d17, arrayList, "", "");
                    } else {
                        v7(context, str, i18, str2, d17, this.H, "", "");
                    }
                } else {
                    if (this.f154039l1 == 2 && y7(this.f154055x1) && com.p314xaae8f345.mm.vfs.w6.j(l7())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "set local imagePath :%s", l7());
                        this.f154055x1 = l7();
                    }
                    i17 = 1;
                    g0Var = g0Var2;
                    new h61.h(this.f154055x1, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d4(this, z17, context, str, i18, str2, d17, arrayList)).a();
                }
            } else {
                i17 = 1;
                g0Var = g0Var2;
            }
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[i17] = n7();
            objArr[2] = java.lang.Integer.valueOf(i18);
            objArr[3] = java.lang.Double.valueOf(d17 * 100.0d);
            objArr[4] = str2;
            g0Var.d(13723, objArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.LaunchAAUI", "launchAAByMoney mode: %s error: %s", java.lang.Integer.valueOf(this.f154037h), e17.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v7(android.content.Context r19, java.lang.String r20, int r21, java.lang.String r22, double r23, java.util.List r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.v7(android.content.Context, java.lang.String, int, java.lang.String, double, java.util.List, java.lang.String, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        if (i17 > 0 && this.M1 <= 0) {
            this.N1 = i17;
            this.M1 = i17;
            D7();
        }
        if (i17 > 0 || this.M1 <= 0) {
            return;
        }
        this.M1 = i17;
        this.P1.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.h5(this), 50L);
    }

    public final void w7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.util.List list) {
        java.util.Iterator it;
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 7, 5);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 3, 3);
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String obj = this.f154043p.getText().toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                obj = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_z);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.Map map = this.R;
            java.util.Iterator it6 = ((java.util.HashMap) map).keySet().iterator();
            long j17 = 0;
            while (it6.hasNext()) {
                java.lang.String str4 = (java.lang.String) it6.next();
                if (z17 && !list.contains(str4)) {
                }
                double doubleValue = ((java.lang.Double) ((java.util.HashMap) map).get(str4)).doubleValue();
                r45.o oVar = new r45.o();
                oVar.f463318e = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0(java.lang.String.valueOf(doubleValue), "100");
                oVar.f463317d = str4;
                arrayList.add(oVar);
                j17 += oVar.f463318e;
                arrayList2.add("" + oVar.f463318e);
                hashMap2.put(oVar.f463317d, oVar);
                map = map;
                it6 = it6;
            }
            r45.o oVar2 = new r45.o();
            oVar2.f463317d = c01.z1.r();
            oVar2.f463318e = j17;
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, obj);
            hashMap.put("totalPayAmount", java.lang.Long.valueOf(j17));
            hashMap.put("payerlist", arrayList);
            if (t7()) {
                hashMap.put("isGroupSolitatire", java.lang.Boolean.TRUE);
                java.util.List n76 = n7();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it7 = ((java.util.ArrayList) n76).iterator();
                while (it7.hasNext()) {
                    java.lang.String str5 = (java.lang.String) it7.next();
                    if (hashMap2.containsKey(str5)) {
                        it = it7;
                        arrayList3.add((r45.o) hashMap2.get(str5));
                        arrayList4.add(str5);
                    } else {
                        it = it7;
                    }
                    it7 = it;
                }
                hashMap.put("payerlist", arrayList3);
                hashMap.put("payerlistGroupSolitatire", h61.o.g(this.E1, arrayList4));
            } else {
                hashMap.put("isGroupSolitatire", java.lang.Boolean.FALSE);
                hashMap.put("payerlistGroupSolitatire", new java.util.ArrayList());
            }
            hashMap.put("chatRoomName", str);
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.Y));
            hashMap.put("pic_cdn_url", str2);
            hashMap.put("pic_cdn_thumb_url", str3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154055x1)) {
                hashMap.put("pic_cdn_md5", kk.k.e(this.f154055x1));
            }
            if (k7()) {
                hashMap.put("pf_order_no", this.f154060z1);
            }
            k61.l lVar = this.f154036g.f386038c;
            lVar.getClass();
            ((km5.q) ((km5.q) km5.u.e(hashMap)).n(lVar).h(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o4(this, str, context))).s(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n4(this, context));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13723, 2, java.lang.Integer.valueOf(((java.util.ArrayList) n7()).size()), java.lang.Integer.valueOf(arrayList.size() + 1), java.lang.Long.valueOf(j17), obj, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.LaunchAAUI", "launchAAByPerson error: %s", e17.getMessage());
        }
    }

    public final void x7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "launchAAByPersonCustomize");
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 7, 5);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 8, 2);
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String obj = this.f154043p.getText().toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                obj = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_z);
            }
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, obj);
            hashMap.put("chatRoomName", str);
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.Y));
            hashMap.put("pic_cdn_url", str2);
            hashMap.put("pic_cdn_thumb_url", str3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154055x1)) {
                hashMap.put("pic_cdn_md5", kk.k.e(this.f154055x1));
            }
            if (k7()) {
                hashMap.put("pf_order_no", this.f154060z1);
            }
            int size = ((java.util.ArrayList) n7()).size();
            if (t7()) {
                hashMap.put("isGroupSolitatire", java.lang.Boolean.TRUE);
                java.util.ArrayList g17 = h61.o.g(this.E1, list);
                hashMap.put("payerlistGroupSolitatire", g17);
                size = g17.size();
            } else {
                hashMap.put("isGroupSolitatire", java.lang.Boolean.FALSE);
                hashMap.put("payerlistGroupSolitatire", new java.util.ArrayList());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11352x53f4a81c) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11352x53f4a81c.class)).O6(size);
            k61.k kVar = this.f154036g.f386039d;
            kVar.getClass();
            ((km5.q) ((km5.q) km5.u.e(hashMap)).n(kVar).h(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.t4(this, str, context))).s(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.s4(this, context));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.LaunchAAUI", "launchAAByPersonCustomize error: %s", e17.getMessage());
        }
    }

    public final boolean y7(java.lang.String str) {
        android.graphics.BitmapFactory.Options options;
        android.graphics.BitmapFactory.Options options2;
        int i17;
        int i18;
        try {
            options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
            options2 = new android.graphics.BitmapFactory.Options();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "bitmap width： %s , height： %s", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
            i17 = options.outWidth;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Aa.LaunchAAUI", "decode file to bitmap error! " + e17.getMessage());
        }
        if (i17 > 4 && (i18 = options.outHeight) > 4) {
            if (i17 * i18 < 5242880) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "dont handle：sizeOption.outWidth * sizeOption.outHeight * 2 < MAX_BITMAP_SIZE");
                return false;
            }
            int ceil = (int) java.lang.Math.ceil((i17 * i18) / 5242880);
            options2.inSampleSize = ceil;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "need handle：bitmap too large sample:%s", java.lang.Integer.valueOf(ceil));
            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options2), com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b());
            if (com.p314xaae8f345.mm.vfs.w6.j(l7())) {
                com.p314xaae8f345.mm.vfs.w6.h(l7());
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(w07, 80, android.graphics.Bitmap.CompressFormat.JPEG, l7(), true);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "dont handle：sizeOption.outWidth <= MIN_IMAGE_SIZE || sizeOption.outHeight <= MIN_IMAGE_SIZE");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    public final void z7() {
        ?? arrayList;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Z)) {
            this.D.m83213x765074af("");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "default amount: %s", this.Z);
        }
        this.D.b(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x3(this));
        mo48633x8f91b80(this.D, 2, false, true);
        this.D.m83217x59dfe8de(true);
        if (k7()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.HashMap) this.R).keySet().iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) it.next());
            }
            this.E.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_h, java.lang.Integer.valueOf(arrayList2.size())));
            this.H = arrayList2;
        } else {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f154040m)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "is single chat: %s", this.f154040m);
                arrayList = new java.util.ArrayList();
                arrayList.add(c01.z1.r());
                arrayList.add(this.f154040m);
            } else if (c01.e2.R(this.f154040m)) {
                arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = (java.util.ArrayList) n7();
                if (arrayList3.size() > 0) {
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str = (java.lang.String) it6.next();
                        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                            arrayList.add(str);
                        }
                    }
                }
            } else {
                arrayList = n7();
            }
            this.H = arrayList;
            if (arrayList.size() > this.W.c()) {
                this.H.clear();
                this.E.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hgk));
                K7();
            } else if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f154040m)) {
                this.E.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_h, java.lang.Integer.valueOf(arrayList.size())));
            } else if (c01.e2.R(this.f154040m)) {
                this.E.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_h, java.lang.Integer.valueOf(arrayList.size())));
            } else if (t7()) {
                int size = m7(false).size();
                if (size == arrayList.size()) {
                    this.E.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_e, java.lang.Integer.valueOf(arrayList.size())));
                } else {
                    this.E.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_h, java.lang.Integer.valueOf(size)));
                }
            } else {
                this.E.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_d, java.lang.Integer.valueOf(arrayList.size())));
            }
        }
        this.F.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y3(this));
        this.f154041n = false;
    }
}
