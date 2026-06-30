package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes4.dex */
public final class i30 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j30 f188520d;

    public i30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j30 j30Var) {
        this.f188520d = j30Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j30 j30Var = this.f188520d;
        if (j30Var.f188613c) {
            j30Var.f188614d = null;
            j30Var.f188613c = false;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h7) j30Var.f188611a).b(1, -1, null, j30Var.f188612b, null);
        }
        return false;
    }
}
