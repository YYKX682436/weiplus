package bp4;

/* loaded from: classes5.dex */
public final class w implements eb5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.x f23399a;

    public w(bp4.x xVar) {
        this.f23399a = xVar;
    }

    @Override // eb5.c
    public boolean a(int i17, android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem item = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        return false;
    }

    @Override // eb5.c
    public void b(int i17, android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem item = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        long j17 = item.f138434i;
        bp4.x xVar = this.f23399a;
        xVar.f23419i = j17;
        bp4.q qVar = xVar.f23418h;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        qVar.notifyDataSetChanged();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE", item);
        xVar.f465332d.w(ju3.c0.f301872d2, bundle);
    }
}
