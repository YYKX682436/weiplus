package wu;

/* loaded from: classes8.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.p1 f531140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f531141e;

    public o1(wu.p1 p1Var, hu.b bVar) {
        this.f531140d = p1Var;
        this.f531141e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailTingSpaceItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f531140d.o(view, this.f531141e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailTingSpaceItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
