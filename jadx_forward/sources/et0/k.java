package et0;

/* loaded from: classes14.dex */
public class k implements et0.q {

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f338076d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f338077e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f338078f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f338079g;

    /* renamed from: h, reason: collision with root package name */
    public ms0.c f338080h;

    /* renamed from: i, reason: collision with root package name */
    public ft0.d f338081i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f338082m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f338083n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f338084o = new java.util.ArrayList();

    public k() {
        a();
    }

    public final void a() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("CameraPreviewTextureView_renderThread", -2);
        a17.start();
        this.f338079g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f338084o;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l((yz5.a) it.next());
        }
        this.f338078f = a17;
    }

    @Override // et0.q
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo8977xe0fe423b() {
        rs0.h hVar = this.f338076d;
        if (hVar != null) {
            return hVar.f480827c;
        }
        return null;
    }

    @Override // et0.q
    /* renamed from: getFrameDataCallback */
    public di3.o mo8978x89bef366() {
        ft0.d dVar = this.f338081i;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // et0.q
    /* renamed from: getPreviewTexture */
    public is0.c mo8982xa9fb0529() {
        ms0.c cVar = this.f338080h;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    @Override // et0.q
    public void j() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewGLTextureRender", "tryStopCameraPreview", new java.lang.Object[0]);
        this.f338083n = null;
    }

    @Override // et0.r
    public void l(final yz5.a r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f338079g;
        if (n3Var == null) {
            this.f338084o.add(r17);
        } else if (n3Var != null) {
            n3Var.mo50293x3498a0(new java.lang.Runnable(r17) { // from class: et0.j

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f338075d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "function");
                    this.f338075d = r17;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f338075d.mo152xb9724478();
                }
            });
        }
    }

    @Override // et0.q
    public void m(ms0.c renderer, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureRender", "setRenderer:" + renderer.hashCode() + "  cpuCrop:" + z17);
        ft0.d dVar = this.f338081i;
        if (dVar != null) {
            ft0.d.h(dVar, false, false, 3, null);
        }
        ft0.d fVar = z17 ? new ft0.f(this) : new ft0.h(this);
        this.f338081i = fVar;
        fVar.i(renderer);
        this.f338080h = renderer;
    }

    @Override // et0.q
    /* renamed from: release */
    public void mo8984x41012807() {
        l(new et0.h(this));
    }

    @Override // et0.r
    /* renamed from: requestRender */
    public void mo46859x511cb905() {
        l(new et0.i(this));
    }

    @Override // et0.q
    /* renamed from: setOnDrawListener */
    public void mo8988x4ac79299(yz5.l lVar) {
        ft0.d dVar = this.f338081i;
        if (dVar != null) {
            dVar.f347997e = lVar;
        }
    }

    @Override // et0.q
    public void u(yz5.l lVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewGLTextureRender", "tryCameraPreview canPreview:" + this.f338082m, new java.lang.Object[0]);
        if (!this.f338082m) {
            this.f338083n = lVar;
        } else if (lVar != null) {
            ft0.d dVar = this.f338081i;
            lVar.mo146xb9724478(dVar != null ? dVar.b() : null);
        }
    }

    @Override // et0.q
    public void w(ts0.c cameraConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraConfig, "cameraConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureRender", "updateCameraConfig: " + cameraConfig);
        ft0.d dVar = this.f338081i;
        if (dVar != null) {
            dVar.j(cameraConfig);
        }
    }

    @Override // et0.q
    public void y() {
        ms0.c cVar;
        ft0.d dVar = this.f338081i;
        if (dVar == null || (cVar = dVar.f347995c) == null) {
            return;
        }
        cVar.f412488k = true;
    }
}
