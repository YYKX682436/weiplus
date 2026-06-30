package c13;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y03.f f37899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f37904i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37905m;

    public q(y03.f fVar, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f37899d = fVar;
        this.f37900e = i17;
        this.f37901f = i18;
        this.f37902g = i19;
        this.f37903h = i27;
        this.f37904i = i28;
        this.f37905m = i29;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.flutter_voip.FLTextureInfo fLTextureInfo = new com.tencent.pigeon.flutter_voip.FLTextureInfo(this.f37899d.f458638a, this.f37900e, this.f37901f, this.f37902g, false);
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onTextureInfoChanged(fLTextureInfo, new c13.p(this.f37899d, this.f37900e, this.f37901f, this.f37902g, this.f37903h, this.f37904i, this.f37905m, fLTextureInfo));
        }
    }
}
