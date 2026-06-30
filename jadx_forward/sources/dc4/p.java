package dc4;

/* loaded from: classes4.dex */
public final class p extends dc4.v {
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 A;
    public boolean B;
    public boolean C;
    public final z74.c D;
    public final dc4.n E;
    public s74.o2 F;
    public android.view.ViewGroup G;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f310330p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f310331q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f310332r;

    /* renamed from: s, reason: collision with root package name */
    public final i64.b1 f310333s;

    /* renamed from: t, reason: collision with root package name */
    public final android.app.Activity f310334t;

    /* renamed from: u, reason: collision with root package name */
    public final int f310335u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 f310336v;

    /* renamed from: w, reason: collision with root package name */
    public final rl5.r f310337w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f310338x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f310339y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f310340z;

    public p(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var, rl5.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mActivity, "mActivity");
        this.f310330p = c19807x593d1720;
        this.f310331q = c17933xe8d1b226;
        this.f310332r = iVar;
        this.f310333s = b1Var;
        this.f310334t = mActivity;
        this.f310335u = i17;
        this.f310336v = k4Var;
        this.f310337w = rVar;
        this.f310339y = jz5.h.b(new dc4.l(this));
        this.f310340z = jz5.h.b(new dc4.m(this));
        this.D = new dc4.o(this);
        this.E = new dc4.n(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2008, 6);
        this.f310338x = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (view2 != null) {
            view2.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310331q;
        this.f310365e = c17933xe8d1b226;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f310330p;
        this.f310364d = c19807x593d1720;
        if ((c19807x593d1720 != null ? c19807x593d1720.Id : null) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19807x593d1720 != null ? c19807x593d1720.Id : null);
        }
        android.view.ViewGroup viewGroup = this.G;
        android.app.Activity activity = this.f310334t;
        if (viewGroup == null) {
            this.G = (android.view.ViewGroup) com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571055cu1, (android.view.ViewGroup) null);
        }
        int m17 = m();
        jz5.g gVar = this.f310339y;
        i64.b1 b1Var = this.f310333s;
        if (m17 == 5 || m() == 15) {
            r45.jj4 o17 = o();
            if (o17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            l44.c0.b(this.f310365e, o17);
            this.C = s74.x2.g() && a84.p.c(this.f310365e);
            if (b1Var != null) {
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), o17.f459388d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
                java.lang.String R = ca4.z0.R(o17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSnsSightName(...)");
                if (com.p314xaae8f345.mm.vfs.w6.j(d17.concat(R))) {
                    b1Var.z(this.f310365e.f68891x29d1292e, (int) o17.R, true);
                    l44.c0.e();
                } else {
                    b1Var.z(this.f310365e.f68891x29d1292e, (int) o17.R, false);
                }
                b1Var.y(this.f310365e.f68891x29d1292e, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().v(this.f310365e) == 5, 1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807((android.content.Context) activity, true);
            this.A = c18390xafce807;
            c18390xafce807.x(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8072 = this.A;
            if (c18390xafce8072 != null) {
                c18390xafce8072.m70656x5981726b(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8073 = this.A;
            if (c18390xafce8073 != null) {
                c18390xafce8073.m70653xee64f44b(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            a84.y0.o(this.A, -1, -1);
            a84.y0.p(this.A, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) ((jz5.n) gVar).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            a84.y0.b(viewGroup2, this.A, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8074 = this.A;
            if (c18390xafce8074 != null) {
                c18390xafce8074.m71201x30fe4db(new dc4.j(this));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce8075 = this.A;
            if (c18390xafce8075 != null) {
                z74.e eVar = new z74.e(this.f310365e, c18390xafce8075, b1Var, 4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasEndCover", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                boolean z17 = this.C;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasEndCover", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoCallbackHelper", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
                    eVar.f552128f = this.E;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoCallbackHelper", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
                    z74.c cVar = this.D;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoCallbackListener", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
                    eVar.f552127e = cVar;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoCallbackListener", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
                }
                c18390xafce8075.m70655x360a109e(eVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9();
        this.f310368h = g9Var;
        g9Var.f249951h = this.G;
        g9Var.f249952i = p();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var2 = this.f310368h;
        java.lang.String m70363x51f8f990 = c17933xe8d1b226 != null ? c17933xe8d1b226.m70363x51f8f990() : null;
        if (m70363x51f8f990 == null) {
            m70363x51f8f990 = "";
        }
        g9Var2.a(c19807x593d1720, 0, m70363x51f8f990, c17933xe8d1b226 != null ? c17933xe8d1b226.m70377x3172ed() : false);
        if (this.F == null) {
            int j17 = s74.q4.f486046a.j(activity);
            p012xc85e97e9.p093xedfae76a.y yVar = activity instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) activity : null;
            android.view.View itemRootView = this.f310369i;
            int i17 = this.f310335u;
            if (b1Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            dc4.k kVar = new dc4.k(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var = this.f310336v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemRootView, "itemRootView");
            int f17 = j17 - (i65.a.f(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.i_) * 2);
            android.app.Activity activity2 = this.f310334t;
            android.view.ViewGroup viewGroup3 = this.f310338x;
            if (viewGroup3 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            android.view.ViewGroup viewGroup4 = this.G;
            if (viewGroup4 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) ((jz5.n) gVar).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            if (viewGroup5 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            this.F = new s74.o2("DynamicViewDetail", yVar, itemRootView, i17, b1Var, kVar, k4Var, new s74.p2(itemRootView, f17, activity2, viewGroup3, viewGroup4, viewGroup5, this, this.f310332r, this.f310337w, -1));
        }
        s74.o2 o2Var = this.F;
        if (o2Var != null) {
            boolean z18 = this.f310372o;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            o2Var.B = z18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        s74.o2 o2Var2 = this.F;
        if (o2Var2 != null) {
            o2Var2.f(c17933xe8d1b226);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        super.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDynamicViewDetailItem", "onPause");
        if (this.F != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310331q;
        if (uVar.a(c17933xe8d1b226)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDynamicViewDetailItem", "pause pausePlayerStream");
            s74.o2 o2Var = this.F;
            if (o2Var != null && (R = o2Var.R()) != null) {
                R.g();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            return;
        }
        if (this.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDynamicViewDetailItem", "pausePlay");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 c18390xafce807 = this.A;
            if (c18390xafce807 != null) {
                c18390xafce807.F();
            }
            i64.b1 b1Var = this.f310333s;
            if (b1Var != null) {
                b1Var.q(c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
    }

    @Override // dc4.v
    public void i() {
        s74.o2 o2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        super.i();
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(this.f310331q) && (o2Var = this.F) != null && (R = o2Var.R()) != null) {
            R.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007c  */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.p.j():void");
    }

    public final s74.o2 l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAdComponent", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        s74.o2 o2Var = this.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAdComponent", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return o2Var;
    }

    public final int m() {
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMContentStyle", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f310330p;
        int i17 = (c19807x593d1720 == null || (a90Var = c19807x593d1720.f39014x86965dde) == null) ? 0 : a90Var.f451370e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMContentStyle", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return i17;
    }

    public final android.view.ViewGroup n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMMainContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        android.view.ViewGroup viewGroup = this.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMMainContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return viewGroup;
    }

    public final r45.jj4 o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        r45.jj4 jj4Var = null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f310330p;
        if ((c19807x593d1720 != null ? c19807x593d1720.f39014x86965dde : null) != null && c19807x593d1720.f39014x86965dde.f451373h.size() >= 1) {
            jj4Var = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return jj4Var;
    }

    public final android.widget.ImageView p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f310340z).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return imageView;
    }
}
