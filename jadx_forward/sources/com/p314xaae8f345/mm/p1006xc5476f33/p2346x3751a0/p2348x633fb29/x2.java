package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 f258448d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var) {
        this.f258448d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = this.f258448d;
        int b17 = d3Var.f257944a.A.b();
        byte[] array = java.nio.ByteBuffer.allocate(4).putInt(b17).array();
        d3Var.f257944a.f258065x.m72844xf1a2f51c(16, array, array.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipServiceEx", "audio play volume: %d", java.lang.Integer.valueOf(b17));
    }
}
