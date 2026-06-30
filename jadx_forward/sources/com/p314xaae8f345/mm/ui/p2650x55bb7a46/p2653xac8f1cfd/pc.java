package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.v0.class)
/* loaded from: classes5.dex */
public class pc extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f281215e = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitaireComponent", "onChattingExitAnimStart");
        ((java.util.ArrayList) this.f281215e).clear();
    }

    public boolean m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var != null) {
            r45.ad4 ad4Var = tg3.p1.f500739a.a(f9Var).f276562g;
            if (ad4Var == null) {
                ad4Var = f9Var.L0();
            }
            if (ad4Var != null) {
                return !((java.util.ArrayList) this.f281215e).contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            }
        }
        return false;
    }
}
