package bu3;

/* loaded from: classes10.dex */
public final class c extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f106123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bu3.f f106124e;

    public c(bu3.f fVar, java.util.ArrayList resourceArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceArray, "resourceArray");
        this.f106124e = fVar;
        this.f106123d = resourceArray;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f106123d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.lang.Object obj = this.f106123d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        bu3.a aVar = new bu3.a(context, null, true);
        bu3.b bVar = (bu3.b) getItem(i17);
        aVar.m11318x62f3ee3d(bVar.f106121a);
        aVar.m11321x7650bebc(bVar.f106122b);
        bu3.f fVar = this.f106124e;
        android.widget.GridView gridView = fVar.f106131h;
        int b17 = i65.a.b(gridView != null ? gridView.getContext() : null, fVar.f106127d);
        aVar.setLayoutParams(new android.widget.AbsListView.LayoutParams(b17, b17));
        if (aVar.m11315xfb85f7b0() == fVar.f106132i) {
            aVar.m11319x62966993(true);
        } else {
            aVar.m11319x62966993(false);
        }
        return aVar;
    }
}
