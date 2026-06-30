package qt5;

/* loaded from: classes14.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt5.i f448215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt5.k f448216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt5.f0 f448217f;

    public e0(qt5.f0 f0Var, qt5.i iVar, qt5.k kVar) {
        this.f448217f = f0Var;
        this.f448215d = iVar;
        this.f448216e = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qt5.k kVar = this.f448216e;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            qt5.i iVar = this.f448215d;
            if (iVar != null) {
                iVar.b(currentTimeMillis);
            }
            ((qt5.u) kVar).call();
            if (iVar != null) {
                iVar.c(kVar.f448228d);
            }
            if (iVar != null) {
                this.f448217f.f448220b.post(new qt5.d0(this));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
