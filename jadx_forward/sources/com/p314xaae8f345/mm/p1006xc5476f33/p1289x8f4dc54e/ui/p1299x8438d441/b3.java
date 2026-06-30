package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes8.dex */
public final class b3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f175639d;

    public b3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        this.f175639d = bizTestUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = dialogInterface instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) dialogInterface : null;
        java.lang.String h17 = j0Var != null ? j0Var.h() : null;
        if (h17 == null) {
            h17 = "";
        }
        boolean N = r26.n0.N(h17);
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f175639d;
        if (!N) {
            bizTestUI.getClass();
            bizTestUI.g = h17;
            bizTestUI.e.D("HalfscreenWebViewTestUrl", bizTestUI.g);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = bizTestUI.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        if (!r26.n0.B(h17, "http", false) && !r26.n0.B(h17, "www", false)) {
            h17 = bizTestUI.g;
        }
        bizTestUI.f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1(mo55332x76847179, h17, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(0.0f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, true, true, null, false, 0, false, 0, false, false, false, 8364031, null), 4, null);
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.U6(bizTestUI);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = bizTestUI.f;
        if (m1Var != null) {
            m1Var.show();
        }
        pm0.v.V(2000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.a3(bizTestUI));
    }
}
