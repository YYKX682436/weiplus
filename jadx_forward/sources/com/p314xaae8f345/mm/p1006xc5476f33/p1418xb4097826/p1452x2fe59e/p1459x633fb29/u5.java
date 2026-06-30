package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class u5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13881xc4dce0f8 f189929d;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13881xc4dce0f8 c13881xc4dce0f8) {
        this.f189929d = c13881xc4dce0f8;
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.u5 u5Var, db2.l2 l2Var, com.p314xaae8f345.mm.p944x882e457a.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var) {
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(u5Var.m56464xb5886c64(), "cgiBack is null");
            return;
        }
        u5Var.getClass();
        r45.zo2 zo2Var = (r45.zo2) fVar.f152151d;
        if (zo2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(u5Var.m56464xb5886c64(), "cgiBack?.resp is null");
            return;
        }
        boolean z17 = (fVar.f152148a == 0 && fVar.f152149b == 0 && zo2Var.m75939xb282bd08(3) == 0) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r5 r5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r5(fVar.f152148a, fVar.f152149b, fVar.f152150c);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = l2Var.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.zo2) fVar2).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 33040)));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            r45.dm2 m76806xdef68064 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) next).getFeedObject().getFeedObject().m76806xdef68064();
            if ((m76806xdef68064 != null ? (r45.jq4) m76806xdef68064.m75936x14adae67(54) : null) == null) {
                arrayList2.add(next);
            }
        }
        r5Var.m56420x2a5f836b(arrayList2);
        cu2.t tVar = cu2.u.f303974a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = l2Var.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
        java.util.LinkedList m75941xfb8219142 = ((r45.zo2) fVar3).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
        tVar.j(m75941xfb8219142, 33040, u5Var.f189929d.m56354xfe9224be());
        if (l2Var.f309589w != 2) {
            java.util.List m56409x97891cf7 = r5Var.m56409x97891cf7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m56409x97891cf7, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
            tVar.m(m56409x97891cf7, 33040, "", true);
        }
        java.lang.String m56464xb5886c64 = u5Var.m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf72 = r5Var.m56409x97891cf7();
        sb6.append(m56409x97891cf72 != null ? java.lang.Integer.valueOf(m56409x97891cf72.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        r5Var.m56423xd4b4a5a1(l2Var.f309589w);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = l2Var.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
        r5Var.m56421x73095078(((r45.zo2) fVar4).m75934xbce7f2f(2));
        r5Var.m56419xdac5ee4d(z17);
        n0Var.mo55587xb461ee3d(r5Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r5 r5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r5(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13881xc4dce0f8 c13881xc4dce0f8 = this.f189929d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13881xc4dce0f8.m56353x743e55cc();
        r5Var.m56420x2a5f836b(m56353x743e55cc != null ? m56353x743e55cc.f189833a : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13881xc4dce0f8.m56353x743e55cc();
        r5Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
        r5Var.m56423xd4b4a5a1(1000);
        callback.mo55587xb461ee3d(r5Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13881xc4dce0f8 c13881xc4dce0f8 = this.f189929d;
        r45.f96 f96Var = c13881xc4dce0f8.f189087d;
        zy2.o9 o9Var = c13881xc4dce0f8.f189088e;
        if (f96Var == null || o9Var == null) {
            return;
        }
        db2.l2 l2Var = new db2.l2(f96Var, o9Var, c13881xc4dce0f8.m56357x44e5026c(), c13881xc4dce0f8.f189089f, null, c13881xc4dce0f8.f189091h, 0, 0L, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r1.f34829x366c91de, null);
        l2Var.f309589w = 2;
        l2Var.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s5(this, l2Var, callback));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13881xc4dce0f8 c13881xc4dce0f8 = this.f189929d;
        r45.f96 f96Var = c13881xc4dce0f8.f189087d;
        zy2.o9 o9Var = c13881xc4dce0f8.f189088e;
        if (f96Var == null || o9Var == null) {
            return;
        }
        db2.l2 l2Var = new db2.l2(f96Var, o9Var, c13881xc4dce0f8.m56357x44e5026c(), c13881xc4dce0f8.f189089f, null, c13881xc4dce0f8.f189091h, 0, 0L, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r1.f34829x366c91de, null);
        l2Var.f309589w = 0;
        l2Var.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t5(this, l2Var, callback));
    }
}
