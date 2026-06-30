package lm1;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm1.t f400890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f400891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(lm1.t tVar, android.view.Surface surface) {
        super(1);
        this.f400890d = tVar;
        this.f400891e = surface;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "replaceCallback, newTexture: " + surfaceTexture);
        if (surfaceTexture == null) {
            bg.f fVar = this.f400890d.f400892a;
            if (fVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoPluginHandler");
                throw null;
            }
            fVar.Q(new bg.p0(fVar, this.f400891e));
        } else {
            android.view.Surface surface = this.f400890d.f400897f;
            if (surface != null) {
                surface.release();
            }
            this.f400890d.f400897f = new android.view.Surface(surfaceTexture);
            lm1.t tVar = this.f400890d;
            bg.f fVar2 = tVar.f400892a;
            if (fVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoPluginHandler");
                throw null;
            }
            fVar2.Q(new bg.p0(fVar2, tVar.f400897f));
        }
        return jz5.f0.f384359a;
    }
}
