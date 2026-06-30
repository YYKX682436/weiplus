package w11;

/* loaded from: classes9.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static w11.o1 f523679a;

    public static final w11.r1 a(java.lang.String str) {
        return b(str, null, 2, null);
    }

    public static w11.r1 b(java.lang.String str, w11.p1 p1Var, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            p1Var = w11.p1.f523635d;
        }
        w11.r1 r1Var = new w11.r1();
        r1Var.g(str);
        r1Var.f523670l = p1Var;
        return r1Var;
    }
}
