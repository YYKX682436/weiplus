package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class zw implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f192838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 f192839b;

    public zw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158) {
        this.f192838a = pzVar;
        this.f192839b = c13917xbf9dc158;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        android.os.Bundle bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f192838a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = pzVar.f190289h;
        boolean z17 = false;
        if (abstractC15124x7bae6180 != null && (bundle = abstractC15124x7bae6180.f210801s) != null && bundle.getInt("RequestScene", -1) == 1) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = this.f192839b;
        if (!z17) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yw(pzVar, c13917xbf9dc158, i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13917xbf9dc158.getF204960d(), "IInitDone come from hot card.");
        dw2.c0 c0Var = pzVar.F.f305236n;
        if (c0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae61802 = pzVar.f190289h;
            sb6.append(abstractC15124x7bae61802 != null ? abstractC15124x7bae61802.getClass().getSimpleName() : null);
            sb6.append("#onAttach");
            dw2.c0.h(c0Var, sb6.toString(), false, false, 4, null);
        }
    }
}
