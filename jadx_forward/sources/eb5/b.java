package eb5;

/* loaded from: classes5.dex */
public class b implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f332452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb5.d f332453e;

    public b(eb5.d dVar, int i17) {
        this.f332453e = dVar;
        this.f332452d = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        eb5.d dVar = this.f332453e;
        eb5.c cVar = dVar.f332455e;
        if (cVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        int i17 = this.f332452d;
        boolean a17 = cVar.a(i17, view, dVar.x(i17));
        yj0.a.i(a17, this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return a17;
    }
}
