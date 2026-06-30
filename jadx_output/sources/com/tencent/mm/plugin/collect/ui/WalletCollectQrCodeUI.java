package com.tencent.mm.plugin.collect.ui;

@db5.a(0)
@gm0.a2
/* loaded from: classes15.dex */
public class WalletCollectQrCodeUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements ww1.u, com.tencent.mm.sdk.platformtools.f7, android.text.TextWatcher {
    public static int Q;
    public com.tencent.mm.ui.widget.dialog.z2 A;
    public com.tencent.mm.ui.widget.dialog.k0 B;
    public com.tencent.mm.ui.widget.dialog.u1 C;
    public com.tencent.mm.ui.widget.dialog.k0 D;
    public com.tencent.mm.ui.widget.dialog.z2 E;
    public android.view.View F;
    public com.tencent.mm.ui.widget.dialog.y1 G;
    public com.tencent.mm.ui.tools.f5 H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f96434J;
    public boolean K;
    public boolean L;
    public int M;

    /* renamed from: e, reason: collision with root package name */
    public ww1.a3 f96436e;

    /* renamed from: f, reason: collision with root package name */
    public ww1.a3 f96437f;

    /* renamed from: g, reason: collision with root package name */
    public ww1.b3 f96438g;

    /* renamed from: h, reason: collision with root package name */
    public ww1.b3 f96439h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f96440i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f96441m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f96442n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f96443o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f96444p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f96445q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f96446r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f96447s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f96448t;

    /* renamed from: v, reason: collision with root package name */
    public zw1.f6 f96450v;

    /* renamed from: w, reason: collision with root package name */
    public zw1.c6 f96451w;

    /* renamed from: x, reason: collision with root package name */
    public long f96452x;

    /* renamed from: y, reason: collision with root package name */
    public android.os.Vibrator f96453y;

    /* renamed from: z, reason: collision with root package name */
    public long f96454z;

    /* renamed from: d, reason: collision with root package name */
    public int f96435d = 1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f96449u = false;
    public int N = 1;
    public final y60.e P = new zw1.b4(this);

