package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f161939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f161940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161941f;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str) {
        this.f161939d = e9Var;
        this.f161940e = qVar;
        this.f161941f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f161939d;
        int i17 = e9Var.mo32091x9a3f0ba2().E0().f387377g;
        int s17 = e9Var.mo32091x9a3f0ba2().x0().s(false);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f161940e;
        if (s17 < i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = e9Var.mo32091x9a3f0ba2().x0();
            x07.getClass();
            x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k4(x07, this.f161941f, null, null));
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s(jz5.f0.f384359a, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiOpenChatTool", "page limit exceeded: " + i17);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(new jc1.d(-1, "page limit exceeded: " + i17)))));
    }
}
