package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.LauncherUIBottomTabView */
/* loaded from: classes8.dex */
public class C21389xb8f36d3b extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.ui.t1 {
    public static final int L = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
    public static final int M = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561968xu);
    public static final java.lang.Long N = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    public final android.content.Context A;
    public final android.view.View.OnClickListener B;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 C;
    public final android.view.View.OnLongClickListener D;
    public android.widget.LinearLayout E;
    public int F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f278376J;
    public boolean K;

    /* renamed from: d, reason: collision with root package name */
    public int f278377d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.s1 f278378e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.t8 f278379f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.t8 f278380g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.t8 f278381h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.t8 f278382i;

    /* renamed from: m, reason: collision with root package name */
    public int f278383m;

    /* renamed from: n, reason: collision with root package name */
    public int f278384n;

    /* renamed from: o, reason: collision with root package name */
    public int f278385o;

    /* renamed from: p, reason: collision with root package name */
    public int f278386p;

    /* renamed from: q, reason: collision with root package name */
    public int f278387q;

    /* renamed from: r, reason: collision with root package name */
    public int f278388r;

    /* renamed from: s, reason: collision with root package name */
    public int f278389s;

    /* renamed from: t, reason: collision with root package name */
    public int f278390t;

    /* renamed from: u, reason: collision with root package name */
    public int f278391u;

    /* renamed from: v, reason: collision with root package name */
    public int f278392v;

    /* renamed from: w, reason: collision with root package name */
    public int f278393w;

    /* renamed from: x, reason: collision with root package name */
    public long f278394x;

    /* renamed from: y, reason: collision with root package name */
    public int f278395y;

    /* renamed from: z, reason: collision with root package name */
    public int f278396z;

    public C21389xb8f36d3b(android.content.Context context) {
        super(context);
        this.f278377d = 0;
        this.f278383m = 0;
        this.f278387q = 0;
        this.f278394x = 0L;
        this.f278395y = -1;
        this.f278396z = 0;
        this.B = new com.p314xaae8f345.mm.ui.q8(this);
        this.C = new com.p314xaae8f345.mm.ui.r8(this);
        this.D = new com.p314xaae8f345.mm.ui.s8(this);
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = false;
        this.f278376J = 0;
        this.K = false;
        this.A = context;
        c();
    }

    /* renamed from: setFriendUnreadMargin */
    private void m78449x78546bfd(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUITabView", "setFriendUnreadMargin: leftMargin:" + i17);
        android.widget.TextView textView = this.f278380g.f291420g;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin != i17) {
                    marginLayoutParams.leftMargin = i17;
                    this.f278380g.f291420g.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: setTextBold */
    private void m78450x3ab833d4(boolean z17) {
        android.widget.TextView textView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUITabView", "setTextBold: isBold:" + z17);
        com.p314xaae8f345.mm.ui.t8 t8Var = this.f278380g;
        if (t8Var == null || (textView = t8Var.f291420g) == null) {
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
        }
    }

    public final void a(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "tab_red_dot_" + i17);
        boolean z17 = view instanceof android.widget.TextView;
        java.lang.Long l17 = N;
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "red_dot_shape", 1);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tk(view, l17 + "_tab_red_dot_unreaad_" + i17);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "red_dot_shape", 0);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tk(view, l17 + "_tab_red_dot_" + i17);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).getClass();
        uy1.a.q(view, "link4TabPage", java.lang.Boolean.TRUE);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 160, 0);
    }

    public final com.p314xaae8f345.mm.ui.t8 b(int i17, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.t8 t8Var = new com.p314xaae8f345.mm.ui.t8(this);
        if (i65.a.E(getContext())) {
            t8Var.f291417d = android.view.LayoutInflater.from((android.app.Activity) getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.by6, (android.view.ViewGroup) null);
        } else {
            t8Var.f291417d = android.view.LayoutInflater.from((android.app.Activity) getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570807by5, (android.view.ViewGroup) null);
        }
        t8Var.f291418e = (com.p314xaae8f345.mm.ui.C21442x4f06d53) t8Var.f291417d.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        t8Var.f291419f = (android.widget.TextView) t8Var.f291417d.findViewById(com.p314xaae8f345.mm.R.id.f78260x61adb808);
        android.widget.TextView textView = (android.widget.TextView) t8Var.f291417d.findViewById(com.p314xaae8f345.mm.R.id.osw);
        t8Var.f291420g = textView;
        textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.a(getContext()));
        t8Var.f291421h = (android.widget.ImageView) t8Var.f291417d.findViewById(com.p314xaae8f345.mm.R.id.d2h);
        t8Var.f291417d.setTag(java.lang.Integer.valueOf(i17));
        t8Var.f291417d.setOnClickListener(this.B);
        t8Var.f291417d.setOnLongClickListener(this.D);
        t8Var.f291419f.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja) * i65.a.m(getContext()));
        t8Var.f291418e.setImportantForAccessibility(2);
        t8Var.f291421h.setImportantForAccessibility(2);
        a(t8Var.f291420g, i17);
        a(t8Var.f291421h, i17);
        return t8Var;
    }

    public final void c() {
        this.E = new android.widget.LinearLayout(getContext());
        if (com.p314xaae8f345.mm.ui.a4.f278650a.h(this.A)) {
            this.E.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        } else {
            this.E.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        }
        this.E.setOrientation(0);
        addView(this.E, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        this.f278396z = (int) (i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2) * i65.a.m(getContext()));
        android.view.ViewGroup viewGroup = this.E;
        com.p314xaae8f345.mm.ui.t8 b17 = b(0, viewGroup);
        b17.f291419f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gqz);
        b17.f291419f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        b17.f291418e.a(com.p314xaae8f345.mm.R.raw.f79673x28f986c0, com.p314xaae8f345.mm.R.raw.f80048xf9053791, com.p314xaae8f345.mm.R.raw.f80047x8e8a2dc3, i65.a.E(getContext()));
        b17.f291420g.setVisibility(4);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, this.f278396z);
        layoutParams.weight = 1.0f;
        viewGroup.addView(b17.f291417d, layoutParams);
        this.f278379f = b17;
        android.view.ViewGroup viewGroup2 = this.E;
        com.p314xaae8f345.mm.ui.t8 b18 = b(1, viewGroup2);
        b18.f291419f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpx);
        b18.f291419f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        b18.f291418e.a(com.p314xaae8f345.mm.R.raw.f79689xca74ae58, com.p314xaae8f345.mm.R.raw.f80068x8c4466a9, com.p314xaae8f345.mm.R.raw.f80067xa7749ab, i65.a.E(getContext()));
        b18.f291420g.setVisibility(4);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, this.f278396z);
        layoutParams2.weight = 1.0f;
        viewGroup2.addView(b18.f291417d, layoutParams2);
        this.f278381h = b18;
        android.view.ViewGroup viewGroup3 = this.E;
        com.p314xaae8f345.mm.ui.t8 b19 = b(2, viewGroup3);
        b19.f291419f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpv);
        b19.f291419f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        b19.f291418e.a(com.p314xaae8f345.mm.R.raw.f79701xa9326702, com.p314xaae8f345.mm.R.raw.f80078xeec1ba53, com.p314xaae8f345.mm.R.raw.f80077x3c926141, i65.a.E(getContext()));
        b19.f291420g.setVisibility(4);
        b19.f291422i = "discovery";
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(b19);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, this.f278396z);
        layoutParams3.weight = 1.0f;
        viewGroup3.addView(b19.f291417d, layoutParams3);
        this.f278380g = b19;
        android.view.ViewGroup viewGroup4 = this.E;
        com.p314xaae8f345.mm.ui.t8 b27 = b(3, viewGroup4);
        b27.f291419f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gqv);
        b27.f291419f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        b27.f291418e.a(com.p314xaae8f345.mm.R.raw.f79800x41cfccf3, com.p314xaae8f345.mm.R.raw.f80162xfee9d8f0, com.p314xaae8f345.mm.R.raw.f80162xfee9d8f0, i65.a.E(getContext()));
        b27.f291420g.setVisibility(4);
        b27.f291422i = "me";
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(b27);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(0, this.f278396z);
        layoutParams4.weight = 1.0f;
        viewGroup4.addView(b27.f291417d, layoutParams4);
        this.f278382i = b27;
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560992zw);
        this.f278383m = color;
        this.f278384n = (color & 16711680) >> 16;
        this.f278385o = (color & 65280) >> 8;
        this.f278386p = color & 255;
        int color2 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        this.f278387q = color2;
        int i17 = (16711680 & color2) >> 16;
        this.f278388r = i17;
        int i18 = (65280 & color2) >> 8;
        this.f278389s = i18;
        int i19 = color2 & 255;
        this.f278390t = i19;
        this.f278391u = this.f278384n - i17;
        this.f278392v = this.f278385o - i18;
        this.f278393w = this.f278386p - i19;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:11:0x0024, B:13:0x0038, B:16:0x0041, B:19:0x004c, B:24:0x005f, B:26:0x0063, B:31:0x006b), top: B:10:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L1e
            if (r10 == r0) goto L19
            r2 = 2
            if (r10 == r2) goto L14
            r2 = 3
            if (r10 == r2) goto Lf
            r2 = 0
            r3 = r1
            goto L22
        Lf:
            com.tencent.mm.ui.t8 r2 = r9.f278382i
            int r3 = r9.f278376J
            goto L22
        L14:
            com.tencent.mm.ui.t8 r2 = r9.f278380g
            int r3 = r9.H
            goto L22
        L19:
            com.tencent.mm.ui.t8 r2 = r9.f278381h
            int r3 = r9.G
            goto L22
        L1e:
            com.tencent.mm.ui.t8 r2 = r9.f278379f
            int r3 = r9.F
        L22:
            if (r2 == 0) goto L83
            android.widget.TextView r4 = r2.f291420g     // Catch: java.lang.Exception -> L73
            java.lang.CharSequence r4 = r4.getText()     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Exception -> L73
            int r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r4, r1)     // Catch: java.lang.Exception -> L73
            if (r5 != 0) goto L40
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)     // Catch: java.lang.Exception -> L73
            if (r5 != 0) goto L40
            r5 = r0
            goto L41
        L40:
            r5 = r1
        L41:
            android.widget.ImageView r2 = r2.f291421h     // Catch: java.lang.Exception -> L73
            int r2 = r2.getVisibility()     // Catch: java.lang.Exception -> L73
            if (r2 != 0) goto L4b
            r2 = r0
            goto L4c
        L4b:
            r2 = r1
        L4c:
            com.tencent.mm.autogen.events.WeChatTabRedDotEvent r6 = new com.tencent.mm.autogen.events.WeChatTabRedDotEvent     // Catch: java.lang.Exception -> L73
            r6.<init>()     // Catch: java.lang.Exception -> L73
            am.g20 r7 = r6.f136512g     // Catch: java.lang.Exception -> L73
            r7.f88264a = r10     // Catch: java.lang.Exception -> L73
            r7.f88266c = r3     // Catch: java.lang.Exception -> L73
            if (r2 != 0) goto L5e
            if (r5 == 0) goto L5c
            goto L5e
        L5c:
            r8 = r1
            goto L5f
        L5e:
            r8 = r0
        L5f:
            r7.f88265b = r8     // Catch: java.lang.Exception -> L73
            if (r3 != 0) goto L65
            r7.f88267d = r4     // Catch: java.lang.Exception -> L73
        L65:
            if (r2 != 0) goto L6b
            if (r5 == 0) goto L6a
            goto L6b
        L6a:
            r0 = r1
        L6b:
            zs.c.f556756a = r0     // Catch: java.lang.Exception -> L73
            zs.c.f556760e = r3     // Catch: java.lang.Exception -> L73
            r6.e()     // Catch: java.lang.Exception -> L73
            goto L83
        L73:
            r0 = move-exception
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r1 = "MicroMsg.LauncherUITabView"
            java.lang.String r2 = "notify tab reddot tabIndex [%d]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r2, r10)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21389xb8f36d3b.d(int):void");
    }

    public final void e() {
        android.view.View view = this.f278379f.f291417d;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        view.setTag(com.p314xaae8f345.mm.R.id.hui, bool);
        this.f278379f.f291417d.setSelected(false);
        this.f278380g.f291417d.setTag(com.p314xaae8f345.mm.R.id.hui, bool);
        this.f278380g.f291417d.setSelected(false);
        this.f278381h.f291417d.setTag(com.p314xaae8f345.mm.R.id.hui, bool);
        this.f278381h.f291417d.setSelected(false);
        this.f278382i.f291417d.setTag(com.p314xaae8f345.mm.R.id.hui, bool);
        this.f278382i.f291417d.setSelected(false);
    }

    public void f(boolean z17) {
        com.p314xaae8f345.mm.ui.t8 t8Var = this.f278380g;
        t8Var.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, t8Var)) {
            return;
        }
        if (z17 && this.f278380g.f291420g.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUITabView", "unreadTV is VISIBLE just return!");
            return;
        }
        if (this.I != z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TRDTemp", "[showFriendPoint] show : " + z17);
        }
        this.I = z17;
        m78449x78546bfd(-L);
        m78450x3ab833d4(false);
        this.f278380g.f291420g.setVisibility(4);
        this.f278380g.f291421h.setVisibility(z17 ? 0 : 4);
        com.p314xaae8f345.mm.ui.t8 t8Var2 = this.f278380g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
        t8Var2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(t8Var2, rVar, z17);
        d(2);
    }

    public void g(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.t8 t8Var = this.f278380g;
        t8Var.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, t8Var)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUITabView", "showFriendTextPoint show:" + z17 + " text:" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_COUNTER;
        if (!z17 || android.text.TextUtils.isEmpty(str)) {
            m78450x3ab833d4(false);
            this.f278380g.f291420g.setText("");
            this.f278380g.f291420g.setVisibility(4);
            int i17 = this.H;
            if (i17 > 0) {
                j(i17);
            } else {
                com.p314xaae8f345.mm.ui.t8 t8Var2 = this.f278380g;
                t8Var2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(t8Var2, rVar, false);
                boolean z18 = this.I;
                if (z18) {
                    f(z18);
                }
            }
        } else {
            this.f278380g.f291420g.setText(str);
            this.f278380g.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(getContext()));
            this.f278380g.f291420g.setVisibility(0);
            this.f278380g.f291420g.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(getContext(), 20));
            this.f278380g.f291421h.setVisibility(4);
            if (i65.a.E(this.A)) {
                m78449x78546bfd(-M);
            } else {
                m78449x78546bfd(-L);
            }
            m78450x3ab833d4(true);
            com.p314xaae8f345.mm.ui.t8 t8Var3 = this.f278380g;
            t8Var3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(t8Var3, rVar, true);
        }
        if (!u46.l.e(this.f278380g.f291420g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f278380g.f291420g, "red_dot_content", str);
        }
        d(2);
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: getContactTabUnread */
    public int mo78451x45062da() {
        return this.G;
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: getCurIdx */
    public int mo78452x14ac9753() {
        return this.f278377d;
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: getFriendTabUnread */
    public int mo78453x64935470() {
        return this.H;
    }

    /* renamed from: getFriendUnreadCountView */
    public android.widget.TextView m78454xa70a7131() {
        return this.f278380g.f291420g;
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: getMainTabUnread */
    public int mo78455x190d9235() {
        return this.F;
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: getSettingsPoint */
    public boolean mo78456x98878377() {
        return this.K;
    }

    /* renamed from: getSettingsPointView */
    public android.view.View m78457x39c39ebc() {
        com.p314xaae8f345.mm.ui.t8 t8Var = this.f278382i;
        if (t8Var != null) {
            return t8Var.f291421h;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: getSettingsTabUnread */
    public int mo78458x3f483e0b() {
        return this.f278376J;
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: getShowFriendPoint */
    public boolean mo78459xb7c31c1f() {
        return this.I;
    }

    public void h(boolean z17) {
        com.p314xaae8f345.mm.ui.t8 t8Var = this.f278382i;
        t8Var.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, t8Var)) {
            return;
        }
        mf4.d dVar = mf4.d.f407693a;
        mf4.d.f407707o = z17 ? 1L : 0L;
        this.K = z17;
        this.f278382i.f291420g.setVisibility(4);
        this.f278382i.f291421h.setVisibility(z17 ? 0 : 4);
        com.p314xaae8f345.mm.ui.t8 t8Var2 = this.f278382i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
        t8Var2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(t8Var2, rVar, z17);
        d(3);
    }

    public void i(int i17) {
        if (this.G != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TRDTemp", "[updateContactTabUnread] unread : " + i17);
        }
        this.G = i17;
        if (i17 <= 0) {
            this.f278381h.f291420g.setText("");
            this.f278381h.f291420g.setVisibility(4);
        } else if (i17 > 99) {
            this.f278381h.f291420g.setText("");
            this.f278381h.f291420g.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
            this.f278381h.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3));
            this.f278381h.f291420g.setVisibility(0);
            this.f278381h.f291421h.setVisibility(4);
        } else {
            this.f278381h.f291420g.setText(java.lang.String.valueOf(i17));
            this.f278381h.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(getContext()));
            this.f278381h.f291420g.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(getContext(), i17));
            this.f278381h.f291420g.setVisibility(0);
            this.f278381h.f291421h.setVisibility(4);
        }
        if (!u46.l.e(this.f278381h.f291420g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f278381h.f291420g, "red_dot_content", java.lang.Integer.valueOf(i17));
        }
        d(1);
    }

    public void j(int i17) {
        if (this.H != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TRDTemp", "[updateFriendTabUnread] unread : " + i17);
        }
        this.H = i17;
        com.p314xaae8f345.mm.ui.t8 t8Var = this.f278380g;
        boolean z17 = i17 > 0;
        t8Var.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, t8Var)) {
            return;
        }
        m78449x78546bfd(-L);
        m78450x3ab833d4(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_COUNTER;
        if (i17 > 0) {
            if (i17 > 99) {
                this.f278380g.f291420g.setText("");
                this.f278380g.f291420g.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
                this.f278380g.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3));
                this.f278380g.f291420g.setVisibility(0);
                this.f278380g.f291421h.setVisibility(4);
            } else {
                this.f278380g.f291420g.setText(java.lang.String.valueOf(i17));
                this.f278380g.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(getContext()));
                this.f278380g.f291420g.setVisibility(0);
                this.f278380g.f291420g.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(getContext(), i17));
                this.f278380g.f291421h.setVisibility(4);
            }
            com.p314xaae8f345.mm.ui.t8 t8Var2 = this.f278380g;
            t8Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(t8Var2, rVar, true);
        } else {
            this.f278380g.f291420g.setText("");
            this.f278380g.f291420g.setVisibility(4);
            com.p314xaae8f345.mm.ui.t8 t8Var3 = this.f278380g;
            t8Var3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(t8Var3, rVar, false);
        }
        if (!u46.l.e(this.f278380g.f291420g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f278380g.f291420g, "red_dot_content", java.lang.Integer.valueOf(i17));
        }
        d(2);
    }

    public void k(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUITabView", "updateMainTabUnread %d", java.lang.Integer.valueOf(i17));
        if (this.F != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TRDTemp", "[updateMainTabUnread] unread : " + i17);
        }
        this.F = i17;
        if (i17 <= 0) {
            this.f278379f.f291420g.setText("");
            this.f278379f.f291420g.setVisibility(4);
        } else if (i17 > 99) {
            this.f278379f.f291420g.setText("");
            this.f278379f.f291420g.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
            this.f278379f.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3));
            this.f278379f.f291420g.setVisibility(0);
            this.f278379f.f291420g.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574947k31));
            this.f278379f.f291421h.setVisibility(4);
        } else {
            this.f278379f.f291420g.setText(java.lang.String.valueOf(i17));
            this.f278379f.f291420g.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(getContext(), i17));
            this.f278379f.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(getContext()));
            this.f278379f.f291420g.setVisibility(0);
            this.f278379f.f291420g.setContentDescription(null);
            this.f278379f.f291421h.setVisibility(4);
        }
        if (!u46.l.e(this.f278379f.f291420g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f278379f.f291420g, "red_dot_content", java.lang.Integer.valueOf(i17));
        }
        d(0);
    }

    public void l(int i17) {
        if (this.f278376J != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TRDTemp", "[updateSettingsTabUnread] unread : " + i17);
        }
        this.f278376J = i17;
        com.p314xaae8f345.mm.ui.t8 t8Var = this.f278382i;
        boolean z17 = i17 > 0;
        t8Var.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, t8Var)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_COUNTER;
        if (i17 > 0) {
            if (i17 > 99) {
                this.f278382i.f291420g.setText("");
                this.f278382i.f291420g.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
                this.f278382i.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3));
                this.f278382i.f291420g.setVisibility(0);
                this.f278382i.f291421h.setVisibility(4);
            } else {
                this.f278382i.f291420g.setText(java.lang.String.valueOf(i17));
                this.f278382i.f291420g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(getContext()));
                this.f278382i.f291420g.setVisibility(0);
                this.f278382i.f291420g.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(getContext(), i17));
                this.f278382i.f291421h.setVisibility(4);
            }
            com.p314xaae8f345.mm.ui.t8 t8Var2 = this.f278382i;
            t8Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(t8Var2, rVar, true);
        } else {
            this.f278382i.f291420g.setText("");
            this.f278382i.f291420g.setVisibility(4);
            com.p314xaae8f345.mm.ui.t8 t8Var3 = this.f278382i;
            t8Var3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(t8Var3, rVar, false);
        }
        if (!u46.l.e(this.f278382i.f291420g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f278382i.f291420g, "red_dot_content", java.lang.Integer.valueOf(i17));
        }
        d(3);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View rootView = getRootView();
        if (rootView != null) {
            android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.kod);
            if (findViewById instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) findViewById;
                int childCount = c21470xb673f8d.getChildCount();
                for (int i28 = 0; i28 < childCount; i28++) {
                    android.view.View childAt = c21470xb673f8d.getChildAt(i28);
                    if (childAt instanceof com.p314xaae8f345.mm.ui.C21369x9726cc7b) {
                        com.p314xaae8f345.mm.ui.C21369x9726cc7b c21369x9726cc7b = (com.p314xaae8f345.mm.ui.C21369x9726cc7b) childAt;
                        c21369x9726cc7b.a(c21369x9726cc7b.getFrostedEnabled(), i27 - i18, getTranslationY());
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: setOnTabClickListener */
    public void mo78460x97cfa8c8(com.p314xaae8f345.mm.ui.s1 s1Var) {
        this.f278378e = s1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.t1
    /* renamed from: setTo */
    public void mo78461x684367d(int i17) {
        this.f278377d = i17;
        if (i17 == 0) {
            this.f278379f.f291418e.m78822xdca5b968(255);
            this.f278380g.f291418e.m78822xdca5b968(0);
            this.f278381h.f291418e.m78822xdca5b968(0);
            this.f278382i.f291418e.m78822xdca5b968(0);
            this.f278379f.f291419f.setTextColor(this.f278383m);
            this.f278380g.f291419f.setTextColor(this.f278387q);
            this.f278381h.f291419f.setTextColor(this.f278387q);
            this.f278382i.f291419f.setTextColor(this.f278387q);
            e();
            this.f278379f.f291417d.setTag(com.p314xaae8f345.mm.R.id.hui, java.lang.Boolean.TRUE);
            this.f278379f.f291417d.setSelected(true);
        } else if (i17 == 1) {
            this.f278379f.f291418e.m78822xdca5b968(0);
            this.f278380g.f291418e.m78822xdca5b968(0);
            this.f278381h.f291418e.m78822xdca5b968(255);
            this.f278382i.f291418e.m78822xdca5b968(0);
            this.f278379f.f291419f.setTextColor(this.f278387q);
            this.f278380g.f291419f.setTextColor(this.f278387q);
            this.f278381h.f291419f.setTextColor(this.f278383m);
            this.f278382i.f291419f.setTextColor(this.f278387q);
            e();
            this.f278381h.f291417d.setTag(com.p314xaae8f345.mm.R.id.hui, java.lang.Boolean.TRUE);
            this.f278381h.f291417d.setSelected(true);
        } else if (i17 == 2) {
            this.f278379f.f291418e.m78822xdca5b968(0);
            this.f278380g.f291418e.m78822xdca5b968(255);
            this.f278381h.f291418e.m78822xdca5b968(0);
            this.f278382i.f291418e.m78822xdca5b968(0);
            this.f278379f.f291419f.setTextColor(this.f278387q);
            this.f278380g.f291419f.setTextColor(this.f278383m);
            this.f278381h.f291419f.setTextColor(this.f278387q);
            this.f278382i.f291419f.setTextColor(this.f278387q);
            e();
            this.f278380g.f291417d.setTag(com.p314xaae8f345.mm.R.id.hui, java.lang.Boolean.TRUE);
            this.f278380g.f291417d.setSelected(true);
        } else if (i17 == 3) {
            this.f278379f.f291418e.m78822xdca5b968(0);
            this.f278380g.f291418e.m78822xdca5b968(0);
            this.f278381h.f291418e.m78822xdca5b968(0);
            this.f278382i.f291418e.m78822xdca5b968(255);
            this.f278379f.f291419f.setTextColor(this.f278387q);
            this.f278380g.f291419f.setTextColor(this.f278387q);
            this.f278381h.f291419f.setTextColor(this.f278387q);
            this.f278382i.f291419f.setTextColor(this.f278383m);
            e();
            this.f278382i.f291417d.setTag(com.p314xaae8f345.mm.R.id.hui, java.lang.Boolean.TRUE);
            this.f278382i.f291417d.setSelected(true);
        }
        this.f278394x = java.lang.System.currentTimeMillis();
        this.f278395y = this.f278377d;
    }

    public C21389xb8f36d3b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278377d = 0;
        this.f278383m = 0;
        this.f278387q = 0;
        this.f278394x = 0L;
        this.f278395y = -1;
        this.f278396z = 0;
        this.B = new com.p314xaae8f345.mm.ui.q8(this);
        this.C = new com.p314xaae8f345.mm.ui.r8(this);
        this.D = new com.p314xaae8f345.mm.ui.s8(this);
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = false;
        this.f278376J = 0;
        this.K = false;
        this.A = context;
        c();
    }

    public C21389xb8f36d3b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278377d = 0;
        this.f278383m = 0;
        this.f278387q = 0;
        this.f278394x = 0L;
        this.f278395y = -1;
        this.f278396z = 0;
        this.B = new com.p314xaae8f345.mm.ui.q8(this);
        this.C = new com.p314xaae8f345.mm.ui.r8(this);
        this.D = new com.p314xaae8f345.mm.ui.s8(this);
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = false;
        this.f278376J = 0;
        this.K = false;
        this.A = context;
        c();
    }
}
