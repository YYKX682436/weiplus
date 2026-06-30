package c13;

/* loaded from: classes11.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y03.f f37891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37895h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f37896i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f37897m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_voip.FLTextureInfo f37898n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y03.f fVar, int i17, int i18, int i19, int i27, int i28, int i29, com.tencent.pigeon.flutter_voip.FLTextureInfo fLTextureInfo) {
        super(1);
        this.f37891d = fVar;
        this.f37892e = i17;
        this.f37893f = i18;
        this.f37894g = i19;
        this.f37895h = i27;
        this.f37896i = i28;
        this.f37897m = i29;
        this.f37898n = fLTextureInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        boolean b17 = kotlin.jvm.internal.o.b(kotlin.Result.m527isFailureimpl(value) ? null : value, java.lang.Boolean.TRUE);
        int i17 = this.f37894g;
        int i18 = this.f37896i;
        int i19 = this.f37895h;
        y03.f fVar = this.f37891d;
        if (b17) {
            fVar.f458641d = this.f37892e;
            fVar.f458642e = this.f37893f;
            fVar.f458643f = i17;
        } else {
            fVar.f458641d = i19;
            fVar.f458642e = i18;
            fVar.f458643f = this.f37897m;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback onTextureInfoChanged textureId:");
        com.tencent.pigeon.flutter_voip.FLTextureInfo fLTextureInfo = this.f37898n;
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
