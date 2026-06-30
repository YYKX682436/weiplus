package zi3;

/* loaded from: classes14.dex */
public final class a extends zi3.f {
    @Override // zi3.f, xm1.h
    public void o(int i17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s == sj3.e4.Init) {
            super.o(i17);
            return;
        }
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 7:
                D(true);
                break;
            case 2:
                D(false);
                break;
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkAudioManager", " isHeadsetPlug connected, isBluetoothConnected: %s", java.lang.Boolean.valueOf(m(4)));
                this.f554704l &= D(false);
                break;
            case 9:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkAudioManager", "isHeadsetPlugged disconnected, isBluetoothConnected: %s", java.lang.Boolean.valueOf(m(4)));
                this.f554704l = D(!m(4)) & this.f554704l;
                break;
        }
        super.o(i17);
    }
}
