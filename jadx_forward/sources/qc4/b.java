package qc4;

/* loaded from: classes4.dex */
public final class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2192x5a753b7.C18254x4f9faaa1 f443047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f443048e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2192x5a753b7.C18254x4f9faaa1 c18254x4f9faaa1, android.view.View view) {
        this.f443047d = c18254x4f9faaa1;
        this.f443048e = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$addView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2192x5a753b7.C18254x4f9faaa1 c18254x4f9faaa1 = this.f443047d;
        c18254x4f9faaa1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$addViewImpl", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        c18254x4f9faaa1.a(this.f443048e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$addViewImpl", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$addView$1");
    }
}
