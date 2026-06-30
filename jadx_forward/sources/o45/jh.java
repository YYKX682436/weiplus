package o45;

/* loaded from: classes12.dex */
public class jh extends o45.ah implements o45.yg {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f424504c = "";

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f424502a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f424503b = new byte[0];

    public final byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDirectSend", "parse all failed, empty buf");
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - 2];
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(byteArrayInputStream);
            dataInputStream.readByte();
            dataInputStream.readByte();
            dataInputStream.readFully(bArr2);
            byteArrayInputStream.close();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDirectSend", "direct parse all failed, err=" + e17.getMessage());
        }
        return bArr2;
    }

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        java.lang.System.arraycopy(this.f424504c.getBytes(), 0, bArr2, 0, 15);
        bArr2[15] = 0;
        byte[] h17 = kk.k.h(bArr2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(h17);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        if (kk.d.a(c19764x527bffc1, a(bArr), h17) != 0) {
            byte[] bArr3 = new byte[16];
            for (int i17 = 0; i17 < 16; i17++) {
                bArr3[i17] = 0;
            }
            if (kk.d.a(c19764x527bffc1, a(bArr), bArr3) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDirectSend", "decrypting from buffer using key=%s error", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(h17));
                return -1;
            }
        }
        byte[] bArr4 = c19764x527bffc1.f38861x6ac9171;
        if (bArr4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDirectSend", "parse tail failed, empty buf");
        } else {
            try {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr4));
                dataInputStream.readInt();
                int readShort = dataInputStream.readShort();
                if (readShort < 0) {
                    throw new java.io.IOException("sender empty");
                }
                byte[] bArr5 = new byte[readShort];
                dataInputStream.readFully(bArr5);
                this.f424502a = new java.lang.String(bArr5);
                int readShort2 = dataInputStream.readShort();
                if (readShort2 < 0) {
                    throw new java.io.IOException("content empty");
                }
                byte[] bArr6 = new byte[readShort2];
                this.f424503b = bArr6;
                dataInputStream.readFully(bArr6);
                int length = this.f424503b.length;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDirectSend", "direct parse all failed, err=" + e17.getMessage());
            }
        }
        return 0;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 8;
    }

    @Override // o45.ah, o45.yg
    /* renamed from: isRawData */
    public boolean mo150581x182b0f68() {
        return true;
    }
}
