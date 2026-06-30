package mr3;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mr3.j f412400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mr3.l f412401e;

    public i(mr3.j jVar, mr3.l lVar) {
        this.f412400d = jVar;
        this.f412401e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageAddItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f412400d.f412403f.mo146xb9724478(this.f412401e);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageAddItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
