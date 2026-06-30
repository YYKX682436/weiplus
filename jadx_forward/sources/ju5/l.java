package ju5;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f383654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.n f383655e;

    public l(ju5.n nVar, int i17) {
        this.f383655e = nVar;
        this.f383654d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        synchronized (this.f383655e.f383661a) {
            obj = (ju5.f) ju5.n.f383660c.get(this.f383654d);
        }
        if (obj == null || !(obj instanceof ju5.a)) {
            return;
        }
        ju5.a aVar = (ju5.a) obj;
        if (aVar.mo141429x62a56b47()) {
            return;
        }
        aVar.a();
    }
}
