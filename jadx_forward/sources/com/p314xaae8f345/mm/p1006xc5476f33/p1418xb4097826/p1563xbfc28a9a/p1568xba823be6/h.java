package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6;

/* loaded from: classes2.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s f202859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f202860e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f202859d = sVar;
        this.f202860e = abstractC14490x69736cb5;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar = this.f202859d;
            boolean g17 = sVar.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f202860e;
            if (g17) {
                if (abstractC14490x69736cb5.getFeedObject().m59292xa80c944c() == 0) {
                    g4Var.a(4, com.p314xaae8f345.mm.R.C30867xcad56011.f8k);
                } else {
                    g4Var.a(5, com.p314xaae8f345.mm.R.C30867xcad56011.lsu);
                }
            }
            if (sVar.g() || hc2.b0.j(abstractC14490x69736cb5, sVar.f202877d)) {
                g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
            }
            if (!hc2.b0.j(abstractC14490x69736cb5, sVar.f202877d)) {
                g4Var.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571927tr);
            }
            if (!hc2.b0.j(abstractC14490x69736cb5, sVar.f202877d) && abstractC14490x69736cb5.getFeedObject().m59338xecb5e178() && sVar.g()) {
                g4Var.a(6, com.p314xaae8f345.mm.R.C30867xcad56011.mqk);
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                g4Var.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.f571897sx);
            }
        }
    }
}
