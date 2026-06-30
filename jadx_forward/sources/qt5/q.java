package qt5;

/* loaded from: classes14.dex */
public class q extends qt5.e {

    /* renamed from: d, reason: collision with root package name */
    public final qt5.i0 f448230d;

    public q(qt5.i0 i0Var) {
        this.f448230d = i0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            if (((qt5.c) this.f448230d).f448190b) {
                ((qt5.c) this.f448230d).a();
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("CameraTask.DefaultCloseTask", "close camera done");
            } else {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("CameraTask.DefaultCloseTask", "camera is closed, do not close again");
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("CameraTask.DefaultCloseTask", e17, "closeCamera exception");
            return null;
        }
    }
}
