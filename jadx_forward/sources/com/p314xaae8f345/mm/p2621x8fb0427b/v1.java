package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class v1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f277803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.b2 f277804b;

    public v1(com.p314xaae8f345.mm.p2621x8fb0427b.b2 b2Var, long j17) {
        this.f277804b = b2Var;
        this.f277803a = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2621x8fb0427b.b2 b2Var = this.f277804b;
        long j17 = this.f277803a;
        if (b2Var.i1(j17) <= 0) {
            return null;
        }
        b2Var.f275296d.A("BizTimeLineInfo", "update BizTimeLineInfo set hasShow = 1 where orderFlag >= " + (j17 & (-4294967296L)) + " and hasShow < 1 ");
        java.lang.System.currentTimeMillis();
        return null;
    }
}
