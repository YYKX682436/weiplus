package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public final class c5 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "onEnterBackground called by AppExplicitBackgroundOwner");
        if (com.p314xaae8f345.mm.app.d5.f134920d) {
            com.p314xaae8f345.mm.app.d5.a(com.p314xaae8f345.mm.app.d5.f134917a);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "onExitBackground called by AppExplicitBackgroundOwner");
        if (com.p314xaae8f345.mm.app.d5.f134920d) {
            return;
        }
        com.p314xaae8f345.mm.app.d5.b(com.p314xaae8f345.mm.app.d5.f134917a);
    }
}
