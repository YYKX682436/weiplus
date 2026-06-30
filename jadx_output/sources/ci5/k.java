package ci5;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f41733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ci5.q f41734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41737h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, ci5.q qVar, mf3.k kVar, sf3.g gVar, java.lang.String str) {
        super(0);
        this.f41733d = z17;
        this.f41734e = qVar;
        this.f41735f = kVar;
        this.f41736g = gVar;
        this.f41737h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f41733d;
        sf3.g gVar = this.f41736g;
        mf3.k kVar = this.f41735f;
        ci5.q qVar = this.f41734e;
        if (z17) {
            qVar.W6(kVar, sf3.k.f407397e, gVar);
        } else {
            com.tencent.mars.xlog.Log.e("MediaGallery.FinderLiveImageStateManager", "moveFileWithCheck failed for mediaId: " + this.f41737h);
            qVar.W6(kVar, sf3.k.f407398f, gVar);
        }
        return jz5.f0.f302826a;
    }
}
