package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes10.dex */
public final class i6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280743e = "ChattingPermissionComponent";

    /* renamed from: f, reason: collision with root package name */
    public yb5.d f280744f;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        this.f280744f = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f280743e, "[onChattingExitAnimStart]");
        yb5.d dVar = this.f280744f;
        if (c01.e2.G(dVar != null ? dVar.x() : null)) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).rj(".ui.chatting.ChattingBizView");
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).rj(".ui.chatting.ChattingView");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.f280744f = dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f280743e, "[onChattingResume]");
        yb5.d dVar = this.f280744f;
        if (c01.e2.G(dVar != null ? dVar.x() : null)) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b().b("com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME", ".ui.chatting.ChattingBizView", "");
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b().b("com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME", ".ui.chatting.ChattingView", "");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f280743e, "[onChattingEnterAnimStart]");
        yb5.d dVar = this.f280744f;
        if (c01.e2.G(dVar != null ? dVar.x() : null)) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).qj(".ui.chatting.ChattingBizView");
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).qj(".ui.chatting.ChattingView");
        }
    }
}
