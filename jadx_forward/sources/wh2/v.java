package wh2;

/* loaded from: classes2.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c f527496e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c c14232xa386119c) {
        this.f527496e = c14232xa386119c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        o45.ah mo13821x7f35c2d1;
        o45.ah mo13821x7f35c2d12;
        o45.zg mo47979x2d63726f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        r45.xw xwVar = null;
        if (!(scene instanceof ke2.x0)) {
            return null;
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c c14232xa386119c = this.f527496e;
        java.lang.String str2 = c14232xa386119c.f193227d;
        java.lang.String f17 = xy2.c.f(c14232xa386119c.m56354xfe9224be());
        ke2.x0 x0Var = (ke2.x0) scene;
        java.util.List M = x0Var.M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        java.util.Iterator it = M.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
        }
        ((c61.p2) ybVar).Rj(str2, f17, arrayList);
        wh2.w wVar = new wh2.w(i17, i18, str);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = x0Var.f388531h;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        wVar.m56419xdac5ee4d(((r45.xd2) fVar).m75939xb282bd08(4) == 1);
        java.util.List M2 = x0Var.M();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : M2) {
            r45.nw1 m76794xd0557130 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj).m76794xd0557130();
            if (!(m76794xd0557130 != null && m76794xd0557130.m75939xb282bd08(31) == 6)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            so2.q2 q2Var = new so2.q2((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it6.next(), 2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.xd2) fVar2).m75936x14adae67(5);
            q2Var.a1(c19782x23db1cfa != null ? ya2.d.h(c19782x23db1cfa, null, false, 3, null) : null);
            arrayList3.add(q2Var);
        }
        wVar.m56420x2a5f836b(arrayList3);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        wVar.m56421x73095078(((r45.xd2) fVar3).m75934xbce7f2f(3));
        wVar.m56423xd4b4a5a1(x0Var.f388530g);
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = x0Var.mo47948x7f0c4558();
        java.lang.Integer valueOf = (mo47948x7f0c4558 == null || (mo47979x2d63726f = mo47948x7f0c4558.mo47979x2d63726f()) == null) ? null : java.lang.Integer.valueOf((int) mo47979x2d63726f.m150604x5fdf8057());
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c45582 = x0Var.mo47948x7f0c4558();
        java.lang.Integer valueOf2 = (mo47948x7f0c45582 == null || (mo13821x7f35c2d12 = mo47948x7f0c45582.mo13821x7f35c2d1()) == null) ? null : java.lang.Integer.valueOf((int) mo13821x7f35c2d12.m150571x5fdf8057());
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c45583 = x0Var.mo47948x7f0c4558();
        if (mo47948x7f0c45583 != null && (mo13821x7f35c2d1 = mo47948x7f0c45583.mo13821x7f35c2d1()) != null) {
            xwVar = mo13821x7f35c2d1.m150576x2b5bc573();
        }
        wVar.m56418x2876f766(new az2.g(valueOf, valueOf2, xwVar));
        return wVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p944x882e457a.m1 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c c14232xa386119c = this.f527496e;
        ke2.x0 x0Var = new ke2.x0(c14232xa386119c.f193227d, c14232xa386119c.f193228e, c14232xa386119c.m56357x44e5026c(), c14232xa386119c.m56354xfe9224be());
        x0Var.f388530g = 2;
        return x0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo56315xf5b0f48e() {
        wh2.w wVar = new wh2.w(0, 0, "");
        this.f527496e.getClass();
        wVar.m56420x2a5f836b(null);
        wVar.m56421x73095078(null);
        return wVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p944x882e457a.m1 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14232xa386119c c14232xa386119c = this.f527496e;
        ke2.x0 x0Var = new ke2.x0(c14232xa386119c.f193227d, c14232xa386119c.f193228e, null, c14232xa386119c.m56354xfe9224be());
        x0Var.f388530g = 0;
        return x0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public java.util.List e() {
        return kz5.b0.c(5870);
    }
}
