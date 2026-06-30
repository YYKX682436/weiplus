package g46;

/* loaded from: classes13.dex */
public class d implements java.util.zip.Checksum {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f350406b;

    /* renamed from: d, reason: collision with root package name */
    public int f350408d;

    /* renamed from: e, reason: collision with root package name */
    public int f350409e;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f350405a = new byte[1];

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f350407c = new byte[16];

    public d() {
        this.f350406b = r1;
        int[] iArr = {606290984, -2048144777, 0, 1640531535};
    }

    public static int a(byte[] bArr, int i17) {
        return (int) (r46.d.c(bArr, i17, 4) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }

    public final void b(byte[] bArr, int i17) {
        int[] iArr = this.f350406b;
        int i18 = iArr[0];
        int i19 = iArr[1];
        int i27 = iArr[2];
        int i28 = iArr[3];
        int rotateLeft = java.lang.Integer.rotateLeft(i18 + (a(bArr, i17) * (-2048144777)), 13) * (-1640531535);
        int rotateLeft2 = java.lang.Integer.rotateLeft(i19 + (a(bArr, i17 + 4) * (-2048144777)), 13) * (-1640531535);
        int rotateLeft3 = java.lang.Integer.rotateLeft(i27 + (a(bArr, i17 + 8) * (-2048144777)), 13) * (-1640531535);
        int rotateLeft4 = java.lang.Integer.rotateLeft(i28 + (a(bArr, i17 + 12) * (-2048144777)), 13) * (-1640531535);
        iArr[0] = rotateLeft;
        iArr[1] = rotateLeft2;
        iArr[2] = rotateLeft3;
        iArr[3] = rotateLeft4;
        this.f350409e = 0;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        byte[] bArr;
        int i17 = this.f350408d;
        int i18 = 0;
        int[] iArr = this.f350406b;
        int rotateLeft = (i17 > 16 ? java.lang.Integer.rotateLeft(iArr[0], 1) + java.lang.Integer.rotateLeft(iArr[1], 7) + java.lang.Integer.rotateLeft(iArr[2], 12) + java.lang.Integer.rotateLeft(iArr[3], 18) : iArr[2] + 374761393) + this.f350408d;
        int i19 = this.f350409e - 4;
        while (true) {
            bArr = this.f350407c;
            if (i18 > i19) {
                break;
            }
            rotateLeft = java.lang.Integer.rotateLeft(rotateLeft + (a(bArr, i18) * (-1028477379)), 17) * 668265263;
            i18 += 4;
        }
        while (i18 < this.f350409e) {
            rotateLeft = java.lang.Integer.rotateLeft(rotateLeft + ((bArr[i18] & 255) * 374761393), 11) * (-1640531535);
            i18++;
        }
        int i27 = (rotateLeft ^ (rotateLeft >>> 15)) * (-2048144777);
        int i28 = (i27 ^ (i27 >>> 13)) * (-1028477379);
        return (i28 ^ (i28 >>> 16)) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        int[] iArr = this.f350406b;
        iArr[0] = 606290984;
        iArr[1] = -2048144777;
        iArr[2] = 0;
        iArr[3] = 1640531535;
        this.f350408d = 0;
        this.f350409e = 0;
    }

    @Override // java.util.zip.Checksum
    public void update(int i17) {
        byte[] bArr = this.f350405a;
        bArr[0] = (byte) (i17 & 255);
        update(bArr, 0, 1);
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i17, int i18) {
        if (i18 <= 0) {
            return;
        }
        this.f350408d += i18;
        int i19 = i17 + i18;
        int i27 = this.f350409e;
        int i28 = i27 + i18;
        byte[] bArr2 = this.f350407c;
        if (i28 < 16) {
            java.lang.System.arraycopy(bArr, i17, bArr2, i27, i18);
            this.f350409e += i18;
            return;
        }
        if (i27 > 0) {
            int i29 = 16 - i27;
            java.lang.System.arraycopy(bArr, i17, bArr2, i27, i29);
            b(bArr2, 0);
            i17 += i29;
        }
        int i37 = i19 - 16;
        while (i17 <= i37) {
            b(bArr, i17);
            i17 += 16;
        }
        if (i17 < i19) {
            int i38 = i19 - i17;
            this.f350409e = i38;
            java.lang.System.arraycopy(bArr, i17, bArr2, 0, i38);
        }
    }
}
