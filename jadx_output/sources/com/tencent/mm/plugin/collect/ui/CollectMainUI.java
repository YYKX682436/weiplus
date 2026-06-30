package com.tencent.mm.plugin.collect.ui;

@db5.a(0)
@gm0.a2
/* loaded from: classes15.dex */
public class CollectMainUI extends com.tencent.mm.wallet_core.ui.WalletPreferenceUI implements ww1.u, com.tencent.mm.sdk.platformtools.f7, com.tencent.mm.modelbase.u0, android.text.TextWatcher {

    /* renamed from: e2, reason: collision with root package name */
    public static int f96385e2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public static int f96386f2 = -1;

    /* renamed from: g2, reason: collision with root package name */
    public static int f96387g2 = -1;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView A1;
    public android.widget.TextView B1;
    public android.widget.TextView C1;
    public android.widget.ImageView D;
    public android.widget.ImageView D1;
    public android.widget.TextView E;
    public android.view.ViewGroup E1;
    public android.widget.TextView F;
    public android.view.View F1;
    public android.widget.TextView G;
    public r45.vf5 G1;
    public android.widget.LinearLayout H;
    public r45.vf5 H1;
    public android.widget.TextView I;
    public android.widget.LinearLayout I1;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.RelativeLayout f96388J;
    public android.widget.TextView J1;
    public android.widget.TextView K1;
    public android.widget.TextView L1;
    public com.tencent.mm.protobuf.g M1;
    public com.tencent.mm.ui.widget.dialog.u1 N1;
    public com.tencent.mm.ui.widget.dialog.k0 O1;
    public com.tencent.mm.ui.widget.dialog.z2 P1;
    public int Q;
    public android.view.View Q1;
    public ww1.y R1;
    public double S;
    public r45.ov S1;
    public boolean T1;
    public java.lang.String U1;
    public r45.jv3 V1;
    public long W;
    public com.tencent.mm.ui.widget.dialog.y1 W1;
    public android.view.View X;
    public com.tencent.mm.ui.tools.f5 X1;
    public int Y1;
    public android.text.SpannableStringBuilder Z;
    public int Z1;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f96389a2;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f96390b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f96391c2;

    /* renamed from: g, reason: collision with root package name */
    public int f96393g;

    /* renamed from: h, reason: collision with root package name */
    public int f96394h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f96395i;

    /* renamed from: l1, reason: collision with root package name */
    public ww1.v0 f96396l1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f96397m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Vibrator f96398n;

    /* renamed from: p0, reason: collision with root package name */
    public android.text.SpannableStringBuilder f96401p0;

    /* renamed from: x0, reason: collision with root package name */
    public int f96411x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f96412x1;

    /* renamed from: y0, reason: collision with root package name */
    public long f96414y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f96415y1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f96417z1;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f96399o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f96400p = null;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f96403q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f96404r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f96405s = null;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f96406t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.RelativeLayout f96407u = null;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f96408v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f96409w = null;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f96410x = null;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f96413y = null;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f96416z = null;
    public android.widget.ScrollView A = null;
    public boolean B = false;
    public android.view.View C = null;
    public android.graphics.Bitmap K = null;
    public java.lang.String L = null;
    public java.lang.String M = null;
    public java.lang.String N = null;
    public java.lang.String P = null;
    public final java.util.List R = new java.util.LinkedList();
    public java.lang.String T = null;
    public java.lang.String U = null;
    public boolean V = false;
    public final zw1.i2 Y = new zw1.i2(this, null);

    /* renamed from: p1, reason: collision with root package name */
    public int f96402p1 = 0;

    /* renamed from: d2, reason: collision with root package name */
    public final y60.e f96392d2 = new zw1.y1(this);

