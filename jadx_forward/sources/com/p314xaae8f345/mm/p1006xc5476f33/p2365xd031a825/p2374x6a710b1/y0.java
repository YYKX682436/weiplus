package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes.dex */
public final class y0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f262537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f262538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f262539c;

    public y0(boolean z17, yz5.l lVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f262537a = z17;
        this.f262538b = lVar;
        this.f262539c = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        boolean z17 = this.f262537a;
        boolean z18 = !z17;
        long i17 = c01.z1.i();
        long j17 = z18 ? i17 & (-2199023255553L) : i17 | 2199023255552L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletHelper", "setExtStatus2FlagFromUserInfo enable:" + z18);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 101;
        p53Var.f464295e = z18 ? 2 : 1;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        this.f262538b.mo146xb9724478(java.lang.Boolean.valueOf(!z17));
        this.f262539c.B();
    }
}
