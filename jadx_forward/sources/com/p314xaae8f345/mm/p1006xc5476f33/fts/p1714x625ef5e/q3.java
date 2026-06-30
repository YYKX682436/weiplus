package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class q3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f219190n;

    /* renamed from: o, reason: collision with root package name */
    public final long f219191o;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3 r3Var, java.lang.String str, long j17) {
        this.f219190n = str;
        this.f219191o = j17;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "FTSDeleteMsgLogic.DeleteTalkerMsgByTimestamp";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218914f;
        if (oVar == null) {
            return true;
        }
        oVar.h(this.f219190n, this.f219191o);
        return true;
    }
}