    public static void V6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17) {
        if (i17 == 0) {
            i17 = walletCollectQrCodeUI.f96435d;
        }
        ww1.a3 l76 = walletCollectQrCodeUI.l7(i17);
        if (walletCollectQrCodeUI.m7(i17).f450138j.getHeight() != 0) {
            l76.f450115y = r1.f450138j.getHeight();
        } else {
            l76.f450115y = Q;
        }
    }

    public static boolean W6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17) {
        if (i17 == 0) {
            i17 = walletCollectQrCodeUI.f96435d;
        } else {
            walletCollectQrCodeUI.getClass();
        }
        if (i17 == 1) {
            return tw1.f.Di().Ri();
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            return false;
        }
        tw1.f.Di().getClass();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_MCH_STRING, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCollect", "isF2fRingToneOpenMch : %s ", str);
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals("cash.caf");
    }

    public static void X6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(walletCollectQrCodeUI.getContext());
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = walletCollectQrCodeUI.getContext().getString(com.tencent.mm.R.string.l0g);
        }
        u1Var.g(str);
        u1Var.l(new zw1.o5(walletCollectQrCodeUI));
        u1Var.n(walletCollectQrCodeUI.getContext().getString(com.tencent.mm.R.string.ke6));
        u1Var.q(false);
    }

    public static void Y6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, java.lang.String str, java.lang.String str2, int i17, r45.jv3 jv3Var, r45.o90 o90Var, int i18, r45.nu5 nu5Var, r45.mu5 mu5Var) {
        android.graphics.Bitmap d76;
        int i19 = i18 == 0 ? walletCollectQrCodeUI.f96435d : i18;
        ww1.a3 l76 = walletCollectQrCodeUI.l7(i19);
        l76.getClass();
        l76.f450110t = i17;
        l76.Q = jv3Var;
        l76.O = false;
        boolean w76 = walletCollectQrCodeUI.w7(l76.f450101k, l76.f450103m, l76.f450105o, l76.f450104n);
        r45.bj4 t76 = walletCollectQrCodeUI.t7(l76.V, java.lang.Long.valueOf(l76.U));
        java.lang.String str3 = t76 != null ? t76.f370806f : "";
        if (!l76.T || i19 != 2) {
            str3 = l76.R;
        }
        if (w76) {
            l76.f450109s = str;
            d76 = walletCollectQrCodeUI.d7(i19, str, str3, l76.f450110t);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11343, 1, java.lang.Integer.valueOf((int) java.lang.Math.round(l76.f450101k * 100.0d)));
        } else {
            l76.f450108r = str;
            d76 = walletCollectQrCodeUI.d7(i19, str, str3, l76.f450110t);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11343, 0);
        }
        if (d76 == null || d76.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "【mSaveQrcodeBitmap == null");
            dp.a.makeText(walletCollectQrCodeUI.getContext(), walletCollectQrCodeUI.getString(com.tencent.mm.R.string.b_v), 1).show();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 17, java.lang.Integer.valueOf(i19));
            return;
        }
        if (!walletCollectQrCodeUI.f96449u) {
            walletCollectQrCodeUI.f96449u = true;
            walletCollectQrCodeUI.f96448t = ((android.view.ViewStub) walletCollectQrCodeUI.findViewById(com.tencent.mm.R.id.c5m)).inflate();
        }
        android.view.View view = walletCollectQrCodeUI.f96448t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "saveQrcodeToLocal", "(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/HalfPage;Lcom/tencent/mm/protocal/protobuf/CoverInfo;ILcom/tencent/mm/protocal/protobuf/SaveSuccJumpInfo;Lcom/tencent/mm/protocal/protobuf/SaveQrcodeSuccJumpInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "saveQrcodeToLocal", "(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/HalfPage;Lcom/tencent/mm/protocal/protobuf/CoverInfo;ILcom/tencent/mm/protocal/protobuf/SaveSuccJumpInfo;Lcom/tencent/mm/protocal/protobuf/SaveQrcodeSuccJumpInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5f)).setImageBitmap(d76);
        android.widget.TextView textView = (android.widget.TextView) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5i);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5j);
        android.widget.ImageView imageView = (android.widget.ImageView) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5k);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5e);
        android.widget.TextView textView2 = (android.widget.TextView) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5b);
        android.widget.TextView textView3 = (android.widget.TextView) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5c);
        android.widget.TextView textView4 = (android.widget.TextView) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5h);
        android.widget.TextView textView5 = (android.widget.TextView) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c5d);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) walletCollectQrCodeUI.f96448t.findViewById(com.tencent.mm.R.id.c4u);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.text.SpannableStringBuilder u76 = walletCollectQrCodeUI.u7(i19);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(walletCollectQrCodeUI, u76, textSize));
        com.tencent.mm.wallet_core.ui.r1.d(textView);
        textView.setTextSize(1, 17.0f);
        textView3.setTextSize(1, 13.0f);
        textView4.setTextSize(1, 13.0f);
        textView5.setTextSize(1, 24.0f);
        textView2.setTextSize(1, 24.0f);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams.width = i65.a.b(walletCollectQrCodeUI.getContext(), 176);
        layoutParams.height = i65.a.b(walletCollectQrCodeUI.getContext(), 176);
        if (l76.f450101k <= 0.0d || com.tencent.mm.sdk.platformtools.t8.K0(walletCollectQrCodeUI.r7(i19))) {
            layoutParams.topMargin = i65.a.b(walletCollectQrCodeUI.getContext(), 16);
        } else {
            layoutParams.topMargin = i65.a.b(walletCollectQrCodeUI.getContext(), 12);
        }
        relativeLayout2.setLayoutParams(layoutParams);
        walletCollectQrCodeUI.E7(i19, textView3);
        walletCollectQrCodeUI.F7(i19, textView4);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams2.topMargin = i65.a.b(walletCollectQrCodeUI, 16);
        relativeLayout2.setLayoutParams(layoutParams2);
        if (l76.f450101k > 0.0d) {
            relativeLayout.setVisibility(0);
            textView5.setText(com.tencent.mm.wallet_core.ui.r1.o(l76.f450101k));
            textView2.setText(walletCollectQrCodeUI.n7(0));
            if (textView3.getVisibility() == 0 && textView.getLineCount() >= 2) {
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams3.bottomMargin = i65.a.b(walletCollectQrCodeUI, 24);
                imageView.setLayoutParams(layoutParams3);
            }
        } else {
            relativeLayout.setVisibility(8);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams4.bottomMargin = i65.a.b(walletCollectQrCodeUI, 32);
            imageView.setLayoutParams(layoutParams4);
        }
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(walletCollectQrCodeUI, new zw1.g4(walletCollectQrCodeUI, linearLayout, l76, o90Var, i19, mu5Var, nu5Var, i19), new zw1.h4(walletCollectQrCodeUI, i19));
    }

    public static void Z6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, android.content.Context context, java.lang.String str, int i17, r45.o90 o90Var) {
        walletCollectQrCodeUI.getClass();
        android.widget.Toast makeText = dp.a.makeText(context, "", 0);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488379rq, null);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487356oe2)).setImageResource(i17);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new zw1.n5(walletCollectQrCodeUI, makeText, o90Var), 750L);
    }

    public static void a7(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.nu5 nu5Var, ww1.a3 a3Var) {
        walletCollectQrCodeUI.getClass();
        boolean z17 = nu5Var != null ? nu5Var.f381686d : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "isNavigateToBusinessQRCodePage: " + z17);
        if (z17) {
            java.lang.String c17 = zw1.n6.c(a3Var);
            androidx.appcompat.app.AppCompatActivity context = walletCollectQrCodeUI.getContext();
            if (nu5Var == null || context == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "navigateToBusinessQRCodePage: saveSuccJumpInfo or context is null");
                return;
            }
            r45.uk4 uk4Var = nu5Var.f381687e;
            if ((uk4Var != null ? uk4Var.f387435h : null) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "navigateToBusinessQRCodePage: waapp_path is null");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("navigateToBusinessAccountQRCodePage - username: ");
            r45.uk4 uk4Var2 = nu5Var.f381687e;
            sb6.append(uk4Var2 != null ? uk4Var2.f387434g : null);
            sb6.append(", path: ");
            r45.uk4 uk4Var3 = nu5Var.f381687e;
            sb6.append(uk4Var3 != null ? uk4Var3.f387435h : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", sb6.toString());
            l81.b1 b1Var = new l81.b1();
            r45.uk4 uk4Var4 = nu5Var.f381687e;
            b1Var.f317012a = uk4Var4 != null ? uk4Var4.f387434g : null;
            b1Var.f317022f = uk4Var4 != null ? uk4Var4.f387435h : null;
            b1Var.f317032k = 1001;
            b1Var.f317028i = new zw1.g6(c17);
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            if (h6Var != null) {
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
                return;
            }
            return;
        }
        r45.jv3 jv3Var = a3Var.Q;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(walletCollectQrCodeUI);
        walletCollectQrCodeUI.G = y1Var;
        y1Var.f212027f.setFocusable(false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(walletCollectQrCodeUI).inflate(com.tencent.mm.R.layout.f488646zg, (android.view.ViewGroup) null);
        walletCollectQrCodeUI.G.k(linearLayout);
        android.widget.Button button = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.b1e);
        android.widget.Button button2 = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.b0e);
        android.widget.Button button3 = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.b0f);
        r45.wf5 wf5Var = jv3Var.f378125f;
        if (wf5Var != null) {
            button2.setText(wf5Var.f389135d);
            button3.setText(jv3Var.f378126g.f389135d);
            button2.setOnClickListener(new zw1.y4(walletCollectQrCodeUI, jv3Var));
            button3.setOnClickListener(new zw1.z4(walletCollectQrCodeUI, jv3Var));
        } else {
            button2.setVisibility(8);
            button3.setVisibility(8);
            button.setText(jv3Var.f378126g.f389135d);
            button.setVisibility(0);
            button.setOnClickListener(new zw1.a5(walletCollectQrCodeUI, jv3Var));
        }
        ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.nrq)).setText(jv3Var.f378123d.f386579e);
        if (jv3Var.f378127h == 0) {
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.nrp);
            textView.setVisibility(0);
            textView.setText(jv3Var.f378124e);
        } else {
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.nrr);
            linearLayout2.setGravity(3);
            java.util.Iterator it = jv3Var.f378128i.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) android.view.LayoutInflater.from(walletCollectQrCodeUI).inflate(com.tencent.mm.R.layout.f488645zf, (android.view.ViewGroup) null);
                ((android.widget.TextView) linearLayout3.findViewById(com.tencent.mm.R.id.c3g)).setText(str);
                linearLayout2.addView(linearLayout3);
            }
        }
        walletCollectQrCodeUI.G.s();
    }

    public static void b7(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17) {
        if (i17 == 2) {
            walletCollectQrCodeUI.f96435d = 2;
            walletCollectQrCodeUI.f96439h.f450137i.setVisibility(0);
            walletCollectQrCodeUI.f96439h.f450125c.post(new zw1.e5(walletCollectQrCodeUI));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 2, java.lang.Integer.valueOf(i17));
        } else {
            walletCollectQrCodeUI.f96435d = 1;
            walletCollectQrCodeUI.f96438g.f450137i.setVisibility(0);
            walletCollectQrCodeUI.f96438g.f450125c.post(new zw1.p5(walletCollectQrCodeUI));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 1, java.lang.Integer.valueOf(i17));
        }
        walletCollectQrCodeUI.h7(i17, false);
    }

    public static void c7(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.b3 b3Var) {
        walletCollectQrCodeUI.getClass();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(270.0f, 90.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new zw1.u5(walletCollectQrCodeUI, b3Var));
        ofFloat.start();
        b3Var.f450122a0.setVisibility(8);
        b3Var.f450125c.callOnClick();
    }

    public final void A7(int i17) {
        this.f96438g.f450123b.setVisibility(i17);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f96438g.f450140l.getLayoutParams();
        layoutParams.topMargin = i65.a.b(this, i17 == 0 ? 32 : 64);
        this.f96438g.f450140l.setLayoutParams(layoutParams);
        if (i17 != 8) {
            this.f96438g.f450137i.setBackgroundResource(com.tencent.mm.R.drawable.f481281pd);
            this.f96438g.f450138j.setBackgroundResource(com.tencent.mm.R.drawable.f481281pd);
            this.f96438g.f450139k.setBackgroundResource(com.tencent.mm.R.drawable.f481281pd);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f96438g.f450137i.getLayoutParams();
            layoutParams2.height = -2;
            this.f96438g.f450137i.setLayoutParams(layoutParams2);
            this.f96438g.f450137i.setBackgroundResource(com.tencent.mm.R.drawable.f481272p4);
            this.f96438g.f450138j.setBackgroundResource(com.tencent.mm.R.drawable.f481272p4);
            this.f96438g.f450139k.setBackgroundResource(com.tencent.mm.R.drawable.f481272p4);
        }
    }

    public final void B7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        ((ku5.t0) ku5.t0.f312615d).B(new zw1.k4(this, l76, i17, m76));
    }

    public final void C7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(l7(i17).f450088a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUI", "[refreshView], qrcode_url is null.");
            return;
        }
        B7(i17);
        int i18 = i17 == 0 ? this.f96435d : i17;
        ww1.a3 l76 = l7(i18);
        ww1.b3 m76 = m7(i18);
        java.lang.String string = getString(com.tencent.mm.R.string.b_n);
        com.tencent.mm.wallet_core.ui.r1.w0(m76.f450150v, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0(6, new zw1.r3(this, l76, i18)), getContext());
        I7(i17);
        H7(i17);
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l77 = l7(i17);
        ww1.b3 m77 = m7(i17);
        r45.uk4 uk4Var = l77.f450098h;
        android.widget.LinearLayout linearLayout = m77.C;
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = m77.D;
        android.widget.TextView textView = m77.E;
        android.widget.TextView textView2 = m77.F;
        android.widget.ImageView imageView = m77.G;
        if (uk4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387432e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "empty item return");
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            cdnImageView.setVisibility(8);
            textView.setText(uk4Var.f387432e);
            if (com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387436i)) {
                textView2.setVisibility(4);
            } else {
                textView2.setText(uk4Var.f387436i);
                textView2.setVisibility(0);
            }
            if (uk4Var.f387437m == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            linearLayout.setOnClickListener(new zw1.l4(this, uk4Var, textView2, imageView));
            int i19 = uk4Var.f387431d;
            if (i19 == 1) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(14526, 1, 1, uk4Var.f387432e, "", "", "", 1);
                if (uk4Var.f387437m == 1) {
                    g0Var.d(14526, 3, 1, uk4Var.f387432e, "", "", "", 1);
                }
            } else if (i19 == 2) {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.d(14526, 1, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 1);
                if (uk4Var.f387437m == 1) {
                    g0Var2.d(14526, 3, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 1);
                }
            } else if (i19 == 3) {
                com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var3.d(14526, 1, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 1);
                if (uk4Var.f387437m == 1) {
                    g0Var3.d(14526, 3, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 1);
                }
            }
        }
        if (this.f96436e != null) {
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((zw1.n2) pf5.z.f353948a.a(activity).a(zw1.n2.class)).Q6(this.f96435d, this.f96439h, this.f96444p, this.f96436e.K);
        }
        ww1.a3 l78 = l7(0);
        r45.r1 c17 = at4.g0.c();
        int i27 = l78.f450101k > 0.0d ? 33 : 32;
        if (c17 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13447, java.lang.Integer.valueOf(i27), c17.f384412i, c17.f384413m, l78.f450088a, java.lang.Double.valueOf(l78.f450101k), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), java.lang.Long.valueOf(c17.f384411h), c17.f384414n, c17.f384415o);
        }
    }

    public void D7(ww1.a3 a3Var) {
        a3Var.f450099i = "";
        a3Var.f450101k = 0.0d;
        a3Var.f450103m = "";
        a3Var.f450104n = "";
        a3Var.f450105o = false;
        a3Var.f450100j = null;
    }

    @Override // ww1.u
    public void E4(ww1.g2 g2Var) {
        java.util.List list;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onRecv PayerMsg]，newMsg.msgType：%s", java.lang.Integer.valueOf(g2Var.f450204p));
        int i17 = g2Var.f450204p;
        if (i17 != 9 && i17 != 50) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "not target type");
            return;
        }
        boolean z18 = true;
        int i18 = i17 == 50 ? 2 : 1;
        ww1.a3 l76 = l7(i18);
        ww1.b3 m76 = m7(i18);
        android.os.Vibrator vibrator = this.f96453y;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
        if (g2Var.f450199h < this.f96452x) {
            return;
        }
        int i19 = 0;
        while (true) {
            int size = ((java.util.LinkedList) l76.f450113w).size();
            list = l76.f450113w;
            if (i19 >= size) {
                z17 = false;
                break;
            }
            if (g2Var.f450201m == 0) {
                java.lang.String str = g2Var.f450195d;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                if (str.equals(((ww1.b0) ((java.util.LinkedList) list).get(i19)).f450195d) && ((ww1.b0) ((java.util.LinkedList) list).get(i19)).f450201m == 2) {
                    ((java.util.LinkedList) list).remove(i19);
                    ((java.util.LinkedList) list).add(i19, new ww1.b0(g2Var));
                    break;
                }
            }
            if (!g2Var.f450196e.equals(((ww1.b0) ((java.util.LinkedList) list).get(i19)).f450196e)) {
                i19++;
            } else if (((ww1.b0) ((java.util.LinkedList) list).get(i19)).f450201m == 0) {
                ((ww1.b0) ((java.util.LinkedList) list).get(i19)).f450201m = g2Var.f450201m;
                ((ww1.b0) ((java.util.LinkedList) list).get(i19)).f450197f = g2Var.f450197f;
                ((ww1.b0) ((java.util.LinkedList) list).get(i19)).f450198g = g2Var.f450198g;
                if (g2Var.f450201m == 1) {
                    com.tencent.mm.sdk.platformtools.u3.h(new zw1.n4(this, m76, l76, i19));
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
                if (g2Var.f450199h > ((ww1.g2) ((java.util.LinkedList) list).get(i27)).f450199h) {
                    ((java.util.LinkedList) list).add(i27, new ww1.b0(g2Var));
                    break;
                }
                i27++;
            }
            if (!z18) {
                ((java.util.LinkedList) list).add(new ww1.b0(g2Var));
            }
        }
        if (l76.f450114x == null) {
            ww1.c0 c0Var = new ww1.c0(getContext(), i18);
            l76.f450114x = c0Var;
            m76.M.setAdapter(c0Var);
        }
        l76.f450114x.f450161e = list;
        m76.N.f450345d = l76;
        if (((java.util.LinkedList) list).size() > 0) {
            com.tencent.mm.sdk.platformtools.u3.h(new zw1.o4(this, m76, i18));
        }
    }

    public final void E7(int i17, android.widget.TextView textView) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l76.f450103m)) {
            textView.setVisibility(8);
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.String str = l76.f450103m;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        textView.setVisibility(0);
    }

    public final void F7(int i17, android.widget.TextView textView) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        java.lang.String str = l76.f450104n;
        if (l76.f450105o && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getString(com.tencent.mm.R.string.b_h);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        textView.setVisibility(0);
    }

    public final void G7(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "setMoneyResult");
        int intExtra = intent.getIntExtra("key_type", this.f96435d);
        ww1.a3 l76 = l7(intExtra);
        double j17 = com.tencent.mm.wallet_core.ui.r1.j("" + intent.getIntExtra("ftf_fixed_fee", 0), "100", 2, java.math.RoundingMode.HALF_UP);
        java.lang.String stringExtra = intent.getStringExtra("ftf_fixed_desc");
        java.lang.String stringExtra2 = intent.getStringExtra("ftf_fixed_desc_placeholder");
        boolean booleanExtra = intent.getBooleanExtra("ftf_fixed_desc_required", false);
        if (w7(j17, stringExtra, booleanExtra, stringExtra2)) {
            l76.f450099i = intent.getStringExtra("ftf_pay_url");
            l76.f450106p = intent.getIntExtra("key_error_level", -1);
            l76.f450101k = j17;
            l76.f450102l = intent.getStringExtra("ftf_fixed_fee_type");
            l76.f450107q = intent.getStringExtra("key_currency_unit");
            l76.f450103m = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 4, java.lang.Integer.valueOf(intExtra));
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 5, java.lang.Integer.valueOf(intExtra));
            }
            l76.f450104n = stringExtra2;
            l76.f450105o = booleanExtra;
            if (intExtra == 2) {
                java.lang.String stringExtra3 = intent.getStringExtra("key_save_notify_info");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                    l76.f450100j = new com.tencent.mm.protobuf.g(stringExtra3.getBytes());
                }
            }
            l76.E = java.lang.System.currentTimeMillis();
        } else {
            l76.f450088a = intent.getStringExtra("ftf_pay_url");
            l76.f450094d = intent.getIntExtra("key_error_level", -1);
            l76.D = java.lang.System.currentTimeMillis();
            if (intExtra == 2) {
                java.lang.String stringExtra4 = intent.getStringExtra("key_save_notify_info");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                    l76.f450090b = new com.tencent.mm.protobuf.g(stringExtra4.getBytes());
                }
            }
            D7(l76);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "setMoneyResult，url：%s，fee：%s ，desc：%s ，desc：placeholder：%s", l76.f450099i, java.lang.Double.valueOf(l76.f450101k), l76.f450103m, l76.f450104n);
        if (!l76.L) {
            int i17 = intExtra == 0 ? this.f96435d : intExtra;
            ww1.a3 l77 = l7(i17);
            ww1.b3 m76 = m7(i17);
            java.lang.String string = getString(com.tencent.mm.R.string.b_8);
            com.tencent.mm.wallet_core.ui.r1.w0(m76.f450151w, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0(6, new zw1.u3(this, l77, i17)), getContext());
        }
        O7(intExtra);
    }

    public final void H7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        java.util.LinkedList<r45.uk4> linkedList = l76.f450097g;
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "menuItems == null");
            return;
        }
        java.lang.String string = getString(com.tencent.mm.R.string.b_b);
        com.tencent.mm.wallet_core.ui.r1.w0(m76.f450152x, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0(6, new zw1.x3(this, i17, linkedList)), getContext());
        for (r45.uk4 uk4Var : linkedList) {
            int i18 = uk4Var.f387431d;
            if (i18 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 1, uk4Var.f387432e, "", "", "", 1);
            } else if (i18 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 1);
            } else if (i18 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 1);
            }
        }
    }

    public final void I7(int i17) {
        java.lang.String string;
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l76.M)) {
            string = l76.L ? getString(com.tencent.mm.R.string.b_9) : getString(com.tencent.mm.R.string.b_7);
            r45.hk5 hk5Var = l76.f450093c0;
            if (hk5Var != null && hk5Var.f376247d) {
                string = getString(com.tencent.mm.R.string.b_9);
            }
        } else {
            string = l76.M;
        }
        java.lang.String str = string;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[setSetMoneyTv]，needRefreshType：%s, receive_option_entrance:%s ", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(l76.L));
        com.tencent.mm.wallet_core.ui.r1.w0(m76.f450151w, str, 0, str.length(), new com.tencent.mm.wallet_core.ui.a0(6, new zw1.s3(this, i17, l76)), getContext());
    }

    public final boolean J7() {
        ww1.a3 a3Var = this.f96437f;
        return (a3Var == null || a3Var.S != 5 || a3Var.Z == null) ? false : true;
    }

    public final void K7(r45.vf5 vf5Var) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var;
        if (vf5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "actionInfo is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "actionInfo.action_type：%s", java.lang.Integer.valueOf(vf5Var.f388187d));
        int i17 = vf5Var.f388187d;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 == 2) {
                    L7(vf5Var.f388189f, 0, false, null);
                    return;
                }
                if (i17 != 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknow actionInfo.action_type");
                    return;
                }
                r45.ln lnVar = vf5Var.f388190g;
                if (lnVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", " bottomCell == null");
                    return;
                }
                this.B = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, true);
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setGravity(17);
                textView.setHeight(i65.a.b(getContext(), 56));
                textView.setTextSize(12.0f);
                textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_1));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(lnVar.f379647d)) {
                    textView.setText(lnVar.f379647d);
                    this.B.s(textView, false);
                    this.B.Z1 = true;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = this.B;
                k0Var.f211872n = new zw1.l5(this, lnVar);
                k0Var.f211881s = new zw1.m5(this, lnVar);
                k0Var.v();
                return;
            }
            r45.jv3 jv3Var = vf5Var.f388188e;
            if (jv3Var == null || ((z2Var = this.A) != null && z2Var.h())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "mHalfBottomDialog != null || mHalfBottomDialog.isShowing() || halfPage == null ");
                return;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.B;
            if (k0Var2 != null && k0Var2.i()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "mBottomSheet != null && mBottomSheet.isShowing()");
                return;
            }
            ww1.a3 l76 = l7(0);
            r45.wf5 wf5Var = jv3Var.f378125f;
            r45.wf5 wf5Var2 = jv3Var.f378126g;
            l76.f450112v = 4;
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 1, 3);
            this.A = z2Var2;
            z2Var2.m(wf5Var.f389135d, wf5Var2.f389135d);
            com.tencent.mm.ui.widget.dialog.z2 z2Var3 = this.A;
            zw1.d5 d5Var = new zw1.d5(this, l76, wf5Var);
            zw1.f5 f5Var = new zw1.f5(this, l76, wf5Var2);
            z2Var3.D = d5Var;
            z2Var3.E = f5Var;
            if (jv3Var.f378123d.f386578d == 2) {
                android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.z_, null);
                ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.aa_)).setOnClickListener(new zw1.g5(this));
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c2l);
                textView2.setText(jv3Var.f378123d.f386579e);
                com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                this.A.s(inflate);
            } else {
                android.view.View inflate2 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488639z9, null);
                android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.gwd);
                textView3.setText(jv3Var.f378123d.f386579e);
                com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                this.A.s(inflate2);
            }
            android.view.View inflate3 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488638z8, null);
            ((android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.gw8)).setText(jv3Var.f378124e);
            this.A.j(inflate3);
            this.A.C();
        }
    }

    public final void L7(r45.o90 o90Var, int i17, boolean z17, l81.e1 e1Var) {
        if (o90Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", " coverInfo == null");
            return;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        l76.f450089a0 = z17;
        m76.O.setVisibility(0);
        m76.O.setOnClickListener(new zw1.h5(this));
        m76.R.setText(o90Var.f382043d);
        m76.S.setVisibility(8);
        if (i17 == 2 && J7()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 20, java.lang.Integer.valueOf(i17));
            ((android.widget.LinearLayout.LayoutParams) m76.R.getLayoutParams()).setMargins(i65.a.b(getContext(), 60), i65.a.b(getContext(), 24), i65.a.b(getContext(), 60), 0);
            m76.S.setVisibility(0);
            m76.S.removeAllViews();
            r45.o90 o90Var2 = l76.Z;
            if (o90Var2 != null && o90Var2.f382047h != null) {
                for (int i18 = 0; i18 < l76.Z.f382047h.size(); i18++) {
                    java.lang.String str = (java.lang.String) l76.Z.f382047h.get(i18);
                    android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dpq, (android.view.ViewGroup) null);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483790rg4)).setText(str);
                    m76.S.addView(inflate);
                    if (i18 != 0) {
                        ((android.widget.LinearLayout.LayoutParams) inflate.getLayoutParams()).setMargins(0, i65.a.b(getContext(), 8), 0, 0);
                    }
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = m76.O.getLayoutParams();
        if (z17) {
            m76.f450139k.postDelayed(new zw1.i5(this, m76, layoutParams, l76), 20L);
        } else {
            m76.f450139k.getHeight();
            m76.C.getHeight();
            i65.a.b(getContext(), 1);
            layoutParams.height = (m76.f450139k.getHeight() - m76.C.getHeight()) - i65.a.b(getContext(), 1);
            m76.O.setLayoutParams(layoutParams);
            m76.O.setBackgroundResource(com.tencent.mm.R.drawable.c0t);
            m76.P.setBackgroundResource(com.tencent.mm.R.drawable.c0u);
        }
        m76.T.setText(o90Var.f382044e.f389135d);
        m76.T.setOnClickListener(new zw1.j5(this, i17, o90Var, e1Var));
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) m76.Q.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) m76.T.getLayoutParams();
        if (o90Var.f382046g == 0) {
            layoutParams2.topMargin = i65.a.b(getContext(), 36);
            layoutParams3.topMargin = i65.a.b(getContext(), 36);
            m76.U.setVisibility(0);
            m76.U.setText(o90Var.f382045f.f389135d);
            m76.U.setOnClickListener(new zw1.k5(this, o90Var, e1Var));
        } else {
            if (m76.f450123b.getVisibility() == 0) {
                layoutParams2.topMargin = i65.a.b(getContext(), 48);
            } else {
                layoutParams2.topMargin = i65.a.b(getContext(), 80);
            }
            if (J7()) {
                layoutParams3.topMargin = i65.a.b(getContext(), 48);
                layoutParams3.bottomMargin = i65.a.b(getContext(), 64);
            } else {
                layoutParams3.topMargin = i65.a.b(getContext(), 64);
            }
            m76.U.setVisibility(8);
        }
        m76.Q.setLayoutParams(layoutParams2);
        m76.T.setLayoutParams(layoutParams3);
    }

    public void M7(ww1.a3 a3Var, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "startQrcodeCollectionSettingPage");
        if (!a3Var.L) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(getContext(), com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI.class);
            intent.putExtra("key_currency_unit", a3Var.f450107q);
            intent.putExtra("key_type", i17);
            if (a3Var.T && i17 == 2) {
                intent.putExtra("ftf_fixed_current_shop_id", a3Var.U);
            }
            startActivityForResult(intent, 4096);
            return;
        }
        r45.gk5 gk5Var = a3Var.N;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "qrcode setting page-title data，title：%s  subTitle：%s fillTitle：%s  fillHint：%s", gk5Var.f375319d, gk5Var.f375320e, gk5Var.f375321f, gk5Var.f375322g);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "qrcode setting page-money data，fee：%s desc：%s desc_required：%s desc_placeholder：%s", java.lang.Double.valueOf(a3Var.f450101k), a3Var.f450103m, java.lang.Boolean.valueOf(a3Var.f450105o), a3Var.f450104n);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_type", i17);
        intent2.putExtra("key_payer_desc_switch_title", a3Var.N.f375319d);
        intent2.putExtra("key_payer_desc_switch_sub_title", a3Var.N.f375320e);
        intent2.putExtra("key_payer_desc_fill_title", a3Var.N.f375321f);
        intent2.putExtra("key_payer_desc_fill_hint", a3Var.N.f375322g);
        intent2.putExtra("key_currency_unit", a3Var.f450107q);
        intent2.putExtra("ftf_fixed_fee", com.tencent.mm.wallet_core.ui.r1.i0(a3Var.f450101k + "", "100"));
        intent2.putExtra("ftf_fixed_desc", a3Var.f450103m);
        intent2.putExtra("ftf_fixed_desc_required", a3Var.f450105o);
        intent2.putExtra("ftf_fixed_desc_placeholder", a3Var.f450104n);
        if (a3Var.T && i17 == 2) {
            intent2.putExtra("ftf_fixed_current_shop_id", a3Var.U);
        }
        ((h45.q) i95.n0.c(h45.q.class)).startQrcodeCollectionSettingUseCase(intent2, new zw1.t3(this, i17));
    }

    public final void N7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[startShortTermQrCodeErrorTimer]，needRefreshType：%s", java.lang.Integer.valueOf(i17));
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        if (i17 == 2 && !v7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "do not has mch code,return");
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = l76.B;
        if (b4Var == null) {
            l76.B = new com.tencent.mm.sdk.platformtools.b4(new zw1.r5(this, l76, m76), false);
        } else {
            b4Var.d();
        }
        l76.B.c(3000L, 3000L);
    }

    public final void O7(int i17) {
        ww1.a3 l76 = l7(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[startShortTermQrCodeTimer]，needRefreshType：%s dataModel.refresh_url_interval:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(l76.f450116z));
        if (i17 == 2 && !v7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "do not has mch code，return");
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = l76.A;
        if (b4Var == null) {
            l76.A = new com.tencent.mm.sdk.platformtools.b4(new zw1.q5(this, i17), false);
        } else {
            b4Var.d();
        }
        if (l76.f450116z < 60) {
            l76.f450116z = 60;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = l76.A;
        long j17 = l76.f450116z * 1000;
        b4Var2.c(j17, j17);
    }

    public final void U6(r45.wf5 wf5Var, l81.e1 e1Var) {
        if (wf5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", " buttonInfo == null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[ClickButtonAction]，buttonInfoType:%s，mCollectType：%s", java.lang.Integer.valueOf(wf5Var.f389136e), java.lang.Integer.valueOf(this.f96435d));
        ww1.b3 m76 = m7(0);
        switch (wf5Var.f389136e) {
            case 1:
                if (m76.O.isShown()) {
                    m76.O.setVisibility(8);
                }
                com.tencent.mm.ui.widget.dialog.z2 z2Var = this.A;
                if (z2Var != null) {
                    z2Var.B();
                    break;
                }
                break;
            case 2:
                if (this.M == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 12, java.lang.Integer.valueOf(this.f96435d));
                }
                if (this.M == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 15, java.lang.Integer.valueOf(this.f96435d));
                }
                j7(0, null);
                break;
            case 3:
                if (this.M == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 14, java.lang.Integer.valueOf(this.f96435d));
                }
                com.tencent.mm.wallet_core.ui.r1.V(getContext(), wf5Var.f389137f, true);
                break;
            case 4:
                r45.sm4 sm4Var = wf5Var.f389138g;
                com.tencent.mm.wallet_core.ui.r1.c0(sm4Var.f385847d, sm4Var.f385848e, 0, 1072, e1Var);
                break;
            case 5:
                L7(wf5Var.f389139h, 0, false, null);
                break;
            case 6:
                j7(0, wf5Var.f389139h);
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
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknow buttonInfo.type");
                break;
        }
        int i17 = this.M;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20032, "wxface2face", "ClickHalfDialogButton", "", "", "", "", 4, 0, java.lang.Integer.valueOf(wf5Var.f389136e), q7(), java.lang.Integer.valueOf(s7(0)), r7(0));
        } else if (i17 != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknow clickButtonSource");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20032, "wxface2face", "ClickCoverPageButton", "", "", "", "", 5, 0, java.lang.Integer.valueOf(wf5Var.f389136e), q7(), java.lang.Integer.valueOf(s7(0)), r7(0));
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (this.f96435d == 2) {
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
        com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText = (com.tencent.mm.ui.widget.edittext.PasterEditText) this.F.findViewById(com.tencent.mm.R.id.c3k);
        pasterEditText.setText(editable.toString().substring(0, 16));
        java.lang.String substring = editable.toString().substring(0, 16);
        l76.P = substring;
        pasterEditText.setSelection(substring.length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    public final android.graphics.Bitmap d7(int i17, java.lang.String str, java.lang.String str2, int i18) {
        int d17 = com.tencent.mm.sdk.platformtools.j.d(this, 206.0f);
        y60.e eVar = this.P;
        return i17 == 2 ? ww1.y2.a(this, str, c01.z1.r(), str2, true, d17, eVar, true, i18, 0.0f, false, 0.0d) : ww1.y2.a(this, str, c01.z1.r(), "", true, d17, eVar, false, i18, 0.0f, true, 0.0d);
    }

    public final void e7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "doApplyQrCode，mCollectType：%s", java.lang.Integer.valueOf(this.f96435d));
        if (this.f96435d == 2) {
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
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetQrCodeConfig]");
        if (i17 == 0) {
            ww1.a3 a3Var = this.f96436e;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeLogic", "[getPersonalConfig]");
            r45.hw hwVar = new r45.hw();
            java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_WX_PAY_COLLECT_QRCODE_CONFIG_STRING_SYNC, null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeLogic", "getConfig failed");
            } else {
                try {
                    hwVar.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeLogic", "getConfig success");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeLogic", "parse fail, " + e17.getLocalizedMessage());
                }
            }
            ww1.c3.a(a3Var, hwVar, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f96436e.f450088a)) {
                z7(-1);
            }
        }
        ww1.y2.f(this.f96438g, this.f96436e, getContext());
        pq5.g l17 = new ww1.k().l();
        l17.f(this);
        l17.h(new zw1.p3(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
    }

    public final void g7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetQrCodeMchConfig] scene:%s", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            x7(-1);
        }
        if (i17 != 0 && i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            return;
        }
        ww1.y2.f(this.f96439h, this.f96437f, getContext());
        pq5.g l17 = new ww1.l(0).l();
        l17.f(this);
        l17.h(new zw1.q3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488652zm;
    }

    public void h7(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetShortTermQrcode]，needRefreshType：%s", java.lang.Integer.valueOf(i17));
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        long j17 = w7(l76.f450101k, l76.f450103m, l76.f450105o, l76.f450104n) ? l76.E : l76.D;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!z17 && currentTimeMillis - j17 < ((l76.f450116z * 1000) - 3000) - 500) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "do not refresh：hardRefresh or overtime");
            return;
        }
        if (!com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.isForeground()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "do not refresh：is not in Foreground");
            return;
        }
        if (i17 == 1) {
            if (m76.V.getVisibility() == 0) {
                ww1.y2.f(m76, l76, getContext());
            }
            l76.C = false;
            N7(i17);
            pq5.g l17 = new ww1.i(s7(i17), n7(i17), r7(i17), l76.f450105o, o7(i17), 0).l();
            l17.f(this);
            l17.h(new zw1.s5(this, l76, i17, m76));
            return;
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            return;
        }
        if (!v7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetShortTermQrCode] do not has mch code,retrun ");
            return;
        }
        if (m76.V.getVisibility() == 0) {
            ww1.y2.f(m76, l76, getContext());
        }
        l76.C = false;
        N7(i17);
        pq5.g l18 = new ww1.j(s7(i17), n7(i17), r7(i17), l76.f450105o, o7(i17), 0, l76.T ? l76.U : 0L).l();
        l18.f(this);
        l18.h(new zw1.t5(this, l76, i17, m76));
    }

    public void i7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doGetVoiceSwitchMch]");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96437f.f450088a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUI", "qrcode_url is null.");
            return;
        }
        ww1.a3 a3Var = this.f96437f;
        pq5.g l17 = new ww1.q(1, a3Var.T ? a3Var.U : 0L).l();
        l17.f(this);
        l17.h(new zw1.y3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalite190b0cf18204487696c6d9890f89c090@pay", new zw1.w5(this, this));
        setMMTitle(com.tencent.mm.R.string.hdw);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.c58);
        this.f96440i = viewGroup;
        viewGroup.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        ((android.widget.ScrollView) findViewById(com.tencent.mm.R.id.c5_)).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        this.f96441m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.c4p);
        this.f96442n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c4o);
        gm0.j1.i();
        this.f96435d = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_TYPE_INT_SYNC, 1)).intValue();
        ww1.b3 b3Var = new ww1.b3();
        this.f96438g = b3Var;
        b3Var.a(findViewById(com.tencent.mm.R.id.c4m), getContext(), 1);
        this.f96438g.N = new ww1.x2(1, getContext(), this.f96436e, this.f96438g, this);
        this.f96438g.f450125c.setOnClickListener(new zw1.x5(this));
        this.f96438g.f450124b0.setOnClickListener(new zw1.y5(this));
        ww1.b3 b3Var2 = new ww1.b3();
        this.f96439h = b3Var2;
        b3Var2.a(findViewById(com.tencent.mm.R.id.c4l), getContext(), 2);
        this.f96439h.N = new ww1.x2(2, getContext(), this.f96437f, this.f96439h, this);
        this.f96444p = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.c4g);
        this.f96445q = findViewById(com.tencent.mm.R.id.c4e);
        this.f96446r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c4i);
        this.f96447s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c4f);
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
        this.H = f5Var;
        f5Var.f210400e = new zw1.z5(this);
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((zw1.t2) pf5.z.f353948a.a(activity).a(zw1.t2.class)).getClass();
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "8";
        walletGetBulletinEvent.f192364d = new zw1.a6(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
    }

    public final void j7(int i17, r45.o90 o90Var) {
        int i18 = i17 == 0 ? this.f96435d : i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[doSaveQrCode] mCollectType：%s", java.lang.Integer.valueOf(i18));
        ww1.a3 l76 = l7(i18);
        r45.r1 c17 = at4.g0.c();
        if (c17 == null) {
            c17 = new r45.r1();
        }
        if (i18 == 1) {
            pq5.g l17 = new ww1.m(l76.f450101k, l76.f450102l, l76.P, c17.f384412i, c17.f384413m, java.lang.String.valueOf(c17.f384411h), p7(0), r7(i18), l76.f450105o, o7(i18)).l();
            l17.f(this);
            l17.h(new zw1.c4(this, o90Var, i18));
        } else {
            if (i18 != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
                return;
            }
            pq5.g l18 = new ww1.n(l76.f450101k, l76.f450102l, l76.P, c17.f384412i, c17.f384413m, java.lang.String.valueOf(c17.f384411h), p7(0), r7(i18), l76.f450105o, o7(i18)).l();
            l18.f(this);
            l18.h(new zw1.d4(this, o90Var, i18));
        }
    }

    public final void k7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        int s76 = s7(i17);
        java.lang.String r76 = r7(i17);
        int i18 = l76.f450112v;
        ww1.a3 l77 = l7(i17 == 0 ? this.f96435d : i17);
        java.lang.String str = "";
        if (w7(l77.f450101k, l77.f450103m, l77.f450105o, l77.f450104n)) {
            if (i18 == 1) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l77.f450099i)) {
                    str = l77.f450099i;
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(l77.f450109s)) {
                str = l77.f450109s;
            }
        } else if (i18 == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l77.f450088a)) {
                str = l77.f450088a;
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(l77.f450108r)) {
            str = l77.f450108r;
        }
        java.lang.String str2 = str;
        com.tencent.mm.protobuf.g p76 = p7(i17);
        boolean z17 = l76.f450105o;
        java.lang.String o76 = o7(i17);
        if (i17 == 1) {
            pq5.g l17 = new ww1.o(l76.f450112v, s76, r76, str2, p76, z17, o76).l();
            l17.f(this);
            l17.h(new zw1.b5(this));
        } else {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
                return;
            }
            pq5.g l18 = new ww1.p(l76.f450112v, s76, r76, str2, p76, z17, o76).l();
            l18.f(this);
            l18.h(new zw1.c5(this));
        }
    }

    public final ww1.a3 l7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        return i17 == 2 ? this.f96437f : this.f96436e;
    }

    public final ww1.b3 m7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        return i17 == 2 ? this.f96439h : this.f96438g;
    }

    public java.lang.String n7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        l7(i17).f450102l = "CNY";
        return com.tencent.mm.wallet_core.ui.r1.w("CNY");
    }

    public final java.lang.String o7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        return !com.tencent.mm.sdk.platformtools.t8.K0(l76.f450104n) ? l76.f450104n : "";
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onActivityResult]，mCollectType：%s", java.lang.Integer.valueOf(this.f96435d));
        int i19 = this.f96435d;
        if (intent != null) {
            i19 = intent.getIntExtra("key_type", i19);
            if (i19 == 0) {
                i19 = this.f96435d;
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

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.hdw);
        setIsDarkActionbarBg(true);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        getContentView().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        setActionbarElementColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        hideActionbarLine();
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        setBackBtn(new zw1.p4(this));
        initView();
        int b17 = i65.a.b(this, 49);
        int b18 = i65.a.b(this, 238);
        Q = b17 + b18 + i65.a.b(this, 77) + i65.a.b(this, 60);
        this.f96436e = new ww1.a3();
        this.f96437f = new ww1.a3();
        f7(0);
        g7(0);
        this.f96454z = c01.z1.j();
        this.f96453y = (android.os.Vibrator) getSystemService("vibrator");
        this.f96452x = com.tencent.mm.sdk.platformtools.t8.i1();
        java.util.LinkedList linkedList = (java.util.LinkedList) tw1.f.Di().Ni().f450311d;
        if (!linkedList.contains(this)) {
            linkedList.add(this);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14021, 2, java.lang.Integer.valueOf(getIntent().getIntExtra("key_from_scene", 1)));
        com.tencent.mm.wallet_core.model.n1.d(16, 0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onDestroy]，mCollectType：%s", java.lang.Integer.valueOf(this.f96435d));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_TYPE_INT_SYNC, java.lang.Integer.valueOf(this.f96435d));
        android.graphics.Bitmap bitmap = l7(2).f450111u;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        ww1.a3 l76 = l7(2);
        com.tencent.mm.sdk.platformtools.b4 b4Var = l76.A;
        if (b4Var != null) {
            b4Var.d();
            l76.A = null;
        }
        android.graphics.Bitmap bitmap2 = l7(1).f450111u;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bitmap2.recycle();
        }
        ww1.a3 l77 = l7(1);
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = l77.A;
        if (b4Var2 != null) {
            b4Var2.d();
            l77.A = null;
        }
        this.f96453y.cancel();
        ((java.util.LinkedList) tw1.f.Di().Ni().f450311d).remove(this);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        y60.e eVar = this.P;
        ((x60.e) fVar).getClass();
        x51.w0.e(eVar);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().r(this.f96450v);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().r(this.f96451w);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes != null) {
            attributes.screenBrightness = -1.0f;
            getWindow().setAttributes(attributes);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        this.H.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[checkShortTermQrCodeTiming]，pageScene：%s", java.lang.Integer.valueOf(this.N));
        if (this.N != 2) {
            this.N = 2;
        } else {
            h7(1, false);
            h7(2, false);
        }
        if (this.f96443o) {
            g7(0);
            this.f96443o = false;
        }
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes == null || attributes.screenBrightness >= 0.85f) {
            return;
        }
        attributes.screenBrightness = 0.85f;
        getWindow().setAttributes(attributes);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.H.f();
        }
    }

    public final com.tencent.mm.protobuf.g p7(int i17) {
        com.tencent.mm.protobuf.g gVar;
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        return (w7(l76.f450101k, l76.f450103m, l76.f450105o, l76.f450104n) && (gVar = l76.f450100j) != null && i17 == 2) ? gVar : l76.f450090b;
    }

    public final java.lang.String q7() {
        ww1.a3 l76 = l7(0);
        return w7(l76.f450101k, l76.f450103m, l76.f450105o, l76.f450104n) ? com.tencent.mm.sdk.platformtools.t8.K0(l76.f450099i) ? "" : l76.f450099i : com.tencent.mm.sdk.platformtools.t8.K0(l76.f450088a) ? "" : l76.f450088a;
    }

    public final java.lang.String r7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        return !com.tencent.mm.sdk.platformtools.t8.K0(l76.f450103m) ? l76.f450103m : "";
    }

    public final int s7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        if (l76.f450101k <= 0.0d || com.tencent.mm.sdk.platformtools.t8.J0(m76.f450145q.a())) {
            return 0;
        }
        return com.tencent.mm.wallet_core.ui.r1.i0(l76.f450101k + "", "100");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.addAll(super.importUIComponents());
        hashSet.add(zw1.t2.class);
        hashSet.add(zw1.q2.class);
        hashSet.add(zw1.n2.class);
    }

    public final r45.bj4 t7(java.util.LinkedList linkedList, java.lang.Long l17) {
        if (linkedList == null) {
            return null;
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            if (l17.longValue() == ((r45.bj4) linkedList.get(i17)).f370804d) {
                return (r45.bj4) linkedList.get(i17);
            }
        }
        return null;
    }

    public final android.text.SpannableStringBuilder u7(int i17) {
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l76.f450092c)) {
            java.lang.String q17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q();
            l76.f450092c = q17;
            l76.f450092c = com.tencent.mm.wallet_core.ui.r1.y(q17);
        }
        if (i17 != 2) {
            java.lang.String x17 = com.tencent.mm.wallet_core.ui.r1.x(c01.z1.r());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l76.f450092c)) {
                x17 = x17 + getString(com.tencent.mm.R.string.b_m, l76.f450092c);
            }
            return new android.text.SpannableStringBuilder(x17);
        }
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.drawable.c6v);
        drawable.setBounds(0, 0, com.tencent.mm.ui.zk.a(getContext(), 44), com.tencent.mm.ui.zk.a(getContext(), 20));
        al5.w wVar = new al5.w(drawable, 1);
        r45.bj4 t76 = t7(l76.V, java.lang.Long.valueOf(l76.U));
        java.lang.String str = t76 != null ? t76.f370805e : "";
        if (!l76.T || i17 != 2) {
            str = l76.f450092c;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str + "  ");
        spannableStringBuilder.setSpan(wVar, str.length() + 1, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public final boolean v7() {
        int i17;
        return (this.f96439h.f450121a.getVisibility() != 0 || (i17 = this.f96437f.S) == 4 || i17 == 5) ? false : true;
    }

    public final boolean w7(double d17, java.lang.String str, boolean z17, java.lang.String str2) {
        boolean z18 = d17 > 0.0d;
        boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
        boolean z27 = z17 || !com.tencent.mm.sdk.platformtools.t8.K0(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "isFixedMode：fee：%s desc:%s desc_required:%s desc_placeholder:%s", java.lang.Double.valueOf(d17), str, java.lang.Boolean.valueOf(z17), str2);
        return z18 || z19 || z27;
    }

    public final void x7(int i17) {
        ww1.y2.c(this.f96437f);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[checkMchEntranceView] entrance_type:%s", java.lang.Integer.valueOf(this.f96437f.S));
        if (this.f96450v != null) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().r(this.f96450v);
            this.f96450v = null;
        }
        this.f96450v = new zw1.f6(this, this.f96437f.S);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f96450v);
        int i18 = this.f96437f.S;
        if (i18 == 2) {
            this.f96435d = 1;
            this.f96444p.setVisibility(0);
            android.view.View view = this.f96439h.f450121a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            A7(8);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f96437f.X.f381190e)) {
                this.f96446r.setText(this.f96437f.X.f381190e);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96437f.X.f381191f)) {
                this.f96447s.setVisibility(8);
            } else {
                this.f96447s.setText(this.f96437f.X.f381191f);
                this.f96447s.setVisibility(0);
            }
            r45.sm4 sm4Var = this.f96437f.X.f381189d;
            if (sm4Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "username:%s，page_path：%s", sm4Var.f385847d, sm4Var.f385848e);
                this.f96451w = new zw1.c6(this);
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k(this.f96451w);
                if (i17 != -1) {
                    if (this.f96451w.f450377e.getVisibility() == 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 2);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 3);
                    }
                }
            }
        } else if (i18 == 3) {
            this.f96444p.setVisibility(8);
            this.f96439h.O.setVisibility(8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96437f.f450088a)) {
                android.view.View view2 = this.f96439h.f450121a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                A7(8);
            } else {
                android.view.View view3 = this.f96439h.f450121a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C7(2);
                A7(0);
                if (this.f96435d == 1) {
                    this.f96439h.f450125c.setBackgroundResource(com.tencent.mm.R.drawable.f481274p6);
                    this.f96439h.f450123b.setBackgroundResource(com.tencent.mm.R.drawable.f481272p4);
                    this.f96439h.f450129e.setRotation(90.0f);
                    android.view.ViewGroup.LayoutParams layoutParams = this.f96439h.f450137i.getLayoutParams();
                    layoutParams.height = 0;
                    this.f96439h.f450137i.setLayoutParams(layoutParams);
                    this.f96437f.f450115y = Q;
                    if (i17 != -1) {
                        if (this.f96450v.f450376d.getVisibility() == 0) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 4);
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 5);
                        }
                    }
                } else if (i17 != -1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 6);
                }
                if (i17 != -1) {
                    O7(2);
                    this.f96437f.D = java.lang.System.currentTimeMillis();
                    ww1.y2.d(this.f96439h);
                    i7();
                }
                androidx.appcompat.app.AppCompatActivity activity = getContext();
                kotlin.jvm.internal.o.g(activity, "activity");
                ((zw1.q2) pf5.z.f353948a.a(activity).a(zw1.q2.class)).O6(this.f96437f, this.f96439h);
            }
        } else if (i18 == 4 || i18 == 5) {
            this.f96444p.setVisibility(8);
            android.view.View view4 = this.f96439h.f450121a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            L7(J7() ? this.f96437f.Z : this.f96437f.Y, 2, true, new zw1.v5(this, 2, 2));
            A7(0);
            if (this.f96435d == 1) {
                this.f96439h.f450125c.setBackgroundResource(com.tencent.mm.R.drawable.f481274p6);
                this.f96439h.f450123b.setBackgroundResource(com.tencent.mm.R.drawable.f481272p4);
                this.f96439h.f450129e.setRotation(90.0f);
                android.view.ViewGroup.LayoutParams layoutParams2 = this.f96439h.f450137i.getLayoutParams();
                layoutParams2.height = 0;
                this.f96439h.f450137i.setLayoutParams(layoutParams2);
                this.f96437f.f450115y = Q;
                if (i17 != -1) {
                    if (this.f96450v.f450376d.getVisibility() == 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 4);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 5);
                    }
                }
            } else if (i17 != -1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 6);
            }
            if (i17 != -1) {
                ww1.y2.d(this.f96439h);
            }
        } else {
            if (i17 != -1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25982, 1);
            }
            this.f96435d = 1;
            this.f96444p.setVisibility(8);
            android.view.View view5 = this.f96439h.f450121a;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            A7(8);
        }
        if (this.f96436e != null) {
            androidx.appcompat.app.AppCompatActivity activity2 = getContext();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((zw1.n2) pf5.z.f353948a.a(activity2).a(zw1.n2.class)).Q6(this.f96435d, this.f96439h, this.f96444p, this.f96436e.K);
        }
    }

    public void y7(int i17) {
        java.util.List list;
        if (i17 == 0) {
            i17 = this.f96435d;
        }
        ww1.a3 l76 = l7(i17);
        ww1.b3 m76 = m7(i17);
        if (((java.util.LinkedList) l76.f450113w).size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "dataModel.payer_msg_List.size() <=  0");
            m76.H.setVisibility(8);
            return;
        }
        m76.C.setBackgroundResource(com.tencent.mm.R.drawable.f481287pj);
        m76.H.setVisibility(0);
        int i18 = 0;
        double d17 = 0.0d;
        while (true) {
            list = l76.f450113w;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                break;
            }
            ww1.b0 b0Var = (ww1.b0) ((java.util.LinkedList) list).get(i18);
            if (b0Var.f450201m == 1 && b0Var.f450117s) {
                d17 += b0Var.f450197f;
            }
            i18++;
        }
        if (d17 > 0.0d) {
            m76.I.setVisibility(0);
            m76.L.setText(com.tencent.mm.wallet_core.ui.r1.n(d17, ((ww1.b0) ((java.util.LinkedList) list).get(0)).f450198g));
        } else {
            m76.I.setVisibility(8);
        }
        l76.f450114x.notifyDataSetChanged();
        m76.M.setVisibility(0);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var;
        com.tencent.mm.ui.widget.dialog.z2 z2Var;
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onScreenShot]，mCollectType：%s", java.lang.Integer.valueOf(this.f96435d));
        ww1.a3 l76 = l7(0);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(25983, 11, java.lang.Integer.valueOf(this.f96435d));
        g0Var.d(13944, 9);
        if (l76.f450095e != null) {
            g0Var.d(20032, "wxface2face", "ScreenShot", "", "", "", "", 1, java.lang.Integer.valueOf(l76.f450095e.f388187d), 0, q7(), java.lang.Integer.valueOf(s7(0)), r7(0));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.D;
        if ((k0Var != null && k0Var.i()) || (((u1Var = this.C) != null && (j0Var = u1Var.f211998c) != null && j0Var.isShowing()) || (((z2Var = this.E) != null && z2Var.h()) || ((y1Var = this.G) != null && y1Var.f())))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "helper.isShowing() || isShowTips, do not showScreen Action");
            return;
        }
        if (this.f96435d == 2 && !v7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "[onScreenShot] mch type but do not have code ,do not screen shot");
            return;
        }
        K7(l76.f450095e);
        l76.f450112v = 1;
        k7(this.f96435d);
        h7(this.f96435d, true);
    }

    public final void z7(int i17) {
        int i18;
        C7(1);
        ww1.a3 a3Var = new ww1.a3();
        ww1.y2.c(a3Var);
        if (this.f96435d == 2 && (!com.tencent.mm.sdk.platformtools.t8.K0(a3Var.f450088a) || (i18 = a3Var.S) == 4 || i18 == 5)) {
            this.f96438g.f450125c.setBackgroundResource(com.tencent.mm.R.drawable.f481274p6);
            this.f96438g.f450123b.setBackgroundResource(com.tencent.mm.R.drawable.f481272p4);
            this.f96438g.f450129e.setRotation(90.0f);
            android.view.ViewGroup.LayoutParams layoutParams = this.f96438g.f450137i.getLayoutParams();
            layoutParams.height = 0;
            this.f96438g.f450137i.setLayoutParams(layoutParams);
            this.f96436e.f450115y = Q;
        }
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((zw1.q2) pf5.z.f353948a.a(activity).a(zw1.q2.class)).O6(this.f96436e, this.f96438g);
    }
}
