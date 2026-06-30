package dk2;

/* loaded from: classes3.dex */
public final class ie extends android.telephony.PhoneStateListener {
    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i17, java.lang.String incomingNumber) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(incomingNumber, "incomingNumber");
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            k0Var.mo46550x22910660(i17, incomingNumber);
        }
    }
}
