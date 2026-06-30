package com.p314xaae8f345.mm.ui.p2740x696c9db;

@db5.a(m123858x6ac9171 = 2179)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.tools.ShowImageUI */
/* loaded from: classes3.dex */
public class ActivityC22534xec824752 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f291723u = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f291724d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e f291725e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.ub f291726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f291727g;

    /* renamed from: h, reason: collision with root package name */
    public int f291728h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f291729i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f291730m;

    /* renamed from: mStatusBarHeightCallback */
    private vj5.k f39692xb52fe880;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f291731n;

    /* renamed from: o, reason: collision with root package name */
    public long f291732o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f291733p = true;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c f291734q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f291735r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f291736s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f291737t = true;

    public static void T6(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752) {
        android.widget.FrameLayout frameLayout;
        activityC22534xec824752.getClass();
        int f17 = i65.a.f(activityC22534xec824752, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        if (activityC22534xec824752.f291728h != 1 || (frameLayout = (android.widget.FrameLayout) activityC22534xec824752.f291735r.findViewById(com.p314xaae8f345.mm.R.id.hbf)) == null) {
            return;
        }
        frameLayout.setPadding(f17, 0, f17, 0);
    }

    public final void U6(android.view.Window window, boolean z17, boolean z18) {
        int i17;
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if (z17) {
            int i18 = systemUiVisibility | 1024 | 256;
            i17 = (z18 ? i18 | 4 : i18 & (-5)) | 4096;
        } else {
            int i19 = systemUiVisibility & (-1025) & (-257);
            i17 = (z18 ? i19 | 4 : i19 & (-5)) & (-4097);
        }
        window.getDecorView().setSystemUiVisibility(i17);
    }

    public android.graphics.Bitmap V6(java.lang.String str) {
        android.graphics.Bitmap d17;
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
        if (n07 == null) {
            java.util.Vector vector = x51.w0.f533636a;
            d17 = x51.v0.b(str);
        } else {
            double min = java.lang.Math.min(1.0E7d, (((java.lang.Runtime.getRuntime().maxMemory() * 0.95d) - java.lang.Runtime.getRuntime().totalMemory()) + java.lang.Runtime.getRuntime().freeMemory()) / 4.0d);
            int i17 = n07.outWidth;
            int i18 = n07.outHeight;
            double d18 = min / (i17 * i18);
            if (d18 > 1.0d) {
                d17 = x51.w0.c(str);
            } else {
                int i19 = (int) (i17 * d18);
                int i27 = (int) (i18 * d18);
                java.util.Vector vector2 = x51.w0.f533636a;
                d17 = x51.v0.d(str, i19, i27);
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(d17, com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6() {
        /*
            r13 = this;
            java.lang.Class<xs.w0> r0 = xs.w0.class
            i95.m r0 = i95.n0.c(r0)
            xs.w0 r0 = (xs.w0) r0
            com.tencent.mm.storage.f9 r1 = r13.f291730m
            a80.b r0 = (a80.b) r0
            jz5.l r0 = r0.hj(r1)
            java.lang.Class<h90.w> r1 = h90.w.class
            i95.m r2 = i95.n0.c(r1)
            h90.w r2 = (h90.w) r2
            com.tencent.mm.storage.f9 r3 = r13.f291730m
            h90.a[] r4 = h90.a.f361204d
            g90.u r2 = (g90.u) r2
            r4 = 1
            int r2 = r2.Bi(r3, r4)
            r3 = 4
            r5 = 3
            if (r2 != r5) goto L39
            i95.m r2 = i95.n0.c(r1)
            h90.w r2 = (h90.w) r2
            com.tencent.mm.storage.f9 r6 = r13.f291730m
            g90.u r2 = (g90.u) r2
            int r2 = r2.Ai(r6, r4)
            if (r2 != r3) goto L39
            r8 = r4
            goto L3b
        L39:
            r2 = 0
            r8 = r2
        L3b:
            if (r8 != 0) goto L60
            i95.m r1 = i95.n0.c(r1)
            h90.w r1 = (h90.w) r1
            com.tencent.mm.storage.f9 r2 = r13.f291730m
            h90.a[] r6 = h90.a.f361204d
            g90.u r1 = (g90.u) r1
            int r1 = r1.Bi(r2, r3)
            if (r1 != r5) goto L5a
            java.lang.Object r0 = r0.f384366d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == r5) goto L5a
            goto L60
        L5a:
            com.tencent.mm.storage.f9 r0 = r13.f291730m
            r13.X6(r0)
            goto L6e
        L60:
            com.tencent.mm.storage.f9 r7 = r13.f291730m
            r9 = 0
            r10 = 4
            r11 = 2
            com.tencent.mm.ui.tools.ShowImageUI$$g r12 = new com.tencent.mm.ui.tools.ShowImageUI$$g
            r12.<init>()
            r6 = r13
            com.p314xaae8f345.mm.ui.p2740x696c9db.a1.d(r6, r7, r8, r9, r10, r11, r12)
        L6e:
            int r0 = r13.f291728h
            if (r0 != r4) goto L88
            java.lang.Class<h90.v> r0 = h90.v.class
            i95.m r0 = i95.n0.c(r0)
            h90.v r0 = (h90.v) r0
            com.tencent.mm.storage.f9 r3 = r13.f291730m
            int r4 = r13.f291736s
            r5 = 2
            r6 = 4
            r7 = 4
            r1 = r0
            g90.s r1 = (g90.s) r1
            r2 = r13
            r1.Zi(r2, r3, r4, r5, r6, r7)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.W6():void");
    }

    public final void X6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        zb0.a0 dbVar = ((j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20018xa2ab9426()) == 1) && this.f291728h == 2) ? new com.p314xaae8f345.mm.ui.p2740x696c9db.db(this) : new com.p314xaae8f345.mm.ui.p2740x696c9db.gb(this);
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String str = this.f291729i;
        ((ub0.r) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(str, this, dbVar);
        if (getIntent().hasExtra("jumpChat")) {
            jx3.f.INSTANCE.d(25464, 27, 0, 4);
            return;
        }
        if (this.f291728h == 1) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).oj(3);
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            java.lang.String Q0 = f9Var.Q0();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            h90.a[] aVarArr = h90.a.f361204d;
            ((g90.u) wVar).Zi(Q0, m124847x74d37ac6, 1);
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).nj(f9Var, 3, 4, 2);
        }
    }

    public final boolean Y6(android.app.Activity activity) {
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        boolean z17 = defaultDisplay.getWidth() < defaultDisplay.getHeight();
        hashCode();
        return z17;
    }

    public final void Z6() {
        if (this.f291728h == 3) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 0, false);
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        final com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        k0Var.f293409p = new db5.o4() { // from class: com.tencent.mm.ui.tools.ShowImageUI$$a
            @Override // db5.o4
            /* renamed from: onCreateMMMenu */
            public final void mo887xc459429a(db5.g4 g4Var) {
                int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.f291723u;
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) mVar).wi(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.this.mo55332x76847179(), g4Var, k0Var);
            }
        };
        k0Var.f293418w = new db5.t4() { // from class: com.tencent.mm.ui.tools.ShowImageUI$$b
            @Override // db5.t4
            /* renamed from: onMMMenuItemSelected */
            public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
                int i18 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.f291723u;
                final com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.this;
                activityC22534xec824752.getClass();
                yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.tools.ShowImageUI$$h
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        java.lang.String str = (java.lang.String) obj;
                        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec8247522 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.this;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC22534xec8247522.f291729i)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShowImageUI", "doRestransmitMsg fail, imgPath is null");
                            return null;
                        }
                        com.p314xaae8f345.mm.ui.p2740x696c9db.wa waVar = new com.p314xaae8f345.mm.ui.p2740x696c9db.wa(activityC22534xec8247522, str);
                        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                        jd5.a aVar = new jd5.a();
                        aVar.p(activityC22534xec8247522.f291729i);
                        n13.t tVar = new n13.t();
                        tVar.f415666a = waVar;
                        tVar.f415671f.f415672a = 9;
                        ((dk5.y) i95.n0.c(dk5.y.class)).wi(activityC22534xec8247522.mo55332x76847179(), aVar, str, tVar);
                        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Zi(activityC22534xec8247522, activityC22534xec8247522.f291730m, activityC22534xec8247522.f291736s, 2, 4, 1);
                        return null;
                    }
                };
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) mVar).aj((db5.h4) menuItem, lVar);
            }
        };
        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2740x696c9db.ya(this, arrayList);
        k0Var.f293407o = new com.p314xaae8f345.mm.ui.p2740x696c9db.za(this, arrayList);
        k0Var.f293417v = new com.p314xaae8f345.mm.ui.p2740x696c9db.ab(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2740x696c9db.bb(this);
        k0Var.C = new com.p314xaae8f345.mm.ui.p2740x696c9db.cb(this);
        k0Var.v();
        if (this.f291728h == 1) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).pj();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).aj(this, this.f291730m, this.f291736s, 2, 4, arrayList);
        }
    }

    public final void a7(boolean z17) {
        int i17 = z17 ? 2 : 1;
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f291730m;
        g90.s sVar = (g90.s) vVar;
        sVar.getClass();
        sVar.hj(this, f9Var, 2, i17, kz5.q0.f395534d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("pic_video_close");
        arrayList.add("pic_video_three_dot");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (z17) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ui(this, this.f291730m, 2, str);
            } else {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Vi(this, this.f291730m, 2, str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cnc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f291728h == 1) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(this, this.f291730m, 2, 3, 4, new java.util.HashMap());
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = configuration.orientation;
        if (i17 == 1) {
            hashCode();
            android.view.View decorView = getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.ua(this, decorView));
        } else if (i17 == 2) {
            hashCode();
            android.view.View decorView2 = getWindow().getDecorView();
            decorView2.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.va(this, decorView2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a7(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f291728h != 1) {
            getWindow().setFlags(2048, 2048);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f291728h != 1) {
            getWindow().clearFlags(2048);
        }
    }
}
