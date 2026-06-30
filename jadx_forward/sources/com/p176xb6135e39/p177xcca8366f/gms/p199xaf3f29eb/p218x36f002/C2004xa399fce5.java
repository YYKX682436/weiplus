package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.MurmurHash3 */
/* loaded from: classes5.dex */
public class C2004xa399fce5 {
    private C2004xa399fce5() {
    }

    /* renamed from: murmurhash3_x86_32 */
    public static int m18592x5cb53a22(byte[] bArr, int i17, int i18, int i19) {
        int i27;
        int i28 = i17;
        while (true) {
            i27 = (i18 & (-4)) + i17;
            if (i28 >= i27) {
                break;
            }
            int i29 = ((bArr[i28] & 255) | ((bArr[i28 + 1] & 255) << 8) | ((bArr[i28 + 2] & 255) << 16) | (bArr[i28 + 3] << 24)) * (-862048943);
            int i37 = i19 ^ (((i29 >>> 17) | (i29 << 15)) * 461845907);
            i19 = (((i37 >>> 19) | (i37 << 13)) * 5) - 430675100;
            i28 += 4;
        }
        int i38 = i18 & 3;
        if (i38 != 1) {
            if (i38 != 2) {
                r0 = i38 == 3 ? (bArr[i27 + 2] & 255) << 16 : 0;
                int i39 = i19 ^ i18;
                int i47 = (i39 ^ (i39 >>> 16)) * (-2048144789);
                int i48 = (i47 ^ (i47 >>> 13)) * (-1028477387);
                return i48 ^ (i48 >>> 16);
            }
            r0 |= (bArr[i27 + 1] & 255) << 8;
        }
        int i49 = ((bArr[i27] & 255) | r0) * (-862048943);
        i19 ^= ((i49 >>> 17) | (i49 << 15)) * 461845907;
        int i392 = i19 ^ i18;
        int i472 = (i392 ^ (i392 >>> 16)) * (-2048144789);
        int i482 = (i472 ^ (i472 >>> 13)) * (-1028477387);
        return i482 ^ (i482 >>> 16);
    }
}
