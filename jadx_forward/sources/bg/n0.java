package bg;

/* loaded from: classes7.dex */
public class n0 implements tf.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f101353a;

    public n0(bg.f fVar) {
        this.f101353a = fVar;
    }

    @Override // tf.v
    public void a(android.view.Surface surface) {
        if (surface != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onSetPlaybackSurface surface:%d", java.lang.Integer.valueOf(surface.hashCode()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onSetPlaybackSurface surface null");
        }
        this.f101353a.T(surface);
    }

    @Override // tf.v
    public float b() {
        bg.f fVar = this.f101353a;
        if (fVar.B() <= 0) {
            return 1.0f;
        }
        return (fVar.f101297h != null ? r1.mo1855x8d5c7601() : 0) / fVar.B();
    }

    @Override // tf.v
    public void c(java.lang.String str) {
        boolean equalsIgnoreCase = com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27.equalsIgnoreCase(str);
        bg.f fVar = this.f101353a;
        if (equalsIgnoreCase) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "IVideoPlayerAddOnVideoController operate, play");
            fVar.W = true;
            fVar.Q(new bg.t(fVar));
        } else if ("stop".equalsIgnoreCase(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "IVideoPlayerAddOnVideoController operate, stop");
            fVar.Q(new bg.RunnableC1339x2ee9bc(fVar));
        } else if ("pause".equalsIgnoreCase(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "IVideoPlayerAddOnVideoController operate, pause");
            fVar.Q(new bg.RunnableC1340x2ee9bd(fVar, false));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.VideoPluginHandler", "IVideoPlayerAddOnVideoController not support: " + str);
        }
    }

    @Override // tf.v
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onBackgroundPlaybackChange playInBackground:%b", java.lang.Boolean.valueOf(z17));
        dg.e eVar = this.f101353a.f101298i;
        if (eVar != null) {
            ((fg1.b0) eVar).d(z17);
        }
    }

    @Override // tf.v
    public void i() {
        bg.f fVar = this.f101353a;
        fVar.A();
        sf.f fVar2 = fVar.f101308s;
        if (fVar2 != null) {
            fVar.P(fVar2);
        }
    }

    @Override // tf.v
    /* renamed from: isPlaying */
    public boolean mo10363xc00617a4() {
        return this.f101353a.G();
    }

    @Override // tf.v
    /* renamed from: pause */
    public void mo10364x65825f6() {
        tf1.f a17;
        bg.f fVar = this.f101353a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "pause");
        fVar.Q(new bg.RunnableC1340x2ee9bd(fVar, false));
        sf.f fVar2 = fVar.f101308s;
        if (fVar2 == null || (a17 = tf.k.a(fVar2)) == null || !a17.f500400p) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "setPlayingWhenEnterBackground");
        fVar.U = null;
    }

    @Override // tf.v
    /* renamed from: start */
    public void mo10365x68ac462() {
        bg.f fVar = this.f101353a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "start");
        fVar.W = true;
        fVar.Q(new bg.t(fVar));
    }
}
