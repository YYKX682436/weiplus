package ci5;

/* loaded from: classes12.dex */
public final class o implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.q f41762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f41764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41765g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41767i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41768m;

    public o(ci5.q qVar, java.lang.String str, java.lang.Runnable runnable, java.lang.String str2, mf3.k kVar, sf3.g gVar, sf3.g gVar2) {
        this.f41762d = qVar;
        this.f41763e = str;
        this.f41764f = runnable;
        this.f41765g = str2;
        this.f41766h = kVar;
        this.f41767i = gVar;
        this.f41768m = gVar2;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "getCdnAuthInfo, mediaId=" + str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        pm0.v.X(new ci5.n(this.f41762d, this.f41763e, i17, gVar, hVar, z17, this.f41764f, this.f41765g, this.f41766h, this.f41767i, this.f41768m));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
