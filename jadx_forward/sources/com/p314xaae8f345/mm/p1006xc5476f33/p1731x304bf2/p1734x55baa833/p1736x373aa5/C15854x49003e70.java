package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter */
/* loaded from: classes5.dex */
public class C15854x49003e70 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 implements xn5.a0 {
    public static final /* synthetic */ int P = 0;
    public int A;
    public boolean B;
    public boolean C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.q2 D;
    public final java.util.Map E;
    public java.lang.String F;
    public java.lang.String G;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p2 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 f220472J;
    public boolean K;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 L;
    public boolean M;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e8 N;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f220473g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f220474h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f220475i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f220476m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f220477n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f220478o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f220479p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f220480q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f220481r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f220482s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.g8 f220483t;

    /* renamed from: u, reason: collision with root package name */
    public int f220484u;

    /* renamed from: v, reason: collision with root package name */
    public int f220485v;

    /* renamed from: w, reason: collision with root package name */
    public int f220486w;

    /* renamed from: x, reason: collision with root package name */
    public int f220487x;

    /* renamed from: y, reason: collision with root package name */
    public int f220488y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f220489z;

    public C15854x49003e70(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220481r = false;
        this.f220484u = -1;
        this.f220485v = -1;
        this.f220486w = -1;
        this.f220487x = 0;
        this.f220488y = 0;
        this.f220489z = false;
        this.A = 0;
        this.B = false;
        this.C = false;
        this.E = new java.util.HashMap();
        this.F = "";
        this.G = "";
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p2(this);
        this.I = false;
        this.K = false;
        this.M = false;
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.o2(this);
        this.f220473g = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public static void g(final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70, java.lang.String str) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e702;
        if (c15854x49003e70.M) {
            return;
        }
        if ((c15854x49003e70.F + "@").equals(str)) {
            c15854x49003e70.n(8, 1);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(c15854x49003e70.getContext(), 0, 0, true, true);
            c15854x49003e70.L = z2Var;
            z2Var.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3() { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$b
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
                /* renamed from: dismiss */
                public final void mo2069x63a3b28a() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70.P;
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e703 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70.this;
                    c15854x49003e703.getClass();
                    c15854x49003e703.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70.P;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70.this.n(0, 1);
                        }
                    }, 200L);
                }
            });
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 mentionSomeoneDialog = c15854x49003e70.L;
            android.content.Context context = c15854x49003e70.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.g2(c15854x49003e70);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mentionSomeoneDialog, "mentionSomeoneDialog");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf fragmentActivity = c15854x49003e70.f220473g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentActivity, "fragmentActivity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = p012xc85e97e9.p093xedfae76a.k1.a(fragmentActivity, null).a(g43.x.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            g43.x xVar = (g43.x) a17;
            long longExtra = fragmentActivity.getIntent().getLongExtra("game_report_ssid", 0L);
            long longExtra2 = fragmentActivity.getIntent().getLongExtra("game_report_sourceid", 0L);
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570682bg4, (android.view.ViewGroup) null, false);
            int i17 = com.p314xaae8f345.mm.R.id.dhv;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.dhv);
            if (c21486x59d05a04 != null) {
                i17 = com.p314xaae8f345.mm.R.id.g7q;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g7q);
                if (frameLayout != null) {
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.hkv);
                    if (imageView != null) {
                        int i18 = com.p314xaae8f345.mm.R.id.f567041hx4;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567041hx4);
                        if (linearLayout != null) {
                            i18 = com.p314xaae8f345.mm.R.id.iip;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.iip);
                            if (linearLayout2 != null) {
                                i18 = com.p314xaae8f345.mm.R.id.f568253m90;
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f568253m90);
                                if (c1163xf1deaba4 != null) {
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) inflate;
                                    x33.d dVar = new x33.d(linearLayout3, c21486x59d05a04, frameLayout, imageView, linearLayout, linearLayout2, c1163xf1deaba4);
                                    imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.l(mentionSomeoneDialog));
                                    frameLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.m(dVar, longExtra, longExtra2));
                                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
                                    fVar.e(700L, 1L, longExtra, longExtra2, null);
                                    java.lang.String str2 = xVar.f350329f;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.t(str2, longExtra, longExtra2);
                                    c21486x59d05a04.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.n(xVar, tVar));
                                    tVar.f220395h = g2Var;
                                    c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
                                    c1163xf1deaba4.mo7960x6cab2c8d(tVar);
                                    p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(xVar), (oz5.l) xVar.f350334n.mo141623x754a37bb(), null, new g43.s(xVar, null), 2, null);
                                    xVar.f350327d.mo7806x9d92d11c(fragmentActivity, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.o(tVar));
                                    xVar.f350328e.mo7806x9d92d11c(fragmentActivity, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.p(tVar));
                                    mentionSomeoneDialog.k(linearLayout3, 0, 0);
                                    android.view.ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                                    layoutParams.height = (com.p314xaae8f345.mm.ui.bh.a(context).f278669b * 3) / 4;
                                    linearLayout3.setLayoutParams(layoutParams);
                                    c15854x49003e702 = c15854x49003e70;
                                    c15854x49003e702.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70.this.L.C();
                                        }
                                    }, 100L);
                                    fVar.e(0L, 1L, c15854x49003e70.m64418xfb856bf1(), c15854x49003e70.m64417xe3f1140c(), null);
                                }
                            }
                        }
                        i17 = i18;
                    } else {
                        i17 = com.p314xaae8f345.mm.R.id.hkv;
                    }
                }
            }
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
        }
        c15854x49003e702 = c15854x49003e70;
        c15854x49003e702.F = str;
    }

    /* renamed from: getLastText */
    private java.lang.String m64415x24dd4e59() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f220477n;
        return c22621x7603e017 == null ? "" : c22621x7603e017.getText().toString();
    }

    /* renamed from: getSelectionStart */
    private int m64416x6f2c472c() {
        return this.f220477n.getSelectionStart();
    }

    /* renamed from: getSourceId */
    private long m64417xe3f1140c() {
        return this.f220473g.getIntent().getLongExtra("game_report_sourceid", 0L);
    }

    /* renamed from: getSsid */
    private long m64418xfb856bf1() {
        return this.f220473g.getIntent().getLongExtra("game_report_ssid", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if ((r1.f36470x8cea31d7 == 0) == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: setFooterVisibilityImpl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m64419x4b2a624f(int r6) {
        /*
            r5 = this;
            super.setVisibility(r6)
            if (r6 != 0) goto L9c
            android.view.ViewGroup r6 = r5.f220474h
            if (r6 == 0) goto L9c
            com.tencent.mm.plugin.game.chatroom.view.p2 r0 = r5.H
            boolean r1 = r0.f220789a
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            r6.setVisibility(r1)
            android.view.ViewGroup r6 = r5.f220474h
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r1 = r0.f220791c
            r6.setTag(r1)
            android.widget.TextView r6 = r5.f220475i
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r1 = r0.f220791c
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "话题："
            r1.<init>(r4)
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r4 = r0.f220791c
            java.lang.String r4 = r4.f36472x337a8b
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L3b
        L39:
            java.lang.String r1 = ""
        L3b:
            r6.setText(r1)
            boolean r6 = r0.f220790b
            if (r6 == 0) goto L44
            r6 = r3
            goto L45
        L44:
            r6 = r2
        L45:
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r1 = r5.f220472J
            r4 = 1
            if (r1 == 0) goto L54
            int r1 = r1.f36470x8cea31d7
            if (r1 != 0) goto L50
            r1 = r4
            goto L51
        L50:
            r1 = r3
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r6
        L55:
            android.widget.ImageView r6 = r5.f220476m
            r6.setVisibility(r2)
            boolean r6 = r0.f220789a
            if (r6 == 0) goto L7b
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r6 = r5.f220472J
            if (r6 == 0) goto L7b
            int r6 = r6.f36470x8cea31d7
            if (r6 != 0) goto L68
            r6 = r4
            goto L69
        L68:
            r6 = r3
        L69:
            if (r6 != 0) goto L7b
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f220482s
            r6.p(r3, r3)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f220482s
            r6.mo75352xe9a5b5a2(r3)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f220482s
            r6.mo75349x4a374107(r3)
            goto L8e
        L7b:
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f220482s
            r6.mo75352xe9a5b5a2(r4)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f220482s
            r6.mo75349x4a374107(r4)
            boolean r6 = r5.I
            if (r6 == 0) goto L8e
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f220482s
            r6.p(r4, r3)
        L8e:
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f220482s
            r6.i()
            if (r2 != 0) goto L9c
            r0.f220789a = r3
            r6 = 0
            r0.f220791c = r6
            r0.f220790b = r3
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70.m64419x4b2a624f(int):void");
    }

    /* renamed from: setLastText */
    private void m64420x1f95af65(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f220477n;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = this.f220477n.getTextSize();
        ((ke0.e) xVar).getClass();
        c22621x7603e017.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f220477n;
        c22621x7603e0172.mo81549xf579a34a(c22621x7603e0172.getText().length());
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049, al5.e0
    public void J2(boolean z17, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        super.J2(z17, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatCommentFooter", "onInputPanelChange, isKeyboardShow:%b, keyboardHeight:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        this.f220477n.m(z17);
        if (this.f220487x != i17 && i17 != 0) {
            this.f220487x = i17;
            m();
            fp.w.m(getContext(), i17);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f220482s;
            if (abstractC19636xc6b37291 != null && (layoutParams = abstractC19636xc6b37291.getLayoutParams()) != null) {
                layoutParams.height = this.f220488y;
            }
        }
        if (z17 && this.f220482s.getVisibility() == 8) {
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f220482s.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = this.f220487x;
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.c2(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(c2Var, 50L, false);
        } else if (this.f220482s.getVisibility() != 8 && !this.K) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            valueAnimator.setIntValues(z17 ? this.f220488y : this.f220487x, z17 ? this.f220487x : this.f220488y);
            valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e2(this));
            valueAnimator.setDuration(200L);
            valueAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.f2(this));
            valueAnimator.start();
        }
        if (!this.f220489z || z17) {
            return;
        }
        setVisibility(8);
    }

    /* renamed from: getCharAtCursor */
    public char m64421x3f55ad55() {
        int m64416x6f2c472c = m64416x6f2c472c();
        if (m64416x6f2c472c <= 0) {
            return 'x';
        }
        return m64415x24dd4e59().charAt(m64416x6f2c472c - 1);
    }

    public final void h(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        if (z17) {
            str3 = "@" + str2 + (char) 8197;
        } else {
            str3 = str2 + (char) 8197;
        }
        java.util.Map map = this.E;
        java.util.List list = (java.util.List) ((java.util.HashMap) map).get(str);
        if (list == null) {
            list = new java.util.ArrayList();
        }
        list.add(str2);
        ((java.util.HashMap) map).put(str, list);
        i(str3, null);
    }

    public void i(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3) {
        if (c15716x8f4414e3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p2 p2Var = this.H;
            p2Var.f220789a = true;
            p2Var.f220791c = c15716x8f4414e3;
            p2Var.f220790b = true;
        }
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(this.f220477n.getText().toString() + str, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2) <= 1000) {
            this.f220477n.n(str);
        }
    }

    public boolean j(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() == 0) {
                if (m64421x3f55ad55() == 8197) {
                    this.C = true;
                } else {
                    this.C = false;
                }
            }
            if (keyEvent.getAction() == 1 && this.C) {
                this.C = false;
                int m64416x6f2c472c = m64416x6f2c472c();
                java.lang.String m64415x24dd4e59 = m64415x24dd4e59();
                java.lang.String substring = m64415x24dd4e59.substring(0, m64416x6f2c472c);
                int lastIndexOf = substring.lastIndexOf(64);
                if (lastIndexOf < substring.length() && lastIndexOf >= 0) {
                    m64420x1f95af65(substring.substring(0, lastIndexOf) + m64415x24dd4e59.substring(m64416x6f2c472c));
                    this.f220477n.mo81549xf579a34a(lastIndexOf);
                }
            }
        }
        return false;
    }

    public final void k() {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(this.f220488y, 0);
        valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.r1(this));
        valueAnimator.setDuration(200L);
        valueAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.s1(this));
        valueAnimator.start();
    }

    public final void l(boolean z17) {
        this.f220482s.h();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext())) {
            m81273xb2a7481e().f(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i2(this, z17));
        } else if (z17) {
            k();
        }
    }

    public final void m() {
        this.f220488y = java.lang.Math.max(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561338fq), this.f220487x);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("GameChatRoom.GameChatCommentFooter", "keyboardHeight:%d, smileyPanelHeight:%d", java.lang.Integer.valueOf(this.f220487x), java.lang.Integer.valueOf(this.f220488y));
    }

    public void n(int i17, int i18) {
        this.f220484u = i18;
        boolean z17 = i17 == 0;
        this.f220481r = false;
        if (i18 == 0 && z17) {
            this.f220481r = true;
        } else if (i18 == 1 && !z17) {
            this.f220481r = true;
        }
        if (this.f220482s != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("GameChatRoom.GameChatCommentFooter", "showState " + z17, new java.lang.Object[0]);
            if (z17) {
                this.f220479p.performClick();
                this.f220481r = false;
            } else {
                l(this.f220481r);
                this.f220489z = false;
                this.f220473g.mo48674x36654fab();
                requestLayout();
            }
        }
        postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.d2(this, i17, z17), 100L);
    }

    public final void o() {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(0, this.f220488y);
        valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1(this));
        valueAnimator.setDuration(200L);
        valueAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.q1(this));
        valueAnimator.start();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f220473g;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.bel, this);
        this.f220474h = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.glw);
        this.f220475i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.glx);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.glv);
        this.f220476m = imageView;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j2(this));
        this.f220477n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.f566652gm1);
        this.f220478o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.glz);
        this.f220479p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.gly);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.got);
        this.f220480q = textView;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k2(this));
        int desiredWidth = ((int) android.text.Layout.getDesiredWidth(this.f220480q.getText(), this.f220480q.getPaint())) + this.f220480q.getPaddingStart() + this.f220480q.getPaddingEnd();
        this.A = desiredWidth;
        if (desiredWidth < com.p314xaae8f345.mm.ui.zk.e(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj)) {
            this.A = com.p314xaae8f345.mm.ui.zk.e(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        }
        this.f220477n.mo81583x7e4f2d39(new android.text.InputFilter[]{new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t1(this, 1000, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2)});
        this.f220477n.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y1(this));
        this.f220477n.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.z1(this));
        this.f220479p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l2(this));
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a() == null) {
            this.f220482s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t5(abstractActivityC21394xb3d2c0cf);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
        this.f220482s = wi6;
        wi6.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f220487x = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        m();
        linearLayout.addView(this.f220482s, -1, this.f220488y);
        this.f220482s.mo75348x625a7311(false);
        this.f220482s.o(false, false);
        this.f220482s.p(false, false);
        this.f220482s.mo75351x4aab89d0(true);
        this.f220482s.mo75349x4a374107(true);
        this.f220482s.mo75331xef640234(102);
        this.f220482s.mo75345x9e226965(3);
        this.f220482s.mo75357x9d98e686(this.G);
        this.f220482s.mo75358x658d5272(this.f220477n.getText().toString());
        this.f220482s.i();
        this.f220482s.mo75339x5e04422d(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m2(this));
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6 x6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6.class);
        android.content.Context context = getContext();
        android.view.View rootView = getRootView();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f220477n;
        c22621x7603e017.getClass();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.cb) x6Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra(context, rootView, this, c22621x7603e017);
        this.f220483t = raVar;
        raVar.f272150h = this.N;
        raVar.f272148f = this.f220479p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.n2 n2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.n2(this);
        this.f220482s.mo75328x6c4ebec7(n2Var);
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra) this.f220483t).f272149g = n2Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f220485v;
        if (i28 < i27) {
            i28 = i27;
        }
        this.f220485v = i28;
        this.f220486w = i27;
    }

    /* renamed from: setCanAtAll */
    public void m64422x6d623500(boolean z17) {
    }

    /* renamed from: setChannelInfo */
    public void m64423x808dd68f(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3) {
        this.f220472J = c15716x8f4414e3;
    }

    /* renamed from: setFooterActionListener */
    public void m64424x83951307(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.q2 q2Var) {
        this.D = q2Var;
    }

    /* renamed from: setHostUserName */
    public void m64425x2685bc40(java.lang.String str) {
        this.G = str;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f220482s;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75357x9d98e686(str);
        }
    }

    /* renamed from: setIsRealTimeRoom */
    public void m64426x593d8052(boolean z17) {
        this.M = z17;
    }

    /* renamed from: setRobotUserName */
    public void m64427xeaf1e43e(java.lang.String str) {
    }

    /* renamed from: setShowCustom */
    public void m64428x2fd366d0(boolean z17) {
        this.I = z17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f220482s;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.p(z17, false);
            this.f220482s.mo75348x625a7311(false);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        n(i17, 1);
    }
}
