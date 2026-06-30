package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k0 f281138d;

    public o0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k0 k0Var) {
        this.f281138d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k0 k0Var = this.f281138d;
        yb5.d dVar = k0Var.f280113d;
        if (dVar == null || dVar.f542241c.a(sb5.z0.class) == null) {
            return;
        }
        try {
            k0Var.f280113d.S(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2.class)).Bi().q(k0Var.f280113d.x()), k0Var.f280113d.n().getStringExtra("override_session_id"));
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) k0Var.f280113d.f542241c.a(sb5.z0.class))).C();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotComponent", th6, "[-] getContact on enter yuanbao chatting failed.", new java.lang.Object[0]);
        }
    }
}
