package qt5;

/* loaded from: classes14.dex */
public class w extends qt5.o {

    /* renamed from: d, reason: collision with root package name */
    public final qt5.i0 f448237d;

    public w(qt5.i0 i0Var) {
        this.f448237d = i0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            if (((qt5.c) this.f448237d).f448191c) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("CameraTask.DefaultStopPreviewTask", "stop preview");
                qt5.c cVar = (qt5.c) this.f448237d;
                android.hardware.Camera camera = cVar.f448189a;
                if (camera != null) {
                    camera.stopPreview();
                    cVar.f448191c = false;
                    cVar.f448193e = false;
                    cVar.f448194f = null;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("CameraTask.DefaultStopPreviewTask", e17, "stopPreview exception");
        }
        return null;
    }
}
