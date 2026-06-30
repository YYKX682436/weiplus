package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes7.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t0 f170476d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t0 t0Var) {
        this.f170476d = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("component:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t0 t0Var = this.f170476d;
        sf.f fVar = t0Var.f170481i;
        sb6.append(fVar != null ? fVar.m() : null);
        sb6.append(" onRenderStart id:");
        sb6.append(t0Var.f334030d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
        sf.f fVar2 = t0Var.f170481i;
        java.lang.Object m17 = fVar2 != null ? fVar2.m() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) m17 : null;
        if (n7Var != null) {
            n7Var.k4();
        }
    }
}
