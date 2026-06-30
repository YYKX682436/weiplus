package qt5;

/* loaded from: classes14.dex */
public class a0 extends st5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt5.l f448184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt5.n f448185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt5.f0 f448186f;

    public a0(qt5.f0 f0Var, qt5.l lVar, qt5.n nVar) {
        this.f448186f = f0Var;
        this.f448184d = lVar;
        this.f448185e = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qt5.n nVar = this.f448185e;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            qt5.l lVar = this.f448184d;
            if (lVar != null) {
                lVar.b(currentTimeMillis);
            }
            ((qt5.v) nVar).call();
            if (lVar != null) {
                lVar.c(nVar.f448229d);
            }
            if (lVar != null) {
                this.f448186f.f448220b.post(new qt5.z(this));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
