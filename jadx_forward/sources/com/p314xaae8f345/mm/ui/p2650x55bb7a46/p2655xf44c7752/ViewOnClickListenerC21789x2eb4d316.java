package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* renamed from: com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI */
/* loaded from: classes12.dex */
public class ViewOnClickListenerC21789x2eb4d316 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements zb5.g, android.view.View.OnClickListener {
    public android.view.View A;
    public android.view.View B;
    public android.view.View C;

    /* renamed from: d, reason: collision with root package name */
    public zb5.f f282276d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 f282277e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f282278f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f282279g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f282280h;

    /* renamed from: i, reason: collision with root package name */
    public long f282281i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f282282m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f282283n;

    /* renamed from: q, reason: collision with root package name */
    public boolean f282286q;

    /* renamed from: r, reason: collision with root package name */
    public int f282287r;

    /* renamed from: t, reason: collision with root package name */
    public nc5.o f282289t;

    /* renamed from: u, reason: collision with root package name */
    public int f282290u;

    /* renamed from: x, reason: collision with root package name */
    public int f282293x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f282294y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f282295z;

    /* renamed from: o, reason: collision with root package name */
    public boolean f282284o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f282285p = -1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f282288s = true;

    /* renamed from: v, reason: collision with root package name */
    public long f282291v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f282292w = 0;

