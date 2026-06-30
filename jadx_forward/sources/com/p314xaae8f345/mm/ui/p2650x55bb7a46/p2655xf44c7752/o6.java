package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class o6 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f282771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282773d;

    public o6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.util.ArrayList arrayList) {
        this.f282773d = viewOnClickListenerC21748xb3d38e6b;
        this.f282770a = f9Var;
        this.f282771b = i17;
        this.f282772c = arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1
    /* renamed from: onShow */
    public void mo14645xc39f557c() {
        if (this.f282770a.m78014x7b98c171() || this.f282770a.J2()) {
            h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282773d;
            ((g90.s) vVar).aj(viewOnClickListenerC21748xb3d38e6b, this.f282770a, viewOnClickListenerC21748xb3d38e6b.T3, 1, this.f282771b, this.f282772c);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = this.f282773d;
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
        viewOnClickListenerC21748xb3d38e6b2.C8(true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b3 = this.f282773d;
        oc5.g0 g0Var = viewOnClickListenerC21748xb3d38e6b3.f282202w2;
        if (g0Var != null) {
            long j17 = viewOnClickListenerC21748xb3d38e6b3.f282187r2;
            java.lang.Long l17 = g0Var.f425958i;
            if (l17 != null && l17.longValue() == j17) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageScanCodeManager", "onBottomSheetShowStart id: " + j17);
            java.lang.System.currentTimeMillis();
            g0Var.f425958i = java.lang.Long.valueOf(j17);
            ku5.u0 u0Var = ku5.t0.f394148d;
            oc5.a0 a0Var = new oc5.a0(g0Var, j17);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(a0Var, 200L, false);
        }
    }
}
