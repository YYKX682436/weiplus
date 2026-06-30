package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class f0 extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.SignalStrengthsListener {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.d0 f274193a;

    @Override // android.telephony.TelephonyCallback.SignalStrengthsListener
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signalStrength, "signalStrength");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d0 d0Var = this.f274193a;
        if (d0Var != null) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.g0) d0Var).a(signalStrength);
        }
    }
}
