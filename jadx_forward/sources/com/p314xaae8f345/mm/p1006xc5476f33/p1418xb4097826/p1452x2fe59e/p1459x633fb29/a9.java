package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class a9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f189235d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f189236e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public fp0.t f189237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba f189238g;

    public a9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba) {
        this.f189238g = c13918xdafe8cba;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: alive */
    public void mo56311x58998cd() {
        super.mo56311x58998cd();
        this.f189238g.f189211q = false;
        fp0.t tVar = new fp0.t("FinderTopicFeedSingleTaskExecutor");
        tVar.e();
        this.f189237f = tVar;
        gm0.j1.d().a(817, this);
    }

    public final void b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.List m56409x97891cf7;
        so2.j5 j5Var;
        if (m1Var instanceof db2.t5) {
            boolean remove = this.f189236e.remove(m1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "isRemoved :" + remove);
            if (remove) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba = this.f189238g;
                int i19 = c13918xdafe8cba.f189201d;
                if (i19 == 7 || i19 == 12) {
                    db2.t5 t5Var = (db2.t5) m1Var;
                    if (t5Var.Q() == 7 && t5Var.R() != c13918xdafe8cba.f189215u) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "activity request ignore not my tab innerTabType:" + c13918xdafe8cba.f189215u + "  tabType: " + t5Var.R());
                        return;
                    }
                    if (t5Var.Q() == 12) {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = t5Var.f309711g.f152243a.f152217a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
                        if (((r45.na1) fVar).m75942xfb822ef2(13) != c13918xdafe8cba.f189213s) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "activity request ignore not my tab innerTabType:" + c13918xdafe8cba.f189215u + " eventTopicId:" + c13918xdafe8cba.f189213s + " tabType: " + t5Var.R());
                            return;
                        }
                    }
                    if (t5Var.Q() != 7 && t5Var.Q() != 12) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "other type request if current is activity ignore!! innerTabType:" + c13918xdafe8cba.f189215u + "  tabType: " + t5Var.R());
                        return;
                    }
                }
                db2.t5 t5Var2 = (db2.t5) m1Var;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = t5Var2.f309711g.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9 f9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9(i17, i18, (r45.r03) ((r45.oa1) fVar2).m75936x14adae67(5), str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "handleScene errType:" + i17 + " errCode:" + i18);
                if (i17 == 0 && i18 == 0) {
                    com.p314xaae8f345.mm.p944x882e457a.o oVar = t5Var2.f309711g;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    f9Var.m56421x73095078(((r45.oa1) fVar3).m75934xbce7f2f(2));
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = oVar.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    f9Var.f189395b = ((r45.oa1) fVar4).m75942xfb822ef2(4);
                    java.util.LinkedList P = t5Var2.P();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(P, 10));
                    java.util.Iterator it = P.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 64);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.I.put(java.lang.Long.valueOf(a17.m59251x5db1b11()), a17);
                        arrayList.add(cu2.u.f303974a.p(a17));
                    }
                    f9Var.m56420x2a5f836b(arrayList);
                    java.lang.String m56464xb5886c64 = m56464xb5886c64();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleScene incrementList :");
                    java.util.List m56409x97891cf72 = f9Var.m56409x97891cf7();
                    sb6.append(m56409x97891cf72 != null ? m56409x97891cf72.size() : 0);
                    sb6.append(", pullType: ");
                    sb6.append(t5Var2.f309714m);
                    sb6.append(", hasMore: ");
                    sb6.append(t5Var2.O() != 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
                    if (t5Var2.f309716o == 4) {
                        java.util.List m56409x97891cf73 = f9Var.m56409x97891cf7();
                        if ((m56409x97891cf73 != null ? m56409x97891cf73.size() : 0) > 0 && (m56409x97891cf7 = f9Var.m56409x97891cf7()) != null && (j5Var = (so2.j5) m56409x97891cf7.get(0)) != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                            java.lang.String u17 = pm0.v.u(abstractC14490x69736cb5.getFeedObject().f66939xc8a07680);
                            r45.o03 N = t5Var2.N();
                            java.lang.Object m75945x2fec8307 = N != null ? N.m75945x2fec8307(3) : null;
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = 0;
                            }
                            abstractC14490x69736cb5.E1(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u17, m75945x2fec8307));
                        }
                    }
                    f9Var.m56423xd4b4a5a1(t5Var2.f309714m);
                    f9Var.m56419xdac5ee4d(t5Var2.O() != 0);
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar5 = oVar.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    f9Var.f189396c = (r45.xn5) ((r45.oa1) fVar5).m75936x14adae67(7);
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar6 = oVar.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    r45.ea5 ea5Var = (r45.ea5) ((r45.oa1) fVar6).m75936x14adae67(8);
                    f9Var.f189397d = ea5Var != null ? ea5Var.m75945x2fec8307(0) : null;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar7 = oVar.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar7, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    r45.r03 r03Var = (r45.r03) ((r45.oa1) fVar7).m75936x14adae67(5);
                    f9Var.f189399f = r03Var != null ? (r45.zi2) r03Var.m75936x14adae67(10) : null;
                    f9Var.m56417xa7473ad4(t5Var2.N());
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar8 = oVar.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar8, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    r45.r03 r03Var2 = (r45.r03) ((r45.oa1) fVar8).m75936x14adae67(5);
                    f9Var.f189400g = r03Var2 != null ? r03Var2.m75939xb282bd08(13) : 0;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar9 = oVar.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar9, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
                    r45.r03 r03Var3 = (r45.r03) ((r45.oa1) fVar9).m75936x14adae67(5);
                    f9Var.f189401h = r03Var3 != null ? r03Var3.m75939xb282bd08(15) : 0;
                    m56464xb5886c64();
                    f9Var.f189398e = t5Var2.f309715n;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var = this.f189235d;
                if (n0Var != null) {
                    n0Var.mo55587xb461ee3d(f9Var);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        super.mo56312x2efc64();
        fp0.t tVar = this.f189237f;
        if (tVar != null) {
            tVar.mo129985x6761d4f();
        }
        this.f189237f = null;
        gm0.j1.d().q(817, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        fp0.t tVar = this.f189237f;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z8(obj, this, callback), null, 2, null));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba = this.f189238g;
        jz5.f0 f0Var = null;
        if (c13918xdafe8cba.f189217w) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13918xdafe8cba.m56353x743e55cc();
            if (m56353x743e55cc != null) {
                java.lang.String m56464xb5886c64 = m56464xb5886c64();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("topic fetchInit size:");
                java.util.ArrayList arrayList = m56353x743e55cc.f189833a;
                sb6.append(arrayList.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9 f9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9(0, 0, null, "");
                f9Var.m56420x2a5f836b(arrayList);
                f9Var.m56423xd4b4a5a1(1000);
                f9Var.m56421x73095078(m56353x743e55cc.f189834b);
                callback.mo55587xb461ee3d(f9Var);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                callback.mo55587xb461ee3d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.b0());
                return;
            }
            return;
        }
        ey2.n2 N6 = c13918xdafe8cba.f189219y.N6(ey2.p2.f339000g.a(c13918xdafe8cba.f189213s, c13918xdafe8cba.f189214t, c13918xdafe8cba.f189202e, c13918xdafe8cba.f189204g, c13918xdafe8cba.f189215u), false);
        java.lang.String m56464xb5886c642 = m56464xb5886c64();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fetchInit] topic:");
        r45.r03 r03Var = N6.f338972c;
        sb7.append(r03Var != null ? r03Var.m75945x2fec8307(0) : null);
        sb7.append(" size:");
        sb7.append(N6.f338971b.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c642, sb7.toString());
        if (N6.f338972c == null || !(!N6.f338971b.isEmpty())) {
            callback.mo55587xb461ee3d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.b0());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9 f9Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9(0, 0, N6.f338972c, "");
        f9Var2.m56420x2a5f836b(N6.f338971b);
        f9Var2.m56423xd4b4a5a1(1000);
        callback.mo55587xb461ee3d(f9Var2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(" activeTabType:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba = this.f189238g;
        sb6.append(c13918xdafe8cba.f189216v);
        sb6.append(" innerTabType:");
        sb6.append(c13918xdafe8cba.f189215u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        int i19 = c13918xdafe8cba.f189201d;
        if (i19 != 7 && i19 != 12) {
            if (m1Var != null) {
                b(i17, i18, str, m1Var);
            }
        } else {
            int i27 = c13918xdafe8cba.f189216v;
            if ((i27 == -1 || i27 == c13918xdafe8cba.f189215u) && m1Var != null) {
                b(i17, i18, str, m1Var);
            }
        }
    }
}
