package cq;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cq.k f302770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f302771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yz5.l lVar, yz5.l lVar2, cq.k kVar, r45.qt2 qt2Var) {
        super(1);
        this.f302768d = lVar;
        this.f302769e = lVar2;
        this.f302770f = kVar;
        this.f302771g = qt2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914;
        r45.kv0 kv0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r45.cu0 cu0Var = fVar != null ? (r45.cu0) fVar.f152151d : null;
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17 || cu0Var == null) {
            yz5.l lVar = this.f302769e;
            if (lVar == null) {
                return null;
            }
            lVar.mo146xb9724478(fVar);
        } else {
            com.p314xaae8f345.mm.p944x882e457a.i iVar = fVar.f152153f;
            int i17 = (iVar == null || (oVar2 = iVar.f152179f) == null) ? 0 : oVar2.f152246d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = (iVar == null || (oVar = iVar.f152179f) == null) ? null : oVar.f152243a.f152217a;
            r45.qr2 qr2Var = fVar2 instanceof r45.qr2 ? (r45.qr2) fVar2 : null;
            long m75942xfb822ef2 = (qr2Var == null || (kv0Var = (r45.kv0) qr2Var.m75936x14adae67(1)) == null) ? 0L : kv0Var.m75942xfb822ef2(5);
            r45.cu0 cu0Var2 = (r45.cu0) fVar.f152151d;
            if (cu0Var2 != null && (m75941xfb821914 = cu0Var2.m75941xfb821914(1)) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                    arrayList.add(h90Var.a(c19792x256d2725, 0));
                }
                this.f302770f.Ui(arrayList, this.f302771g.m75939xb282bd08(5), i17, m75942xfb822ef2);
            }
            yz5.l lVar2 = this.f302768d;
            if (lVar2 == null) {
                return null;
            }
            lVar2.mo146xb9724478(cu0Var);
        }
        return f0Var;
    }
}
