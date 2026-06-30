package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter */
/* loaded from: classes4.dex */
public class C18110x6b07f280 extends com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f248921t = 0;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f248922n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f248923o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f248924p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageButton f248925q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17998x7a96bc24 f248926r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17997xdb716136 f248927s;

    public C18110x6b07f280(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248924p = null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f248922n = abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.ctk, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCommentModeView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564368p9);
        this.f248925q = imageButton;
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hq(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommentModeView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a() == null) {
            this.f248923o = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t5(abstractActivityC21394xb3d2c0cf);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
            this.f248923o = wi6;
            wi6.mo75331xef640234(2);
            this.f248923o.mo75345x9e226965(6);
            this.f248923o.setVisibility(8);
            ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g)).addView(this.f248923o, -1, 0);
            this.f248923o.c();
            this.f248923o.i();
            this.f248923o.mo75339x5e04422d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iq(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSmilayPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initRangeWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17998x7a96bc24 c17998x7a96bc24 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17998x7a96bc24) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.li_);
        this.f248926r = c17998x7a96bc24;
        c17998x7a96bc24.a(null);
        this.f248926r.f248147w = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initRangeWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLocationWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        this.f248927s = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17997xdb716136) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f567225io1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLocationWidget", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18110x6b07f280 c18110x6b07f280) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c18110x6b07f280.f248924p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return c22621x7603e017;
    }

    /* renamed from: getLocation */
    public r45.ed4 m70799xed29dd2b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0.f34398x24728b, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        r45.ed4 m70589xed29dd2b = this.f248927s.m70589xed29dd2b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0.f34398x24728b, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return m70589xed29dd2b;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415
    /* renamed from: getPanelView */
    public java.util.List<android.view.View> mo66217xa7118813() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPanelView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f248923o);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPanelView", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        return arrayList;
    }

    /* renamed from: setMMEditText */
    public void m70800x1b9709f9(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMMEditText", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        this.f248924p = c22621x7603e017;
        c22621x7603e017.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.eq(this));
        c22621x7603e017.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fq(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gq(this), 200L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMMEditText", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
    }
}
