package dh4;

/* loaded from: classes15.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f314091e;

    public o0(dh4.t0 t0Var, java.lang.String str) {
        this.f314091e = t0Var;
        this.f314090d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f314091e.f314119a) {
            java.util.Iterator it = this.f314091e.f314119a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).q5(this.f314090d);
            }
        }
    }
}
