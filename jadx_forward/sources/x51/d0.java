package x51;

/* loaded from: classes16.dex */
public class d0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Callable f533517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.a f533518b;

    public d0(java.util.concurrent.Callable callable, m3.a aVar) {
        this.f533517a = callable;
        this.f533518b = aVar;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        x51.c0 c0Var = new x51.c0(this, (java.lang.Boolean) obj);
        java.util.concurrent.Executor executor = p5.m.f433516g;
        p5.n nVar = new p5.n();
        try {
            ((p5.e) executor).execute(new p5.l(null, nVar, c0Var));
        } catch (java.lang.Exception e17) {
            nVar.a(new p5.i(e17));
        }
        x51.b0 b0Var = new x51.b0(this);
        java.util.concurrent.Executor executor2 = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.f153934a;
        if (executor2 == null) {
            executor2 = p5.m.f433517h;
        }
        nVar.f433523a.a(b0Var, executor2, null).a(new x51.a0(this), p5.m.f433517h, null);
    }
}
