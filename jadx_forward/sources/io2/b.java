package io2;

/* loaded from: classes2.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 f374998d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5) {
        this.f374998d = c14459x792f41a5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchInit initCount ");
        io2.c cVar = new io2.c(0, 0, "");
        java.util.List<so2.j5> i17 = bu2.d0.i(bu2.e0.f106031a, 30, null, 2, null);
        for (so2.j5 j5Var : i17) {
            if (j5Var instanceof so2.j3) {
                so2.j3 j3Var = (so2.j3) j5Var;
                if (j3Var.a()) {
                    this.f374998d.f202692e = true;
                }
                j3Var.f491974d.f472571h = null;
            }
        }
        cVar.m56420x2a5f836b(i17);
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5;
        io2.c cVar = new io2.c(i17, i18, str);
        if (fVar instanceof r45.j81) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.j81 j81Var = (r45.j81) fVar;
            java.util.LinkedList member_cards = j81Var.f459168d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(member_cards, "member_cards");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(member_cards, 10));
            java.util.Iterator it = member_cards.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c14459x792f41a5 = this.f374998d;
                if (!hasNext) {
                    break;
                }
                r45.yf2 yf2Var = (r45.yf2) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yf2Var);
                so2.j3 j3Var = new so2.j3(yf2Var);
                if (j3Var.a()) {
                    c14459x792f41a5.f202692e = true;
                }
                arrayList.add(j3Var);
            }
            linkedList.addAll(arrayList);
            cVar.m56420x2a5f836b(linkedList);
            ho2.f fVar2 = iVar instanceof ho2.f ? (ho2.f) iVar : null;
            if (!(fVar2 != null && fVar2.f364401t == 2)) {
                pm0.v.K(null, new io2.a(linkedList, this, c14459x792f41a5));
            }
            cVar.m56421x73095078(j81Var.f459169e);
            cVar.m56419xdac5ee4d(j81Var.f459170f == 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.member.cgi.FinderGetMemberCardListCgi");
            cVar.m56423xd4b4a5a1(((ho2.f) iVar).f364401t);
        }
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5 = this.f374998d;
        ho2.f fVar = new ho2.f(c14459x792f41a5.m56354xfe9224be(), c14459x792f41a5.m56357x44e5026c(), xy2.c.f(c14459x792f41a5.m56354xfe9224be()), 0, 8, null);
        fVar.f364401t = 2;
        return fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5 = this.f374998d;
        ho2.f fVar = new ho2.f(c14459x792f41a5.m56354xfe9224be(), c14459x792f41a5.m56357x44e5026c(), xy2.c.f(c14459x792f41a5.m56354xfe9224be()), 0, 8, null);
        fVar.f364401t = 0;
        return fVar;
    }
}
