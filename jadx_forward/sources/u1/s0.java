package u1;

/* loaded from: classes14.dex */
public final class s0 implements u1.v0 {
    @Override // u1.v0
    public int a() {
        return 2;
    }

    @Override // u1.v0
    public void b(u1.w layoutNode, long j17, u1.s hitTestResult, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNode, "layoutNode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hitTestResult, "hitTestResult");
        u1.n1 n1Var = layoutNode.f505215J;
        n1Var.f505173i.m0(u1.c1.E, n1Var.f505173i.d0(j17), hitTestResult, true, z18);
    }

    @Override // u1.v0
    public boolean c(u1.w parentLayoutNode) {
        y1.l c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentLayoutNode, "parentLayoutNode");
        y1.n d17 = y1.z.d(parentLayoutNode);
        boolean z17 = false;
        if (d17 != null && (c17 = d17.c()) != null && c17.f540301f) {
            z17 = true;
        }
        return !z17;
    }

    @Override // u1.v0
    public boolean d(u1.p0 p0Var) {
        y1.n entity = (y1.n) p0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity, "entity");
        return false;
    }

    @Override // u1.v0
    public java.lang.Object e(u1.p0 p0Var) {
        y1.n entity = (y1.n) p0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity, "entity");
        return entity;
    }
}
