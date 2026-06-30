package gq1;

/* loaded from: classes13.dex */
public class q extends gq1.s {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f356069g = {76, 0, 2, 21};

    /* renamed from: c, reason: collision with root package name */
    public byte[] f356070c = null;

    /* renamed from: d, reason: collision with root package name */
    public short f356071d = -1;

    /* renamed from: e, reason: collision with root package name */
    public short f356072e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f356073f = 0;

    @Override // gq1.s
    public boolean b(byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconTLVSectionB", "valueByte is null or nil");
            return false;
        }
        if (26 != this.f356074a) {
            return false;
        }
        a42.a aVar = new a42.a(bArr.length);
        aVar.b(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[4];
        aVar.a(bArr2, 0, 4);
        if (!java.util.Arrays.equals(bArr2, f356069g)) {
            return false;
        }
        byte[] bArr3 = new byte[16];
        this.f356070c = bArr3;
        aVar.a(bArr3, 0, 16);
        try {
            aVar.f82728b.position();
            if (aVar.f82728b.position() <= 1) {
                throw new java.io.IOException("There is only one byte in array");
            }
            this.f356071d = aVar.f82727a.getShort();
            aVar.f82728b.position();
            if (aVar.f82728b.position() <= 1) {
                throw new java.io.IOException("There is only one byte in array");
            }
            this.f356072e = aVar.f82727a.getShort();
            byte[] bArr4 = new byte[1];
            aVar.a(bArr4, 0, 1);
            this.f356073f = bArr4[0];
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.IBeaconTLVSectionB", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
