package so5;

/* loaded from: classes14.dex */
public final class m0 extends android.hardware.camera2.CameraManager.AvailabilityCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so5.n0 f492417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so5.l0 f492418b;

    public m0(so5.n0 n0Var, so5.l0 l0Var) {
        this.f492417a = n0Var;
        this.f492418b = l0Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPCameraStatusManager", "Camera access priorities changed");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        so5.n0 n0Var = this.f492417a;
        if (currentTimeMillis - n0Var.f492427d >= 500) {
            n0Var.f492427d = currentTimeMillis;
            this.f492418b.a();
        }
    }
}
