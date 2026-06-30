package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui;

@db5.a(m123858x6ac9171 = 0)
@gm0.a2
/* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI */
/* loaded from: classes15.dex */
public class ActivityC13149x63b02cb3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements ww1.u, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7, android.text.TextWatcher {
    public static int Q;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 A;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 D;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 E;
    public android.view.View F;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 G;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f177967J;
    public boolean K;
    public boolean L;
    public int M;

    /* renamed from: e, reason: collision with root package name */
    public ww1.a3 f177969e;

    /* renamed from: f, reason: collision with root package name */
    public ww1.a3 f177970f;

    /* renamed from: g, reason: collision with root package name */
    public ww1.b3 f177971g;

    /* renamed from: h, reason: collision with root package name */
    public ww1.b3 f177972h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f177973i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f177974m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f177975n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f177976o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f177977p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f177978q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f177979r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f177980s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f177981t;

    /* renamed from: v, reason: collision with root package name */
    public zw1.f6 f177983v;

    /* renamed from: w, reason: collision with root package name */
    public zw1.c6 f177984w;

    /* renamed from: x, reason: collision with root package name */
    public long f177985x;

    /* renamed from: y, reason: collision with root package name */
    public android.os.Vibrator f177986y;

    /* renamed from: z, reason: collision with root package name */
    public long f177987z;

