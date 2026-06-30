package n74;

/* loaded from: classes4.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f416901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n f416902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f416903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f416904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f416905h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f416906i;

    public h1(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar, android.widget.ImageView imageView, int i18, android.widget.ImageView imageView2, int i19) {
        this.f416901d = i17;
        this.f416902e = nVar;
        this.f416903f = imageView;
        this.f416904g = i18;
        this.f416905h = imageView2;
        this.f416906i = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = this.f416902e;
        int i17 = nVar.f247607i;
        try {
            boolean isEmpty = android.text.TextUtils.isEmpty(nVar.f38340x19ed5381);
            int i18 = this.f416901d;
            android.widget.ImageView imageView = this.f416903f;
            if (isEmpty) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
            } else {
                a84.m.a(nVar.f38340x19ed5381, imageView);
                int i19 = this.f416904g;
                if (i18 >= i19 && i19 > 0) {
                    n74.i1.a(imageView);
                } else if (imageView.getVisibility() != 0) {
                    imageView.setVisibility(0);
                    imageView.hashCode();
                }
            }
            boolean isEmpty2 = android.text.TextUtils.isEmpty(nVar.f38338x8f672c33);
            android.widget.ImageView imageView2 = this.f416905h;
            if (isEmpty2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                imageView2.setVisibility(4);
                imageView2.setImageDrawable(null);
                imageView2.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
            } else {
                a84.m.a(nVar.f38338x8f672c33, imageView2);
                if (i18 >= this.f416906i) {
                    n74.i1.b(imageView2);
                } else if (imageView2.getVisibility() == 0) {
                    imageView2.setVisibility(4);
                    imageView2.hashCode();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FullCardCoverImageHelper", "checkCoverImageState exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper$1");
    }
}
