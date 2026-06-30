package id2;

/* loaded from: classes3.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372189d;

    public l2(id2.u3 u3Var) {
        this.f372189d = u3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$fakeInsertCreateLiveEntranceToList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f372189d.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$fakeInsertCreateLiveEntranceToList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
