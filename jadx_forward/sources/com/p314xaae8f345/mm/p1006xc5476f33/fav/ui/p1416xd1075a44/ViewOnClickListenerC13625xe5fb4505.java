package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView */
/* loaded from: classes12.dex */
public class ViewOnClickListenerC13625xe5fb4505 extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4, android.view.View.OnClickListener {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda A;
    public java.lang.String B;
    public int C;
    public int D;
    public w82.p1 E;
    public w82.q1 F;
    public android.widget.RelativeLayout G;
    public boolean H;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f183098J;
    public boolean K;
    public final w82.o1 L;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f183099d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f183100e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f183101f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f183102g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f183103h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f183104i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f183105m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f183106n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf f183107o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f183108p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f183109q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f183110r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f183111s;

    /* renamed from: t, reason: collision with root package name */
    public int f183112t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f183113u;

    /* renamed from: v, reason: collision with root package name */
    public int f183114v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f183115w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f183116x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f183117y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ProgressBar f183118z;

    public ViewOnClickListenerC13625xe5fb4505(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    public void a() {
        if (!this.f183115w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "handleSingleClck isPrepared:false");
        } else if (this.f183116x) {
            c();
        } else {
            k();
        }
    }

    public final void b() {
        boolean k17 = com.p314xaae8f345.mm.ui.bk.k(getContext());
        int j17 = com.p314xaae8f345.mm.ui.bk.j(getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "%d handleVerticalUI image gallery ui isNavBarVisibility %b navBarHeight %d footerMargin %d", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(k17), java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(this.D));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(this.f183105m.getLayoutParams());
        layoutParams.addRule(12);
        if (!k17) {
            j17 = 0;
        }
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, j17 + this.D);
        this.f183108p.setLayoutParams(layoutParams);
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "hide video tool bar");
        android.view.View view = this.f183105m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "hideVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "hideVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f183106n.setVisibility(8);
        this.f183116x = false;
        w82.q1 q1Var = this.F;
        if (q1Var != null) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.C22556xc23ab43b) q1Var).a(false);
        }
    }

    public boolean d() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f183102g;
        if (f4Var == null) {
            return false;
        }
        return f4Var.mo69311xc00617a4();
    }

    public void e() {
        w82.o1 o1Var = this.L;
        java.lang.String str = this.f183099d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay:   onDestroy()");
        this.K = false;
        this.I.d();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f183098J;
        b4Var.d();
        this.f183107o.a(0);
        m55415x1d620e25(true);
        b4Var.d();
        try {
            ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(o1Var);
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(o1Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(o1Var);
            this.f183102g.mo69303x360802();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onDestroy() %s %s", th6.getClass().getSimpleName(), th6.getMessage());
        }
    }

    public void f() {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.f183117y)};
        java.lang.String str = this.f183099d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay:   onResume() isStartAfterPrepared:%s", objArr);
        bt3.t1 t1Var = (bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj();
        w82.o1 o1Var = this.L;
        t1Var.y0(o1Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(o1Var);
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).wi(o1Var);
        if (this.f183110r) {
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f183109q);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f183100e;
        if (K0 || !com.p314xaae8f345.mm.vfs.w6.j(this.f183109q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay: fullPath is  null, show error, toggleVideo()");
            n3Var.mo50293x3498a0(new w82.i1(this, false));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay: fullPath is not null,exist,  toggleVideo()");
            n3Var.mo50293x3498a0(new w82.d1(this));
            g(this.f183109q);
        }
    }

    public void g(java.lang.String str) {
        java.lang.String str2 = this.f183099d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "VideoPlay: prepareVideo");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "VideoPlay: %d prepare video but filepath is null.", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f183102g;
        if (f4Var != null) {
            if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var).m75832xcbe8d3cd(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false));
            }
            android.view.View view = (android.view.View) this.f183102g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = (android.view.View) this.f183102g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f183101f.setVisibility(0);
            this.f183102g.mo69327xab3268fe(str);
        }
        if (((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0)).intValue() == 1) {
            android.widget.TextView textView = this.f183103h;
            ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
            textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.e(str));
            this.f183103h.setVisibility(0);
        }
    }

    /* renamed from: getPalyPosition */
    public int m55404x7d13d4fd() {
        return this.f183102g.mo69307x9746038c();
    }

    /* renamed from: getRoot */
    public android.view.View m55405xfb84e958() {
        return this.G;
    }

    /* renamed from: getVideoView */
    public android.view.View m55406x4ee17f0a() {
        return (android.view.View) this.f183102g;
    }

    public void h() {
        i(this.f183107o.m69282xd98b9220());
        this.I.c(500L, 500L);
        m55415x1d620e25(false);
        if (this.f183116x) {
            this.f183098J.c(4000L, 4000L);
        }
    }

    public void i(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "VideoPlay: seek second is %d", java.lang.Integer.valueOf(i17));
        this.f183102g.b(i17 * 1000);
    }

    public void j(java.lang.String str, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "setVideoData() called with: dataId = " + str2);
        this.f183109q = str;
        if (z17) {
            this.f183100e.mo50293x3498a0(new w82.m1(this));
            this.B = str2;
        }
    }

    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "show video tool bar");
        android.view.View view = this.f183105m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.H) {
            this.f183106n.setVisibility(0);
        }
        this.f183116x = true;
        this.f183098J.c(4000L, 4000L);
        w82.q1 q1Var = this.F;
        if (q1Var != null) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.C22556xc23ab43b) q1Var).a(true);
        }
    }

    public final void l() {
        this.K = true;
        this.f183100e.mo50293x3498a0(new w82.i1(this, true));
        this.f183113u = this.f183102g.mo69330x68ac462();
        int mo69286x51e8b0a = this.f183102g.mo69286x51e8b0a() / 1000;
        this.I.c(500L, 500L);
        m55415x1d620e25(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "VideoPlay: startPlay(),duration is %d", java.lang.Integer.valueOf(mo69286x51e8b0a));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "onAttachedToWindow() called");
        super.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.kwj) {
            java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.K), java.lang.Boolean.valueOf(d())};
            java.lang.String str = this.f183099d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "toggle video hasCalledStartPlay:%s isPlaying:%s", objArr);
            if (!this.K) {
                l();
            } else if (d()) {
                if (this.f183102g.mo69311xc00617a4()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VideoPlay: pausePlay()");
                    this.f183102g.mo69313x65825f6();
                }
                this.I.d();
                m55415x1d620e25(true);
                this.f183098J.d();
            } else {
                h();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "%d on completion", java.lang.Integer.valueOf(hashCode()));
        if (fp.h.b(18) || !this.f183111s) {
            i(0);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f183102g;
        if (f4Var != null) {
            f4Var.mo69303x360802();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "onDetachedFromWindow() called:");
        super.onDetachedFromWindow();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.f183111s)};
        java.lang.String str = this.f183099d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "VideoPlay: %d on play video error what %d extra %d. isMMVideoPlayer[%b]", objArr);
        if (this.f183113u) {
            mo9755xa6db431b();
            return;
        }
        this.f183112t = i18;
        java.lang.String f256131m = this.f183102g.getF256131m();
        this.f183102g.mo69303x360802();
        this.f183110r = true;
        w82.i1 i1Var = new w82.i1(this, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f183100e;
        n3Var.mo50293x3498a0(i1Var);
        if (this.f183112t == -1) {
            int i19 = this.C + 1;
            this.C = i19;
            if (i19 <= 3) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w82.j1(this));
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f256131m) || !com.p314xaae8f345.mm.vfs.w6.j(f256131m)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "VideoPlay: start third player to play");
        n3Var.mo50293x3498a0(new w82.k1(this, f256131m));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "onPrepared() called isStartAfterPrepared：%s", java.lang.Boolean.valueOf(this.f183117y));
        this.f183112t = 0;
        this.f183115w = true;
        if (this.f183117y) {
            l();
        } else {
            k();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }

    /* renamed from: setCallback */
    public void m55407x6c4ebec7(w82.p1 p1Var) {
        this.E = p1Var;
    }

    /* renamed from: setFooterMargin */
    public void m55408x6555d4ab(int i17) {
        this.D = i17;
        b();
    }

    /* renamed from: setSeekbarVisibilityCallback */
    public void m55409x3ea59130(w82.q1 q1Var) {
        this.F = q1Var;
    }

    /* renamed from: setShowCloseBtn */
    public void m55410xa59644e3(boolean z17) {
        this.H = z17;
        android.widget.ImageView imageView = this.f183106n;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 8);
        }
    }

    /* renamed from: setStartAfterPrepared */
    public void m55411x903960f9(boolean z17) {
        this.f183117y = z17;
    }

    /* renamed from: setThumbView */
    public void m55412xab04b759(java.lang.String str) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            this.f183101f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562711c02);
            return;
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.lang.String str2 = this.f183099d;
        android.graphics.Bitmap bitmap = null;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "getByCache err :%s", str);
        } else {
            bitmap = (android.graphics.Bitmap) um.n.a(um.n.b("local_cdn_img_cache"), str, null);
        }
        if (bitmap == null) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(str, 1.0f);
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "push err :%s", str);
            } else {
                um.o b17 = um.n.b("local_cdn_img_cache");
                if (b17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ICacheService.Factory", "null service");
                } else {
                    ((jt0.i) ((m11.q0) b17).f404302d).j(str, bitmap);
                }
            }
        }
        this.f183101f.setImageBitmap(bitmap);
    }

    /* renamed from: setVideoData */
    public void m55413xab2cf483(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183099d, "setVideoData() called with: fullPath = [" + str + "]");
        this.f183109q = str;
    }

    /* renamed from: setVideoScaleType */
    public void m55414x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f183102g;
        if (f4Var != null) {
            if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var).m75834xebd28962(e1Var);
            } else if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) f4Var).m75841xebd28962(e1Var);
            }
        }
    }

    /* renamed from: setVideoStateIv */
    public void m55415x1d620e25(boolean z17) {
        try {
            this.f183107o.mo61296x11f3be80(!z17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f183099d, "set video state iv error : " + e17.toString());
        }
    }

    public ViewOnClickListenerC13625xe5fb4505(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String str = "MicroMsg.FavVideoView@" + hashCode();
        this.f183099d = str;
        this.f183100e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f183110r = false;
        this.f183111s = false;
        this.f183112t = 0;
        this.f183113u = false;
        this.f183114v = 0;
        this.f183115w = false;
        this.f183116x = false;
        this.f183117y = true;
        this.B = "";
        this.C = 0;
        this.D = 0;
        this.H = true;
        this.I = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new w82.e1(this), true);
        this.f183098J = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new w82.f1(this), false);
        w82.g1 g1Var = new w82.g1(this);
        this.K = false;
        this.L = new w82.o1(this, null);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ac8, this);
        this.f183101f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p0l);
        this.G = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.h88);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyr)).setVisibility(8);
        this.A = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) findViewById(com.p314xaae8f345.mm.R.id.f569091p01);
        this.f183118z = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.ozc);
        this.f183104i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.du_);
        this.f183106n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f569078oy5);
        this.f183108p = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.cna);
        this.f183105m = findViewById(com.p314xaae8f345.mm.R.id.f569087oz2);
        this.f183107o = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf) findViewById(com.p314xaae8f345.mm.R.id.ozz);
        this.f183103h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p0r);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20246x24701f66()) == 1) {
            this.f183111s = false;
            df0.t tVar = (df0.t) i95.n0.c(df0.t.class);
            android.content.Context context2 = getContext();
            ((cf0.c0) tVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            this.f183102g = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465(context2, null, 0, 6, null);
        } else {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            d11.s.Ai();
            this.f183111s = true;
            this.f183102g = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4(context, null);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f183102g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "ui init view. videoView:%s %s", f4Var, java.lang.Integer.valueOf(f4Var.hashCode()));
        this.f183102g.mo69326x360a109e(this);
        c();
        m55415x1d620e25(true);
        this.f183107o.mo69283xbdcdae58(g1Var);
        this.f183107o.m75826x325c7617(this);
        this.f183106n.setOnClickListener(new w82.h1(this));
        this.f183107o.setOnClickListener(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.G.addView((android.view.View) this.f183102g, layoutParams);
        b();
    }
}
