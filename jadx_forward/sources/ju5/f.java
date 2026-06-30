package ju5;

/* loaded from: classes15.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public eu5.b f383621a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f383622b = false;

    public synchronized void b(eu5.e eVar) {
        if (this.f383622b) {
            zt5.h.f("Soter.BaseSoterTask", "soter: warning: already removed the task!", new java.lang.Object[0]);
            return;
        }
        e(eVar);
        ju5.n.c().e(this);
        ju5.o.a().b(new ju5.e(this, eVar));
    }

    public abstract void c();

    public abstract boolean d();

    public abstract void e(eu5.e eVar);

    public abstract void f();

    public abstract boolean g();
}
