package nz2;

/* loaded from: classes9.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f423111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nz2.x f423112f;

    public w(nz2.x xVar, java.lang.String str, int i17) {
        this.f423112f = xVar;
        this.f423110d = str;
        this.f423111e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nz2.x xVar = this.f423112f;
        xVar.D1(new java.lang.Object[0]);
        d50.q b17 = xVar.b();
        nz2.v vVar = new nz2.v(this);
        ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
        ((ne4.n) b17).b(vVar, true, 1, new oz2.c(this.f423110d, this.f423111e), 0);
    }
}
