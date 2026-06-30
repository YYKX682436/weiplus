package jo5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.camera2.CameraManager f382467a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f382468b;

    /* renamed from: c, reason: collision with root package name */
    public final jo5.b f382469c;

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.camera2.CameraCaptureSession f382470d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f382471e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Range f382472f;

    public c(android.hardware.camera2.CameraManager cameraManager, java.lang.String cameraId, com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.c facing, jo5.b camera2Device, android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, android.util.Size size, android.util.Range range, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        cameraCaptureSession = (i17 & 16) != 0 ? null : cameraCaptureSession;
        surface = (i17 & 64) != 0 ? null : surface;
        range = (i17 & 256) != 0 ? null : range;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraManager, "cameraManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraId, "cameraId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(facing, "facing");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera2Device, "camera2Device");
        this.f382467a = cameraManager;
        this.f382468b = cameraId;
        this.f382469c = camera2Device;
        this.f382470d = cameraCaptureSession;
        this.f382471e = surface;
        this.f382472f = range;
    }
}
