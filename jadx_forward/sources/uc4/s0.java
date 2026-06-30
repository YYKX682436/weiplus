package uc4;

/* loaded from: classes4.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.t0 f507985d;

    public s0(uc4.t0 t0Var) {
        this.f507985d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$register$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveMusicClick$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.setTag(this.f507985d.n());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) view.getTag();
            android.content.Context context = view.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playMusic", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wm.e(i2Var.f250082a, context, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playMusic", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickMediaIcon", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveMusicClick$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$register$1");
    }
}
