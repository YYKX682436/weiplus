package so5;

/* loaded from: classes14.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.camera2.CameraManager f492424a;

    /* renamed from: b, reason: collision with root package name */
    public android.hardware.camera2.CameraManager.AvailabilityCallback f492425b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f492426c;

    /* renamed from: d, reason: collision with root package name */
    public long f492427d;

    public final void a(so5.l0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("camera");
        this.f492424a = systemService instanceof android.hardware.camera2.CameraManager ? (android.hardware.camera2.CameraManager) systemService : null;
        this.f492425b = new so5.m0(this, listener);
    }

    public final void b() {
        if (this.f492426c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPCameraStatusManager", "Already monitoring camera availability");
            return;
        }
        this.f492426c = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPCameraStatusManager", "Start monitoring camera availability");
        try {
            android.hardware.camera2.CameraManager cameraManager = this.f492424a;
            if (cameraManager != null) {
                android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback = this.f492425b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(availabilityCallback);
                cameraManager.registerAvailabilityCallback(availabilityCallback, new android.os.Handler(android.os.Looper.getMainLooper()));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPCameraStatusManager", "Failed to register camera availability callback: %s", e17.getMessage());
            c();
        }
    }

    public final void c() {
        android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback;
        if (!this.f492426c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPCameraStatusManager", "Already Not monitoring camera availability");
            return;
        }
        this.f492426c = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPCameraStatusManager", "Stop monitoring camera availability");
        try {
            android.hardware.camera2.CameraManager cameraManager = this.f492424a;
            if (cameraManager == null || (availabilityCallback = this.f492425b) == null) {
                return;
            }
            cameraManager.unregisterAvailabilityCallback(availabilityCallback);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPCameraStatusManager", "Failed to unregister camera availability callback: %s", e17.getMessage());
        }
    }
}
