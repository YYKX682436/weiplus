package bp4;

/* loaded from: classes10.dex */
public final class h1 implements bp4.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.m1 f23186a;

    public h1(bp4.m1 m1Var) {
        this.f23186a = m1Var;
    }

    public void a() {
        bp4.m1 m1Var = this.f23186a;
        ro4.b bVar = m1Var.f23268s;
        if (bVar != null) {
            com.tencent.mm.xeffect.effect.EffectManager effectManager = so4.g.f410781f;
            kotlin.jvm.internal.o.d(effectManager);
            uq5.y yVar = bVar.f398119c;
            effectManager.n(yVar != null ? yVar.f430267a : 0L);
            com.tencent.mm.plugin.vlog.model.u0 u0Var = m1Var.f23258f;
            m1Var.f23259g.N(u0Var.f175743t.j(), u0Var.f175743t.h());
            ro4.c cVar = m1Var.f23267r;
            cVar.getClass();
            java.util.LinkedList linkedList = cVar.f398123a;
            linkedList.remove(bVar);
            int size = linkedList.size();
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ((ro4.b) obj).f398122f = size - i17;
                i17 = i18;
            }
            m1Var.f23265p.x(cVar.a());
            m1Var.f23261i.setShow(true);
        }
        m1Var.f23268s = null;
    }

    public void b() {
        bp4.m1 m1Var = this.f23186a;
        m1Var.f23259g.N(m1Var.f23258f.f175743t.j(), m1Var.f23258f.f175743t.h());
        ju3.d0.k(m1Var.f23257e, ju3.c0.W, null, 2, null);
    }
}
