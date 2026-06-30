package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView */
/* loaded from: classes14.dex */
public class TextureViewSurfaceTextureListenerC13526x5bf79f0a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements android.view.TextureView.SurfaceTextureListener {
    public static i72.c C;
    public byte[] A;
    public boolean B;

    /* renamed from: h, reason: collision with root package name */
    public i72.y f181630h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f181631i;

    /* renamed from: m, reason: collision with root package name */
    public long f181632m;

    /* renamed from: n, reason: collision with root package name */
    public long f181633n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181634o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f181635p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f181636q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f181637r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f181638s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Object f181639t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f181640u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Rect f181641v;

    /* renamed from: w, reason: collision with root package name */
    public int f181642w;

    /* renamed from: x, reason: collision with root package name */
    public int f181643x;

    /* renamed from: y, reason: collision with root package name */
    public i72.z f181644y;

    /* renamed from: z, reason: collision with root package name */
    public i72.d f181645z;

    public TextureViewSurfaceTextureListenerC13526x5bf79f0a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void E(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a, android.graphics.Point point) {
        android.util.DisplayMetrics displayMetrics = textureViewSurfaceTextureListenerC13526x5bf79f0a.getResources().getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        int i19 = point.x;
        double d17 = ((i17 * 1.0d) * i19) / point.y;
        int i27 = (int) d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "previewResolution: (%d, %d), adjust: (%d, %d), temp:%f", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(point.y), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), java.lang.Double.valueOf(d17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i72.b(textureViewSurfaceTextureListenerC13526x5bf79f0a, i18, i27, i17));
    }

    /* renamed from: getPreviewScaleHeight */
    private float m55265xd8ad601f() {
        boolean z17;
        float height;
        int a17;
        if (this.f181645z == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
            return 1.0f;
        }
        if (getHeight() <= 0 || ((i72.m) this.f181645z).a() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: height size not prepared");
            return 1.0f;
        }
        i72.m mVar = (i72.m) this.f181645z;
        synchronized (mVar.f370960d.f181640u) {
            z17 = mVar.f370957a.f181553f;
        }
        if (z17) {
            height = getWidth();
            a17 = ((i72.m) this.f181645z).a();
        } else {
            height = getHeight();
            a17 = ((i72.m) this.f181645z).a();
        }
        return height / a17;
    }

    /* renamed from: getPreviewScaleWidth */
    private float m55266x9c779fce() {
        boolean z17;
        boolean z18;
        float width;
        int b17;
        i72.m mVar = (i72.m) this.f181645z;
        synchronized (mVar.f370960d.f181640u) {
            z17 = mVar.f370957a == null;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
            return 1.0f;
        }
        if (getWidth() <= 0 || ((i72.m) this.f181645z).b() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: width size not prepared");
            return 1.0f;
        }
        i72.m mVar2 = (i72.m) this.f181645z;
        synchronized (mVar2.f370960d.f181640u) {
            z18 = mVar2.f370957a.f181553f;
        }
        if (z18) {
            width = getHeight();
            b17 = ((i72.m) this.f181645z).b();
        } else {
            width = getWidth();
            b17 = ((i72.m) this.f181645z).b();
        }
        return width / b17;
    }

    public void F() {
        this.f181638s = false;
        i72.m mVar = (i72.m) this.f181645z;
        synchronized (mVar.f370960d.f181640u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 n0Var = mVar.f370957a;
            if (n0Var != null && n0Var.f181550c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().d(mVar.f370959c);
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = mVar.f370960d;
                if (!textureViewSurfaceTextureListenerC13526x5bf79f0a.B) {
                    textureViewSurfaceTextureListenerC13526x5bf79f0a.A = null;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.f181574f.mo50302x6b17ad39(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE.f181576d.f181577i.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: getCurrentMotion not init");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "pause motion time: %d", java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().e(-1, currentTimeMillis);
    }

    public synchronized void G() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "capture face");
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y yVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE;
        yVar.f181576d.f181577i.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
        yVar.f181576d.f181577i.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
        yVar.f181576d.f181577i.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: getCurrentMotion not init");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "start motion time: %d", java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().f(-1, currentTimeMillis);
    }

    public void H(i72.z zVar) {
        i72.m mVar = (i72.m) this.f181645z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = mVar.f370960d;
        textureViewSurfaceTextureListenerC13526x5bf79f0a.f181644y = zVar;
        synchronized (textureViewSurfaceTextureListenerC13526x5bf79f0a.f181640u) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 n0Var = mVar.f370957a;
                if (n0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
                    return;
                }
                if (n0Var.f181550c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: already previewed. return");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a2 = mVar.f370960d;
                    if (textureViewSurfaceTextureListenerC13526x5bf79f0a2.f181636q && textureViewSurfaceTextureListenerC13526x5bf79f0a2.f181632m > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: already request scanning face and now automatically capture");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i72.a(textureViewSurfaceTextureListenerC13526x5bf79f0a2));
                    }
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a3 = mVar.f370960d;
                textureViewSurfaceTextureListenerC13526x5bf79f0a3.f181637r = true;
                if (textureViewSurfaceTextureListenerC13526x5bf79f0a3.f181634o) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    s75.d.b(new i72.h(mVar, android.os.SystemClock.elapsedRealtime()), "FaceDetectCameraView_Camera");
                } else {
                    if (!textureViewSurfaceTextureListenerC13526x5bf79f0a3.isAvailable()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: not initialized yet. do after init");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: already available. manually call available");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a4 = mVar.f370960d;
                    textureViewSurfaceTextureListenerC13526x5bf79f0a4.onSurfaceTextureAvailable(textureViewSurfaceTextureListenerC13526x5bf79f0a4.getSurfaceTexture(), mVar.f370960d.getWidth(), mVar.f370960d.getHeight());
                }
            } finally {
            }
        }
    }

    /* renamed from: getCameraRotation */
    public int m55267xa3f60eb9() {
        int i17;
        i72.m mVar = (i72.m) this.f181645z;
        synchronized (mVar.f370960d.f181640u) {
            i17 = mVar.f370957a.f181554g;
        }
        return i17;
    }

    /* renamed from: getEncodeVideoBestSize */
    public android.graphics.Point m55268xb6c487f4() {
        android.graphics.Point point;
        i72.m mVar = (i72.m) this.f181645z;
        synchronized (mVar.f370960d.f181640u) {
            point = mVar.f370957a.f181557j;
        }
        return point;
    }

    /* renamed from: getPreviewBm */
    public android.graphics.Bitmap m55269xcdcc8b7d() {
        return getBitmap();
    }

    /* renamed from: getPreviewHeight */
    public int m55270xbf6e2759() {
        return ((i72.m) this.f181645z).a();
    }

    /* renamed from: getPreviewWidth */
    public int m55271xf440954() {
        return ((i72.m) this.f181645z).b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: attached");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f181642w = getMeasuredWidth();
        this.f181643x = getMeasuredHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: camera view on measure to %d, %d", java.lang.Integer.valueOf(this.f181642w), java.lang.Integer.valueOf(this.f181643x));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureAvailable");
        C();
        this.f181634o = true;
        this.f181631i = surfaceTexture;
        if (this.f181637r) {
            H(this.f181644y);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureDestroyed");
        this.f181634o = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureSizeChanged");
        this.f181631i = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f181645z.getClass();
    }

    /* renamed from: setCallback */
    public void m55272x6c4ebec7(i72.y yVar) {
        this.f181630h = yVar;
    }

    public TextureViewSurfaceTextureListenerC13526x5bf79f0a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f181630h = null;
        this.f181631i = null;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45.f181651w;
        this.f181632m = 100L;
        this.f181633n = -1L;
        this.f181634o = false;
        this.f181635p = false;
        this.f181636q = false;
        this.f181637r = false;
        this.f181638s = false;
        this.f181639t = new java.lang.Object();
        this.f181640u = new java.lang.Object();
        this.f181641v = null;
        this.f181642w = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q3.f34709x366c91de;
        this.f181643x = 576;
        this.f181644y = null;
        this.f181645z = null;
        this.A = null;
        this.B = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: face vedio debug: %b", java.lang.Boolean.FALSE);
        this.f181645z = new i72.m(this, null);
        C = new i72.c(this, null);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }
}
