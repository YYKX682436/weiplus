package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes3.dex */
public final class k3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248 f189646d;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248 c13869x297bc248) {
        this.f189646d = c13869x297bc248;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "onSceneEnd: errType " + i17 + ", errCode " + i18 + " errMsg " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l3 l3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l3(i17, i18, str, null, false, null, null, 0, 248, null);
        if (!(fVar instanceof r45.ht1) || i17 != 0 || i18 != 0) {
            return l3Var;
        }
        r45.ht1 ht1Var = (r45.ht1) fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l3 l3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l3(i17, i18, str, (r45.cz1) ht1Var.m75936x14adae67(1), ht1Var.m75939xb282bd08(6) == 0, null, null, 0, 224, null);
        l3Var2.m56421x73095078(ht1Var.m75934xbce7f2f(2));
        l3Var2.m56419xdac5ee4d(ht1Var.m75939xb282bd08(3) == 1);
        r45.jz1 jz1Var = (r45.jz1) ht1Var.m75936x14adae67(4);
        java.util.LinkedList<r45.zy1> m75941xfb821914 = jz1Var != null ? jz1Var.m75941xfb821914(0) : null;
        if (m75941xfb821914 == null) {
            m75941xfb821914 = new java.util.LinkedList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.zy1 zy1Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zy1Var);
            arrayList.add(new so2.b3(zy1Var));
        }
        l3Var2.m56420x2a5f836b(arrayList);
        ek2.a1 a1Var = iVar instanceof ek2.a1 ? (ek2.a1) iVar : null;
        l3Var2.m56423xd4b4a5a1(a1Var != null ? a1Var.f334943w : 0);
        l3Var2.f189677c = ht1Var.m75945x2fec8307(7);
        l3Var2.f189678d = ht1Var.m75945x2fec8307(9);
        l3Var2.f189679e = ht1Var.m75939xb282bd08(8);
        return l3Var2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248 c13869x297bc248 = this.f189646d;
        int i17 = c13869x297bc248.f189020h;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ek2.a1 a1Var = new ek2.a1(i17, xy2.c.e(context), c13869x297bc248.f189017e, c13869x297bc248.f189018f, null, c13869x297bc248.f189019g, c13869x297bc248.f189016d, c13869x297bc248.m56357x44e5026c(), null);
        a1Var.f334943w = 2;
        return a1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13869x297bc248 c13869x297bc248 = this.f189646d;
        int i17 = c13869x297bc248.f189020h;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ek2.a1 a1Var = new ek2.a1(i17, xy2.c.e(context), c13869x297bc248.f189017e, c13869x297bc248.f189018f, null, c13869x297bc248.f189019g, c13869x297bc248.f189016d, c13869x297bc248.m56357x44e5026c(), null);
        a1Var.f334943w = 0;
        return a1Var;
    }
}
