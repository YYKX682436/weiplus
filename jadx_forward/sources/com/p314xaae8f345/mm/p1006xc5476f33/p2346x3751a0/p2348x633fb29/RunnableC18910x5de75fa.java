package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* renamed from: com.tencent.mm.plugin.voip.model.i1$$b */
/* loaded from: classes14.dex */
public final /* synthetic */ class RunnableC18910x5de75fa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 f258206d;

    public /* synthetic */ RunnableC18910x5de75fa(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var) {
        this.f258206d = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var = this.f258206d;
        i1Var.getClass();
        try {
            if (i1Var.f258180b != null) {
                i1Var.f258180b.l();
                i1Var.f258180b = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipDeviceHandler", "finish stopRecord and release recorder");
            }
            i1Var.i();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipDeviceHandler", "start record error: %s", e17.getMessage());
            i1Var.f258187i = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = i1Var.f258182d;
            g1Var.f258065x.L = java.lang.Math.abs(1);
            g1Var.f258067z.u();
        }
    }
}
