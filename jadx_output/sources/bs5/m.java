package bs5;

/* loaded from: classes13.dex */
public class m implements pr5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs5.o f24047a;

    public m(bs5.o oVar) {
        this.f24047a = oVar;
    }

    public void a() {
        if (!kr5.p.f311571b.f311560o) {
            or5.b.a("Network changed, clear caches", new java.lang.Object[0]);
            this.f24047a.f24053e.b();
        }
        synchronized (this.f24047a.f24049a) {
            try {
                java.util.Iterator it = ((java.util.Vector) this.f24047a.f24049a).iterator();
                while (it.hasNext()) {
                    ((lr5.c) lr5.e.f320769b).a((java.lang.Runnable) it.next());
                }
            } finally {
            }
        }
        or5.b.a("Network changed, refetch server Ips", new java.lang.Object[0]);
        kr5.c.c().d();
        if (kr5.p.f311571b.f311553h) {
            synchronized (this.f24047a.f24051c) {
                try {
                    or5.b.a("Network changed, enable persistent async lookup", new java.lang.Object[0]);
                    java.util.Iterator it6 = this.f24047a.f24051c.iterator();
                    while (it6.hasNext()) {
                        tr5.f0 f0Var = (tr5.f0) it6.next();
                        or5.b.a("Async lookup for %s start", f0Var.f421476b);
                        tr5.e0 e0Var = new tr5.e0(f0Var);
                        e0Var.f421472n = true;
                        tr5.f0 a17 = e0Var.a();
                        ((lr5.d) lr5.e.f320770c).execute(new bs5.l(this, a17));
                        it6.remove();
                    }
                } finally {
                }
            }
        }
    }
}
