package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class g0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274246a;

    public g0(int i17) {
        this.f274246a = i17;
    }

    public void a(android.telephony.SignalStrength signalStrength) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signalStrength, "signalStrength");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.j0 j0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274564e;
        int i17 = this.f274246a;
        j0Var.f274282a = i17;
        if (i17 == 1) {
            j0Var.f274283b = signalStrength.getGsmSignalStrength();
        } else {
            if (i17 != 2) {
                return;
            }
            j0Var.f274284c = signalStrength.getCdmaDbm();
        }
    }
}
