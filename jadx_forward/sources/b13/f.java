package b13;

/* loaded from: classes14.dex */
public final class f implements y03.g {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f98629a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f98630b;

    /* renamed from: c, reason: collision with root package name */
    public final x.f f98631c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f98632d;

    /* renamed from: e, reason: collision with root package name */
    public y03.f f98633e;

    /* renamed from: f, reason: collision with root package name */
    public y03.f f98634f;

    public f(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 registry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(registry, "registry");
        this.f98629a = registry;
        this.f98630b = "MicroMsg.FlutterTextureMgr";
        this.f98631c = new x.f();
        this.f98632d = new java.util.ArrayList();
        if (vq4.b0.f520804b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterTextureMgr", hashCode() + " offer surface use create");
            b13.a a17 = a();
            this.f98633e = new y03.f(a17.f98619a, a17.f98620b, new y03.h(a17.f98621c.f307255d), 0, 0);
            b13.a a18 = a();
            y03.h hVar = new y03.h(a18.f98621c.f307255d);
            y03.f fVar = new y03.f(a18.f98619a, a18.f98620b, hVar, 0, 0);
            this.f98634f = fVar;
            y03.f fVar2 = this.f98633e;
            y03.h hVar2 = fVar2 != null ? fVar2.f540173c : null;
            if (hVar2 != null) {
                hVar2.f540179f = new b13.d(fVar2);
            }
            hVar.f540179f = new b13.e(fVar);
            dr4.p1 p1Var = gq4.v.Bi().E;
            if (p1Var == null) {
                return;
            }
            p1Var.f324256v = this;
        }
    }

    public final b13.a a() {
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca = this.f98629a.mo138022xdee757ca();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo138022xdee757ca, "createSurfaceTexture(...)");
        android.graphics.SurfaceTexture mo138117x299653ae = mo138022xdee757ca.mo138117x299653ae();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo138117x299653ae, "surfaceTexture(...)");
        return new b13.a(mo138022xdee757ca.id(), mo138022xdee757ca, new d13.c(mo138117x299653ae), 0, 0, 0, 56, null);
    }

    public final void b(b13.m flutterVoipMgr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterVoipMgr, "flutterVoipMgr");
        java.lang.String str = this.f98630b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "warm up");
        x.f fVar = this.f98631c;
        if (fVar.e() >= 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "texturePool size >= 2, skip warm up");
            return;
        }
        b13.a a17 = a();
        long j17 = a17.f98619a;
        fVar.d(j17, a17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create flutter texture: ");
        sb6.append(j17);
        sb6.append(", surfaceTexture:");
        d13.c surfaceTexture = a17.f98621c;
        sb6.append(surfaceTexture.f307255d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "addCameraRenderSurfaceTexture " + surfaceTexture.f307255d);
        flutterVoipMgr.F1 = surfaceTexture;
        flutterVoipMgr.D1 = false;
        flutterVoipMgr.G0();
        surfaceTexture.f307257f = new b13.b(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "warm up local camera texture");
        b13.a a18 = a();
        fVar.d(a18.f98619a, a18);
        d13.c surfaceTexture2 = a18.f98621c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture2, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "addCameraRenderSurfaceTexture " + surfaceTexture2.f307255d);
        flutterVoipMgr.G1 = surfaceTexture2;
        flutterVoipMgr.E1 = false;
        flutterVoipMgr.G0();
        surfaceTexture2.f307257f = new b13.c(a18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "warm up remote camera texture");
    }
}
