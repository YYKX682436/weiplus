package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class LaunchAAUI extends com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity implements com.tencent.mm.ui.tools.c5 {
    public static final /* synthetic */ int S1 = 0;
    public android.widget.ImageView A;
    public android.app.Dialog A1;
    public android.widget.TextView B;
    public android.view.ViewGroup C;
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView D;
    public android.widget.TextView E;
    public y63.a E1;
    public android.view.ViewGroup F;
    public android.view.ViewGroup G;
    public android.view.ViewGroup I;
    public android.view.ViewGroup I1;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f72502J;
    public android.widget.TextView J1;
    public android.view.ViewGroup K;
    public android.view.ViewGroup L;
    public com.tencent.mm.ui.tools.f5 L1;
    public android.view.ViewGroup M;
    public android.widget.TextView N;
    public android.widget.ScrollView O1;
    public android.widget.TextView P;
    public android.view.View P1;
    public android.view.ViewGroup Q;
    public com.tencent.mm.wallet_core.ui.WcPayBannerView Q1;
    public android.widget.Button T;
    public android.app.Dialog U;
    public android.widget.TextView V;
    public java.lang.String Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f72506l1;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f72510p;

    /* renamed from: p0, reason: collision with root package name */
    public long f72511p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f72513q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f72514r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f72515s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f72516t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f72517u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f72518v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.RelativeLayout f72519w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f72520x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f72521x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f72522x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f72523y;

    /* renamed from: y0, reason: collision with root package name */
    public int f72524y0;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f72526z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f72527z1;

    /* renamed from: g, reason: collision with root package name */
    public final k61.m f72503g = (k61.m) this.f72474e.a(this, k61.m.class);

    /* renamed from: h, reason: collision with root package name */
    public int f72504h = 2;

    /* renamed from: i, reason: collision with root package name */
    public int f72505i = 4;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f72507m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f72508n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f72509o = false;
    public java.util.List H = new java.util.ArrayList();
    public final java.util.Map R = new java.util.HashMap();
    public final java.util.Map S = new java.util.HashMap();
    public h61.i W = new h61.i();
    public boolean X = false;
    public long Y = 0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f72512p1 = "";

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel f72525y1 = null;
    public boolean B1 = false;
    public android.app.Dialog C1 = null;
    public int D1 = 0;
    public final java.util.ArrayList F1 = new java.util.ArrayList();
    public final java.util.ArrayList G1 = new java.util.ArrayList();
    public java.util.List H1 = new java.util.ArrayList();
    public final com.tencent.mm.sdk.event.IListener K1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LaunchAAEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.aa.ui.LaunchAAUI.1
        {
            this.__eventId = 1137642263;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.LaunchAAEvent launchAAEvent) {
            com.tencent.mm.autogen.events.LaunchAAEvent launchAAEvent2 = launchAAEvent;
            if (launchAAEvent2 != null) {
                am.mi miVar = launchAAEvent2.f54463g;
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "launchAAEventIListener %s", miVar.f7350c);
                android.content.Context context = miVar.f7348a;
                java.lang.String str = miVar.f7350c;
                java.util.ArrayList arrayList = miVar.f7349b;
                int i17 = com.tencent.mm.plugin.aa.ui.LaunchAAUI.S1;
                com.tencent.mm.plugin.aa.ui.LaunchAAUI.this.u7(context, str, true, arrayList);
            }
            return true;
        }
    };
    public int M1 = 0;
    public int N1 = 0;
    public final android.view.View.OnClickListener R1 = new com.tencent.mm.plugin.aa.ui.n5(this);

    public static void g7(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        jz5.f0 f0Var;
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(launchAAUI.W.f279152f);
        boolean z18 = launchAAUI.W.f279151e && !launchAAUI.k7() && com.tencent.mm.storage.z3.R4(launchAAUI.f72507m);
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "initImportEntrance，isShowTransactionsEntrance :%s, isShowSolitaireEntrance: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        androidx.appcompat.app.AppCompatActivity activity = launchAAUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.aa.ui.LaunchAAUIC launchAAUIC = (com.tencent.mm.plugin.aa.ui.LaunchAAUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.aa.ui.LaunchAAUIC.class);
        java.lang.String str = launchAAUI.W.f279152f;
        android.view.View.OnClickListener onClickListener = launchAAUI.R1;
        launchAAUIC.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAUIC", "initImportEntrance，isShowTransactionsEntrance :%s, isShowSolitaireEntrance: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        androidx.appcompat.app.AppCompatActivity activity2 = launchAAUIC.getActivity();
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI2 = activity2 instanceof com.tencent.mm.plugin.aa.ui.LaunchAAUI ? (com.tencent.mm.plugin.aa.ui.LaunchAAUI) activity2 : null;
        if (launchAAUI2 != null) {
            if (z18) {
                android.widget.TextView textView = launchAAUIC.f72530e;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = launchAAUIC.f72530e;
                if (textView2 != null) {
                    textView2.setOnClickListener(onClickListener);
                }
            } else {
                android.widget.TextView textView3 = launchAAUIC.f72530e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            if (z18 && z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAUIC", "show entrances layout divider");
                android.view.View view = launchAAUIC.f72531f;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View view2 = launchAAUIC.f72531f;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (z17) {
                android.widget.TextView textView4 = launchAAUIC.f72532g;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                android.widget.TextView textView5 = launchAAUIC.f72532g;
                if (textView5 != null) {
                    textView5.setOnClickListener(new com.tencent.mm.plugin.aa.ui.v5(launchAAUI2, str));
                }
            } else {
                android.widget.TextView textView6 = launchAAUIC.f72532g;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
            }
            if (z17 && z18) {
                float b17 = (com.tencent.mm.ui.bl.b(launchAAUI2).x - i65.a.b(launchAAUI2, 64)) - ((android.widget.LinearLayout) launchAAUIC.findViewById(com.tencent.mm.R.id.hty)).getWidth();
                android.text.TextPaint textPaint = new android.text.TextPaint();
                android.widget.TextView textView7 = launchAAUIC.f72532g;
                textPaint.setTextSize(textView7 != null ? textView7.getTextSize() : 0.0f);
                if (b17 < textPaint.measureText(launchAAUIC.getString(com.tencent.mm.R.string.p2c)) + textPaint.measureText(launchAAUIC.getString(com.tencent.mm.R.string.ga7)) + i65.a.b(launchAAUI2, 8)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAUIC", "availableSpace is not enough, show entrances in two lines");
                    android.view.View view3 = launchAAUIC.f72531f;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView8 = launchAAUIC.f72532g;
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
                    android.widget.TextView textView9 = launchAAUIC.f72532g;
                    if (textView9 != null) {
                        textView9.setLayoutParams(layoutParams2);
                    }
                    android.widget.TextView textView10 = launchAAUIC.f72532g;
                    if (textView10 != null) {
                        textView10.setMaxWidth((int) b17);
                    }
                    android.widget.TextView textView11 = launchAAUIC.f72530e;
                    android.view.ViewGroup.LayoutParams layoutParams3 = textView11 != null ? textView11.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.removeRule(0);
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.addRule(3, com.tencent.mm.R.id.u4j);
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.addRule(11);
                    }
                    android.widget.TextView textView12 = launchAAUIC.f72530e;
                    if (textView12 != null) {
                        textView12.setLayoutParams(layoutParams4);
                    }
                    android.widget.RelativeLayout relativeLayout = launchAAUIC.f72529d;
                    android.view.ViewGroup.LayoutParams layoutParams5 = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
                    if (layoutParams6 != null) {
                        layoutParams6.removeRule(11);
                    }
                    if (layoutParams6 != null) {
                        layoutParams6.width = -1;
                    }
                    android.widget.RelativeLayout relativeLayout2 = launchAAUIC.f72529d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.setLayoutParams(layoutParams6);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAUIC", "availableSpace is enough, show entrances in one line");
                    android.widget.TextView textView13 = launchAAUIC.f72530e;
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
                    android.widget.TextView textView14 = launchAAUIC.f72530e;
                    if (textView14 != null) {
                        textView14.setLayoutParams(layoutParams8);
                    }
                    android.view.View view4 = launchAAUIC.f72531f;
                    if (view4 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC", "initImportEntrance", "(ZZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView15 = launchAAUIC.f72532g;
                    android.view.ViewGroup.LayoutParams layoutParams9 = textView15 != null ? textView15.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams9 : null;
                    if (layoutParams10 != null) {
                        layoutParams10.removeRule(10);
                    }
                    if (layoutParams10 != null) {
                        layoutParams10.removeRule(11);
                    }
                    if (layoutParams10 != null) {
                        layoutParams10.addRule(0, com.tencent.mm.R.id.u4g);
                    }
                    android.widget.TextView textView16 = launchAAUIC.f72532g;
                    if (textView16 != null) {
                        textView16.setLayoutParams(layoutParams10);
                    }
                    android.widget.RelativeLayout relativeLayout3 = launchAAUIC.f72529d;
                    android.view.ViewGroup.LayoutParams layoutParams11 = relativeLayout3 != null ? relativeLayout3.getLayoutParams() : null;
                    android.widget.RelativeLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams11 : null;
                    if (layoutParams12 != null) {
                        layoutParams12.addRule(11);
                    }
                    if (layoutParams12 != null) {
                        layoutParams12.width = -2;
                    }
                    android.widget.RelativeLayout relativeLayout4 = launchAAUIC.f72529d;
                    if (relativeLayout4 != null) {
                        relativeLayout4.setLayoutParams(layoutParams12);
                    }
                }
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAAUIC", "initImportEntrance activity cast to LunchAAUI failed");
        }
    }

    public static void h7(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, int i17, java.util.List list) {
        int min;
        launchAAUI.getClass();
        android.content.Intent intent = new android.content.Intent(launchAAUI, (java.lang.Class<?>) com.tencent.mm.plugin.aa.ui.AASelectContactUI.class);
        intent.putExtra("titile", launchAAUI.getString(com.tencent.mm.R.string.gaq));
        intent.putExtra("list_type", 12);
        intent.putExtra("chatroomName", launchAAUI.f72507m);
        intent.putExtra("enter_scene", launchAAUI.f72524y0);
        intent.putExtra("enter_mode", launchAAUI.f72504h);
        intent.putExtra("enter_sub_mode", launchAAUI.f72505i);
        intent.putExtra("group_solitatire_flag", launchAAUI.D1);
        if (launchAAUI.t7()) {
            intent.putStringArrayListExtra("group_solitatire_username_list", launchAAUI.F1);
            intent.putStringArrayListExtra("group_solitatire_desc_list", launchAAUI.G1);
        }
        if (list != null) {
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(list, ","));
        }
        if (launchAAUI.k7() && launchAAUI.f72525y1.f72417f != null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.Iterator it = launchAAUI.f72525y1.f72417f.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel) it.next()).f72406d);
            }
            intent.putStringArrayListExtra("third_party_usernamelist", arrayList);
        }
        if (launchAAUI.k7()) {
            min = launchAAUI.f72525y1.f72417f.size();
        } else if (com.tencent.mm.storage.z3.R4(launchAAUI.f72507m)) {
            min = java.lang.Math.min(launchAAUI.W.c(), launchAAUI.m7(launchAAUI.f72504h == 3 && launchAAUI.f72505i == 4).size());
        } else {
            min = java.lang.Math.min(launchAAUI.W.c(), 2);
        }
        intent.putExtra("max_select_num", min);
        intent.putExtra("select_type", 1);
        launchAAUI.startActivityForResult(intent, i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 2, 2);
    }

    public static void i7(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, java.lang.String str) {
        if (!launchAAUI.k7()) {
            str = launchAAUI.getIntent().getStringExtra("chatroom_name");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "[goToChattingUI] username:%s", str);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Main_User", str);
        putExtra.putExtra("From_fail_notify", true);
        putExtra.addFlags(67108864);
        putExtra.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        j45.l.u(launchAAUI, "com.tencent.mm.ui.LauncherUI", putExtra, null);
    }

    public static int j7(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, android.view.View view, android.view.View view2, int i17) {
        if (launchAAUI.L == null) {
            return 0;
        }
        int i18 = com.tencent.mm.ui.bl.b(launchAAUI.getContext()).y;
        int c17 = ((i18 - com.tencent.mm.ui.bl.c(launchAAUI.getContext())) - launchAAUI.L.getHeight()) - i17;
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
            if (com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) it.next(), c01.z1.r())) {
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
            java.util.ArrayList arrayList = this.f72525y1.f72417f;
            ((java.util.HashMap) map).clear();
            if (arrayList != null && arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((java.util.HashMap) map).put(((com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel) it.next()).f72406d, java.lang.Double.valueOf(r2.f72407e / 100.0d));
                }
            }
            L7();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.LaunchAAUI", "initPersonLaunchView error:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public void B7(android.view.View view, android.view.View view2) {
        if (view == null || view2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.LaunchAAUI", "setBottomButtonMargin bottomView or aboveView is null");
        } else {
            this.f72502J.postDelayed(new com.tencent.mm.plugin.aa.ui.f5(this, view2, view), 100L);
        }
    }

    public final void C7() {
        if (k7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "fromThirdParty(),user launch by person mode");
            this.f72504h = 3;
            this.f72505i = 5;
            return;
        }
        if (this.f72524y0 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "fromOrderDetail(),user launch by money mode");
            this.f72504h = 2;
            return;
        }
        this.W.getClass();
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_AA_DEFAULT_INT, 2)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "defaultMode is ：%s", java.lang.Integer.valueOf(intValue));
        if (intValue == 1) {
            this.f72504h = 3;
            this.f72505i = 4;
        } else if (intValue != 3) {
            this.f72504h = 2;
        } else {
            this.f72504h = 3;
            this.f72505i = 5;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "aaPayCustomizeOpen switch is ：%s", java.lang.Boolean.TRUE);
        if (this.f72504h == 3 && k7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "mode == AAConstants.MODE_LAUNCH_BY_PERSON && fromThirdParty()");
            this.f72505i = 5;
        }
    }

    public final void D7() {
        int i17 = com.tencent.mm.ui.bl.b(getContext()).y;
        int[] iArr = new int[2];
        this.C.getLocationOnScreen(iArr);
        int height = i17 - (iArr[1] + this.C.getHeight());
        int b17 = i65.a.b(getContext(), 48);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.P1.getLayoutParams();
        int b18 = i65.a.b(getContext(), 5) + height;
        int i18 = this.N1;
        if (b18 < i18 + b17) {
            int b19 = ((i18 + b17) - height) + i65.a.b(getContext(), 10);
            layoutParams.height = i65.a.b(getContext(), 500);
            this.P1.setLayoutParams(layoutParams);
            this.P1.postDelayed(new com.tencent.mm.plugin.aa.ui.i5(this, b19), 100L);
        }
    }

    public final void E7(boolean z17) {
        this.T.setEnabled(z17);
        if (z17) {
            this.f72513q.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_1));
            this.f72514r.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
            this.f72515s.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        } else {
            this.f72513q.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_1));
            this.f72514r.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478557ar));
            this.f72515s.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478557ar));
        }
    }

    public final void F7(java.lang.String str) {
        this.X = true;
        this.V.setVisibility(0);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477814c8);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.aa.ui.z3(this));
        this.V.startAnimation(loadAnimation);
        this.V.setText(str);
    }

    public final void G7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "showLaunchComfirmDialog() from scene:%s", java.lang.Integer.valueOf(this.f72524y0));
        java.lang.String obj = this.f72510p.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            obj = getString(com.tencent.mm.R.string.g_z);
        }
        if (t7()) {
            obj = obj.replaceAll("\n", "");
        }
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        ((r35.k1) q1Var).Ai(getController(), str, getString(com.tencent.mm.R.string.f489728a1) + obj, getString(com.tencent.mm.R.string.f489727a0), new com.tencent.mm.plugin.aa.ui.a4(this, str));
        f7(11);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 8, 3);
    }

    public final void H7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "switchMode");
        this.f72508n = false;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams.addRule(3, com.tencent.mm.R.id.hua);
        this.C.setLayoutParams(layoutParams);
        if (this.f72504h == 3) {
            if (this.f72505i == 4) {
                this.I.setVisibility(8);
                this.Q.setVisibility(8);
                this.K.setVisibility(0);
                java.util.List n76 = n7();
                if (t7()) {
                    if (this.H1.size() == 0) {
                        this.H1 = m7(true);
                    }
                    this.I1.setVisibility(0);
                    this.J1.setText(getString(com.tencent.mm.R.string.g_c, java.lang.Integer.valueOf(((java.util.ArrayList) n76).size()), java.lang.Integer.valueOf(this.H1.size())));
                    this.P.setVisibility(8);
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.C.getLayoutParams();
                    layoutParams2.addRule(3, com.tencent.mm.R.id.hu9);
                    this.C.setLayoutParams(layoutParams2);
                    this.I1.setOnClickListener(new com.tencent.mm.plugin.aa.ui.u3(this));
                } else {
                    this.I1.setVisibility(8);
                    this.P.setVisibility(0);
                    this.P.setText(getString(com.tencent.mm.R.string.g_t, java.lang.Integer.valueOf(((java.util.ArrayList) n76).size())));
                }
            } else {
                this.I.setVisibility(0);
                this.P.setVisibility(8);
                this.Q.setVisibility(0);
                this.K.setVisibility(8);
                this.I1.setVisibility(8);
            }
            this.f72516t.setText(com.tencent.mm.R.string.g_m);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.f72513q.setText(getString(com.tencent.mm.R.string.g_u, 0));
            java.util.Map map = this.R;
            if (map != null && ((java.util.HashMap) map).size() > this.W.a()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 8);
                this.f72508n = true;
            }
            if (this.f72508n) {
                F7(getString(com.tencent.mm.R.string.g_s, java.lang.Integer.valueOf(this.W.a())));
            } else {
                p7();
            }
            f7(5);
        } else {
            this.f72504h = 2;
            this.F.setVisibility(0);
            this.G.setVisibility(0);
            this.I.setVisibility(8);
            this.K.setVisibility(8);
            this.P.setVisibility(8);
            this.I1.setVisibility(8);
            this.f72513q.setText(com.tencent.mm.R.string.g_g);
            B7(this.L, this.M);
            this.f72508n = false;
            if (this.H.size() > this.W.c()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 8);
                this.f72508n = true;
            }
            I7();
            f7(4);
        }
        hideTenpayKB();
        hideVKB();
        s7();
        J7();
        K7();
        B7(this.L, this.M);
    }

    public final void I7() {
        boolean z17 = this.f72508n;
        if (z17 && !this.X) {
            if (this.f72504h == 2) {
                F7(getString(com.tencent.mm.R.string.g_s, java.lang.Integer.valueOf(this.W.c())));
                return;
            } else {
                F7(getString(com.tencent.mm.R.string.g_s, java.lang.Integer.valueOf(this.W.a())));
                return;
            }
        }
        boolean z18 = this.f72509o;
        if (z18 && !this.X) {
            F7(getString(com.tencent.mm.R.string.gae, java.lang.Float.valueOf(((float) this.W.b()) / 100.0f)));
        } else {
            if (z17 || z18) {
                return;
            }
            p7();
        }
    }

    public final void J7() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hta);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "updateAmountTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "updateAmountTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f72504h == 2) {
            java.util.List list = this.H;
            if (list == null || list.size() <= 0) {
                this.f72514r.setText(getString(com.tencent.mm.R.string.f489721u));
            } else {
                this.f72514r.setText(getString(com.tencent.mm.R.string.f489716p, java.lang.Double.valueOf(h61.o.d(this.D.getText(), "" + this.H.size(), 2, 2))));
            }
            this.f72513q.setText(com.tencent.mm.R.string.g_g);
            this.f72514r.setVisibility(0);
            this.f72515s.setVisibility(0);
            this.f72513q.setVisibility(0);
            return;
        }
        if (this.f72505i == 4) {
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "updateAmountTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "updateAmountTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f72514r.setVisibility(8);
            this.f72515s.setVisibility(8);
            this.f72513q.setVisibility(8);
            return;
        }
        java.util.Map map = this.R;
        if (map == null || ((java.util.HashMap) map).size() == 0) {
            this.f72513q.setText(getString(com.tencent.mm.R.string.g_u, 0));
            this.f72514r.setText(getString(com.tencent.mm.R.string.f489721u));
            this.f72514r.setVisibility(0);
            this.f72515s.setVisibility(0);
            this.f72513q.setVisibility(0);
            return;
        }
        java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
        double d17 = 0.0d;
        while (it.hasNext()) {
            d17 += ((java.lang.Double) it.next()).doubleValue();
        }
        this.f72514r.setText(getString(com.tencent.mm.R.string.f489716p, java.lang.Double.valueOf(d17)));
        this.f72513q.setText(getString(com.tencent.mm.R.string.g_u, java.lang.Integer.valueOf(((java.util.HashMap) map).size())));
        this.L.setVisibility(0);
        this.f72514r.setVisibility(0);
        this.f72515s.setVisibility(0);
        this.f72513q.setVisibility(0);
    }

    public final void K7() {
        if (this.f72504h == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.D.getText())) {
                E7(false);
                return;
            }
            if (this.f72509o) {
                E7(false);
                return;
            }
            java.util.List list = this.H;
            if (list == null || list.size() == 0) {
                E7(false);
                return;
            }
            if (this.H.size() > this.W.c() || this.f72508n) {
                E7(false);
                return;
            }
            if (t7()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(h61.o.k(this.H, this.f72507m, false, true));
                if (arrayList.size() == 1 && ((java.lang.String) arrayList.get(0)).equals(c01.z1.r())) {
                    E7(false);
                    return;
                }
            }
            double d17 = h61.o.d(this.D.getText(), "" + this.H.size(), 5, 4);
            this.D.getText();
            this.H.size();
            if (d17 < 0.01d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "less than 0.01");
                E7(false);
                return;
            }
        } else {
            if (this.f72505i == 4) {
                if (!t7()) {
                    E7(true);
                    return;
                }
                java.util.List list2 = this.H1;
                if (list2 == null || list2.size() == 0) {
                    E7(false);
                    return;
                } else if (this.H1.size() > this.W.c() || this.f72508n) {
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
            } else if (((java.util.HashMap) map).size() > this.W.c() || this.f72508n) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.aa.ui.LaunchAAUI.L7():void");
    }

    public void f7(int i17) {
        if (k7()) {
            com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct groupPayPfClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct();
            groupPayPfClickReportStruct.f58395d = i17;
            groupPayPfClickReportStruct.k();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        try {
            hideVKB();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.LaunchAAUI", "%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bnn;
    }

    public final boolean k7() {
        return this.f72524y0 == 6;
    }

    public java.lang.String l7() {
        return new com.tencent.mm.vfs.r6(getContext().getCacheDir() + "/aaTempPho", "aa_share_bitmap.jpg").o();
    }

    public java.util.ArrayList m7(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (t7()) {
            arrayList.addAll(h61.o.k(n7(), this.f72507m, z17, true));
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
            arrayList.addAll(h61.o.i(this.f72507m));
        }
        return arrayList;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needExecuteBackListener() {
        return false;
    }

    public final void o7(java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "go to contact");
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
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "gotoSelectContactUI %s", sb6.toString());
            intent.putExtra("recent_remittance_contact_list", sb6.toString());
        }
        if (this.f72504h == 2) {
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
            intent.putExtra("key_title", this.f72510p.getText().toString());
        }
        j45.l.n(getContext(), "remittance", ".ui.SelectRemittanceContactUI", intent, com.tencent.mapsdk.internal.km.f50100e);
        f7(10);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "onActivityResult requestCode:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 233) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (this.f72504h == 2) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        java.lang.String[] split = stringExtra.split(",");
                        this.H.clear();
                        this.H.addAll(java.util.Arrays.asList(split));
                    }
                    java.util.List n76 = n7();
                    java.util.List list = this.H;
                    if (list == null || list.size() != ((java.util.ArrayList) n76).size() || !com.tencent.mm.storage.z3.R4(this.f72507m)) {
                        android.widget.TextView textView = this.E;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        java.util.List list2 = this.H;
                        objArr[0] = java.lang.Integer.valueOf(list2 != null ? list2.size() : 0);
                        textView.setText(getString(com.tencent.mm.R.string.g_h, objArr));
                    } else if (t7()) {
                        android.widget.TextView textView2 = this.E;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        java.util.List list3 = this.H;
                        objArr2[0] = java.lang.Integer.valueOf(list3 != null ? list3.size() : 0);
                        textView2.setText(getString(com.tencent.mm.R.string.g_e, objArr2));
                    } else {
                        android.widget.TextView textView3 = this.E;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        java.util.List list4 = this.H;
                        objArr3[0] = java.lang.Integer.valueOf(list4 != null ? list4.size() : 0);
                        textView3.setText(getString(com.tencent.mm.R.string.g_d, objArr3));
                    }
                }
                p7();
                java.util.List list5 = this.H;
                if (list5 == null || list5.size() <= this.W.c()) {
                    this.f72508n = false;
                } else {
                    this.f72508n = true;
                }
                double F = com.tencent.mm.sdk.platformtools.t8.F(this.D.getText(), 0.0d);
                if (this.H == null || (F * 100.0d) / r0.size() <= this.W.b()) {
                    this.f72509o = false;
                } else {
                    this.f72509o = true;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 2);
                }
                K7();
                J7();
                I7();
                return;
            }
            return;
        }
        if (i17 == 330) {
            if (i18 == -1 && t7() && this.f72504h == 3 && this.f72505i == 4) {
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    java.lang.String[] split2 = stringExtra2.split(",");
                    ((java.util.ArrayList) this.H1).clear();
                    ((java.util.ArrayList) this.H1).addAll(java.util.Arrays.asList(split2));
                }
                java.util.List n77 = n7();
                java.util.List list6 = this.H1;
                if (list6 != null && ((java.util.ArrayList) list6).size() == ((java.util.ArrayList) n77).size() && com.tencent.mm.storage.z3.R4(this.f72507m)) {
                    android.widget.TextView textView4 = this.J1;
                    java.lang.Object[] objArr4 = new java.lang.Object[2];
                    objArr4[0] = java.lang.Integer.valueOf(((java.util.ArrayList) n7()).size());
                    java.util.List list7 = this.H1;
                    objArr4[1] = java.lang.Integer.valueOf(list7 != null ? ((java.util.ArrayList) list7).size() : 0);
                    textView4.setText(getString(com.tencent.mm.R.string.g_c, objArr4));
                } else {
                    android.widget.TextView textView5 = this.J1;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    java.util.List list8 = this.H1;
                    objArr5[0] = java.lang.Integer.valueOf(list8 != null ? ((java.util.ArrayList) list8).size() : 0);
                    textView5.setText(getString(com.tencent.mm.R.string.g_h, objArr5));
                }
                p7();
                java.util.List list9 = this.H1;
                if (list9 == null || ((java.util.ArrayList) list9).size() <= this.W.c()) {
                    this.f72508n = false;
                } else {
                    this.f72508n = true;
                }
                double F2 = com.tencent.mm.sdk.platformtools.t8.F(this.D.getText(), 0.0d);
                if (this.H1 == null || (F2 * 100.0d) / ((java.util.ArrayList) r0).size() <= this.W.b()) {
                    this.f72509o = false;
                } else {
                    this.f72509o = true;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 2);
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
                    com.tencent.mars.xlog.Log.e("MicroMsg.Aa.LaunchAAUI", "onActivityResult, SELECT_AMOUNT_SELECT_REQUEST_CODE error: %s", e17.getMessage());
                    return;
                }
            }
            return;
        }
        if (i17 != 300) {
            if (i17 == 310) {
                if (i18 == -1) {
                    this.f72506l1 = 2;
                    this.f72522x1 = "";
                    this.A.setVisibility(8);
                    this.f72523y.setVisibility(0);
                    this.f72526z.setVisibility(0);
                    f7(7);
                }
                if (this.A.getVisibility() == 0) {
                    this.f72520x.setClickable(false);
                    return;
                } else {
                    this.f72520x.setClickable(true);
                    return;
                }
            }
            return;
        }
        if (i18 == -1 && intent != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_image_list");
            if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                java.lang.String b17 = com.tencent.mm.ui.tools.i1.b(this, intent, g83.a.a());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    this.f72522x1 = b17;
                }
            } else {
                this.f72522x1 = stringArrayListExtra.get(0);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f72522x1)) {
                this.f72506l1 = 2;
                this.A.setVisibility(0);
                this.f72523y.setVisibility(8);
                this.f72526z.setVisibility(8);
                com.tencent.mm.graphics.e.c(this.f72522x1);
                this.A.post(new com.tencent.mm.plugin.aa.ui.u4(this));
                f7(8);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "SELECT_IMAGE_REQUEST_CODE imagePath:%s", this.f72522x1);
        }
        if (this.A.getVisibility() == 0) {
            this.f72520x.setClickable(false);
        } else {
            this.f72520x.setClickable(true);
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
    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.aa.ui.LaunchAAUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.sdk.event.IListener iListener;
        super.onDestroy();
        if (k7() && (iListener = this.K1) != null) {
            iListener.dead();
        }
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.aa.ui.LaunchAAUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.aa.ui.LaunchAAUIC.class)).f72533h.dead();
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.L1;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.tools.f5 f5Var = this.L1;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        java.util.Map map = this.S;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.ui.tools.f5 f5Var = this.L1;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    public final void p7() {
        this.X = false;
        if (this.V.getVisibility() != 8) {
            this.V.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477834cs));
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
            hashMap.put(split[0], java.lang.Double.valueOf(com.tencent.mm.sdk.platformtools.t8.F(split[1], 0.0d)));
        }
    }

    public final void s7() {
        java.lang.String string = this.f72504h == 3 ? this.f72505i == 4 ? getString(com.tencent.mm.R.string.gal) : getString(com.tencent.mm.R.string.gak) : getString(com.tencent.mm.R.string.gaj);
        com.tencent.mm.ui.bk.r0(this.B.getPaint(), 0.8f);
        this.B.setText(string);
        int i17 = com.tencent.mm.ui.bl.b(getContext()).x;
        int b17 = i65.a.b(getContext(), 20);
        android.widget.ImageView imageView = this.f72518v;
        if (imageView != null) {
            b17 = imageView.getWidth();
        }
        this.B.setMaxWidth((i17 - i65.a.b(getContext(), 114)) - b17);
        this.f72517u.setContentDescription(getString(com.tencent.mm.R.string.gam) + ((java.lang.Object) this.B.getText()));
        this.f72517u.setClickable(true);
        this.f72517u.setOnClickListener(new com.tencent.mm.plugin.aa.ui.s3(this));
        this.f72517u.post(new com.tencent.mm.plugin.aa.ui.t3(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(h61.b.class);
        hashSet.add(com.tencent.mm.plugin.aa.ui.LaunchAAUIC.class);
    }

    public final boolean t7() {
        return this.D1 == 1;
    }

    public final void u7(android.content.Context context, java.lang.String str, boolean z17, java.util.ArrayList arrayList) {
        java.util.List list;
        int size;
        double F;
        int i17;
        com.tencent.mm.plugin.report.service.g0 g0Var;
        f7(9);
        if (this.f72504h != 2) {
            p7();
            android.app.Dialog dialog = this.U;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.U = com.tencent.mm.wallet_core.ui.b2.e(context, false, false, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f72522x1)) {
                if (this.f72506l1 == 2 && y7(this.f72522x1) && com.tencent.mm.vfs.w6.j(l7())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "set local imagePath :%s", l7());
                    this.f72522x1 = l7();
                }
                new h61.h(this.f72522x1, new com.tencent.mm.plugin.aa.ui.g4(this, context, str, z17, arrayList)).a();
                return;
            }
            if (this.f72505i != 4) {
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.D.getText()) || (list = this.H) == null || list.size() == 0) {
            return;
        }
        p7();
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.d(13721, 2, 3);
        try {
            if (z17) {
                size = arrayList != null ? arrayList.size() : 0;
                F = com.tencent.mm.sdk.platformtools.t8.F(this.f72514r.getText().toString(), 0.0d) * size;
            } else {
                java.util.List list2 = this.H;
                size = list2 != null ? list2.size() : 0;
                F = com.tencent.mm.sdk.platformtools.t8.F(this.D.getText(), 0.0d);
            }
            int i18 = size;
            double d17 = F;
            java.lang.String obj = this.f72510p.getText().toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                obj = getString(com.tencent.mm.R.string.g_z);
            }
            java.lang.String str2 = obj;
            if (i18 > 0) {
                android.app.Dialog dialog2 = this.U;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                this.U = com.tencent.mm.wallet_core.ui.b2.e(context, false, false, null);
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f72522x1)) {
                    i17 = 1;
                    g0Var = g0Var2;
                    if (z17) {
                        v7(context, str, i18, str2, d17, arrayList, "", "");
                    } else {
                        v7(context, str, i18, str2, d17, this.H, "", "");
                    }
                } else {
                    if (this.f72506l1 == 2 && y7(this.f72522x1) && com.tencent.mm.vfs.w6.j(l7())) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "set local imagePath :%s", l7());
                        this.f72522x1 = l7();
                    }
                    i17 = 1;
                    g0Var = g0Var2;
                    new h61.h(this.f72522x1, new com.tencent.mm.plugin.aa.ui.d4(this, z17, context, str, i18, str2, d17, arrayList)).a();
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
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.LaunchAAUI", "launchAAByMoney mode: %s error: %s", java.lang.Integer.valueOf(this.f72504h), e17.getMessage());
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.aa.ui.LaunchAAUI.v7(android.content.Context, java.lang.String, int, java.lang.String, double, java.util.List, java.lang.String, java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.tools.c5
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
        this.P1.postDelayed(new com.tencent.mm.plugin.aa.ui.h5(this), 50L);
    }

    public final void w7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.util.List list) {
        java.util.Iterator it;
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 7, 5);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 3, 3);
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String obj = this.f72510p.getText().toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                obj = getString(com.tencent.mm.R.string.g_z);
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
                oVar.f381785e = com.tencent.mm.wallet_core.ui.r1.j0(java.lang.String.valueOf(doubleValue), "100");
                oVar.f381784d = str4;
                arrayList.add(oVar);
                j17 += oVar.f381785e;
                arrayList2.add("" + oVar.f381785e);
                hashMap2.put(oVar.f381784d, oVar);
                map = map;
                it6 = it6;
            }
            r45.o oVar2 = new r45.o();
            oVar2.f381784d = c01.z1.r();
            oVar2.f381785e = j17;
            hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, obj);
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
            hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.Y));
            hashMap.put("pic_cdn_url", str2);
            hashMap.put("pic_cdn_thumb_url", str3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f72522x1)) {
                hashMap.put("pic_cdn_md5", kk.k.e(this.f72522x1));
            }
            if (k7()) {
                hashMap.put("pf_order_no", this.f72527z1);
            }
            k61.l lVar = this.f72503g.f304505c;
            lVar.getClass();
            ((km5.q) ((km5.q) km5.u.e(hashMap)).n(lVar).h(new com.tencent.mm.plugin.aa.ui.o4(this, str, context))).s(new com.tencent.mm.plugin.aa.ui.n4(this, context));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13723, 2, java.lang.Integer.valueOf(((java.util.ArrayList) n7()).size()), java.lang.Integer.valueOf(arrayList.size() + 1), java.lang.Long.valueOf(j17), obj, com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ","));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.LaunchAAUI", "launchAAByPerson error: %s", e17.getMessage());
        }
    }

    public final void x7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "launchAAByPersonCustomize");
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 7, 5);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 8, 2);
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String obj = this.f72510p.getText().toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                obj = getString(com.tencent.mm.R.string.g_z);
            }
            hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, obj);
            hashMap.put("chatRoomName", str);
            hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.Y));
            hashMap.put("pic_cdn_url", str2);
            hashMap.put("pic_cdn_thumb_url", str3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f72522x1)) {
                hashMap.put("pic_cdn_md5", kk.k.e(this.f72522x1));
            }
            if (k7()) {
                hashMap.put("pf_order_no", this.f72527z1);
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
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.aa.ui.LaunchAAUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.aa.ui.LaunchAAUIC.class)).O6(size);
            k61.k kVar = this.f72503g.f304506d;
            kVar.getClass();
            ((km5.q) ((km5.q) km5.u.e(hashMap)).n(kVar).h(new com.tencent.mm.plugin.aa.ui.t4(this, str, context))).s(new com.tencent.mm.plugin.aa.ui.s4(this, context));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.LaunchAAUI", "launchAAByPersonCustomize error: %s", e17.getMessage());
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
            com.tencent.mm.sdk.platformtools.x.J(str, options);
            options2 = new android.graphics.BitmapFactory.Options();
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "bitmap width： %s , height： %s", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
            i17 = options.outWidth;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Aa.LaunchAAUI", "decode file to bitmap error! " + e17.getMessage());
        }
        if (i17 > 4 && (i18 = options.outHeight) > 4) {
            if (i17 * i18 < 5242880) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "dont handle：sizeOption.outWidth * sizeOption.outHeight * 2 < MAX_BITMAP_SIZE");
                return false;
            }
            int ceil = (int) java.lang.Math.ceil((i17 * i18) / 5242880);
            options2.inSampleSize = ceil;
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "need handle：bitmap too large sample:%s", java.lang.Integer.valueOf(ceil));
            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(com.tencent.mm.sdk.platformtools.x.J(str, options2), com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree());
            if (com.tencent.mm.vfs.w6.j(l7())) {
                com.tencent.mm.vfs.w6.h(l7());
            }
            com.tencent.mm.sdk.platformtools.x.D0(w07, 80, android.graphics.Bitmap.CompressFormat.JPEG, l7(), true);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "dont handle：sizeOption.outWidth <= MIN_IMAGE_SIZE || sizeOption.outHeight <= MIN_IMAGE_SIZE");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    public final void z7() {
        ?? arrayList;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.Z)) {
            this.D.setText("");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "default amount: %s", this.Z);
        }
        this.D.b(new com.tencent.mm.plugin.aa.ui.x3(this));
        setEditFocusListener(this.D, 2, false, true);
        this.D.setmContentAbnormalMoneyCheck(true);
        if (k7()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.HashMap) this.R).keySet().iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) it.next());
            }
            this.E.setText(getString(com.tencent.mm.R.string.g_h, java.lang.Integer.valueOf(arrayList2.size())));
            this.H = arrayList2;
        } else {
            if (!com.tencent.mm.storage.z3.R4(this.f72507m)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "is single chat: %s", this.f72507m);
                arrayList = new java.util.ArrayList();
                arrayList.add(c01.z1.r());
                arrayList.add(this.f72507m);
            } else if (c01.e2.R(this.f72507m)) {
                arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = (java.util.ArrayList) n7();
                if (arrayList3.size() > 0) {
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str = (java.lang.String) it6.next();
                        if (!com.tencent.mm.storage.z3.m4(str)) {
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
                this.E.setText(getString(com.tencent.mm.R.string.hgk));
                K7();
            } else if (!com.tencent.mm.storage.z3.R4(this.f72507m)) {
                this.E.setText(getString(com.tencent.mm.R.string.g_h, java.lang.Integer.valueOf(arrayList.size())));
            } else if (c01.e2.R(this.f72507m)) {
                this.E.setText(getString(com.tencent.mm.R.string.g_h, java.lang.Integer.valueOf(arrayList.size())));
            } else if (t7()) {
                int size = m7(false).size();
                if (size == arrayList.size()) {
                    this.E.setText(getString(com.tencent.mm.R.string.g_e, java.lang.Integer.valueOf(arrayList.size())));
                } else {
                    this.E.setText(getString(com.tencent.mm.R.string.g_h, java.lang.Integer.valueOf(size)));
                }
            } else {
                this.E.setText(getString(com.tencent.mm.R.string.g_d, java.lang.Integer.valueOf(arrayList.size())));
            }
        }
        this.F.setOnClickListener(new com.tencent.mm.plugin.aa.ui.y3(this));
        this.f72508n = false;
    }
}
