package vr;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f520964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vr.u f520966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f520967h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, boolean z17, java.lang.String str2, vr.u uVar, byte[] bArr) {
        super(1);
        this.f520963d = str;
        this.f520964e = z17;
        this.f520965f = str2;
        this.f520966g = uVar;
        this.f520967h = bArr;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String originPath = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originPath, "originPath");
        boolean z17 = originPath.length() == 0;
        java.lang.String str = this.f520963d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "resolveOriginEmoticonPath failed, skip callback. md5=" + str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "onEmoticonSelected md5=" + str + " fromSearch=" + this.f520964e + " thumb=" + this.f520965f + " cover=" + originPath);
            ym5.a1.f(new vr.r(this.f520966g, this.f520964e, this.f520967h, this.f520965f, originPath));
        }
        return jz5.f0.f384359a;
    }
}
