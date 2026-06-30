package f5;

/* loaded from: classes13.dex */
public class d implements g5.c {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f341105d = a5.a0.e("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final f5.c f341106a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.d[] f341107b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f341108c;

    public d(android.content.Context context, m5.a aVar, f5.c cVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f341106a = cVar;
        this.f341107b = new g5.d[]{new g5.a(applicationContext, aVar), new g5.b(applicationContext, aVar), new g5.i(applicationContext, aVar), new g5.e(applicationContext, aVar), new g5.h(applicationContext, aVar), new g5.g(applicationContext, aVar), new g5.f(applicationContext, aVar)};
        this.f341108c = new java.lang.Object();
    }

    public boolean a(java.lang.String str) {
        synchronized (this.f341108c) {
            for (g5.d dVar : this.f341107b) {
                java.lang.Object obj = dVar.f350411b;
                if (obj != null && dVar.b(obj) && ((java.util.ArrayList) dVar.f350410a).contains(str)) {
                    a5.a0.c().a(f341105d, java.lang.String.format("Work %s constrained by %s", str, dVar.getClass().getSimpleName()), new java.lang.Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(java.lang.Iterable iterable) {
        synchronized (this.f341108c) {
            for (g5.d dVar : this.f341107b) {
                if (dVar.f350413d != null) {
                    dVar.f350413d = null;
                    dVar.d(null, dVar.f350411b);
                }
            }
            for (g5.d dVar2 : this.f341107b) {
                dVar2.c(iterable);
            }
            for (g5.d dVar3 : this.f341107b) {
                if (dVar3.f350413d != this) {
                    dVar3.f350413d = this;
                    dVar3.d(this, dVar3.f350411b);
                }
            }
        }
    }

    public void c() {
        synchronized (this.f341108c) {
            for (g5.d dVar : this.f341107b) {
                java.util.List list = dVar.f350410a;
                if (!((java.util.ArrayList) list).isEmpty()) {
                    ((java.util.ArrayList) list).clear();
                    h5.f fVar = dVar.f350412c;
                    synchronized (fVar.f360522c) {
                        if (fVar.f360523d.remove(dVar) && fVar.f360523d.isEmpty()) {
                            fVar.d();
                        }
                    }
                }
            }
        }
    }
}
