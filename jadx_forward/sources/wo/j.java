package wo;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f529260d;

    public j(wo.k kVar, int i17) {
        this.f529260d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f529260d;
        try {
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            uo.q.f511065a.g(i17, cameraInfo);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraUtil.CameraUtilImpl22", "CameraUtilImpl22 update cache failed : " + th6.getMessage());
        }
    }
}
