package ac2;

/* loaded from: classes2.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.y f3065d;

    public x(ac2.y yVar) {
        this.f3065d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$onRefreshError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ac2.y yVar = this.f3065d;
        yVar.f3066r.C = false;
        yVar.C();
        yVar.f3066r.P();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback$onRefreshError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
