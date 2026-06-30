package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class m0 implements bi4.n0, bi4.p0, android.view.View.OnClickListener {
    public final android.widget.FrameLayout A;
    public final android.view.View.OnAttachStateChangeListener B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18615x68122c6 C;
    public java.lang.String D;
    public java.lang.String E;
    public long F;
    public final bi4.m0 G;
    public pj4.o0 H;
    public al5.a0 I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View.OnClickListener f255596J;
    public bi4.m0 K;

    /* renamed from: d, reason: collision with root package name */
    public final bi4.k1 f255597d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f255598e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f255599f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f255600g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f255601h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f255602i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f255603m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f255604n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f255605o;

    /* renamed from: p, reason: collision with root package name */
    public mj4.h f255606p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.FrameLayout f255607q;

    /* renamed from: r, reason: collision with root package name */
    public final cj4.l1 f255608r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f255609s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f255610t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.ViewGroup f255611u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f255612v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f255613w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewGroup f255614x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.ViewGroup f255615y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f255616z;

    /* JADX WARN: Type inference failed for: r7v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.textstatus.ui.MiniStatusCardView$likeUIChangeEvent$1] */
    public m0(final android.content.Context context, bi4.k1 showParam) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showParam, "showParam");
        this.f255597d = showParam;
        this.f255598e = "MicroMsg.TextStatus.MiniStatusCardView@" + hashCode();
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h0.f255452d);
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i0.f255503d);
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j0(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.don, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f255599f = inflate;
        this.f255600g = context;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g0(this);
        this.B = g0Var;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        ?? r76 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6129x8f5ebd6d>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.MiniStatusCardView$likeUIChangeEvent$1
            {
                this.f39173x3fe91575 = 779616605;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6129x8f5ebd6d c6129x8f5ebd6d) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6129x8f5ebd6d event = c6129x8f5ebd6d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m0.this;
                mj4.h hVar = m0Var.f255606p;
                if (hVar == null) {
                    return false;
                }
                mj4.k kVar = (mj4.k) hVar;
                if (!en1.a.a().equals(kVar.o())) {
                    am.yx yxVar = event.f136401g;
                    java.lang.String str = yxVar.f90022b;
                    java.lang.String str2 = yxVar.f90023c;
                    if (!str.equals(kVar.o())) {
                        return false;
                    }
                    if (str2 == null || r26.n0.N(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.f255598e, "likeUIChangeEvent: failed, ".concat(str));
                        return false;
                    }
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, kVar.l());
                    android.content.Context context2 = context;
                    if (!b17) {
                        if (yxVar.f90021a) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                            pf5.z zVar = pf5.z.f435481a;
                            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd.class)).O6(str2);
                            return false;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                        pf5.z zVar2 = pf5.z.f435481a;
                        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd.class)).P6(str2);
                        return false;
                    }
                    boolean z17 = yxVar.f90021a;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = m0Var.f255603m;
                    if (z17) {
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79526xc76cc485);
                        }
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.m82040x7541828(i65.a.d(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                        }
                    } else {
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79526xc76cc485);
                        }
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.m82040x7541828(i65.a.d(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                        }
                    }
                    if (yxVar.f90021a) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                        pf5.z zVar3 = pf5.z.f435481a;
                        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd.class)).O6(str2);
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.setTag(java.lang.Boolean.TRUE);
                        }
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                        pf5.z zVar4 = pf5.z.f435481a;
                        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd) zVar4.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd.class)).P6(str2);
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.setTag(java.lang.Boolean.FALSE);
                        }
                    }
                }
                return true;
            }
        };
        this.C = r76;
        cj4.k kVar = new cj4.k(showParam);
        this.f255608r = kVar;
        kVar.i(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.opk);
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        }
        this.f255603m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.b0s);
        this.f255604n = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h7m);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ope);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        this.f255615y = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.r7i);
        this.f255616z = inflate.findViewById(com.p314xaae8f345.mm.R.id.f569065ow3);
        this.f255607q = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.hyw);
        this.f255601h = inflate.findViewById(com.p314xaae8f345.mm.R.id.hvz);
        this.f255602i = inflate.findViewById(com.p314xaae8f345.mm.R.id.hvp);
        this.A = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.hyc);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565020b03);
        this.f255609s = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b0y);
        this.f255610t = findViewById2;
        this.f255605o = inflate.findViewById(com.p314xaae8f345.mm.R.id.owd);
        this.f255611u = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.hye);
        this.f255612v = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568966om5);
        this.f255613w = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oqx);
        this.f255614x = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.hxg);
        if (showParam.l(128)) {
            inflate.setOutlineProvider(new bk4.e2(true, true, i65.a.a(context, 12.0f)));
            inflate.setClipToOutline(true);
        }
        if (findViewById == null) {
            view = findViewById2;
        } else {
            int i17 = showParam.l(512) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            view = findViewById2;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (showParam.l(65536)) {
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            android.view.View view3 = view;
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.f0(this));
        }
        inflate.addOnAttachStateChangeListener(g0Var);
        r76.mo48813x58998cd();
        this.D = "";
        this.E = "";
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k0(this);
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        boolean z17 = str == null || r26.n0.N(str);
        java.lang.String str2 = this.f255598e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateByStatusId: failed");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateByStatusId: " + str);
        mj4.h t17 = ai4.m0.f86706a.G().t(str);
        this.f255606p = t17;
        bi4.p0.U2(this, t17 != null ? ((mj4.k) t17).o() : "", this.f255606p, null, 4, null);
    }

    @Override // bi4.n0
    public void S5(long j17) {
        long c17 = c01.id.c();
        long j18 = this.F;
        long j19 = c17 - j18;
        qj4.s.m(qj4.s.f445491a, this.f255600g, 2L, null, this.f255606p, j17, (j19 < 0 || j18 == 0) ? 0L : j19, 0L, 0L, null, null, 0L, 1988, null);
    }

    @Override // bi4.q0
    public void a() {
        java.lang.String str = this.f255598e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onStatusShowResume]");
        al5.a0 a0Var = this.I;
        boolean z17 = false;
        boolean e17 = a0Var != null ? a0Var.e() : false;
        if (this.f255597d.l(32) && !e17) {
            z17 = true;
        }
        if (z17 && b21.m.c()) {
            b21.m.j();
        }
        al5.a0 a0Var2 = this.I;
        if (a0Var2 != null) {
            a0Var2.j();
        }
        al5.a0 a0Var3 = this.I;
        if (a0Var3 != null) {
            a0Var3.h();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "playVideo() called textureView:null");
        ((cj4.k) this.f255608r).v();
        si4.a G = ai4.m0.f86706a.G();
        mj4.h hVar = this.f255606p;
        java.lang.String o17 = hVar != null ? ((mj4.k) hVar).o() : null;
        mj4.h hVar2 = this.f255606p;
        si4.a.k(G, o17, hVar2 != null ? ((mj4.k) hVar2).l() : null, false, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if ((r5 != null && com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c.b(r5, r10)) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(mj4.h r10) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m0.b(mj4.h):void");
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255598e, "update: " + str);
        mj4.h M = ai4.m0.f86706a.M(str);
        this.f255606p = M;
        bi4.p0.U2(this, str, M, null, 4, null);
    }

    @Override // bi4.q0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255598e, "[onStatusShowDestroy]");
        android.widget.FrameLayout frameLayout = this.f255607q;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        cj4.l1 l1Var = this.f255608r;
        ((cj4.k) l1Var).o();
        l1Var.getClass();
        al5.a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.i();
        }
        al5.a0 a0Var2 = this.I;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        al5.a0 a0Var3 = this.I;
        if (a0Var3 != null) {
            a0Var3.mo451xac79a11b();
        }
        this.I = null;
        this.H = null;
        mo48814x2efc64();
    }

    @Override // bi4.q0
    public void d() {
        java.lang.String str = this.f255598e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[onStatusShowPause]");
        al5.a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.i();
        }
        al5.a0 a0Var2 = this.I;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pauseVideo() called textureView:null state:null ");
        ((cj4.k) this.f255608r).l();
    }

    @Override // bi4.n0
    /* renamed from: getView */
    public android.view.View mo10628xfb86a31b() {
        return this.f255599f;
    }

    @Override // bi4.p0
    public void m(java.lang.String username, mj4.h hVar, pj4.u0 u0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255598e, "update() called with: username = " + username + ", info = " + hVar + ", extraParam = " + u0Var);
        this.f255606p = hVar;
        if (hVar == null) {
            android.view.View view = this.f255599f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        mj4.k kVar = (mj4.k) hVar;
        new ej4.a0(username, this, kVar.l());
        md0.e eVar = (md0.e) ((nd0.e) i95.n0.c(nd0.e.class));
        android.content.Context context = this.f255600g;
        pj4.p0 p0Var = (pj4.p0) eVar.Ui(context, 9, pj4.p0.class);
        bi4.k1 k1Var = this.f255597d;
        if (p0Var != null) {
            p0Var.f436770e = username;
            p0Var.f436775m = k1Var.f102600g;
        }
        if (k1Var.f102600g == 3) {
            si4.a.k(ai4.m0.f86706a.G(), kVar.o(), kVar.l(), false, 4, null);
        }
        cj4.l1 l1Var = this.f255608r;
        cj4.k kVar2 = (cj4.k) l1Var;
        if (!kVar2.m(username, hVar, u0Var)) {
            android.view.View view2 = this.f255599f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f255599f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean l17 = k1Var.l(32768);
        android.view.View view4 = this.f255616z;
        if (!l17 || com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c.d(this.f255606p, ((cj4.k) l1Var).d())) {
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view4 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = this.f255604n;
        if (imageView != null) {
            imageView.getVisibility();
        }
        android.view.View view5 = this.f255599f;
        view5.setOnClickListener(this);
        android.view.ViewGroup viewGroup = this.f255615y;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l0(hVar, this));
        }
        pj4.p0 p0Var2 = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
        if (p0Var2 != null) {
            if (android.text.TextUtils.equals(p0Var2.f436769d, this.D) && android.text.TextUtils.equals(this.E, kVar.l())) {
                return;
            }
            if (!k1Var.l(16384)) {
                pj4.p0 p0Var3 = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
                if (p0Var3 != null) {
                    java.lang.Object tag = view5.getTag(com.p314xaae8f345.mm.R.id.nwq);
                    java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
                    p0Var3.f436777o = num != null ? num.intValue() : 0;
                    qj4.s.m(qj4.s.f445491a, this.f255600g, 1L, null, this.f255606p, 0L, 0L, 0L, 0L, null, null, 0L, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46383xd637ed7f, null);
                }
                this.F = c01.id.c();
            }
            this.D = p0Var2.f436769d;
            this.E = kVar.l();
        }
        long j17 = kVar.f408600b.f76512x81959a6e * 1000;
        boolean l18 = k1Var.l(131072);
        android.view.ViewGroup viewGroup2 = this.f255611u;
        android.view.ViewGroup viewGroup3 = this.f255614x;
        if (l18) {
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            android.widget.TextView textView = this.f255612v;
            if (textView != null) {
                textView.setText(android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.juz), j17).toString());
            }
            android.widget.TextView textView2 = this.f255613w;
            if (textView2 != null) {
                textView2.setText(android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxk), j17).toString());
            }
        } else {
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
        try {
            b(hVar);
        } catch (java.lang.Throwable unused) {
        }
        kVar2.V = this.G;
    }

    @Override // bi4.n0
    /* renamed from: onBackPressed */
    public void mo10629xbdc3c5dc() {
        al5.a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.mo2274xbdc3c5dc();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick() called with: v = ");
        sb6.append(view);
        sb6.append(' ');
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255598e, sb6.toString());
        android.view.View.OnClickListener onClickListener = this.f255596J;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null) {
            valueOf.intValue();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // bi4.b1
    public void r(float f17, float f18, float f19) {
    }

    @Override // bi4.n0
    public void v3(boolean z17) {
        qj4.s sVar = qj4.s.f445491a;
        if (z17) {
            qj4.s.m(sVar, this.f255600g, 72L, null, this.f255606p, 0L, 0L, 0L, 0L, null, null, 0L, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46383xd637ed7f, null);
        } else {
            qj4.s.m(sVar, this.f255600g, 71L, null, this.f255606p, 0L, 0L, 0L, 0L, null, null, 0L, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46383xd637ed7f, null);
        }
    }

    @Override // bi4.n0
    public void v5(boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.View view = this.f255605o;
        if (z17) {
            if (view == null || (layoutParams2 = view.getLayoutParams()) == null) {
                return;
            }
            layoutParams2.height = -2;
            return;
        }
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = 0;
        if (view == null) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }
}
