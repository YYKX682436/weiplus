package wf;

/* loaded from: classes7.dex */
public class d implements tf.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f526997a;

    public d(wf.b bVar) {
        this.f526997a = bVar;
    }

    @Override // tf.v
    public void a(android.view.Surface surface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onSetPlaybackSurface surface:%d", java.lang.Integer.valueOf(surface.hashCode()));
        this.f526997a.N(surface);
    }

    @Override // tf.v
    public float b() {
        int i17 = this.f526997a.f526958r;
        if (i17 > 0) {
            return r0.f526957q / i17;
        }
        return 1.0f;
    }

    @Override // tf.v
    public void c(java.lang.String str) {
        boolean equalsIgnoreCase = com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27.equalsIgnoreCase(str);
        wf.b bVar = this.f526997a;
        if (equalsIgnoreCase) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "IVideoPlayerAddOnVideoController operate, play");
            bVar.H();
            return;
        }
        if ("stop".equalsIgnoreCase(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "IVideoPlayerAddOnVideoController operate, stop");
            bVar.C("stop", null);
            return;
        }
        if ("pause".equalsIgnoreCase(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "IVideoPlayerAddOnVideoController operate, pause");
            bVar.C("pause", null);
        } else if ("resume".equalsIgnoreCase(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "IVideoPlayerAddOnVideoController operate, resume");
            bVar.C("resume", null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePlayerPluginHandler", "IVideoPlayerAddOnVideoController not support: " + str);
        }
    }

    @Override // tf.v
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onBackgroundPlaybackChange playInBackground:%b", java.lang.Boolean.valueOf(z17));
        wf.b bVar = this.f526997a;
        xf.b bVar2 = bVar.f526953n;
        if (bVar2 != null) {
            ((yf1.k) bVar2).b(bVar.f334030d, z17);
        }
    }

    @Override // tf.v
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "resetPlayer");
    }

    @Override // tf.v
    /* renamed from: isPlaying */
    public boolean mo10363xc00617a4() {
        return this.f526997a.z();
    }

    @Override // tf.v
    /* renamed from: pause */
    public void mo10364x65825f6() {
        tf1.f a17;
        wf.b bVar = this.f526997a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "pause");
        bVar.C("stop", null);
        sf.f fVar = bVar.f526955p;
        if (fVar == null || (a17 = tf.k.a(fVar)) == null || !a17.f500400p) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "setPlayingWhenEnterBackground");
        bVar.I = null;
    }

    @Override // tf.v
    /* renamed from: start */
    public void mo10365x68ac462() {
        wf.b bVar = this.f526997a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "start");
        bVar.H();
        if (bVar.z()) {
            bVar.C("resume", null);
        }
    }
}
