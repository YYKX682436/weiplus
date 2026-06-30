package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 f202807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f202808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var, r45.qt2 qt2Var) {
        super(1);
        this.f202807d = c0Var;
        this.f202808e = qt2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> linkedList;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> linkedList2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var = this.f202807d;
        if (fVar != null && fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.h07 h07Var = ((r45.tr0) fVar.f152151d).f468261i;
            r45.qt2 qt2Var = this.f202808e;
            if (h07Var != null && (linkedList2 = h07Var.f457264e) != null) {
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : linkedList2) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(c19792x256d2725, qt2Var.m75939xb282bd08(5), null);
                }
            }
            r45.h07 h07Var2 = ((r45.tr0) fVar.f152151d).f468261i;
            if (h07Var2 != null && (linkedList = h07Var2.f457266g) != null) {
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 : linkedList) {
                    i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27252);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).rk(c19792x256d27252, qt2Var.m75939xb282bd08(5), null);
                }
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            c0Var.f337113d = fVar2;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c0Var.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
            java.util.HashSet<com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9> mo80395x5316d740 = abstractActivityC15087xee12defa != null ? abstractActivityC15087xee12defa.mo80395x5316d740() : null;
            if (mo80395x5316d740 != null) {
                for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : mo80395x5316d740) {
                    eo2.j jVar = abstractC22275x3ce1d8c9 instanceof eo2.j ? (eo2.j) abstractC22275x3ce1d8c9 : null;
                    if (jVar != null) {
                        jVar.R6(fVar2);
                    }
                }
            }
            eo2.f.f337098a.f(c0Var.U, fVar);
        } else {
            int i17 = fVar != null ? fVar.f152149b : 0;
            java.lang.String str = fVar != null ? fVar.f152150c : null;
            if (str == null) {
                str = "";
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = c0Var.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa2 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x192630852 : null;
            java.util.HashSet<com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9> mo80395x5316d7402 = abstractActivityC15087xee12defa2 != null ? abstractActivityC15087xee12defa2.mo80395x5316d740() : null;
            if (mo80395x5316d7402 != null) {
                for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c92 : mo80395x5316d7402) {
                    eo2.j jVar2 = abstractC22275x3ce1d8c92 instanceof eo2.j ? (eo2.j) abstractC22275x3ce1d8c92 : null;
                    if (jVar2 != null) {
                        jVar2.Q6(i17, str);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
