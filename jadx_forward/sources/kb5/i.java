package kb5;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, kb5.k kVar) {
        super(1);
        this.f387786d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        jz5.f0 f0Var;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (dVar != null && (dVar instanceof wi5.f0)) {
            wi5.f0 f0Var3 = (wi5.f0) dVar;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f387786d);
            r45.ha5 ha5Var = new r45.ha5();
            java.util.Iterator it = ((java.util.ArrayList) g95.e.f351334a.f(f0Var3.f527821b)).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next();
                java.util.LinkedList linkedList = ha5Var.f457514d;
                r45.ga5 ga5Var = new r45.ga5();
                ga5Var.f456574d = z3Var.d1();
                ga5Var.f456576f = ui5.b.f509674g.c(z3Var, z07);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(z3Var.d1());
                if (n07 == null || (str = n07.d()) == null) {
                    str = "";
                }
                ga5Var.f456575e = str;
                java.util.HashMap hashMap = state.f527863z;
                java.lang.Long l17 = (java.lang.Long) hashMap.get(z3Var.d1());
                jz5.f0 f0Var4 = null;
                if (l17 != null) {
                    ga5Var.f456577g = l17.longValue();
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    java.lang.Long l18 = (java.lang.Long) hashMap.get(ga5Var.f456574d);
                    if (l18 != null) {
                        ga5Var.f456577g = l18.longValue();
                        f0Var4 = f0Var2;
                    }
                    if (f0Var4 == null) {
                        ga5Var.f456577g = c01.id.c();
                    }
                }
                linkedList.add(ga5Var);
                if (linkedList.size() > 1) {
                    kz5.g0.t(linkedList, new kb5.h());
                }
            }
            f0Var3.f379600a = new wi5.g0(ha5Var);
        }
        return f0Var2;
    }
}
