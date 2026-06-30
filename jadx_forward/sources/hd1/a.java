package hd1;

/* loaded from: classes7.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.b f361916d;

    public a(hd1.b bVar) {
        this.f361916d = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        android.content.Context applicationContext;
        hd1.b bVar = this.f361916d;
        android.app.Activity a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k3) bVar.f361918a).a();
        if (a17 != null && (applicationContext = a17.getApplicationContext()) != null) {
            applicationContext.unregisterReceiver(bVar.f361923f);
        }
        bVar.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        android.nfc.NfcAdapter defaultAdapter;
        super.e(w0Var);
        hd1.h hVar = (hd1.h) this.f361916d;
        if (hVar.f361921d.getAndSet(false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onPause, isNFCDiscovering");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode");
                android.app.Activity a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k3) hVar.f361918a).a();
                if (a17 != null && (defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) != null) {
                    defaultAdapter.disableReaderMode(a17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode failed since " + e17);
            }
            hVar.f361922e = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        android.nfc.NfcAdapter defaultAdapter;
        super.g();
        hd1.h hVar = (hd1.h) this.f361916d;
        if (hVar.f361922e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onResume, isNFCDiscoverySticky");
            android.nfc.NfcAdapter defaultAdapter2 = android.nfc.NfcAdapter.getDefaultAdapter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (!(defaultAdapter2 != null && true == defaultAdapter2.isEnabled())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onResume, nfc is not enabled");
                return;
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode");
                android.app.Activity a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k3) hVar.f361918a).a();
                if (a17 != null && (defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) != null) {
                    defaultAdapter.enableReaderMode(a17, hVar.f361934h, hVar.f361933g, null);
                }
                hVar.f361921d.set(true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode failed since " + e17);
            }
            hVar.f361922e = false;
        }
    }
}
