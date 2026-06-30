package b5;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa.a f17904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l5.m f17905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b5.a0 f17906f;

    public x(b5.a0 a0Var, wa.a aVar, l5.m mVar) {
        this.f17906f = a0Var;
        this.f17904d = aVar;
        this.f17905e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l5.m mVar = this.f17905e;
        b5.a0 a0Var = this.f17906f;
        try {
            this.f17904d.get();
            a5.a0.c().a(b5.a0.f17832z, java.lang.String.format("Starting work for %s", a0Var.f17837h.f297766c), new java.lang.Throwable[0]);
            a0Var.f17850x = a0Var.f17838i.e();
            mVar.k(a0Var.f17850x);
        } catch (java.lang.Throwable th6) {
            mVar.j(th6);
        }
    }
}
