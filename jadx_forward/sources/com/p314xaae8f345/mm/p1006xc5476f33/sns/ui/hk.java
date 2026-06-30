package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class hk implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk f250047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f250048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f250049c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f250050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f250051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk f250052f;

    public hk(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar, r45.jj4 jj4Var, int i17, boolean z17, boolean z18) {
        this.f250052f = bkVar;
        this.f250047a = jkVar;
        this.f250048b = jj4Var;
        this.f250049c = i17;
        this.f250050d = z17;
        this.f250051e = z18;
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoadError */
    public void mo15805x5cb2b166(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryAdapter", "onImageLoadError, switch to multiTouchImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f250052f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar = this.f250047a;
        int i17 = this.f250049c;
        r45.jj4 jj4Var = this.f250048b;
        boolean z17 = this.f250050d;
        boolean z18 = this.f250051e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        bkVar.u(jkVar, i17, jj4Var, z17, z18, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onImageLoaded */
    public void mo15806x91f79de1(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jk jkVar = this.f250047a;
        jkVar.f251048b.setVisibility(8);
        jkVar.f251049c.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.J(this.f250052f.f249458r).put(this.f250048b.f459388d, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoadError */
    public void mo15807xaf7fedd9(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreviewLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreviewLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewLoaded */
    public void mo15808x3c79ee4e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreviewLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreviewLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onPreviewReleased */
    public void mo15809x76d22946() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreviewReleased", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreviewReleased", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onReady */
    public void mo15810xb03baf04() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReady", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReady", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
    /* renamed from: onTileLoadError */
    public void mo15811x68961215(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTileLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTileLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }
}
