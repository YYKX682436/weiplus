package mh2;

/* loaded from: classes10.dex */
public final class f1 extends mh2.a {
    public int A;
    public boolean B;
    public final mh2.r0 C;

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f407861c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f407862d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f407863e;

    /* renamed from: f, reason: collision with root package name */
    public final nh2.a f407864f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f407865g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f407866h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f407867i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f407868j;

    /* renamed from: k, reason: collision with root package name */
    public org.p3363xbe4143f1.C29690xfae77312 f407869k;

    /* renamed from: l, reason: collision with root package name */
    public org.p3363xbe4143f1.C29690xfae77312 f407870l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee f407871m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee f407872n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 f407873o;

    /* renamed from: p, reason: collision with root package name */
    public int f407874p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f407875q;

    /* renamed from: r, reason: collision with root package name */
    public long f407876r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f407877s;

    /* renamed from: t, reason: collision with root package name */
    public om2.e0 f407878t;

    /* renamed from: u, reason: collision with root package name */
    public int f407879u;

    /* renamed from: v, reason: collision with root package name */
    public int f407880v;

    /* renamed from: w, reason: collision with root package name */
    public int f407881w;

    /* renamed from: x, reason: collision with root package name */
    public final eh2.a f407882x;

    /* renamed from: y, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f407883y;

    /* renamed from: z, reason: collision with root package name */
    public r45.ha4 f407884z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context, android.view.ViewGroup root, ah2.f service, lj2.v0 pluginAbility) {
        super(context, root);
        nh2.c jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f407861c = service;
        this.f407862d = pluginAbility;
        this.f407863e = "KTVSingingWidget";
        android.view.KeyEvent.Callback findViewById = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.u8_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        nh2.a aVar = (nh2.a) findViewById;
        this.f407864f = aVar;
        android.view.View findViewById2 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.s_5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f407865g = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.s3n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f407866h = textView;
        android.view.View findViewById4 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.f568462s62);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f407867i = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById4;
        android.view.View findViewById5 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.fxw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        this.f407868j = textView2;
        android.view.View findViewById6 = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.u89);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f407873o = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39) findViewById6;
        this.f407879u = -1;
        this.f407882x = new eh2.a();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        zl2.r4.f555483a.b3(textView2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 c14230x50345152 = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) aVar : null;
        if (c14230x50345152 != null) {
            oh2.r rVar = c14230x50345152.f193209h;
            rVar.getClass();
            rVar.f426950h = c14230x50345152;
            c14230x50345152.f193208g.getClass();
            c14230x50345152.F = service;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85311j).mo141623x754a37bb()).r()).intValue() == 1) {
                android.view.SurfaceView surfaceView = new android.view.SurfaceView(c14230x50345152.getContext());
                c14230x50345152.addView(surfaceView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                jVar = new nh2.i(surfaceView);
            } else {
                android.view.TextureView textureView = new android.view.TextureView(c14230x50345152.getContext());
                textureView.setOpaque(false);
                c14230x50345152.addView(textureView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                jVar = new nh2.j(textureView, c14230x50345152.F);
            }
            c14230x50345152.f193206e = jVar;
            ph2.e bVar = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85331l).mo141623x754a37bb()).r()).intValue() == 1 ? new ph2.b() : new ph2.c();
            bVar.b(c14230x50345152);
            bVar.d(service);
            c14230x50345152.f193207f = bVar;
            nh2.c cVar = c14230x50345152.f193206e;
            if (cVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ktvRender");
                throw null;
            }
            cVar.a(c14230x50345152);
            c14230x50345152.setClipChildren(false);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c14230x50345152.f193215q;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) c14230x50345152.e(72.0f), (int) c14230x50345152.e(40.0f));
            layoutParams.gravity = 1;
            layoutParams.topMargin = (int) c14230x50345152.e(6.0f);
            c22789xd23e9a9b.setTranslationX(-c14230x50345152.e(34.0f));
            c22789xd23e9a9b.setLayoutParams(layoutParams);
            android.widget.ImageView imageView = c14230x50345152.f193216r;
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams((int) c14230x50345152.e(16.0f), (int) c14230x50345152.e(16.0f));
            layoutParams2.gravity = 1;
            layoutParams2.topMargin = (int) c14230x50345152.e(36.0f);
            layoutParams2.bottomMargin = (int) c14230x50345152.e(-4.0f);
            imageView.setLayoutParams(layoutParams2);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = c14230x50345152.f193217s;
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) c14230x50345152.e(74.0f), (int) c14230x50345152.e(28.0f));
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = (int) c14230x50345152.e(10.0f);
            c22789xd23e9a9b2.setLayoutParams(layoutParams3);
            c14230x50345152.addView(c22789xd23e9a9b);
            c14230x50345152.addView(imageView);
            c14230x50345152.addView(c22789xd23e9a9b2);
            imageView.setVisibility(8);
            c22789xd23e9a9b.setVisibility(8);
        }
        ym5.a1.h(textView, new mh2.o0(this));
        this.C = new mh2.r0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(mh2.f1 r7, mh2.p0 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.f1.f(mh2.f1, mh2.p0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void g(mh2.f1 f1Var, mh2.p0 p0Var, int i17) {
        f1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlayComboPag type: ");
        sb6.append(p0Var);
        sb6.append(" index: ");
        sb6.append(i17);
        sb6.append(" isPlaying: ");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = f1Var.f407867i;
        sb6.append(c22789xd23e9a9b.f());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = f1Var.f407863e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (c22789xd23e9a9b.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPlayComboPag isPlaying progress: " + c22789xd23e9a9b.m82577x402effa3());
        } else {
            p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new mh2.b1(f1Var, p0Var, null), 2, null);
        }
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    @Override // mh2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(om2.d0 r23) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.f1.c(om2.d0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0263  */
    @Override // mh2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(r45.x84 r30) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.f1.d(r45.x84):void");
    }

    @Override // mh2.a
    public void e(om2.d0 singState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407863e, "onSwitchState: " + singState + " comboPag: " + this.f407867i.f() + " resetStartTimeCount: " + this.f407881w);
        if (!this.f407861c.k()) {
            pm0.z.b(xy2.b.f539688b, "ktvTimerResetCount", false, null, null, false, false, new mh2.y0(this), 60, null);
        }
        this.f407878t = null;
        this.f407884z = null;
        this.f407881w = 0;
        eh2.a aVar = this.f407882x;
        aVar.f334442a.clear();
        aVar.f334443b = 500L;
        pm0.v.X(new mh2.x0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0 == r1.ordinal()) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r5 = this;
            lj2.v0 r0 = r5.f407862d
            boolean r1 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
            nh2.a r2 = r5.f407864f
            r3 = 0
            if (r1 == 0) goto L5c
            com.tencent.mm.plugin.finder.live.plugin.l r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l) r0
            java.lang.Class<om2.g> r1 = om2.g.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            om2.g r0 = (om2.g) r0
            kotlinx.coroutines.flow.j2 r0 = r0.C
            kotlinx.coroutines.flow.h3 r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r0
            java.lang.Object r0 = r0.mo144003x754a37bb()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L47
            int r0 = r0.intValue()
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r1 = com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger
            int r4 = r1.ordinal()
            if (r0 != r4) goto L2c
            goto L48
        L2c:
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r1 = com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleBackSinger
            int r4 = r1.ordinal()
            if (r0 != r4) goto L35
            goto L48
        L35:
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r1 = com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleAnchor
            int r4 = r1.ordinal()
            if (r0 != r4) goto L3e
            goto L48
        L3e:
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r1 = com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleAudience
            int r4 = r1.ordinal()
            if (r0 != r4) goto L47
            goto L48
        L47:
            r1 = r3
        L48:
            com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole r0 = com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleBackSinger
            if (r1 != r0) goto L5c
            boolean r0 = r2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152
            if (r0 == 0) goto L53
            r3 = r2
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) r3
        L53:
            if (r3 == 0) goto L6a
            oh2.r r0 = r3.f193209h
            r1 = 200(0xc8, float:2.8E-43)
            r0.f426960r = r1
            goto L6a
        L5c:
            boolean r0 = r2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152
            if (r0 == 0) goto L63
            r3 = r2
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) r3
        L63:
            if (r3 == 0) goto L6a
            r0 = 0
            oh2.r r1 = r3.f193209h
            r1.f426960r = r0
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.f1.h():void");
    }

    public final void i(om2.e0 e0Var) {
        om2.p pVar;
        if (e0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j2 j2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j2.f197112a;
            om2.o oVar = e0Var.f427832a;
            if (!j2Var.c(oVar.f427898f).f528578a || (pVar = e0Var.f427833b) == null) {
                return;
            }
            my5.a lyric = pVar.f427901b.f427924c;
            om2.w wVar = pVar.f427903d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407863e, "on bind with lyrics " + lyric + ", note " + (wVar != null ? wVar.f427920c : null));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 c14230x50345152 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) this.f407864f;
            c14230x50345152.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyric, "lyric");
            oh2.o oVar2 = c14230x50345152.f193208g;
            oVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KtvLyricsDrawer", "bind lyrics size: " + lyric.b());
            oVar2.f426916c = lyric;
            oVar2.b();
            int i17 = oVar.f427898f;
            java.lang.String str = oVar.f427895c;
            jh2.c rVar = i17 == 2 ? new kh2.r() : new kh2.l();
            rVar.a(new om2.u(str, pVar));
            rVar.f(new mh2.a1(this, i17, rVar));
        }
    }

    public final void j(r45.ha4 ha4Var) {
        if (ha4Var == null) {
            return;
        }
        int i17 = ha4Var.f457513d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 c14230x50345152 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) this.f407864f;
        c14230x50345152.f193213o = i17;
        if (!c14230x50345152.f193210i) {
            ph2.e eVar = c14230x50345152.f193207f;
            if (eVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerLooper");
                throw null;
            }
            eVar.a();
        }
        c14230x50345152.f193210i = true;
    }

    public final void k(int i17) {
        r45.yx1 Q6;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        java.lang.Object obj = this.f407862d;
        java.lang.String str = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l) obj : null;
        if (lVar != null && (Q6 = ((om2.g) lVar.P0(om2.g.class)).Q6()) != null) {
            str = Q6.f472992e;
        }
        if (str == null) {
            str = "";
        }
        jSONObject.put("req_unique_id", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f555483a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409904p2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.V2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }
}
