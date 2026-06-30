package ud4;

/* loaded from: classes4.dex */
public class p implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a f508258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f508259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud4.t f508260f;

    public p(ud4.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a, java.util.List list) {
        this.f508260f = tVar;
        this.f508258d = c18379xb7ff44a;
        this.f508259e = list;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$5");
        this.f508258d.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f508260f.d(this.f508259e.size());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$5");
        return true;
    }
}