    public static void X6(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, r45.wf5 wf5Var) {
        collectMainUI.getClass();
        if (wf5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", " buttonInfo == null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", " ClickButtonAction：%s", java.lang.Integer.valueOf(wf5Var.f389136e));
        switch (wf5Var.f389136e) {
            case 1:
                if (collectMainUI.I1.isShown()) {
                    collectMainUI.I1.setVisibility(8);
                }
                com.tencent.mm.ui.widget.dialog.z2 z2Var = collectMainUI.f96395i;
                if (z2Var != null) {
                    z2Var.B();
                    break;
                }
                break;
            case 2:
                collectMainUI.c7(null, null);
                collectMainUI.e7(collectMainUI.f96393g);
                break;
            case 3:
                com.tencent.mm.wallet_core.ui.r1.V(collectMainUI.getContext(), wf5Var.f389137f, true);
                break;
            case 4:
                r45.sm4 sm4Var = wf5Var.f389138g;
                java.lang.String str = sm4Var.f385847d;
                java.lang.String str2 = sm4Var.f385848e;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                    am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                    nxVar.f7466a = str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    nxVar.f7467b = str2;
                    nxVar.f7469d = 1072;
                    nxVar.f7468c = 0;
                    startAppBrandUIFromOuterEvent.e();
                    break;
                }
                break;
            case 5:
                collectMainUI.s7(wf5Var.f389139h);
                break;
            case 6:
                collectMainUI.c7(null, wf5Var.f389139h);
                collectMainUI.e7(collectMainUI.f96393g);
                break;
            case 7:
                if (!collectMainUI.T1) {
                    collectMainUI.d7();
                    break;
                } else {
                    new ww1.h(collectMainUI.M1).l().h(new zw1.v1(collectMainUI));
                    break;
                }
            case 8:
                collectMainUI.d7();
                break;
            case 9:
                collectMainUI.finish();
                break;
            default:
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "unknow buttonInfo.type");
                break;
        }
        int i17 = collectMainUI.f96394h;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20032, "wxface2face", "ClickHalfDialogButton", "", "", "", "", 4, 0, java.lang.Integer.valueOf(wf5Var.f389136e), collectMainUI.g7(), java.lang.Integer.valueOf(collectMainUI.i7()), collectMainUI.h7());
        } else if (i17 != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "unknow clickButtonSource");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20032, "wxface2face", "ClickCoverPageButton", "", "", "", "", 5, 0, java.lang.Integer.valueOf(wf5Var.f389136e), collectMainUI.g7(), java.lang.Integer.valueOf(collectMainUI.i7()), collectMainUI.h7());
        }
    }

    public static void Y6(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, r45.jv3 jv3Var) {
        collectMainUI.getClass();
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(collectMainUI);
        collectMainUI.W1 = y1Var;
        y1Var.f212027f.setFocusable(false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(collectMainUI).inflate(com.tencent.mm.R.layout.f488646zg, (android.view.ViewGroup) null);
        collectMainUI.W1.k(linearLayout);
        android.widget.Button button = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.b1e);
        android.widget.Button button2 = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.b0e);
        android.widget.Button button3 = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.b0f);
        r45.wf5 wf5Var = jv3Var.f378125f;
        if (wf5Var != null) {
            button2.setText(wf5Var.f389135d);
            button3.setText(jv3Var.f378126g.f389135d);
            button2.setOnClickListener(new zw1.a1(collectMainUI, jv3Var));
            button3.setOnClickListener(new zw1.b1(collectMainUI, jv3Var));
        } else {
            button2.setVisibility(8);
            button3.setVisibility(8);
            button.setText(jv3Var.f378126g.f389135d);
            button.setVisibility(0);
            button.setOnClickListener(new zw1.d1(collectMainUI, jv3Var));
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
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) android.view.LayoutInflater.from(collectMainUI).inflate(com.tencent.mm.R.layout.f488645zf, (android.view.ViewGroup) null);
                ((android.widget.TextView) linearLayout3.findViewById(com.tencent.mm.R.id.c3g)).setText(str);
                linearLayout2.addView(linearLayout3);
            }
        }
        collectMainUI.W1.s();
    }

    public static void Z6(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, android.content.Context context, java.lang.String str, int i17, r45.vf5 vf5Var, r45.o90 o90Var) {
        collectMainUI.getClass();
        android.widget.Toast makeText = dp.a.makeText(context, "", 0);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488379rq, null);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487356oe2)).setImageResource(i17);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new zw1.u1(collectMainUI, makeText, vf5Var, o90Var), 750L);
    }

    public static void a7(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, r45.uk4 uk4Var) {
        collectMainUI.getClass();
        if (uk4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387432e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "empty item return");
            return;
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_F2F_COLLECT_BOTTOM_LEFT_ICON_URL_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            collectMainUI.A1.setVisibility(8);
        } else {
            collectMainUI.A1.setUrl(str);
            collectMainUI.A1.setVisibility(0);
        }
        collectMainUI.B1.setText(uk4Var.f387432e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387436i)) {
            collectMainUI.C1.setVisibility(4);
        } else {
            collectMainUI.C1.setText(uk4Var.f387436i);
            collectMainUI.C1.setVisibility(0);
        }
        if (uk4Var.f387437m == 1) {
            collectMainUI.D1.setVisibility(0);
        } else {
            collectMainUI.D1.setVisibility(8);
        }
        int i17 = uk4Var.f387431d;
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(14526, 1, 1, uk4Var.f387432e, "", "", "", 1);
            if (uk4Var.f387437m == 1) {
                g0Var.d(14526, 3, 1, uk4Var.f387432e, "", "", "", 1);
            }
        } else if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(14526, 1, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 1);
            if (uk4Var.f387437m == 1) {
                g0Var2.d(14526, 3, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 1);
            }
        } else if (i17 == 3) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.d(14526, 1, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 1);
            if (uk4Var.f387437m == 1) {
                g0Var3.d(14526, 3, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 1);
            }
        }
        collectMainUI.E1.setOnClickListener(new zw1.h1(collectMainUI, uk4Var));
    }

    @Override // ww1.u
    public void E4(ww1.g2 g2Var) {
        java.util.LinkedList linkedList;
        boolean z17;
        int i17 = this.f96411x0;
        boolean z18 = false;
        if ((i17 != 1 && i17 != 0) || g2Var.f450204p != 9) {
            if (!(i17 == 8) || g2Var.f450204p != 26) {
                return;
            }
        }
        android.os.Vibrator vibrator = this.f96398n;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
        if (g2Var.f450199h < this.W) {
            return;
        }
        int i18 = 0;
        while (true) {
            linkedList = (java.util.LinkedList) this.R;
            if (i18 >= linkedList.size()) {
                z17 = false;
                break;
            }
            if (g2Var.f450201m == 0) {
                java.lang.String str = g2Var.f450195d;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                if (str.equals(((zw1.f2) linkedList.get(i18)).f450195d) && ((zw1.f2) linkedList.get(i18)).f450201m == 2) {
                    linkedList.remove(i18);
                    linkedList.add(i18, new zw1.f2(this, g2Var));
                    break;
                }
            }
            if (!g2Var.f450196e.equals(((zw1.f2) linkedList.get(i18)).f450196e)) {
                i18++;
            } else if (((zw1.f2) linkedList.get(i18)).f450201m == 0) {
                ((zw1.f2) linkedList.get(i18)).f450201m = g2Var.f450201m;
                ((zw1.f2) linkedList.get(i18)).f450197f = g2Var.f450197f;
                ((zw1.f2) linkedList.get(i18)).f450198g = g2Var.f450198g;
                if (g2Var.f450201m == 1) {
                    this.Y.f476661b.add((zw1.f2) linkedList.get(i18));
                }
            }
        }
        z17 = true;
        if (!z17) {
            int i19 = 0;
            while (true) {
                if (i19 >= linkedList.size()) {
                    break;
                }
                if (g2Var.f450199h > ((ww1.g2) linkedList.get(i19)).f450199h) {
                    linkedList.add(i19, new zw1.f2(this, g2Var));
                    z18 = true;
                    break;
                }
                i19++;
            }
            if (!z18) {
                linkedList.add(new zw1.f2(this, g2Var));
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(new zw1.w0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI
    public boolean W6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable == null || editable.toString().equals("")) {
            this.P1.b(false);
            return;
        }
        this.P1.b(true);
        if (editable.length() <= 16) {
            this.U1 = editable.toString();
            return;
        }
        com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText = (com.tencent.mm.ui.widget.edittext.PasterEditText) this.Q1.findViewById(com.tencent.mm.R.id.c3k);
        pasterEditText.setText(editable.toString().substring(0, 16));
        java.lang.String substring = editable.toString().substring(0, 16);
        this.U1 = substring;
        pasterEditText.setSelection(substring.length());
    }

    public void b7() {
        if (ww1.v0.f450312e == null) {
            ww1.v0.f450312e = new ww1.v0();
        }
        ww1.v0 v0Var = ww1.v0.f450312e;
        this.f96396l1 = v0Var;
        v0Var.getClass();
        gm0.j1.i();
        gm0.j1.n().f273288b.a(5174, v0Var);
        ww1.v0 v0Var2 = this.f96396l1;
        zw1.g1 g1Var = new zw1.g1(this);
        v0Var2.getClass();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_F2F_COLLECT_PAY_URL_STRING_SYNC, "");
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_F2F_COLLECT_TRUE_NAME_STRING_SYNC, "");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_F2F_COLLECT_PAY_URL_ERROR_LEVEL_INT_SYNC, -1)).intValue();
        r45.uk4 uk4Var = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fGetPayUrlManager", "use old payurl");
            at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            str = v1Var != null ? v1Var.field_ftf_pay_url : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "get cache: %s, %s, %s", str, str2, java.lang.Integer.valueOf(intValue));
        this.f96407u.setVisibility(0);
        this.L = str;
        this.Q = intValue;
        this.M = str2;
        try {
            gm0.j1.i();
            uk4Var = l7(new org.json.JSONObject((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_F2F_COLLECT_BOTTOM_MENU_STRING_SYNC, "")));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CollectMainUI", e17, "", new java.lang.Object[0]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            gm0.j1.i();
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_F2F_COLLECT_UPRIGHT_MENU_STRING_SYNC, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str3);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    arrayList.add(l7(jSONArray.getJSONObject(i17)));
                }
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CollectMainUI", e18, "", new java.lang.Object[0]);
        }
        a7(this, uk4Var);
        m7(arrayList);
        if (this.f96411x0 == 1) {
            gm0.j1.i();
            this.f96402p1 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_BUSITYPE_INT_SYNC, -1)).intValue();
            gm0.j1.i();
            this.f96412x1 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_BUSIURL_STRING_SYNC, "");
        }
        ww1.r1 r1Var = new ww1.r1();
        ((java.util.HashMap) v0Var2.f450313d).put(r1Var, g1Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(r1Var);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    public final void c7(r45.vf5 vf5Var, r45.o90 o90Var) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "doSaveQrCode");
        android.graphics.Bitmap bitmap = this.K;
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "save ftf pay qrcode failed: bmp null");
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.b_v), 1).show();
        } else {
            android.graphics.Bitmap a17 = ww1.r.a(this, this.L, c01.z1.r(), this.f96402p1, this.f96412x1, true, com.tencent.mm.sdk.platformtools.j.d(this, 197.0f), this.f96392d2, false, this.Q, 0.0f, true);
            boolean z17 = false;
            if (a17 != null && !a17.isRecycled()) {
                if (this.V) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11343, 1, java.lang.Integer.valueOf((int) java.lang.Math.round(this.S * 100.0d)));
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11343, 0);
                }
                if (this.B) {
                    i17 = 0;
                } else {
                    this.A = (android.widget.ScrollView) ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.f483814c44)).inflate();
                    k7();
                    this.B = true;
                    i17 = 250;
                }
                this.A.setVisibility(4);
                ((android.widget.ImageView) this.A.findViewById(com.tencent.mm.R.id.c3y)).setImageBitmap(this.K);
                android.widget.TextView textView = (android.widget.TextView) this.A.findViewById(com.tencent.mm.R.id.f483810c40);
                android.widget.TextView textView2 = (android.widget.TextView) this.A.findViewById(com.tencent.mm.R.id.f483811c41);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.A.findViewById(com.tencent.mm.R.id.c5j);
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) this.A.findViewById(com.tencent.mm.R.id.c3x);
                android.widget.TextView textView3 = (android.widget.TextView) this.A.findViewById(com.tencent.mm.R.id.c3u);
                android.widget.TextView textView4 = (android.widget.TextView) this.A.findViewById(com.tencent.mm.R.id.c3v);
                android.widget.TextView textView5 = (android.widget.TextView) this.A.findViewById(com.tencent.mm.R.id.c3w);
                java.lang.String I = com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(c01.z1.r()), 10);
                java.lang.String j76 = j7();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(j76)) {
                    I = I + getString(com.tencent.mm.R.string.b_m, j76);
                }
                if (this.f96402p1 != 1) {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    float textSize = textView.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, I, textSize));
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize2 = textView.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, I, textSize2));
                } else {
                    textView.setText((java.lang.CharSequence) null);
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize3 = textView2.getTextSize();
                    ((ke0.e) xVar3).getClass();
                    textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, I, textSize3));
                    textView2.setVisibility(0);
                }
                if (this.V) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(this.U)) {
                        textView4.setVisibility(8);
                    } else {
                        textView4.setText(this.U);
                        textView4.setVisibility(0);
                    }
                    textView3.setText(f7());
                    textView5.setText(com.tencent.mm.wallet_core.ui.r1.o(this.S));
                    linearLayout2.setVisibility(0);
                } else {
                    linearLayout2.setVisibility(8);
                }
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(this, new zw1.y0(this, linearLayout, true, vf5Var, o90Var, i17), new zw1.z0(this));
                z17 = true;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "save ftf pay qrcode fail");
                dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.b_v), 1).show();
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }

    public final void d7() {
        r45.r1 c17 = at4.g0.c();
        if (c17 == null) {
            c17 = new r45.r1();
        }
        new ww1.m(this.S, this.T, this.U1, c17.f384412i, c17.f384413m, java.lang.String.valueOf(c17.f384411h), this.M1, h7(), false, "").l().h(new zw1.x1(this));
    }

    public final void e7(int i17) {
        int i76 = i7();
        java.lang.String h76 = h7();
        java.lang.String g76 = g7();
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "doSceneSaveQrcodeNotify notifyType:%s，amount: %s,memo: %s,url: %s,mSaveNotifyInfo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i76), h76, g76, this.M1);
        gm0.j1.d().g(new ww1.s1(i17, i76, h76, g76, this.M1));
    }

    public java.lang.String f7() {
        return com.tencent.mm.wallet_core.ui.r1.w(this.T);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
    }

    public final java.lang.String g7() {
        if (this.V) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
                return this.P;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
            return "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            return this.L;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mPayUrl null");
        return "";
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.f488642zc;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488640za;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494838l;
    }

    public final java.lang.String h7() {
        return (!this.f96400p.isShown() || com.tencent.mm.sdk.platformtools.t8.J0(this.f96400p.getText())) ? "" : this.f96400p.getText().toString();
    }

    public final int i7() {
        if (!this.f96403q.isShown() || com.tencent.mm.sdk.platformtools.t8.J0(this.f96403q.getText())) {
            return 0;
        }
        return java.lang.Integer.parseInt(com.tencent.mm.wallet_core.ui.r1.h0("" + ((java.lang.Object) this.f96403q.getText()), "100", 0, java.math.RoundingMode.HALF_UP).toString());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.hdw);
        setBackBtn(new zw1.z1(this));
        this.f96410x = getPreferenceScreen();
        this.f96407u = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.m7g);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.c59)).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        this.f96408v = findViewById(com.tencent.mm.R.id.c3p);
        this.F1 = findViewById(com.tencent.mm.R.id.c3q);
        this.f96403q = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.f483809c36);
        this.f96400p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483808c35);
        this.f96404r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c37);
        this.f96405s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c3o);
        this.H = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.kfo);
        this.I = (android.widget.TextView) findViewById(com.tencent.mm.R.id.af7);
        this.f96413y = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.c3e);
        this.f96416z = findViewById(com.tencent.mm.R.id.c3b);
        this.X = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f488641zb, (android.view.ViewGroup) null, false);
        this.f96406t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c3z);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(getString(com.tencent.mm.R.string.b_n));
        spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(6, new zw1.a2(this), true), 0, spannableStringBuilder.length(), 18);
        this.f96406t.setText(spannableStringBuilder);
        this.f96406t.setClickable(true);
        this.f96406t.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        getListView().addFooterView(this.X, null, false);
        getListView().setFooterDividersEnabled(false);
        this.f96399o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.c3a);
        this.f96409w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483816c46);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c5o);
        this.G = textView;
        textView.setClickable(true);
        this.G.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        this.Z = new android.text.SpannableStringBuilder(getString(com.tencent.mm.R.string.b_7));
        this.f96401p0 = new android.text.SpannableStringBuilder(getString(com.tencent.mm.R.string.b_8));
        com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(6, new zw1.b2(this), true);
        com.tencent.mm.plugin.wallet_core.ui.d7 d7Var2 = new com.tencent.mm.plugin.wallet_core.ui.d7(6, new zw1.c2(this), true);
        android.text.SpannableStringBuilder spannableStringBuilder2 = this.Z;
        spannableStringBuilder2.setSpan(d7Var, 0, spannableStringBuilder2.length(), 18);
        android.text.SpannableStringBuilder spannableStringBuilder3 = this.f96401p0;
        spannableStringBuilder3.setSpan(d7Var2, 0, spannableStringBuilder3.length(), 18);
        this.G.setText(this.Z);
        this.f96388J = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.c4j);
        this.f96399o.setOnLongClickListener(new zw1.d2(this));
        this.C = findViewById(com.tencent.mm.R.id.c3s);
        this.D = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.c4v);
        this.E = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483820c52);
        this.F = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483818c50);
        this.A1 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.c1d);
        this.B1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c1g);
        this.C1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c1h);
        this.D1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.c1f);
        this.E1 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.c1e);
        this.f96413y.postDelayed(new zw1.e2(this), 300L);
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "8";
        walletGetBulletinEvent.f192364d = new zw1.n0(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
        this.I1 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.c49);
        this.J1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c4c);
        this.K1 = (android.widget.Button) findViewById(com.tencent.mm.R.id.c4_);
        this.L1 = (android.widget.Button) findViewById(com.tencent.mm.R.id.c4b);
    }

    public java.lang.String j7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.M)) {
            java.lang.String q17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q();
            this.M = q17;
            this.M = com.tencent.mm.wallet_core.ui.r1.y(q17);
        }
        return this.M;
    }

    public void k7() {
    }

    public final r45.uk4 l7(org.json.JSONObject jSONObject) {
        r45.uk4 uk4Var = new r45.uk4();
        uk4Var.f387431d = jSONObject.optInt("type", -1);
        uk4Var.f387433f = jSONObject.optString("url", "");
        uk4Var.f387432e = jSONObject.optString("wording", "");
        uk4Var.f387434g = jSONObject.optString("waapp_username", "");
        uk4Var.f387435h = jSONObject.optString("waapp_path", "");
        return uk4Var;
    }

    public void m7(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.uk4 uk4Var = (r45.uk4) it.next();
                int i17 = uk4Var.f387431d;
                if (i17 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 1, uk4Var.f387432e, "", "", "", 1);
                } else if (i17 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 2, uk4Var.f387432e, "", "", uk4Var.f387433f, 1);
                } else if (i17 == 3) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14526, 2, 3, uk4Var.f387432e, uk4Var.f387434g, uk4Var.f387435h, "", 1);
                }
            }
        }
        this.f96388J.setOnClickListener(new zw1.k1(this, list));
    }

    public final void n7() {
        double d17;
        java.util.List list = this.R;
        if (list == null || ((java.util.LinkedList) list).size() <= 0) {
            d17 = 0.0d;
        } else {
            this.f96413y.setBackgroundResource(com.tencent.mm.R.drawable.f481290pm);
            ((com.tencent.mm.ui.base.preference.h0) this.f96410x).t();
            int i17 = 0;
            d17 = 0.0d;
            while (i17 < ((java.util.LinkedList) list).size()) {
                zw1.f2 f2Var = (zw1.f2) ((java.util.LinkedList) list).get(i17);
                java.lang.String str = "" + i17;
                zw1.k2 k2Var = i17 == ((java.util.LinkedList) list).size() - 1 ? new zw1.k2(this, com.tencent.mm.R.layout.f488647zh) : new zw1.k2(this);
                k2Var.C(str);
                java.lang.String str2 = f2Var.f450202n;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(f2Var.f450195d)) {
                    str2 = com.tencent.mm.wallet_core.ui.r1.x(f2Var.f450195d);
                }
                k2Var.Q = str2;
                k2Var.P = f2Var.f450195d;
                int i18 = f2Var.f450201m;
                if (i18 == 0) {
                    k2Var.G(com.tencent.mm.R.string.b_i);
                    ((com.tencent.mm.ui.base.preference.h0) this.f96410x).d(k2Var, -1);
                } else if (i18 == 1) {
                    if (f2Var.f476622s) {
                        double d18 = f2Var.f450197f;
                        d17 += d18;
                        k2Var.H(com.tencent.mm.wallet_core.ui.r1.n(d18, f2Var.f450198g));
                    } else {
                        k2Var.G(com.tencent.mm.R.string.b_g);
                    }
                    ((com.tencent.mm.ui.base.preference.h0) this.f96410x).d(k2Var, -1);
                } else if (i18 == 2) {
                    k2Var.G(com.tencent.mm.R.string.b_f);
                    ((com.tencent.mm.ui.base.preference.h0) this.f96410x).d(k2Var, -1);
                } else {
                    ((com.tencent.mm.ui.base.preference.h0) this.f96410x).d(k2Var, -1);
                }
                i17++;
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f96410x).notifyDataSetChanged();
            this.f96405s.setText(com.tencent.mm.wallet_core.ui.r1.n(d17, ((zw1.f2) ((java.util.LinkedList) list).get(0)).f450198g));
            this.f96405s.setVisibility(0);
        }
        if (list == null || ((java.util.LinkedList) list).size() <= 0) {
            this.f96405s.setVisibility(8);
            android.view.View view = this.f96408v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f96416z;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.E1.setBackgroundResource(com.tencent.mm.R.drawable.f481291pn);
        android.view.View view3 = this.f96408v;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (d17 <= 0.0d || ((java.util.LinkedList) list).size() < 1) {
            return;
        }
        android.view.View view4 = this.F1;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f96416z;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void o7() {
        this.f96399o.setImageBitmap(null);
        boolean z17 = this.V;
        y60.e eVar = this.f96392d2;
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
                return;
            } else {
                this.K = ww1.r.a(this, this.P, c01.z1.r(), this.f96402p1, this.f96412x1, true, com.tencent.mm.sdk.platformtools.j.d(this, 197.0f), eVar, false, this.Q, 0.0f, true);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mPayUrl null");
            return;
        } else {
            this.K = ww1.r.a(this, this.L, c01.z1.r(), this.f96402p1, this.f96412x1, true, com.tencent.mm.sdk.platformtools.j.d(this, 197.0f), eVar, false, this.Q, 0.0f, true);
        }
        android.graphics.Bitmap bitmap = this.K;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.String str = this.P;
            if (str == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : bmp null ,mFixedPayUrl=".concat(str));
        } else {
            this.f96399o.setImageBitmap(this.K);
        }
        if (!this.V) {
            this.f96404r.setVisibility(8);
            this.f96403q.setVisibility(8);
            this.f96400p.setVisibility(8);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.c39);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f96403q.setPrefix(f7());
        this.f96403q.setText(com.tencent.mm.wallet_core.ui.r1.o(this.S));
        this.f96403q.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.U)) {
            this.f96400p.setVisibility(8);
        } else {
            android.widget.TextView textView = this.f96400p;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.lang.String str2 = this.U;
            float textSize = this.f96400p.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize));
            this.f96400p.setVisibility(0);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.c39);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 4096) {
            if (i17 != 4097) {
                return;
            }
            this.f96414y0 = c01.z1.j();
            return;
        }
        if (i18 != -1 || intent == null) {
            this.V = false;
        } else {
            this.P = intent.getStringExtra("ftf_pay_url");
            this.Q = intent.getIntExtra("key_error_level", -1);
            this.S = intent.getDoubleExtra("ftf_fixed_fee", 0.0d);
            this.T = intent.getStringExtra("ftf_fixed_fee_type");
            this.U = intent.getStringExtra("ftf_fixed_desc");
            this.N = intent.getStringExtra("key_currency_unit");
            this.G.setText(this.f96401p0);
            this.V = true;
        }
        p7();
        q7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        this.f96391c2 = false;
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        setIsDarkActionbarBg(true);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        setActionbarElementColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        hideActionbarLine();
        getContentView().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        gm0.j1.i();
        this.f96411x0 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f96414y0 = c01.z1.j();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14021, 2, java.lang.Integer.valueOf(getIntent().getIntExtra("key_from_scene", 1)));
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        java.util.LinkedList linkedList = (java.util.LinkedList) tw1.f.Di().Ni().f450311d;
        if (!linkedList.contains(this)) {
            linkedList.add(this);
        }
        initView();
        b7();
        p7();
        this.f96398n = (android.os.Vibrator) getSystemService("vibrator");
        this.W = com.tencent.mm.sdk.platformtools.t8.i1();
        if (f96386f2 < 0) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.view.WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            f96386f2 = (displayMetrics.widthPixels / 2) - com.tencent.mm.sdk.platformtools.j.d(getContext(), 20.0f);
            f96387g2 = com.tencent.mm.sdk.platformtools.j.d(getContext(), 60.0f);
            com.tencent.mm.sdk.platformtools.j.d(getContext(), 40.0f);
            com.tencent.mm.sdk.platformtools.j.d(getContext(), 70.0f);
        }
        q7();
        com.tencent.mm.wallet_core.model.n1.d(16, 0);
        gm0.j1.d().a(3781, this);
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
        this.X1 = f5Var;
        f5Var.f210400e = new zw1.c1(this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.widget.ImageView imageView = this.f96399o;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.graphics.Bitmap bitmap = this.K;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
        ((java.util.LinkedList) tw1.f.Di().Ni().f450311d).remove(this);
        this.f96398n.cancel();
        ww1.v0 v0Var = this.f96396l1;
        if (v0Var != null) {
            java.util.HashMap hashMap = (java.util.HashMap) v0Var.f450313d;
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.F2fGetPayUrlManager", "uninit, do cancel netscene");
                gm0.j1.i();
                gm0.j1.n().f273288b.d((com.tencent.mm.modelbase.m1) entry.getKey());
            }
            hashMap.clear();
            gm0.j1.i();
            gm0.j1.n().f273288b.q(5174, v0Var);
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        y60.e eVar = this.f96392d2;
        ((x60.e) fVar).getClass();
        x51.w0.e(eVar);
        gm0.j1.d().q(3781, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
        com.tencent.mm.ui.tools.f5 f5Var = this.X1;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        this.X1.f();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "errType: %d,errCode: %d,errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof ww1.s1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "scene is NetSceneF2fQrcodeSaveNotify");
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.X1.f();
        }
    }

    public void p7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "func[refreshView], mPayUrl null.");
            return;
        }
        if (this.f96402p1 == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                this.f96409w.setText((java.lang.CharSequence) null);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c3d);
                textView.setText((java.lang.CharSequence) null);
                textView.setVisibility(0);
            }
        }
        o7();
        n7();
        r45.r1 c17 = at4.g0.c();
        int i17 = this.V ? 33 : 32;
        if (c17 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13447, java.lang.Integer.valueOf(i17), c17.f384412i, c17.f384413m, this.L, java.lang.Double.valueOf(this.S), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), java.lang.Long.valueOf(c17.f384411h), c17.f384414n, c17.f384415o);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96415y1)) {
            this.H.setVisibility(8);
            return;
        }
        this.I.setText(this.f96415y1);
        this.I.setOnClickListener(new zw1.e1(this));
        this.H.setVisibility(0);
    }

    public final void q7() {
        getWindow().getDecorView().post(new zw1.v0(this));
    }

    public final void r7(r45.vf5 vf5Var) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var;
        if (vf5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "actionInfo is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "actionInfo.action_type：%s", java.lang.Integer.valueOf(vf5Var.f388187d));
        int i17 = vf5Var.f388187d;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 == 2) {
                    s7(vf5Var.f388189f);
                    return;
                }
                if (i17 != 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "unknow actionInfo.action_type");
                    return;
                }
                r45.ln lnVar = vf5Var.f388190g;
                if (lnVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", " bottomCell == null");
                    return;
                }
                this.f96393g = 3;
                this.f96397m = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, true);
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setGravity(17);
                textView.setHeight(i65.a.b(getContext(), 56));
                textView.setTextSize(12.0f);
                textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_1));
                textView.setText(lnVar.f379647d);
                this.f96397m.s(textView, false);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f96397m;
                k0Var.Z1 = true;
                k0Var.f211872n = new zw1.s1(this, lnVar);
                k0Var.f211881s = new zw1.t1(this, lnVar);
                k0Var.v();
                return;
            }
            r45.jv3 jv3Var = vf5Var.f388188e;
            if (jv3Var == null || ((z2Var = this.f96395i) != null && z2Var.h())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "mHalfBottomDialog != null || mHalfBottomDialog.isShowing() || halfPage == null ");
                return;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f96397m;
            if (k0Var2 != null && k0Var2.i()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "mBottomSheet != null && mBottomSheet.isShowing()");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "showHalfDialog");
            r45.wf5 wf5Var = jv3Var.f378125f;
            r45.wf5 wf5Var2 = jv3Var.f378126g;
            this.f96393g = 4;
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 1, 3);
            this.f96395i = z2Var2;
            z2Var2.m(wf5Var.f389135d, wf5Var2.f389135d);
            com.tencent.mm.ui.widget.dialog.z2 z2Var3 = this.f96395i;
            zw1.l1 l1Var = new zw1.l1(this, wf5Var);
            zw1.m1 m1Var = new zw1.m1(this, wf5Var2);
            z2Var3.D = l1Var;
            z2Var3.E = m1Var;
            if (jv3Var.f378123d.f386578d == 2) {
                android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.z_, null);
                ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.aa_)).setOnClickListener(new zw1.n1(this));
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c2l);
                textView2.setText(jv3Var.f378123d.f386579e);
                com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                this.f96395i.s(inflate);
            } else {
                android.view.View inflate2 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488639z9, null);
                android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.gwd);
                textView3.setText(jv3Var.f378123d.f386579e);
                com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                this.f96395i.s(inflate2);
            }
            android.view.View inflate3 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488638z8, null);
            ((android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.gw8)).setText(jv3Var.f378124e);
            this.f96395i.j(inflate3);
            this.f96395i.C();
        }
    }

    public final void s7(r45.o90 o90Var) {
        if (o90Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", " coverInfo == null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "showCoverUI");
        this.I1.setVisibility(0);
        this.I1.setOnClickListener(new zw1.o1(this));
        android.view.ViewGroup.LayoutParams layoutParams = this.I1.getLayoutParams();
        layoutParams.height = this.f96413y.getHeight();
        this.I1.setLayoutParams(layoutParams);
        this.J1.setText(o90Var.f382043d);
        this.K1.setText(o90Var.f382044e.f389135d);
        this.K1.setOnClickListener(new zw1.p1(this, o90Var));
        this.L1.setText(o90Var.f382045f.f389135d);
        this.L1.setOnClickListener(new zw1.r1(this, o90Var));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletPreferenceUI
    public void setStatusColor() {
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478552am));
        setActionbarElementColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(sw1.c.class);
    }

    public void t7() {
        gm0.j1.i();
        if (((java.lang.String) gm0.j1.u().c().l(327731, "0")).equals("0")) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
            this.N1 = u1Var;
            u1Var.u(getResources().getString(com.tencent.mm.R.string.b_6));
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = this.N1;
            u1Var2.g(com.tencent.mm.wallet_core.model.c2.a());
            u1Var2.a(true);
            u1Var2.m(com.tencent.mm.R.string.ke7);
            u1Var2.l(new zw1.q1(this));
            u1Var2.q(false);
            gm0.j1.i();
            gm0.j1.u().c().w(327731, "1");
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var;
        com.tencent.mm.ui.widget.dialog.z2 z2Var;
        com.tencent.mm.ui.widget.dialog.y1 y1Var;
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "do screen shot");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(13944, 9);
        if (this.G1 != null) {
            g0Var.d(20032, "wxface2face", "ScreenShot", "", "", "", "", 1, java.lang.Integer.valueOf(this.G1.f388187d), 0, g7(), java.lang.Integer.valueOf(i7()), h7());
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.O1;
        if ((k0Var != null && k0Var.i()) || (((u1Var = this.N1) != null && (j0Var = u1Var.f211998c) != null && j0Var.isShowing()) || (((z2Var = this.P1) != null && z2Var.h()) || ((y1Var = this.W1) != null && y1Var.f())))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "helper.isShowing() || isShowTips, do not showScreen Action");
        } else {
            r7(this.G1);
            e7(1);
        }
    }
}
