package bp4;

/* loaded from: classes10.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f23294d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f23295e;

    /* renamed from: f, reason: collision with root package name */
    public int f23296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bp4.o3 f23297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f23299i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f23300m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(bp4.o3 o3Var, int i17, boolean z17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23297g = o3Var;
        this.f23298h = i17;
        this.f23299i = z17;
        this.f23300m = galleryItem$MediaItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bp4.n3(this.f23297g, this.f23298h, this.f23299i, this.f23300m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bp4.n3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp4.n3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
