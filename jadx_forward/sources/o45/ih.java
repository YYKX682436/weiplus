package o45;

/* loaded from: classes12.dex */
public class ih extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public int f424489a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f424490b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f424491c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f424492d = "";

    /* renamed from: e, reason: collision with root package name */
    public byte[] f424493e = new byte[0];

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 8;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 10;
    }

    @Override // o45.zg
    /* renamed from: getShortSupport */
    public boolean mo150590x4bad6229() {
        return false;
    }

    @Override // o45.zg, o45.xg
    /* renamed from: isRawData */
    public boolean mo150591x182b0f68() {
        return true;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(this.f424491c);
            dataOutputStream.writeShort(this.f424492d.getBytes().length);
            dataOutputStream.write(this.f424492d.getBytes());
            dataOutputStream.writeShort(this.f424493e.length);
            dataOutputStream.write(this.f424493e);
            dataOutputStream.close();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDirectSend", "direct merge tail failed, err=" + e17.getMessage());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        byte[] bArr = new byte[16];
        java.lang.System.arraycopy(super.m150608xbdf72767().getBytes(), 0, bArr, 0, 15);
        bArr[15] = 0;
        byte[] h17 = kk.k.h(bArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(h17);
        kk.d.b(c19764x527bffc1, byteArray, h17);
        byte[] bArr2 = c19764x527bffc1.f38861x6ac9171;
        if (bArr2 == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        try {
            java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(byteArrayOutputStream2);
            dataOutputStream2.writeByte(this.f424489a);
            dataOutputStream2.writeByte(this.f424490b);
            dataOutputStream2.write(bArr2);
            dataOutputStream2.close();
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDirectSend", "direct merge all failed, err=" + e18.getMessage());
        }
        return byteArrayOutputStream2.toByteArray();
    }
}
