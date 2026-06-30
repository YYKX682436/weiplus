package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes5.dex */
public final class j implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k f279954d;

    public j(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar) {
        this.f279954d = kVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = this.f279954d;
        yb5.d dVar = kVar.K;
        if (dVar == null || !dVar.f542247i) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "[onTimerExpired]");
        kVar.Q0();
        return true;
    }
}
