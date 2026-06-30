package bg;

/* loaded from: classes7.dex */
public class n0 implements tf.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f19820a;

    public n0(bg.f fVar) {
        this.f19820a = fVar;
    }

    @Override // tf.v
    public void a(android.view.Surface surface) {
        if (surface != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onSetPlaybackSurface surface:%d", java.lang.Integer.valueOf(surface.hashCode()));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onSetPlaybackSurface surface null");
        }
        this.f19820a.T(surface);
    }

    @Override // tf.v
    public float b() {
        bg.f fVar = this.f19820a;
        if (fVar.B() <= 0) {
            return 1.0f;
        }
        return (fVar.f19764h != null ? r1.getVideoWidth() : 0) / fVar.B();
    }

    @Override // tf.v
    public void c(java.lang.String str) {
        boolean equalsIgnoreCase = com.tencent.tav.core.AssetExtension.SCENE_PLAY.equalsIgnoreCase(str);
        bg.f fVar = this.f19820a;
        if (equalsIgnoreCase) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "IVideoPlayerAddOnVideoController operate, play");
            fVar.W = true;
            fVar.Q(new bg.t(fVar));
        } else if ("stop".equalsIgnoreCase(str)) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "IVideoPlayerAddOnVideoController operate, stop");
            fVar.Q(new bg.f$$b(fVar));
        } else if ("pause".equalsIgnoreCase(str)) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "IVideoPlayerAddOnVideoController operate, pause");
            fVar.Q(new bg.f$$c(fVar, false));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.VideoPluginHandler", "IVideoPlayerAddOnVideoController not support: " + str);
        }
    }

    @Override // tf.v
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onBackgroundPlaybackChange playInBackground:%b", java.lang.Boolean.valueOf(z17));
        dg.e eVar = this.f19820a.f19765i;
        if (eVar != null) {
            ((fg1.b0) eVar).d(z17);
        }
    }

    @Override // tf.v
    public void i() {
        bg.f fVar = this.f19820a;
        fVar.A();
        sf.f fVar2 = fVar.f19775s;
        if (fVar2 != null) {
            fVar.P(fVar2);
        }
    }

    @Override // tf.v
    public boolean isPlaying() {
        return this.f19820a.G();
    }

    @Override // tf.v
    public void pause() {
        tf1.f a17;
        bg.f fVar = this.f19820a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "pause");
        fVar.Q(new bg.f$$c(fVar, false));
        sf.f fVar2 = fVar.f19775s;
        if (fVar2 == null || (a17 = tf.k.a(fVar2)) == null || !a17.f418867p) {
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "setPlayingWhenEnterBackground");
        fVar.U = null;
    }

    @Override // tf.v
    public void start() {
        bg.f fVar = this.f19820a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "start");
        fVar.W = true;
        fVar.Q(new bg.t(fVar));
    }
}
