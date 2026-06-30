package qt5;

/* loaded from: classes14.dex */
public class s extends qt5.h {

    /* renamed from: e, reason: collision with root package name */
    public final qt5.i0 f448231e;

    /* renamed from: f, reason: collision with root package name */
    public final int f448232f;

    public s(qt5.i0 i0Var, int i17) {
        this.f448231e = i0Var;
        this.f448232f = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            qt5.d dVar = this.f448221d;
            if (dVar != null) {
                dVar.f448213d = false;
            }
            if (((qt5.c) this.f448231e).f448190b) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("CameraTask.DefaultOpenTask", "camera is already opened, do not open again");
                return null;
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("CameraTask.DefaultOpenTask", "do open camera");
            ((qt5.c) this.f448231e).i(this.f448232f);
            qt5.d dVar2 = ((qt5.c) this.f448231e).f448192d;
            this.f448221d = dVar2;
            if (dVar2 != null) {
                dVar2.f448213d = true;
            }
            ((qt5.c) this.f448231e).n(new qt5.r(this));
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("CameraTask.DefaultOpenTask", e17, "openCamera exception");
            java.lang.String message = e17.getMessage();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (message == null) {
                message = "";
            }
            qt5.d dVar3 = new qt5.d(1002, message, e17);
            this.f448221d = dVar3;
            dVar3.f448213d = true;
            return null;
        }
    }
}
