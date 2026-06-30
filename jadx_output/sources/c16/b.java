package c16;

/* loaded from: classes16.dex */
public abstract class b {
    public static c16.a a(f26.x2 x2Var, boolean z17, boolean z18, o06.e2 e2Var, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 1) != 0 ? false : z17;
        boolean z27 = (i17 & 2) != 0 ? false : z18;
        if ((i17 & 4) != 0) {
            e2Var = null;
        }
        kotlin.jvm.internal.o.g(x2Var, "<this>");
        return new c16.a(x2Var, null, z27, z19, e2Var != null ? kz5.o1.c(e2Var) : null, null, 34, null);
    }
}
