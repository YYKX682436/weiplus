package yn3;

/* loaded from: classes8.dex */
public class c implements yn3.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.nfc.tech.NfcA f545550a;

    public c(android.nfc.Tag tag) {
        this.f545550a = android.nfc.tech.NfcA.get(tag);
    }

    public static org.json.JSONObject d(android.nfc.Tag tag) {
        android.nfc.tech.NfcA nfcA = android.nfc.tech.NfcA.get(tag);
        if (nfcA == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApduEngineNfcA", "lo-nfc-getInfoJsonObject: get nfcA null");
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("atqa", zn3.a.a(nfcA.getAtqa()));
        short sak = nfcA.getSak();
        jSONObject.put("sak", zn3.a.a(new byte[]{(byte) ((sak >>> 8) & 255), (byte) (sak & 255)}));
        return jSONObject;
    }

    @Override // yn3.d
    public boolean a() {
        android.nfc.tech.NfcA nfcA = this.f545550a;
        try {
            if (nfcA.isConnected()) {
                return true;
            }
            nfcA.connect();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ApduEngineNfcA", e17, null, new java.lang.Object[0]);
            return false;
        }
    }

    @Override // yn3.d
    public wn3.c b(wn3.a aVar) {
        android.nfc.tech.NfcA nfcA = this.f545550a;
        if (nfcA == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngineNfcA", "[NFC]NfcA is null");
            throw new java.lang.IllegalStateException("NfcA is null");
        }
        a();
        wn3.c cVar = null;
        while (true) {
            wn3.c cVar2 = new wn3.c(nfcA.transceive((byte[]) aVar.f529059d.clone()));
            if (cVar2.f529061d.length == 0) {
                return cVar;
            }
            if (r2.length - 2 < 0) {
                return cVar2;
            }
            if (cVar2.b() == 108) {
                short s17 = (short) (cVar2.f529061d[r2.length - 1] & 255);
                aVar.f529059d[r3.length - 1] = (byte) s17;
            } else {
                if (cVar == null) {
                    cVar = cVar2;
                } else {
                    cVar.a(cVar2);
                }
                if (cVar2.b() != 97) {
                    return cVar;
                }
                if (((short) (cVar2.f529061d[r6.length - 1] & 255)) == 0) {
                    cVar.f529061d[r6.length - 1] = (byte) (-112);
                    return cVar;
                }
                aVar = new wn3.a((byte[]) wn3.b.f529060a.clone());
            }
        }
    }

    @Override // yn3.d
    public boolean c() {
        mo177413x5a5ddf8();
        a();
        return true;
    }

    @Override // yn3.d
    /* renamed from: close */
    public void mo177413x5a5ddf8() {
        android.nfc.tech.NfcA nfcA = this.f545550a;
        try {
            if (nfcA.isConnected()) {
                nfcA.close();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ApduEngineNfcA", e17, null, new java.lang.Object[0]);
        }
    }

    @Override // yn3.d
    /* renamed from: isConnected */
    public boolean mo177414x23b734ff() {
        try {
            return this.f545550a.isConnected();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ApduEngineNfcA", e17, null, new java.lang.Object[0]);
            return false;
        }
    }
}
