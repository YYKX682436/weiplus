package com.tencent.mm.plugin.facedetect.views;

/* loaded from: classes14.dex */
public class FaceDetectCameraView extends com.tencent.mm.ui.base.MMTextureView implements android.view.TextureView.SurfaceTextureListener {
    public static i72.c C;
    public byte[] A;
    public boolean B;

    /* renamed from: h, reason: collision with root package name */
    public i72.y f100097h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f100098i;

    /* renamed from: m, reason: collision with root package name */
    public long f100099m;

    /* renamed from: n, reason: collision with root package name */
    public long f100100n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f100101o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f100102p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f100103q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f100104r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f100105s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Object f100106t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f100107u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Rect f100108v;

    /* renamed from: w, reason: collision with root package name */
    public int f100109w;

    /* renamed from: x, reason: collision with root package name */
    public int f100110x;

    /* renamed from: y, reason: collision with root package name */
    public i72.z f100111y;

    /* renamed from: z, reason: collision with root package name */
    public i72.d f100112z;

    public FaceDetectCameraView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void E(com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView, android.graphics.Point point) {
        android.util.DisplayMetrics displayMetrics = faceDetectCameraView.getResources().getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        int i19 = point.x;
        double d17 = ((i17 * 1.0d) * i19) / point.y;
        int i27 = (int) d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "previewResolution: (%d, %d), adjust: (%d, %d), temp:%f", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(point.y), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), java.lang.Double.valueOf(d17));
        com.tencent.mm.sdk.platformtools.u3.h(new i72.b(faceDetectCameraView, i18, i27, i17));
    }

    private float getPreviewScaleHeight() {
        boolean z17;
        float height;
        int a17;
        if (this.f100112z == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
            return 1.0f;
        }
        if (getHeight() <= 0 || ((i72.m) this.f100112z).a() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: height size not prepared");
            return 1.0f;
        }
        i72.m mVar = (i72.m) this.f100112z;
        synchronized (mVar.f289427d.f100107u) {
            z17 = mVar.f289424a.f100020f;
        }
        if (z17) {
            height = getWidth();
            a17 = ((i72.m) this.f100112z).a();
        } else {
            height = getHeight();
            a17 = ((i72.m) this.f100112z).a();
        }
        return height / a17;
    }

    private float getPreviewScaleWidth() {
        boolean z17;
        boolean z18;
        float width;
        int b17;
        i72.m mVar = (i72.m) this.f100112z;
        synchronized (mVar.f289427d.f100107u) {
            z17 = mVar.f289424a == null;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
            return 1.0f;
        }
        if (getWidth() <= 0 || ((i72.m) this.f100112z).b() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: width size not prepared");
            return 1.0f;
        }
        i72.m mVar2 = (i72.m) this.f100112z;
        synchronized (mVar2.f289427d.f100107u) {
            z18 = mVar2.f289424a.f100020f;
        }
        if (z18) {
            width = getHeight();
            b17 = ((i72.m) this.f100112z).b();
        } else {
            width = getWidth();
            b17 = ((i72.m) this.f100112z).b();
        }
        return width / b17;
    }

    public void F() {
        this.f100105s = false;
        i72.m mVar = (i72.m) this.f100112z;
        synchronized (mVar.f289427d.f100107u) {
            com.tencent.mm.plugin.facedetect.model.n0 n0Var = mVar.f289424a;
            if (n0Var != null && n0Var.f100017c) {
                com.tencent.mm.plugin.facedetect.model.v.b().d(mVar.f289426c);
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = mVar.f289427d;
                if (!faceDetectCameraView.B) {
                    faceDetectCameraView.A = null;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
        com.tencent.mm.plugin.facedetect.model.y.f100041f.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.facedetect.model.y.INSTANCE.f100043d.f100044i.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: getCurrentMotion not init");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "pause motion time: %d", java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().e(-1, currentTimeMillis);
    }

    public synchronized void G() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "capture face");
        com.tencent.mm.plugin.facedetect.model.y yVar = com.tencent.mm.plugin.facedetect.model.y.INSTANCE;
        yVar.f100043d.f100044i.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
        yVar.f100043d.f100044i.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
        yVar.f100043d.f100044i.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: getCurrentMotion not init");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "start motion time: %d", java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().f(-1, currentTimeMillis);
    }

    public void H(i72.z zVar) {
        i72.m mVar = (i72.m) this.f100112z;
        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = mVar.f289427d;
        faceDetectCameraView.f100111y = zVar;
        synchronized (faceDetectCameraView.f100107u) {
            try {
                com.tencent.mm.plugin.facedetect.model.n0 n0Var = mVar.f289424a;
                if (n0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
                    return;
                }
                if (n0Var.f100017c) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: already previewed. return");
                    com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView2 = mVar.f289427d;
                    if (faceDetectCameraView2.f100103q && faceDetectCameraView2.f100099m > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: already request scanning face and now automatically capture");
                        com.tencent.mm.sdk.platformtools.u3.h(new i72.a(faceDetectCameraView2));
                    }
                    return;
                }
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView3 = mVar.f289427d;
                faceDetectCameraView3.f100104r = true;
                if (faceDetectCameraView3.f100101o) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    s75.d.b(new i72.h(mVar, android.os.SystemClock.elapsedRealtime()), "FaceDetectCameraView_Camera");
                } else {
                    if (!faceDetectCameraView3.isAvailable()) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectCameraView", "hy: not initialized yet. do after init");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: already available. manually call available");
                    com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView4 = mVar.f289427d;
                    faceDetectCameraView4.onSurfaceTextureAvailable(faceDetectCameraView4.getSurfaceTexture(), mVar.f289427d.getWidth(), mVar.f289427d.getHeight());
                }
            } finally {
            }
        }
    }

    public int getCameraRotation() {
        int i17;
        i72.m mVar = (i72.m) this.f100112z;
        synchronized (mVar.f289427d.f100107u) {
            i17 = mVar.f289424a.f100021g;
        }
        return i17;
    }

    public android.graphics.Point getEncodeVideoBestSize() {
        android.graphics.Point point;
        i72.m mVar = (i72.m) this.f100112z;
        synchronized (mVar.f289427d.f100107u) {
            point = mVar.f289424a.f100024j;
        }
        return point;
    }

    public android.graphics.Bitmap getPreviewBm() {
        return getBitmap();
    }

    public int getPreviewHeight() {
        return ((i72.m) this.f100112z).a();
    }

    public int getPreviewWidth() {
        return ((i72.m) this.f100112z).b();
    }

    @Override // com.tencent.mm.ui.base.MMTextureView, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: attached");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f100109w = getMeasuredWidth();
        this.f100110x = getMeasuredHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: camera view on measure to %d, %d", java.lang.Integer.valueOf(this.f100109w), java.lang.Integer.valueOf(this.f100110x));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureAvailable");
        C();
        this.f100101o = true;
        this.f100098i = surfaceTexture;
        if (this.f100104r) {
            H(this.f100111y);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureDestroyed");
        this.f100101o = false;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureSizeChanged");
        this.f100098i = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f100112z.getClass();
    }

    public void setCallback(i72.y yVar) {
        this.f100097h = yVar;
    }

    public FaceDetectCameraView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f100097h = null;
        this.f100098i = null;
        int i18 = com.tencent.mm.plugin.facedetect.views.FaceDetectView.f100118w;
        this.f100099m = 100L;
        this.f100100n = -1L;
        this.f100101o = false;
        this.f100102p = false;
        this.f100103q = false;
        this.f100104r = false;
        this.f100105s = false;
        this.f100106t = new java.lang.Object();
        this.f100107u = new java.lang.Object();
        this.f100108v = null;
        this.f100109w = com.tencent.mm.plugin.appbrand.jsapi.q3.CTRL_INDEX;
        this.f100110x = 576;
        this.f100111y = null;
        this.f100112z = null;
        this.A = null;
        this.B = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: face vedio debug: %b", java.lang.Boolean.FALSE);
        this.f100112z = new i72.m(this, null);
        C = new i72.c(this, null);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }
}
