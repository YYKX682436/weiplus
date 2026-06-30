package o74;

/* loaded from: classes4.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder f425100d;

    public e(o74.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        this.f425100d = baseViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = this.f425100d.f250802f0;
        if (g9Var != null && (view2 = g9Var.f249951h) != null) {
            view2.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$1");
    }
}
