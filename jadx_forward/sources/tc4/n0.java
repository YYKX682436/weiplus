package tc4;

/* loaded from: classes4.dex */
public final class n0 extends tc4.v0 implements xd4.d {
    public static final /* synthetic */ int N1 = 0;
    public final jz5.g A1;
    public final jz5.g B1;
    public final java.util.HashMap C1;
    public final jz5.g D1;
    public final jz5.g E1;
    public boolean F1;
    public boolean G1;
    public long H1;
    public long I1;
    public long J1;
    public long K1;
    public zy2.g5 L1;
    public p3325xe03a0797.p3326xc267989b.r2 M1;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View f498945y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f498946z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.A1 = jz5.h.b(new tc4.k0(this));
        this.B1 = jz5.h.b(new tc4.f0(this));
        this.C1 = new java.util.HashMap();
        this.D1 = jz5.h.b(new tc4.l0(this));
        this.E1 = jz5.h.b(new tc4.e0(this));
        this.H1 = c01.id.c();
    }

    public static final /* synthetic */ android.view.View T(tc4.n0 n0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getFinderMediaLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View view = n0Var.f498946z1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getFinderMediaLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    public static final /* synthetic */ android.view.View U(tc4.n0 n0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMemberWaterMark", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View m166204xb4b390d4 = n0Var.m166204xb4b390d4();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMemberWaterMark", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return m166204xb4b390d4;
    }

    public static final /* synthetic */ zy2.g5 V(tc4.n0 n0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        zy2.g5 g5Var = n0Var.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return g5Var;
    }

    public static final /* synthetic */ java.lang.String W(tc4.n0 n0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPublishId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        java.lang.String m166205x55b30fd4 = n0Var.m166205x55b30fd4();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPublishId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return m166205x55b30fd4;
    }

    public static final /* synthetic */ android.widget.ImageView X(tc4.n0 n0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.ImageView m166206xd93f5383 = n0Var.m166206xd93f5383();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return m166206xd93f5383;
    }

    public static final /* synthetic */ android.widget.FrameLayout Y(tc4.n0 n0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoPlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.FrameLayout m166207x7e27f91b = n0Var.m166207x7e27f91b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoPlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return m166207x7e27f91b;
    }

    public static final /* synthetic */ void Z(tc4.n0 n0Var, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        n0Var.J1 = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    public static final void a0(tc4.n0 n0Var) {
        android.view.View m166203xcc04d8cb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$showLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        n0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.FrameLayout m166207x7e27f91b = n0Var.m166207x7e27f91b();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(m166207x7e27f91b != null ? java.lang.Float.valueOf(m166207x7e27f91b.getAlpha()) : null, 1.0f) && (m166203xcc04d8cb = n0Var.m166203xcc04d8cb()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m166203xcc04d8cb, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166203xcc04d8cb.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m166203xcc04d8cb, "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$showLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    /* renamed from: getFinderMedia */
    private final r45.iv2 m166202x4e3c7628() {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return null;
        }
        r45.kv2 kv2Var = n17.h1().f39014x86965dde.f451377o;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(kv2Var.m75941xfb821914(7))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return null;
        }
        r45.iv2 iv2Var = (r45.iv2) kv2Var.m75941xfb821914(7).get(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return iv2Var;
    }

    /* renamed from: getLoadingView */
    private final android.view.View m166203xcc04d8cb() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLoadingView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.E1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLoadingView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    /* renamed from: getMemberWaterMark */
    private final android.view.View m166204xb4b390d4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMemberWaterMark", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.B1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMemberWaterMark", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    /* renamed from: getPublishId */
    private final java.lang.String m166205x55b30fd4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPublishId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("new_feed_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPublishId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return stringExtra;
    }

    /* renamed from: getThumbImg */
    private final android.widget.ImageView m166206xd93f5383() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.A1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return imageView;
    }

    /* renamed from: getVideoPlayerContainer */
    private final android.widget.FrameLayout m166207x7e27f91b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.D1).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return frameLayout;
    }

    @Override // tc4.d2
    public java.lang.Object E(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new tc4.d0(this, null), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return g17;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View view = this.f498946z1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    public final void b0(android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        r45.iv2 m166202x4e3c7628 = m166202x4e3c7628();
        if (m166202x4e3c7628 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        android.util.Pair k17 = m21.y.k((int) m166202x4e3c7628.m75938x746dc8a6(3), (int) m166202x4e3c7628.m75938x746dc8a6(4), getContext(), false);
        java.lang.Object first = k17.first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
        layoutParams.width = ((java.lang.Number) first).intValue();
        java.lang.Object second = k17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
        layoutParams.height = ((java.lang.Number) second).intValue();
        x("MicroMsg.Improve.FinderMediaTimelineItem", "calculateParamSize width:" + layoutParams.width + " height:" + layoutParams.height);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
        boolean z17 = false;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209541we).mo141623x754a37bb()).r()).intValue() == 1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        r45.kv2 kv2Var = n17.h1().f39014x86965dde.f451377o;
        if ((kv2Var.m75939xb282bd08(25) & 4) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.M1;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            x("MicroMsg.Improve.FinderMediaTimelineItem", "play 1#1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        xd4.o0.d().j();
        xd4.g.a().d(this);
        this.M1 = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new tc4.j0(this, kv2Var, null), 3, null);
        x("MicroMsg.Improve.FinderMediaTimelineItem", "play 4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    public final void c0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View m166203xcc04d8cb = m166203xcc04d8cb();
        if (m166203xcc04d8cb != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m166203xcc04d8cb, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem", "dismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166203xcc04d8cb.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m166203xcc04d8cb, "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem", "dismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    public final void d0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        x("MicroMsg.Improve.FinderMediaTimelineItem", "stopPlay " + this.L1);
        if (this.K1 != 0) {
            this.J1 += c01.id.c() - this.K1;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.M1;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        java.lang.Object obj = this.L1;
        java.lang.Object obj2 = obj instanceof zy2.p7 ? (zy2.p7) obj : null;
        if (obj2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15172xcfc1ad85) obj2).p0("errorToStop");
        }
        java.lang.Object obj3 = this.L1;
        android.view.View view = obj3 instanceof android.view.View ? (android.view.View) obj3 : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            x("MicroMsg.Improve.FinderMediaTimelineItem", "stopPlay removeView " + this.L1);
            android.widget.FrameLayout m166207x7e27f91b = m166207x7e27f91b();
            if (m166207x7e27f91b != null) {
                m166207x7e27f91b.removeView(view);
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parent, m166207x7e27f91b()) || parent == null) {
                zy2.g5 g5Var = this.L1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("asyncReleasePlayer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                pm0.v.O("MicroMsg.Improve.FinderMediaTimelineItem", new tc4.b0(g5Var, this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("asyncReleasePlayer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            }
        }
        zy2.g5 g5Var2 = this.L1;
        zy2.p7 p7Var = g5Var2 instanceof zy2.p7 ? (zy2.p7) g5Var2 : null;
        if (p7Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de) p7Var).q0();
        }
        this.L1 = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.M1;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        this.G1 = false;
        this.K1 = 0L;
        c0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        x("MicroMsg.Improve.FinderMediaTimelineItem", "onUIPause " + this.L1);
        java.lang.Object obj = this.L1;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view != null ? view.getParent() : null, m166207x7e27f91b())) {
            zy2.g5 g5Var = this.L1;
            zy2.p7 p7Var = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
            boolean z17 = false;
            if (p7Var != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de) p7Var).isFluentView) {
                z17 = true;
            }
            if (!z17) {
                d0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                return;
            }
        }
        x("MicroMsg.Improve.FinderMediaTimelineItem", "onUIPause " + this.L1 + " return for detach.");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.FrameLayout m166207x7e27f91b = m166207x7e27f91b();
        if (m166207x7e27f91b == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return null;
        }
        int[] iArr = new int[2];
        m166207x7e27f91b.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, m166207x7e27f91b.getMeasuredWidth() + i17, m166207x7e27f91b.getMeasuredHeight() + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return rect;
    }

    @Override // tc4.x1
    /* renamed from: getViewType */
    public int mo166166xc321a0f5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return 18;
    }

    @Override // tc4.v0, uc4.f1, tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        uc4.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        java.util.Iterator it = uc4.f1.J(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (uc4.g) it.next();
            if (gVar instanceof uc4.g0) {
                break;
            }
        }
        if (gVar == null) {
            java.util.ArrayList<uc4.g> m167831x70c5fbc5 = m167831x70c5fbc5();
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            uc4.g0 g0Var = new uc4.g0(context, new tc4.g0(this));
            uc4.g.l(g0Var, this.f498946z1, false, true, false, 10, null);
            m167831x70c5fbc5.add(g0Var);
        }
        java.lang.Object h17 = super.h(s0Var, bVar, i17, z17, interfaceC29045xdcb5ca57);
        if (h17 == pz5.a.f440719d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return h17;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return f0Var;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.crp, (android.view.ViewGroup) this, false);
        this.f498945y1 = inflate;
        this.f498946z1 = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.n8j) : null;
        android.view.View view = this.f498945y1;
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.cks) : null;
        if (findViewById != null) {
            findViewById.setTag("KEY_INTENT_COVER_CONTAINER_TAG");
        }
        if (pc4.d.f434943a.x()) {
            android.view.View view2 = this.f498946z1;
            android.widget.ImageView imageView = view2 != null ? (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.n8n) : null;
            float b17 = i65.a.b(getContext(), 2);
            if (imageView != null) {
                imageView.setOutlineProvider(new zl5.a(true, true, b17));
            }
            if (imageView != null) {
                imageView.setClipToOutline(true);
            }
        }
        android.util.Pair j17 = m21.y.j(getContext());
        java.lang.Object first = j17.first;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
        int intValue = ((java.lang.Number) first).intValue();
        java.lang.Object second = j17.second;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(intValue, ((java.lang.Number) second).intValue());
        b0(layoutParams);
        android.view.View view3 = this.f498945y1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        jz5.l lVar = new jz5.l(view3, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    /* renamed from: name */
    public java.lang.String mo70844x337a8b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return "FinderImproveMediaTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        super.o();
        android.view.View view = this.f498945y1;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        b0(layoutParams);
        android.view.View view2 = this.f498945y1;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        android.widget.ImageView m166206xd93f5383 = m166206xd93f5383();
        if (m166206xd93f5383 != null) {
            m166206xd93f5383.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        x("MicroMsg.Improve.FinderMediaTimelineItem", "pause " + this.L1);
        d0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        x("MicroMsg.Improve.FinderMediaTimelineItem", "stop " + this.L1);
        d0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }
}
