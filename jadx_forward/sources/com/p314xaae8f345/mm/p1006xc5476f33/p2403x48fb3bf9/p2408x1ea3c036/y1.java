package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public abstract class y1 extends android.widget.FrameLayout {
    public boolean A;
    public java.lang.Integer B;
    public boolean C;
    public final android.view.View.OnClickListener D;

    /* renamed from: d, reason: collision with root package name */
    public final vj5.h f264225d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264226e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f264227f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.RelativeLayout f264228g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f264229h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f264230i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f264231m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f264232n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f264233o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f264234p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f264235q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y f264236r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d4 f264237s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f264238t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f264239u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f264240v;

    /* renamed from: w, reason: collision with root package name */
    public int f264241w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f264242x;

    /* renamed from: y, reason: collision with root package name */
    public int f264243y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f264244z;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        super(e0Var.f488143d);
        this.f264238t = null;
        this.f264240v = false;
        this.f264243y = -1;
        this.A = false;
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a2(this);
        setId(com.p314xaae8f345.mm.R.id.j7i);
        android.content.Context context = e0Var.f488143d;
        this.f264227f = context;
        this.f264226e = e0Var;
        setBackgroundColor(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.s(context);
        this.f264225d = sVar;
        addView(sVar, -1, -1);
        this.f264241w = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aay);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d9q, (android.view.ViewGroup) this, false);
        this.f264244z = inflate;
        m74253x1b598243(this.f264241w);
        sVar.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, m74251xb0586f4e()));
        this.f264228g = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563971el);
        this.f264229h = inflate.findViewById(com.p314xaae8f345.mm.R.id.jbs);
        this.f264230i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564043gi);
        this.f264231m = imageView;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.b2(this));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f264232n = textView;
        com.p314xaae8f345.mm.ui.f.b(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r);
        this.f264233o = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564071h4);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564070h3);
        this.f264234p = imageView2;
        imageView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.c2(this));
        imageView2.setClickable(false);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564072h5);
        this.f264235q = textView2;
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d2(this));
        textView2.setClickable(false);
    }

    /* renamed from: getActionBarHeight */
    private int m74251xb0586f4e() {
        return com.p314xaae8f345.mm.ui.bl.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    /* renamed from: setActionBarColor */
    private void m74252x5185d868(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebViewActionBar", "setActionBarColor, color : %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            i17 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        }
        boolean g17 = com.p314xaae8f345.mm.ui.uk.g(i17);
        int i18 = this.f264243y;
        if (i18 == 0) {
            g17 = true;
        } else if (i18 == 1) {
            g17 = false;
        }
        vj5.a.a(this.f264225d, i17, !g17);
        this.B = java.lang.Integer.valueOf(i17);
        this.C = g17;
        m74253x1b598243(i17);
        e(g17);
    }

    /* renamed from: setActionBarViewColor */
    private void m74253x1b598243(int i17) {
        android.view.View view = this.f264244z;
        if (view != null) {
            view.setBackgroundColor(i17);
            if (((i17 >> 24) & 255) / 255.0f > 0.0f) {
                view.setClickable(true);
            } else {
                view.setClickable(false);
            }
        }
    }

    /* renamed from: setImmersiveStyle */
    private void m74254xff3c34b8(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebViewActionBar", "setImmersiveStyle");
        int i17 = this.f264243y;
        if (i17 == 0) {
            z17 = true;
        } else if (i17 == 1) {
            z17 = false;
        }
        vj5.a.a(this.f264225d, 0, !z17);
        this.B = 0;
        this.C = z17;
        m74253x1b598243(0);
        this.f264232n.setVisibility(8);
        this.f264230i.setVisibility(8);
        this.f264231m.setImageAlpha(255);
        this.f264234p.setImageAlpha(255);
        e(z17);
    }

    public final void a(boolean z17) {
        android.widget.ImageView imageView = this.f264234p;
        if (imageView != null) {
            if (z17) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
            }
        }
    }

    public void b() {
        this.A = true;
        android.widget.ImageView imageView = this.f264230i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.view.View view = this.f264229h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar", "fakeNativeClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar", "fakeNativeClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(boolean z17);

    public void f(int i17, boolean z17, boolean z18) {
        java.lang.Integer num;
        this.f264241w = i17;
        this.f264242x = z18;
        if (z17 && ((num = this.B) == null || num.intValue() == 0)) {
            m74254xff3c34b8(z18);
        } else {
            m74252x5185d868(i17);
        }
    }

    public void g() {
        m74254xff3c34b8(this.f264242x);
    }

    /* renamed from: getMenuHelp */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y mo64586x57d7ceb6() {
        if (this.f264236r == null) {
            this.f264236r = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.y();
        }
        return this.f264236r;
    }

    /* renamed from: getTitle */
    public java.lang.String m74255x7531c8a2() {
        return this.f264239u;
    }

    /* renamed from: getTopBarHeight */
    public int m74256xf1d6ffbb() {
        return this.f264225d.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h() {
        /*
            r13 = this;
            com.tencent.mm.plugin.webview.luggage.d4 r0 = r13.f264237s
            r1 = 0
            if (r0 == 0) goto Le8
            java.lang.String r2 = "zh_CN"
            boolean r3 = r0.f263701a
            r4 = 1
            if (r3 == 0) goto L44
            java.lang.String r3 = r0.f263708h
            boolean r5 = r2.equals(r3)
            if (r5 == 0) goto L18
            java.lang.String r5 = r0.f263702b
            goto L1a
        L18:
            java.lang.String r5 = r0.f263703c
        L1a:
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r5 != 0) goto L44
            boolean r5 = r2.equals(r3)
            if (r5 == 0) goto L29
            java.lang.String r5 = r0.f263704d
            goto L2b
        L29:
            java.lang.String r5 = r0.f263705e
        L2b:
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r5 != 0) goto L44
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3a
            java.lang.String r0 = r0.f263706f
            goto L3c
        L3a:
            java.lang.String r0 = r0.f263707g
        L3c:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto L44
            r0 = r4
            goto L45
        L44:
            r0 = r1
        L45:
            if (r0 == 0) goto Le8
            com.tencent.mm.plugin.webview.luggage.d4 r0 = r13.f264237s
            java.lang.String r3 = r0.f263708h
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L54
            java.lang.String r0 = r0.f263702b
            goto L56
        L54:
            java.lang.String r0 = r0.f263703c
        L56:
            com.tencent.mm.plugin.webview.luggage.d4 r3 = r13.f264237s
            java.lang.String r5 = r3.f263708h
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L63
            java.lang.String r3 = r3.f263704d
            goto L65
        L63:
            java.lang.String r3 = r3.f263705e
        L65:
            r9 = r3
            com.tencent.mm.plugin.webview.luggage.d4 r3 = r13.f264237s
            java.lang.String r5 = r3.f263708h
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L73
            java.lang.String r2 = r3.f263706f
            goto L75
        L73:
            java.lang.String r2 = r3.f263707g
        L75:
            r10 = r2
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r9, r10}
            java.lang.String r3 = "MicroMsg.GameWebViewActionBar"
            java.lang.String r5 = "use js api close window confirm info : %s, %s, %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5, r2)
            android.content.Context r2 = r13.getContext()
            r3 = 2131498192(0x7f0c14d0, float:1.8619998E38)
            r5 = 0
            android.view.View r8 = android.view.View.inflate(r2, r3, r5)
            r2 = 2131314490(0x7f09473a, float:1.8247406E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r2.setChecked(r1)
            r1 = 8
            r2.setVisibility(r1)
            r2 = 2131314492(0x7f09473c, float:1.824741E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r0)
            android.content.res.Resources r0 = r13.getResources()
            r3 = 2131101993(0x7f060929, float:1.7816411E38)
            int r0 = r0.getColor(r3)
            r2.setTextColor(r0)
            r0 = 2131314491(0x7f09473b, float:1.8247409E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r2 = r13.getResources()
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            r0.setVisibility(r1)
            android.content.Context r5 = r13.getContext()
            r6 = 1
            java.lang.String r7 = ""
            com.tencent.mm.plugin.webview.luggage.e2 r11 = new com.tencent.mm.plugin.webview.luggage.e2
            r11.<init>(r13)
            com.tencent.mm.plugin.webview.luggage.f2 r12 = new com.tencent.mm.plugin.webview.luggage.f2
            r12.<init>(r13)
            com.tencent.mm.ui.widget.dialog.j0 r0 = db5.e1.I(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f264238t = r0
            return r4
        Le8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1.h():boolean");
    }

    public abstract void i();

    /* renamed from: setActionBarColorValue */
    public void m74257x26c2c9e9(int i17) {
        this.f264241w = i17;
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        if (f17 == 0.0f) {
            g();
            return;
        }
        int i17 = (int) (255.0f * f17);
        android.widget.TextView textView = this.f264232n;
        textView.setVisibility(0);
        boolean z17 = this.A;
        android.widget.ImageView imageView = this.f264230i;
        if (z17) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        int i18 = this.f264241w;
        int i19 = ((i18 >> 16) & 255) << 16;
        m74252x5185d868((i18 & 255) | i19 | (i17 << 24) | (((i18 >> 8) & 255) << 8));
        textView.setAlpha(f17);
        imageView.setImageAlpha(i17);
        this.f264231m.setImageAlpha(i17);
        this.f264234p.setImageAlpha(i17);
    }

    /* renamed from: setBackBtn */
    public void m74258x9c8c0d33(int i17) {
        this.f264231m.setImageResource(i17);
    }

    /* renamed from: setCloseWindowConfirmInfo */
    public void m74259x8e5d7968(android.os.Bundle bundle) {
        this.f264237s = bundle == null ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d4(bundle);
    }

    /* renamed from: setIconDark */
    public void m74260x4a8f5a11(int i17) {
        this.f264243y = i17;
    }

    /* renamed from: setNavigationBarButtons */
    public void m74261x753cf8a4(android.os.Bundle bundle) {
        android.graphics.Bitmap a17;
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("set_navigation_bar_buttons_left_text_color");
        boolean z17 = bundle.getBoolean("set_navigation_bar_buttons_hide_right_button", false);
        java.lang.String string2 = bundle.getString("set_navigation_bar_buttons_text");
        java.lang.String string3 = bundle.getString("set_navigation_bar_buttons_icon_data");
        java.lang.String string4 = bundle.getString("set_navigation_bar_buttons_text_color");
        boolean z18 = bundle.getBoolean("set_navigation_bar_buttons_need_click_event", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.c(string, -16777216);
        int d17 = (int) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.d(string4, -1L);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
            try {
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.a(string3);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebViewActionBar", "setNavigationBarButtons, decode base64 image, exception = %s", e17);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.i2(this, z17, a17, string2, d17, z18));
        }
        a17 = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.i2(this, z17, a17, string2, d17, z18));
    }

    /* renamed from: setOptionEnable */
    public void m74262xd4333bda(boolean z17) {
        android.widget.TextView textView = this.f264235q;
        android.widget.ImageView imageView = this.f264234p;
        if (z17) {
            imageView.setClickable(true);
            textView.setClickable(true);
        } else {
            imageView.setClickable(false);
            textView.setClickable(false);
        }
    }

    /* renamed from: setTitleColor */
    public void m74263xb124d9ed(int i17) {
        this.f264232n.setTextColor(i17);
    }

    /* renamed from: setTitleText */
    public void m74264xdc742163(java.lang.String str) {
        this.f264239u = str;
        this.f264232n.setText(str);
    }
}
