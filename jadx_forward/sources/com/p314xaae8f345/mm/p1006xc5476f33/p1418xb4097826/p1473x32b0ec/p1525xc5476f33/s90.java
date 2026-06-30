package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class s90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f195765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f195766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f195767f;

    public s90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, java.lang.Object obj, long j17) {
        this.f195765d = ea0Var;
        this.f195766e = obj;
        this.f195767f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f195765d;
        if (!ea0Var.a1()) {
            java.lang.Object obj = this.f195766e;
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            ea0Var.B1(bool != null ? bool.booleanValue() : false, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ea0Var.f193923t, "onShoppingBubbleClickImpl delayMs:" + this.f195767f + ",isFinished!");
        }
    }
}
