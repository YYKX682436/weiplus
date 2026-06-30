package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b;

/* renamed from: com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI */
/* loaded from: classes15.dex */
public abstract class AbstractActivityC18755xab3fd75e extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements fn4.b, pm4.s {
    public static final /* synthetic */ int X = 0;
    public fn4.k0 G;
    public fn4.a1 H;
    public fn4.r0 I;

    /* renamed from: J, reason: collision with root package name */
    public fn4.l1 f256659J;
    public fn4.z0 K;
    public boolean L;
    public in4.q M;
    public boolean N;
    public in4.h P;
    public android.graphics.Point Q;
    public int R;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 S;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 T;
    public boolean U;
    public sm4.j V;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f256660d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f256661e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f256662f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f256663g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f256664h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f256665i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageButton f256666m;

    /* renamed from: n, reason: collision with root package name */
    public fn4.c0 f256667n;

    /* renamed from: o, reason: collision with root package name */
    public r45.un6 f256668o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f256669p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f256670q;

    /* renamed from: r, reason: collision with root package name */
    public fn4.e f256671r;

    /* renamed from: s, reason: collision with root package name */
    public fn4.d f256672s;

    /* renamed from: t, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f256673t;

    /* renamed from: u, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f256674u;

    /* renamed from: v, reason: collision with root package name */
    public fn4.e f256675v;

    /* renamed from: w, reason: collision with root package name */
    public fn4.d f256676w;

    /* renamed from: x, reason: collision with root package name */
    public an4.a f256677x;

    /* renamed from: y, reason: collision with root package name */
    public xm4.a f256678y;

