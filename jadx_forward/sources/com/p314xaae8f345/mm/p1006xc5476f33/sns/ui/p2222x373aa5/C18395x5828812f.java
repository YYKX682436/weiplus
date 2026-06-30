package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5;

/* renamed from: com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView */
/* loaded from: classes4.dex */
public class C18395x5828812f extends android.widget.FrameLayout implements ze4.i {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f252189w = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f252190d;

    /* renamed from: e, reason: collision with root package name */
    public int f252191e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f252192f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f252193g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f252194h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f252195i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f252196m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f252197n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22648x3baf96bd f252198o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f252199p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f252200q;

    /* renamed from: r, reason: collision with root package name */
    public int f252201r;

    /* renamed from: s, reason: collision with root package name */
    public int f252202s;

    /* renamed from: t, reason: collision with root package name */
    public int f252203t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f252204u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f252205v;

    public C18395x5828812f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        if (!this.f252204u) {
            android.view.View view = this.f252196m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "checkExpose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "checkExpose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            return;
        }
        if (this.f252196m.getVisibility() == 0) {
            int[] iArr = new int[2];
            this.f252196m.getLocationOnScreen(iArr);
            if (iArr[1] <= 0) {
                this.f252195i = false;
            } else if (!this.f252195i) {
                this.f252195i = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStoryHeaderView", "reportExpose: ");
                java.util.LinkedList linkedList = (java.util.LinkedList) this.f252192f;
                if (linkedList.size() <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    if (this.f252201r > 0) {
                        sb6.append((java.lang.String) linkedList.get(0));
                    }
                    for (int i17 = 1; i17 < this.f252201r; i17++) {
                        sb6.append("|");
                        sb6.append((java.lang.String) linkedList.get(i17));
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6940x89f70da9 c6940x89f70da9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6940x89f70da9();
                    c6940x89f70da9.f142500d = c6940x89f70da9.b("EnterObjectId", this.f252193g, true);
                    c6940x89f70da9.f142501e = c6940x89f70da9.b("SessionId", java.lang.String.valueOf(99L) + "_" + java.lang.System.currentTimeMillis(), true);
                    c6940x89f70da9.f142502f = (long) this.f252201r;
                    c6940x89f70da9.f142503g = c6940x89f70da9.b("ExposeUinList", sb6.toString(), true);
                    c6940x89f70da9.f142504h = (long) this.f252202s;
                    c6940x89f70da9.f142505i = (long) this.f252203t;
                    c6940x89f70da9.k();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStoryHeaderView", "checkExpose: %s", java.lang.Boolean.valueOf(this.f252195i));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public final void b(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initAvatarsView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f252198o.m81442x4a964a9c(i65.a.b(getContext(), 26));
        this.f252198o.m81440x12ebe4db(i65.a.b(getContext(), 16));
        this.f252201r = 0;
        if (list.size() > 0) {
            this.f252198o.setVisibility(0);
            this.f252198o.m81441x59e90099(java.lang.Math.min(list.size(), 3));
            this.f252201r = this.f252198o.getChildCount();
            for (int i17 = 0; i17 < this.f252198o.getChildCount(); i17++) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f252198o.a(i17), (java.lang.String) list.get(i17), 0.5f);
                this.f252198o.a(i17).setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b2q));
                this.f252198o.a(i17).setPadding(i65.a.b(getContext(), 1), i65.a.b(getContext(), 1), i65.a.b(getContext(), 1), i65.a.b(getContext(), 1));
            }
        } else {
            this.f252198o.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initAvatarsView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
    
        if (r11.t0() == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r21) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18395x5828812f.c(boolean):void");
    }

    /* renamed from: setEnterObjectId */
    public void m71202xa0900e70(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f252193g = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* renamed from: setSessionId */
    public void m71203x7ffb700f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSessionId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSessionId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* renamed from: setSnsType */
    public void m71204x36dcce10(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsType", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f252190d = i17;
        c(true);
        java.util.List list = this.f252192f;
        if (((java.util.LinkedList) list).size() > 0) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Bi((java.lang.String) ((java.util.LinkedList) list).get(0), true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsType", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* renamed from: setStoryAction */
    public void m71205x597d1c9(yd4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStoryAction", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStoryAction", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* renamed from: setTopLineVisibility */
    public void m71206xb2ae3699(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTopLineVisibility", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nbk);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "setTopLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "setTopLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTopLineVisibility", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public C18395x5828812f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f252191e = 10000;
        this.f252192f = new java.util.LinkedList();
        this.f252193g = null;
        this.f252194h = false;
        this.f252195i = false;
        this.f252201r = 0;
        this.f252202s = 0;
        this.f252203t = 0;
        this.f252204u = true;
        this.f252205v = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_SNS_HEADER_TYPE_INT, 0);
        if (r17 > 0) {
            this.f252191e = r17;
        } else {
            this.f252191e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_sns_story_open, 10000);
        }
        if (((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Ai().f461993d == 1) {
            this.f252191e = 10001;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStoryHeaderView", "init: headerType %s configType %s", java.lang.Integer.valueOf(this.f252191e), java.lang.Integer.valueOf(r17));
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ctr, this);
        this.f252196m = findViewById(com.p314xaae8f345.mm.R.id.nb8);
        this.f252197n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nbj);
        this.f252198o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22648x3baf96bd) findViewById(com.p314xaae8f345.mm.R.id.nb6);
        this.f252199p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nb9);
        this.f252200q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nb_);
        this.f252196m.setOnClickListener(new yd4.a(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }
}
