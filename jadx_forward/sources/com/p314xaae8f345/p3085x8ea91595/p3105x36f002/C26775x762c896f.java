package com.p314xaae8f345.p3085x8ea91595.p3105x36f002;

/* renamed from: com.tencent.tmassistantsdk.util.Base64 */
/* loaded from: classes16.dex */
public class C26775x762c896f {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56792x7118e671 = false;

    /* renamed from: CRLF */
    public static final int f56793x1fb229 = 4;

    /* renamed from: DEFAULT */
    public static final int f56794x86df6221 = 0;

    /* renamed from: NO_CLOSE */
    public static final int f56795x9f983dda = 16;

    /* renamed from: NO_PADDING */
    public static final int f56796xb6ca2773 = 1;

    /* renamed from: NO_WRAP */
    public static final int f56797xaa586808 = 2;

    /* renamed from: URL_SAFE */
    public static final int f56798xf694a07d = 8;

    /* renamed from: com.tencent.tmassistantsdk.util.Base64$Coder */
    /* loaded from: classes16.dex */
    public static abstract class Coder {

        /* renamed from: op, reason: collision with root package name */
        public int f297085op;

        /* renamed from: output */
        public byte[] f56799xc4111901;

        /* renamed from: maxOutputSize */
        public abstract int mo105464x6e311926(int i17);

        /* renamed from: process */
        public abstract boolean mo105465xed8d1e6f(byte[] bArr, int i17, int i18, boolean z17);
    }

    /* renamed from: com.tencent.tmassistantsdk.util.Base64$Decoder */
    /* loaded from: classes16.dex */
    public static class Decoder extends com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Coder {

        /* renamed from: DECODE */
        private static final int[] f56800x77f585ee = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: DECODE_WEBSAFE */
        private static final int[] f56801x1894ab70 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: EQUALS */
        private static final int f56802x7a5b73bf = -2;

        /* renamed from: SKIP */
        private static final int f56803x26dd7f = -1;

        /* renamed from: alphabet */
        private final int[] f56804x7278e673;

        /* renamed from: state */
        private int f56805x68ac491;

        /* renamed from: value */
        private int f56806x6ac9171;

