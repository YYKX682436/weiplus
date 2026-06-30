package o45;

/* loaded from: classes12.dex */
public class ii extends o45.ah implements o45.yg {

    /* renamed from: b, reason: collision with root package name */
    public byte[] f424495b;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f424499f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f424500g;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f424496c = null;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f424497d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f424498e = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f424494a = 7;

    public java.lang.String a() {
        byte[] bArr = this.f424497d;
        if (bArr == null) {
            return "";
        }
        if (this.f424496c == null) {
            byte[] m75978x7824c1be = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75978x7824c1be(this.f424495b, bArr);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(m75978x7824c1be)) {
                return "";
            }
            this.f424496c = new java.lang.String(m75978x7824c1be, o45.ji.f424505a);
        }
        return this.f424496c;
    }

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        if (bArr == null || bArr.length < 12) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dksynccheck err resp buf:");
            sb6.append(bArr == null ? -1 : bArr.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSyncCheck", sb6.toString());
            return -1;
        }
        this.f424494a = (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24);
        int i17 = (bArr[7] & 255) | ((bArr[6] & 255) << 8) | ((bArr[5] & 255) << 16) | ((bArr[4] & 255) << 24);
        int i18 = (bArr[11] & 255) | ((bArr[10] & 255) << 8) | ((bArr[9] & 255) << 16) | ((bArr[8] & 255) << 24);
        if (i17 == -3002) {
            if (i18 != bArr.length - 12 && i18 != (bArr.length - 12) - 16) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSyncCheck", " the key len is invalid keyLen:%d, bufLen:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bArr.length));
                return -1;
            }
            if (i18 == (bArr.length - 12) - 16) {
                byte[] bArr2 = new byte[16];
                this.f424497d = bArr2;
                java.lang.System.arraycopy(bArr, bArr.length - 16, bArr2, 0, 16);
            }
            byte[] bArr3 = new byte[i18];
            this.f424495b = bArr3;
            java.lang.System.arraycopy(bArr, 12, bArr3, 0, i18);
            return i17;
        }
        this.f424496c = "";
        int i19 = i18 + 12;
        if (bArr.length > i19) {
            this.f424498e = (bArr[i18 + 15] & 255) | ((bArr[i18 + 14] & 255) << 8) | ((bArr[i18 + 13] & 255) << 16) | ((bArr[i19] & 255) << 24);
            byte[] bArr4 = new byte[32];
            this.f424499f = bArr4;
            java.lang.System.arraycopy(bArr, i18 + 16, bArr4, 0, 32);
            int i27 = (bArr[i18 + 51] & 255) | ((bArr[i18 + 50] & 255) << 8) | ((bArr[i18 + 49] & 255) << 16) | ((bArr[i18 + 48] & 255) << 24);
            this.f424500g = new byte[0];
            if (i27 > 0) {
                byte[] bArr5 = new byte[i27];
                this.f424500g = bArr5;
                java.lang.System.arraycopy(bArr, i18 + 52, bArr5, 0, i27);
            }
        }
        return i17;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 1000000205;
    }

    @Override // o45.ah, o45.yg
    /* renamed from: isRawData */
    public boolean mo150581x182b0f68() {
        return true;
    }
}
