package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView;", "Lcom/tencent/mm/modelvideo/MMVideoView;", "", "getSessionId", "", "mute", "Ljz5/f0;", "setMute", "show", "setNeedShowLoading", "", "getStayTime", "getErrorCode", "getFilePath", "Lcom/tencent/mm/pluginsdk/ui/e1;", "scaleType", "setScaleType", "", "Y1", "J", "getFirstPlayWaitTime", "()J", "setFirstPlayWaitTime", "(J)V", "firstPlayWaitTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView */
/* loaded from: classes4.dex */
public final class C18499x2fc2446b extends com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 {

    /* renamed from: a2, reason: collision with root package name */
    public static final /* synthetic */ int f253643a2 = 0;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public java.lang.String S1;
    public boolean T1;
    public android.widget.RelativeLayout U1;
    public android.widget.ImageView V1;
    public if4.h W1;
    public long X1;

    /* renamed from: Y1, reason: from kotlin metadata */
    public long firstPlayWaitTime;
    public android.widget.TextView Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18499x2fc2446b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        mo48224x6c9eb6a9(com.p314xaae8f345.mm.vfs.w6.i(ef4.w.f334001t.b(), true));
        this.f271289y.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.ui.a(this));
        mo64629xc2e9d13b(false);
        this.f271278n.setVisibility(8);
        this.f271272e = "MicroMsg.StoryVideoView";
        this.P1 = true;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 C(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18498xcd919106 c18498xcd919106 = new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18498xcd919106(context);
        c18498xcd919106.m75833xe3743643(true);
        c18498xcd919106.m75832xcbe8d3cd(k0());
        c18498xcd919106.m75830x4a473e76(true);
        return c18498xcd919106;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void I() {
        super.I();
        this.U1 = new android.widget.RelativeLayout(getContext());
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.V1 = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.widget.ImageView imageView2 = this.V1;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout = this.f271276i;
        android.widget.RelativeLayout relativeLayout2 = this.U1;
        if (relativeLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fakeLayer");
            throw null;
        }
        relativeLayout.addView(relativeLayout2, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f271276i.addView(this.V1, 0);
        this.Z1 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p0r);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void T() {
        if (this.P1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f271289y;
            if (n3Var.mo50285x8fc9be06(1) || this.M) {
                return;
            }
            n3Var.mo50307xb9e94560(1, 800L);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
        super.T4(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "onGetVideoSize, mediaId:" + mo48228x75e04be9() + ", isLocalVideo:" + this.Q1 + ", isPrepareVideo:" + this.G1 + ", isPrepared:" + this.E + ", playerStatus:" + this.f153184y1 + ", downloadStatus:" + this.f153182x1);
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void U(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f271272e, N() + " startTimer, isLocalVideo:" + this.Q1, new java.lang.Object[0]);
        if (this.Q1) {
            return;
        }
        super.U(z17);
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void V() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f271272e, N() + " stopTimer, isLocalVideo:" + this.Q1, new java.lang.Object[0]);
        super.V();
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean Z(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f start, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f end) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        start.f38864x6ac9171 = java.lang.Math.max(i17, this.E1);
        int i18 = this.f153184y1;
        if (i18 == 1) {
            start.f38864x6ac9171 = i17;
            end.f38864x6ac9171 = this.F1 + i17;
            str = "step1;";
        } else {
            str = "";
        }
        if (i18 == 2) {
            int i19 = i17 - 8;
            start.f38864x6ac9171 = i19;
            if (i19 < 0) {
                start.f38864x6ac9171 = 0;
            }
            end.f38864x6ac9171 = start.f38864x6ac9171 + this.F1 + 8;
            str = str + "step2;";
        }
        int i27 = this.f153184y1;
        if (i27 == 3) {
            start.f38864x6ac9171 = this.E1;
            end.f38864x6ac9171 = i17 + 1 + this.J1.f496374b;
            str = str + "step3;";
        } else if (i27 == 4) {
            start.f38864x6ac9171 = this.E1;
            end.f38864x6ac9171 = this.F1 + i17 + 1 + this.J1.f496374b;
            str = str + "step4;";
        }
        int i28 = end.f38864x6ac9171;
        int i29 = this.A1;
        if (i28 >= i29 + 1) {
            end.f38864x6ac9171 = i29 + 1;
            str = str + "step5;";
        }
        java.lang.String str2 = str;
        int i37 = end.f38864x6ac9171;
        int i38 = start.f38864x6ac9171;
        if (i37 < i38) {
            end.f38864x6ac9171 = i38 + this.J1.f496374b;
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s] %s", N(), java.lang.Integer.valueOf(start.f38864x6ac9171), java.lang.Integer.valueOf(end.f38864x6ac9171), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f153184y1), java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this.f153183y0, str2);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean a0(int i17) {
        boolean a07 = super.a0(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "checkCanPlay, cachePlayTime:" + this.E1 + ", ret:" + a07);
        return a07;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "onUIDestroy, isLocalVideo:" + this.Q1);
        super.d();
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "onUIPause, isLocalVideo:" + this.Q1);
        if (!this.Q1) {
            super.e();
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            f4Var.mo69313x65825f6();
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, t21.h0
    public void f(java.lang.String str, long j17, long j18) {
        int i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f153183y0, str)) {
            mo64621x25784152();
            this.f271281q.mo69311xc00617a4();
            N();
            if ((mo64621x25784152() <= 0 || (i17 = this.f153184y1) == 1 || i17 == 0) && b0(mo61523x898ffe25())) {
                U(true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "onUIResume, isLocalVideo:" + this.Q1);
        if (this.Q1) {
            return;
        }
        super.g();
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public void g0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "prepareVideo, surfaceAvailable:" + this.R1);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18498xcd919106) f4Var).m75832xcbe8d3cd(k0());
        }
        java.lang.String filepath = this.f153178l1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filepath, "filepath");
        o0(filepath);
        super.g0();
    }

    /* renamed from: getErrorCode */
    public final int m71530x130a215f() {
        return this.R.f272337k;
    }

    /* renamed from: getFilePath */
    public final java.lang.String m71531x5000ed37() {
        java.lang.String filepath = this.f153178l1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filepath, "filepath");
        return filepath;
    }

    public final long getFirstPlayWaitTime() {
        return this.firstPlayWaitTime;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    /* renamed from: getSessionId */
    public java.lang.String mo66135x23a7af9b() {
        java.lang.String str = this.S1;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    /* renamed from: getStayTime */
    public final int m71533xcaab363c() {
        long j17 = this.X1;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return (int) (android.os.SystemClock.elapsedRealtime() - j17);
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        super.h(z17, str, i17);
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public void i0() {
        super.i0();
        this.R1 = false;
        this.S1 = null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean j() {
        if (this.Q1) {
            return false;
        }
        return super.j();
    }

    public final boolean k0() {
        if (this.Q1) {
            return false;
        }
        try {
            return gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f271272e, e17, "check need reset error", new java.lang.Object[0]);
            return false;
        }
    }

    public final void l0(if4.h item, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = this.Z1;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.W1 = item;
        r45.xe6 xe6Var = item.f372791f;
        android.widget.RelativeLayout relativeLayout = this.U1;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fakeLayer");
            throw null;
        }
        relativeLayout.setVisibility(8);
        android.widget.ImageView imageView = this.V1;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (!(item.f372790e != if4.i.f372793d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "play empty item");
            T();
            return;
        }
        if (item.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "LogStory: play fake video");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "LogStory: play normal video");
            ef4.k0 k0Var = ef4.k0.f333992a;
            java.lang.String d17 = k0Var.d(xe6Var);
            if (com.p314xaae8f345.mm.vfs.w6.k(d17) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "play " + d17 + " downloadDone now can play " + xe6Var.f471554d);
                this.f153178l1 = d17;
                if (d17 != null) {
                    m0(d17);
                }
            } else {
                nf4.o b17 = k0Var.b(item);
                int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(b17.f66550xf1e9b966);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "play " + d17 + " error try play from url or videoCache " + xe6Var.f471554d + " fileLength:" + k17 + " cacheSize:" + b17.f66549x799e9d9e);
                if (k17 < b17.f66549x799e9d9e) {
                    b17.f66549x799e9d9e = k17;
                    ef4.w.f334001t.k().D0(b17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, java.lang.String.valueOf(b17));
                boolean t07 = b17.t0();
                int i17 = item.f372788c;
                if (t07 && com.p314xaae8f345.mm.vfs.w6.j(b17.f66550xf1e9b966)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "play " + xe6Var.f471554d + " download finish");
                    this.f153178l1 = b17.f66550xf1e9b966;
                    this.f153183y0 = k0Var.a(i17, xe6Var.f471556f);
                    java.lang.String filepath = this.f153178l1;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filepath, "filepath");
                    m0(filepath);
                } else {
                    if (b17.t0() && !com.p314xaae8f345.mm.vfs.w6.j(b17.f66550xf1e9b966)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "error downloadFinish " + b17.t0() + " ret:" + com.p314xaae8f345.mm.vfs.w6.j(b17.f66550xf1e9b966));
                        b17.f66549x799e9d9e = 0;
                        b17.f66552x78351860 = 0;
                        ef4.w.f334001t.k().D0(b17);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "play " + xe6Var.f471554d + ' ' + str + " start online play " + b17.f66550xf1e9b966);
                    i0();
                    this.f271281q.mo69303x360802();
                    this.f271281q.mo69326x360a109e(this);
                    this.Q1 = false;
                    this.A = true;
                    m71535x7db42847(true);
                    super.h(false, item.f372791f.f471556f, (int) xe6Var.f471573z);
                    this.f153178l1 = b17.f66550xf1e9b966;
                    this.f153183y0 = k0Var.a(i17, xe6Var.f471556f);
                    this.S1 = str;
                    this.X1 = android.os.SystemClock.elapsedRealtime();
                    this.firstPlayWaitTime = 0L;
                    mo48238x68ac462();
                }
            }
        }
        mo48236x764cf626(true);
        java.lang.Object obj = this.f271281q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "(Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void m0(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "playLocalVideo: " + str + ", isPlayingNow:" + this.f271281q.mo69311xc00617a4());
        if (this.f271281q == null) {
            this.f271281q = C(getContext());
        }
        i0();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            f4Var.mo69303x360802();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var2 = this.f271281q;
        if (f4Var2 != null) {
            f4Var2.mo69318x764d819b(this.O1);
        }
        this.S = false;
        this.Q1 = true;
        m48233xdcf5339c(3);
        m71535x7db42847(false);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var3 = this.f271281q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f4Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18498xcd919106) f4Var3).m75832xcbe8d3cd(k0());
        this.f271281q.mo69327xab3268fe(str);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.X1 = android.os.SystemClock.elapsedRealtime();
        this.firstPlayWaitTime = 0L;
        if4.h hVar = this.W1;
        if (hVar == null || (str2 = hVar.f372789d) == null) {
            str2 = "";
        }
        nf4.g g17 = ef4.w.f334001t.g();
        nf4.f L0 = g17.L0(str2);
        boolean t07 = L0.t0();
        long j17 = L0.f66290xe188436;
        long j18 = L0.f66294x10ed17fb;
        if (j17 != j18) {
            L0.f66290xe188436 = j18;
            L0.f66291xea0d6f28 = c01.id.c();
            boolean b17 = g17.b1(L0);
            boolean t08 = L0.t0();
            if (b17 && t07 && !t08) {
                g17.mo142179xf35bbb4("notify_story_read", 1, L0);
            }
        }
        this.f271281q.mo69326x360a109e(new sf4.x1(this));
        this.T1 = false;
        this.S1 = null;
        o0(str);
    }

    public final void n0() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7060x39f93c0f c7060x39f93c0f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7060x39f93c0f();
        if4.h hVar = this.W1;
        c7060x39f93c0f.f143667d = c7060x39f93c0f.b("StoryId", java.lang.String.valueOf(hVar != null ? java.lang.Long.valueOf(hVar.f372787b) : null), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6936x5d31fefc c6936x5d31fefc = mf4.d.f407696d;
        c7060x39f93c0f.f143668e = c6936x5d31fefc.f142452e;
        c7060x39f93c0f.f143670g = c6936x5d31fefc.f142461n == 1 ? 1L : 0L;
        c7060x39f93c0f.f143673j = this.firstPlayWaitTime;
        c7060x39f93c0f.f143678o = m71533xcaab363c();
        c7060x39f93c0f.f143679p = m71530x130a215f();
        c7060x39f93c0f.Q = 1L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6936x5d31fefc c6936x5d31fefc2 = mf4.d.f407696d;
        c7060x39f93c0f.R = c6936x5d31fefc2.f142451d;
        c7060x39f93c0f.S = c6936x5d31fefc2.f142457j;
        c7060x39f93c0f.f143672i = mo64621x25784152();
        java.lang.System.currentTimeMillis();
        if (java.lang.System.currentTimeMillis() - c7060x39f93c0f.S < 500) {
            return;
        }
        if4.h hVar2 = this.W1;
        try {
            ef4.w.f334001t.l().mo50293x3498a0(new sf4.y1(this, c7060x39f93c0f, hVar2 != null ? hVar2.f372787b : 0L));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f271272e, e17, "reportStopLocalVideo", new java.lang.Object[0]);
            c7060x39f93c0f.k();
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, t21.h0
    public void o(java.lang.String str, int i17) {
        super.o(str, i17);
    }

    public final void o0(java.lang.String str) {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        if (((java.lang.Integer) m17).intValue() == 1) {
            android.widget.TextView textView = this.Z1;
            if (textView != null) {
                ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
                textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.e(str));
            }
            android.widget.TextView textView2 = this.Z1;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "onCompletion, currPosMs:" + mo64621x25784152() + ", playStatus:" + this.f153184y1 + ", downloadStatus:" + this.f153182x1);
        if (mo64621x25784152() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f271284t;
        if (b1Var != null) {
            b1Var.E(mo66135x23a7af9b(), mo48228x75e04be9());
        }
        super.mo9755xa6db431b();
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4
    /* renamed from: onSurfaceAvailable */
    public void mo48230xe037649b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "onSurfaceAvailable");
        this.R1 = true;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: pause */
    public boolean mo48231x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "pause, isLocalVideo:" + this.Q1);
        if (!this.Q1) {
            return super.mo48231x65825f6();
        }
        this.T1 = true;
        this.f271281q.mo69313x65825f6();
        return true;
    }

    /* renamed from: setFirstPlayWaitTime */
    public final void m71534x53a843c4(long j17) {
        this.firstPlayWaitTime = j17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setMute */
    public void mo61536x764d819b(boolean z17) {
        super.mo61536x764d819b(z17);
        this.O1 = z17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            f4Var.mo69318x764d819b(z17);
        }
    }

    /* renamed from: setNeedShowLoading */
    public final void m71535x7db42847(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, hashCode() + " setNeedShowLoading: " + z17);
        this.P1 = z17;
        if (z17) {
            return;
        }
        D();
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setScaleType */
    public void mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        super.mo48237xebd28962(e1Var);
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: start */
    public void mo48238x68ac462() {
        if (this.C > 0 && !this.Q1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "start from onError and not local video");
            if4.h hVar = this.W1;
            if (hVar != null) {
                nf4.o b17 = ef4.k0.f333992a.b(hVar);
                if (b17.t0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "start from onError and download finish now");
                    java.lang.String field_filePath = b17.f66550xf1e9b966;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_filePath, "field_filePath");
                    m0(field_filePath);
                    return;
                }
            }
        }
        java.lang.String filepath = this.f153178l1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filepath, "filepath");
        o0(filepath);
        super.mo48238x68ac462();
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: stop */
    public void mo48239x360802() {
        try {
            if (this.Q1) {
                n0();
                this.f271281q.mo69303x360802();
                i0();
            } else {
                super.mo48239x360802();
            }
            android.widget.ImageView imageView = this.V1;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f271272e, e17, "stop error", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4
    public void v() {
        super.v();
        java.lang.Object obj = this.f271281q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", "onTextureUpdate", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", "onTextureUpdate", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (this.firstPlayWaitTime <= 0) {
            long j17 = this.X1;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.firstPlayWaitTime = android.os.SystemClock.elapsedRealtime() - j17;
            java.lang.String str = this.f271272e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTextureUpdate firstPlayWaitTime ");
            sb6.append(this.firstPlayWaitTime);
            sb6.append(" storyId: ");
            if4.h hVar = this.W1;
            sb6.append(hVar != null ? java.lang.Long.valueOf(hVar.f372787b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4
    public void z(boolean z17) {
        if (this.Q1) {
            return;
        }
        super.z(z17);
    }
}
