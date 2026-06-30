package p5;

/* loaded from: classes16.dex */
public class j implements p5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.n f433507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.h f433508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Executor f433509c;

    public j(p5.m mVar, p5.n nVar, p5.h hVar, java.util.concurrent.Executor executor, p5.g gVar) {
        this.f433507a = nVar;
        this.f433508b = hVar;
        this.f433509c = executor;
    }

    @Override // p5.h
    public java.lang.Object a(p5.m mVar) {
        p5.h hVar = this.f433508b;
        java.util.concurrent.Executor executor = this.f433509c;
        p5.n nVar = this.f433507a;
        try {
            executor.execute(new p5.k(null, nVar, hVar, mVar));
        } catch (java.lang.Exception e17) {
            nVar.a(new p5.i(e17));
        }
        return null;
    }
}
