package dh4;

/* loaded from: classes15.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f314081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f314082g;

    public l0(dh4.t0 t0Var, java.lang.String str, int i17, int i18) {
        this.f314082g = t0Var;
        this.f314079d = str;
        this.f314080e = i17;
        this.f314081f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f314082g.f314119a) {
            java.util.Iterator it = this.f314082g.f314119a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).J1(this.f314079d, this.f314080e, this.f314081f);
            }
        }
    }
}
