package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class s5 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.a {

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb f247019s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5 f247020t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4 f247021u;

    /* renamed from: v, reason: collision with root package name */
    public int f247022v;

    /* renamed from: w, reason: collision with root package name */
    public int f247023w;

    /* renamed from: x, reason: collision with root package name */
    public ab4.r0 f247024x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f247025y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f247026z;

    static {
        new java.util.WeakHashMap();
    }

    public s5(android.content.Context context, ab4.r0 r0Var, android.view.ViewGroup viewGroup) {
        super(context, r0Var, viewGroup);
        this.f247022v = 1;
        this.f247023w = 0;
        this.f247025y = false;
        this.f247026z = true;
        this.f247021u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4(context, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.B();
        this.f247019s.m8317x940d026a(this.f247022v, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        if (super.D(jSONObject)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void F(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.F(map);
        try {
            if (map.containsKey(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33.f71691x3d6ab575)) {
                this.f247022v = ((java.lang.Integer) map.get(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33.f71691x3d6ab575)).intValue() + 1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb c18430xfb7819bb = this.f247019s;
            if (c18430xfb7819bb != null) {
                c18430xfb7819bb.m8317x940d026a(this.f247022v, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageGroupListComponent", "when setOriginState, but viewPager is null");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageGroupListComponent", e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.J();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb c18430xfb7819bb = this.f247019s;
        if (c18430xfb7819bb != null) {
            c18430xfb7819bb.m71302x5d531405();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f247020t.d(this.f247023w);
        this.f247020t.c(this.f247023w);
        super.K();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f247020t.c(-1);
        super.M();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb c18430xfb7819bb = this.f247019s;
        if (c18430xfb7819bb != null) {
            c18430xfb7819bb.m71298xe5bfa199();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.a
    public java.util.List O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5) this.f247019s.m8299xf939df19();
        r5Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = r5Var.f246995p.values().iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q5) it.next()).f246961a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        arrayList.addAll(arrayList2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.a
    public void P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f247020t.c(this.f247023w);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    public final ab4.r0 R() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        ab4.r0 r0Var = (ab4.r0) this.f246583e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return r0Var;
    }

    public final ab4.r0 S(ab4.r0 r0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        ab4.r0 r0Var2 = new ab4.r0();
        this.f247024x = r0Var2;
        if (r0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
            return r0Var2;
        }
        r0Var2.f84350d = r0Var.f84350d;
        r0Var2.f84351e = r0Var.f84351e;
        r0Var2.f84352f = r0Var.f84352f;
        r0Var2.f84353g = r0Var.f84353g;
        r0Var2.f84354h = r0Var.f84354h;
        r0Var2.f84355i = r0Var.f84355i;
        r0Var2.f84356m = r0Var.f84356m;
        r0Var2.f84357n = r0Var.f84357n;
        r0Var2.f84358o = r0Var.f84358o;
        r0Var2.f84359p = r0Var.f84359p;
        r0Var2.f84360q = r0Var.f84360q;
        r0Var2.f84361r = r0Var.f84361r;
        r0Var2.f84362s = r0Var.f84362s;
        r0Var2.f84363t = r0Var.f84363t;
        r0Var2.f84364u = r0Var.f84364u;
        r0Var2.f84365v = r0Var.f84365v;
        r0Var2.f84366w = r0Var.f84366w;
        r0Var2.f84367x = r0Var.f84367x;
        r0Var2.G = r0Var.G;
        r0Var2.H = r0Var.H;
        java.util.LinkedList linkedList = r0Var2.F;
        java.util.LinkedList linkedList2 = r0Var.F;
        linkedList.add((ab4.v) linkedList2.getLast());
        this.f247024x.F.addAll(linkedList2);
        this.f247024x.F.add((ab4.v) linkedList2.getFirst());
        if (linkedList2.size() > 1) {
            this.f247024x.I = r0Var.I;
            this.f247026z = true;
        } else {
            this.f247026z = false;
            this.f247024x.I = false;
        }
        ab4.r0 r0Var3 = this.f247024x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return r0Var3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        android.view.View view = this.f246589n;
        this.f247019s = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb) view.findViewById(com.p314xaae8f345.mm.R.id.f568530n50);
        this.f247021u = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4) view.findViewById(com.p314xaae8f345.mm.R.id.n4k);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5 r5Var;
        float f17;
        float f18;
        int i17;
        float f19;
        int measuredHeight;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        int i18 = (this.f246591p - ((int) R().f84354h)) - ((int) R().f84355i);
        android.content.Context context = this.f246582d;
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        S(R());
        if (this.f247019s.m8299xf939df19() == null) {
            r5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5(this.f246582d, layoutInflater, this.f247024x, this.f246584f, this.f247019s);
            this.f247019s.m8322x2d3430b4(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k5(this, r5Var));
            this.f247019s.m8315x6cab2c8d(r5Var);
        } else {
            r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5) this.f247019s.m8299xf939df19();
            ab4.r0 S = S(R());
            r5Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            r5Var.f246988f = S;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.r5 r5Var2 = r5Var;
        int i19 = 0;
        if (this.f247026z) {
            this.f247025y = R().I;
            this.f247021u.setVisibility(0);
            this.f247019s.m71297xb22a0969(true);
        } else {
            this.f247025y = false;
            this.f247021u.setVisibility(8);
            this.f247019s.m71297xb22a0969(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4 c18433x25b436c4 = this.f247021u;
        int size = this.f247024x.F.size();
        boolean z17 = this.f247025y;
        c18433x25b436c4.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        c18433x25b436c4.f252486e = size - 2;
        c18433x25b436c4.f252488g = ((c18433x25b436c4.f252487f - (((r9 - 1) * 2) * c18433x25b436c4.f252490i)) - c18433x25b436c4.f252489h) / 2.0f;
        c18433x25b436c4.A = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f247019s.m71296xc5dada81(this.f247021u, this.f247025y);
        boolean z18 = R().H;
        int i27 = this.f246592q;
        if (z18) {
            this.f247019s.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i18, i27));
        } else if (R().F.size() > 0) {
            ab4.v vVar = (ab4.v) R().F.get(0);
            new android.widget.LinearLayout(context).setOrientation(1);
            java.util.Iterator it = vVar.F.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                ab4.d0 d0Var = (ab4.d0) it.next();
                int i29 = (int) (i28 + d0Var.f84352f);
                float f27 = 0.0f;
                if (d0Var instanceof ab4.m0) {
                    ab4.m0 m0Var = (ab4.m0) d0Var;
                    android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571023cq0, (android.view.ViewGroup) null);
                    inflate.setBackgroundColor(this.f246584f);
                    try {
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n4f);
                        textView.setText(m0Var.F);
                        float f28 = m0Var.G;
                        if (f28 > 0.0f) {
                            textView.setTextSize(i19, f28);
                        }
                        float f29 = m0Var.P;
                        if (f29 > 0.0f) {
                            textView.setLineSpacing(0.0f, f29 + 1.0f);
                        }
                        if (m0Var.f84389J) {
                            textView.getPaint().setFakeBoldText(true);
                        }
                        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) ((i18 - m0Var.f84354h) - m0Var.f84355i), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(i19, i19));
                        i29 = i29 + textView.getPaddingTop() + textView.getMeasuredHeight();
                        i17 = textView.getPaddingBottom();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageGroupListComponent", "txtComp measure exp=" + e17.toString());
                    }
                } else {
                    if (d0Var instanceof ab4.u) {
                        android.widget.Button button = (android.widget.Button) layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cpc, (android.view.ViewGroup) null).findViewById(com.p314xaae8f345.mm.R.id.n4n);
                        button.setText(((ab4.u) d0Var).F);
                        button.measure(android.view.View.MeasureSpec.makeMeasureSpec(i19, i19), android.view.View.MeasureSpec.makeMeasureSpec(i19, i19));
                        int paddingTop = i29 + button.getPaddingTop();
                        float f37 = d0Var.f84357n;
                        if (f37 <= 0.0f || ((int) f37) == Integer.MAX_VALUE) {
                            f37 = d0Var.f84363t;
                            if (f37 <= 0.0f || ((int) f37) == Integer.MAX_VALUE) {
                                measuredHeight = button.getMeasuredHeight() + paddingTop;
                                i29 = measuredHeight + button.getPaddingBottom();
                            }
                        }
                        measuredHeight = (int) (paddingTop + f37);
                        i29 = measuredHeight + button.getPaddingBottom();
                    } else {
                        boolean z19 = d0Var instanceof ab4.x;
                        if (z19) {
                            float f38 = d0Var.f84353g;
                            if (z19) {
                                ab4.x xVar = (ab4.x) d0Var;
                                f27 = xVar.f84363t;
                                f19 = xVar.f84362s;
                            } else {
                                f19 = 0.0f;
                            }
                            i29 = (int) (((int) (((((int) f27) == 0 || ((int) f19) == 0) ? i29 + i27 : (int) (i29 + ((i18 * f27) / f19))) + r11)) + f38);
                        } else {
                            if (!(d0Var instanceof ab4.w)) {
                                if (d0Var instanceof ab4.z) {
                                    ab4.z zVar = (ab4.z) d0Var;
                                    if (zVar.K != 1) {
                                        float f39 = zVar.f84362s;
                                        if (((int) f39) > 0) {
                                            i17 = (((int) zVar.f84363t) * i18) / ((int) f39);
                                        } else {
                                            f17 = i29;
                                            f18 = zVar.f84363t;
                                            i29 = (int) (f17 + f18);
                                        }
                                    }
                                } else if (d0Var instanceof ab4.u0) {
                                    ab4.u0 u0Var = (ab4.u0) d0Var;
                                    if (u0Var.G == 1) {
                                        float f47 = u0Var.f84362s;
                                        if (((int) f47) > 0) {
                                            i17 = (((int) u0Var.f84363t) * i18) / ((int) f47);
                                        } else {
                                            f17 = i29;
                                            f18 = u0Var.f84363t;
                                            i29 = (int) (f17 + f18);
                                        }
                                    }
                                } else if (!(d0Var instanceof ab4.s0)) {
                                }
                            }
                            i29 += i27;
                        }
                    }
                    i28 = (int) (i29 + d0Var.f84353g);
                    i19 = 0;
                }
                i29 += i17;
                i28 = (int) (i29 + d0Var.f84353g);
                i19 = 0;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i18, i28);
            layoutParams.leftMargin = (int) R().f84354h;
            layoutParams.rightMargin = (int) R().f84355i;
            this.f247019s.setLayoutParams(layoutParams);
        }
        this.f247020t = r5Var2;
        r5Var2.mo8343xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571025cq2;
    }
}
