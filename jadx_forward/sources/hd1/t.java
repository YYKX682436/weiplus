package hd1;

/* loaded from: classes7.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f361959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361960e;

    public t(hd1.w wVar, yz5.l lVar) {
        this.f361959d = wVar;
        this.f361960e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hd1.c cVar;
        hd1.b bVar = (hd1.b) this.f361959d.f361972b;
        bVar.f361922e = false;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = bVar.f361921d;
        if (atomicBoolean.get()) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode");
                android.app.Activity a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k3) ((hd1.h) bVar).f361918a).a();
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode, activity is null");
                } else {
                    android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(defaultAdapter);
                    defaultAdapter.disableReaderMode(a17);
                }
                atomicBoolean.set(false);
                cVar = hd1.c.f361926d;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AbsNFCDiscoverable", "stopDiscovery failed since " + e17);
                cVar = hd1.c.f361927e;
            }
        } else {
            cVar = hd1.c.f361929g;
        }
        int ordinal = cVar.ordinal();
        yz5.l lVar = this.f361960e;
        if (ordinal == 0) {
            lVar.mo146xb9724478(new hd1.y(jz5.f0.f384359a));
        } else if (ordinal != 3) {
            lVar.mo146xb9724478(new hd1.x(13017, "system internal error"));
        } else {
            lVar.mo146xb9724478(new hd1.x(13018, "NFC discovery has not started"));
        }
    }
}
