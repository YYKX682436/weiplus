package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c
/* loaded from: classes4.dex */
public final class a9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280146e = "MicroMsg.ChattingVoipComponent";

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        java.lang.String x17 = this.f280113d.x();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f280146e, "onChattingExitAnimEnd, talker:".concat(x17));
        if (x17.length() == 0) {
            return;
        }
        pm0.v.K(null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z8(this, x17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f280146e, "onChattingPause, talker:".concat(this.f280113d.x()));
    }
}
