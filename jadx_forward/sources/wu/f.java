package wu;

/* loaded from: classes9.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.k f531100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f531101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f531102f;

    public f(wu.k kVar, com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905, hu.b bVar) {
        this.f531100d = kVar;
        this.f531101e = abstractC11172x705e5905;
        this.f531102f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailAskShareItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f531100d.o(this.f531101e, this.f531102f);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailAskShareItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
