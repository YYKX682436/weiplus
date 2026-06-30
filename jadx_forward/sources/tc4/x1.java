package tc4;

/* loaded from: classes4.dex */
public abstract class x1 extends android.widget.LinearLayout {
    public static final tc4.n1 G = new tc4.n1(null);
    public static final jz5.g H = jz5.h.b(tc4.y0.f499067d);
    public static final jz5.g I = jz5.h.b(tc4.a1.f498805d);

    /* renamed from: J, reason: collision with root package name */
    public static final jz5.g f499042J = jz5.h.b(tc4.m1.f498942d);
    public static final jz5.g K;
    public static final jz5.g L;
    public static final jz5.g M;
    public static final jz5.g N;
    public static final jz5.g P;
    public static final jz5.g Q;
    public static final jz5.g R;
    public static final jz5.g S;
    public static final jz5.g T;
    public static final jz5.g U;
    public android.view.View A;
    public android.view.View B;
    public android.widget.LinearLayout C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18262x7fa5e8f8 D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 E;
    public final android.view.View F;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f499043d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f499044e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f499045f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f499046g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f499047h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f499048i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f499049m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f499050n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f499051o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f499052p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f499053q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f499054r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f499055s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f499056t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f499057u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f499058v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f499059w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f499060x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f499061y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f499062z;

