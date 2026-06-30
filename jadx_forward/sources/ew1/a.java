package ew1;

/* loaded from: classes14.dex */
public final class a extends xm1.j {

    /* renamed from: k, reason: collision with root package name */
    public boolean f338564k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e f338565l;

    /* renamed from: m, reason: collision with root package name */
    public final fp.e f338566m = new fp.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    public a() {
        ym1.e eVar = ym1.f.f544667h;
        eVar.d().f544668d.mo43387xa1258ad5();
        i();
        eVar.h(this, "openvoice");
    }

    public final boolean D(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceAudioManager", "setSpeakerPhoneOn, isSpeakerPhoneOn: %b", java.lang.Boolean.valueOf(z17));
        A(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = this.f338565l;
        if (!((eVar == null || eVar.f257971a) ? false : true)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        return eVar.j(z17);
    }

    @Override // xm1.h
    public void o(int i17) {
        super.o(i17);
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 7:
                this.f338564k &= D(true);
                return;
            case 2:
                this.f338564k &= D(false);
                return;
            case 4:
            case 5:
            default:
                return;
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceAudioManager", " isHeadsetPlug connected, isBluetoothConnected: %s", java.lang.Boolean.valueOf(m(4)));
                this.f338564k &= D(false);
                return;
            case 9:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceAudioManager", "isHeadsetPlugged disconnected, isBluetoothConnected: %s", java.lang.Boolean.valueOf(m(4)));
                this.f338564k = D(!m(4)) & this.f338564k;
                return;
        }
    }
}
