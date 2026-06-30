package zq4;

/* loaded from: classes14.dex */
public class a implements android.hardware.Camera.ErrorCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zq4.b f556572a;

    public a(zq4.b bVar) {
        this.f556572a = bVar;
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i17, android.hardware.Camera camera) {
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "Camera Error: " + i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "Camera Error: CAMERA_ERROR_EVICTED");
            xq4.d dVar = this.f556572a.f556582i;
            if (dVar != null) {
                dVar.s();
            }
        }
    }
}
