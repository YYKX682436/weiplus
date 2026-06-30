package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

@j95.b
/* loaded from: classes11.dex */
public final class r extends i95.w implements vg3.p3 {
    public void Ai(vg3.o3 assembler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assembler, "assembler");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateService", "removeContactRelationUpdateAssembler: ".concat(assembler.getClass().getSimpleName()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.n.f230232f;
        nVar.getClass();
        fm5.b bVar = new fm5.b(assembler, nVar);
        synchronized (nVar) {
            nVar.f345714d.remove(bVar);
        }
    }

    public void wi(vg3.o3 assembler) {
        boolean contains;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assembler, "assembler");
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.n.f230232f;
        synchronized (nVar) {
            contains = nVar.f345714d.contains(new fm5.b(assembler, nVar));
        }
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactRelationUpdateService", "addContactRelationUpdateAssembler: assembler already exists");
        } else {
            nVar.v(assembler);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactRelationUpdateService", "addContactRelationUpdateAssembler: ".concat(assembler.getClass().getSimpleName()));
        }
    }
}
