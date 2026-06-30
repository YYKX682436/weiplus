package hd1;

/* loaded from: classes7.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f361965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.nfc.NdefMessage f361967f;

    public v(hd1.w wVar, yz5.l lVar, android.nfc.NdefMessage ndefMessage) {
        this.f361965d = wVar;
        this.f361966e = lVar;
        this.f361967f = ndefMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.Tag a17 = hd1.w.a(this.f361965d);
        yz5.l lVar = this.f361966e;
        if (a17 == null) {
            lVar.mo146xb9724478(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        android.nfc.tech.Ndef ndef = android.nfc.tech.Ndef.get(a17);
        if (ndef == null) {
            lVar.mo146xb9724478(new hd1.x(13015, "unavailable tech"));
            return;
        }
        try {
            ndef.writeNdefMessage(this.f361967f);
            lVar.mo146xb9724478(new hd1.y(jz5.f0.f384359a));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "writeNdefMessage failed since " + e17);
            lVar.mo146xb9724478(new hd1.x(13017, "system internal error: " + e17.getMessage()));
        }
    }
}
