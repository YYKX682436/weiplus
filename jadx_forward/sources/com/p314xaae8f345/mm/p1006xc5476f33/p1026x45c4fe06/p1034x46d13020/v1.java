package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes7.dex */
public final class v1 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6, l75.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.s0 f158128d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x1.f158177a;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f158129e = "MicroMsg.AppBrandLocalUsageStorageNewImpl";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List Ca(int i17, int i18) {
        if (i17 > 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f3.L0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().b1(null, i17, 0, i18));
        }
        java.util.List emptyList = java.util.Collections.emptyList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emptyList, "emptyList(...)");
        return emptyList;
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        add(q0Var, android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    /* renamed from: getCount */
    public int mo49730x7444f759() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().y0();
    }

    @Override // l75.l0
    /* renamed from: remove */
    public void mo49775xc84af884(l75.q0 q0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().mo49775xc84af884(q0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().mo49775xc84af884(q0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List t0(int i17) {
        if (i17 > 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f3.L0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().b1(null, i17, 0, Integer.MAX_VALUE));
        }
        java.util.List emptyList = java.util.Collections.emptyList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emptyList, "emptyList(...)");
        return emptyList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public boolean x0(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6.a(str, null, i17, null);
        boolean z17 = true;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().W0(str, i17, 1)) {
            try {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().D0(str, i17)) {
                    z17 = false;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f158129e, e17, "removeUsage", new java.lang.Object[0]);
                return false;
            }
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List ze(long j17, int i17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().f157968f.a(j17, i17);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().add(q0Var, looper);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().add(q0Var, looper);
    }
}
