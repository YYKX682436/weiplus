package ud4;

/* loaded from: classes4.dex */
public class l implements ud4.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a f508251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f508252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud4.t f508253c;

    public l(ud4.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a, android.view.View view) {
        this.f508253c = tVar;
        this.f508251a = c18379xb7ff44a;
        this.f508252b = view;
    }

    public boolean a(android.graphics.Rect rect) {
        boolean intersect;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isIntersect", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        ud4.t tVar = this.f508253c;
        tVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        if (rect == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            intersect = false;
        } else {
            intersect = pm0.v.r(tVar.f508271g).intersect(rect);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isIntersect", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        return intersect;
    }
}
