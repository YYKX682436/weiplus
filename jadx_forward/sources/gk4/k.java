package gk4;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f354119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk4.x f354120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hk4.a f354121f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gk4.r rVar, hk4.x xVar, hk4.a aVar) {
        super(1);
        this.f354119d = rVar;
        this.f354120e = xVar;
        this.f354121f = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        gk4.r rVar = this.f354119d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f354135g, "real set videoPlayer inputSurface:" + surfaceTexture);
        hk4.x xVar = this.f354120e;
        xVar.getClass();
        java.lang.String str = xVar.f363518k;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setInputSurface:" + surfaceTexture);
        kk4.v vVar = xVar.f363519l;
        if (surfaceTexture != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setInputSurface, default buffer size:[" + xVar.f363522o + ", " + xVar.f363523p + ']');
            int i18 = xVar.f363522o;
            if (i18 > 0 && (i17 = xVar.f363523p) > 0) {
                surfaceTexture.setDefaultBufferSize(i18, i17);
            }
            vVar.J(new android.view.Surface(surfaceTexture), false);
        } else {
            vVar.J(null, false);
        }
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new gk4.q(rVar, surfaceTexture));
        }
        this.f354121f.f363464j = true;
        return jz5.f0.f384359a;
    }
}
