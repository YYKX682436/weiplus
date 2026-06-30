package qt5;

/* loaded from: classes14.dex */
public class v extends qt5.n {

    /* renamed from: e, reason: collision with root package name */
    public final qt5.i0 f448235e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f448236f;

    public v(qt5.i0 i0Var, android.graphics.SurfaceTexture surfaceTexture) {
        this.f448235e = i0Var;
        this.f448236f = surfaceTexture;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        qt5.d dVar;
        try {
            qt5.d dVar2 = this.f448229d;
            if (dVar2 != null) {
                dVar2.f448213d = false;
            }
            if (!((qt5.c) this.f448235e).f448190b || ((qt5.c) this.f448235e).f448191c) {
                return null;
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("CameraTask.DefaultStartPreviewTask", "do start preview");
            ((qt5.c) this.f448235e).m(this.f448236f);
            this.f448229d = ((qt5.c) this.f448235e).f448194f;
            if (!((qt5.c) this.f448235e).f448193e || (dVar = this.f448229d) == null) {
                return null;
            }
            dVar.f448213d = true;
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("CameraTask.DefaultStartPreviewTask", e17, "startPreview exception");
            java.lang.String message = e17.getMessage();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (message == null) {
                message = "";
            }
            qt5.d dVar3 = new qt5.d(1053, message, e17);
            this.f448229d = dVar3;
            dVar3.f448213d = true;
            return null;
        }
    }
}
