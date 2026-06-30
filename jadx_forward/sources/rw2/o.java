package rw2;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f482152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rw2.t tVar) {
        super(0);
        this.f482152d = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        is0.c cVar = new is0.c(false, 15L);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f375928e);
        rw2.t tVar = this.f482152d;
        tVar.f482165i = surfaceTexture;
        tVar.f482164h = new android.view.Surface(tVar.f482165i);
        android.graphics.SurfaceTexture surfaceTexture2 = tVar.f482165i;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(new rw2.n(tVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f482159c, "createVideoTexture finished texId:" + cVar.f375928e);
        tVar.f482166j = cVar;
        return jz5.f0.f384359a;
    }
}
