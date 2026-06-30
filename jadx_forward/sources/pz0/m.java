package pz0;

/* loaded from: classes5.dex */
public final class m implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4 {

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f440681e;

    /* renamed from: g, reason: collision with root package name */
    public az0.n7 f440683g;

    /* renamed from: h, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry f440684h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f440685i;

    /* renamed from: d, reason: collision with root package name */
    public final dz0.h f440680d = new dz0.h("TemplateRecommendv2", false, true, -1, false, kz5.p0.f395529d, 0, false, null, false);

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f440682f = p3325xe03a0797.p3326xc267989b.z0.b();

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4
    /* renamed from: initRenderSurface */
    public void mo90720xc1e2f307(long j17, long j18, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: width " + j17 + ", height " + j18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setReportScene: 6, field: ");
        sb6.append(bz0.a.f118256b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        bz0.a.f118256b = 6;
        if (this.f440685i != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: renderSurface is not null");
            return;
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = this.f440681e;
        if (interfaceC28980x1159d658 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "textureRegistry is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-1L)));
            return;
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca = interfaceC28980x1159d658.mo138022xdee757ca();
        if (mo138022xdee757ca == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "createTexture error");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-1L)));
            return;
        }
        android.view.Surface surface = this.f440685i;
        if (surface != null) {
            surface.release();
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry = this.f440684h;
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.mo138094x41012807();
        }
        android.view.Surface surface2 = new android.view.Surface(mo138022xdee757ca.mo138117x299653ae());
        mo138022xdee757ca.mo138117x299653ae().setDefaultBufferSize((int) j17, (int) j18);
        this.f440684h = mo138022xdee757ca;
        this.f440685i = surface2;
        az0.i5.s(az0.i5.f97090a, false, null, false, 7, null);
        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Long.valueOf(mo138022xdee757ca.id()))));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface id " + mo138022xdee757ca.id());
        if (this.f440683g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "initRenderSurface: setSurface");
            az0.n7 n7Var = this.f440683g;
            if (n7Var != null) {
                n7Var.f97275a.m33443x42c875eb(surface2);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "onAttachedToEngine");
        this.f440681e = p07.m137988x3128f042();
        com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4.Companion.m90727x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "onDetachedFromEngine");
        this.f440681e = null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4
    /* renamed from: recreateCreation */
    public void mo90721x8a0470ee(java.lang.String templateId, java.lang.String musicId, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: " + templateId + ' ' + musicId);
        p3325xe03a0797.p3326xc267989b.l.d(this.f440682f, null, null, new pz0.d(this, templateId, musicId, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4
    /* renamed from: release */
    public void mo90722x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "release");
        az0.n7 n7Var = this.f440683g;
        if (n7Var != null) {
            n7Var.f97275a.m33443x42c875eb(null);
        }
        az0.n7 n7Var2 = this.f440683g;
        if (n7Var2 != null) {
            n7Var2.k();
        }
        this.f440683g = null;
        android.view.Surface surface = this.f440685i;
        if (surface != null) {
            surface.release();
        }
        this.f440685i = null;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry = this.f440684h;
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.mo138094x41012807();
        }
        this.f440684h = null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4
    /* renamed from: startMovieCreation */
    public void mo90723x854ffced(java.lang.String templateId, java.lang.String musicId, byte[] mediaInfo, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startMovieCreation() called with: templateId = " + templateId + ", musicId = " + musicId + ", mediaInfo = " + mediaInfo);
        p3325xe03a0797.p3326xc267989b.l.d(this.f440682f, null, null, new pz0.j(this, mediaInfo, templateId, musicId, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4
    /* renamed from: startPlay */
    public void mo90724x8113c2b6(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: " + j17);
        p3325xe03a0797.p3326xc267989b.l.d(this.f440682f, null, null, new pz0.k(this, j17, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2870x3304c6.InterfaceC24425xb34d71e4
    /* renamed from: stopPlay */
    public void mo90725x66343656(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "stopPlay");
        p3325xe03a0797.p3326xc267989b.l.d(this.f440682f, null, null, new pz0.l(this, callback, null), 3, null);
    }
}
