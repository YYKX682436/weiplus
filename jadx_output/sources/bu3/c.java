package bu3;

/* loaded from: classes10.dex */
public final class c extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f24590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bu3.f f24591e;

    public c(bu3.f fVar, java.util.ArrayList resourceArray) {
        kotlin.jvm.internal.o.g(resourceArray, "resourceArray");
        this.f24591e = fVar;
        this.f24590d = resourceArray;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24590d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.lang.Object obj = this.f24590d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.d(viewGroup);
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bu3.a aVar = new bu3.a(context, null, true);
        bu3.b bVar = (bu3.b) getItem(i17);
        aVar.setDrawColor(bVar.f24588a);
        aVar.setType(bVar.f24589b);
        bu3.f fVar = this.f24591e;
        android.widget.GridView gridView = fVar.f24598h;
        int b17 = i65.a.b(gridView != null ? gridView.getContext() : null, fVar.f24594d);
        aVar.setLayoutParams(new android.widget.AbsListView.LayoutParams(b17, b17));
        if (aVar.getType() == fVar.f24599i) {
            aVar.setHasSelected(true);
        } else {
            aVar.setHasSelected(false);
        }
        return aVar;
    }
}
