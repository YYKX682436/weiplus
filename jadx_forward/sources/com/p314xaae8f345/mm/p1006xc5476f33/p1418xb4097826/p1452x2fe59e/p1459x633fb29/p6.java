package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class p6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13904x3aa205d f189788e;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13904x3aa205d c13904x3aa205d) {
        this.f189788e = c13904x3aa205d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (!(scene instanceof ke2.x0)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.q6 q6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.q6(i17, i18, str);
        ke2.x0 x0Var = (ke2.x0) scene;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = x0Var.f388531h.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        q6Var.m56419xdac5ee4d(((r45.xd2) fVar).m75939xb282bd08(4) == 1);
        java.util.List M = x0Var.M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        java.util.Iterator it = M.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            oVar = x0Var.f388531h;
            if (!hasNext) {
                break;
            }
            so2.q2 q2Var = new so2.q2((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.xd2) fVar2).m75936x14adae67(5);
            q2Var.a1(c19782x23db1cfa != null ? ya2.d.h(c19782x23db1cfa, null, false, 3, null) : null);
            arrayList.add(q2Var);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (((so2.q2) next).o2() == 4) {
                arrayList2.add(next);
            }
        }
        q6Var.m56420x2a5f836b(arrayList2);
        int pullType = q6Var.getPullType();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13904x3aa205d c13904x3aa205d = this.f189788e;
        if (pullType == 0) {
            c13904x3aa205d.f189126g.clear();
        }
        c13904x3aa205d.f189126g.addAll(arrayList);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        q6Var.m56421x73095078(((r45.xd2) fVar3).m75934xbce7f2f(3));
        q6Var.m56423xd4b4a5a1(x0Var.f388530g);
        return q6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p944x882e457a.m1 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13904x3aa205d c13904x3aa205d = this.f189788e;
        ke2.x0 x0Var = new ke2.x0(c13904x3aa205d.f189123d, c13904x3aa205d.f189124e, c13904x3aa205d.m56357x44e5026c(), c13904x3aa205d.m56354xfe9224be());
        x0Var.f388530g = 2;
        return x0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo56315xf5b0f48e() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.q6 q6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.q6(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13904x3aa205d c13904x3aa205d = this.f189788e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13904x3aa205d.m56353x743e55cc();
        if (m56353x743e55cc == null || (arrayList3 = m56353x743e55cc.f189833a) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList3) {
                so2.j5 j5Var = (so2.j5) obj;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                if ((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || feedObject.getMediaType() != 4) ? false : true) {
                    arrayList.add(obj);
                }
            }
        }
        q6Var.m56420x2a5f836b(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13904x3aa205d.m56353x743e55cc();
        q6Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc3 = c13904x3aa205d.m56353x743e55cc();
        if (m56353x743e55cc3 != null && (arrayList2 = m56353x743e55cc3.f189833a) != null) {
            c13904x3aa205d.f189126g.addAll(arrayList2);
        }
        return q6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p944x882e457a.m1 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13904x3aa205d c13904x3aa205d = this.f189788e;
        ke2.x0 x0Var = new ke2.x0(c13904x3aa205d.f189123d, c13904x3aa205d.f189124e, null, c13904x3aa205d.m56354xfe9224be());
        x0Var.f388530g = 0;
        return x0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public java.util.List e() {
        return kz5.b0.c(5870);
    }
}