        public Decoder(int i17, byte[] bArr) {
            this.f56799xc4111901 = bArr;
            this.f56804x7278e673 = (i17 & 8) == 0 ? f56800x77f585ee : f56801x1894ab70;
            this.f56805x68ac491 = 0;
            this.f56806x6ac9171 = 0;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Coder
        /* renamed from: maxOutputSize */
        public int mo105464x6e311926(int i17) {
            return ((i17 * 3) / 4) + 10;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Coder
        /* renamed from: process */
        public boolean mo105465xed8d1e6f(byte[] bArr, int i17, int i18, boolean z17) {
            int i19 = this.f56805x68ac491;
            if (i19 == 6) {
                return false;
            }
            int i27 = i18 + i17;
            int i28 = this.f56806x6ac9171;
            byte[] bArr2 = this.f56799xc4111901;
            int[] iArr = this.f56804x7278e673;
            int i29 = 0;
            int i37 = i28;
            int i38 = i19;
            int i39 = i17;
            while (i39 < i27) {
                if (i38 == 0) {
                    while (true) {
                        int i47 = i39 + 4;
                        if (i47 > i27 || (i37 = (iArr[bArr[i39] & 255] << 18) | (iArr[bArr[i39 + 1] & 255] << 12) | (iArr[bArr[i39 + 2] & 255] << 6) | iArr[bArr[i39 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i29 + 2] = (byte) i37;
                        bArr2[i29 + 1] = (byte) (i37 >> 8);
                        bArr2[i29] = (byte) (i37 >> 16);
                        i29 += 3;
                        i39 = i47;
                    }
                    if (i39 >= i27) {
                        break;
                    }
                }
                int i48 = i39 + 1;
                int i49 = iArr[bArr[i39] & 255];
                if (i38 != 0) {
                    if (i38 == 1) {
                        if (i49 < 0) {
                            if (i49 != -1) {
                                this.f56805x68ac491 = 6;
                                return false;
                            }
                        }
                        i49 |= i37 << 6;
                    } else if (i38 == 2) {
                        if (i49 < 0) {
                            if (i49 == -2) {
                                bArr2[i29] = (byte) (i37 >> 4);
                                i29++;
                                i38 = 4;
                            } else if (i49 != -1) {
                                this.f56805x68ac491 = 6;
                                return false;
                            }
                        }
                        i49 |= i37 << 6;
                    } else if (i38 != 3) {
                        if (i38 != 4) {
                            if (i38 == 5 && i49 != -1) {
                                this.f56805x68ac491 = 6;
                                return false;
                            }
                        } else if (i49 == -2) {
                            i38++;
                        } else if (i49 != -1) {
                            this.f56805x68ac491 = 6;
                            return false;
                        }
                    } else if (i49 >= 0) {
                        int i57 = i49 | (i37 << 6);
                        bArr2[i29 + 2] = (byte) i57;
                        bArr2[i29 + 1] = (byte) (i57 >> 8);
                        bArr2[i29] = (byte) (i57 >> 16);
                        i29 += 3;
                        i37 = i57;
                        i38 = 0;
                    } else if (i49 == -2) {
                        bArr2[i29 + 1] = (byte) (i37 >> 2);
                        bArr2[i29] = (byte) (i37 >> 10);
                        i29 += 2;
                        i38 = 5;
                    } else if (i49 != -1) {
                        this.f56805x68ac491 = 6;
                        return false;
                    }
                    i38++;
                    i37 = i49;
                } else {
                    if (i49 < 0) {
                        if (i49 != -1) {
                            this.f56805x68ac491 = 6;
                            return false;
                        }
                    }
                    i38++;
                    i37 = i49;
                }
                i39 = i48;
            }
            if (!z17) {
                this.f56805x68ac491 = i38;
                this.f56806x6ac9171 = i37;
                this.f297085op = i29;
                return true;
            }
            if (i38 == 1) {
                this.f56805x68ac491 = 6;
                return false;
            }
            if (i38 == 2) {
                bArr2[i29] = (byte) (i37 >> 4);
                i29++;
            } else if (i38 == 3) {
                int i58 = i29 + 1;
                bArr2[i29] = (byte) (i37 >> 10);
                i29 = i58 + 1;
                bArr2[i58] = (byte) (i37 >> 2);
            } else if (i38 == 4) {
                this.f56805x68ac491 = 6;
                return false;
            }
            this.f56805x68ac491 = i38;
            this.f297085op = i29;
            return true;
        }
    }

    /* renamed from: com.tencent.tmassistantsdk.util.Base64$Encoder */
    /* loaded from: classes16.dex */
    public static class Encoder extends com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Coder {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f56807x7118e671 = false;

        /* renamed from: ENCODE */
        private static final byte[] f56808x7a293216 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: ENCODE_WEBSAFE */
        private static final byte[] f56809x5d0daf98 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: LINE_GROUPS */
        public static final int f56810x28a2087f = 19;

        /* renamed from: alphabet */
        private final byte[] f56811x7278e673;

        /* renamed from: count */
        private int f56812x5a7510f;

        /* renamed from: do_cr */
        public final boolean f56813x5b514a3;

        /* renamed from: do_newline */
        public final boolean f56814xb0f281e0;

        /* renamed from: do_padding */
        public final boolean f56815x12dc345d;

        /* renamed from: tail */
        private final byte[] f56816x363450;

        /* renamed from: tailLen */
        int f56817xa3d2d3a5;

        public Encoder(int i17, byte[] bArr) {
            this.f56799xc4111901 = bArr;
            this.f56815x12dc345d = (i17 & 1) == 0;
            boolean z17 = (i17 & 2) == 0;
            this.f56814xb0f281e0 = z17;
            this.f56813x5b514a3 = (i17 & 4) != 0;
            this.f56811x7278e673 = (i17 & 8) == 0 ? f56808x7a293216 : f56809x5d0daf98;
            this.f56816x363450 = new byte[2];
            this.f56817xa3d2d3a5 = 0;
            this.f56812x5a7510f = z17 ? 19 : -1;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Coder
        /* renamed from: maxOutputSize */
        public int mo105464x6e311926(int i17) {
            return ((i17 * 8) / 5) + 10;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        @Override // com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Coder
        /* renamed from: process */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo105465xed8d1e6f(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Encoder.mo105465xed8d1e6f(byte[], int, int, boolean):boolean");
        }
    }

    private C26775x762c896f() {
    }

    /* renamed from: decode */
    public static byte[] m105458xb06291ee(java.lang.String str, int i17) {
        return m105459xb06291ee(str.getBytes(), i17);
    }

    /* renamed from: encode */
    public static byte[] m105461xb2963e16(byte[] bArr, int i17) {
        return m105462xb2963e16(bArr, 0, bArr.length, i17);
    }

    /* renamed from: encodeToString */
    public static java.lang.String m105463xa74a7ea2(byte[] bArr, int i17) {
        try {
            return new java.lang.String(m105461xb2963e16(bArr, i17), "US-ASCII");
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    /* renamed from: decode */
    public static byte[] m105459xb06291ee(byte[] bArr, int i17) {
        return m105460xb06291ee(bArr, 0, bArr.length, i17);
    }

    /* renamed from: encode */
    public static byte[] m105462xb2963e16(byte[] bArr, int i17, int i18, int i19) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Encoder encoder = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Encoder(i19, null);
        int i27 = (i18 / 3) * 4;
        if (encoder.f56815x12dc345d) {
            if (i18 % 3 > 0) {
                i27 += 4;
            }
        } else {
            int i28 = i18 % 3;
            if (i28 == 1) {
                i27 += 2;
            } else if (i28 == 2) {
                i27 += 3;
            }
        }
        if (encoder.f56814xb0f281e0 && i18 > 0) {
            i27 += (((i18 - 1) / 57) + 1) * (encoder.f56813x5b514a3 ? 2 : 1);
        }
        encoder.f56799xc4111901 = new byte[i27];
        encoder.mo105465xed8d1e6f(bArr, i17, i18, true);
        return encoder.f56799xc4111901;
    }

    /* renamed from: decode */
    public static byte[] m105460xb06291ee(byte[] bArr, int i17, int i18, int i19) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Decoder decoder = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.Decoder(i19, new byte[(i18 * 3) / 4]);
        if (decoder.mo105465xed8d1e6f(bArr, i17, i18, true)) {
            int i27 = decoder.f297085op;
            byte[] bArr2 = decoder.f56799xc4111901;
            if (i27 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i27];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i27);
            return bArr3;
        }
        throw new java.lang.IllegalArgumentException("bad base-64");
    }
}
