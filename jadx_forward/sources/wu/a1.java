package wu;

/* loaded from: classes8.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.b1 f531073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f531074e;

    public a1(wu.b1 b1Var, hu.b bVar) {
        this.f531073d = b1Var;
        this.f531074e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailRecordItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f531073d.o(view, this.f531074e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailRecordItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
