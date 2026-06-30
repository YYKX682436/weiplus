package b30;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f17587d;

    public y(yz5.a aVar) {
        this.f17587d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/util/ViewExt$onClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f17587d.invoke();
        yj0.a.h(this, "com/tencent/mm/feature/ecs/util/ViewExt$onClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
