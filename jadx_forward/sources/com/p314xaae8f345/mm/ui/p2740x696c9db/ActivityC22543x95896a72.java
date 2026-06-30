package com.p314xaae8f345.mm.ui.p2740x696c9db;

@db5.a(m123858x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m9.f34451x366c91de)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.tools.ShowVideoUI */
/* loaded from: classes3.dex */
public class ActivityC22543x95896a72 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final int M = android.view.ViewConfiguration.getDoubleTapTimeout();
    public android.widget.RelativeLayout A;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee B;
    public android.widget.ImageView C;
    public android.view.View D;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Bundle f291752d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f291753e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f291754f;

    /* renamed from: g, reason: collision with root package name */
    public int f291755g;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f291757i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f291758m;

    /* renamed from: mStatusBarHeightCallback */
    private vj5.k f39693xb52fe880;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f291759n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f291760o;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f291768w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f291769x;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 f291771z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f291756h = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f291761p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f291762q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f291763r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f291764s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f291765t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f291766u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f291767v = 0;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c f291770y = null;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 E = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    public boolean F = true;
    public final java.lang.Runnable G = new com.p314xaae8f345.mm.ui.p2740x696c9db.fc(this);
    public boolean H = false;
    public final java.lang.Runnable I = new com.p314xaae8f345.mm.ui.p2740x696c9db.nc(this);

    /* renamed from: J, reason: collision with root package name */
    public android.widget.RelativeLayout f291751J = null;
    public int K = 0;
    public boolean L = false;

    public final void T6() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f291771z.m72040xfdad4e88().getGlobalVisibleRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.B.getGlobalVisibleRect(rect2);
        boolean intersect = rect.intersect(rect2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "checkSeekBarStyle, video rect = " + rect + " seek bar rect = " + rect2 + " is intersect = " + intersect);
        if (intersect) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee = this.B;
            c19739x911a23ee.C(c19739x911a23ee.getLightStyle());
            android.view.View view = this.D;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI", "checkSeekBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI", "checkSeekBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee2 = this.B;
        c19739x911a23ee2.C(c19739x911a23ee2.getDarkStyle());
        android.view.View view2 = this.D;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI", "checkSeekBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/tools/ShowVideoUI", "checkSeekBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void U6(android.view.Window window, boolean z17, boolean z18) {
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

    public final void V6(android.widget.ImageView imageView) {
        if (!this.f291762q) {
            this.f291759n.m55413xab2cf483(this.f291754f);
        }
        if (imageView != null) {
            if (com.p314xaae8f345.mm.vfs.w6.j(this.f291753e)) {
                imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(this.f291753e, 1.0f));
            } else {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562711c02);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist  thumbPathExist:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(this.f291753e)));
    }

    public final void W6() {
        if (this.f291762q) {
            if (!this.f291771z.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "longClickListener onClick isPrepared:false");
                return;
            }
        } else if (!this.f291759n.f183115w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "longClickListener onClick isPrepared:false");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), !this.f291762q ? 1 : 0, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2740x696c9db.ic(this, arrayList);
        if (this.f291762q) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            final com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
            k0Var.f293409p = new db5.o4() { // from class: com.tencent.mm.ui.tools.ShowVideoUI$$h
                @Override // db5.o4
                /* renamed from: onCreateMMMenu */
                public final void mo887xc459429a(db5.g4 g4Var) {
                    int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.M;
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) mVar).wi(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.this.mo55332x76847179(), g4Var, k0Var);
                }
            };
            k0Var.f293418w = new db5.t4() { // from class: com.tencent.mm.ui.tools.ShowVideoUI$$i
                @Override // db5.t4
                /* renamed from: onMMMenuItemSelected */
                public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
                    int i18 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.M;
                    final com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.this;
                    activityC22543x95896a72.getClass();
                    yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.tools.ShowVideoUI$$c
                        @Override // yz5.l
                        /* renamed from: invoke */
                        public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            final java.lang.String str = (java.lang.String) obj;
                            final com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a722 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.this;
                            final t21.v2 h17 = t21.d3.h(activityC22543x95896a722.f291760o);
                            if (h17 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteVideoPlayUI", "[recent share]video is null");
                                return null;
                            }
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.h(), h17.f496549n);
                            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f104104s, h17.d(), false);
                            java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f104103r, h17.d(), false);
                            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rj6) || !com.p314xaae8f345.mm.vfs.w6.j(rj6)) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rj7) || !com.p314xaae8f345.mm.vfs.w6.j(rj7))) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteVideoPlayUI", "[recent share] doRestransmitMsg fail, compressVideoPath and originVideoPath is null, msgLocalId = " + Li.m124847x74d37ac6());
                                return null;
                            }
                            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                            jd5.c cVar = new jd5.c();
                            final java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, h17.d(), false);
                            cVar.o(tj6);
                            cVar.q(h17.f496548m);
                            if (com.p314xaae8f345.mm.vfs.w6.j(rj7)) {
                                cVar.r(rj7);
                            } else {
                                cVar.r(rj6);
                            }
                            dk5.y yVar = (dk5.y) i95.n0.c(dk5.y.class);
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22543x95896a722.mo55332x76847179();
                            n13.t a17 = n13.t.a(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j() { // from class: com.tencent.mm.ui.tools.ShowVideoUI$$d
                                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
                                public final void a(boolean z17, java.lang.String str2, int i19) {
                                    java.lang.String str3 = str;
                                    java.lang.String str4 = tj6;
                                    int i27 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.M;
                                    com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a723 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.this;
                                    activityC22543x95896a723.getClass();
                                    if (z17) {
                                        tg3.a1 a18 = tg3.t1.a();
                                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC22543x95896a723.mo55332x76847179();
                                        t21.v2 v2Var = h17;
                                        ((dk5.s5) a18).nj(mo55332x768471792, str3, v2Var.d(), str4, 1, v2Var.f496548m, true, false, "", null);
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                            ((dk5.s5) tg3.t1.a()).fj(str3, str2, c01.e2.C(str3), 0);
                                        }
                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC22543x95896a723.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activityC22543x95896a723.mo55332x76847179(), null, null);
                                    }
                                }
                            });
                            a17.f415671f.f415672a = 9;
                            yVar.wi(mo55332x76847179, cVar, str, a17);
                            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Zi(activityC22543x95896a722, activityC22543x95896a722.f291769x, activityC22543x95896a722.K, 2, 4, 1);
                            return null;
                        }
                    };
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) mVar).aj((db5.h4) menuItem, lVar);
                }
            };
            k0Var.f293407o = new com.p314xaae8f345.mm.ui.p2740x696c9db.jc(this, arrayList);
            k0Var.f293417v = new com.p314xaae8f345.mm.ui.p2740x696c9db.kc(this);
        }
        k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2740x696c9db.lc(this);
        k0Var.C = new com.p314xaae8f345.mm.ui.p2740x696c9db.mc(this);
        k0Var.f293389e = new com.p314xaae8f345.mm.ui.p2740x696c9db.oc(this, arrayList);
        k0Var.v();
        if (this.f291762q) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).pj();
        }
    }

    public final void X6() {
        this.B.mo61296x11f3be80(true);
        T6();
        this.B.mo61298xa7077af8(this.f291755g);
        this.B.a(this.f291771z.mo69307x9746038c() / 1000);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.E;
        java.lang.Runnable runnable = this.G;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50293x3498a0(runnable);
    }

    public final void Y6(boolean z17) {
        int i17 = z17 ? 2 : 1;
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f291769x;
        g90.s sVar = (g90.s) vVar;
        sVar.getClass();
        sVar.hj(this, f9Var, 2, i17, kz5.q0.f395534d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("pic_video_close");
        arrayList.add("pic_video_three_dot");
        arrayList.add("video_speed");
        arrayList.add("video_play_btn");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (z17) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ui(this, this.f291769x, 2, str);
            } else {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Vi(this, this.f291769x, 2, str);
            }
        }
    }

    public void Z6() {
        int i17;
        if (this.f291762q) {
            finish();
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
            return;
        }
        int width = this.f291757i.getWidth();
        int height = this.f291757i.getHeight();
        int i18 = this.f291766u;
        if (i18 != 0 && (i17 = this.f291767v) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f291768w;
        s4Var.f292232f = width;
        s4Var.f292233g = height;
        s4Var.e(this.f291765t, this.f291764s, i18, this.f291767v);
        this.f291768w.d(this.f291759n, this.f291758m, false, new com.p314xaae8f345.mm.ui.p2740x696c9db.vc(this), null);
    }

    public void a7(java.lang.String str, android.content.Context context) {
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(mo55332x76847179(), str, new com.p314xaae8f345.mm.ui.p2740x696c9db.rc(this, str));
        if (this.f291762q) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).oj(3);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f291762q && motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 2) {
            T6();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        if (this.f291762q) {
            return 4;
        }
        return super.mo44431x663c095b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dnf;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17 = true;
        if (i17 == 1 && -1 == i18) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            t21.v2 h17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291760o) ? t21.d3.h(this.f291760o) : null;
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                ((dk5.s5) tg3.t1.a()).nj(mo55332x76847179(), str, h17 == null ? this.f291754f : this.f291760o, this.f291753e, 1, this.f291755g, (this.f291762q || h17 != null) ? z17 : false, false, "", null);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
                }
                z17 = true;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, this, null, null);
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f291769x != null && this.f291762q) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(this, this.f291769x, 2, 3, 4, new java.util.HashMap());
        }
        Z6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a5  */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.ViewGroup] */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        setResult(0, getIntent().putExtra("key_activity_browse_time", mo78509x4b0ac5a2()));
        if (this.f291762q) {
            this.f291771z.mo69303x360802();
        } else {
            this.f291759n.e();
        }
        getWindow().clearFlags(128);
        Y6(false);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        getWindow().setFlags(2048, 2048);
        if (this.f291762q) {
            if (this.f291771z.mo69311xc00617a4()) {
                this.L = true;
            }
            this.f291771z.mo69313x65825f6();
        } else {
            if (this.f291759n.d()) {
                this.L = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f291759n;
            java.lang.String str = viewOnClickListenerC13625xe5fb4505.f183099d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay:   onPause()");
            viewOnClickListenerC13625xe5fb4505.k();
            if (viewOnClickListenerC13625xe5fb4505.f183102g.mo69311xc00617a4()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay: pausePlay()");
                viewOnClickListenerC13625xe5fb4505.f183102g.mo69313x65825f6();
            }
            viewOnClickListenerC13625xe5fb4505.I.d();
            viewOnClickListenerC13625xe5fb4505.m55415x1d620e25(true);
            viewOnClickListenerC13625xe5fb4505.f183098J.d();
        }
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        getWindow().clearFlags(2048);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", java.lang.Boolean.valueOf(this.f291756h));
        this.f291756h = false;
        super.onResume();
        if (this.L) {
            if (this.f291762q) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = this.f291771z;
                if (c18697xb57c3465 != null && c18697xb57c3465.e()) {
                    this.f291771z.mo69330x68ac462();
                    X6();
                }
            } else {
                this.f291759n.h();
            }
        }
        qp1.h0.a(true, true, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        if (!this.f291762q) {
            android.os.Bundle bundle = this.f291752d;
            if (!this.f291761p) {
                this.f291761p = true;
                this.f291764s = getIntent().getIntExtra("img_gallery_top", 0);
                this.f291765t = getIntent().getIntExtra("img_gallery_left", 0);
                this.f291766u = getIntent().getIntExtra("img_gallery_width", 0);
                int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
                this.f291767v = intExtra;
                this.f291768w.e(this.f291765t, this.f291764s, this.f291766u, intExtra);
                if (bundle == null) {
                    this.f291759n.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.tc(this));
                }
            }
        }
        super.onStart();
    }
}
