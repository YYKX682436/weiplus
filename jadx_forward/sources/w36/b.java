package w36;

/* loaded from: classes16.dex */
public class b implements l36.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l36.w0 f524303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w36.h f524304e;

    public b(w36.h hVar, l36.w0 w0Var) {
        this.f524304e = hVar;
        this.f524303d = w0Var;
    }

    @Override // l36.o
    public void a(l36.n nVar, l36.a1 a1Var) {
        try {
            this.f524304e.a(a1Var);
            ((l36.o0) m36.a.f404915a).getClass();
            o36.j jVar = ((l36.u0) nVar).f397185e.f433271b;
            jVar.f();
            o36.d b17 = jVar.b();
            o36.c cVar = new o36.c(b17, true, b17.f424299i, b17.f424300j, jVar);
            try {
                this.f524304e.f524317b.getClass();
                this.f524304e.d("OkHttp WebSocket " + this.f524303d.f397214a.n(), cVar);
                jVar.b().f424295e.setSoTimeout(0);
                this.f524304e.e();
            } catch (java.lang.Exception e17) {
                this.f524304e.c(e17, null);
            }
        } catch (java.net.ProtocolException e18) {
            this.f524304e.c(e18, a1Var);
            m36.e.c(a1Var);
        }
    }

    @Override // l36.o
    public void d(l36.n nVar, java.io.IOException iOException) {
        this.f524304e.c(iOException, null);
    }
}
