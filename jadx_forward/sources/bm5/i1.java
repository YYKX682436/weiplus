package bm5;

/* loaded from: classes7.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final bm5.h1 f104224a;

    /* renamed from: b, reason: collision with root package name */
    public final bm5.g1 f104225b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.Object f104226c;

    public i1(bm5.h1 h1Var, bm5.g1 g1Var) {
        this.f104224a = h1Var;
        this.f104225b = g1Var;
    }

    public static bm5.i1 a(bm5.h1 h1Var, bm5.g1 g1Var) {
        java.util.Objects.requireNonNull(h1Var);
        java.util.Objects.requireNonNull(g1Var);
        return new bm5.i1(h1Var, g1Var);
    }

    public final java.lang.Object b() {
        if (this.f104226c == null) {
            synchronized (this) {
                if (this.f104226c == null) {
                    this.f104226c = this.f104224a.a();
                }
            }
        }
        return this.f104226c;
    }

    public final void c() {
        java.lang.Object obj;
        bm5.g1 g1Var;
        synchronized (this) {
            obj = this.f104226c;
            this.f104226c = null;
        }
        if (obj == null || (g1Var = this.f104225b) == null) {
            return;
        }
        g1Var.a(obj);
    }
}
