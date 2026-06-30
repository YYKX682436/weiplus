package e46;

/* loaded from: classes16.dex */
public class i implements java.io.Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final short[] f330985i = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f330986m = {16, 32, 48, 64, 81, 113, 146, 210, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd, 403, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c4.f34473x366c91de, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.k.f34558x366c91de, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f330987n = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f330988o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f330989p;

    /* renamed from: d, reason: collision with root package name */
    public boolean f330990d;

    /* renamed from: f, reason: collision with root package name */
    public r46.a f330992f;

    /* renamed from: g, reason: collision with root package name */
    public final java.io.InputStream f330993g;

    /* renamed from: h, reason: collision with root package name */
    public final e46.e f330994h = new e46.e(null);

    /* renamed from: e, reason: collision with root package name */
    public e46.d f330991e = new e46.g(null);

    static {
        int[] iArr = new int[288];
        f330988o = iArr;
        java.util.Arrays.fill(iArr, 0, 144, 8);
        java.util.Arrays.fill(iArr, 144, 256, 9);
        java.util.Arrays.fill(iArr, 256, 280, 7);
        java.util.Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f330989p = iArr2;
        java.util.Arrays.fill(iArr2, 5);
    }

    public i(java.io.InputStream inputStream) {
        this.f330992f = new r46.a(inputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        this.f330993g = inputStream;
    }

    public static e46.c a(int[] iArr) {
        int[] iArr2 = new int[65];
        int i17 = 0;
        for (int i18 : iArr) {
            if (i18 < 0 || i18 > 64) {
                throw new java.lang.IllegalArgumentException("Invalid code " + i18 + " in literal table");
            }
            i17 = java.lang.Math.max(i17, i18);
            iArr2[i18] = iArr2[i18] + 1;
        }
        int i19 = i17 + 1;
        int[] copyOf = java.util.Arrays.copyOf(iArr2, i19);
        int[] iArr3 = new int[i19];
        int i27 = 0;
        for (int i28 = 0; i28 <= i17; i28++) {
            i27 = (i27 + copyOf[i28]) << 1;
            iArr3[i28] = i27;
        }
        e46.c cVar = new e46.c(0);
        for (int i29 = 0; i29 < iArr.length; i29++) {
            int i37 = iArr[i29];
            if (i37 != 0) {
                int i38 = i37 - 1;
                int i39 = iArr3[i38];
                e46.c cVar2 = cVar;
                for (int i47 = i38; i47 >= 0; i47--) {
                    int i48 = (1 << i47) & i39;
                    int i49 = cVar2.f330967a;
                    if (i48 == 0) {
                        if (cVar2.f330969c == null && cVar2.f330968b == -1) {
                            cVar2.f330969c = new e46.c(i49 + 1);
                        }
                        cVar2 = cVar2.f330969c;
                    } else {
                        if (cVar2.f330970d == null && cVar2.f330968b == -1) {
                            cVar2.f330970d = new e46.c(i49 + 1);
                        }
                        cVar2 = cVar2.f330970d;
                    }
                    if (cVar2 == null) {
                        throw new java.lang.IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                cVar2.f330968b = i29;
                cVar2.f330969c = null;
                cVar2.f330970d = null;
                iArr3[i38] = iArr3[i38] + 1;
            }
        }
        return cVar;
    }

    public static int c(r46.a aVar, e46.c cVar) {
        while (cVar != null && cVar.f330968b == -1) {
            cVar = i(aVar, 1) == 0 ? cVar.f330969c : cVar.f330970d;
        }
        if (cVar != null) {
            return cVar.f330968b;
        }
        return -1;
    }

    public static long i(r46.a aVar, int i17) {
        long a17 = aVar.a(i17);
        if (a17 != -1) {
            return a17;
        }
        throw new java.io.EOFException("Truncated Deflate64 Stream");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x00a1. Please report as an issue. */
    public int b(byte[] bArr, int i17, int i18) {
        long i19;
        while (true) {
            if (this.f330990d && !this.f330991e.b()) {
                return -1;
            }
            if (this.f330991e.d() == e46.j.INITIAL) {
                this.f330990d = f(1) == 1;
                int f17 = (int) f(2);
                if (f17 == 0) {
                    r46.a aVar = this.f330992f;
                    int i27 = aVar.f474032g % 8;
                    if (i27 > 0) {
                        aVar.b(i27);
                    }
                    long f18 = f(16);
                    if ((65535 & (f18 ^ 65535)) != f(16)) {
                        throw new java.lang.IllegalStateException("Illegal LEN / NLEN values");
                    }
                    this.f330991e = new e46.h(this, f18, null);
                } else if (f17 == 1) {
                    this.f330991e = new e46.f(this, e46.j.FIXED_CODES, f330988o, f330989p);
                } else {
                    if (f17 != 2) {
                        throw new java.lang.IllegalStateException("Unsupported compression: " + f17);
                    }
                    int f19 = (int) (f(5) + 1);
                    int[] iArr = new int[f19];
                    int[][] iArr2 = {new int[(int) (f(5) + 257)], iArr};
                    r46.a aVar2 = this.f330992f;
                    int[] iArr3 = iArr2[0];
                    int i28 = (int) (i(aVar2, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i29 = 0;
                    while (true) {
                        int i37 = 3;
                        if (i29 < i28) {
                            iArr4[f330987n[i29]] = (int) i(aVar2, 3);
                            i29++;
                        } else {
                            e46.c a17 = a(iArr4);
                            int length = iArr3.length + f19;
                            int[] iArr5 = new int[length];
                            int i38 = 0;
                            int i39 = 0;
                            int i47 = -1;
                            while (i38 < length) {
                                if (i39 <= 0) {
                                    int c17 = c(aVar2, a17);
                                    if (c17 >= 16) {
                                        long j17 = 3;
                                        switch (c17) {
                                            case 16:
                                                i39 = (int) (i(aVar2, 2) + 3);
                                                i37 = 3;
                                                break;
                                            case 17:
                                                i19 = i(aVar2, i37);
                                                i39 = (int) (i19 + j17);
                                                i47 = 0;
                                                i37 = 3;
                                                break;
                                            case 18:
                                                i19 = i(aVar2, 7);
                                                j17 = 11;
                                                i39 = (int) (i19 + j17);
                                                i47 = 0;
                                                i37 = 3;
                                                break;
                                        }
                                    } else {
                                        iArr5[i38] = c17;
                                        i38++;
                                        i47 = c17;
                                    }
                                } else {
                                    iArr5[i38] = i47;
                                    i39--;
                                    i38++;
                                }
                            }
                            java.lang.System.arraycopy(iArr5, 0, iArr3, 0, iArr3.length);
                            java.lang.System.arraycopy(iArr5, iArr3.length, iArr, 0, f19);
                            this.f330991e = new e46.f(this, e46.j.DYNAMIC_CODES, iArr2[0], iArr2[1]);
                        }
                    }
                }
            } else {
                int c18 = this.f330991e.c(bArr, i17, i18);
                if (c18 != 0) {
                    return c18;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f330991e = new e46.g(null);
        this.f330992f = null;
    }

    public final long f(int i17) {
        return i(this.f330992f, i17);
    }
}
