package cq;

/* loaded from: classes.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cq.k f302736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302737d;

    public h(yz5.l lVar, yz5.l lVar2, cq.k kVar, int i17) {
        this.f302734a = lVar;
        this.f302735b = lVar2;
        this.f302736c = kVar;
        this.f302737d = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.kv0 kv0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (b17) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = fVar.f152153f.f152179f;
            int i17 = oVar.f152246d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152243a.f152217a;
            r45.by0 by0Var = fVar2 instanceof r45.by0 ? (r45.by0) fVar2 : null;
            long m75942xfb822ef2 = (by0Var == null || (kv0Var = (r45.kv0) by0Var.m75936x14adae67(1)) == null) ? 0L : kv0Var.m75942xfb822ef2(5);
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = ((r45.cy0) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                arrayList.add(h90Var.a(c19792x256d2725, 0));
            }
            cq.k kVar = this.f302736c;
            int i18 = this.f302737d;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next();
                kVar.Ni(c14994x9b99c079, i18, i17, m75942xfb822ef2);
                kVar.Ni(c14994x9b99c079, 355, i17, m75942xfb822ef2);
            }
            yz5.l lVar = this.f302734a;
            if (lVar != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderColumnFlowResp");
                lVar.mo146xb9724478((r45.cy0) fVar3);
                return f0Var;
            }
        } else {
            yz5.l lVar2 = this.f302735b;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(fVar);
                return f0Var;
            }
        }
        return null;
    }
}
