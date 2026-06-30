package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes14.dex */
public class v0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 f258545d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 t0Var) {
        this.f258545d = t0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipVoiceMiniManager", "click small view and time is up we remove it..");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 t0Var = this.f258545d;
        t0Var.a(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = t0Var.f258522c;
        if (b4Var == null) {
            return true;
        }
        b4Var.d();
        return true;
    }
}
