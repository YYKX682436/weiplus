package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f103959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f103961f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f103962g;

    public m1(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter, so2.y0 y0Var, boolean z17, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f103959d = nPresenter;
        this.f103960e = y0Var;
        this.f103961f = z17;
        this.f103962g = weImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$refreshRecommendLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f103961f;
        this.f103959d.l(this.f103960e, !z17);
        if (!z17 && (weImageView = this.f103962g) != null) {
            hc2.f1.d(weImageView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$refreshRecommendLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