    /* renamed from: z, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f256679z = new fn4.w(this);
    public boolean A = true;
    public int B = 0;
    public long C = -1;
    public long D = -1;
    public boolean E = false;
    public final fn4.b0 F = new fn4.x(this);
    public final com.p314xaae8f345.mm.p944x882e457a.u0 W = new fn4.p(this);

    @Override // fn4.b
    public void A4(int i17, java.lang.String str) {
    }

    @Override // fn4.b
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf B() {
        return this;
    }

    @Override // fn4.b
    public void B2() {
        a7();
    }

    @Override // fn4.b
    public void E3(java.lang.String str) {
        this.f256668o.f469052y = str;
    }

    @Override // fn4.b
    public void F2(android.view.View view, int i17) {
        if (this.f256659J.d()) {
            this.f256659J.h();
            this.L = true;
        }
        in4.q qVar = new in4.q(mo55332x76847179(), this.K.d(i17), new fn4.y(this, view, i17));
        this.M = qVar;
        if (this.U) {
            qVar.c(view, true, 0 - i65.a.b(mo55332x76847179(), 40), i65.a.b(mo55332x76847179(), 16));
            try {
                ((gn4.c0) this.f256659J.f346107c.mo129842x143e7d6c()).z();
            } catch (java.lang.Exception unused) {
            }
        } else {
            qVar.c(view, false, 0, 0);
        }
        jx3.f.INSTANCE.d(17080, 65, 1);
    }

    @Override // fn4.b
    public boolean H4() {
        return this.f256668o.f469039i != 326;
    }

    @Override // fn4.b
    public boolean H6() {
        return this.f256668o.f469039i != 36;
    }

    @Override // fn4.b
    public fn4.l1 I2() {
        return this.f256659J;
    }

    @Override // fn4.b
    public void O1(java.util.List list, boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fn4.n(this, list, z17));
    }

    @Override // fn4.b
    public fn4.r0 Q4() {
        return this.I;
    }

    @Override // fn4.b
    public void R2() {
        runOnUiThread(new fn4.q(this));
    }

    @Override // fn4.b
    public void U0(r45.xn6 xn6Var, android.view.View view) {
        if (xn6Var != null) {
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this)) {
                dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0_), 0).show();
                return;
            }
            if (this.V != null) {
                gm0.j1.d().d(this.V);
            }
            java.lang.String str = xn6Var.G;
            int i17 = xn6Var.R ? 5 : 4;
            java.lang.String str2 = "" + java.lang.System.currentTimeMillis();
            r45.un6 un6Var = this.f256668o;
            this.V = new sm4.j(xn6Var, str, i17, str2, un6Var.f469039i, un6Var.f469040m, p6() ? qf1.f.f76475x366c91de : qf1.j.f76479x366c91de, xn6Var.f471792h, xn6Var.S, 1);
            gm0.j1.d().g(this.V);
            boolean z17 = !xn6Var.R;
            xn6Var.R = z17;
            if (z17) {
                xn6Var.X++;
            } else {
                xn6Var.X--;
            }
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.poh)).setText(wm4.u.p(xn6Var.X));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onWowBtnClick thumb:" + xn6Var.R);
        }
    }

    public abstract fn4.e U6();

    public abstract fn4.e V6();

    public abstract fn4.d W6();

    @Override // fn4.b
    public void X1(int i17) {
        this.f256668o.f469049v = i17;
    }

    public abstract fn4.d X6();

    @Override // fn4.b
    public int Y2() {
        return this.f256668o.f469049v;
    }

    public void Y6() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.D = android.os.SystemClock.elapsedRealtime();
    }

    public final int Z6() {
        return ((android.media.AudioManager) getApplicationContext().getSystemService("audio")).getStreamVolume(3);
    }

    @Override // fn4.b
    public void a2(r45.xn6 xn6Var) {
        if (!this.U) {
            this.f256661e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hsn);
            this.f256665i.setVisibility(8);
        }
        an4.a aVar = this.f256677x;
        if (aVar != null) {
            aVar.c0(this.f256668o, xn6Var);
        }
        xm4.a aVar2 = this.f256678y;
        if (aVar2 != null) {
            aVar2.u0(this.f256668o, xn6Var);
        }
    }

    public final void a7() {
        getWindow().setFlags(201327616, 201327616);
        android.view.View decorView = getWindow().getDecorView();
        if (fp.h.a(19)) {
            decorView.setSystemUiVisibility(2);
        } else {
            decorView.setSystemUiVisibility(4098);
        }
        getWindow().addFlags(128);
    }

    public void b7() {
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264().o();
        }
        a7();
        this.f256660d = findViewById(com.p314xaae8f345.mm.R.id.f568869oc0);
        this.f256661e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f256665i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ne8);
        this.f256662f = findViewById(com.p314xaae8f345.mm.R.id.k0z);
        this.f256663g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567594k11);
        this.f256664h = findViewById(com.p314xaae8f345.mm.R.id.jqy);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.aa8);
        this.f256666m = imageButton;
        imageButton.getDrawable().setColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an), android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f256666m.setOnClickListener(new fn4.r(this));
        this.f256662f.setOnClickListener(new fn4.s(this));
        android.view.View view = this.f256662f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f569093p03);
        this.f256669p = c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f256679z;
        c1163xf1deaba4.i(w2Var);
        this.f256669p.m7964x8d4ad49c(new fn4.a0(this, null));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        this.f256670q = c1162x665295de;
        this.f256669p.mo7967x900dcbe1(c1162x665295de);
        this.S = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(this.f256670q);
        fn4.e U6 = U6();
        this.f256671r = U6;
        this.f256669p.mo7960x6cab2c8d(U6);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.gfj);
        this.f256673t = c1163xf1deaba42;
        c1163xf1deaba42.i(w2Var);
        this.f256673t.m7964x8d4ad49c(new fn4.a0(this, null));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        this.f256674u = c1162x665295de2;
        this.f256673t.mo7967x900dcbe1(c1162x665295de2);
        this.T = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(this.f256674u);
        fn4.e V6 = V6();
        this.f256675v = V6;
        this.f256673t.mo7960x6cab2c8d(V6);
        this.f256673t.setVisibility(8);
        if (!this.E && !p6()) {
            fn4.c0 c0Var = new fn4.c0(getApplicationContext());
            this.f256667n = c0Var;
            c0Var.enable();
            this.f256667n.f346020e = this.F;
            this.E = true;
        }
        boolean z17 = this.f256668o.f469051x;
        if (z17) {
            j7(z17);
        }
        this.G.f346101b = this;
        this.f256664h.setOnClickListener(new fn4.t(this));
    }

    public void c7() {
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_context");
        r45.un6 un6Var = new r45.un6();
        this.f256668o = un6Var;
        try {
            un6Var.mo11468x92b714fd(byteArrayExtra);
        } catch (java.lang.Exception unused) {
            finish();
        }
        fn4.z0 z0Var = new fn4.z0();
        this.K = z0Var;
        z0Var.f346164a = this;
        fn4.r0 r0Var = new fn4.r0();
        this.I = r0Var;
        r0Var.c(this);
        fn4.a1 a1Var = new fn4.a1();
        this.H = a1Var;
        a1Var.f346009c++;
        a1Var.f346008b = this;
        fn4.l1 l1Var = new fn4.l1();
        this.f256659J = l1Var;
        l1Var.f346105a++;
        l1Var.f346114j = this;
        this.G = new fn4.k0();
        this.f256672s = X6();
        this.f256676w = W6();
        xm4.a aVar = new xm4.a(new xm4.b(this));
        this.f256678y = aVar;
        aVar.b(8, this.f256668o.f469045r);
        this.f256678y.Z(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k07));
        an4.a aVar2 = new an4.a(new an4.b(this));
        this.f256677x = aVar2;
        aVar2.y(8, this.f256668o.f469045r);
        this.f256677x.L(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k07));
    }

    @Override // fn4.b
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 d2() {
        return this.U ? this.T : this.S;
    }

    public void d7() {
    }

    public void e7(int i17) {
    }

    public abstract void f7(r45.xn6 xn6Var, android.view.View view, boolean z17);

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        xm4.a aVar = this.f256678y;
        if (aVar != null) {
            aVar.p();
        }
        super.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r9.D) >= 50) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r9.D) >= 50) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g7() {
        /*
            r9 = this;
            boolean r0 = r9.U
            if (r0 == 0) goto La
            fn4.d r0 = r9.f256676w
            r0.b(r9)
            goto Lf
        La:
            fn4.d r0 = r9.f256672s
            r0.b(r9)
        Lf:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r9.u6()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r0
            int r0 = r0.y()
            r9.B = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r9.u6()
            int r0 = r0.m8020x7e414b06()
            long r1 = r9.C
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 50
            if (r3 <= 0) goto L38
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r1
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L8b
        L38:
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r1 = android.os.SystemClock.elapsedRealtime()
            r9.C = r1
            fn4.z0 r1 = r9.K
            int r2 = r1.f346166c
            r3 = 1
            r6 = 0
            if (r2 == r3) goto L5d
            int r2 = r9.B
            int r0 = r0 - r3
            if (r2 < r0) goto L74
            boolean r0 = r1.f346165b
            if (r0 != 0) goto L74
            long r0 = r9.D
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L74
            goto L72
        L5d:
            int r2 = r9.B
            int r0 = r0 - r2
            r2 = 3
            if (r0 > r2) goto L74
            boolean r0 = r1.f346165b
            if (r0 != 0) goto L74
            long r0 = r9.D
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L74
        L72:
            r0 = r3
            goto L75
        L74:
            r0 = r6
        L75:
            r45.un6 r1 = r9.f256668o
            int r2 = r1.f469039i
            r4 = 36
            if (r2 == r4) goto L81
            boolean r1 = r1.A
            if (r1 == 0) goto L82
        L81:
            r3 = r6
        L82:
            if (r3 != 0) goto L85
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8b
            r9.Y6()
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e.g7():void");
    }

    @Override // fn4.b
    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo72292x4905e9fa() {
        return this.U ? this.f256673t : this.f256669p;
    }

    @Override // fn4.b
    /* renamed from: getVideoHeight */
    public int mo72293x463504c() {
        if (this.R == 0) {
            if (p6()) {
                this.R = 1280;
                int i17 = (y4().y * 3) / 5;
                if (this.R > i17) {
                    this.R = i17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "getVideoHeight %d maxVideoHeight %d", java.lang.Integer.valueOf(this.R), java.lang.Integer.valueOf(i17));
            } else {
                this.R = (mo72294x8d5c7601() * 280) / com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de;
            }
        }
        return this.R;
    }

