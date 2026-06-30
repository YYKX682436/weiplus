package e31;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final e31.n f328620a = new e31.n();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f328621b = new java.util.LinkedHashMap();

    public final e31.k a(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.Object obj = ((java.util.LinkedHashMap) f328621b).get(name);
        h0Var.f391656d = obj;
        if (obj == null) {
            fs.g.c(e31.e.class, name, new e31.m(h0Var));
        }
        return (e31.k) h0Var.f391656d;
    }
}
