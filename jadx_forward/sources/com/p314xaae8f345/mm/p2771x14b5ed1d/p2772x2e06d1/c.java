package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* loaded from: classes9.dex */
public class c extends fm5.d {
    public c(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd abstractC22733x77ee84fd, lm5.d dVar) {
        super(dVar);
    }

    @Override // fm5.d
    public void w(java.lang.Object obj, nm5.j jVar) {
        java.lang.Object a17 = jVar.a(0);
        em5.b bVar = (em5.b) ((com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.n) obj);
        bVar.getClass();
        java.lang.Class cls = (java.lang.Class) a17;
        em5.f fVar = bVar.f336749a;
        fm5.d dVar = (fm5.d) ((java.util.HashMap) fVar.f336756m).get(cls);
        if (dVar != null) {
            nm5.a b17 = nm5.j.b(fVar.f336754h.get(cls));
            synchronized (dVar) {
                dVar.v(b17);
            }
        }
    }
}
