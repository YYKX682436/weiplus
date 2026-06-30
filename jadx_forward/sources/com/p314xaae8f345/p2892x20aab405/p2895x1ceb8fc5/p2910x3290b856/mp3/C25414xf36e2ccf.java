package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3DecodeBase */
/* loaded from: classes16.dex */
class C25414xf36e2ccf {
    /* renamed from: hasId3v2 */
    public static boolean m94175x726f47a(byte[] bArr, int i17) {
        return bArr != null && i17 >= 3 && bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51;
    }

    /* renamed from: isVBRIVBRHeader */
    public static boolean m94176xd10721e6(byte[] bArr, int i17) {
        return bArr != null && i17 >= 4 && bArr[0] == 86 && bArr[1] == 66 && bArr[2] == 82 && bArr[3] == 73;
    }

    /* renamed from: isXingVBRheader */
    public static boolean m94177xfa5742ff(byte[] bArr, int i17) {
        if (bArr != null && i17 >= 4) {
            byte b17 = bArr[0];
            if (b17 == 88 && bArr[1] == 105 && bArr[2] == 110 && bArr[3] == 103) {
                return true;
            }
            if (b17 == 73 && bArr[1] == 110 && bArr[2] == 102 && bArr[3] == 111) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: readByte */
    public static int m94178xcc4273be(byte[] bArr, int i17) {
        return m94179xcc4273be(bArr, 0, i17);
    }

    /* renamed from: readInt */
    public static int m94181x40655679(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 4 || bArr.length < i18 + i17) {
            return -1;
        }
        return (bArr[i17 + 3] & 255) | ((bArr[i17] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    /* renamed from: readLong */
    public static long m94183xcc46d932(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 4 || bArr.length < i18 + i17) {
            return -1L;
        }
        return (bArr[i17 + 3] & 255) | ((bArr[i17] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    /* renamed from: readShort */
    public static int m94185xbcf3c886(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 2 || bArr.length < i18 + i17) {
            return -1;
        }
        return (bArr[i17 + 1] & 255) | ((bArr[i17] & 255) << 8);
    }

    /* renamed from: readUnsignedInt24 */
    public static int m94187x9da5b286(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 3 || bArr.length < i18 + i17) {
            return -1;
        }
        return (bArr[i17 + 2] & 255) | ((bArr[i17] & 255) << 16) | ((bArr[i17 + 1] & 255) << 8);
    }

    /* renamed from: readByte */
    public static int m94179xcc4273be(byte[] bArr, int i17, int i18) {
        if (bArr == null || i18 < 1 || bArr.length < i18 + i17) {
            return -1;
        }
        return bArr[i17] & 255;
    }

    /* renamed from: readInt */
    public static int m94180x40655679(byte[] bArr, int i17) {
        return m94181x40655679(bArr, 0, i17);
    }

    /* renamed from: readLong */
    public static long m94182xcc46d932(byte[] bArr, int i17) {
        return m94183xcc46d932(bArr, 0, i17);
    }

    /* renamed from: readShort */
    public static int m94184xbcf3c886(byte[] bArr, int i17) {
        return m94185xbcf3c886(bArr, 0, i17);
    }

    /* renamed from: readUnsignedInt24 */
    public static int m94186x9da5b286(byte[] bArr, int i17) {
        return m94187x9da5b286(bArr, 0, i17);
    }
}
