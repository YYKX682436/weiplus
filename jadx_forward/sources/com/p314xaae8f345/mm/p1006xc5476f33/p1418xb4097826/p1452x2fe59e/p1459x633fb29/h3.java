package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class h3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670 f189445e;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670 c13868x9104670) {
        this.f189445e = c13868x9104670;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "onSceneEnd: errType " + i17 + ", errCode " + i18 + " errMsg " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i3 i3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i3(i17, i18, str);
        if ((scene instanceof ek2.m3) && i17 == 0 && i18 == 0) {
            i3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i3(i17, i18, str);
            ek2.m3 m3Var = (ek2.m3) scene;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = m3Var.f335038g;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetPrizeHistoryResponse");
            i3Var.m56421x73095078(((r45.hu1) fVar).m75934xbce7f2f(3));
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetPrizeHistoryResponse");
            i3Var.m56419xdac5ee4d(((r45.hu1) fVar2).m75939xb282bd08(4) == 1);
            if (this.f189445e.f189015i == 2) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetPrizeHistoryResponse");
                java.util.LinkedList<r45.xc5> m75941xfb821914 = ((r45.hu1) fVar3).m75941xfb821914(1);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
                for (r45.xc5 xc5Var : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xc5Var);
                    linkedList.add(new so2.y2(xc5Var));
                }
                i3Var.m56420x2a5f836b(linkedList);
            } else {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = oVar.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetPrizeHistoryResponse");
                java.util.LinkedList<r45.q94> m75941xfb8219142 = ((r45.hu1) fVar4).m75941xfb821914(2);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb8219142);
                for (r45.q94 q94Var : m75941xfb8219142) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q94Var);
                    linkedList2.add(new so2.z2(q94Var));
                    java.util.LinkedList<r45.xc5> m75941xfb8219143 = q94Var.m75941xfb821914(1);
                    if (m75941xfb8219143 != null) {
                        for (r45.xc5 xc5Var2 : m75941xfb8219143) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xc5Var2);
                            linkedList2.add(new so2.y2(xc5Var2));
                        }
                    }
                }
                i3Var.m56420x2a5f836b(linkedList2);
            }
            i3Var.m56423xd4b4a5a1(m3Var.f335040i);
        }
        return i3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p944x882e457a.m1 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670 c13868x9104670 = this.f189445e;
        ek2.m3 m3Var = new ek2.m3(c13868x9104670.f189010d, c13868x9104670.f189011e, c13868x9104670.f189012f, c13868x9104670.f189013g, c13868x9104670.m56357x44e5026c());
        m3Var.f335040i = 2;
        return m3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p944x882e457a.m1 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13868x9104670 c13868x9104670 = this.f189445e;
        ek2.m3 m3Var = new ek2.m3(c13868x9104670.f189010d, c13868x9104670.f189011e, c13868x9104670.f189012f, c13868x9104670.f189013g, c13868x9104670.m56357x44e5026c());
        m3Var.f335040i = 0;
        return m3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public java.util.List e() {
        return kz5.b0.c(22440);
    }
}
