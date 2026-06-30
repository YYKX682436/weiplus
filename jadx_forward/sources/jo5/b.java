package jo5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.camera2.CameraManager f382458a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f382459b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.Executor f382460c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f382461d;

    /* renamed from: e, reason: collision with root package name */
    public android.hardware.camera2.CameraDevice f382462e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e f382463f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f382464g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f382465h;

    /* renamed from: i, reason: collision with root package name */
    public final jo5.a f382466i;

    public b(android.hardware.camera2.CameraManager cameraManager, java.lang.String cameraId, java.util.concurrent.Executor executor, android.os.Handler handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraManager, "cameraManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraId, "cameraId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(executor, "executor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f382458a = cameraManager;
        this.f382459b = cameraId;
        this.f382460c = executor;
        this.f382461d = handler;
        this.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusUninitialized;
        this.f382464g = new java.util.concurrent.Semaphore(0);
        this.f382466i = new jo5.a(this);
        this.f382463f = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e.VoIPMPCameraStatusInitialized;
    }
}
