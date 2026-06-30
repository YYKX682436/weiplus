package dh4;

/* loaded from: classes15.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f314088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f314089e;

    public n0(dh4.t0 t0Var, int i17) {
        this.f314089e = t0Var;
        this.f314088d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f314089e.f314119a) {
            java.util.Iterator it = this.f314089e.f314119a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).N4(this.f314088d);
            }
        }
    }
}
