package qt5;

/* loaded from: classes14.dex */
public class u extends qt5.k {

    /* renamed from: e, reason: collision with root package name */
    public final qt5.i0 f448233e;

    /* renamed from: f, reason: collision with root package name */
    public final int f448234f;

    public u(qt5.i0 i0Var, int i17) {
        this.f448233e = i0Var;
        this.f448234f = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("CameraTask.CameraReOpenTask", "reopen camera");
            ((qt5.c) this.f448233e).a();
            ((qt5.c) this.f448233e).i(this.f448234f);
            qt5.d dVar = ((qt5.c) this.f448233e).f448192d;
            this.f448228d = dVar;
            if (dVar != null) {
                dVar.f448213d = true;
            }
            ((qt5.c) this.f448233e).n(new qt5.t(this));
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("CameraTask.CameraReOpenTask", e17, "reOpenCamera exception");
            qt5.d dVar2 = this.f448228d;
            if (dVar2 == null) {
                return null;
            }
            dVar2.f448213d = true;
            return null;
        }
    }
}
