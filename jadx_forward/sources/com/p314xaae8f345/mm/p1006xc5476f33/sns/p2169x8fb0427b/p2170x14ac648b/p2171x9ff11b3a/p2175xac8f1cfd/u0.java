package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a {

    /* renamed from: s, reason: collision with root package name */
    public final ab4.m f247051s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f247052t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f247053u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f247054v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f247055w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f247056x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f247057y;

    /* renamed from: z, reason: collision with root package name */
    public int f247058z;

    public u0(android.content.Context context, ab4.m mVar, android.view.ViewGroup viewGroup) {
        super(context, mVar, viewGroup);
        this.f247051s = mVar;
    }

    public static /* synthetic */ ab4.m P(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        ab4.m mVar = u0Var.f247051s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        return mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        if (!super.D(jSONObject)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return false;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            int i17 = this.f247058z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            jSONObject.put("clickCount", i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return true;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AdLandingBorderedComp", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        android.view.View view = this.f246589n;
        this.f247053u = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.i0a);
        this.f247054v = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m38);
        this.f247055w = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.f247056x = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.hd_);
        this.f247057y = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.cg7);
        this.f247052t = this.f247056x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        android.widget.TextView textView = this.f247055w;
        ab4.m mVar = this.f247051s;
        textView.setText(mVar.I.f84387d);
        boolean z17 = mVar.f84358o;
        android.content.Context context = this.f246582d;
        if (z17) {
            this.f247053u.setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f563441br2));
            this.f247054v.setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.bre));
            this.f247055w.setTextColor(-16777216);
            this.f247056x.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562284bs);
        } else {
            this.f247053u.setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f563440br1));
            this.f247054v.setImageDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.brd));
            this.f247055w.setTextColor(-1);
            this.f247056x.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562285bt);
        }
        this.f247056x.setPadding((int) mVar.f84354h, 0, (int) mVar.f84355i, 0);
        this.f247057y.setPadding(0, (int) mVar.f84352f, 0, (int) mVar.f84353g);
        O(this.f247056x);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnclickLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        android.view.View view = this.f247052t;
        if (view != null) {
            view.setOnClickListener(t0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnclickLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public int v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cpp;
    }
}
