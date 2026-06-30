package hd1;

/* loaded from: classes7.dex */
public final class g implements android.nfc.NfcAdapter.ReaderCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd1.h f361932a;

    public g(hd1.h hVar) {
        this.f361932a = hVar;
    }

    @Override // android.nfc.NfcAdapter.ReaderCallback
    public final void onTagDiscovered(android.nfc.Tag tag) {
        java.util.ArrayList arrayList;
        android.nfc.tech.Ndef ndef;
        android.nfc.NdefMessage cachedNdefMessage;
        this.f361932a.f361920c.clear();
        this.f361932a.f361935i = tag;
        if (tag == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onTagDiscovered, discoveredTag is null");
            return;
        }
        yz5.q qVar = this.f361932a.f361919b;
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onTagDiscovered, onDiscoveryListener is null");
            return;
        }
        byte[] id6 = tag.getId();
        java.lang.String[] techList = tag.getTechList();
        java.lang.String str = null;
        if (techList != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : techList) {
                id1.d.f371992h.getClass();
                java.lang.String str3 = (java.lang.String) id1.d.f371994m.get(str2);
                if (str3 != null) {
                    arrayList.add(str3);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onTagDiscovered, techs is empty");
            return;
        }
        java.util.List c17 = (!arrayList.contains(id1.d.f372000s.f372002d) || (ndef = android.nfc.tech.Ndef.get(tag)) == null || (cachedNdefMessage = ndef.getCachedNdefMessage()) == null) ? null : kz5.b0.c(cachedNdefMessage);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTagDiscovered, id: ");
        if (id6 != null) {
            str = java.util.Arrays.toString(id6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        }
        sb6.append(str);
        sb6.append(", techs: ");
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", sb6.toString());
        qVar.mo147xb9724478(id6, arrayList, c17);
    }
}
