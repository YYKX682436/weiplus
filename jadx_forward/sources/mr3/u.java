package mr3;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mr3.v f412436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mr3.l f412437e;

    public u(mr3.v vVar, mr3.l lVar) {
        this.f412436d = vVar;
        this.f412437e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f412436d.f412441h.mo146xb9724478(this.f412437e);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