    @Override // fn4.b
    /* renamed from: getVideoWidth */
    public int mo72294x8d5c7601() {
        return java.lang.Math.min(y4().x, y4().y);
    }

    @Override // fn4.b
    public boolean h1() {
        return this.U;
    }

    @Override // fn4.b
    public int h3() {
        return this.f256668o.f469053z;
    }

    public void h7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setNeedScrollEvent %b", java.lang.Boolean.valueOf(z17));
        this.A = z17;
    }

    public final void i7() {
        if (this.f256668o.f469051x) {
            this.f256663g.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f81237xc9d81dfe);
        } else {
            this.f256663g.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f81238x8261cf70);
        }
        fn4.l1 l1Var = this.f256659J;
        if (l1Var.f346109e) {
            l1Var.l(this.f256668o.f469051x);
        }
    }

    @Override // fn4.b
    /* renamed from: isMute */
    public boolean mo72295xb9a62e63() {
        return this.f256668o.f469051x;
    }

    public void j7(boolean z17) {
        if (z17) {
            this.f256668o.f469051x = true;
        } else {
            this.f256668o.f469051x = false;
            if (Z6() == 0) {
                to.a.c((android.media.AudioManager) mo55332x76847179().getSystemService("audio"), 3, 1, 0);
            }
        }
        i7();
    }

    @Override // fn4.b
    public void k4(int i17) {
        this.f256668o.f469053z = i17;
    }

    @Override // fn4.b
    public int l4() {
        return wm4.a.f528816a;
    }

    @Override // fn4.b
    public void m() {
    }

    @Override // fn4.b
    public fn4.a1 o4() {
        return this.H;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        d7();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c7();
        b7();
        gm0.j1.d().a(2802, this.W);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        pm4.y.g(this.f256668o, mo78509x4b0ac5a2(), this.K.d(this.f256668o.f469049v));
        if (this.E) {
            this.f256667n.disable();
            this.f256667n.f346020e = null;
            this.f256667n = null;
        }
        if (this.V != null) {
            gm0.j1.d().d(this.V);
        }
        gm0.j1.d().q(2802, this.W);
        this.K.i();
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().getClass();
        this.f256659J.f();
        fn4.k0 k0Var = this.G;
        k0Var.getClass();
        gm0.j1.n().d(k0Var.f346103d);
        k0Var.f346101b = null;
        k0Var.f346102c = 0;
        k0Var.f346100a = false;
        this.H.b();
        this.I.d();
        uu4.a.a(16);
        xm4.a aVar = this.f256678y;
        if (aVar != null) {
            aVar.o0();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 25 && keyEvent.getAction() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onKeyDown KEYCODE_VOLUME_DOWN %d", java.lang.Integer.valueOf(Z6()));
            this.f256668o.f469051x = Z6() <= 1;
            i7();
        } else if (i17 == 24 && keyEvent.getAction() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "onKeyDown KEYCODE_VOLUME_UP %d", java.lang.Integer.valueOf(Z6()));
            this.f256668o.f469051x = false;
            i7();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            fn4.c1 c1Var = this.f256659J.f346106b;
            if (c1Var != null) {
                c1Var.e();
            }
            ((pm4.r) i95.n0.c(pm4.r.class)).getClass();
        } catch (java.lang.Exception unused) {
        }
        uu4.a.a(15);
        an4.a aVar = this.f256677x;
        if (aVar != null) {
            aVar.A();
        }
        xm4.a aVar2 = this.f256678y;
        if (aVar2 != null) {
            aVar2.z();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        a7();
        i7();
        ((pm4.r) i95.n0.c(pm4.r.class)).getClass();
        fn4.l1 l1Var = this.f256659J;
        fn4.c1 c1Var = l1Var.f346106b;
        if (c1Var != null) {
            c1Var.g();
            fn4.g gVar = l1Var.f346107c;
            if (gVar != null) {
                gVar.c();
            }
        }
        fn4.k0 k0Var = this.G;
        k0Var.f346102c = k0Var.a();
        uu4.a.a(14);
        an4.a aVar = this.f256677x;
        if (aVar != null) {
            aVar.z();
        }
        xm4.a aVar2 = this.f256678y;
        if (aVar2 != null) {
            aVar2.x();
        }
    }

    @Override // fn4.b
    public boolean p6() {
        return this.f256668o.f469038h == 100203;
    }

    @Override // fn4.b
    public r45.un6 r0() {
        return this.f256668o;
    }

    @Override // fn4.b
    public fn4.k0 s1() {
        return this.G;
    }

    @Override // fn4.b
    public fn4.z0 s4() {
        return this.K;
    }

    @Override // fn4.b
    public void t() {
    }

    @Override // fn4.b
    public fn4.e t0() {
        return this.U ? this.f256675v : this.f256671r;
    }

    @Override // fn4.b
    public java.lang.String t3() {
        java.lang.String str = this.f256668o.f469052y;
        return str == null ? "" : str;
    }

    @Override // fn4.b
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager u6() {
        return this.U ? this.f256674u : this.f256670q;
    }

    @Override // fn4.b
    public android.graphics.Point y4() {
        if (this.Q == null) {
            this.Q = com.p314xaae8f345.mm.ui.bk.h(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "lxl screenSize:%s, %s", java.lang.Integer.valueOf(this.Q.x), java.lang.Integer.valueOf(this.Q.y));
        return this.Q;
    }

    @Override // pm4.s
    public void z3(int i17, int i18) {
        this.f256659J.e(i17, i18);
    }

    @Override // fn4.b
    public java.lang.String z4() {
        return pm4.w.j(this.f256668o.f469045r);
    }
}
