package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes7.dex */
public final class j extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebComponent", "unknown message " + msg.what);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269336k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "jsEngine already paused");
            return;
        }
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
        if (powerManager.isInteractive()) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b c4683x847dbe1b = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495;
            if (c4683x847dbe1b.mo40975xf7b3660d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "power interactive " + powerManager.isInteractive() + " isForeground " + c4683x847dbe1b.mo40975xf7b3660d());
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "jsEngine pause");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269336k = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0.b(h0Var2).mo51548x65825f6();
    }
}
