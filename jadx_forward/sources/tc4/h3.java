package tc4;

/* loaded from: classes4.dex */
public final class h3 extends tc4.k2 {

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f498890x1;

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f498891y1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f498892z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f498891y1 = jz5.h.b(new tc4.f3(this));
        this.f498892z1 = jz5.h.b(new tc4.g3(this));
    }

    /* renamed from: getTingCategoryRoot */
    private final android.view.View m166183xe0261c84() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTingCategoryRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.f498891y1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTingCategoryRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return view;
    }

    /* renamed from: getTingCategoryView */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1 m166184xe027d647() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTingCategoryView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1 c18736x613b2f1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1) ((jz5.n) this.f498892z1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTingCategoryView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return c18736x613b2f1;
    }

    @Override // tc4.d2
    public boolean B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "loadCustomItemInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r10 instanceof tc4.d3
            if (r2 == 0) goto L1b
            r2 = r10
            tc4.d3 r2 = (tc4.d3) r2
            int r3 = r2.f498849g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f498849g = r3
            goto L20
        L1b:
            tc4.d3 r2 = new tc4.d3
            r2.<init>(r9, r10)
        L20:
            java.lang.Object r10 = r2.f498847e
            pz5.a r3 = pz5.a.f440719d
            int r4 = r2.f498849g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f498846d
            com.tencent.mm.plugin.ting.widget.TingCategoryView r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L95
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r10
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            zc4.b r10 = r9.m166188xfb7e5820()
            if (r10 == 0) goto L9b
            xc4.p r10 = r10.n()
            if (r10 != 0) goto L4e
            goto L9b
        L4e:
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r10.h1()
            r45.a90 r4 = r10.f39014x86965dde
            if (r4 != 0) goto L5c
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r10
        L5c:
            r45.km6 r4 = r4.A
            if (r4 == 0) goto L95
            java.lang.String r4 = r4.f460372e
            bw5.o50 r4 = il4.d.v(r4)
            android.content.Context r6 = r9.getContext()
            java.lang.String r7 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)
            java.lang.String r10 = m21.v.b(r10)
            r45.lm6 r10 = il4.d.c(r6, r4, r10)
            com.tencent.mm.plugin.ting.widget.TingCategoryView r4 = r9.m166184xe027d647()
            if (r4 == 0) goto L95
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            tc4.e3 r7 = new tc4.e3
            r8 = 0
            r7.<init>(r4, r10, r8)
            r2.f498846d = r4
            r2.f498849g = r5
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r6, r7, r2)
            if (r10 != r3) goto L95
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L95:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r10
        L9b:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.h3.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    /* renamed from: getViewType */
    public int mo166166xc321a0f5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return 40;
    }

    @Override // uc4.f1, tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        uc4.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        java.util.Iterator it = uc4.f1.J(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (uc4.g) it.next();
            if (gVar instanceof uc4.u0) {
                break;
            }
        }
        if (gVar == null) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            uc4.u0 u0Var = new uc4.u0(context);
            uc4.g.l(u0Var, m166183xe0261c84(), false, true, false, 10, null);
            m167831x70c5fbc5().add(u0Var);
        }
        java.lang.Object h17 = super.h(s0Var, bVar, i17, z17, interfaceC29045xdcb5ca57);
        if (h17 == pz5.a.f440719d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
            return h17;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return f0Var;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csm, (android.view.ViewGroup) this, false);
        this.f498890x1 = inflate;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        layoutParams.f92441s = 0;
        jz5.l lVar = new jz5.l(inflate, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    /* renamed from: name */
    public java.lang.String mo70844x337a8b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return "MusicTingCategoryImproveTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        super.o();
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1 m166184xe027d647 = m166184xe027d647();
        if (m166184xe027d647 != null) {
            m166184xe027d647.m72281xefe20a96(m166184xe027d647.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
    }
}
