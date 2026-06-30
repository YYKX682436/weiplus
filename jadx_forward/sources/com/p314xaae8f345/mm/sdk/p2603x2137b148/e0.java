package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class e0 extends android.telephony.PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.d0 f274079a;

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signalStrength, "signalStrength");
        super.onSignalStrengthsChanged(signalStrength);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d0 d0Var = this.f274079a;
        if (d0Var != null) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.g0) d0Var).a(signalStrength);
        }
    }
}
