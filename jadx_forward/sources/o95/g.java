package o95;

/* loaded from: classes13.dex */
public final class g extends android.telephony.PhoneStateListener {
    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i17, java.lang.String incomingNumber) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(incomingNumber, "incomingNumber");
        super.onCallStateChanged(i17, incomingNumber);
        o95.k.f425276d.getClass();
        ve0.f fVar = o95.k.f425285p;
        if (fVar != null) {
            fVar.a(i17);
        }
    }
}
