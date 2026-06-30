package hd1;

/* loaded from: classes7.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f361957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361958e;

    public s(hd1.w wVar, yz5.l lVar) {
        this.f361957d = wVar;
        this.f361958e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hd1.c cVar;
        hd1.b bVar = (hd1.b) this.f361957d.f361972b;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = bVar.f361921d;
        if (atomicBoolean.get()) {
            cVar = hd1.c.f361928f;
        } else {
            try {
                hd1.h hVar = (hd1.h) bVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode");
                android.app.Activity a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k3) hVar.f361918a).a();
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode, activity is null");
                } else {
                    android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(defaultAdapter);
                    defaultAdapter.enableReaderMode(a17, hVar.f361934h, hVar.f361933g, null);
                }
                atomicBoolean.set(true);
                cVar = hd1.c.f361926d;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsNFCDiscoverable", "startDiscovery failed since " + e17);
                cVar = hd1.c.f361927e;
            }
        }
        int ordinal = cVar.ordinal();
        yz5.l lVar = this.f361958e;
        if (ordinal == 0) {
            lVar.mo146xb9724478(new hd1.y(jz5.f0.f384359a));
        } else if (ordinal != 2) {
            lVar.mo146xb9724478(new hd1.x(13017, "system internal error"));
        } else {
            lVar.mo146xb9724478(new hd1.x(13021, "NFC discovery already started"));
        }
    }
}
