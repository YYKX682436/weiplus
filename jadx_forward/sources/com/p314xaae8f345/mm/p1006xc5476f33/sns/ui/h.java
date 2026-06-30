package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class h extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f250003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f250004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j f250005f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j jVar, int i17, int i18) {
        this.f250005f = jVar;
        this.f250003d = i17;
        this.f250004e = i18;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyTransformation", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j jVar = this.f250005f;
        ((android.widget.RelativeLayout.LayoutParams) jVar.f251006o.getLayoutParams()).bottomMargin = f17 == 1.0f ? 0 : (int) ((this.f250003d - this.f250004e) * (1.0f - f17));
        jVar.f251006o.requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyTransformation", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("willChangeBounds", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("willChangeBounds", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
        return true;
    }
}
