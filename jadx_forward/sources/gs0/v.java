package gs0;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.w f356558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.media.ImageReader f356559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rs0.h f356560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f356561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f356562h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f356563i;

    public v(gs0.w wVar, android.media.ImageReader imageReader, rs0.h hVar, int i17, int i18, int i19) {
        this.f356558d = wVar;
        this.f356559e = imageReader;
        this.f356560f = hVar;
        this.f356561g = i17;
        this.f356562h = i18;
        this.f356563i = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.g gVar = rs0.i.f480829a;
        android.view.Surface surface = this.f356559e.getSurface();
        rs0.h hVar = this.f356560f;
        rs0.h n17 = rs0.g.n(gVar, surface, null, 0, 0, hVar.f480827c, 14, null);
        gs0.w wVar = this.f356558d;
        wVar.f356572i = n17;
        wVar.f356571h = new os0.g(0, 0, 0, 0, 1, 15, null);
        os0.g gVar2 = wVar.f356571h;
        if (gVar2 != null) {
            gVar2.u(wVar.f356573j, wVar.f356574k);
        }
        os0.g gVar3 = wVar.f356571h;
        int i17 = this.f356561g;
        if (gVar3 != null) {
            gVar3.U = i17;
        }
        int i18 = this.f356563i;
        int i19 = this.f356562h;
        if (gVar3 != null) {
            gVar3.w(i19, i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "create rgb2yuvEGLEnvironment:" + wVar.f356572i + ", shareEGLContext:" + hVar.f480827c + ", texId:" + i17 + ", texSize:[" + i19 + ", " + i18 + ']');
    }
}