    /* renamed from: d, reason: collision with root package name */
    public int f177968d = 1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f177982u = false;
    public int N = 1;
    public final y60.e P = new zw1.b4(this);

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, int i17) {
        if (i17 == 0) {
            i17 = activityC13149x63b02cb3.f177968d;
        }
        ww1.a3 l76 = activityC13149x63b02cb3.l7(i17);
        if (activityC13149x63b02cb3.m7(i17).f531671j.getHeight() != 0) {
            l76.f531648y = r1.f531671j.getHeight();
        } else {
            l76.f531648y = Q;
        }
    }

    public static boolean W6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, int i17) {
        if (i17 == 0) {
            i17 = activityC13149x63b02cb3.f177968d;
        } else {
            activityC13149x63b02cb3.getClass();
        }
        if (i17 == 1) {
            return tw1.f.Di().Ri();
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            return false;
        }
        tw1.f.Di().getClass();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_F2F_RING_TONE_MCH_STRING, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCollect", "isF2fRingToneOpenMch : %s ", str);
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals("cash.caf");
    }

    public static void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13149x63b02cb3.mo55332x76847179());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = activityC13149x63b02cb3.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
        }
        u1Var.g(str);
        u1Var.l(new zw1.o5(activityC13149x63b02cb3));
        u1Var.n(activityC13149x63b02cb3.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6));
        u1Var.q(false);
    }

    public static void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, java.lang.String str, java.lang.String str2, int i17, r45.jv3 jv3Var, r45.o90 o90Var, int i18, r45.nu5 nu5Var, r45.mu5 mu5Var) {
        android.graphics.Bitmap d76;
        int i19 = i18 == 0 ? activityC13149x63b02cb3.f177968d : i18;
        ww1.a3 l76 = activityC13149x63b02cb3.l7(i19);
        l76.getClass();
        l76.f531643t = i17;
        l76.Q = jv3Var;
        l76.O = false;
        boolean w76 = activityC13149x63b02cb3.w7(l76.f531634k, l76.f531636m, l76.f531638o, l76.f531637n);
        r45.bj4 t76 = activityC13149x63b02cb3.t7(l76.V, java.lang.Long.valueOf(l76.U));
        java.lang.String str3 = t76 != null ? t76.f452339f : "";
        if (!l76.T || i19 != 2) {
            str3 = l76.R;
        }
        if (w76) {
            l76.f531642s = str;
            d76 = activityC13149x63b02cb3.d7(i19, str, str3, l76.f531643t);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11343, 1, java.lang.Integer.valueOf((int) java.lang.Math.round(l76.f531634k * 100.0d)));
        } else {
            l76.f531641r = str;
            d76 = activityC13149x63b02cb3.d7(i19, str, str3, l76.f531643t);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11343, 0);
        }
        if (d76 == null || d76.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "【mSaveQrcodeBitmap == null");
            dp.a.m125854x26a183b(activityC13149x63b02cb3.mo55332x76847179(), activityC13149x63b02cb3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_v), 1).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 17, java.lang.Integer.valueOf(i19));
            return;
        }
        if (!activityC13149x63b02cb3.f177982u) {
            activityC13149x63b02cb3.f177982u = true;
            activityC13149x63b02cb3.f177981t = ((android.view.ViewStub) activityC13149x63b02cb3.findViewById(com.p314xaae8f345.mm.R.id.c5m)).inflate();
        }
        android.view.View view = activityC13149x63b02cb3.f177981t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "saveQrcodeToLocal", "(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/HalfPage;Lcom/tencent/mm/protocal/protobuf/CoverInfo;ILcom/tencent/mm/protocal/protobuf/SaveSuccJumpInfo;Lcom/tencent/mm/protocal/protobuf/SaveQrcodeSuccJumpInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "saveQrcodeToLocal", "(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/HalfPage;Lcom/tencent/mm/protocal/protobuf/CoverInfo;ILcom/tencent/mm/protocal/protobuf/SaveSuccJumpInfo;Lcom/tencent/mm/protocal/protobuf/SaveQrcodeSuccJumpInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5f)).setImageBitmap(d76);
        android.widget.TextView textView = (android.widget.TextView) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5i);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5j);
        android.widget.ImageView imageView = (android.widget.ImageView) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5k);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5e);
        android.widget.TextView textView2 = (android.widget.TextView) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5b);
        android.widget.TextView textView3 = (android.widget.TextView) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5c);
        android.widget.TextView textView4 = (android.widget.TextView) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5h);
        android.widget.TextView textView5 = (android.widget.TextView) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c5d);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) activityC13149x63b02cb3.f177981t.findViewById(com.p314xaae8f345.mm.R.id.c4u);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.text.SpannableStringBuilder u76 = activityC13149x63b02cb3.u7(i19);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13149x63b02cb3, u76, textSize));
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView);
        textView.setTextSize(1, 17.0f);
        textView3.setTextSize(1, 13.0f);
        textView4.setTextSize(1, 13.0f);
        textView5.setTextSize(1, 24.0f);
        textView2.setTextSize(1, 24.0f);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams.width = i65.a.b(activityC13149x63b02cb3.mo55332x76847179(), 176);
        layoutParams.height = i65.a.b(activityC13149x63b02cb3.mo55332x76847179(), 176);
        if (l76.f531634k <= 0.0d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13149x63b02cb3.r7(i19))) {
            layoutParams.topMargin = i65.a.b(activityC13149x63b02cb3.mo55332x76847179(), 16);
        } else {
            layoutParams.topMargin = i65.a.b(activityC13149x63b02cb3.mo55332x76847179(), 12);
        }
        relativeLayout2.setLayoutParams(layoutParams);
        activityC13149x63b02cb3.E7(i19, textView3);
        activityC13149x63b02cb3.F7(i19, textView4);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams2.topMargin = i65.a.b(activityC13149x63b02cb3, 16);
        relativeLayout2.setLayoutParams(layoutParams2);
        if (l76.f531634k > 0.0d) {
            relativeLayout.setVisibility(0);
            textView5.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(l76.f531634k));
            textView2.setText(activityC13149x63b02cb3.n7(0));
            if (textView3.getVisibility() == 0 && textView.getLineCount() >= 2) {
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams3.bottomMargin = i65.a.b(activityC13149x63b02cb3, 24);
                imageView.setLayoutParams(layoutParams3);
            }
        } else {
            relativeLayout.setVisibility(8);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams4.bottomMargin = i65.a.b(activityC13149x63b02cb3, 32);
            imageView.setLayoutParams(layoutParams4);
        }
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(activityC13149x63b02cb3, new zw1.g4(activityC13149x63b02cb3, linearLayout, l76, o90Var, i19, mu5Var, nu5Var, i19), new zw1.h4(activityC13149x63b02cb3, i19));
    }

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, android.content.Context context, java.lang.String str, int i17, r45.o90 o90Var) {
        activityC13149x63b02cb3.getClass();
        android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(context, "", 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2)).setImageResource(i17);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(str);
        m125854x26a183b.setGravity(17, 0, 0);
        m125854x26a183b.setView(inflate);
        m125854x26a183b.show();
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new zw1.n5(activityC13149x63b02cb3, m125854x26a183b, o90Var), 750L);
    }

    public static void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, r45.nu5 nu5Var, ww1.a3 a3Var) {
        activityC13149x63b02cb3.getClass();
        boolean z17 = nu5Var != null ? nu5Var.f463219d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "isNavigateToBusinessQRCodePage: " + z17);
        if (z17) {
            java.lang.String c17 = zw1.n6.c(a3Var);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13149x63b02cb3.mo55332x76847179();
            if (nu5Var == null || mo55332x76847179 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "navigateToBusinessQRCodePage: saveSuccJumpInfo or context is null");
                return;
            }
            r45.uk4 uk4Var = nu5Var.f463220e;
            if ((uk4Var != null ? uk4Var.f468968h : null) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "navigateToBusinessQRCodePage: waapp_path is null");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("navigateToBusinessAccountQRCodePage - username: ");
            r45.uk4 uk4Var2 = nu5Var.f463220e;
            sb6.append(uk4Var2 != null ? uk4Var2.f468967g : null);
            sb6.append(", path: ");
            r45.uk4 uk4Var3 = nu5Var.f463220e;
            sb6.append(uk4Var3 != null ? uk4Var3.f468968h : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", sb6.toString());
            l81.b1 b1Var = new l81.b1();
            r45.uk4 uk4Var4 = nu5Var.f463220e;
            b1Var.f398545a = uk4Var4 != null ? uk4Var4.f468967g : null;
            b1Var.f398555f = uk4Var4 != null ? uk4Var4.f468968h : null;
            b1Var.f398565k = 1001;
            b1Var.f398561i = new zw1.g6(c17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
            if (h6Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(mo55332x76847179, b1Var);
                return;
            }
            return;
        }
        r45.jv3 jv3Var = a3Var.Q;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC13149x63b02cb3);
        activityC13149x63b02cb3.G = y1Var;
        y1Var.f293560f.setFocusable(false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(activityC13149x63b02cb3).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570179zg, (android.view.ViewGroup) null);
        activityC13149x63b02cb3.G.k(linearLayout);
        android.widget.Button button = (android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.b1e);
        android.widget.Button button2 = (android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.b0e);
        android.widget.Button button3 = (android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.b0f);
        r45.wf5 wf5Var = jv3Var.f459658f;
        if (wf5Var != null) {
            button2.setText(wf5Var.f470668d);
            button3.setText(jv3Var.f459659g.f470668d);
            button2.setOnClickListener(new zw1.y4(activityC13149x63b02cb3, jv3Var));
            button3.setOnClickListener(new zw1.z4(activityC13149x63b02cb3, jv3Var));
        } else {
            button2.setVisibility(8);
            button3.setVisibility(8);
            button.setText(jv3Var.f459659g.f470668d);
            button.setVisibility(0);
            button.setOnClickListener(new zw1.a5(activityC13149x63b02cb3, jv3Var));
        }
        ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.nrq)).setText(jv3Var.f459656d.f468112e);
        if (jv3Var.f459660h == 0) {
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.nrp);
            textView.setVisibility(0);
            textView.setText(jv3Var.f459657e);
        } else {
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.nrr);
            linearLayout2.setGravity(3);
            java.util.Iterator it = jv3Var.f459661i.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) android.view.LayoutInflater.from(activityC13149x63b02cb3).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570178zf, (android.view.ViewGroup) null);
                ((android.widget.TextView) linearLayout3.findViewById(com.p314xaae8f345.mm.R.id.c3g)).setText(str);
                linearLayout2.addView(linearLayout3);
            }
        }
        activityC13149x63b02cb3.G.s();
    }

    public static void b7(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, int i17) {
        if (i17 == 2) {
            activityC13149x63b02cb3.f177968d = 2;
            activityC13149x63b02cb3.f177972h.f531670i.setVisibility(0);
            activityC13149x63b02cb3.f177972h.f531658c.post(new zw1.e5(activityC13149x63b02cb3));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 2, java.lang.Integer.valueOf(i17));
        } else {
            activityC13149x63b02cb3.f177968d = 1;
            activityC13149x63b02cb3.f177971g.f531670i.setVisibility(0);
            activityC13149x63b02cb3.f177971g.f531658c.post(new zw1.p5(activityC13149x63b02cb3));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 1, java.lang.Integer.valueOf(i17));
        }
        activityC13149x63b02cb3.h7(i17, false);
    }

    public static void c7(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.b3 b3Var) {
        activityC13149x63b02cb3.getClass();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(270.0f, 90.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new zw1.u5(activityC13149x63b02cb3, b3Var));
        ofFloat.start();
        b3Var.f531655a0.setVisibility(8);
        b3Var.f531658c.callOnClick();
    }

    public final void A7(int i17) {
        this.f177971g.f531656b.setVisibility(i17);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f177971g.f531673l.getLayoutParams();
        layoutParams.topMargin = i65.a.b(this, i17 == 0 ? 32 : 64);
        this.f177971g.f531673l.setLayoutParams(layoutParams);
        if (i17 != 8) {
            this.f177971g.f531670i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562814pd);
            this.f177971g.f531671j.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562814pd);
            this.f177971g.f531672k.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562814pd);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f177971g.f531670i.getLayoutParams();
            layoutParams2.height = -2;
            this.f177971g.f531670i.setLayoutParams(layoutParams2);
            this.f177971g.f531670i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562805p4);
            this.f177971g.f531671j.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562805p4);
            this.f177971g.f531672k.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562805p4);
        }
    }

    public final void B7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        ((ku5.t0) ku5.t0.f394148d).B(new zw1.k4(this, l76, i17, m76));
    }

    public final void C7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l7(i17).f531621a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUI", "[refreshView], qrcode_url is null.");
            return;
        }
        B7(i17);
        int i18 = i17 == 0 ? this.f177968d : i17;
        ww1.a3 l76 = l7(i18);
        ww1.b3 m76 = m7(i18);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_n);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(m76.f531683v, string, 0, string.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0(6, new zw1.r3(this, l76, i18)), mo55332x76847179());
        I7(i17);
        H7(i17);
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l77 = l7(i17);
        ww1.b3 m77 = m7(i17);
        r45.uk4 uk4Var = l77.f531631h;
        android.widget.LinearLayout linearLayout = m77.C;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = m77.D;
        android.widget.TextView textView = m77.E;
        android.widget.TextView textView2 = m77.F;
        android.widget.ImageView imageView = m77.G;
        if (uk4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk4Var.f468965e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "empty item return");
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c19659x677e0913.setVisibility(8);
            textView.setText(uk4Var.f468965e);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk4Var.f468969i)) {
                textView2.setVisibility(4);
            } else {
                textView2.setText(uk4Var.f468969i);
                textView2.setVisibility(0);
            }
            if (uk4Var.f468970m == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            linearLayout.setOnClickListener(new zw1.l4(this, uk4Var, textView2, imageView));
            int i19 = uk4Var.f468964d;
            if (i19 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(14526, 1, 1, uk4Var.f468965e, "", "", "", 1);
                if (uk4Var.f468970m == 1) {
                    g0Var.d(14526, 3, 1, uk4Var.f468965e, "", "", "", 1);
                }
            } else if (i19 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.d(14526, 1, 2, uk4Var.f468965e, "", "", uk4Var.f468966f, 1);
                if (uk4Var.f468970m == 1) {
                    g0Var2.d(14526, 3, 2, uk4Var.f468965e, "", "", uk4Var.f468966f, 1);
                }
            } else if (i19 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var3.d(14526, 1, 3, uk4Var.f468965e, uk4Var.f468967g, uk4Var.f468968h, "", 1);
                if (uk4Var.f468970m == 1) {
                    g0Var3.d(14526, 3, 3, uk4Var.f468965e, uk4Var.f468967g, uk4Var.f468968h, "", 1);
                }
            }
        }
        if (this.f177969e != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((zw1.n2) pf5.z.f435481a.a(activity).a(zw1.n2.class)).Q6(this.f177968d, this.f177972h, this.f177977p, this.f177969e.K);
        }
        ww1.a3 l78 = l7(0);
        r45.r1 c17 = at4.g0.c();
        int i27 = l78.f531634k > 0.0d ? 33 : 32;
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13447, java.lang.Integer.valueOf(i27), c17.f465945i, c17.f465946m, l78.f531621a, java.lang.Double.valueOf(l78.f531634k), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), java.lang.Long.valueOf(c17.f465944h), c17.f465947n, c17.f465948o);
        }
    }

    public void D7(ww1.a3 a3Var) {
        a3Var.f531632i = "";
        a3Var.f531634k = 0.0d;
        a3Var.f531636m = "";
        a3Var.f531637n = "";
        a3Var.f531638o = false;
        a3Var.f531633j = null;
    }

    @Override // ww1.u
    public void E4(ww1.g2 g2Var) {
        java.util.List list;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onRecv PayerMsg]，newMsg.msgType：%s", java.lang.Integer.valueOf(g2Var.f531737p));
        int i17 = g2Var.f531737p;
        if (i17 != 9 && i17 != 50) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "not target type");
            return;
        }
        boolean z18 = true;
        int i18 = i17 == 50 ? 2 : 1;
        ww1.a3 l76 = l7(i18);
        ww1.b3 m76 = m7(i18);
        android.os.Vibrator vibrator = this.f177986y;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
        if (g2Var.f531732h < this.f177985x) {
            return;
        }
        int i19 = 0;
        while (true) {
            int size = ((java.util.LinkedList) l76.f531646w).size();
            list = l76.f531646w;
            if (i19 >= size) {
                z17 = false;
                break;
            }
            if (g2Var.f531734m == 0) {
                java.lang.String str = g2Var.f531728d;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                if (str.equals(((ww1.b0) ((java.util.LinkedList) list).get(i19)).f531728d) && ((ww1.b0) ((java.util.LinkedList) list).get(i19)).f531734m == 2) {
                    ((java.util.LinkedList) list).remove(i19);
                    ((java.util.LinkedList) list).add(i19, new ww1.b0(g2Var));
                    break;
                }
            }
            if (!g2Var.f531729e.equals(((ww1.b0) ((java.util.LinkedList) list).get(i19)).f531729e)) {
                i19++;
            } else if (((ww1.b0) ((java.util.LinkedList) list).get(i19)).f531734m == 0) {
                ((ww1.b0) ((java.util.LinkedList) list).get(i19)).f531734m = g2Var.f531734m;
                ((ww1.b0) ((java.util.LinkedList) list).get(i19)).f531730f = g2Var.f531730f;
                ((ww1.b0) ((java.util.LinkedList) list).get(i19)).f531731g = g2Var.f531731g;
                if (g2Var.f531734m == 1) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new zw1.n4(this, m76, l76, i19));
                }
            }
        }
        z17 = true;
        if (!z17) {
            int i27 = 0;
            while (true) {
                if (i27 >= ((java.util.LinkedList) list).size()) {
                    z18 = false;
                    break;
                }
                if (g2Var.f531732h > ((ww1.g2) ((java.util.LinkedList) list).get(i27)).f531732h) {
                    ((java.util.LinkedList) list).add(i27, new ww1.b0(g2Var));
                    break;
                }
                i27++;
            }
            if (!z18) {
                ((java.util.LinkedList) list).add(new ww1.b0(g2Var));
            }
        }
        if (l76.f531647x == null) {
            ww1.c0 c0Var = new ww1.c0(mo55332x76847179(), i18);
            l76.f531647x = c0Var;
            m76.M.mo7960x6cab2c8d(c0Var);
        }
        l76.f531647x.f531694e = list;
        m76.N.f531878d = l76;
        if (((java.util.LinkedList) list).size() > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new zw1.o4(this, m76, i18));
        }
    }

    public final void E7(int i17, android.widget.TextView textView) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l76.f531636m)) {
            textView.setVisibility(8);
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        java.lang.String str = l76.f531636m;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize));
        textView.setVisibility(0);
    }

    public final void F7(int i17, android.widget.TextView textView) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        java.lang.String str = l76.f531637n;
        if (l76.f531638o && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_h);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize));
        textView.setVisibility(0);
    }

    public final void G7(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "setMoneyResult");
        int intExtra = intent.getIntExtra("key_type", this.f177968d);
        ww1.a3 l76 = l7(intExtra);
        double j17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j("" + intent.getIntExtra("ftf_fixed_fee", 0), "100", 2, java.math.RoundingMode.HALF_UP);
        java.lang.String stringExtra = intent.getStringExtra("ftf_fixed_desc");
        java.lang.String stringExtra2 = intent.getStringExtra("ftf_fixed_desc_placeholder");
        boolean booleanExtra = intent.getBooleanExtra("ftf_fixed_desc_required", false);
        if (w7(j17, stringExtra, booleanExtra, stringExtra2)) {
            l76.f531632i = intent.getStringExtra("ftf_pay_url");
            l76.f531639p = intent.getIntExtra("key_error_level", -1);
            l76.f531634k = j17;
            l76.f531635l = intent.getStringExtra("ftf_fixed_fee_type");
            l76.f531640q = intent.getStringExtra("key_currency_unit");
            l76.f531636m = stringExtra;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 4, java.lang.Integer.valueOf(intExtra));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 5, java.lang.Integer.valueOf(intExtra));
            }
            l76.f531637n = stringExtra2;
            l76.f531638o = booleanExtra;
            if (intExtra == 2) {
                java.lang.String stringExtra3 = intent.getStringExtra("key_save_notify_info");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                    l76.f531633j = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(stringExtra3.getBytes());
                }
            }
            l76.E = java.lang.System.currentTimeMillis();
        } else {
            l76.f531621a = intent.getStringExtra("ftf_pay_url");
            l76.f531627d = intent.getIntExtra("key_error_level", -1);
            l76.D = java.lang.System.currentTimeMillis();
            if (intExtra == 2) {
                java.lang.String stringExtra4 = intent.getStringExtra("key_save_notify_info");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
                    l76.f531623b = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(stringExtra4.getBytes());
                }
            }
            D7(l76);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "setMoneyResult，url：%s，fee：%s ，desc：%s ，desc：placeholder：%s", l76.f531632i, java.lang.Double.valueOf(l76.f531634k), l76.f531636m, l76.f531637n);
        if (!l76.L) {
            int i17 = intExtra == 0 ? this.f177968d : intExtra;
            ww1.a3 l77 = l7(i17);
            ww1.b3 m76 = m7(i17);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_8);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(m76.f531684w, string, 0, string.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0(6, new zw1.u3(this, l77, i17)), mo55332x76847179());
        }
        O7(intExtra);
    }

    public final void H7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        java.util.LinkedList<r45.uk4> linkedList = l76.f531630g;
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "menuItems == null");
            return;
        }
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_b);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(m76.f531685x, string, 0, string.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0(6, new zw1.x3(this, i17, linkedList)), mo55332x76847179());
        for (r45.uk4 uk4Var : linkedList) {
            int i18 = uk4Var.f468964d;
            if (i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14526, 2, 1, uk4Var.f468965e, "", "", "", 1);
            } else if (i18 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14526, 2, 2, uk4Var.f468965e, "", "", uk4Var.f468966f, 1);
            } else if (i18 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14526, 2, 3, uk4Var.f468965e, uk4Var.f468967g, uk4Var.f468968h, "", 1);
            }
        }
    }

    public final void I7(int i17) {
        java.lang.String string;
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l76.M)) {
            string = l76.L ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_9) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_7);
            r45.hk5 hk5Var = l76.f531626c0;
            if (hk5Var != null && hk5Var.f457780d) {
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_9);
            }
        } else {
            string = l76.M;
        }
        java.lang.String str = string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[setSetMoneyTv]，needRefreshType：%s, receive_option_entrance:%s ", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(l76.L));
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(m76.f531684w, str, 0, str.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0(6, new zw1.s3(this, i17, l76)), mo55332x76847179());
    }

    public final boolean J7() {
        ww1.a3 a3Var = this.f177970f;
        return (a3Var == null || a3Var.S != 5 || a3Var.Z == null) ? false : true;
    }

    public final void K7(r45.vf5 vf5Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var;
        if (vf5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "actionInfo is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "actionInfo.action_type：%s", java.lang.Integer.valueOf(vf5Var.f469720d));
        int i17 = vf5Var.f469720d;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 == 2) {
                    L7(vf5Var.f469722f, 0, false, null);
                    return;
                }
                if (i17 != 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknow actionInfo.action_type");
                    return;
                }
                r45.ln lnVar = vf5Var.f469723g;
                if (lnVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", " bottomCell == null");
                    return;
                }
                this.B = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, true);
                android.widget.TextView textView = new android.widget.TextView(mo55332x76847179());
                textView.setGravity(17);
                textView.setHeight(i65.a.b(mo55332x76847179(), 56));
                textView.setTextSize(12.0f);
                textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lnVar.f461180d)) {
                    textView.setText(lnVar.f461180d);
                    this.B.s(textView, false);
                    this.B.Z1 = true;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.B;
                k0Var.f293405n = new zw1.l5(this, lnVar);
                k0Var.f293414s = new zw1.m5(this, lnVar);
                k0Var.v();
                return;
            }
            r45.jv3 jv3Var = vf5Var.f469721e;
            if (jv3Var == null || ((z2Var = this.A) != null && z2Var.h())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "mHalfBottomDialog != null || mHalfBottomDialog.isShowing() || halfPage == null ");
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.B;
            if (k0Var2 != null && k0Var2.i()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "mBottomSheet != null && mBottomSheet.isShowing()");
                return;
            }
            ww1.a3 l76 = l7(0);
            r45.wf5 wf5Var = jv3Var.f459658f;
            r45.wf5 wf5Var2 = jv3Var.f459659g;
            l76.f531645v = 4;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 1, 3);
            this.A = z2Var2;
            z2Var2.m(wf5Var.f470668d, wf5Var2.f470668d);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = this.A;
            zw1.d5 d5Var = new zw1.d5(this, l76, wf5Var);
            zw1.f5 f5Var = new zw1.f5(this, l76, wf5Var2);
            z2Var3.D = d5Var;
            z2Var3.E = f5Var;
            if (jv3Var.f459656d.f468111d == 2) {
                android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.z_, null);
                ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.aa_)).setOnClickListener(new zw1.g5(this));
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c2l);
                textView2.setText(jv3Var.f459656d.f468112e);
                com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                this.A.s(inflate);
            } else {
                android.view.View inflate2 = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570172z9, null);
                android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.gwd);
                textView3.setText(jv3Var.f459656d.f468112e);
                com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                this.A.s(inflate2);
            }
            android.view.View inflate3 = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570171z8, null);
            ((android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.gw8)).setText(jv3Var.f459657e);
            this.A.j(inflate3);
            this.A.C();
        }
    }

    public final void L7(r45.o90 o90Var, int i17, boolean z17, l81.e1 e1Var) {
        if (o90Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", " coverInfo == null");
            return;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        l76.f531622a0 = z17;
        m76.O.setVisibility(0);
        m76.O.setOnClickListener(new zw1.h5(this));
        m76.R.setText(o90Var.f463576d);
        m76.S.setVisibility(8);
        if (i17 == 2 && J7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 20, java.lang.Integer.valueOf(i17));
            ((android.widget.LinearLayout.LayoutParams) m76.R.getLayoutParams()).setMargins(i65.a.b(mo55332x76847179(), 60), i65.a.b(mo55332x76847179(), 24), i65.a.b(mo55332x76847179(), 60), 0);
            m76.S.setVisibility(0);
            m76.S.removeAllViews();
            r45.o90 o90Var2 = l76.Z;
            if (o90Var2 != null && o90Var2.f463580h != null) {
                for (int i18 = 0; i18 < l76.Z.f463580h.size(); i18++) {
                    java.lang.String str = (java.lang.String) l76.Z.f463580h.get(i18);
                    android.view.View inflate = android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dpq, (android.view.ViewGroup) null);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565323rg4)).setText(str);
                    m76.S.addView(inflate);
                    if (i18 != 0) {
                        ((android.widget.LinearLayout.LayoutParams) inflate.getLayoutParams()).setMargins(0, i65.a.b(mo55332x76847179(), 8), 0, 0);
                    }
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = m76.O.getLayoutParams();
        if (z17) {
            m76.f531672k.postDelayed(new zw1.i5(this, m76, layoutParams, l76), 20L);
        } else {
            m76.f531672k.getHeight();
            m76.C.getHeight();
            i65.a.b(mo55332x76847179(), 1);
            layoutParams.height = (m76.f531672k.getHeight() - m76.C.getHeight()) - i65.a.b(mo55332x76847179(), 1);
            m76.O.setLayoutParams(layoutParams);
            m76.O.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c0t);
            m76.P.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c0u);
        }
        m76.T.setText(o90Var.f463577e.f470668d);
        m76.T.setOnClickListener(new zw1.j5(this, i17, o90Var, e1Var));
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) m76.Q.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) m76.T.getLayoutParams();
        if (o90Var.f463579g == 0) {
            layoutParams2.topMargin = i65.a.b(mo55332x76847179(), 36);
            layoutParams3.topMargin = i65.a.b(mo55332x76847179(), 36);
            m76.U.setVisibility(0);
            m76.U.setText(o90Var.f463578f.f470668d);
            m76.U.setOnClickListener(new zw1.k5(this, o90Var, e1Var));
        } else {
            if (m76.f531656b.getVisibility() == 0) {
                layoutParams2.topMargin = i65.a.b(mo55332x76847179(), 48);
            } else {
                layoutParams2.topMargin = i65.a.b(mo55332x76847179(), 80);
            }
            if (J7()) {
                layoutParams3.topMargin = i65.a.b(mo55332x76847179(), 48);
                layoutParams3.bottomMargin = i65.a.b(mo55332x76847179(), 64);
            } else {
                layoutParams3.topMargin = i65.a.b(mo55332x76847179(), 64);
            }
            m76.U.setVisibility(8);
        }
        m76.Q.setLayoutParams(layoutParams2);
        m76.T.setLayoutParams(layoutParams3);
    }

    public void M7(ww1.a3 a3Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "startQrcodeCollectionSettingPage");
        if (!a3Var.L) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5.class);
            intent.putExtra("key_currency_unit", a3Var.f531640q);
            intent.putExtra("key_type", i17);
            if (a3Var.T && i17 == 2) {
                intent.putExtra("ftf_fixed_current_shop_id", a3Var.U);
            }
            startActivityForResult(intent, 4096);
            return;
        }
        r45.gk5 gk5Var = a3Var.N;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "qrcode setting page-title data，title：%s  subTitle：%s fillTitle：%s  fillHint：%s", gk5Var.f456852d, gk5Var.f456853e, gk5Var.f456854f, gk5Var.f456855g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "qrcode setting page-money data，fee：%s desc：%s desc_required：%s desc_placeholder：%s", java.lang.Double.valueOf(a3Var.f531634k), a3Var.f531636m, java.lang.Boolean.valueOf(a3Var.f531638o), a3Var.f531637n);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_type", i17);
        intent2.putExtra("key_payer_desc_switch_title", a3Var.N.f456852d);
        intent2.putExtra("key_payer_desc_switch_sub_title", a3Var.N.f456853e);
        intent2.putExtra("key_payer_desc_fill_title", a3Var.N.f456854f);
        intent2.putExtra("key_payer_desc_fill_hint", a3Var.N.f456855g);
        intent2.putExtra("key_currency_unit", a3Var.f531640q);
        intent2.putExtra("ftf_fixed_fee", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(a3Var.f531634k + "", "100"));
        intent2.putExtra("ftf_fixed_desc", a3Var.f531636m);
        intent2.putExtra("ftf_fixed_desc_required", a3Var.f531638o);
        intent2.putExtra("ftf_fixed_desc_placeholder", a3Var.f531637n);
        if (a3Var.T && i17 == 2) {
            intent2.putExtra("ftf_fixed_current_shop_id", a3Var.U);
        }
        ((h45.q) i95.n0.c(h45.q.class)).mo24827x2fbc8dd5(intent2, new zw1.t3(this, i17));
    }

    public final void N7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[startShortTermQrCodeErrorTimer]，needRefreshType：%s", java.lang.Integer.valueOf(i17));
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        if (i17 == 2 && !v7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "do not has mch code,return");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = l76.B;
        if (b4Var == null) {
            l76.B = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new zw1.r5(this, l76, m76), false);
        } else {
            b4Var.d();
        }
        l76.B.c(3000L, 3000L);
    }

    public final void O7(int i17) {
        ww1.a3 l76 = l7(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[startShortTermQrCodeTimer]，needRefreshType：%s dataModel.refresh_url_interval:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(l76.f531649z));
        if (i17 == 2 && !v7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "do not has mch code，return");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = l76.A;
        if (b4Var == null) {
            l76.A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new zw1.q5(this, i17), false);
        } else {
            b4Var.d();
        }
        if (l76.f531649z < 60) {
            l76.f531649z = 60;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = l76.A;
        long j17 = l76.f531649z * 1000;
        b4Var2.c(j17, j17);
    }

    public final void U6(r45.wf5 wf5Var, l81.e1 e1Var) {
        if (wf5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", " buttonInfo == null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[ClickButtonAction]，buttonInfoType:%s，mCollectType：%s", java.lang.Integer.valueOf(wf5Var.f470669e), java.lang.Integer.valueOf(this.f177968d));
        ww1.b3 m76 = m7(0);
        switch (wf5Var.f470669e) {
            case 1:
                if (m76.O.isShown()) {
                    m76.O.setVisibility(8);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.A;
                if (z2Var != null) {
                    z2Var.B();
                    break;
                }
                break;
            case 2:
                if (this.M == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 12, java.lang.Integer.valueOf(this.f177968d));
                }
                if (this.M == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 15, java.lang.Integer.valueOf(this.f177968d));
                }
                j7(0, null);
                break;
            case 3:
                if (this.M == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 14, java.lang.Integer.valueOf(this.f177968d));
                }
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(mo55332x76847179(), wf5Var.f470670f, true);
                break;
            case 4:
                r45.sm4 sm4Var = wf5Var.f470671g;
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.c0(sm4Var.f467380d, sm4Var.f467381e, 0, 1072, e1Var);
                break;
            case 5:
                L7(wf5Var.f470672h, 0, false, null);
                break;
            case 6:
                j7(0, wf5Var.f470672h);
                break;
            case 7:
                e7();
                break;
            case 8:
                j7(0, null);
                break;
            case 9:
                finish();
                break;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknow buttonInfo.type");
                break;
        }
        int i17 = this.M;
        if (i17 == 1 || i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20032, "wxface2face", "ClickHalfDialogButton", "", "", "", "", 4, 0, java.lang.Integer.valueOf(wf5Var.f470669e), q7(), java.lang.Integer.valueOf(s7(0)), r7(0));
        } else if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknow clickButtonSource");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20032, "wxface2face", "ClickCoverPageButton", "", "", "", "", 5, 0, java.lang.Integer.valueOf(wf5Var.f470669e), q7(), java.lang.Integer.valueOf(s7(0)), r7(0));
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (this.f177968d == 2) {
            return;
        }
        ww1.a3 l76 = l7(1);
        if (editable == null || editable.toString().equals("")) {
            this.E.b(false);
            return;
        }
        this.E.b(true);
        if (editable.length() <= 16) {
            l76.P = editable.toString();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6) this.F.findViewById(com.p314xaae8f345.mm.R.id.c3k);
        c22695xac2d47d6.setText(editable.toString().substring(0, 16));
        java.lang.String substring = editable.toString().substring(0, 16);
        l76.P = substring;
        c22695xac2d47d6.setSelection(substring.length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    public final android.graphics.Bitmap d7(int i17, java.lang.String str, java.lang.String str2, int i18) {
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 206.0f);
        y60.e eVar = this.P;
        return i17 == 2 ? ww1.y2.a(this, str, c01.z1.r(), str2, true, d17, eVar, true, i18, 0.0f, false, 0.0d) : ww1.y2.a(this, str, c01.z1.r(), "", true, d17, eVar, false, i18, 0.0f, true, 0.0d);
    }

    public final void e7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "doApplyQrCode，mCollectType：%s", java.lang.Integer.valueOf(this.f177968d));
        if (this.f177968d == 2) {
            return;
        }
        if (!l7(1).O) {
            j7(1, null);
            return;
        }
        pq5.g l17 = new ww1.h(p7(1)).l();
        l17.f(this);
        l17.h(new zw1.q4(this));
    }

    public final void f7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetQrCodeConfig]");
        if (i17 == 0) {
            ww1.a3 a3Var = this.f177969e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeLogic", "[getPersonalConfig]");
            r45.hw hwVar = new r45.hw();
            java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_COLLECT_QRCODE_CONFIG_STRING_SYNC, null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeLogic", "getConfig failed");
            } else {
                try {
                    hwVar.mo11468x92b714fd(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeLogic", "getConfig success");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeLogic", "parse fail, " + e17.getLocalizedMessage());
                }
            }
            ww1.c3.a(a3Var, hwVar, null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177969e.f531621a)) {
                z7(-1);
            }
        }
        ww1.y2.f(this.f177971g, this.f177969e, mo55332x76847179());
        pq5.g l17 = new ww1.k().l();
        l17.f(this);
        l17.h(new zw1.p3(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
    }

    public final void g7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetQrCodeMchConfig] scene:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            x7(-1);
        }
        if (i17 != 0 && i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            return;
        }
        ww1.y2.f(this.f177972h, this.f177970f, mo55332x76847179());
        pq5.g l17 = new ww1.l(0).l();
        l17.f(this);
        l17.h(new zw1.q3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570185zm;
    }

    public void h7(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetShortTermQrcode]，needRefreshType：%s", java.lang.Integer.valueOf(i17));
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        long j17 = w7(l76.f531634k, l76.f531636m, l76.f531638o, l76.f531637n) ? l76.E : l76.D;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!z17 && currentTimeMillis - j17 < ((l76.f531649z * 1000) - 3000) - 500) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "do not refresh：hardRefresh or overtime");
            return;
        }
        if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40975xf7b3660d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "do not refresh：is not in Foreground");
            return;
        }
        if (i17 == 1) {
            if (m76.V.getVisibility() == 0) {
                ww1.y2.f(m76, l76, mo55332x76847179());
            }
            l76.C = false;
            N7(i17);
            pq5.g l17 = new ww1.i(s7(i17), n7(i17), r7(i17), l76.f531638o, o7(i17), 0).l();
            l17.f(this);
            l17.h(new zw1.s5(this, l76, i17, m76));
            return;
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            return;
        }
        if (!v7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetShortTermQrCode] do not has mch code,retrun ");
            return;
        }
        if (m76.V.getVisibility() == 0) {
            ww1.y2.f(m76, l76, mo55332x76847179());
        }
        l76.C = false;
        N7(i17);
        pq5.g l18 = new ww1.j(s7(i17), n7(i17), r7(i17), l76.f531638o, o7(i17), 0, l76.T ? l76.U : 0L).l();
        l18.f(this);
        l18.h(new zw1.t5(this, l76, i17, m76));
    }

    public void i7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetVoiceSwitchMch]");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177970f.f531621a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUI", "qrcode_url is null.");
            return;
        }
        ww1.a3 a3Var = this.f177970f;
        pq5.g l17 = new ww1.q(1, a3Var.T ? a3Var.U : 0L).l();
        l17.f(this);
        l17.h(new zw1.y3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalite190b0cf18204487696c6d9890f89c090@pay", new zw1.w5(this, this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hdw);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.c58);
        this.f177973i = viewGroup;
        viewGroup.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560085am));
        ((android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.c5_)).setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560085am));
        this.f177974m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.c4p);
        this.f177975n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.c4o);
        gm0.j1.i();
        this.f177968d = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_TYPE_INT_SYNC, 1)).intValue();
        ww1.b3 b3Var = new ww1.b3();
        this.f177971g = b3Var;
        b3Var.a(findViewById(com.p314xaae8f345.mm.R.id.c4m), mo55332x76847179(), 1);
        this.f177971g.N = new ww1.x2(1, mo55332x76847179(), this.f177969e, this.f177971g, this);
        this.f177971g.f531658c.setOnClickListener(new zw1.x5(this));
        this.f177971g.f531657b0.setOnClickListener(new zw1.y5(this));
        ww1.b3 b3Var2 = new ww1.b3();
        this.f177972h = b3Var2;
        b3Var2.a(findViewById(com.p314xaae8f345.mm.R.id.c4l), mo55332x76847179(), 2);
        this.f177972h.N = new ww1.x2(2, mo55332x76847179(), this.f177970f, this.f177972h, this);
        this.f177977p = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.c4g);
        this.f177978q = findViewById(com.p314xaae8f345.mm.R.id.c4e);
        this.f177979r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.c4i);
        this.f177980s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.c4f);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
        this.H = f5Var;
        f5Var.f291933e = new zw1.z5(this);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((zw1.t2) pf5.z.f435481a.a(activity).a(zw1.t2.class)).getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "8";
        c6241x543927b6.f273897d = new zw1.a6(this, c6241x543927b6);
        c6241x543927b6.e();
    }

    public final void j7(int i17, r45.o90 o90Var) {
        int i18 = i17 == 0 ? this.f177968d : i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doSaveQrCode] mCollectType：%s", java.lang.Integer.valueOf(i18));
        ww1.a3 l76 = l7(i18);
        r45.r1 c17 = at4.g0.c();
        if (c17 == null) {
            c17 = new r45.r1();
        }
        if (i18 == 1) {
            pq5.g l17 = new ww1.m(l76.f531634k, l76.f531635l, l76.P, c17.f465945i, c17.f465946m, java.lang.String.valueOf(c17.f465944h), p7(0), r7(i18), l76.f531638o, o7(i18)).l();
            l17.f(this);
            l17.h(new zw1.c4(this, o90Var, i18));
        } else {
            if (i18 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
                return;
            }
            pq5.g l18 = new ww1.n(l76.f531634k, l76.f531635l, l76.P, c17.f465945i, c17.f465946m, java.lang.String.valueOf(c17.f465944h), p7(0), r7(i18), l76.f531638o, o7(i18)).l();
            l18.f(this);
            l18.h(new zw1.d4(this, o90Var, i18));
        }
    }

    public final void k7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        int s76 = s7(i17);
        java.lang.String r76 = r7(i17);
        int i18 = l76.f531645v;
        ww1.a3 l77 = l7(i17 == 0 ? this.f177968d : i17);
        java.lang.String str = "";
        if (w7(l77.f531634k, l77.f531636m, l77.f531638o, l77.f531637n)) {
            if (i18 == 1) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l77.f531632i)) {
                    str = l77.f531632i;
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l77.f531642s)) {
                str = l77.f531642s;
            }
        } else if (i18 == 1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l77.f531621a)) {
                str = l77.f531621a;
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l77.f531641r)) {
            str = l77.f531641r;
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g p76 = p7(i17);
        boolean z17 = l76.f531638o;
        java.lang.String o76 = o7(i17);
        if (i17 == 1) {
            pq5.g l17 = new ww1.o(l76.f531645v, s76, r76, str2, p76, z17, o76).l();
            l17.f(this);
            l17.h(new zw1.b5(this));
        } else {
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
                return;
            }
            pq5.g l18 = new ww1.p(l76.f531645v, s76, r76, str2, p76, z17, o76).l();
            l18.f(this);
            l18.h(new zw1.c5(this));
        }
    }

    public final ww1.a3 l7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        return i17 == 2 ? this.f177970f : this.f177969e;
    }

    public final ww1.b3 m7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        return i17 == 2 ? this.f177972h : this.f177971g;
    }

    public java.lang.String n7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        l7(i17).f531635l = "CNY";
        return com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w("CNY");
    }

    public final java.lang.String o7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l76.f531637n) ? l76.f531637n : "";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onActivityResult]，mCollectType：%s", java.lang.Integer.valueOf(this.f177968d));
        int i19 = this.f177968d;
        if (intent != null) {
            i19 = intent.getIntExtra("key_type", i19);
            if (i19 == 0) {
                i19 = this.f177968d;
            }
            intent.putExtra("key_type", i19);
        }
        ww1.a3 l76 = l7(i19);
        if (i17 != 4096) {
            if (i17 != 4097) {
                return;
            }
            c01.z1.j();
            l76.getClass();
            return;
        }
        if (i18 != -1 || intent == null) {
            D7(l76);
            this.N = 2;
        } else {
            G7(intent);
        }
        B7(i19);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hdw);
        m78567x3bd95720(true);
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560085am));
        m78513xc2a54588().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560085am));
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560085am));
        m78554x41d7d42(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        mo78530x8b45058f();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        mo54448x9c8c0d33(new zw1.p4(this));
        mo43517x10010bd5();
        int b17 = i65.a.b(this, 49);
        int b18 = i65.a.b(this, 238);
        Q = b17 + b18 + i65.a.b(this, 77) + i65.a.b(this, 60);
        this.f177969e = new ww1.a3();
        this.f177970f = new ww1.a3();
        f7(0);
        g7(0);
        this.f177987z = c01.z1.j();
        this.f177986y = (android.os.Vibrator) getSystemService("vibrator");
        this.f177985x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        java.util.LinkedList linkedList = (java.util.LinkedList) tw1.f.Di().Ni().f531844d;
        if (!linkedList.contains(this)) {
            linkedList.add(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14021, 2, java.lang.Integer.valueOf(getIntent().getIntExtra("key_from_scene", 1)));
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(16, 0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onDestroy]，mCollectType：%s", java.lang.Integer.valueOf(this.f177968d));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_TYPE_INT_SYNC, java.lang.Integer.valueOf(this.f177968d));
        android.graphics.Bitmap bitmap = l7(2).f531644u;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        ww1.a3 l76 = l7(2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = l76.A;
        if (b4Var != null) {
            b4Var.d();
            l76.A = null;
        }
        android.graphics.Bitmap bitmap2 = l7(1).f531644u;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bitmap2.recycle();
        }
        ww1.a3 l77 = l7(1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = l77.A;
        if (b4Var2 != null) {
            b4Var2.d();
            l77.A = null;
        }
        this.f177986y.cancel();
        ((java.util.LinkedList) tw1.f.Di().Ni().f531844d).remove(this);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        y60.e eVar = this.P;
        ((x60.e) fVar).getClass();
        x51.w0.e(eVar);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().r(this.f177983v);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().r(this.f177984w);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes != null) {
            attributes.screenBrightness = -1.0f;
            getWindow().setAttributes(attributes);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        this.H.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[checkShortTermQrCodeTiming]，pageScene：%s", java.lang.Integer.valueOf(this.N));
        if (this.N != 2) {
            this.N = 2;
        } else {
            h7(1, false);
            h7(2, false);
        }
        if (this.f177976o) {
            g7(0);
            this.f177976o = false;
        }
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes == null || attributes.screenBrightness >= 0.85f) {
            return;
        }
        attributes.screenBrightness = 0.85f;
        getWindow().setAttributes(attributes);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.H.f();
        }
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g p7(int i17) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        return (w7(l76.f531634k, l76.f531636m, l76.f531638o, l76.f531637n) && (gVar = l76.f531633j) != null && i17 == 2) ? gVar : l76.f531623b;
    }

    public final java.lang.String q7() {
        ww1.a3 l76 = l7(0);
        return w7(l76.f531634k, l76.f531636m, l76.f531638o, l76.f531637n) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l76.f531632i) ? "" : l76.f531632i : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l76.f531621a) ? "" : l76.f531621a;
    }

    public final java.lang.String r7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l76.f531636m) ? l76.f531636m : "";
    }

    public final int s7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        if (l76.f531634k <= 0.0d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(m76.f531678q.a())) {
            return 0;
        }
        return com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(l76.f531634k + "", "100");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.addAll(super.mo43419xa59964ef());
        hashSet.add(zw1.t2.class);
        hashSet.add(zw1.q2.class);
        hashSet.add(zw1.n2.class);
    }

    public final r45.bj4 t7(java.util.LinkedList linkedList, java.lang.Long l17) {
        if (linkedList == null) {
            return null;
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            if (l17.longValue() == ((r45.bj4) linkedList.get(i17)).f452337d) {
                return (r45.bj4) linkedList.get(i17);
            }
        }
        return null;
    }

    public final android.text.SpannableStringBuilder u7(int i17) {
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l76.f531625c)) {
            java.lang.String q17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q();
            l76.f531625c = q17;
            l76.f531625c = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.y(q17);
        }
        if (i17 != 2) {
            java.lang.String x17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(c01.z1.r());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l76.f531625c)) {
                x17 = x17 + getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_m, l76.f531625c);
            }
            return new android.text.SpannableStringBuilder(x17);
        }
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c6v);
        drawable.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 44), com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 20));
        al5.w wVar = new al5.w(drawable, 1);
        r45.bj4 t76 = t7(l76.V, java.lang.Long.valueOf(l76.U));
        java.lang.String str = t76 != null ? t76.f452338e : "";
        if (!l76.T || i17 != 2) {
            str = l76.f531625c;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str + "  ");
        spannableStringBuilder.setSpan(wVar, str.length() + 1, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public final boolean v7() {
        int i17;
        return (this.f177972h.f531654a.getVisibility() != 0 || (i17 = this.f177970f.S) == 4 || i17 == 5) ? false : true;
    }

    public final boolean w7(double d17, java.lang.String str, boolean z17, java.lang.String str2) {
        boolean z18 = d17 > 0.0d;
        boolean z19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        boolean z27 = z17 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "isFixedMode：fee：%s desc:%s desc_required:%s desc_placeholder:%s", java.lang.Double.valueOf(d17), str, java.lang.Boolean.valueOf(z17), str2);
        return z18 || z19 || z27;
    }

    public final void x7(int i17) {
        ww1.y2.c(this.f177970f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[checkMchEntranceView] entrance_type:%s", java.lang.Integer.valueOf(this.f177970f.S));
        if (this.f177983v != null) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().r(this.f177983v);
            this.f177983v = null;
        }
        this.f177983v = new zw1.f6(this, this.f177970f.S);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f177983v);
        int i18 = this.f177970f.S;
        if (i18 == 2) {
            this.f177968d = 1;
            this.f177977p.setVisibility(0);
            android.view.View view = this.f177972h.f531654a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            A7(8);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177970f.X.f462723e)) {
                this.f177979r.setText(this.f177970f.X.f462723e);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177970f.X.f462724f)) {
                this.f177980s.setVisibility(8);
            } else {
                this.f177980s.setText(this.f177970f.X.f462724f);
                this.f177980s.setVisibility(0);
            }
            r45.sm4 sm4Var = this.f177970f.X.f462722d;
            if (sm4Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "username:%s，page_path：%s", sm4Var.f467380d, sm4Var.f467381e);
                this.f177984w = new zw1.c6(this);
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k(this.f177984w);
                if (i17 != -1) {
                    if (this.f177984w.f531910e.getVisibility() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 2);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 3);
                    }
                }
            }
        } else if (i18 == 3) {
            this.f177977p.setVisibility(8);
            this.f177972h.O.setVisibility(8);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177970f.f531621a)) {
                android.view.View view2 = this.f177972h.f531654a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                A7(8);
            } else {
                android.view.View view3 = this.f177972h.f531654a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C7(2);
                A7(0);
                if (this.f177968d == 1) {
                    this.f177972h.f531658c.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562807p6);
                    this.f177972h.f531656b.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562805p4);
                    this.f177972h.f531662e.setRotation(90.0f);
                    android.view.ViewGroup.LayoutParams layoutParams = this.f177972h.f531670i.getLayoutParams();
                    layoutParams.height = 0;
                    this.f177972h.f531670i.setLayoutParams(layoutParams);
                    this.f177970f.f531648y = Q;
                    if (i17 != -1) {
                        if (this.f177983v.f531909d.getVisibility() == 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 4);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 5);
                        }
                    }
                } else if (i17 != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 6);
                }
                if (i17 != -1) {
                    O7(2);
                    this.f177970f.D = java.lang.System.currentTimeMillis();
                    ww1.y2.d(this.f177972h);
                    i7();
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((zw1.q2) pf5.z.f435481a.a(activity).a(zw1.q2.class)).O6(this.f177970f, this.f177972h);
            }
        } else if (i18 == 4 || i18 == 5) {
            this.f177977p.setVisibility(8);
            android.view.View view4 = this.f177972h.f531654a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            L7(J7() ? this.f177970f.Z : this.f177970f.Y, 2, true, new zw1.v5(this, 2, 2));
            A7(0);
            if (this.f177968d == 1) {
                this.f177972h.f531658c.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562807p6);
                this.f177972h.f531656b.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562805p4);
                this.f177972h.f531662e.setRotation(90.0f);
                android.view.ViewGroup.LayoutParams layoutParams2 = this.f177972h.f531670i.getLayoutParams();
                layoutParams2.height = 0;
                this.f177972h.f531670i.setLayoutParams(layoutParams2);
                this.f177970f.f531648y = Q;
                if (i17 != -1) {
                    if (this.f177983v.f531909d.getVisibility() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 4);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 5);
                    }
                }
            } else if (i17 != -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 6);
            }
            if (i17 != -1) {
                ww1.y2.d(this.f177972h);
            }
        } else {
            if (i17 != -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25982, 1);
            }
            this.f177968d = 1;
            this.f177977p.setVisibility(8);
            android.view.View view5 = this.f177972h.f531654a;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            A7(8);
        }
        if (this.f177969e != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((zw1.n2) pf5.z.f435481a.a(activity2).a(zw1.n2.class)).Q6(this.f177968d, this.f177972h, this.f177977p, this.f177969e.K);
        }
    }

    public void y7(int i17) {
        java.util.List list;
        if (i17 == 0) {
            i17 = this.f177968d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        if (((java.util.LinkedList) l76.f531646w).size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "dataModel.payer_msg_List.size() <=  0");
            m76.H.setVisibility(8);
            return;
        }
        m76.C.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562820pj);
        m76.H.setVisibility(0);
        int i18 = 0;
        double d17 = 0.0d;
        while (true) {
            list = l76.f531646w;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                break;
            }
            ww1.b0 b0Var = (ww1.b0) ((java.util.LinkedList) list).get(i18);
            if (b0Var.f531734m == 1 && b0Var.f531650s) {
                d17 += b0Var.f531730f;
            }
            i18++;
        }
        if (d17 > 0.0d) {
            m76.I.setVisibility(0);
            m76.L.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(d17, ((ww1.b0) ((java.util.LinkedList) list).get(0)).f531731g));
        } else {
            m76.I.setVisibility(8);
        }
        l76.f531647x.m8146xced61ae5();
        m76.M.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onScreenShot]，mCollectType：%s", java.lang.Integer.valueOf(this.f177968d));
        ww1.a3 l76 = l7(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(25983, 11, java.lang.Integer.valueOf(this.f177968d));
        g0Var.d(13944, 9);
        if (l76.f531628e != null) {
            g0Var.d(20032, "wxface2face", "ScreenShot", "", "", "", "", 1, java.lang.Integer.valueOf(l76.f531628e.f469720d), 0, q7(), java.lang.Integer.valueOf(s7(0)), r7(0));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.D;
        if ((k0Var != null && k0Var.i()) || (((u1Var = this.C) != null && (j0Var = u1Var.f293531c) != null && j0Var.isShowing()) || (((z2Var = this.E) != null && z2Var.h()) || ((y1Var = this.G) != null && y1Var.f())))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "helper.isShowing() || isShowTips, do not showScreen Action");
            return;
        }
        if (this.f177968d == 2 && !v7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onScreenShot] mch type but do not have code ,do not screen shot");
            return;
        }
        K7(l76.f531628e);
        l76.f531645v = 1;
        k7(this.f177968d);
        h7(this.f177968d, true);
    }

    public final void z7(int i17) {
        int i18;
        C7(1);
        ww1.a3 a3Var = new ww1.a3();
        ww1.y2.c(a3Var);
        if (this.f177968d == 2 && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a3Var.f531621a) || (i18 = a3Var.S) == 4 || i18 == 5)) {
            this.f177971g.f531658c.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562807p6);
            this.f177971g.f531656b.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562805p4);
            this.f177971g.f531662e.setRotation(90.0f);
            android.view.ViewGroup.LayoutParams layoutParams = this.f177971g.f531670i.getLayoutParams();
            layoutParams.height = 0;
            this.f177971g.f531670i.setLayoutParams(layoutParams);
            this.f177969e.f531648y = Q;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((zw1.q2) pf5.z.f435481a.a(activity).a(zw1.q2.class)).O6(this.f177969e, this.f177971g);
    }
}
