package c13;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.a f37914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37917g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37918h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f37919i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37920m;

    public s(b13.a aVar, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f37914d = aVar;
        this.f37915e = i17;
        this.f37916f = i18;
        this.f37917g = i19;
        this.f37918h = i27;
        this.f37919i = i28;
        this.f37920m = i29;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.flutter_voip.FLTextureInfo fLTextureInfo = new com.tencent.pigeon.flutter_voip.FLTextureInfo(this.f37914d.f17086a, this.f37915e, this.f37916f, this.f37917g, false);
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onTextureInfoChanged(fLTextureInfo, new c13.r(this.f37914d, this.f37915e, this.f37916f, this.f37917g, this.f37918h, this.f37919i, this.f37920m, fLTextureInfo));
        }
    }
}
