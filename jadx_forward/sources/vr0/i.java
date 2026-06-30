package vr0;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa.a f521010d;

    public i(wa.a aVar) {
        this.f521010d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6009xfb7e8bf8(this.f521010d);
        } catch (java.lang.Error e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e17);
        } catch (java.lang.RuntimeException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e18);
        } catch (java.util.concurrent.ExecutionException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e19.getCause());
        }
    }
}
