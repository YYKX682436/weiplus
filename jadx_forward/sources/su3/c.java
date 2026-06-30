package su3;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su3.d f494306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f494307e;

    public c(su3.d dVar, int i17) {
        this.f494306d = dVar;
        this.f494307e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        su3.d dVar = this.f494306d;
        int i17 = dVar.f494309e;
        int i18 = this.f494307e;
        dVar.f494309e = i18;
        dVar.m8147xed6e4d18(i17);
        dVar.m8147xed6e4d18(dVar.f494309e);
        yz5.p pVar = dVar.f494310f;
        if (pVar != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            java.lang.Object obj = dVar.f494308d.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            pVar.mo149xb9724478(valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
