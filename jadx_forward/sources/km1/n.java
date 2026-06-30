package km1;

/* loaded from: classes7.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f390551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f390552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(km1.s sVar, yz5.l lVar) {
        super(1);
        this.f390551d = sVar;
        this.f390552e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390551d.f390562f, "replaceCallback#setupWebGLExtTextureIfNeed, extTexture: " + surfaceTexture);
        this.f390551d.f390572s = surfaceTexture;
        if (surfaceTexture != null) {
            this.f390552e.mo146xb9724478(surfaceTexture);
        }
        return jz5.f0.f384359a;
    }
}
