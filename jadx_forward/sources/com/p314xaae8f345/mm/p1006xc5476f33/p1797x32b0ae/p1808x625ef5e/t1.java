package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class t1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754 f225596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225597f;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754 c16221xf9b96754) {
        this.f225597f = g1Var;
        this.f225595d = str;
        this.f225596e = c16221xf9b96754;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225597f;
        java.lang.String str = this.f225595d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754 c16221xf9b96754 = this.f225596e;
        g1Var.P(str, c16221xf9b96754);
        if (c16221xf9b96754.f225415e >= 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.s1(this), true);
            long j17 = c16221xf9b96754.f225414d * 60 * 60 * 1000;
            b4Var.c(j17, j17);
            ((java.util.concurrent.ConcurrentHashMap) g1Var.f225492m).put(str, b4Var);
        }
        return true;
    }
}
