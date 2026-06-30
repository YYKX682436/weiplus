package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getGameChatRedInfo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        int Ri = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ri();
        cl0.g gVar = new cl0.g();
        try {
            gVar.o("conversationTotalUnreadCount", Ri);
        } catch (cl0.f unused) {
        }
        if (Ri <= 0) {
            q5Var.a(null, gVar);
            return;
        }
        z53.i D0 = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().D0();
        if (D0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(D0.f67670x114ef53e);
            ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Bi(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.e0(this, D0, q5Var, gVar));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
