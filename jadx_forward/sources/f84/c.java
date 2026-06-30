package f84;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.d f341709d;

    public c(f84.d dVar) {
        this.f341709d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$mOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        f84.d dVar = this.f341709d;
        if (view != null) {
            try {
                dVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = dVar.f341712f;
                int u07 = c1163xf1deaba4 != null ? c1163xf1deaba4.u0(view) : -1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick, pos=");
                sb6.append(u07);
                sb6.append(", itemCount=");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAdBrandTopicInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAdBrandTopicInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                java.util.List b17 = dVar.f341711e.b();
                sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBrandTopicAdapter", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                f84.b0 x17 = dVar.x(u07);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                if (x17 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                    f84.b bVar = dVar.f341714h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                    if (bVar != null) {
                        ((f84.o) bVar).a(view, u07, x17);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdBrandTopicAdapter", "onClick, itemInfo==null");
                }
            } catch (java.lang.Throwable th6) {
                ca4.q.c("AdBrandTopicAdapter", th6);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$mOnClickListener$1");
    }
}
