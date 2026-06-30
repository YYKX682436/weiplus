package wu;

/* loaded from: classes8.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.l0 f531121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f531122e;

    public k0(wu.l0 l0Var, hu.b bVar) {
        this.f531121d = l0Var;
        this.f531122e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailNoteItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f531121d.o(view, this.f531122e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailNoteItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
