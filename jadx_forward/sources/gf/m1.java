package gf;

/* loaded from: classes7.dex */
public final class m1 {
    public m1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final synchronized gf.o1 a(ze.n runtime) {
        gf.o1 o1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        java.util.HashMap hashMap = gf.o1.f352689c;
        o1Var = (gf.o1) hashMap.get(runtime);
        if (o1Var == null) {
            o1Var = new gf.o1(runtime);
            hashMap.put(runtime, o1Var);
        }
        return o1Var;
    }
}
