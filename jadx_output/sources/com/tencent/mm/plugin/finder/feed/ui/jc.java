package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class jc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI f110188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110189e;

    public jc(com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI finderLiveRemindConsumeWecoinUI, int i17) {
        this.f110188d = finderLiveRemindConsumeWecoinUI;
        this.f110189e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveRemindConsumeWecoinUI$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI finderLiveRemindConsumeWecoinUI = this.f110188d;
        int i17 = 0;
        for (java.lang.Object obj : finderLiveRemindConsumeWecoinUI.f109409v) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((com.tencent.mm.plugin.finder.feed.ui.lc) obj).f110268b = i17 == this.f110189e;
            i17 = i18;
        }
        finderLiveRemindConsumeWecoinUI.f109410w.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveRemindConsumeWecoinUI$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
