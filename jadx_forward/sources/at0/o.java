package at0;

/* loaded from: classes14.dex */
public final class o extends com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea {

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f95147h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f95148i;

    /* renamed from: m, reason: collision with root package name */
    public int f95149m;

    /* renamed from: n, reason: collision with root package name */
    public int f95150n;

    /* renamed from: o, reason: collision with root package name */
    public et0.k f95151o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f95152p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context mContext, android.view.Surface surface, int i17, int i18) {
        super(mContext, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f95147h = mContext;
        this.f95148i = surface;
        this.f95149m = i17;
        this.f95150n = i18;
        this.f95152p = "MicroMsg.CameraPreviewSurfaceRenderView";
        this.f95151o = new et0.k();
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo8977xe0fe423b() {
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            return kVar.mo8977xe0fe423b();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    /* renamed from: getFrameDataCallback */
    public di3.o mo8978x89bef366() {
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            return kVar.mo8978x89bef366();
        }
        return null;
    }

    /* renamed from: getMContext */
    public final android.content.Context m8979x52aa25f8() {
        return this.f95147h;
    }

    /* renamed from: getMHeight */
    public final int m8980x4471f3be() {
        return this.f95150n;
    }

    /* renamed from: getMWidth */
    public final int m8981x24129c4f() {
        return this.f95149m;
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    /* renamed from: getPreviewTexture */
    public is0.c mo8982xa9fb0529() {
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            return kVar.mo8982xa9fb0529();
        }
        return null;
    }

    /* renamed from: getSurface */
    public final android.view.Surface m8983xcf572877() {
        return this.f95148i;
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    public void j() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f95152p, "tryStopCameraPreview", new java.lang.Object[0]);
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            kVar.j();
        }
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.r
    public void l(yz5.a r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            kVar.l(r17);
        }
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    public void m(ms0.c renderer, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            kVar.m(renderer, false);
        }
        et0.k kVar2 = this.f95151o;
        if (kVar2 != null) {
            android.view.Surface surface = this.f95148i;
            int i17 = this.f95149m;
            int i18 = this.f95150n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceAvailable, surface:" + surface + ", width:" + i17 + ", height:" + i18 + ", handler: " + kVar2.f338079g);
            if (kVar2.f338079g == null) {
                kVar2.a();
            }
            if (surface != null) {
                kVar2.l(new et0.e(kVar2, i17, i18, surface));
            }
        }
        et0.k kVar3 = this.f95151o;
        if (kVar3 != null) {
            android.view.Surface surface2 = this.f95148i;
            int i19 = this.f95149m;
            int i27 = this.f95150n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceSizeChanged, surface:" + surface2 + ", width:" + i19 + ", height:" + i27);
            kVar3.l(new et0.g(kVar3, i19, i27));
        }
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    /* renamed from: release */
    public void mo8984x41012807() {
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceDestroyed", new java.lang.Object[0]);
            kVar.f338082m = false;
            kVar.l(new et0.f(kVar));
        }
        et0.k kVar2 = this.f95151o;
        if (kVar2 != null) {
            kVar2.mo8984x41012807();
        }
        this.f95151o = null;
    }

    @Override // android.opengl.GLSurfaceView, et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            kVar.l(new et0.i(kVar));
        }
    }

    /* renamed from: setMContext */
    public final void m8985x4d628704(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<set-?>");
        this.f95147h = context;
    }

    /* renamed from: setMHeight */
    public final void m8986xb7e34132(int i17) {
        this.f95150n = i17;
    }

    /* renamed from: setMWidth */
    public final void m8987x1747d05b(int i17) {
        this.f95149m = i17;
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    /* renamed from: setOnDrawListener */
    public void mo8988x4ac79299(yz5.l lVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f95152p, "setOnDrawListener", new java.lang.Object[0]);
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            kVar.mo8988x4ac79299(lVar);
        }
    }

    /* renamed from: setSurface */
    public final void m8989x42c875eb(android.view.Surface surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "<set-?>");
        this.f95148i = surface;
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    public void u(yz5.l lVar) {
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            kVar.u(lVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    public void w(ts0.c cameraConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraConfig, "cameraConfig");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f95152p, "updateCameraConfig:" + cameraConfig, new java.lang.Object[0]);
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            kVar.w(cameraConfig);
        }
    }

    @Override // com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea, et0.q
    public void y() {
        et0.k kVar = this.f95151o;
        if (kVar != null) {
            kVar.y();
        }
    }
}
