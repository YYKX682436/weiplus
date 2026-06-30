package ci5;

/* loaded from: classes12.dex */
public final class x implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f41809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41811h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gg3.c f41812i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ci5.j f41813m;

    public x(ci5.b0 b0Var, java.lang.String str, java.lang.Runnable runnable, java.lang.String str2, mf3.k kVar, gg3.c cVar, ci5.j jVar) {
        this.f41807d = b0Var;
        this.f41808e = str;
        this.f41809f = runnable;
        this.f41810g = str2;
        this.f41811h = kVar;
        this.f41812i = cVar;
        this.f41813m = jVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "getCdnAuthInfo");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        pm0.v.X(new ci5.w(this.f41807d, this.f41808e, i17, gVar, hVar, z17, this.f41809f, this.f41810g, this.f41811h, this.f41812i, this.f41813m));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
