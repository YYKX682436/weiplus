package b5;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5.m f99440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b5.a0 f99442f;

    public y(b5.a0 a0Var, l5.m mVar, java.lang.String str) {
        this.f99442f = a0Var;
        this.f99440d = mVar;
        this.f99441e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f99441e;
        b5.a0 a0Var = this.f99442f;
        try {
            try {
                a5.y yVar = (a5.y) this.f99440d.get();
                if (yVar == null) {
                    a5.a0.c().b(b5.a0.f99365z, java.lang.String.format("%s returned a null result. Treating it as a failure.", a0Var.f99370h.f379299c), new java.lang.Throwable[0]);
                } else {
                    a5.a0.c().a(b5.a0.f99365z, java.lang.String.format("%s returned a %s result.", a0Var.f99370h.f379299c, yVar), new java.lang.Throwable[0]);
                    a0Var.f99373n = yVar;
                }
            } catch (java.lang.InterruptedException e17) {
                e = e17;
                a5.a0.c().b(b5.a0.f99365z, java.lang.String.format("%s failed because it threw an exception/error", str), e);
            } catch (java.util.concurrent.CancellationException e18) {
                a5.a0.c().d(b5.a0.f99365z, java.lang.String.format("%s was cancelled", str), e18);
            } catch (java.util.concurrent.ExecutionException e19) {
                e = e19;
                a5.a0.c().b(b5.a0.f99365z, java.lang.String.format("%s failed because it threw an exception/error", str), e);
            }
        } finally {
            a0Var.c();
        }
    }
}
