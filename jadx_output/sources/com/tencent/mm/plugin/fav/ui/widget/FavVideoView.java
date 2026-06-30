package com.tencent.mm.plugin.fav.ui.widget;

/* loaded from: classes12.dex */
public class FavVideoView extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.tools.a4, android.view.View.OnClickListener {
    public com.tencent.mm.ui.widget.MMPinProgressBtn A;
    public java.lang.String B;
    public int C;
    public int D;
    public w82.p1 E;
    public w82.q1 F;
    public android.widget.RelativeLayout G;
    public boolean H;
    public final com.tencent.mm.sdk.platformtools.b4 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f101565J;
    public boolean K;
    public final w82.o1 L;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f101566d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f101567e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f101568f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f101569g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f101570h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f101571i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f101572m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f101573n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar f101574o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f101575p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f101576q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f101577r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f101578s;

    /* renamed from: t, reason: collision with root package name */
    public int f101579t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f101580u;

    /* renamed from: v, reason: collision with root package name */
    public int f101581v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f101582w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f101583x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f101584y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ProgressBar f101585z;

    public FavVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    public void a() {
        if (!this.f101582w) {
            com.tencent.mars.xlog.Log.i(this.f101566d, "handleSingleClck isPrepared:false");
        } else if (this.f101583x) {
            c();
        } else {
            k();
        }
    }

