package bp4;

/* loaded from: classes5.dex */
public final class q extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bp4.x f23351g;

    public q(bp4.x xVar) {
        this.f23351g = xVar;
        setHasStableIds(true);
    }

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new bp4.u(this.f23351g, context);
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) x(i17)).f138434i;
    }

    @Override // eb5.d
    /* renamed from: y */
    public void onBindViewHolder(eb5.e viewWrapper, int i17) {
        kotlin.jvm.internal.o.g(viewWrapper, "viewWrapper");
        super.onBindViewHolder(viewWrapper, i17);
        bp4.u uVar = (bp4.u) viewWrapper.f250924n;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) x(i17);
        i95.m c17 = i95.n0.c(e42.e0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((h62.d) ((e42.e0) c17)).Ni(e42.c0.clicfg_finder_post_edit_thumb_load_use_finder_api, 1) == 1) {
            i95.m c18 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ya2.l.f460502a.h(galleryItem$MediaItem.o(), uVar.getImageView(), mn2.f1.B);
        } else {
            e33.m6.b(uVar.getImageView(), galleryItem$MediaItem.getType(), galleryItem$MediaItem.o(), galleryItem$MediaItem.f138430e, galleryItem$MediaItem.f138434i, -1, null, galleryItem$MediaItem.f138435m);
        }
        long j17 = galleryItem$MediaItem.f138434i;
        bp4.x xVar = this.f23351g;
        uVar.setSelected(j17 == xVar.f23419i);
        uVar.setFocusable(galleryItem$MediaItem.f138434i == xVar.f23419i);
    }

    @Override // eb5.d, androidx.recyclerview.widget.f2
    /* renamed from: z */
    public void onBindViewHolder(eb5.e holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
        }
    }
}
