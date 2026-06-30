package t23;

/* loaded from: classes10.dex */
public final class y0 {

    /* renamed from: k, reason: collision with root package name */
    public static int f496832k;

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f496833a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f496834b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f496835c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f496836d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f496837e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f496838f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f496839g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f496840h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f496841i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f496842j;

    public y0() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("smartGalleryQueryHandlerThread", 10);
        this.f496833a = handlerThread;
        this.f496835c = null;
        handlerThread.start();
        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("galleryAssistHandlerThread", 10);
        this.f496834b = handlerThread2;
        this.f496836d = null;
        handlerThread2.start();
        this.f496837e = null;
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors() / 2;
        if (availableProcessors < 2) {
            availableProcessors = 2;
        } else if (availableProcessors > 4) {
            availableProcessors = 4;
        }
        f496832k = availableProcessors;
        ku5.u0 u0Var = ku5.t0.f394148d;
        int i17 = f496832k;
        this.f496838f = ((ku5.t0) u0Var).o("gly-tp_q", i17, i17, new java.util.concurrent.LinkedBlockingQueue());
        ku5.u0 u0Var2 = ku5.t0.f394148d;
        int i18 = f496832k;
        this.f496839g = ((ku5.t0) u0Var2).o("gly-tp", i18, i18, new java.util.concurrent.LinkedBlockingQueue());
        ku5.u0 u0Var3 = ku5.t0.f394148d;
        int i19 = f496832k / 2;
        this.f496840h = ((ku5.t0) u0Var3).o("gly-tp-p", i19, i19, new java.util.concurrent.LinkedBlockingQueue());
        android.os.HandlerThread handlerThread3 = new android.os.HandlerThread("galleryQuerySubHandlerThread", 10);
        this.f496841i = handlerThread3;
        this.f496842j = null;
        handlerThread3.start();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 a() {
        if (this.f496837e == null) {
            this.f496837e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        }
        return this.f496837e;
    }

    public void b(java.lang.Runnable runnable) {
        if (runnable == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryHandlerThread", "postToAssistWorker runnable is null");
            return;
        }
        if (this.f496836d == null && this.f496834b != null) {
            this.f496836d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f496834b.getLooper());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f496836d;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(runnable);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryHandlerThread", "assistHandler is null.");
        }
    }

    public void c(java.lang.Runnable runnable) {
        if (runnable == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryHandlerThread", "postToMainThread, runnable is null");
        } else {
            a().mo50293x3498a0(runnable);
        }
    }

    public void d(java.lang.Runnable runnable) {
        if (runnable == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryHandlerThread", "postToQuerySubWorker runnable is null");
            return;
        }
        if (this.f496842j == null && this.f496841i != null) {
            this.f496842j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f496841i.getLooper());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f496842j;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(runnable);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
        }
    }
}
