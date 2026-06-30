package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r f264116d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r rVar) {
        this.f264116d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r rVar = this.f264116d;
        if (!rVar.f264141h || rVar.f264139f) {
            return;
        }
        int mo120162x95a6d12e = rVar.f264137d.mo120162x95a6d12e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r rVar2 = this.f264116d;
        if (rVar2.f264143m != mo120162x95a6d12e) {
            rVar2.f264143m = mo120162x95a6d12e;
            rVar2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.n(this));
            ((ku5.t0) ku5.t0.f394148d).k(this.f264116d.f264142i, 100L);
        }
    }
}
