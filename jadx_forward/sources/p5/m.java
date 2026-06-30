package p5;

/* loaded from: classes16.dex */
public class m {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f433515f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.Executor f433516g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.Executor f433517h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f433518a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f433519b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f433520c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Exception f433521d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f433522e;

    static {
        p5.f fVar = p5.f.f433504c;
        f433515f = fVar.f433505a;
        f433516g = fVar.f433506b;
        f433517h = p5.c.f433499b.f433502a;
        new p5.m((java.lang.Object) null);
        new p5.m(java.lang.Boolean.TRUE);
        new p5.m(java.lang.Boolean.FALSE);
        new p5.m(true);
    }

    public m() {
        this.f433518a = new java.lang.Object();
        this.f433522e = new java.util.ArrayList();
    }

    public p5.m a(p5.h hVar, java.util.concurrent.Executor executor, p5.g gVar) {
        boolean z17;
        p5.n nVar = new p5.n();
        synchronized (this.f433518a) {
            synchronized (this.f433518a) {
                z17 = this.f433519b;
            }
            if (!z17) {
                ((java.util.ArrayList) this.f433522e).add(new p5.j(this, nVar, hVar, executor, gVar));
            }
        }
        if (z17) {
            try {
                executor.execute(new p5.k(gVar, nVar, hVar, this));
            } catch (java.lang.Exception e17) {
                nVar.a(new p5.i(e17));
            }
        }
        return nVar.f433523a;
    }

    public final void b() {
        synchronized (this.f433518a) {
            java.util.Iterator it = this.f433522e.iterator();
            while (it.hasNext()) {
                try {
                    ((p5.h) it.next()).a(this);
                } catch (java.lang.RuntimeException e17) {
                    throw e17;
                } catch (java.lang.Exception e18) {
                    throw new java.lang.RuntimeException(e18);
                }
            }
            this.f433522e = null;
        }
    }

    public boolean c(java.lang.Object obj) {
        synchronized (this.f433518a) {
            if (this.f433519b) {
                return false;
            }
            this.f433519b = true;
            this.f433520c = obj;
            this.f433518a.notifyAll();
            b();
            return true;
        }
    }

    public m(java.lang.Object obj) {
        this.f433518a = new java.lang.Object();
        this.f433522e = new java.util.ArrayList();
        c(obj);
    }

    public m(boolean z17) {
        java.lang.Object obj = new java.lang.Object();
        this.f433518a = obj;
        this.f433522e = new java.util.ArrayList();
        if (z17) {
            synchronized (obj) {
                if (!this.f433519b) {
                    this.f433519b = true;
                    obj.notifyAll();
                    b();
                }
            }
            return;
        }
        c(null);
    }
}
