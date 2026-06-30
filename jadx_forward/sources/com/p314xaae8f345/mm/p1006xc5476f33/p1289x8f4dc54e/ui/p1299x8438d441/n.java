package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes8.dex */
public final class n implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f175697d;

    public n(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        this.f175697d = bizTestUI;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee c19498xba974aee = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269264a;
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f175697d;
        if (!c19498xba974aee.c(bizTestUI.g)) {
            return false;
        }
        qk.j9 j9Var = (qk.j9) i95.n0.c(qk.j9.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = al5.l2.a(new android.content.MutableContextWrapper(bizTestUI.mo55332x76847179()));
        zg0.k2 k2Var = new zg0.k2(null, false, false, false, false, 0, false, 105, null);
        ((cw4.v0) j9Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.a(c19498xba974aee, bizTestUI.g, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6(), k2Var, null, null), false, 0, 0, 0, false, 124, null);
        return false;
    }
}
