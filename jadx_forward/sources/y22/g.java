package y22;

/* loaded from: classes10.dex */
public final class g implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final d32.n f540617d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f540618e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f540619f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f540620g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f540621h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f540622i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f540623m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f540624n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f540625o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f540626p;

    public g(d32.n renderer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        this.f540617d = renderer;
        this.f540618e = "MicroMsg.EmojiCaptureRenderSurface";
        this.f540626p = new java.util.ArrayList();
        a();
        renderer.f412494q = new y22.a(this);
    }

    public final void a() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("EmojiCaptureRenderSurface_renderThread", -2);
        a17.start();
        this.f540623m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f540626p;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b((yz5.a) it.next());
        }
        this.f540622i = a17;
    }

    public final void b(final yz5.a r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f540623m;
        if (n3Var == null) {
            this.f540626p.add(r17);
        } else if (n3Var != null) {
            n3Var.mo50293x3498a0(new java.lang.Runnable(r17) { // from class: y22.f

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f540616d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "function");
                    this.f540616d = r17;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f540616d.mo152xb9724478();
                }
            });
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540618e, "onSurfaceTextureAvailable: ");
        if (this.f540623m == null) {
            a();
        }
        b(new y22.b(this, surfaceTexture, i17, i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540618e, "onSurfaceTextureDestroyed: ");
        b(new y22.c(this));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540618e, "onSurfaceTextureSizeChanged: ");
        b(new y22.d(this, i17, i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
