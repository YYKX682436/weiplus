package uo;

/* loaded from: classes11.dex */
public final class o implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final uo.o f511063d = new uo.o();

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "initCameraNumbers getNumberOfCameras start");
        uo.q qVar = uo.q.f511065a;
        uo.q.f511066b = android.hardware.Camera.getNumberOfCameras();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "initCameraNumbers getNumberOfCameras Done mCameraNumber is " + uo.q.f511066b);
        uo.q qVar2 = uo.q.f511065a;
        qVar2.b();
        qVar2.a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("cameraNumberCache", uo.q.f511066b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("camera2NumberInfoCache", uo.q.f511069e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("camera2SupportLevelsCache", uo.q.f511070f);
        return java.lang.Integer.valueOf(uo.q.f511066b);
    }
}
