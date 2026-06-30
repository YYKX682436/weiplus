package z3;

/* loaded from: classes13.dex */
public abstract class c {
    public static final p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass, p012xc85e97e9.p093xedfae76a.m1 m1Var, java.lang.String str, p012xc85e97e9.p093xedfae76a.f1 f1Var, n0.o oVar, int i17, int i18) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(564615719);
        if ((i18 & 2) != 0 && (m1Var = z3.b.f551391a.a(y0Var, 0)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i18 & 4) != 0) {
            str = null;
        }
        if ((i18 & 8) != 0) {
            f1Var = null;
        }
        p012xc85e97e9.p093xedfae76a.j1 j1Var = f1Var != null ? new p012xc85e97e9.p093xedfae76a.j1(m1Var.getViewModel(), f1Var) : new p012xc85e97e9.p093xedfae76a.j1(m1Var);
        if (str != null) {
            a17 = j1Var.b(str, modelClass);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "{\n        provider.get(key, javaClass)\n    }");
        } else {
            a17 = j1Var.a(modelClass);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "{\n        provider.get(javaClass)\n    }");
        }
        y0Var.o(false);
        return a17;
    }
}
