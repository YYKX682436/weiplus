package ju5;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f383637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.n f383638e;

    public k(ju5.n nVar, int i17) {
        this.f383638e = nVar;
        this.f383637d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f383638e.f383661a) {
            ju5.f fVar = (ju5.f) ju5.n.f383660c.get(this.f383637d);
            if (fVar != null) {
                fVar.f();
            }
        }
    }
}
