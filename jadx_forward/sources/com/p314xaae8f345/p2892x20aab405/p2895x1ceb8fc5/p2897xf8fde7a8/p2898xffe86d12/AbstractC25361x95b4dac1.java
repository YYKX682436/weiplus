package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12;

/* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022 */
/* loaded from: classes16.dex */
abstract class AbstractC25361x95b4dac1 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0 {

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022$CharsetRecog_2022CN */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_2022CN extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25361x95b4dac1 {

        /* renamed from: escapeSequences */
        private byte[][] f45770xcb462151 = {new byte[]{27, 36, 41, 65}, new byte[]{27, 36, 41, 71}, new byte[]{27, 36, 42, 72}, new byte[]{27, 36, 41, 69}, new byte[]{27, 36, 43, 73}, new byte[]{27, 36, 43, 74}, new byte[]{27, 36, 43, 75}, new byte[]{27, 36, 43, 76}, new byte[]{27, 36, 43, 77}, new byte[]{27, 78}, new byte[]{27, 79}};

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "ISO-2022-CN";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            int m93924x62dd9c5 = m93924x62dd9c5(c25359xc8558912.f45756x1b01dbc7, c25359xc8558912.f45757x332ce471, this.f45770xcb462151);
            if (m93924x62dd9c5 == 0) {
                return null;
            }
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, m93924x62dd9c5);
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022$CharsetRecog_2022JP */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_2022JP extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25361x95b4dac1 {

        /* renamed from: escapeSequences */
        private byte[][] f45771xcb462151 = {new byte[]{27, 36, 40, 67}, new byte[]{27, 36, 40, 68}, new byte[]{27, 36, 64}, new byte[]{27, 36, 65}, new byte[]{27, 36, 66}, new byte[]{27, 38, 64}, new byte[]{27, 40, 66}, new byte[]{27, 40, 72}, new byte[]{27, 40, 73}, new byte[]{27, 40, 74}, new byte[]{27, 46, 65}, new byte[]{27, 46, 70}};

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "ISO-2022-JP";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            int m93924x62dd9c5 = m93924x62dd9c5(c25359xc8558912.f45756x1b01dbc7, c25359xc8558912.f45757x332ce471, this.f45771xcb462151);
            if (m93924x62dd9c5 == 0) {
                return null;
            }
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, m93924x62dd9c5);
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022$CharsetRecog_2022KR */
    /* loaded from: classes16.dex */
    public static class CharsetRecog_2022KR extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25361x95b4dac1 {

        /* renamed from: escapeSequences */
        private byte[][] f45772xcb462151 = {new byte[]{27, 36, 41, 67}};

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: getName */
        public java.lang.String mo93925xfb82e301() {
            return "ISO-2022-KR";
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.AbstractC25366x96a257f0
        /* renamed from: match */
        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9 mo93926x62dd9c5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25359xc8558912 c25359xc8558912) {
            int m93924x62dd9c5 = m93924x62dd9c5(c25359xc8558912.f45756x1b01dbc7, c25359xc8558912.f45757x332ce471, this.f45772xcb462151);
            if (m93924x62dd9c5 == 0) {
                return null;
            }
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.p2898xffe86d12.C25360x6a0dcbf9(c25359xc8558912, this, m93924x62dd9c5);
        }
    }

    /* renamed from: match */
    public int m93924x62dd9c5(byte[] bArr, int i17, byte[][] bArr2) {
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i18 < i17) {
            if (bArr[i18] == 27) {
                for (byte[] bArr3 : bArr2) {
                    if (i17 - i18 >= bArr3.length) {
                        for (int i29 = 1; i29 < bArr3.length; i29++) {
                            if (bArr3[i29] != bArr[i18 + i29]) {
                                break;
                            }
                        }
                        i19++;
                        i18 += bArr3.length - 1;
                        break;
                    }
                }
                i27++;
            }
            byte b17 = bArr[i18];
            if (b17 == 14 || b17 == 15) {
                i28++;
            }
            i18++;
        }
        if (i19 == 0) {
            return 0;
        }
        int i37 = ((i19 * 100) - (i27 * 100)) / (i27 + i19);
        int i38 = i19 + i28;
        if (i38 < 5) {
            i37 -= (5 - i38) * 10;
        }
        if (i37 < 0) {
            return 0;
        }
        return i37;
    }
}
