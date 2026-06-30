package dh4;

/* loaded from: classes15.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f314066d;

    public h0(dh4.t0 t0Var) {
        this.f314066d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f314066d.f314119a) {
            java.util.Iterator it = this.f314066d.f314119a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).T1();
            }
        }
    }
}
