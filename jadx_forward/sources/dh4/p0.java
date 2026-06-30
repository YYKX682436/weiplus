package dh4;

/* loaded from: classes15.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f314098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dh4.t0 f314101g;

    public p0(dh4.t0 t0Var, int i17, int i18, java.lang.String str) {
        this.f314101g = t0Var;
        this.f314098d = i17;
        this.f314099e = i18;
        this.f314100f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f314101g.f314119a) {
            java.util.Iterator it = this.f314101g.f314119a.iterator();
            while (it.hasNext()) {
                ((p21.d) it.next()).J0(this.f314098d, this.f314099e, this.f314100f);
            }
        }
    }
}
