package c1;

/* loaded from: classes14.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t1.f f119261a = t1.c.a(c1.z.f119326d);

    public static final void a(c1.p pVar) {
        u1.w1 snapshotObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<this>");
        u1.c1 c1Var = pVar.f119308q;
        if (c1Var == null) {
            return;
        }
        c1.x properties = pVar.f119306o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(properties, "<this>");
        c1.y yVar = (c1.y) properties;
        yVar.f119317a = true;
        c1.d0 d0Var = c1.d0.f119266b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d0Var, "<set-?>");
        yVar.f119318b = d0Var;
        yVar.f119319c = d0Var;
        yVar.f119320d = d0Var;
        yVar.f119321e = d0Var;
        yVar.f119322f = d0Var;
        yVar.f119323g = d0Var;
        yVar.f119324h = d0Var;
        yVar.f119325i = d0Var;
        u1.r1 r1Var = c1Var.f505087h.f505222m;
        if (r1Var != null && (snapshotObserver = r1Var.getSnapshotObserver()) != null) {
            int i17 = c1.p.f119297q1;
            snapshotObserver.a(pVar, c1.o.f119296d, new c1.a0(pVar));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(properties, "properties");
        if (((c1.y) properties).f119317a) {
            c1.k0.a(pVar);
        } else {
            c1.k0.d(pVar);
        }
    }
}
