package ci5;

/* loaded from: classes12.dex */
public final class o implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.q f123295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f123297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123299h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123300i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123301m;

    public o(ci5.q qVar, java.lang.String str, java.lang.Runnable runnable, java.lang.String str2, mf3.k kVar, sf3.g gVar, sf3.g gVar2) {
        this.f123295d = qVar;
        this.f123296e = str;
        this.f123297f = runnable;
        this.f123298g = str2;
        this.f123299h = kVar;
        this.f123300i = gVar;
        this.f123301m = gVar2;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "getCdnAuthInfo, mediaId=" + str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        pm0.v.X(new ci5.n(this.f123295d, this.f123296e, i17, gVar, hVar, z17, this.f123297f, this.f123298g, this.f123299h, this.f123300i, this.f123301m));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
