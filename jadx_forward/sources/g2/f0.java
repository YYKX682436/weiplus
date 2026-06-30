package g2;

/* loaded from: classes14.dex */
public abstract class f0 {
    public static final a2.d a(g2.e0 e0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e0Var, "<this>");
        a2.d dVar = e0Var.f349226a;
        dVar.getClass();
        long j17 = e0Var.f349227b;
        return dVar.subSequence(a2.m1.f(j17), a2.m1.e(j17));
    }

    public static final a2.d b(g2.e0 e0Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e0Var, "<this>");
        long j17 = e0Var.f349227b;
        int e17 = a2.m1.e(j17);
        int e18 = a2.m1.e(j17) + i17;
        a2.d dVar = e0Var.f349226a;
        return dVar.subSequence(e17, java.lang.Math.min(e18, dVar.f82214d.length()));
    }

    public static final a2.d c(g2.e0 e0Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e0Var, "<this>");
        long j17 = e0Var.f349227b;
        return e0Var.f349226a.subSequence(java.lang.Math.max(0, a2.m1.f(j17) - i17), a2.m1.f(j17));
    }
}
