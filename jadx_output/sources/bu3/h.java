package bu3;

/* loaded from: classes10.dex */
public final class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f24604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin f24605e;

    public h(com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin photoDoodlePlugin, java.util.ArrayList resourceArray) {
        kotlin.jvm.internal.o.g(resourceArray, "resourceArray");
        this.f24605e = photoDoodlePlugin;
        this.f24604d = resourceArray;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24604d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.lang.Object obj = this.f24604d.get(i17);
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
        bu3.a aVar = new bu3.a(context, null, false);
        bu3.g gVar = (bu3.g) getItem(i17);
        android.graphics.Bitmap bitmap = gVar.f24601a;
        ht3.m mVar = ht3.m.f284954a;
        if (bitmap == null) {
            aVar.setDrawColor(gVar.f24602b);
            mVar.b(aVar, gVar.f24602b);
        } else {
            kotlin.jvm.internal.o.d(bitmap);
            aVar.setBitmap(bitmap);
            mVar.b(aVar, gVar.f24603c);
        }
        aVar.setType(gVar.f24603c);
        com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin photoDoodlePlugin = this.f24605e;
        aVar.setBgPadding(photoDoodlePlugin.getPaddingDp());
        android.widget.GridView colorList = photoDoodlePlugin.getColorList();
        int b17 = i65.a.b(colorList != null ? colorList.getContext() : null, photoDoodlePlugin.getImageSizeDP());
        aVar.setLayoutParams(new android.widget.AbsListView.LayoutParams(b17, b17));
        if (aVar.getType() == photoDoodlePlugin.getSelectType()) {
            aVar.setHasSelected(true);
        } else {
            aVar.setHasSelected(false);
        }
        return aVar;
    }
}
