package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class p1 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation f222837d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation) {
        this.f222837d = iPCInvoke_readGameLifeConversation;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (w0Var.f398509d instanceof z53.i) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = this.f222837d;
            if (currentTimeMillis - iPCInvoke_readGameLifeConversation.f222741e < 1000) {
                return;
            }
            iPCInvoke_readGameLifeConversation.f222741e = currentTimeMillis;
            if (iPCInvoke_readGameLifeConversation.f222740d != null) {
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.o1(this), "MicroMsg.GameWebTabUI");
            }
        }
    }
}
