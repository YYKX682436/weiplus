package c1;

/* loaded from: classes14.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t1.f f37728a = t1.c.a(c1.z.f37793d);

    public static final void a(c1.p pVar) {
        u1.w1 snapshotObserver;
        kotlin.jvm.internal.o.g(pVar, "<this>");
        u1.c1 c1Var = pVar.f37775q;
        if (c1Var == null) {
            return;
        }
        c1.x properties = pVar.f37773o;
        kotlin.jvm.internal.o.g(properties, "<this>");
        c1.y yVar = (c1.y) properties;
        yVar.f37784a = true;
        c1.d0 d0Var = c1.d0.f37733b;
        kotlin.jvm.internal.o.g(d0Var, "<set-?>");
        yVar.f37785b = d0Var;
        yVar.f37786c = d0Var;
        yVar.f37787d = d0Var;
        yVar.f37788e = d0Var;
        yVar.f37789f = d0Var;
        yVar.f37790g = d0Var;
        yVar.f37791h = d0Var;
        yVar.f37792i = d0Var;
        u1.r1 r1Var = c1Var.f423554h.f423689m;
        if (r1Var != null && (snapshotObserver = r1Var.getSnapshotObserver()) != null) {
            int i17 = c1.p.f37764q1;
            snapshotObserver.a(pVar, c1.o.f37763d, new c1.a0(pVar));
        }
        kotlin.jvm.internal.o.g(properties, "properties");
        if (((c1.y) properties).f37784a) {
            c1.k0.a(pVar);
        } else {
            c1.k0.d(pVar);
        }
    }
}
