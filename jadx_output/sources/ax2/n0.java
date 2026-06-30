package ax2;

/* loaded from: classes.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView f15077d;

    public n0(com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView) {
        this.f15077d = livePkCritDoingView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.LinearLayout contentLayoutOne;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setGiftPeopleCntTaskContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView = this.f15077d;
        contentLayoutOne = livePkCritDoingView.getContentLayoutOne();
        android.view.View childAt = contentLayoutOne.getChildAt(0);
        java.lang.Object tag = childAt != null ? childAt.getTag() : null;
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null) {
            str = "";
        }
        yz5.l lVar = livePkCritDoingView.f131844v;
        if (lVar != null) {
            lVar.invoke(str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setGiftPeopleCntTaskContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
