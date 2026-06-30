package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.i0 f149220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f149221e;

    public g0(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.i0 i0Var, boolean z17) {
        this.f149220d = i0Var;
        this.f149221e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.i0 i0Var = this.f149220d;
        boolean z17 = this.f149221e;
        if (i0Var.f149230f || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "schedule task cancel " + i0Var.f149225a);
            java.lang.Class cls = i0Var.f149228d;
            if (cls != null) {
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.f0.f149217a.a(cls, true);
            }
        }
    }
}
