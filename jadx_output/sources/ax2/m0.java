package ax2;

/* loaded from: classes.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView f15074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f15075e;

    public m0(com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView, java.util.LinkedList linkedList) {
        this.f15074d = livePkCritDoingView;
        this.f15075e = linkedList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setGiftPeopleCntTaskContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f15074d.f131844v;
        if (lVar != null) {
            r45.zh5 zh5Var = (r45.zh5) kz5.n0.Z(this.f15075e);
            if (zh5Var == null || (str = zh5Var.getString(3)) == null) {
                str = "";
            }
            lVar.invoke(str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoingView$setGiftPeopleCntTaskContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
