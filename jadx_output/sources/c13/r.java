package c13;

/* loaded from: classes11.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.a f37906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37909g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f37911i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37912m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_voip.FLTextureInfo f37913n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b13.a aVar, int i17, int i18, int i19, int i27, int i28, int i29, com.tencent.pigeon.flutter_voip.FLTextureInfo fLTextureInfo) {
        super(1);
        this.f37906d = aVar;
        this.f37907e = i17;
        this.f37908f = i18;
        this.f37909g = i19;
        this.f37910h = i27;
        this.f37911i = i28;
        this.f37912m = i29;
        this.f37913n = fLTextureInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        boolean b17 = kotlin.jvm.internal.o.b(kotlin.Result.m527isFailureimpl(value) ? null : value, java.lang.Boolean.TRUE);
        int i17 = this.f37909g;
        int i18 = this.f37911i;
        int i19 = this.f37910h;
        b13.a aVar = this.f37906d;
        if (b17) {
            aVar.f17089d = this.f37907e;
            aVar.f17090e = this.f37908f;
            aVar.f17091f = i17;
        } else {
            aVar.f17089d = i19;
            aVar.f17090e = i18;
            aVar.f17091f = this.f37912m;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback onTextureInfoChanged textureId:");
        com.tencent.pigeon.flutter_voip.FLTextureInfo fLTextureInfo = this.f37913n;
        sb6.append(fLTextureInfo.getTextureId());
        sb6.append(", width:");
        sb6.append(fLTextureInfo.getWidth());
        sb6.append(", height:");
        sb6.append(fLTextureInfo.getHeight());
        sb6.append(", orientation:");
        sb6.append(i17);
        sb6.append(", oldWidth:");
        sb6.append(i19);
        sb6.append(", oldHeight:");
        sb6.append(i18);
        sb6.append(", ret:");
        sb6.append((java.lang.Object) kotlin.Result.m529toStringimpl(value));
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", sb6.toString());
        return jz5.f0.f302826a;
    }
}
