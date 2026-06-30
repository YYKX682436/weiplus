package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes5.dex */
public abstract class r0 {
    public static byte[] a(byte[] bArr, java.lang.String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr2 = new byte[256];
        for (int i17 = 0; i17 < 256; i17++) {
            bArr2[i17] = (byte) i17;
        }
        if (bytes == null || bytes.length == 0) {
            bArr2 = null;
        } else {
            int i18 = 0;
            int i19 = 0;
            for (int i27 = 0; i27 < 256; i27++) {
                int i28 = bytes[i18] & 255;
                byte b17 = bArr2[i27];
                i19 = (i28 + (b17 & 255) + i19) & 255;
                bArr2[i27] = bArr2[i19];
                bArr2[i19] = b17;
                i18 = (i18 + 1) % bytes.length;
            }
        }
        byte[] bArr3 = new byte[bArr.length];
        if (bArr2 != null) {
            int i29 = 0;
            int i37 = 0;
            for (int i38 = 0; i38 < bArr.length; i38++) {
                i29 = (i29 + 1) & 255;
                byte b18 = bArr2[i29];
                i37 = ((b18 & 255) + i37) & 255;
                bArr2[i29] = bArr2[i37];
                bArr2[i37] = b18;
                bArr3[i38] = (byte) (bArr2[((bArr2[i29] & 255) + (b18 & 255)) & 255] ^ bArr[i38]);
            }
        }
        return bArr3;
    }
}
