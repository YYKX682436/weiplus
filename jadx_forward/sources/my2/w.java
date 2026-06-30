package my2;

/* loaded from: classes3.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.y f414304d;

    public w(my2.y yVar) {
        this.f414304d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubbleViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        my2.a aVar = this.f414304d.f414309i;
        if (aVar != null) {
            ((my2.u) aVar).g();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubbleViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
