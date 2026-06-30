package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class fs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs f249891d;

    public fs(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        this.f249891d = bsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f249891d;
        bsVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (baseViewHolder == null || baseViewHolder.f38400x3172ed) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        } else {
            java.util.HashMap hashMap = bsVar.f249584q;
            if (hashMap.containsKey(baseViewHolder.f250801f) && ((java.lang.Integer) hashMap.get(baseViewHolder.f250801f)).equals(0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            } else if (hashMap.containsKey(baseViewHolder.f250801f) && ((java.lang.Integer) hashMap.get(baseViewHolder.f250801f)).equals(1)) {
                hashMap.put(baseViewHolder.f250801f, 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "descCollapListener onClick: SPREAD");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            } else {
                hashMap.put(baseViewHolder.f250801f, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineBaseAdapter", "descCollapListener onClick: SHRINK");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            }
        }
        bsVar.f249568a.mo70852xced61ae5();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
    }
}
