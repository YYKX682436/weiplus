package lj5;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj5.a f400522d;

    public a(mj5.a aVar) {
        this.f400522d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/viewfactory/FooterBarFactoryView$onUpdateViewModel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mj5.a aVar = this.f400522d;
        if (aVar != null && (onClickListener = aVar.f408620e) != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/viewfactory/FooterBarFactoryView$onUpdateViewModel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
