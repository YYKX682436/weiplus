package bm5;

/* loaded from: classes7.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final bm5.h1 f22691a;

    /* renamed from: b, reason: collision with root package name */
    public final bm5.g1 f22692b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.Object f22693c;

    public i1(bm5.h1 h1Var, bm5.g1 g1Var) {
        this.f22691a = h1Var;
        this.f22692b = g1Var;
    }

    public static bm5.i1 a(bm5.h1 h1Var, bm5.g1 g1Var) {
        java.util.Objects.requireNonNull(h1Var);
        java.util.Objects.requireNonNull(g1Var);
        return new bm5.i1(h1Var, g1Var);
    }

    public final java.lang.Object b() {
        if (this.f22693c == null) {
            synchronized (this) {
                if (this.f22693c == null) {
                    this.f22693c = this.f22691a.a();
                }
            }
        }
        return this.f22693c;
    }

    public final void c() {
        java.lang.Object obj;
        bm5.g1 g1Var;
        synchronized (this) {
            obj = this.f22693c;
            this.f22693c = null;
        }
        if (obj == null || (g1Var = this.f22692b) == null) {
            return;
        }
        g1Var.a(obj);
    }
}
