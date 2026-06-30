package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public final class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c f264346a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AISummarySearchLogic", "requestAiSearchConfig errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f152244b.f152233a) != null && (fVar instanceof r45.n0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AISummarySearchConfigResponse");
            r45.n0 n0Var = (r45.n0) fVar;
            if (n0Var.f462499d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AISummarySearchLogic", "json is null");
                return;
            }
            try {
                cl0.g gVar = new cl0.g(n0Var.f462499d);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h.f264435b = gVar;
                java.lang.String.valueOf(gVar);
                cl0.g gVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h.f264435b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
                cl0.g b17 = gVar2.b("aiSearchConfig");
                if (b17 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h.f264438e = b17.mo15082x48bce8a4("placeholder");
                }
                cl0.g gVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h.f264435b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar3);
                int optInt = gVar3.optInt("configType");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a[] aVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a.f264288d;
                if (optInt == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h.f264437d = n0Var.f462500e;
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a[] aVarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a.f264288d;
                if (optInt == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h.f264436c = n0Var.f462500e;
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AISummarySearchLogic", "requestAiSearchConfig config = " + optInt + " is invalid");
            } catch (cl0.f unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AISummarySearchLogic", "requestAiSearchConfig parse aiSearchConfigData fail");
            }
        }
    }
}
