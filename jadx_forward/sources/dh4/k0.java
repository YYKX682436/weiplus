package dh4;

/* loaded from: classes15.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f314073d;

    public k0(dh4.t0 t0Var) {
        this.f314073d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f314073d.f314119a) {
            java.util.Iterator it = this.f314073d.f314119a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).n1();
            }
        }
    }
}
