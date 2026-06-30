package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class q implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f219183d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219184e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar) {
        this.f219184e = lVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class);
        if (!(d0Var.f218919n || !d0Var.f218920o)) {
            int i17 = this.f219183d + 1;
            this.f219183d = i17;
            if (i17 < 6) {
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219184e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(131093, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b1(lVar, null));
        this.f219183d = 0;
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m63545x9616526c() {
        return super.toString() + "|delayIndexTimer";
    }
}
