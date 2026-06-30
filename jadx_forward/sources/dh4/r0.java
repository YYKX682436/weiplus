package dh4;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f314109e;

    public r0(dh4.t0 t0Var, java.lang.String str) {
        this.f314109e = t0Var;
        this.f314108d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f314109e.f314119a) {
            java.util.Iterator it = this.f314109e.f314119a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).T0(this.f314108d);
            }
        }
    }
}
