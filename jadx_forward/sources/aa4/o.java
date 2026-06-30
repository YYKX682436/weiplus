package aa4;

/* loaded from: classes4.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe f84208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v94.g f84209e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe c17860x8fb775fe, v94.g gVar) {
        this.f84208d = c17860x8fb775fe;
        this.f84209e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe c17860x8fb775fe = this.f84208d;
        android.widget.ImageView m69735xdc9087de = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69735xdc9087de(c17860x8fb775fe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m69735xdc9087de, "access$getCoverFoldImageView(...)");
        android.graphics.RectF m69737x34485a1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69737x34485a1(c17860x8fb775fe, m69735xdc9087de);
        if (m69737x34485a1 != null) {
            float height = m69737x34485a1.height();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) this.f84209e;
            x1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsCoverOffset", "com.tencent.mm.plugin.sns.storage.SnsCover");
            int i17 = x1Var.f67727x69ef8877;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsCoverOffset", "com.tencent.mm.plugin.sns.storage.SnsCover");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69735xdc9087de(c17860x8fb775fe).setTranslationY(height * (i17 / 10000.0f));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1$1");
    }
}
