package p16;

/* loaded from: classes16.dex */
public abstract class v extends p16.c implements java.io.Serializable {
    public v(p16.p pVar) {
    }

    public static p16.u b(p16.h0 h0Var, p16.h0 h0Var2, p16.x xVar, int i17, p16.g1 g1Var, boolean z17, java.lang.Class cls) {
        return new p16.u(h0Var, java.util.Collections.emptyList(), h0Var2, new p16.t(xVar, i17, g1Var, true, z17), cls);
    }

    public static p16.u c(p16.h0 h0Var, java.lang.Object obj, p16.h0 h0Var2, p16.x xVar, int i17, p16.g1 g1Var, java.lang.Class cls) {
        return new p16.u(h0Var, obj, h0Var2, new p16.t(xVar, i17, g1Var, false, false), cls);
    }
}
