package s74;

/* loaded from: classes4.dex */
public abstract class o0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public static final s74.a D = new s74.a(null);
    public java.util.List A;
    public boolean B;
    public final jz5.g C;

    /* renamed from: o, reason: collision with root package name */
    public final int f485981o;

    /* renamed from: p, reason: collision with root package name */
    public final i64.b1 f485982p;

    /* renamed from: q, reason: collision with root package name */
    public final w64.l f485983q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 f485984r;

    /* renamed from: s, reason: collision with root package name */
    public final s74.p2 f485985s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r0 f485986t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f485987u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f485988v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f485989w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f485990x;

    /* renamed from: y, reason: collision with root package name */
    public s74.f3 f485991y;

    /* renamed from: z, reason: collision with root package name */
    public int f485992z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, int i17, i64.b1 mSnsAdStatistic, w64.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var, s74.p2 dependViews) {
        super(str, yVar, view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mSnsAdStatistic, "mSnsAdStatistic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dependViews, "dependViews");
        this.f485981o = i17;
        this.f485982p = mSnsAdStatistic;
        this.f485983q = lVar;
        this.f485984r = k4Var;
        this.f485985s = dependViews;
        int i18 = p3325xe03a0797.p3326xc267989b.r0.N0;
        this.f485986t = new s74.n0(p3325xe03a0797.p3326xc267989b.q0.f392100d, this);
        this.f485987u = jz5.h.b(new s74.p(this));
        this.C = jz5.h.b(s74.o.f485980d);
    }

    public static final void y(s74.o0 o0Var, s74.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        o0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.j(), "setOuterAreaClick " + o0Var.N());
        java.lang.Object e17 = o0Var.f485985s.e();
        s74.p0 p0Var = e17 instanceof s74.p0 ? (s74.p0) e17 : null;
        android.widget.LinearLayout linearLayout = p0Var != null ? p0Var.f250819o : null;
        if (o0Var.N()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageKeeperLayoutClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            s74.m0 m0Var = new s74.m0(o0Var);
            if (linearLayout != null) {
                linearLayout.setOnClickListener(m0Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageKeeperLayoutClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            android.view.View c17 = j3Var != null ? j3Var.c() : null;
            if (c17 != null) {
                c17.setDuplicateParentStateEnabled(true);
            }
            r5 = j3Var != null ? j3Var.c() : null;
            if (r5 != null) {
                r5.setClickable(false);
            }
        } else {
            if (linearLayout != null) {
                linearLayout.setOnClickListener(null);
            }
            if (linearLayout != null) {
                linearLayout.setClickable(false);
            }
            if (p0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                r5 = p0Var.D0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            }
            if (r5 != null) {
                r5.setDuplicateParentStateEnabled(false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4 A[Catch: all -> 0x0722, TRY_LEAVE, TryCatch #0 {all -> 0x0722, blocks: (B:3:0x0040, B:5:0x0052, B:8:0x0056, B:10:0x007b, B:12:0x0083, B:14:0x0087, B:17:0x0090, B:19:0x00a4), top: B:2:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.o0.A(com.tencent.mm.plugin.sns.storage.SnsInfo, boolean):void");
    }

    public final int B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContainerViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        int i17 = this.f485992z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContainerViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return i17;
    }

    public final s74.p2 C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDependViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDependViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return this.f485985s;
    }

    public final s74.f3 D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicViewCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.f3 f3Var = this.f485991y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicViewCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return f3Var;
    }

    public final android.content.Context E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.p2 p2Var = this.f485985s;
        p2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return p2Var.f486015c;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMMaskImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 c17972xe84284f4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) ((jz5.n) this.f485987u).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMMaskImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return c17972xe84284f4;
    }

    public final i64.b1 G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return this.f485982p;
    }

    public final int H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return this.f485981o;
    }

    public final android.view.View I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        android.view.View view = this.f485990x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return view;
    }

    public final java.util.List J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOtherAlphaAnimViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        java.util.List list = this.f485989w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOtherAlphaAnimViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return list;
    }

    public abstract void K(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226);

    public abstract void L(s74.f3 f3Var);

    public final void M(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetDynamicView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetComponentState ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) i();
        sb6.append(c17933xe8d1b226 != null ? c17933xe8d1b226.m70367x7525eefd() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        viewGroup.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetDynamicView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if ((r2 != null ? r2.i() : 0) < 101) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N() {
        /*
            r7 = this;
            java.lang.String r0 = "shouldOuterClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            int r2 = r7.f485981o
            r3 = 0
            if (r2 != 0) goto L35
            s74.f3 r2 = r7.f485991y
            r4 = 1
            if (r2 == 0) goto L23
            java.lang.String r5 = "isEnableOuterAreaClick"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r6)
            boolean r2 = r2.f485811l
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r6)
            if (r2 != r4) goto L23
            r2 = r4
            goto L24
        L23:
            r2 = r3
        L24:
            if (r2 != 0) goto L34
            s74.f3 r2 = r7.f485991y
            if (r2 == 0) goto L2f
            int r2 = r2.i()
            goto L30
        L2f:
            r2 = r3
        L30:
            r5 = 101(0x65, float:1.42E-43)
            if (r2 >= r5) goto L35
        L34:
            r3 = r4
        L35:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.o0.N():boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public /* bridge */ /* synthetic */ void d(java.lang.Object obj, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        A((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public boolean n(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentExist", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentExist", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentExist", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentExist", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSameContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 lastModel = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 currentModel = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSameContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastModel, "lastModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentModel, "currentModel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisableCompareDynamicXml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        jz5.g gVar = this.C;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisableCompareDynamicXml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        boolean z17 = false;
        boolean z18 = booleanValue || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(lastModel.m70354x74235b3e().f38169xb503b96a, currentModel.m70354x74235b3e().f38169xb503b96a) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(lastModel.m70354x74235b3e().f38166xb5002ead, currentModel.m70354x74235b3e().f38166xb5002ead));
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disableCompareDynamicXml is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisableCompareDynamicXml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        boolean booleanValue2 = ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisableCompareDynamicXml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        sb6.append(booleanValue2);
        sb6.append(", compareDynamicXmlResult is ");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lastModel.m70367x7525eefd(), currentModel.m70367x7525eefd()) && z18) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void s(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        super.s(snsInfo);
        p3325xe03a0797.p3326xc267989b.y0 h17 = h();
        if (h17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(h17, p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(this.f485986t), null, new s74.x(snsInfo, this, null), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    public final void z() {
        java.lang.Float f17;
        java.lang.Float f18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustRootMargin", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.f3 f3Var = this.f485991y;
        if (f3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootViewMarginTop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f17 = f3Var.f485812m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootViewMarginTop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        } else {
            f17 = null;
        }
        s74.p2 p2Var = this.f485985s;
        android.view.ViewGroup a17 = p2Var.a();
        android.widget.RelativeLayout relativeLayout = a17 instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) a17 : null;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        android.view.View view = p2Var.f486013a;
        if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = f17 != null ? (int) f17.floatValue() : a84.d0.a(10);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
            view.requestLayout();
        }
        s74.f3 f3Var2 = this.f485991y;
        if (f3Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootViewMarginBottom", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f18 = f3Var2.f485813n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootViewMarginBottom", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        } else {
            f18 = null;
        }
        android.view.ViewGroup a18 = p2Var.a();
        android.widget.RelativeLayout relativeLayout2 = a18 instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) a18 : null;
        android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout2 != null ? relativeLayout2.getLayoutParams() : null;
        if (layoutParams2 != null && (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = f18 != null ? (int) f18.floatValue() : a84.d0.a(2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
            view.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustRootMargin", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }
}
