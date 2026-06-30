package bu3;

/* loaded from: classes10.dex */
public final class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f106137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de f106138e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de c17001x433744de, java.util.ArrayList resourceArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceArray, "resourceArray");
        this.f106138e = c17001x433744de;
        this.f106137d = resourceArray;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f106137d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.lang.Object obj = this.f106137d.get(i17);
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
        bu3.a aVar = new bu3.a(context, null, false);
        bu3.g gVar = (bu3.g) getItem(i17);
        android.graphics.Bitmap bitmap = gVar.f106134a;
        ht3.m mVar = ht3.m.f366487a;
        if (bitmap == null) {
            aVar.m11318x62f3ee3d(gVar.f106135b);
            mVar.b(aVar, gVar.f106135b);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            aVar.m11317x5854831(bitmap);
            mVar.b(aVar, gVar.f106136c);
        }
        aVar.m11321x7650bebc(gVar.f106136c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de c17001x433744de = this.f106138e;
        aVar.m11316x1cb591ca(c17001x433744de.getPaddingDp());
        android.widget.GridView colorList = c17001x433744de.getColorList();
        int b17 = i65.a.b(colorList != null ? colorList.getContext() : null, c17001x433744de.getImageSizeDP());
        aVar.setLayoutParams(new android.widget.AbsListView.LayoutParams(b17, b17));
        if (aVar.m11315xfb85f7b0() == c17001x433744de.getSelectType()) {
            aVar.m11319x62966993(true);
        } else {
            aVar.m11319x62966993(false);
        }
        return aVar;
    }
}
