package wu;

/* loaded from: classes.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.e2 f531166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f531167e;

    public v0(wu.e2 e2Var, hu.b bVar) {
        this.f531166d = e2Var;
        this.f531167e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailOtherItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f531166d.f531099b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        pVar.mo149xb9724478(view, this.f531167e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailOtherItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
