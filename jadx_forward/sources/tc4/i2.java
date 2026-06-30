package tc4;

/* loaded from: classes4.dex */
public abstract class i2 extends tc4.x1 implements tc4.s0 {
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 V;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18125x2cef37d8 W;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f498899l1;

    /* renamed from: p0, reason: collision with root package name */
    public zc4.b f498900p0;

    /* renamed from: x0, reason: collision with root package name */
    public in5.s0 f498901x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f498902y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void A() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCheckEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.u.f250533d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLARGE_RIGHT_PANEL_LAYOUT_WIDTH", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLARGE_RIGHT_PANEL_LAYOUT_WIDTH$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            jz5.g gVar = tc4.x1.Q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLARGE_RIGHT_PANEL_LAYOUT_WIDTH$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            i17 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLARGE_RIGHT_PANEL_LAYOUT_WIDTH", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            i17 = -1;
        }
        android.view.ViewGroup.LayoutParams layoutParams = m166231xd8ac8208().getLayoutParams();
        layoutParams.width = i17;
        m166231xd8ac8208().setLayoutParams(layoutParams);
        android.view.ViewGroup m166217xda5977e = m166217xda5977e();
        if (m166217xda5977e != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = m166217xda5977e.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutParams2, "getLayoutParams(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            layoutParams2.width = z17 ? -2 : -1;
            if (layoutParams2 instanceof android.widget.LinearLayout.LayoutParams) {
                if (z17) {
                    ((android.widget.LinearLayout.LayoutParams) layoutParams2).gravity = 1;
                } else {
                    ((android.widget.LinearLayout.LayoutParams) layoutParams2).gravity = 0;
                }
            } else if (layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams) {
                if (z17) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams2).addRule(14);
                } else {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams2).removeRule(14);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.TimelineItemBuild", "updateContentLayoutParams: enableLargeUI=" + z17 + ',');
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            m166217xda5977e.setLayoutParams(layoutParams2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCheckEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    @Override // tc4.s0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        android.view.View m166221xa1994ee3 = m166221xa1994ee3();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m166221xa1994ee3, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m166221xa1994ee3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m166221xa1994ee3, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    @Override // tc4.s0
    public void b() {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f498900p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        android.widget.TextView m166230x8e783193 = m166230x8e783193();
        if (m166230x8e783193 != null) {
            m166230x8e783193.setText(n17.f1());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = ld4.a.f399640c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z17) {
            m166219x7f7cac57().setText(y() + " - " + n17.U0() + " - " + n17.a1());
            if (mo166166xc321a0f5() == 38) {
                r45.jj4 R0 = n17.R0();
                if (R0 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
                    return;
                }
                m166219x7f7cac57().append("\n");
                m166219x7f7cac57().append("media:" + R0.f459388d);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    @Override // tc4.s0
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewRecycleInMain", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewRecycleInMain", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:256:0x06fd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0b21  */
    @Override // tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(in5.s0 r57, zc4.b r58, int r59) {
        /*
            Method dump skipped, instructions count: 3756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i2.f(in5.s0, zc4.b, int):boolean");
    }

    public java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        xc4.p n17;
        xc4.p n18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        x("MicroMsg.Improve.TimelineItemMeasure", "[" + hashCode() + "] onViewRecycled");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18262x7fa5e8f8 m166226x51da2776 = m166226x51da2776();
        zc4.b bVar = this.f498900p0;
        m166226x51da2776.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader");
        if (m166226x51da2776.getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18249xbd6bf5ee c18249xbd6bf5ee = m166226x51da2776.f250629d;
            c18249xbd6bf5ee.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
            android.content.Context context = c18249xbd6bf5ee.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8 c18250x12aff9a8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8.class);
            c18250x12aff9a8.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeObserver", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            c18250x12aff9a8.f250549i.remove(c18249xbd6bf5ee);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeObserver", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
            rc4.e eVar = rc4.e.f475669a;
            long y07 = (bVar == null || (n17 = bVar.n()) == null) ? -1L : n17.y0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("detachFeedId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            rc4.e.f475678j.remove(java.lang.Long.valueOf(y07));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("detachFeedId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader");
        }
        m166225x4f03fa84().k(this.f498900p0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 c18270xf7becf64 = this.V;
        if (c18270xf7becf64 != null) {
            c18270xf7becf64.mo71016x6761d4f();
        }
        zc4.b bVar2 = this.f498900p0;
        ad4.l.b((bVar2 == null || (n18 = bVar2.n()) == null) ? null : n18.a1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return f0Var;
    }

    /* renamed from: getCommentView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 m166186x57389c6e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 c18270xf7becf64 = this.V;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return c18270xf7becf64;
    }

    /* renamed from: getContentTranslateResultText */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18125x2cef37d8 m166187xd846a195() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18125x2cef37d8 c18125x2cef37d8 = this.W;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return c18125x2cef37d8;
    }

    /* renamed from: getData */
    public final zc4.b m166188xfb7e5820() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f498900p0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return bVar;
    }

    /* renamed from: getHolder */
    public final in5.s0 m166189x1cddf0a2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        in5.s0 s0Var = this.f498901x0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return s0Var;
    }

    @Override // tc4.s0
    /* renamed from: getImproveListItem */
    public zc4.b mo70841xad4bb233() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImproveListItem", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f498900p0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImproveListItem", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return bVar;
    }

    /* renamed from: getSnsPosition */
    public final int m166190x7f4c098b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        int i17 = this.f498902y0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return i17;
    }

    public final void n() {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkRefreshSpringUIStyle", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f498900p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkRefreshSpringUIStyle", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        ca4.e1 e1Var = ca4.f1.f121430a;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.graphics.drawable.Drawable l17 = e1Var.l(context, n17.h1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceCommentIcon", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        m166215x8f2580b2().setImageDrawable(l17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceCommentIcon", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 c18270xf7becf64 = this.V;
        if (c18270xf7becf64 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("containerView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
            android.view.View findViewById = c18270xf7becf64.findViewById(com.p314xaae8f345.mm.R.id.f566866r33);
            r5 = findViewById instanceof android.view.View ? findViewById : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("containerView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        }
        if (this.f498899l1) {
            if (r5 != null) {
                r5.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.a5c));
            }
        } else if (pc4.d.f434943a.x()) {
            if (r5 != null) {
                r5.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.d4x));
            }
        } else if (r5 != null) {
            r5.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.adw));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m166220xc8e2c8bc().findViewById(com.p314xaae8f345.mm.R.id.f564377pi);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(i65.a.d(getContext(), e1Var.n(n17.h1())));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m166224x8af4d5e0().findViewById(com.p314xaae8f345.mm.R.id.f564385pt);
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(i65.a.d(getContext(), e1Var.p(n17.h1())));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m166233xbb8c5faf().findViewById(com.p314xaae8f345.mm.R.id.r_);
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.m82040x7541828(i65.a.d(getContext(), e1Var.t(n17.h1())));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkRefreshSpringUIStyle", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        super.onConfigurationChanged(configuration);
        A();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final boolean p(zc4.b item) {
        xc4.p n17;
        xc4.p n18;
        xc4.p n19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isItemChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String a17 = item.n().a1();
        zc4.b bVar = this.f498900p0;
        java.lang.String str = null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, (bVar == null || (n19 = bVar.n()) == null) ? null : n19.a1())) {
            java.lang.String a18 = item.n().a1();
            zc4.b bVar2 = this.f498900p0;
            if (bVar2 != null && (n17 = bVar2.n()) != null) {
                str = n17.a1();
            }
            boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a18, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isItemChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return z17;
        }
        zc4.b bVar3 = this.f498900p0;
        boolean z18 = false;
        if (bVar3 != null && (n18 = bVar3.n()) != null && item.n().m125473x3fdd41df() == n18.m125473x3fdd41df()) {
            z18 = true;
        }
        boolean z19 = !z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isItemChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return z19;
    }

    public void q() {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f498900p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        sd4.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.AbstractActivityC18370x899ce1db.f251462s;
        cVar.a(mo70844x337a8b(), "layoutCommentView");
        int b17 = n17.T0().b();
        int size = n17.m175342x57341267().size();
        x("MicroMsg.Improve.TimelineItemMeasure", "like size:" + b17 + " comment size:" + size);
        if (b17 > 0 || size > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            if (this.V == null) {
                nd4.e eVar = nd4.e.f418009a;
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                this.V = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64) eVar.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64.class, context);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
                tc4.n1 n1Var = tc4.x1.G;
                layoutParams.setMargins(0, n1Var.g(), 0, n1Var.b());
                m166214xa632a058().addView(this.V, layoutParams);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 c18270xf7becf64 = this.V;
            if (c18270xf7becf64 != null) {
                c18270xf7becf64.m71020x989b9007(n17);
            }
        } else {
            nd4.e.f418009a.b(this.V);
            this.V = null;
        }
        cVar.b(mo70844x337a8b());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public void r() {
        xc4.p n17;
        java.lang.Boolean bool;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f498900p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        boolean z17 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Bi() || !(n17.J0() != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17.J0(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574651j33)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShowAppName", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (n17.K1 == null) {
            n17.o1();
        }
        java.lang.Boolean bool2 = n17.K1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowAppName", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, bool3) && mo166166xc321a0f5() != 22 && z17) {
            if (m166212x741f2de4() instanceof android.view.ViewStub) {
                bool = bool3;
                str = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo";
                android.widget.TextView l17 = tc4.x1.l(this, false, com.p314xaae8f345.mm.R.C30859x5a72f63.f561048a62, com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4, true, 0, 0, null, 112, null);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMargins(0, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3), 0, 0);
                android.view.View m166212x741f2de4 = m166212x741f2de4();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m166212x741f2de4, "null cannot be cast to non-null type android.view.ViewStub");
                pd4.d.a((android.view.ViewStub) m166212x741f2de4, l17, layoutParams);
                m166239xa84a158(l17);
            } else {
                bool = bool3;
                str = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo";
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = n17.h1();
            java.lang.CharSequence J0 = n17.J0();
            if (J0 == null) {
                J0 = "";
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(J0);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni());
            lVarArr[1] = new jz5.l("sns_objecttype", java.lang.Integer.valueOf(n17.h1().f39014x86965dde.f451370e));
            lVarArr[2] = new jz5.l("username_sns", n17.m125483x6bf53a6c());
            lVarArr[3] = new jz5.l("publishid_sns", n17.a1());
            lVarArr[4] = new jz5.l("sns_scene", 1);
            int i17 = h17.f39029x81aacdfc;
            lVarArr[5] = new jz5.l("sns_feed_source", java.lang.Integer.valueOf(i17 != 2 ? i17 == 1 ? 3 : 0 : 2));
            java.util.Map k17 = kz5.c1.k(lVarArr);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(m166212x741f2de4(), "sns_feed_tail");
            aVar.gk(m166212x741f2de4(), k17);
            aVar.ik(m166212x741f2de4(), 40, 33050);
            spannableString.setSpan(new tc4.e2(n17, this), 0, spannableString.length(), 33);
            android.view.View m166212x741f2de42 = m166212x741f2de4();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m166212x741f2de42, "null cannot be cast to non-null type android.widget.TextView");
            android.widget.TextView textView = (android.widget.TextView) m166212x741f2de42;
            textView.setClickable(true);
            java.lang.String str2 = str;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppTailClickable", str2);
            if (n17.L1 == null) {
                n17.o1();
            }
            java.lang.Boolean bool4 = n17.L1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppTailClickable", str2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool4, bool) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx7fa037cc7dfabad5", h17.f39012x33e0f24f.f472379d)) {
                textView.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f561048a62));
                m166212x741f2de4().setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p5());
            } else {
                textView.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a5w));
                m166212x741f2de4().setOnTouchListener(null);
            }
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textView.setText(spannableString, android.widget.TextView.BufferType.SPANNABLE);
            textView.setContentDescription(spannableString);
            android.view.View m166212x741f2de43 = m166212x741f2de4();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m166212x741f2de43, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166212x741f2de43.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m166212x741f2de43, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (!(m166212x741f2de4() instanceof android.view.ViewStub)) {
            android.view.View m166212x741f2de44 = m166212x741f2de4();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m166212x741f2de44, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166212x741f2de44.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m166212x741f2de44, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x071b, code lost:
    
        if (r8 == 0) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s() {
        /*
            Method dump skipped, instructions count: 3134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i2.s():void");
    }

    /* renamed from: setCommentView */
    public final void m166191xed9e0fe2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 c18270xf7becf64) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.V = c18270xf7becf64;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: setContentTranslateResultText */
    public final void m166192xc80557a1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18125x2cef37d8 c18125x2cef37d8) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.W = c18125x2cef37d8;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: setData */
    public final void m166193x76491f2c(zc4.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f498900p0 = bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: setHolder */
    public final void m166194x101324ae(in5.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f498901x0 = s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: setSnsPosition */
    public final void m166195x15b17cff(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f498902y0 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: setSpringVisible */
    public final void m166196x52ccb063(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSpringVisible", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f498899l1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSpringVisible", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i2.t():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i2.u():void");
    }

    public final void v() {
        xc4.p n17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadStarView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f498900p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadStarView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isStar", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean z17 = n17.d1().f38980x988ba8e == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStar", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (z17 && n17.l1() && cc4.b.f122015a.a()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = n17.h1();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (xa4.g.f534363d.y(h17)) {
                xa4.g.t();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.af9;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNormalLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNormalLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c;
            }
            if (m166233xbb8c5faf() instanceof android.view.ViewStub) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
                c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f81099xac84f24, i17);
                c22699x3dcdb352.setId(com.p314xaae8f345.mm.R.id.r_);
                int h18 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(h18, h18);
                layoutParams.setMargins(i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8), 0, 0, 0);
                android.view.View m166233xbb8c5faf = m166233xbb8c5faf();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m166233xbb8c5faf, "null cannot be cast to non-null type android.view.ViewStub");
                pd4.d.a((android.view.ViewStub) m166233xbb8c5faf, c22699x3dcdb352, layoutParams);
                m166248xf1d55abb(c22699x3dcdb352);
            }
            android.view.View m166233xbb8c5faf2 = m166233xbb8c5faf();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m166233xbb8c5faf2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadStarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166233xbb8c5faf2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m166233xbb8c5faf2, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadStarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166233xbb8c5faf().setTag(n17.W0());
        } else {
            android.view.View m166233xbb8c5faf3 = m166233xbb8c5faf();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m166233xbb8c5faf3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadStarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166233xbb8c5faf3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m166233xbb8c5faf3, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadStarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadStarView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void w(java.lang.String tag, java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logE", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, "[" + id4.t.f372482a.a(this.f498900p0) + '-' + hashCode() + ']' + msg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logE", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void x(java.lang.String tag, java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[" + id4.t.f372482a.a(this.f498900p0) + '-' + hashCode() + ']' + msg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final int y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("position", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        in5.s0 s0Var = this.f498901x0;
        int m8183xf806b362 = s0Var != null ? s0Var.m8183xf806b362() : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("position", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return m8183xf806b362;
    }

    public final void z(android.widget.TextView textView, int i17, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWithContent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        textView.setVisibility(0);
        if (i17 != 0) {
            charSequence = getContext().getString(i17, charSequence);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, charSequence, textSize), android.widget.TextView.BufferType.SPANNABLE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWithContent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }
}