    static {
        jz5.h.b(tc4.l1.f498929d);
        K = jz5.h.b(tc4.b1.f498824d);
        L = jz5.h.b(tc4.f1.f498862d);
        M = jz5.h.b(tc4.k1.f498924d);
        N = jz5.h.b(tc4.g1.f498872d);
        jz5.h.b(tc4.h1.f498886d);
        P = jz5.h.b(tc4.c1.f498834d);
        Q = jz5.h.b(tc4.e1.f498855d);
        R = jz5.h.b(tc4.i1.f498898d);
        S = jz5.h.b(tc4.d1.f498845d);
        T = jz5.h.b(tc4.z0.f499075d);
        U = jz5.h.b(tc4.j1.f498913d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x1(android.content.Context context) {
        super(context);
        int i17;
        java.lang.String str;
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f499043d = (p012xc85e97e9.p093xedfae76a.y) context;
        this.f499045f = jz5.h.b(new tc4.o1(context));
        this.f499046g = jz5.h.b(new tc4.v1(context));
        this.f499047h = jz5.h.b(new tc4.u1(context));
        this.f499048i = jz5.h.b(new tc4.r1(context));
        this.f499049m = jz5.h.b(new tc4.t1(context, this));
        this.f499050n = jz5.h.b(new tc4.w1(context));
        this.f499051o = jz5.h.b(new tc4.s1(context));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.f499052p = linearLayout;
        this.f499054r = jz5.h.b(new tc4.q1(context));
        this.f499055s = new android.view.ViewStub(context);
        this.f499056t = new android.view.ViewStub(context);
        this.f499057u = new android.view.ViewStub(context);
        this.f499058v = new android.view.ViewStub(context);
        this.f499059w = new android.view.ViewStub(context);
        this.f499060x = new android.view.ViewStub(context);
        this.f499061y = new android.view.ViewStub(context);
        this.f499062z = new android.view.ViewStub(context);
        this.A = new android.view.ViewStub(context);
        this.B = new android.view.ViewStub(context);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setId(com.p314xaae8f345.mm.R.id.f568564n94);
        this.C = linearLayout2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18262x7fa5e8f8 c18262x7fa5e8f8 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18262x7fa5e8f8(context);
        this.D = c18262x7fa5e8f8;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc06 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06(context);
        this.E = c18258x7ccfbc06;
        android.view.View view = new android.view.View(context);
        this.F = view;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupSelfAttribute", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        setId(com.p314xaae8f345.mm.R.id.n9a);
        setOrientation(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParent_Layout_Padding_Top", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getParent_Layout_Padding_Top$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.g gVar = R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getParent_Layout_Padding_Top$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParent_Layout_Padding_Top", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        setPadding(0, intValue, 0, 0);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupSelfAttribute", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildItemView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildHeaderLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.l lVar = new jz5.l(c18262x7fa5e8f8, new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildHeaderLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        j(this, lVar, null, 2, null);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(getContext());
        linearLayout3.setClipChildren(false);
        linearLayout3.setClipToPadding(false);
        this.f499044e = linearLayout3;
        linearLayout3.setId(com.p314xaae8f345.mm.R.id.f568565n95);
        linearLayout3.setOrientation(0);
        tc4.n1 n1Var = G;
        linearLayout3.setPadding(n1Var.c(), 0, n1Var.c(), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildAvatar", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        m166213xf04b2e4c().setId(com.p314xaae8f345.mm.R.id.f564339od);
        m166213xf04b2e4c().setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf m166213xf04b2e4c = m166213xf04b2e4c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAvatar_Description$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.g gVar2 = H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAvatar_Description$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        java.lang.CharSequence charSequence = (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        m166213xf04b2e4c.setContentDescription(charSequence);
        m166213xf04b2e4c().setPadding(n1Var.e(), n1Var.e(), n1Var.e(), n1Var.e());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(n1Var.a(), n1Var.a());
        layoutParams.setMargins(0, 0, 0, 0);
        jz5.l lVar2 = new jz5.l(m166213xf04b2e4c(), layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildAvatar", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar2, linearLayout3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.u.f250533d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        if (z17) {
            int d17 = n1Var.d();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            i17 = d17;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            i17 = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.TimelineItemBuild", "buildRightPanelLayout: width=" + i17 + ", enableLargeUI:" + z17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i17, -2);
        layoutParams2.setMarginStart(n1Var.f());
        jz5.l lVar3 = new jz5.l(m166231xd8ac8208(), layoutParams2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar3, linearLayout3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupRightPanelDetailLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildNickNameLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        m166229xa3a57151().setId(com.p314xaae8f345.mm.R.id.kbq);
        m166229xa3a57151().setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        m166229xa3a57151().setTextSize(0, i65.a.p(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        m166229xa3a57151().setSingleLine(true);
        m166229xa3a57151().setEllipsize(android.text.TextUtils.TruncateAt.END);
        m166229xa3a57151().setClickable(true);
        m166229xa3a57151().setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p5());
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams3 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        layoutParams3.f92439q = 0;
        layoutParams3.f92426h = 0;
        layoutParams3.setMargins(0, n1Var.e(), i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561461j8), 0);
        m166231xd8ac8208().addView(m166229xa3a57151(), layoutParams3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildNickNameLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z18 = ld4.a.f399640c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildDebugTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            str = "access$getEnableLargeUI$cp";
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams4 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -2);
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin = n1Var.h();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = n1Var.h();
            layoutParams4.f92428i = com.p314xaae8f345.mm.R.id.kbq;
            jz5.l lVar4 = new jz5.l(m166219x7f7cac57(), layoutParams4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildDebugTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            i(lVar4, m166231xd8ac8208());
        } else {
            str = "access$getEnableLargeUI$cp";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContentTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        m166218xc2a45010().setId(com.p314xaae8f345.mm.R.id.cuf);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams5 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -2);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).topMargin = m(3);
        layoutParams5.f92439q = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z19 = ld4.a.f399640c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z19) {
            layoutParams5.f92428i = com.p314xaae8f345.mm.R.id.n97;
        } else {
            layoutParams5.f92428i = com.p314xaae8f345.mm.R.id.kbq;
        }
        m166218xc2a45010().m71002x599de7b3(new tc4.p1());
        jz5.l lVar5 = new jz5.l(m166218xc2a45010(), layoutParams5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContentTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar5, m166231xd8ac8208());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processCustomLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        jz5.l k17 = k();
        if (mo166166xc321a0f5() != 6) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams6 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) k17.f384367e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMiddle_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMiddle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            jz5.g gVar3 = N;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMiddle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue2 = ((java.lang.Number) ((jz5.n) gVar3).mo141623x754a37bb()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMiddle_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            i18 = 0;
            layoutParams6.setMargins(0, intValue2, 0, n1Var.h());
        } else {
            i18 = 0;
        }
        ((android.view.View) k17.f384366d).setId(com.p314xaae8f345.mm.R.id.n96);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams7 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) k17.f384367e;
        layoutParams7.f92439q = i18;
        layoutParams7.f92428i = com.p314xaae8f345.mm.R.id.cuf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processCustomLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(k17, m166231xd8ac8208());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildFeedAboutLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(getContext());
        linearLayout4.setOrientation(1);
        linearLayout4.setGravity(16);
        linearLayout4.addView(this.f499055s);
        linearLayout4.addView(this.A);
        linearLayout4.addView(this.f499061y);
        linearLayout4.addView(this.f499062z);
        linearLayout4.addView(this.B);
        linearLayout4.addView(this.f499057u);
        linearLayout4.setId(com.p314xaae8f345.mm.R.id.n98);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams8 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
        layoutParams8.f92418d = 0;
        layoutParams8.f92428i = com.p314xaae8f345.mm.R.id.n96;
        jz5.l lVar6 = new jz5.l(linearLayout4, layoutParams8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildFeedAboutLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar6, m166231xd8ac8208());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildBottomLineLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        java.lang.String str2 = str;
        android.widget.TextView l17 = l(this, true, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834, com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4, true, 0, 0, null, 112, null);
        this.f499053q = l17;
        linearLayout.addView(l17, new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(this.f499056t);
        linearLayout.addView(this.f499059w);
        linearLayout.addView(this.f499058v);
        linearLayout.addView(this.f499060x);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        relativeLayout.setGravity(16);
        relativeLayout.setId(com.p314xaae8f345.mm.R.id.f568563n93);
        m166215x8f2580b2().setId(com.p314xaae8f345.mm.R.id.f564427r2);
        m166215x8f2580b2().setImageDrawable(pc4.d.f434943a.z() ? i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.d4t) : com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559934iu));
        android.widget.RelativeLayout.LayoutParams layoutParams9 = new android.widget.RelativeLayout.LayoutParams(m(32), m(20));
        layoutParams9.setMargins(m(10), 0, 0, 0);
        layoutParams9.addRule(21, -1);
        layoutParams9.addRule(15, -1);
        relativeLayout.addView(m166215x8f2580b2(), layoutParams9);
        android.widget.RelativeLayout.LayoutParams layoutParams10 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.setMarginEnd(i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
        layoutParams10.addRule(15, -1);
        relativeLayout.addView(linearLayout, layoutParams10);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams11 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        layoutParams11.f92418d = 0;
        layoutParams11.f92424g = 0;
        layoutParams11.f92428i = com.p314xaae8f345.mm.R.id.n98;
        layoutParams11.setMargins(0, n1Var.g(), 0, 0);
        jz5.l lVar7 = new jz5.l(relativeLayout, layoutParams11);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildBottomLineLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar7, m166231xd8ac8208());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams12 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        layoutParams12.f92418d = 0;
        layoutParams12.f92424g = 0;
        layoutParams12.f92428i = com.p314xaae8f345.mm.R.id.f568563n93;
        jz5.l lVar8 = new jz5.l(this.C, layoutParams12);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar8, m166231xd8ac8208());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildTip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams13 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        layoutParams13.f92418d = 0;
        layoutParams13.f92424g = 0;
        layoutParams13.f92428i = com.p314xaae8f345.mm.R.id.f568564n94;
        jz5.l lVar9 = new jz5.l(c18258x7ccfbc06, layoutParams13);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildTip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        i(lVar9, m166231xd8ac8208());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupRightPanelDetailLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str2, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        boolean z27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.u.f250533d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        int i27 = z27 ? -2 : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.TimelineItemBuild", "getContentLayoutParams: enableLargeUI=" + z27 + ", lp width:" + i27);
        android.widget.LinearLayout.LayoutParams layoutParams14 = new android.widget.LinearLayout.LayoutParams(i27, -2);
        if (z27) {
            i19 = 1;
            layoutParams14.gravity = 1;
        } else {
            i19 = 1;
            layoutParams14.gravity = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        j(this, new jz5.l(linearLayout3, layoutParams14), null, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        view.setBackgroundColor(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741));
        android.widget.LinearLayout.LayoutParams layoutParams15 = new android.widget.LinearLayout.LayoutParams(-1, i19);
        layoutParams15.setMargins(0, id4.s.f372477d.a(), 0, 0);
        jz5.l lVar10 = new jz5.l(view, layoutParams15);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        j(this, lVar10, null, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildItemView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.TimelineItemBuild", "buildItemView cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static /* synthetic */ void j(tc4.x1 x1Var, jz5.l lVar, android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCustomView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            throw unsupportedOperationException;
        }
        if ((i17 & 2) != 0) {
            viewGroup = x1Var;
        }
        x1Var.i(lVar, viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public static android.widget.TextView l(tc4.x1 x1Var, boolean z17, int i17, int i18, boolean z18, int i19, int i27, java.lang.String contentDescription, int i28, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createImproveTextView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            throw unsupportedOperationException;
        }
        if ((i28 & 8) != 0) {
            z18 = true;
        }
        if ((i28 & 16) != 0) {
            i19 = -1;
        }
        if ((i28 & 32) != 0) {
            i27 = 0;
        }
        if ((i28 & 64) != 0) {
            contentDescription = "";
        }
        x1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createImproveTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentDescription, "contentDescription");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.TimelineItemBuild", "createImproveTextView: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea c18277x17b0cea = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea(x1Var.getContext());
        if (z17) {
            c18277x17b0cea.setSingleLine();
        }
        c18277x17b0cea.setTextColor(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17));
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSpecialTextSize", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            c18277x17b0cea.setTextSize(0, java.lang.Math.min(i65.a.f(x1Var.getContext(), i18) * i65.a.t(x1Var.getContext()), i65.a.p(x1Var.getContext(), i18)));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSpecialTextSize", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        } else {
            c18277x17b0cea.setTextSize(0, i65.a.p(x1Var.getContext(), i18));
        }
        if (i19 > 0) {
            c18277x17b0cea.setId(i19);
        }
        if (i27 != 0) {
            c18277x17b0cea.setBackgroundResource(i27);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contentDescription, "")) {
            c18277x17b0cea.setContentDescription(contentDescription);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createImproveTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return c18277x17b0cea;
    }

    /* renamed from: getAddressStub */
    public final android.view.View m166211x87be458c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f499056t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getAppNameStub */
    public final android.view.View m166212x741f2de4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f499061y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getAvatarImage */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf m166213xf04b2e4c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf c18409xf85d1ccf = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf) ((jz5.n) this.f499045f).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return c18409xf85d1ccf;
    }

    /* renamed from: getCommentContainer */
    public final android.widget.LinearLayout m166214xa632a058() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.LinearLayout linearLayout = this.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return linearLayout;
    }

    /* renamed from: getCommentImage */
    public final android.widget.ImageView m166215x8f2580b2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f499054r).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return imageView;
    }

    /* renamed from: getCompanyNameText */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee m166216x67069bbf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCompanyNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee runnableC17943x7a38efee = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee) ((jz5.n) this.f499048i).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCompanyNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return runnableC17943x7a38efee;
    }

    /* renamed from: getContentContainer */
    public final android.view.ViewGroup m166217xda5977e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.ViewGroup viewGroup = this.f499044e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return viewGroup;
    }

    /* renamed from: getContentText */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 m166218xc2a45010() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 c18267x4e51b446 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446) ((jz5.n) this.f499051o).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return c18267x4e51b446;
    }

    /* renamed from: getDebugLabel */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea m166219x7f7cac57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDebugLabel", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea c18277x17b0cea = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea) ((jz5.n) this.f499049m).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDebugLabel", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return c18277x17b0cea;
    }

    /* renamed from: getDelIconStub */
    public final android.view.View m166220xc8e2c8bc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDelIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f499060x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDelIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getDivider */
    public final android.view.View m166221xa1994ee3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getFestivalStub */
    public final android.view.View m166222xc50f4cbc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFestivalStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFestivalStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getGameAboutStub */
    public final android.view.View m166223x8c58f253() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f499055s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getGroupImageStub */
    public final android.view.View m166224x8af4d5e0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f499058v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getItemFooter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 m166225x4f03fa84() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemFooter", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemFooter", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return this.E;
    }

    /* renamed from: getItemHeader */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18262x7fa5e8f8 m166226x51da2776() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemHeader", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemHeader", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return this.D;
    }

    /* renamed from: getLifecycleOwner */
    public final p012xc85e97e9.p093xedfae76a.y m166227x95c7fa5f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return this.f499043d;
    }

    /* renamed from: getMatchWidthWrapHeightParams */
    public final android.view.ViewGroup.LayoutParams m166228x549ba80e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMatchWidthWrapHeightParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMatchWidthWrapHeightParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return layoutParams;
    }

    /* renamed from: getNickNameText */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee m166229xa3a57151() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNickNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee runnableC17943x7a38efee = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee) ((jz5.n) this.f499047h).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNickNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return runnableC17943x7a38efee;
    }

    /* renamed from: getPublishTimeText */
    public final android.widget.TextView m166230x8e783193() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.TextView textView = this.f499053q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return textView;
    }

    /* renamed from: getRightPanelLayout */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m166231xd8ac8208() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) ((jz5.n) this.f499046g).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return c1073x7e08a787;
    }

    /* renamed from: getShopNameStub */
    public final android.view.View m166232x8e003565() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShopNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f499062z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShopNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getStarIconStub */
    public final android.view.View m166233xbb8c5faf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f499059w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getSubLayout */
    public final android.widget.LinearLayout m166234xdb7766d4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.widget.LinearLayout linearLayout = this.f499052p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return linearLayout;
    }

    /* renamed from: getViewType */
    public abstract int mo166166xc321a0f5();

    /* renamed from: getWeComTagImage */
    public final nd4.g m166235x7f4e271e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeComTagImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        nd4.g gVar = (nd4.g) ((jz5.n) this.f499050n).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeComTagImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return gVar;
    }

    /* renamed from: getWeappView */
    public final android.view.View m166236xb7c1ef22() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeappView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeappView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: getWithFriendStub */
    public final android.view.View m166237xc7f2a2c8() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        android.view.View view = this.f499057u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final void i(jz5.l pair, android.view.ViewGroup view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pair, "pair");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.addView((android.view.View) pair.f384366d, (android.view.ViewGroup.LayoutParams) pair.f384367e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public abstract jz5.l k();

    public final int m(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return b17;
    }

    /* renamed from: name */
    public abstract java.lang.String mo70844x337a8b();

    /* renamed from: setAddressStub */
    public final void m166238x1e23b900(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f499056t = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setAppNameStub */
    public final void m166239xa84a158(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f499061y = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setCommentContainer */
    public final void m166240x4a2f3564(android.widget.LinearLayout linearLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linearLayout, "<set-?>");
        this.C = linearLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setContentContainer */
    public final void m166241xb1a22c8a(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        this.f499044e = viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setDelIconStub */
    public final void m166242x5f483c30(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDelIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f499060x = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDelIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setFestivalStub */
    public final void m166243xfb5847c8(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFestivalStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.B = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFestivalStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setGameAboutStub */
    public final void m166244x1f2f58c7(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f499055s = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setGroupImageStub */
    public final void m166245x52eb3dec(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f499058v = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setPublishTimeText */
    public final void m166246xc54ecb07(android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        this.f499053q = textView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setShopNameStub */
    public final void m166247xc4493071(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShopNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f499062z = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShopNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setStarIconStub */
    public final void m166248xf1d55abb(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f499059w = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarIconStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setWeappView */
    public final void m166249x1415af96(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWeappView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.A = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWeappView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: setWithFriendStub */
    public final void m166250x8fe90ad4(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f499057u = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }
}
