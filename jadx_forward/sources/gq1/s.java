package gq1;

/* loaded from: classes13.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public int f356074a = -1;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f356075b = null;

    public boolean a(a42.a aVar) {
        if (aVar != null) {
            aVar.f82728b.position();
            if (aVar.f82728b.position() != 0) {
                byte[] bArr = new byte[1];
                aVar.a(bArr, 0, 1);
                byte b17 = bArr[0];
                int i17 = b17 + 1;
                aVar.f82728b.position();
                if (i17 > aVar.f82728b.position()) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(b17);
                    aVar.f82728b.position();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.TLVBase", "lengthInt(%d) + 1 > autoBuffer.getSize()(%d)", valueOf, java.lang.Integer.valueOf(aVar.f82728b.position()));
                    return false;
                }
                if (b17 <= 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.TLVBase", "length(%d) <= 1", java.lang.Integer.valueOf(b17));
                    return false;
                }
                this.f356074a = b17;
                aVar.a(bArr, 0, 1);
                int i18 = this.f356074a - 1;
                byte[] bArr2 = new byte[i18];
                this.f356075b = bArr2;
                aVar.a(bArr2, 0, i18);
                return b(this.f356075b);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.TLVBase", "autoBuffer is null or nil");
        return false;
    }

    public abstract boolean b(byte[] bArr);
}
