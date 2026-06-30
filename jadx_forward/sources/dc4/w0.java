package dc4;

/* loaded from: classes4.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.x0 f310385d;

    public w0(dc4.x0 x0Var) {
        this.f310385d = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/detail/item/TopicCardDetailItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dc4.x0 x0Var = this.f310385d;
        w74.b bVar = x0Var.D;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBarClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            bVar.f525053d++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBarClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
        }
        x0Var.l(view, x0Var.f310365e);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/detail/item/TopicCardDetailItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem$1");
    }
}
