package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class a4 extends android.widget.RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f288112n = java.lang.Boolean.TRUE;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288113d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f288114e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f288115f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288116g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f288117h;

    /* renamed from: i, reason: collision with root package name */
    public final l75.q0 f288118i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f288119m;

    public a4(android.content.Context context) {
        super(context);
        this.f288113d = null;
        this.f288114e = null;
        this.f288115f = null;
        this.f288116g = true;
        this.f288117h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2690x38b72420.u3(this), true);
        com.p314xaae8f345.mm.ui.p2690x38b72420.v3 v3Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.v3(this);
        this.f288118i = v3Var;
        this.f288119m = false;
        this.f288113d = context;
        r21.w.wi().add(v3Var);
        c();
        a();
    }

    public final void a() {
        java.lang.String string;
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p2621x8fb0427b.o7 wi6 = r21.w.wi();
        wi6.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = wi6.f276736d.f("select * from fmessage_conversation  where isNew = 1 ORDER BY lastModifiedTime DESC limit 4", null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.m7();
            m7Var.mo9015xbf5d97fd(f17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m7Var.f66376x114ef53e)) {
                arrayList.add(m7Var);
            }
        }
        f17.close();
        int size = arrayList.size();
        removeAllViews();
        android.content.Context context = this.f288113d;
        if (size <= 0) {
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageContactView", "initNoNew failed. context is null.");
            } else {
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.baw, this);
                this.f288114e = inflate;
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.g_9);
                this.f288115f = findViewById;
                android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = (int) (i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561146ao) * i65.a.A(context));
                this.f288115f.setLayoutParams(layoutParams);
                tf5.m.O6(this.f288114e, 1);
                this.f288114e.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.x3(this));
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e956 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9q);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().getClass();
                java.util.Map map = com.p314xaae8f345.mm.p943x351df9c2.z.f152109c;
                int intValue = ((java.util.concurrent.ConcurrentHashMap) map).containsKey("fmessage") ? ((java.lang.Integer) ((com.p314xaae8f345.mm.p943x351df9c2.y) map).get("fmessage")).intValue() : 0;
                if (intValue != 0) {
                    com.p314xaae8f345.mm.p943x351df9c2.d1.Bi().getClass();
                    bitmap = bp.b.m10969xb866ec1c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), intValue, null);
                } else {
                    bitmap = null;
                }
                ((android.widget.ImageView) c21522xf5a6e956.m79176xc2a54588()).setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t0(bitmap, true, 1.0f, true, null));
            }
        } else if (size == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) arrayList.get(0);
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageContactView", "initSingleNew failed. context is null.");
            } else {
                if (i65.a.D(context)) {
                    this.f288114e = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.baz, this);
                } else {
                    this.f288114e = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bay, this);
                }
                android.widget.TextView textView = (android.widget.TextView) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g_d);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = m7Var2.f66365xd1eb2ea8;
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
                android.widget.TextView textView2 = (android.widget.TextView) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g_c);
                com.p314xaae8f345.mm.p2621x8fb0427b.p7 W0 = r21.w.Ai().W0(m7Var2.f66376x114ef53e);
                int i17 = W0.f66494x2262335f;
                java.lang.String str2 = W0.f66491xbeb3161d;
                boolean z17 = !W0.u0();
                if (i17 == 0) {
                    if (str2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageProvider", "setDigest fail, fmsgContent is null");
                        str2 = null;
                    } else {
                        com.p314xaae8f345.mm.p2621x8fb0427b.y8 i18 = com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(str2);
                        int i19 = i18.f277897g;
                        if (i19 == 4) {
                            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1s);
                        } else if (i19 == 10 || i19 == 11) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5415x73917d14 c5415x73917d14 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5415x73917d14();
                            java.lang.String str3 = i18.f277898h;
                            am.l9 l9Var = c5415x73917d14.f135762g;
                            l9Var.f88763a = str3;
                            l9Var.f88764b = i18.f277899i;
                            c5415x73917d14.e();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            java.lang.String str4 = c5415x73917d14.f135763h.f88863a;
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            if (str4 == null) {
                                str4 = "";
                            }
                            objArr[0] = str4;
                            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1v, objArr);
                        } else if (i19 == 31) {
                            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572391b24);
                        } else if (i19 != 32) {
                            switch (i19) {
                                case 58:
                                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                                case 60:
                                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1t);
                                    break;
                                default:
                                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1x);
                                    break;
                            }
                        } else {
                            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1y);
                        }
                        str2 = string;
                    }
                } else if (!z17) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.e9 f18 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(str2);
                    java.lang.String str5 = f18.f275397f;
                    str2 = (str5 == null || str5.trim().equals("")) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbh) : f18.f275397f;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str2);
                }
                this.f288115f = this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9v);
                tf5.m.O6(this.f288114e, 1);
                this.f288114e.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.y3(this));
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9q)).m79176xc2a54588(), m7Var2.f66376x114ef53e, null);
            }
        } else if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageContactView", "initMultiNew failed. context is null.");
        } else {
            this.f288114e = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bax, this);
            int size2 = arrayList.size();
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) arrayList.get(0);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e9562 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9q);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) c21522xf5a6e9562.m79176xc2a54588(), m7Var3.f66376x114ef53e, null);
            c21522xf5a6e9562.setVisibility(0);
            com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var4 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) arrayList.get(1);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e9563 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9r);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) c21522xf5a6e9563.m79176xc2a54588(), m7Var4.f66376x114ef53e, null);
            c21522xf5a6e9563.setVisibility(0);
            if (size2 > 2) {
                com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var5 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) arrayList.get(2);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e9564 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9s);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) c21522xf5a6e9564.m79176xc2a54588(), m7Var5.f66376x114ef53e, null);
                c21522xf5a6e9564.setVisibility(0);
            }
            if (size2 > 3) {
                com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var6 = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) arrayList.get(3);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e9565 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9t);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) c21522xf5a6e9565.m79176xc2a54588(), m7Var6.f66376x114ef53e, null);
                c21522xf5a6e9565.setVisibility(0);
            }
            this.f288115f = this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9v);
            tf5.m.O6(this.f288114e, 1);
            this.f288115f.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.z3(this));
        }
        android.view.View findViewById2 = this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9v);
        if (findViewById2 != null) {
            int i27 = this.f288116g ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/FMessageContactView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/FMessageContactView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f288115f.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.w3(this));
        int W02 = r21.w.wi().W0();
        android.widget.TextView textView3 = (android.widget.TextView) this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g_7);
        textView3.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.a(context));
        if (W02 <= 0) {
            textView3.setVisibility(8);
            f288112n = java.lang.Boolean.FALSE;
            return;
        }
        textView3.setVisibility(0);
        f288112n = java.lang.Boolean.TRUE;
        if (W02 > 99) {
            textView3.setText("");
            textView3.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
        } else {
            textView3.setText("" + W02);
            textView3.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(context, W02));
        }
    }

    public void b() {
        if (c01.d9.b().p().q(143618, 0) > 0) {
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.J("fmessage", 2);
        }
        c01.d9.b().p().w(143618, 0);
    }

    public final void c() {
        int W0 = r21.w.wi().W0();
        if (W0 > 0) {
            c01.d9.b().p().w(143618, java.lang.Integer.valueOf(W0));
        }
    }

    /* renamed from: setFrontGround */
    public void m80410xf0725b4e(boolean z17) {
        this.f288119m = z17;
    }

    /* renamed from: setVisible */
    public void m80411xcd1079b0(boolean z17) {
        android.view.View findViewById = this.f288114e.findViewById(com.p314xaae8f345.mm.R.id.g9v);
        if (findViewById != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/FMessageContactView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/contact/FMessageContactView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f288116g = z17;
    }
}
