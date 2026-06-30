package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class po implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286815e;

    public po(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f286814d = dVar;
        this.f286815e = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        sb5.k2 k2Var = (sb5.k2) this.f286814d.f542241c.a(sb5.k2.class);
        if (k2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemVoice", "ui or ui.transformImp null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286815e;
        if (f9Var.a2()) {
            i17 = 2;
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm xmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) k2Var;
            i17 = xmVar.q0(f9Var.m124847x74d37ac6()) ? 3 : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xmVar.s0(f9Var.m124847x74d37ac6(), ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var))) ? 5 : 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "TransformText report clickScene: %d, msgId: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a c5405x3c27d29a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a();
        am.b9 b9Var = c5405x3c27d29a.f135752g;
        b9Var.f87758b = 1;
        b9Var.f87759c = i17;
        b9Var.f87757a = f9Var.z0();
        c5405x3c27d29a.e();
    }
}
