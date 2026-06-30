package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class y9 implements cl.k3 {

    /* renamed from: a, reason: collision with root package name */
    public long f173953a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f173954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 f173955c;

    public y9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 x9Var, boolean z17) {
        this.f173955c = x9Var;
        this.f173954b = z17;
    }

    public void a(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWorkerContainer", "js inject cost[%d]", java.lang.Long.valueOf(j17));
        if (this.f173954b) {
            synchronized (this.f173955c.f173920g) {
                em1.c cVar = this.f173955c.f173919f;
                cVar.f336553e = j17;
                cVar.f336554f = this.f173953a;
                java.util.Iterator it = new java.util.LinkedList(this.f173955c.f173920g).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c cVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.aa) it.next());
                    cVar2.f158554g = this.f173953a;
                    cVar2.f158555h = j17;
                }
            }
        }
    }
}
