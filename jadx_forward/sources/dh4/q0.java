package dh4;

/* loaded from: classes15.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f314104f;

    public q0(dh4.t0 t0Var, java.lang.String str, java.lang.String str2) {
        this.f314104f = t0Var;
        this.f314102d = str;
        this.f314103e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f314104f.f314119a) {
            java.util.Iterator it = this.f314104f.f314119a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).P2(this.f314102d, this.f314103e);
            }
        }
    }
}
