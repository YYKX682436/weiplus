package yn3;

/* loaded from: classes8.dex */
public class a extends xn3.b {

    /* renamed from: e, reason: collision with root package name */
    public static yn3.a f545546e;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Set f545547c;

    /* renamed from: d, reason: collision with root package name */
    public yn3.d f545548d = null;

    public static yn3.a c() {
        if (f545546e == null) {
            f545546e = new yn3.a();
        }
        return f545546e;
    }

    public int a(android.content.Context context) {
        int d17 = d(context);
        if (d17 != 3 && d17 != 2) {
            return d17;
        }
        try {
            yn3.d dVar = this.f545548d;
            if (dVar != null && dVar.a()) {
                if (this.f545548d.mo177414x23b734ff()) {
                    return 3;
                }
            }
            return 2;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngine", "[NFC] IOException : " + e17.toString());
            return 2;
        }
    }

    public boolean b(xn3.a aVar) {
        wn3.a aVar2;
        if (this.f545548d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngine", "[NFC]ApduEngine not ready !");
            throw new java.lang.IllegalStateException("ApduEngine not ready !");
        }
        if (aVar == null || (aVar2 = aVar.f537127f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngine", "[NFC]apdu is null !");
            throw new java.lang.IllegalArgumentException("apdu is null !");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[NFC][");
        java.lang.String str = aVar.f537126e;
        sb6.append(str);
        sb6.append("] do cmd : ");
        sb6.append(aVar2.m174174x9616526c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApduEngine", sb6.toString());
        wn3.c b17 = this.f545548d.b(aVar2);
        aVar.f537128g = b17;
        int b18 = b17.b() << 8;
        byte[] bArr = b17.f529061d;
        if (((short) (((short) (bArr[bArr.length + (-1)] & 255)) | b18)) == -28672) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApduEngine", "[NFC][" + str + "] result==> OK : " + aVar.f537128g.m174178x9616526c());
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngine", "[NFC][" + str + "] result==> fail : " + aVar.f537128g.m174178x9616526c());
        return false;
    }

    public int d(android.content.Context context) {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApduEngine", "[NFC] No nfc chip !");
            return 0;
        }
        if (!defaultAdapter.isEnabled()) {
            return 1;
        }
        yn3.d dVar = this.f545548d;
        if (dVar == null) {
            return 4;
        }
        if (dVar != null) {
            try {
                if (dVar.mo177414x23b734ff()) {
                    return 3;
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngine", "[NFC] IOException : " + e17.toString());
            }
        }
        return 2;
    }

    public boolean e(android.nfc.Tag tag) {
        this.f537129a = tag;
        if (tag != null) {
            this.f537130b = tag.getId();
        }
        this.f545547c = new java.util.HashSet();
        for (java.lang.String str : tag.getTechList()) {
            this.f545547c.add(str);
        }
        try {
            yn3.d dVar = this.f545548d;
            if (dVar != null && dVar.mo177414x23b734ff()) {
                this.f545548d.mo177413x5a5ddf8();
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ApduEngine", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ApduEngine", e17.toString());
        }
        if (this.f545547c.contains(android.nfc.tech.IsoDep.class.getName())) {
            this.f545548d = new yn3.b(tag);
            return true;
        }
        if (this.f545547c.contains(android.nfc.tech.NfcA.class.getName())) {
            this.f545548d = new yn3.c(tag);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApduEngine", "[NFC]ApduEngine not support this tag");
        return false;
    }
}
