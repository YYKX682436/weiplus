package s74;

/* loaded from: classes4.dex */
public final class f3 {
    public android.widget.FrameLayout A;
    public float B;
    public final java.util.List C;
    public android.widget.Button D;
    public android.widget.Button E;
    public android.widget.Button F;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd G;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 H;
    public final java.util.List I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 f485799J;
    public android.widget.FrameLayout K;
    public android.widget.ImageView L;
    public com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc M;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2143x50995631.C17792xc6c22fda N;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 O;
    public android.view.ViewGroup P;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 Q;
    public boolean R;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.j0 S;
    public n74.n1 T;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17794x6bc92636 U;
    public final java.util.List V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public final int f485800a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f485801b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485802c;

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONArray f485803d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f485804e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f485805f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 f485806g;

    /* renamed from: h, reason: collision with root package name */
    public final i64.q f485807h;

    /* renamed from: i, reason: collision with root package name */
    public int f485808i;

    /* renamed from: j, reason: collision with root package name */
    public int f485809j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f485810k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f485811l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Float f485812m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Float f485813n;

    /* renamed from: o, reason: collision with root package name */
    public org.json.JSONObject f485814o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f485815p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f485816q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f485817r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f485818s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f485819t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f485820u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f485821v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f485822w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f485823x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f485824y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f485825z;

    public f3(int i17, android.content.Context ctx, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, org.json.JSONArray jSONArray, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        this.f485800a = i17;
        this.f485801b = ctx;
        this.f485802c = snsInfo;
        this.f485803d = jSONArray;
        this.f485804e = y0Var;
        this.f485805f = jz5.h.b(new s74.e3(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = snsInfo.m70354x74235b3e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70354x74235b3e, "getAdXml(...)");
        this.f485806g = m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = snsInfo.m70346x10413e67();
        m70346x10413e67 = m70346x10413e67 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(null) : m70346x10413e67;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = snsInfo.m70371x485d7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
        this.f485807h = new i64.q(m70346x10413e67, m70354x74235b3e, m70371x485d7);
        this.f485815p = new java.util.LinkedHashMap();
        this.f485816q = new java.util.LinkedHashMap();
        this.f485817r = new java.util.LinkedHashMap();
        this.f485818s = new java.util.LinkedHashMap();
        this.f485819t = new java.util.ArrayList();
        this.f485820u = new java.util.ArrayList();
        this.f485821v = new java.util.ArrayList();
        this.f485822w = new java.util.ArrayList();
        this.f485823x = new java.util.ArrayList();
        this.B = -1.0f;
        this.C = new java.util.ArrayList();
        this.I = new java.util.ArrayList();
        this.V = new java.util.ArrayList();
    }

    public final s74.j3 a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findViewNodeById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findViewNodeById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            return null;
        }
        for (s74.j3 j3Var : ((java.util.LinkedHashMap) this.f485815p).values()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j3Var.a(), str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findViewNodeById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                return j3Var;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findViewNodeById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return null;
    }

