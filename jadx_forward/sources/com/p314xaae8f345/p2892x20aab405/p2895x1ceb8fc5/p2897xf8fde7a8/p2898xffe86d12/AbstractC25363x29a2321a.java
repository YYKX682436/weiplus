package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode */
/* loaded from: classes16.dex */
abstract class AbstractC25363x29a2321a extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0 {

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode$CharsetRecog_UTF_16_BE */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_UTF_16_BE extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a {
        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "UTF-16BE";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            byte[] bArr = c25359xc8558912.f45759x33ea2708;
            int min = java.lang.Math.min(bArr.length, 30);
            int i17 = 10;
            int i18 = 0;
            while (true) {
                if (i18 >= min - 1) {
                    break;
                }
                int m93928xfa5ec48b = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.m93928xfa5ec48b(bArr[i18], bArr[i18 + 1]);
                if (i18 != 0 || m93928xfa5ec48b != 65279) {
                    i17 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.m93927xae5f8b79(m93928xfa5ec48b, i17);
                    if (i17 == 0 || i17 == 100) {
                        break;
                    }
                    i18 += 2;
                } else {
                    i17 = 100;
                    break;
                }
            }
            int i19 = (min >= 4 || i17 >= 100) ? i17 : 0;
            if (i19 > 0) {
                return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, i19);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode$CharsetRecog_UTF_16_LE */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_UTF_16_LE extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a {
        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "UTF-16LE";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            byte[] bArr = c25359xc8558912.f45759x33ea2708;
            int min = java.lang.Math.min(bArr.length, 30);
            int i17 = 10;
            int i18 = 0;
            while (true) {
                if (i18 >= min - 1) {
                    break;
                }
                int m93928xfa5ec48b = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.m93928xfa5ec48b(bArr[i18 + 1], bArr[i18]);
                if (i18 != 0 || m93928xfa5ec48b != 65279) {
                    i17 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.m93927xae5f8b79(m93928xfa5ec48b, i17);
                    if (i17 == 0 || i17 == 100) {
                        break;
                    }
                    i18 += 2;
                } else {
                    i17 = 100;
                    break;
                }
            }
            int i19 = (min >= 4 || i17 >= 100) ? i17 : 0;
            if (i19 > 0) {
                return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, i19);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode$CharsetRecog_UTF_32 */
    /* loaded from: classes16.dex */
    public static abstract class CharsetRecog_UTF_32 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a {
        /* renamed from: getChar */
        public abstract int mo93929xfb7dfbcc(byte[] bArr, int i17);

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public abstract java.lang.String mo93925xfb82e301();

        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 r11) {
            /*
                r10 = this;
                byte[] r0 = r11.f45759x33ea2708
                int r1 = r11.f45760x4df95368
                int r1 = r1 / 4
                int r1 = r1 * 4
                r2 = 0
                if (r1 != 0) goto Lc
                return r2
            Lc:
                r3 = 0
                int r4 = r10.mo93929xfb7dfbcc(r0, r3)
                r5 = 65279(0xfeff, float:9.1475E-41)
                if (r4 != r5) goto L18
                r4 = 1
                goto L19
            L18:
                r4 = r3
            L19:
                r5 = r3
                r6 = r5
                r7 = r6
            L1c:
                if (r5 >= r1) goto L3c
                int r8 = r10.mo93929xfb7dfbcc(r0, r5)
                if (r8 < 0) goto L37
                r9 = 1114111(0x10ffff, float:1.561202E-39)
                if (r8 >= r9) goto L37
                r9 = 55296(0xd800, float:7.7486E-41)
                if (r8 < r9) goto L34
                r9 = 57343(0xdfff, float:8.0355E-41)
                if (r8 > r9) goto L34
                goto L37
            L34:
                int r7 = r7 + 1
                goto L39
            L37:
                int r6 = r6 + 1
            L39:
                int r5 = r5 + 4
                goto L1c
            L3c:
                r0 = 100
                if (r4 == 0) goto L44
                if (r6 != 0) goto L44
            L42:
                r3 = r0
                goto L5f
            L44:
                r1 = 80
                if (r4 == 0) goto L4e
                int r4 = r6 * 10
                if (r7 <= r4) goto L4e
            L4c:
                r3 = r1
                goto L5f
            L4e:
                r4 = 3
                if (r7 <= r4) goto L54
                if (r6 != 0) goto L54
                goto L42
            L54:
                if (r7 <= 0) goto L59
                if (r6 != 0) goto L59
                goto L4c
            L59:
                int r6 = r6 * 10
                if (r7 <= r6) goto L5f
                r3 = 25
            L5f:
                if (r3 != 0) goto L62
                goto L67
            L62:
                com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch r2 = new com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch
                r2.<init>(r11, r10, r3)
            L67:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32.mo93926x62dd9c5(com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetDetector):com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch");
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode$CharsetRecog_UTF_32_BE */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_UTF_32_BE extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32 {
        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32
        /* renamed from: getChar */
        public int mo93929xfb7dfbcc(byte[] bArr, int i17) {
            return (bArr[i17 + 3] & 255) | ((bArr[i17 + 0] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "UTF-32BE";
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode$CharsetRecog_UTF_32_LE */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_UTF_32_LE extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32 {
        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32
        /* renamed from: getChar */
        public int mo93929xfb7dfbcc(byte[] bArr, int i17) {
            return (bArr[i17 + 0] & 255) | ((bArr[i17 + 3] & 255) << 24) | ((bArr[i17 + 2] & 255) << 16) | ((bArr[i17 + 1] & 255) << 8);
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a.CharsetRecog_UTF_32, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25363x29a2321a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "UTF-32LE";
        }
    }

    /* renamed from: adjustConfidence */
    public static int m93927xae5f8b79(int i17, int i18) {
        if (i17 == 0) {
            i18 -= 10;
        } else if ((i17 >= 32 && i17 <= 255) || i17 == 10) {
            i18 += 10;
        }
        if (i18 < 0) {
            return 0;
        }
        if (i18 > 100) {
            return 100;
        }
        return i18;
    }

    /* renamed from: codeUnit16FromBytes */
    public static int m93928xfa5ec48b(byte b17, byte b18) {
        return ((b17 & 255) << 8) | (b18 & 255);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
    /* renamed from: getName */
    public abstract java.lang.String mo93925xfb82e301();

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
    /* renamed from: match */
    public abstract com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912);
}
