package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public final class d0 implements m3.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Queue f169469a = new java.util.concurrent.ConcurrentLinkedQueue();

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.z zVar) {
    }

    @Override // m3.e
    public java.lang.Object a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.c0) ((java.util.concurrent.ConcurrentLinkedQueue) this.f169469a).poll();
        return c0Var == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.c0(null) : c0Var;
    }

    @Override // m3.e
    public boolean b(java.lang.Object obj) {
        return ((java.util.concurrent.ConcurrentLinkedQueue) this.f169469a).offer((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.c0) obj);
    }
}
