package js1;

/* loaded from: classes4.dex */
public final class p implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final js1.p f383029d = new js1.p();

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransferRequestTokenManager", "[transferRequest] h5Auth errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            r45.mu3 mu3Var = fVar instanceof r45.mu3 ? (r45.mu3) fVar : null;
            if (mu3Var != null) {
                js1.s sVar = js1.s.f383032a;
                ((ku5.t0) ku5.t0.f394148d).h(new js1.r(mu3Var), "TransferRequestTokenManager");
                return 0;
            }
        }
        js1.s sVar2 = js1.s.f383032a;
        ((ku5.t0) ku5.t0.f394148d).h(js1.q.f383030d, "TransferRequestTokenManager");
        return 0;
    }
}