    public final void T6(int i17) {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).getClass();
        if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.f282867b || i17 <= 0) {
            this.f282294y.setEnabled(false);
            this.f282295z.setEnabled(false);
            this.A.setEnabled(false);
            this.B.setEnabled(false);
            return;
        }
        this.f282294y.setEnabled(true);
        this.f282295z.setEnabled(true);
        this.A.setEnabled(true);
        this.B.setEnabled(true);
    }

    public void U6(int i17) {
        X6();
        W6(false, "");
        if (i17 == 0) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.fjw;
        }
        if (this.f282286q) {
            db5.e1.o(this, i17, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, true, null);
        }
        this.f282286q = false;
    }

    public void V6() {
        this.f282286q = false;
        W6(false, "");
        X6();
        int indexOf = lp0.b.m().indexOf("/MicroMsg/");
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5f, indexOf >= 0 ? lp0.b.m().substring(indexOf) : lp0.b.m()), 1).show();
    }

    public final void W6(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (str == null) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc);
            }
            this.f282283n = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, str, true, 0, null);
        } else {
            android.app.ProgressDialog progressDialog = this.f282283n;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f282283n.dismiss();
            this.f282283n = null;
        }
    }

    public void X6() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d;
        n3Var.f283894i.f279928r = false;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        r4Var.b();
        r4Var.f282867b = false;
        n3Var.f283894i.m8146xced61ae5();
        mo54450xbf7c1df6(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).f283891f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571526ht));
        android.view.View view = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.C.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd));
        m78551x8f8ecf18(0);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fik), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ab(this));
    }

    public void Y6() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d;
        n3Var.f283894i.f279928r = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        r4Var.f282867b = true;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) n3Var.d(n3Var.f283891f);
        int w17 = c1161x57298f5d.w();
        n3Var.f283894i.m8152xc67946d3(w17, (c1161x57298f5d.y() - w17) + 1, 0);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).getClass();
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjy, java.lang.Integer.valueOf(r4Var.f())));
        android.view.View view = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.C.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559390df));
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).getClass();
        T6(r4Var.f());
        m78551x8f8ecf18(0);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fij), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.za(this));
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(3);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        this.C = findViewById(com.p314xaae8f345.mm.R.id.jqp);
        this.f282295z = findViewById(com.p314xaae8f345.mm.R.id.oio);
        this.B = findViewById(com.p314xaae8f345.mm.R.id.crz);
        this.A = findViewById(com.p314xaae8f345.mm.R.id.m9n);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dth);
        this.f282294y = findViewById;
        findViewById.setTag(1);
        this.f282295z.setTag(0);
        this.A.setTag(3);
        this.B.setTag(2);
        this.f282294y.setOnClickListener(this);
        this.f282295z.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.f282279g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564450rq);
        this.f282282m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mf6);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.h0u);
        this.f282278f = c1163xf1deaba4;
        c1163xf1deaba4.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560153cf));
        findViewById(com.p314xaae8f345.mm.R.id.ch8).setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560153cf));
        this.f282278f.mo7967x900dcbe1(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).d(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f282278f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d;
        n3Var.getClass();
        c1163xf1deaba42.N(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.f3(n3Var, this));
        zb5.f fVar = this.f282276d;
        java.lang.String str = this.f282280h;
        long j17 = this.f282281i;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) fVar;
        n3Var2.f283892g = str;
        n3Var2.f283893h = j17;
        java.util.ArrayList arrayList = n3Var2.f283890e;
        if (j17 == -1) {
            n3Var2.f283894i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0(n3Var2.f283891f, arrayList, 4, str);
        } else {
            n3Var2.f283894i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0(n3Var2.f283891f, arrayList, 4, str, j17);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 a0Var = n3Var2.f283894i;
        a0Var.f279926p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.g3(n3Var2);
        this.f282277e = a0Var;
        this.f282278f.mo7960x6cab2c8d(a0Var);
        this.f282278f.m7963x830bc99d(true);
        this.f282278f.m7969x1a2696e2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.va(this));
        if (this.f282289t == null) {
            this.f282289t = new nc5.o(this, this.f282280h, this.f282290u);
        }
        this.f282278f.i(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.xa(this));
        mo54450xbf7c1df6(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).f283891f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571526ht));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ya(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.b
    public void l2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z zVar) {
        this.f282276d = (zb5.f) zVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        nc5.o oVar = this.f282289t;
        if (oVar != null) {
            oVar.b();
        }
        super.onBackPressed();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryUI", "[onBackPressed] ");
        if (this.f282286q) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).k();
        } else {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zb5.f fVar = this.f282276d;
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) fVar;
        n3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", java.lang.Integer.valueOf(intValue));
        java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.f282866a;
        android.content.Context context = n3Var.f283891f;
        if (intValue == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 19L, 1L, true);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.d(context, arrayList2, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n3Var.f283892g), n3Var.f283892g, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b3(n3Var));
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) n3Var.f283889d).X6();
        } else if (intValue == 1) {
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 18L, 1L, true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                    if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e2.i(n3Var.f283891f, c5303xc75d2f73, n3Var.f283892g, arrayList2, false, false)) {
                        n3Var.c(c5303xc75d2f73);
                        java.util.Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Fav, com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next(), 0);
                        }
                    } else {
                        int size = arrayList2.size();
                        am.c4 c4Var = c5303xc75d2f73.f135623g;
                        if (size > 1) {
                            db5.e1.A(context, context.getString(c4Var.f87859l >= 0 ? com.p314xaae8f345.mm.R.C30867xcad56011.caq : com.p314xaae8f345.mm.R.C30867xcad56011.cap), "", context.getString(c4Var.f87859l >= 0 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572472bb1 : com.p314xaae8f345.mm.R.C30867xcad56011.hjg), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y2(n3Var, c5303xc75d2f73, arrayList2), null);
                        } else {
                            db5.e1.i(context, c4Var.f87859l, 0);
                        }
                    }
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) n3Var.f283889d).X6();
                } else if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.la.c((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next())) {
                    db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.cal, 0).show();
                    break;
                }
            }
        } else if (intValue == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11627, 5);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                copyOnWriteArraySet.add(tg3.l1.a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it7.next()));
            }
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a3(n3Var, copyOnWriteArraySet, arrayList2), null);
        } else if (intValue == 3) {
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m3(n3Var, arrayList2), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m2(n3Var));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        this.f282284o = true;
        android.content.Intent intent = getIntent();
        intent.getIntExtra("kintent_intent_source", 0);
        this.f282280h = intent.getStringExtra("kintent_talker");
        this.f282285p = intent.getIntExtra("kintent_image_index", -1);
        intent.getBooleanExtra("key_is_biz_chat", false);
        this.f282281i = getIntent().getLongExtra("key_biz_chat_id", -1L);
        this.f282290u = intent.getIntExtra("key_gallery_enter_scene", -1);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = getIntent().getIntExtra("key_media_type", -1) != 1 ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3(this) : new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3(this);
        n3Var.f283889d = this;
        this.f282276d = n3Var;
        n3Var.f283896n.mo48813x58998cd();
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.f282868c;
        arrayList.remove(n3Var);
        arrayList.add(n3Var);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7));
        mo43517x10010bd5();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).j(true, this.f282285p);
        o25.n1.c(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MediaHistoryGalleryUI);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).mo79813x3f5eee52();
        nc5.o oVar = this.f282289t;
        if (oVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "destroy, " + oVar.f417749d + ", " + oVar.f417748c + ", " + oVar.f417754i);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = oVar.f417756k;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.z0.e(oVar.f417755j, null, 1, null);
            if (oVar.f417749d && !oVar.a() && oVar.f417757l) {
                ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Zi();
            }
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(6);
            this.f282289t = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        kj.m mVar;
        super.onPause();
        com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45892xbfcecaf(), this.f282287r);
        this.f282287r = 0;
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f314350n) != null) {
            this.f282291v = java.lang.Math.max(0L, ((int) mVar.f389776e) - this.f282291v);
        }
        this.f282292w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() > this.f282292w ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - this.f282292w : 1L;
        com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45974xeaf03f15(703, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45889x4974562(), 1, this.f282291v, this.f282292w);
        this.f282291v = 0L;
        this.f282292w = 0L;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        kj.m mVar;
        this.f282292w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (ih.d.c() && ih.d.d().a(dj.b.class) != null && (mVar = ((dj.b) ih.d.d().a(dj.b.class)).f314350n) != null) {
            this.f282291v = (int) mVar.f389776e;
        }
        super.onResume();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d;
        if (n3Var.f283897o) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
            if (r4Var.f282867b) {
                zb5.g gVar = n3Var.f283889d;
                int f17 = r4Var.f();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) gVar;
                viewOnClickListenerC21789x2eb4d316.mo54450xbf7c1df6(viewOnClickListenerC21789x2eb4d316.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjy, java.lang.Integer.valueOf(f17)));
                viewOnClickListenerC21789x2eb4d316.T6(f17);
                n3Var.f283894i.m8146xced61ae5();
            }
        }
        if (this.f282284o) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3) this.f282276d).getClass();
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.f282867b) {
                Y6();
            } else {
                X6();
            }
        }
        nc5.o oVar = this.f282289t;
        if (oVar != null && !this.f282284o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "onActivityResumeToUpdateSug");
            if (((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ri() && oVar.f417749d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "onActivityResultToUpdateSug");
                ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).wi(oVar.f417747b);
                nc5.u uVar = oVar.f417752g;
                if (uVar != null) {
                    uVar.a(new nc5.g(oVar), null);
                }
            }
        }
        this.f282284o = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(la5.f1.class);
    }
}
