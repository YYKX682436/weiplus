package bp4;

/* loaded from: classes10.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f23271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23271d = galleryItem$MediaItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bp4.m3(this.f23271d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bp4.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t23.j h17 = t23.p0.h();
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f23271d;
        java.lang.String str = galleryItem$MediaItem.f138430e;
        return h17.g(str, str, galleryItem$MediaItem.f138434i, null, galleryItem$MediaItem.f138435m);
    }
}
