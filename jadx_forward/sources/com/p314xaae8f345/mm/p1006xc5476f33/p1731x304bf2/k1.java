package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 f220996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl0.g f220998f;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var, java.lang.String str, cl0.g gVar) {
        this.f220996d = l1Var;
        this.f220997e = str;
        this.f220998f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1.wi(this.f220996d)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            java.lang.String str = this.f220997e;
            cl0.g gVar = this.f220998f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l(str, gVar);
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.GameLiteAppStoreService", "publishGlobalEventToAll, " + str + ", " + gVar);
        }
    }
}
