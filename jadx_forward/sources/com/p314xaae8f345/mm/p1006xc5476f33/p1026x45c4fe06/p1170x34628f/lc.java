package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class lc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc f168394e;

    public lc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar2) {
        this.f168393d = mcVar;
        this.f168394e = mcVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mc mcVar = this.f168393d;
        if (!mcVar.f168418a.mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mcVar.f168420c, "runOnUiThread in ui-thread PageView destroyed");
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 p8Var = this.f168394e.f168419b;
        p8Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - p8Var.H;
        if (currentTimeMillis < 1000) {
            p8Var.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.p8$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8.this.a();
                }
            }, java.lang.Math.max(0L, 1000 - currentTimeMillis));
        } else {
            p8Var.a();
        }
    }
}
