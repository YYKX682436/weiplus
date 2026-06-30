package ko3;

/* loaded from: classes13.dex */
public class z extends android.hardware.camera2.CameraManager.AvailabilityCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ko3.a0 f391564a;

    public z(ko3.a0 a0Var) {
        this.f391564a = a0Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAvailable(java.lang.String str) {
        this.f391564a.f391467d.d(str, true);
        ko3.a0.f391465f.mo50297x7c4d7ca2(new ko3.x(this), 2000L);
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraUnavailable(java.lang.String str) {
        this.f391564a.f391467d.d(str, false);
        ko3.a0.f391465f.mo50297x7c4d7ca2(new ko3.y(this), 2000L);
    }
}
