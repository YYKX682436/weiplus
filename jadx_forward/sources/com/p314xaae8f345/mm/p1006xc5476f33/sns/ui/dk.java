package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class dk implements y51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f249730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk f249731b;

    public dk(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar, r45.jj4 jj4Var) {
        this.f249731b = bkVar;
        this.f249730a = jj4Var;
    }

    @Override // y51.f
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("live_photo_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        hashMap.put("live_photo_opt", 1);
        hashMap.put("live_clk_scene", java.lang.Integer.valueOf(this.f249731b.f249458r.D == 7 ? 4 : 0));
        r45.jj4 jj4Var = this.f249730a;
        hashMap.put("live_photo_ms", java.lang.Float.valueOf(jj4Var.X.R));
        hashMap.put("image_id", jj4Var.f459388d);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("live_photo_bnt", "view_clk", hashMap, 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
    }

    @Override // y51.f
    public int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetViewMaxHeightLocation", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.content.Context context = this.f249731b.f249450g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetViewMaxHeightLocation", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        return a17.f278669b;
    }

    @Override // y51.f
    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetLocationCallback", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetLocationCallback", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        return 0;
    }
}
