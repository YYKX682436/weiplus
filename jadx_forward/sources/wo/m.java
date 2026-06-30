package wo;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f529268d;

    public m(wo.n nVar, int i17) {
        this.f529268d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f529268d;
        try {
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            uo.q.f511065a.g(i17, cameraInfo);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CameraUtilImplConfig", "CameraUtilImplConfig update CameraInfo Cache failed : " + th6.getMessage());
        }
    }
}
