package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a f269991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f269992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 f269994e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a aVar, boolean z17, java.lang.String str) {
        this.f269994e = p0Var;
        this.f269991b = aVar;
        this.f269992c = z17;
        this.f269993d = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.AbstractC19538xebb9e287 abstractC19538xebb9e287) {
        boolean z17 = abstractC19538xebb9e287 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee;
        java.lang.String str = this.f269993d;
        boolean z18 = this.f269992c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.p0 p0Var = this.f269994e;
        if (!z17) {
            p0Var.f(z18, str, 2);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee c19541x2b0e01ee = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19541x2b0e01ee) abstractC19538xebb9e287;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335.EnumC19533xfc0809e enumC19533xfc0809e = c19541x2b0e01ee.f269893t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335.EnumC19533xfc0809e enumC19533xfc0809e2 = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2457x798ad335.EnumC19533xfc0809e.OK;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a aVar = this.f269991b;
        if (enumC19533xfc0809e == enumC19533xfc0809e2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19541x2b0e01ee.f269885i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19541x2b0e01ee.f269892s)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.h(c19541x2b0e01ee.f269885i, c19541x2b0e01ee.f269892s, true, aVar);
            return;
        }
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
            c19540x47e34072.f269866f = false;
            aVar.a(c19540x47e34072);
        }
        p0Var.f(z18, str, 1);
    }
}
