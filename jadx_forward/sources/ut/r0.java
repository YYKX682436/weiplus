package ut;

/* loaded from: classes9.dex */
public abstract class r0 {
    public static final c01.f7 a(c01.f7 f7Var, java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f7Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        if (com.p314xaae8f345.mm.vfs.w6.k(filePath) > 0) {
            return null;
        }
        java.lang.String k17 = f7Var.k();
        boolean z17 = false;
        if (k17 != null && (r26.n0.N(k17) ^ true)) {
            if (f7Var.j() != null && (!r26.n0.N(r5))) {
                z17 = true;
            }
            if (z17) {
                return f7Var;
            }
        }
        return null;
    }
}
