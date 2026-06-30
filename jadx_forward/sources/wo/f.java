package wo;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f529217d;

    public f(int i17) {
        this.f529217d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int d17 = uo.q.f511065a.d();
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            int i17 = 0;
            while (true) {
                if (i17 >= d17) {
                    i17 = 0;
                    break;
                }
                android.hardware.Camera.getCameraInfo(i17, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                } else {
                    i17++;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraUtil", "getBackCameraId cacheBid = %d, noCacheBid = %d", java.lang.Integer.valueOf(this.f529217d), java.lang.Integer.valueOf(i17));
            uo.q qVar = uo.q.f511065a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "updateBackCameraId " + i17);
            uo.q.f511072h = i17;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("PluginCamera_BackCameraId", i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraUtil", "getBackCameraId get cache failed : " + th6.getMessage());
        }
    }
}
