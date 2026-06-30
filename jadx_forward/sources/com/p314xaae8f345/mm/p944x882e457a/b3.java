package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class b3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.c3 f152126d;

    public b3(com.p314xaae8f345.mm.p944x882e457a.c3 c3Var) {
        this.f152126d = c3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p944x882e457a.c3 c3Var = this.f152126d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c3Var.f152130e.m48006xc9602be3());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c3Var.f152130e.hashCode());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c3Var.f152135m.f152246d);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RunCgi", "Warning: Never should go here. usr canceled:%b Or NetsceneQueue Not call onGYNetEnd! %d func:%d time:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c3Var.f152131f));
        if (c3Var.f152130e.m48006xc9602be3() || c3Var.f152132g == 1) {
            return false;
        }
        c3Var.f152132g = 2;
        com.p314xaae8f345.mm.p944x882e457a.z2.a(c3Var.f152136n, c3Var.f152137o, 3, -1, "", c3Var.f152135m, c3Var.f152130e);
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m47946x9616526c() {
        return super.toString() + "|protectNotCallback";
    }
}
