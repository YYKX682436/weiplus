package ze;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f553268d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f553269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f553270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f553271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ze.l f553272h;

    public k(ze.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, java.lang.Runnable runnable) {
        this.f553272h = lVar;
        this.f553269e = c11510xdd90c2f2;
        this.f553270f = c11510xdd90c2f22;
        this.f553271g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f553268d.getAndSet(true)) {
            return;
        }
        super/*com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer*/.R(this.f553269e, this.f553270f, this.f553271g);
    }
}
