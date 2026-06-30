package k84;

/* loaded from: classes4.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.n f386525e;

    public d0(k84.q1 q1Var, w64.n nVar) {
        this.f386524d = q1Var;
        this.f386525e = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$bindTagInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k84.m mVar = (k84.m) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) k84.q1.z(this.f386524d)).mo144003x754a37bb();
        if (mVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$bindTagInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$3");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
        if (mVar.f386643a && !mVar.b() && !mVar.a()) {
            this.f386525e.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$bindTagInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$3");
    }
}
