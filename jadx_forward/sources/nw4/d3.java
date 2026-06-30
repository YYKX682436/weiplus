package nw4;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final nw4.d3 f422354a = new nw4.d3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f422355b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final nw4.c3 f422356c = nw4.c3.f422345b;

    public final boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        nw4.j g17 = env.f422396d.g();
        if (g17 != null && g17.b(env, msg) && g17.a(env, msg)) {
            return true;
        }
        for (nw4.j jVar : f422355b) {
            if (jVar.b(env, msg) && jVar.a(env, msg)) {
                return true;
            }
        }
        nw4.c3 c3Var = f422356c;
        return c3Var.b(env, msg) && c3Var.a(env, msg);
    }
}
