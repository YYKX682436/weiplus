package xj1;

/* loaded from: classes7.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj1.x f536352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f536353e;

    public w(xj1.x xVar, int i17) {
        this.f536352d = xVar;
        this.f536353e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionDragSortAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xj1.x xVar = this.f536352d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = xVar.f536355e;
        if (c22722xd3be5395 != null) {
            c22722xd3be5395.F1 = false;
            c22722xd3be5395.u(this.f536353e, 0.0f);
        }
        android.content.Context context = xVar.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ul1.j jVar = new ul1.j(context, true);
        jVar.a((java.lang.String) xVar.f536357g.mo141623x754a37bb());
        jVar.b(1500L);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionDragSortAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
