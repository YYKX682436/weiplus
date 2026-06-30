package wu;

/* loaded from: classes8.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.d0 f531076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f531077e;

    public b0(wu.d0 d0Var, hu.b bVar) {
        this.f531076d = d0Var;
        this.f531077e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailFinderNameCardItemConvert$onBindContainerView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f531076d.o(view, this.f531077e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailFinderNameCardItemConvert$onBindContainerView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
