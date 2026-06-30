package bp4;

/* loaded from: classes10.dex */
public final class h1 implements bp4.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.m1 f104719a;

    public h1(bp4.m1 m1Var) {
        this.f104719a = m1Var;
    }

    public void a() {
        bp4.m1 m1Var = this.f104719a;
        ro4.b bVar = m1Var.f104801s;
        if (bVar != null) {
            com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = so4.g.f492314f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22979xbb268bc);
            uq5.y yVar = bVar.f479652c;
            c22979xbb268bc.n(yVar != null ? yVar.f511800a : 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = m1Var.f104791f;
            m1Var.f104792g.N(u0Var.f257276t.j(), u0Var.f257276t.h());
            ro4.c cVar = m1Var.f104800r;
            cVar.getClass();
            java.util.LinkedList linkedList = cVar.f479656a;
            linkedList.remove(bVar);
            int size = linkedList.size();
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ((ro4.b) obj).f479655f = size - i17;
                i17 = i18;
            }
            m1Var.f104798p.x(cVar.a());
            m1Var.f104794i.m68236x76500a7f(true);
        }
        m1Var.f104801s = null;
    }

    public void b() {
        bp4.m1 m1Var = this.f104719a;
        m1Var.f104792g.N(m1Var.f104791f.f257276t.j(), m1Var.f104791f.f257276t.h());
        ju3.d0.k(m1Var.f104790e, ju3.c0.W, null, 2, null);
    }
}
