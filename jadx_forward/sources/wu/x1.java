package wu;

/* loaded from: classes8.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.y1 f531176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f531177e;

    public x1(wu.y1 y1Var, hu.b bVar) {
        this.f531176d = y1Var;
        this.f531177e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailVideoItemConvert$onBindContainerView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f531176d.o(view, this.f531177e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailVideoItemConvert$onBindContainerView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
