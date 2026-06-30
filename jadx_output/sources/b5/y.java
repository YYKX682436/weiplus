package b5;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5.m f17907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b5.a0 f17909f;

    public y(b5.a0 a0Var, l5.m mVar, java.lang.String str) {
        this.f17909f = a0Var;
        this.f17907d = mVar;
        this.f17908e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f17908e;
        b5.a0 a0Var = this.f17909f;
        try {
            try {
                a5.y yVar = (a5.y) this.f17907d.get();
                if (yVar == null) {
                    a5.a0.c().b(b5.a0.f17832z, java.lang.String.format("%s returned a null result. Treating it as a failure.", a0Var.f17837h.f297766c), new java.lang.Throwable[0]);
                } else {
                    a5.a0.c().a(b5.a0.f17832z, java.lang.String.format("%s returned a %s result.", a0Var.f17837h.f297766c, yVar), new java.lang.Throwable[0]);
                    a0Var.f17840n = yVar;
                }
            } catch (java.lang.InterruptedException e17) {
                e = e17;
                a5.a0.c().b(b5.a0.f17832z, java.lang.String.format("%s failed because it threw an exception/error", str), e);
            } catch (java.util.concurrent.CancellationException e18) {
                a5.a0.c().d(b5.a0.f17832z, java.lang.String.format("%s was cancelled", str), e18);
            } catch (java.util.concurrent.ExecutionException e19) {
                e = e19;
                a5.a0.c().b(b5.a0.f17832z, java.lang.String.format("%s failed because it threw an exception/error", str), e);
            }
        } finally {
            a0Var.c();
        }
    }
}
