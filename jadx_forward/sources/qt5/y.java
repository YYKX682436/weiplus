package qt5;

/* loaded from: classes14.dex */
public class y extends st5.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt5.f f448239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt5.h f448240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt5.f0 f448241f;

    public y(qt5.f0 f0Var, qt5.f fVar, qt5.h hVar) {
        this.f448241f = f0Var;
        this.f448239d = fVar;
        this.f448240e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qt5.h hVar = this.f448240e;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            qt5.f fVar = this.f448239d;
            if (fVar != null) {
                fVar.b(currentTimeMillis);
            }
            ((qt5.s) hVar).call();
            if (fVar != null) {
                fVar.c(hVar.f448221d);
            }
            if (fVar != null) {
                this.f448241f.f448220b.post(new qt5.x(this));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
