package b5;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa.a f99437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l5.m f99438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b5.a0 f99439f;

    public x(b5.a0 a0Var, wa.a aVar, l5.m mVar) {
        this.f99439f = a0Var;
        this.f99437d = aVar;
        this.f99438e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l5.m mVar = this.f99438e;
        b5.a0 a0Var = this.f99439f;
        try {
            this.f99437d.get();
            a5.a0.c().a(b5.a0.f99365z, java.lang.String.format("Starting work for %s", a0Var.f99370h.f379299c), new java.lang.Throwable[0]);
            a0Var.f99383x = a0Var.f99371i.e();
            mVar.k(a0Var.f99383x);
        } catch (java.lang.Throwable th6) {
            mVar.j(th6);
        }
    }
}