    public final void b() {
        boolean k17 = com.tencent.mm.ui.bk.k(getContext());
        int j17 = com.tencent.mm.ui.bk.j(getContext());
        com.tencent.mars.xlog.Log.i(this.f101566d, "%d handleVerticalUI image gallery ui isNavBarVisibility %b navBarHeight %d footerMargin %d", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(k17), java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(this.D));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(this.f101572m.getLayoutParams());
        layoutParams.addRule(12);
        if (!k17) {
            j17 = 0;
        }
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, j17 + this.D);
        this.f101575p.setLayoutParams(layoutParams);
    }

    public void c() {
        com.tencent.mars.xlog.Log.i(this.f101566d, "hide video tool bar");
        android.view.View view = this.f101572m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "hideVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "hideVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f101573n.setVisibility(8);
        this.f101583x = false;
        w82.q1 q1Var = this.F;
        if (q1Var != null) {
            ((com.tencent.mm.ui.tools.ShowVideoUI$$m) q1Var).a(false);
        }
    }

    public boolean d() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f101569g;
        if (f4Var == null) {
            return false;
        }
        return f4Var.isPlaying();
    }

    public void e() {
        w82.o1 o1Var = this.L;
        java.lang.String str = this.f101566d;
        com.tencent.mars.xlog.Log.i(str, "VideoPlay:   onDestroy()");
        this.K = false;
        this.I.d();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f101565J;
        b4Var.d();
        this.f101574o.a(0);
        setVideoStateIv(true);
        b4Var.d();
        try {
            ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(o1Var);
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(o1Var);
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(o1Var);
            this.f101569g.stop();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(str, "onDestroy() %s %s", th6.getClass().getSimpleName(), th6.getMessage());
        }
    }

    public void f() {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.f101584y)};
        java.lang.String str = this.f101566d;
        com.tencent.mars.xlog.Log.i(str, "VideoPlay:   onResume() isStartAfterPrepared:%s", objArr);
        bt3.t1 t1Var = (bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj();
        w82.o1 o1Var = this.L;
        t1Var.y0(o1Var);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(o1Var);
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).wi(o1Var);
        if (this.f101577r) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f101576q);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f101567e;
        if (K0 || !com.tencent.mm.vfs.w6.j(this.f101576q)) {
            com.tencent.mars.xlog.Log.i(str, "VideoPlay: fullPath is  null, show error, toggleVideo()");
            n3Var.post(new w82.i1(this, false));
        } else {
            com.tencent.mars.xlog.Log.i(str, "VideoPlay: fullPath is not null,exist,  toggleVideo()");
            n3Var.post(new w82.d1(this));
            g(this.f101576q);
        }
    }

    public void g(java.lang.String str) {
        java.lang.String str2 = this.f101566d;
        com.tencent.mars.xlog.Log.i(str2, "VideoPlay: prepareVideo");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e(str2, "VideoPlay: %d prepare video but filepath is null.", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f101569g;
        if (f4Var != null) {
            if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
                ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).setNeedResetExtractor(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false));
            }
            android.view.View view = (android.view.View) this.f101569g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = (android.view.View) this.f101569g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f101568f.setVisibility(0);
            this.f101569g.setVideoPath(str);
        }
        if (((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0)).intValue() == 1) {
            android.widget.TextView textView = this.f101570h;
            ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
            textView.setText(com.tencent.mm.plugin.sight.base.e.e(str));
            this.f101570h.setVisibility(0);
        }
    }

    public int getPalyPosition() {
        return this.f101569g.getCurrentPosition();
    }

    public android.view.View getRoot() {
        return this.G;
    }

    public android.view.View getVideoView() {
        return (android.view.View) this.f101569g;
    }

    public void h() {
        i(this.f101574o.getmPosition());
        this.I.c(500L, 500L);
        setVideoStateIv(false);
        if (this.f101583x) {
            this.f101565J.c(4000L, 4000L);
        }
    }

    public void i(int i17) {
        com.tencent.mars.xlog.Log.i(this.f101566d, "VideoPlay: seek second is %d", java.lang.Integer.valueOf(i17));
        this.f101569g.b(i17 * 1000);
    }

    public void j(java.lang.String str, boolean z17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(this.f101566d, "setVideoData() called with: dataId = " + str2);
        this.f101576q = str;
        if (z17) {
            this.f101567e.post(new w82.m1(this));
            this.B = str2;
        }
    }

    public void k() {
        com.tencent.mars.xlog.Log.i(this.f101566d, "show video tool bar");
        android.view.View view = this.f101572m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.H) {
            this.f101573n.setVisibility(0);
        }
        this.f101583x = true;
        this.f101565J.c(4000L, 4000L);
        w82.q1 q1Var = this.F;
        if (q1Var != null) {
            ((com.tencent.mm.ui.tools.ShowVideoUI$$m) q1Var).a(true);
        }
    }

    public final void l() {
        this.K = true;
        this.f101567e.post(new w82.i1(this, true));
        this.f101580u = this.f101569g.start();
        int duration = this.f101569g.getDuration() / 1000;
        this.I.c(500L, 500L);
        setVideoStateIv(false);
        com.tencent.mars.xlog.Log.i(this.f101566d, "VideoPlay: startPlay(),duration is %d", java.lang.Integer.valueOf(duration));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mars.xlog.Log.i(this.f101566d, "onAttachedToWindow() called");
        super.onAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.kwj) {
            java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.K), java.lang.Boolean.valueOf(d())};
            java.lang.String str = this.f101566d;
            com.tencent.mars.xlog.Log.i(str, "toggle video hasCalledStartPlay:%s isPlaying:%s", objArr);
            if (!this.K) {
                l();
            } else if (d()) {
                if (this.f101569g.isPlaying()) {
                    com.tencent.mars.xlog.Log.i(str, "VideoPlay: pausePlay()");
                    this.f101569g.pause();
                }
                this.I.d();
                setVideoStateIv(true);
                this.f101565J.d();
            } else {
                h();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i(this.f101566d, "%d on completion", java.lang.Integer.valueOf(hashCode()));
        if (fp.h.b(18) || !this.f101578s) {
            i(0);
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f101569g;
        if (f4Var != null) {
            f4Var.stop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mars.xlog.Log.i(this.f101566d, "onDetachedFromWindow() called:");
        super.onDetachedFromWindow();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.f101578s)};
        java.lang.String str = this.f101566d;
        com.tencent.mars.xlog.Log.e(str, "VideoPlay: %d on play video error what %d extra %d. isMMVideoPlayer[%b]", objArr);
        if (this.f101580u) {
            onCompletion();
            return;
        }
        this.f101579t = i18;
        java.lang.String f174598m = this.f101569g.getF174598m();
        this.f101569g.stop();
        this.f101577r = true;
        w82.i1 i1Var = new w82.i1(this, false);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f101567e;
        n3Var.post(i1Var);
        if (this.f101579t == -1) {
            int i19 = this.C + 1;
            this.C = i19;
            if (i19 <= 3) {
                com.tencent.mm.sdk.platformtools.u3.h(new w82.j1(this));
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f174598m) || !com.tencent.mm.vfs.w6.j(f174598m)) {
            return;
        }
        com.tencent.mars.xlog.Log.e(str, "VideoPlay: start third player to play");
        n3Var.post(new w82.k1(this, f174598m));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mars.xlog.Log.i(this.f101566d, "onPrepared() called isStartAfterPrepared：%s", java.lang.Boolean.valueOf(this.f101584y));
        this.f101579t = 0;
        this.f101582w = true;
        if (this.f101584y) {
            l();
        } else {
            k();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }

    public void setCallback(w82.p1 p1Var) {
        this.E = p1Var;
    }

    public void setFooterMargin(int i17) {
        this.D = i17;
        b();
    }

    public void setSeekbarVisibilityCallback(w82.q1 q1Var) {
        this.F = q1Var;
    }

    public void setShowCloseBtn(boolean z17) {
        this.H = z17;
        android.widget.ImageView imageView = this.f101573n;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 8);
        }
    }

    public void setStartAfterPrepared(boolean z17) {
        this.f101584y = z17;
    }

    public void setThumbView(java.lang.String str) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            this.f101568f.setImageResource(com.tencent.mm.R.drawable.f481178c02);
            return;
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.lang.String str2 = this.f101566d;
        android.graphics.Bitmap bitmap = null;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.e(str2, "getByCache err :%s", str);
        } else {
            bitmap = (android.graphics.Bitmap) um.n.a(um.n.b("local_cdn_img_cache"), str, null);
        }
        if (bitmap == null) {
            bitmap = com.tencent.mm.sdk.platformtools.j.a(str, 1.0f);
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.e(str2, "push err :%s", str);
            } else {
                um.o b17 = um.n.b("local_cdn_img_cache");
                if (b17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ICacheService.Factory", "null service");
                } else {
                    ((jt0.i) ((m11.q0) b17).f322769d).j(str, bitmap);
                }
            }
        }
        this.f101568f.setImageBitmap(bitmap);
    }

    public void setVideoData(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f101566d, "setVideoData() called with: fullPath = [" + str + "]");
        this.f101576q = str;
    }

    public void setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f101569g;
        if (f4Var != null) {
            if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
                ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).setScaleType(e1Var);
            } else if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) {
                ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) f4Var).setScaleType(e1Var);
            }
        }
    }

    public void setVideoStateIv(boolean z17) {
        try {
            this.f101574o.setIsPlay(!z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f101566d, "set video state iv error : " + e17.toString());
        }
    }

    public FavVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String str = "MicroMsg.FavVideoView@" + hashCode();
        this.f101566d = str;
        this.f101567e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f101577r = false;
        this.f101578s = false;
        this.f101579t = 0;
        this.f101580u = false;
        this.f101581v = 0;
        this.f101582w = false;
        this.f101583x = false;
        this.f101584y = true;
        this.B = "";
        this.C = 0;
        this.D = 0;
        this.H = true;
        this.I = new com.tencent.mm.sdk.platformtools.b4(new w82.e1(this), true);
        this.f101565J = new com.tencent.mm.sdk.platformtools.b4(new w82.f1(this), false);
        w82.g1 g1Var = new w82.g1(this);
        this.K = false;
        this.L = new w82.o1(this, null);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ac8, this);
        this.f101568f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p0l);
        this.G = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.h88);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.oyr)).setVisibility(8);
        this.A = (com.tencent.mm.ui.widget.MMPinProgressBtn) findViewById(com.tencent.mm.R.id.f487558p01);
        this.f101585z = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.ozc);
        this.f101571i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.du_);
        this.f101573n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487545oy5);
        this.f101575p = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.cna);
        this.f101572m = findViewById(com.tencent.mm.R.id.f487554oz2);
        this.f101574o = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar) findViewById(com.tencent.mm.R.id.ozz);
        this.f101570h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p0r);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFav265Switch()) == 1) {
            this.f101578s = false;
            df0.t tVar = (df0.t) i95.n0.c(df0.t.class);
            android.content.Context context2 = getContext();
            ((cf0.c0) tVar).getClass();
            kotlin.jvm.internal.o.g(context2, "context");
            this.f101569g = new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer(context2, null, 0, 6, null);
        } else {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            d11.s.Ai();
            this.f101578s = true;
            this.f101569g = new com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView(context, null);
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f101569g;
        com.tencent.mars.xlog.Log.i(str, "ui init view. videoView:%s %s", f4Var, java.lang.Integer.valueOf(f4Var.hashCode()));
        this.f101569g.setVideoCallback(this);
        c();
        setVideoStateIv(true);
        this.f101574o.setIplaySeekCallback(g1Var);
        this.f101574o.setPlayBtnOnClickListener(this);
        this.f101573n.setOnClickListener(new w82.h1(this));
        this.f101574o.setOnClickListener(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.G.addView((android.view.View) this.f101569g, layoutParams);
        b();
    }
}
