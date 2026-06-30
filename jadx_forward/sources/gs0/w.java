package gs0;

/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h f356564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f356565b;

    /* renamed from: c, reason: collision with root package name */
    public final int f356566c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f356567d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.ImageReader f356568e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f356569f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.HandlerThread f356570g;

    /* renamed from: h, reason: collision with root package name */
    public os0.g f356571h;

    /* renamed from: i, reason: collision with root package name */
    public rs0.h f356572i;

    /* renamed from: j, reason: collision with root package name */
    public int f356573j;

    /* renamed from: k, reason: collision with root package name */
    public int f356574k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f356575l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f356576m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f356577n;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f356578o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f356579p;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar, int i17, int i18) {
        this.f356564a = hVar;
        this.f356565b = i17;
        this.f356566c = i18;
        int i19 = pu5.i.f440006b;
        this.f356570g = pu5.f.a("X264TransImageReaderEncoder_rgb2yuv_thread", -4);
        this.f356576m = new java.lang.Object();
        this.f356579p = new java.util.concurrent.Semaphore(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "create X264TransImageReaderEncoder, width:" + i17 + ", height:" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69240x1f55bbc2(hVar != null ? hVar.f243948a : -1, true);
    }

    public static final boolean a(gs0.w wVar, int i17, int i18, android.media.Image.Plane plane) {
        synchronized (wVar.f356576m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = wVar.f356564a;
            if (hVar != null) {
                if (hVar.f243948a >= 0) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "processImageYUVBufferToWriteYUVData, width:" + i17 + ", height:" + i18 + ", videoWidth:" + wVar.f356565b + ", videoHeight:" + wVar.f356566c);
                    int rowStride = plane.getRowStride();
                    int pixelStride = plane.getPixelStride();
                    if (wVar.f356567d == null) {
                        wVar.f356567d = java.nio.ByteBuffer.allocateDirect(wVar.f356573j * wVar.f356574k * pixelStride);
                    }
                    java.nio.ByteBuffer byteBuffer = wVar.f356567d;
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                    }
                    java.nio.ByteBuffer buffer = plane.getBuffer();
                    buffer.position(0);
                    java.nio.ByteBuffer byteBuffer2 = wVar.f356567d;
                    int i19 = wVar.f356573j * pixelStride;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69213x5793d34c(buffer, byteBuffer2, i19, wVar.f356574k, rowStride - i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69265xc600030f(wVar.f356564a.f243948a, wVar.f356567d, wVar.f356565b, wVar.f356566c);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "end processImageYUVBufferToWriteYUVData, cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
        }
        return false;
    }

    public final void b(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "requestEncode:" + j17);
        android.os.Handler handler = this.f356569f;
        if (handler != null) {
            handler.post(new gs0.t(this, j17));
        }
        this.f356579p.acquire();
    }

    public final void c(rs0.h videoDataRenderEnvironment, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoDataRenderEnvironment, "videoDataRenderEnvironment");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "start");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        int i27 = this.f356565b / 4;
        this.f356573j = i27;
        int i28 = (this.f356566c * 3) / 2;
        this.f356574k = i28;
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i27, i28, 1, 1);
        this.f356568e = newInstance;
        if (newInstance != null) {
            android.os.HandlerThread handlerThread = this.f356570g;
            handlerThread.start();
            android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
            this.f356569f = handler;
            newInstance.setOnImageAvailableListener(new gs0.u(this), handler);
            android.os.Handler handler2 = this.f356569f;
            if (handler2 != null) {
                handler2.post(new gs0.v(this, newInstance, videoDataRenderEnvironment, i17, i18, i19));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "initRgb2YuvImageReader, yuv size:[" + this.f356573j + 'x' + this.f356574k + ']');
    }

    public final void d() {
        android.os.Handler handler;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "stop");
        synchronized (this.f356576m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "finishEncode, renderYuvCount:" + this.f356577n + ", writeYuvCount:" + this.f356578o);
            this.f356575l = true;
            android.media.ImageReader imageReader = this.f356568e;
            if (imageReader != null) {
                imageReader.close();
            }
            rs0.h hVar = this.f356572i;
            if (hVar != null && (handler = this.f356569f) != null) {
                handler.post(new gs0.s(this, hVar));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar2 = this.f356564a;
            if (hVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69168xb71d47de(hVar2.f243948a);
            }
            this.f356570g.quitSafely();
            this.f356568e = null;
        }
    }
}
