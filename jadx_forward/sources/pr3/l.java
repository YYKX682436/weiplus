package pr3;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f439512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0 f439513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439514f;

    public l(pr3.c cVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0 c21496xac9ac3d0, int i17) {
        this.f439512d = cVar;
        this.f439513e = c21496xac9ac3d0;
        this.f439514f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/more_info/InfoItemConvert$onBindViewHolder$1$grid$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f439512d.f439498s;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f439513e.m78973xfb7e5820(), java.lang.Integer.valueOf(this.f439514f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/more_info/InfoItemConvert$onBindViewHolder$1$grid$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
