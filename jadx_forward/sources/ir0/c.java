package ir0;

/* loaded from: classes11.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ir0.c f375457d = new ir0.c();

    public c() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        long j17;
        java.lang.String task = (java.lang.String) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            ri.i0 i0Var = ri.k0.f477453a;
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("@[0-9a-z]+");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            java.lang.String replaceAll = compile.matcher(task).replaceAll("");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
            j17 = longValue;
            str = task;
            i0Var.a(new ri.j0(100, null, 0, 0, longValue, 0L, 0L, 0, replaceAll, 0, null, 0, null, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, 0L, null, null, null, 0, 0, null, null, 0, 0, -274, 1, null));
        } else {
            str = task;
            j17 = longValue;
        }
        oj.j.b("MicroMsg.MatrixLifecycleBoot", "heavy task(cost " + j17 + "ms):" + str, new java.lang.Object[0]);
        return jz5.f0.f384359a;
    }
}
