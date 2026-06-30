package s74;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485795d;

    public f(s74.o0 o0Var) {
        this.f485795d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$bindComponentModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.o0 o0Var = this.f485795d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f17 = o0Var.C().f();
        if ((f17 != null ? f17.T : null) == null) {
            ca4.q.c("getNullClickListener2", null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f18 = o0Var.C().f();
        if (f18 != null && (onClickListener = f18.T) != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$bindComponentModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$1");
    }
}
