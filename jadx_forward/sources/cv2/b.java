package cv2;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cv2.c f304096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh4.a f304097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f304098f;

    public b(cv2.c cVar, uh4.a aVar, r45.kv2 kv2Var) {
        this.f304096d = cVar;
        this.f304097e = aVar;
        this.f304098f = kv2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/teenmode/FinderAuthorizationFiller$fillCellByWard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cv2.c.f(this.f304096d, this.f304097e, this.f304098f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/teenmode/FinderAuthorizationFiller$fillCellByWard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
