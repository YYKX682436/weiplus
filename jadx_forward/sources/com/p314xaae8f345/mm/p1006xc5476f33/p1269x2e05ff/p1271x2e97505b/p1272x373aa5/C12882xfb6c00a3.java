package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewV4;", "Lcom/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarBaseView;", "", "getLayoutId", "getRecentPlayControlType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV4 */
/* loaded from: classes11.dex */
public final class C12882xfb6c00a3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f174550p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f174551q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f174552r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f174553s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f174554t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.RelativeLayout f174555u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f174556v;

    /* renamed from: w, reason: collision with root package name */
    public int f174557w;

    /* renamed from: x, reason: collision with root package name */
    public int f174558x;

    /* renamed from: y, reason: collision with root package name */
    public int f174559y;

    /* renamed from: z, reason: collision with root package name */
    public int f174560z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12882xfb6c00a3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void p(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12882xfb6c00a3 c12882xfb6c00a3, boolean z17) {
        c12882xfb6c00a3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarViewV4", "onClickTaskBarIcon enterAudioTab: " + z17);
        np1.a currentPlayInfo = c12882xfb6c00a3.getCurrentPlayInfo();
        pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
        int i17 = z17 ? 4 : 3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_enter_tab", z17 ? 2 : 1);
        ((ov.b) zVar).N9(1, currentPlayInfo, i17, bundle, new kp1.u0(z17, c12882xfb6c00a3));
    }

    public static final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12882xfb6c00a3 c12882xfb6c00a3) {
        c12882xfb6c00a3.getClass();
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(null);
        jm4.a0 a17 = jm4.c0.f381910d.a();
        if (a17 != null) {
            p3380x6a61f93.p3381xf512d0a5.C30428x21b2a662.m168788x21b88991(((jm4.c0) a17).m105978x2737f10());
        }
        db5.t7.m(c12882xfb6c00a3.getContext(), "已重置");
    }

    public static final void r() {
        jm4.b0 b0Var = jm4.c0.f381910d;
        jm4.a0 a17 = b0Var.a();
        if (a17 != null) {
            ((jm4.c0) a17).a("clicfg_ting_radio_audio_square", "1");
        }
        jm4.a0 a18 = b0Var.a();
        if (a18 != null) {
            ((jm4.c0) a18).a("clicfg_ting_radio_audio_top_lines", "0");
        }
    }

    public static final void s() {
        jm4.b0 b0Var = jm4.c0.f381910d;
        jm4.a0 a17 = b0Var.a();
        if (a17 != null) {
            ((jm4.c0) a17).a("clicfg_ting_radio_audio_square", "1");
        }
        jm4.a0 a18 = b0Var.a();
        if (a18 != null) {
            ((jm4.c0) a18).a("clicfg_ting_radio_audio_top_lines", "1");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void a() {
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Bi(bw5.yq0.TingReportAction_PageDisappear, null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    public void b() {
        super.b();
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Bi(bw5.yq0.TingReportAction_PageAppear, null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public java.lang.String f(np1.a aVar) {
        if (aVar == null) {
            return "";
        }
        if (il4.d.q(aVar.f472516q)) {
            return aVar.f472517r;
        }
        if (il4.l.g(aVar.f472515p) || il4.d.r(aVar.f472516q)) {
            return aVar.f472510h;
        }
        if (aVar.f472516q <= 0) {
            java.lang.String categoryId = aVar.f472519t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(categoryId, "categoryId");
            if (!(categoryId.length() > 0)) {
                return il4.l.l(aVar.f472515p) ? aVar.f472510h : "";
            }
        }
        return aVar.f472517r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void g() {
        m54046x8baf87a4((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.a7_));
        this.f174550p = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.a7c);
        m54047x7b10a520((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7d));
        m54045x5dd06d88((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.a79));
        m54041x4f973a4c((android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.a78));
        this.f174551q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7a);
        this.f174552r = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.a77);
        super.g();
        android.widget.RelativeLayout relativeLayout = this.f174552r;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new kp1.q0(this));
        }
        android.widget.RelativeLayout recentContainer = getRecentContainer();
        if (recentContainer != null) {
            recentContainer.setOnClickListener(new kp1.t0(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(getRecentContainer(), "tyt_mid_cont_pul_recent");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f174552r, "tyt_mid_cont_pul_recent_btn");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    /* renamed from: getLayoutId */
    public int mo54030x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bnr;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    /* renamed from: getRecentPlayControlType */
    public int mo54037x5e16a8d2() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void i(boolean z17) {
        if (z17) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_TrianglePlay, null, null);
        } else {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_DoubleBarPause, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(np1.a r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onUpdateRecentPlayView listenItemType: "
            r0.<init>(r1)
            r1 = 0
            if (r6 == 0) goto L11
            int r2 = r6.f472515p
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L12
        L11:
            r2 = r1
        L12:
            r0.append(r2)
            java.lang.String r2 = ", categoryType: "
            r0.append(r2)
            if (r6 == 0) goto L22
            int r1 = r6.f472516q
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L22:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AudioPanelTaskBarViewV4"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 1
            java.lang.String r1 = ""
            r2 = 0
            if (r6 != 0) goto L36
            goto La4
        L36:
            int r3 = r6.f472516q
            boolean r3 = il4.d.q(r3)
            if (r3 == 0) goto L4e
            android.content.res.Resources r6 = r5.getResources()
            r3 = 2131778186(0x7f105a8a, float:1.9187894E38)
            java.lang.String r6 = r6.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
            goto Lc3
        L4e:
            int r3 = r6.f472516q
            boolean r3 = il4.d.s(r3)
            if (r3 == 0) goto L65
            android.content.res.Resources r6 = r5.getResources()
            r3 = 2131778240(0x7f105ac0, float:1.9188003E38)
            java.lang.String r6 = r6.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
            goto Lc3
        L65:
            int r3 = r6.f472515p
            boolean r3 = il4.l.g(r3)
            if (r3 != 0) goto Lb5
            int r3 = r6.f472516q
            boolean r3 = il4.d.r(r3)
            if (r3 == 0) goto L76
            goto Lb5
        L76:
            int r3 = r6.f472516q
            if (r3 > 0) goto La6
            java.lang.String r3 = r6.f472519t
            java.lang.String r4 = "categoryId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            int r3 = r3.length()
            if (r3 <= 0) goto L89
            r3 = r0
            goto L8a
        L89:
            r3 = r2
        L8a:
            if (r3 == 0) goto L8d
            goto La6
        L8d:
            int r6 = r6.f472515p
            boolean r6 = il4.l.l(r6)
            if (r6 == 0) goto La4
            android.content.res.Resources r6 = r5.getResources()
            r3 = 2131778241(0x7f105ac1, float:1.9188005E38)
            java.lang.String r6 = r6.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
            goto Lc3
        La4:
            r6 = r1
            goto Lc3
        La6:
            android.content.res.Resources r6 = r5.getResources()
            r3 = 2131778244(0x7f105ac4, float:1.9188011E38)
            java.lang.String r6 = r6.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
            goto Lc3
        Lb5:
            android.content.res.Resources r6 = r5.getResources()
            r3 = 2131778189(0x7f105a8d, float:1.91879E38)
            java.lang.String r6 = r6.getString(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
        Lc3:
            int r3 = r6.length()
            if (r3 <= 0) goto Lca
            goto Lcb
        Lca:
            r0 = r2
        Lcb:
            if (r0 == 0) goto Ld8
            android.widget.TextView r0 = r5.f174551q
            if (r0 == 0) goto Le4
            r0.setText(r6)
            r0.setVisibility(r2)
            goto Le4
        Ld8:
            android.widget.TextView r6 = r5.f174551q
            if (r6 == 0) goto Le4
            r6.setText(r1)
            r0 = 8
            r6.setVisibility(r0)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12882xfb6c00a3.k(np1.a):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6
    public void m(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton = getPlayButton();
            if (playButton != null) {
                playButton.s(com.p314xaae8f345.mm.R.raw.f79844x41f895de, com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton2 = getPlayButton();
            if (playButton2 == null) {
                return;
            }
            playButton2.setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton3 = getPlayButton();
        if (playButton3 != null) {
            playButton3.s(com.p314xaae8f345.mm.R.raw.f79905x9403a955, com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 playButton4 = getPlayButton();
        if (playButton4 == null) {
            return;
        }
        playButton4.setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f174557w != getMeasuredWidth()) {
            this.f174557w = getMeasuredWidth();
            ft.v3 v3Var = (ft.v3) i95.n0.c(ft.v3.class);
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jz5.l wi6 = ((et.g) v3Var).wi(context, getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7), this.f174557w);
            this.f174558x = (int) ((java.lang.Number) wi6.f384366d).floatValue();
            this.f174559y = (int) ((java.lang.Number) wi6.f384367e).floatValue();
            u(this.f174553s, this.f174558x, 0);
            u(this.f174555u, this.f174559y, 0);
            u(this.f174550p, this.f174559y, this.f174558x);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    /* renamed from: onResume */
    public void mo54038x57429eec() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6, kp1.l1
    /* renamed from: release */
    public void mo54039x41012807() {
        super.mo54039x41012807();
        this.f174550p = null;
        this.f174551q = null;
        this.f174552r = null;
        this.f174553s = null;
        this.f174554t = null;
        this.f174555u = null;
        this.f174556v = null;
    }

    public final void t(android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = null;
        if (viewGroup != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = this.A;
            } else {
                layoutParams2 = null;
            }
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 != null) {
                int i17 = this.f174560z;
                layoutParams3.width = i17;
                layoutParams3.height = i17;
                layoutParams = layoutParams3;
            }
            view.setLayoutParams(layoutParams);
        }
        if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) view).m81387x205ac394(this.f174560z / 2);
        }
    }

    public final void u(android.view.ViewGroup viewGroup, int i17, int i18) {
        if (viewGroup == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i17);
            marginLayoutParams.setMarginEnd(i18);
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12882xfb6c00a3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.RelativeLayout relativeLayout;
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f174553s = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.a7p);
        this.f174555u = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.a7n);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f174553s, "tyt_mid_cont_pul_music");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f174555u, "tyt_mid_cont_pul_audio");
        this.f174554t = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a7o);
        this.f174556v = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a7m);
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        this.f174560z = (int) (i65.a.f(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561645od) * ip1.s.a(context2));
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        this.A = (int) (i65.a.f(context3, com.p314xaae8f345.mm.R.C30860x5b28f31.f561646oe) * ip1.s.a(context3));
        t(this.f174553s, this.f174554t);
        t(this.f174555u, this.f174556v);
        android.widget.RelativeLayout recentContainer = getRecentContainer();
        if (recentContainer != null) {
            android.widget.RelativeLayout recentContainer2 = getRecentContainer();
            if (recentContainer2 == null || (layoutParams = recentContainer2.getLayoutParams()) == null) {
                layoutParams = null;
            } else {
                layoutParams.height = this.f174560z;
            }
            recentContainer.setLayoutParams(layoutParams);
        }
        if (getRecentContainer() instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) {
            android.widget.RelativeLayout recentContainer3 = getRecentContainer();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = recentContainer3 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) recentContainer3 : null;
            if (c22645x24069159 != null) {
                c22645x24069159.m81436x205ac394(this.f174560z / 2.0f);
            }
        }
        android.widget.RelativeLayout relativeLayout2 = this.f174553s;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new kp1.n0(this));
        }
        android.widget.RelativeLayout relativeLayout3 = this.f174555u;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new kp1.o0(this));
        }
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if (!((i18 == 788529167 || i18 == 788529166) || z65.c.a()) || (relativeLayout = this.f174555u) == null) {
            return;
        }
        relativeLayout.setOnLongClickListener(new kp1.p0(this));
    }
}
