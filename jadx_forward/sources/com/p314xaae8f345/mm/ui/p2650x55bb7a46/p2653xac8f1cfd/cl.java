package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class cl extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl f280429a;

    public cl(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl glVar) {
        this.f280429a = glVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl glVar = this.f280429a;
        yb5.d dVar = glVar.f280113d;
        if (dVar == null || !dVar.f542247i) {
            return;
        }
        if (!dVar.f542260v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignallingComponent", "current ChattingUI lose focus!");
            glVar.f280113d.f542261w = true;
            return;
        }
        dVar.f542261w = false;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl.f280641n) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl.f280641n = false;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar.f542241c.a(sb5.z0.class))).C();
            glVar.f280113d.J();
        }
    }
}
