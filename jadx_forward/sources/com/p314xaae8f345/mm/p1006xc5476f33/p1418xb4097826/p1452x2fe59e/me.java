package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class me implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.q f188904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f188905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f188906d;

    public me(java.lang.String str, ot0.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar, boolean z17) {
        this.f188903a = str;
        this.f188904b = qVar;
        this.f188905c = afVar;
        this.f188906d = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f188903a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            ((dk5.s5) tg3.t1.a()).Ai(str2, null, ot0.q.u(this.f188904b, null, null), null);
            g45.b.f350379a.a(str2, str, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f188905c;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c("已发送", null, afVar.m158354x19263085(), null, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pe.a(afVar, str2, this.f188906d);
        }
    }
}
