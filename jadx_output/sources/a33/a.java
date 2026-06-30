package a33;

/* loaded from: classes10.dex */
public final class a implements t23.k1 {

    /* renamed from: d, reason: collision with root package name */
    public long f1052d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f1053e;

    @Override // t23.k1
    public void F6(java.util.LinkedList albumItems) {
        kotlin.jvm.internal.o.g(albumItems, "albumItems");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f1052d;
        java.lang.String str = a33.c.f1060e;
        java.util.Iterator it = albumItems.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) it.next()).f138417f;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem(str, i17);
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) kz5.n0.Z(albumItems);
        galleryItem$AlbumItem.f138420i = galleryItem$AlbumItem2 != null ? galleryItem$AlbumItem2.f138420i : null;
        albumItems.add(0, galleryItem$AlbumItem);
        yz5.p pVar = this.f1053e;
        if (pVar != null) {
            pVar.invoke(albumItems, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
