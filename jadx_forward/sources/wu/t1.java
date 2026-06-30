package wu;

/* loaded from: classes9.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.u1 f531161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f531162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f531163f;

    public t1(wu.u1 u1Var, com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905, hu.b bVar) {
        this.f531161d = u1Var;
        this.f531162e = abstractC11172x705e5905;
        this.f531163f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailUrlItemConvert$onBindContainerView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f531161d.o(this.f531162e, this.f531163f);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailUrlItemConvert$onBindContainerView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
