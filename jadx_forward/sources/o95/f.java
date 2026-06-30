package o95;

/* loaded from: classes13.dex */
public final class f extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.SignalStrengthsListener, android.telephony.TelephonyCallback.DataConnectionStateListener, android.media.AudioManager.OnModeChangedListener {
    @Override // android.telephony.TelephonyCallback.DataConnectionStateListener
    public void onDataConnectionStateChanged(int i17, int i18) {
        o95.k.f425281i = i18;
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public void onModeChanged(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 0;
            }
        }
        o95.k.f425276d.getClass();
        ve0.f fVar = o95.k.f425285p;
        if (fVar != null) {
            fVar.a(i18);
        }
    }

    @Override // android.telephony.TelephonyCallback.SignalStrengthsListener
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signalStrength, "signalStrength");
        o95.k.f425276d.getClass();
        ve0.f fVar = o95.k.f425285p;
        if (fVar != null) {
            fVar.mo72737xe75d7d89(signalStrength);
        }
    }
}