    public final void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genAbsoluteChildren", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        s74.u3.f486095a.B(jSONObject, s74.d3.f485780d, new s74.c3(jSONObject, arrayList, this));
        if (!arrayList.isEmpty()) {
            this.f485818s.put(jSONObject, arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genAbsoluteChildren", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
    }

    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionLinkDownloadLogo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c0085xa15044fd = this.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionLinkDownloadLogo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return c0085xa15044fd;
    }

    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionLinkText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = this.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionLinkText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return c0092xf45d4375;
    }

    public final i64.q e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDataModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDataModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return this.f485807h;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdxml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdxml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return this.f485806g;
    }

    public final android.widget.Button g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickActionButton", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.widget.Button button = this.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickActionButton", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return button;
    }

    public final android.content.Context h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return this.f485801b;
    }

    public final int i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicVersion", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        int i17 = this.f485809j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicVersion", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return i17;
    }

    public final android.widget.ImageView j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEasyBuyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.widget.ImageView imageView = this.L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEasyBuyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return imageView;
    }

    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGridElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc c1625xd76db8dc = this.M;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGridElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return c1625xd76db8dc;
    }

    public final java.lang.String l(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        java.lang.String optString = jSONObject.optString(dm.i4.f66865x76d1ec5a);
        if (optString == null) {
            optString = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return optString;
    }

    public final boolean m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        boolean z17 = this.f485810k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return z17;
    }

    public final android.widget.FrameLayout n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.widget.FrameLayout frameLayout = this.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return frameLayout;
    }

    public final android.view.ViewGroup o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.view.ViewGroup viewGroup = this.f485825z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return viewGroup;
    }

    public final java.util.Map p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getObj2ViewMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        java.util.Map map = this.f485815p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getObj2ViewMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return map;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return this.f485802c;
    }

    public final int r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        int i17 = this.f485808i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return i17;
    }

    public final android.widget.FrameLayout s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.widget.FrameLayout frameLayout = this.K;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return frameLayout;
    }

    public final void t(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c0085xa15044fd) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActionLinkDownloadLogo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        this.G = c0085xa15044fd;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActionLinkDownloadLogo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
    }

    public final void u(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActionLinkText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        this.H = c0092xf45d4375;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActionLinkText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
    }

    public final void v(s74.j3 j3Var) {
        android.widget.ImageView.ScaleType scaleType;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        if (j3Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        org.json.JSONObject jSONObject = j3Var.f485901c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        if (jSONObject == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        java.lang.String str = j3Var.f485903e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Factory", "updateViewNode, viewType empty, id=" + j3Var.a());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Factory", "updateViewNode, id=" + j3Var.a());
        if (jSONObject.has("alpha")) {
            android.view.View c17 = j3Var.c();
            float optDouble = (float) jSONObject.optDouble("alpha");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(optDouble));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.lang.String optString = jSONObject.optString("display");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "flex")) {
            android.view.View c18 = j3Var.c();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c18, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
            android.view.View c19 = j3Var.c();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c19, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c19, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        s74.u3 u3Var = s74.u3.f486095a;
        u3Var.m(this, jSONObject, this.f485801b, j3Var.c());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "image")) {
            if (j3Var.c() instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd) {
                java.lang.String optString2 = jSONObject.optString("object-fit");
                if (optString2 != null) {
                    int hashCode = optString2.hashCode();
                    if (hashCode != 3143043) {
                        if (hashCode != 94852023) {
                            if (hashCode == 951526612 && optString2.equals("contain")) {
                                scaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
                                android.widget.ImageView.ScaleType scaleType2 = scaleType;
                                android.content.Context context = this.f485801b;
                                android.view.View c27 = j3Var.c();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c27, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                                u3Var.a(this, context, jSONObject, (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd) c27, scaleType2);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                            }
                        } else if (optString2.equals("cover")) {
                            scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
                            android.widget.ImageView.ScaleType scaleType22 = scaleType;
                            android.content.Context context2 = this.f485801b;
                            android.view.View c272 = j3Var.c();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c272, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                            u3Var.a(this, context2, jSONObject, (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd) c272, scaleType22);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                        }
                    } else if (optString2.equals("fill")) {
                        scaleType = android.widget.ImageView.ScaleType.FIT_XY;
                        android.widget.ImageView.ScaleType scaleType222 = scaleType;
                        android.content.Context context22 = this.f485801b;
                        android.view.View c2722 = j3Var.c();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c2722, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                        u3Var.a(this, context22, jSONObject, (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd) c2722, scaleType222);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                    }
                }
                scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
                android.widget.ImageView.ScaleType scaleType2222 = scaleType;
                android.content.Context context222 = this.f485801b;
                android.view.View c27222 = j3Var.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c27222, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                u3Var.a(this, context222, jSONObject, (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd) c27222, scaleType2222);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)) {
            android.view.View c28 = j3Var.c();
            android.widget.TextView textView = c28 instanceof android.widget.TextView ? (android.widget.TextView) c28 : null;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(u3Var.x(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, this.f485807h), true));
                textView.setTextColor(s74.q4.f486046a.r(jSONObject, u3Var.y(jSONObject, -16777216)));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Factory", "updateViewNode, unknown viewType=" + str + ", id=" + j3Var.a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
    }
}
