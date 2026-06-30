package eu3;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu3.c f338352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338353e;

    public b(eu3.c cVar, int i17) {
        this.f338352d = cVar;
        this.f338353e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/adapter/ImproveEditPhotoBrushListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eu3.c cVar = this.f338352d;
        int i17 = cVar.f338355e;
        int i18 = this.f338353e;
        if (i17 == i18) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/adapter/ImproveEditPhotoBrushListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoBrushListAdapter", "setOnClickListener >> " + cVar.f338355e + ", " + i18);
        android.view.View view2 = cVar.f338356f;
        if (view2 != null) {
            cVar.x(view2, 1.0f);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        cVar.x(view, 1.4f);
        cVar.f338356f = view;
        cVar.f338355e = i18;
        yz5.p pVar = cVar.f338358h;
        if (pVar != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            java.lang.Object obj = cVar.f338354d.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            pVar.mo149xb9724478(valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/adapter/ImproveEditPhotoBrushListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
