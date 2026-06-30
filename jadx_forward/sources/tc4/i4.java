package tc4;

/* loaded from: classes4.dex */
public final class i4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.k4 f498904d;

    public i4(tc4.k4 k4Var) {
        this.f498904d = k4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$onBindViewHolder$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$onBindViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoContainer$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2203x72ce5378.p2208x373aa5.C18356x4db012f4 c18356x4db012f4 = this.f498904d.f498926z1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoContainer$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        if (c18356x4db012f4 != null) {
            c18356x4db012f4.performLongClick();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$onBindViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$onBindViewHolder$4");
        return true;
    }
}
