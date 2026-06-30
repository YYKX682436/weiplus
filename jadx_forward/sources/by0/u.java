package by0;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f117882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fv0.a f117883e;

    public u(yz5.l lVar, fv0.a aVar) {
        this.f117882d = lVar;
        this.f117883e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/utils/ViewExt$createEditItem$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f117882d.mo146xb9724478(this.f117883e);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/utils/ViewExt$createEditItem$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
