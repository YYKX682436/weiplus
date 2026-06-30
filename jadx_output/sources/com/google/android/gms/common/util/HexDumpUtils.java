package com.google.android.gms.common.util;

/* loaded from: classes5.dex */
public final class HexDumpUtils {
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.String dump(byte[] bArr, int i17, int i18, boolean z17) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i17 < 0 || i18 <= 0 || i17 + i18 > length) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((z17 ? 75 : 57) * ((i18 + 15) / 16));
        int i19 = i18;
        int i27 = 0;
        int i28 = 0;
        while (i19 > 0) {
            if (i27 == 0) {
                if (i18 < 65536) {
                    sb6.append(java.lang.String.format("%04X:", java.lang.Integer.valueOf(i17)));
                } else {
                    sb6.append(java.lang.String.format("%08X:", java.lang.Integer.valueOf(i17)));
                }
                i28 = i17;
            } else if (i27 == 8) {
                sb6.append(" -");
            }
            sb6.append(java.lang.String.format(" %02X", java.lang.Integer.valueOf(bArr[i17] & 255)));
            i19--;
            i27++;
            if (z17 && (i27 == 16 || i19 == 0)) {
                int i29 = 16 - i27;
                if (i29 > 0) {
                    for (int i37 = 0; i37 < i29; i37++) {
                        sb6.append("   ");
                    }
                }
                if (i29 >= 8) {
                    sb6.append("  ");
                }
                sb6.append("  ");
                for (int i38 = 0; i38 < i27; i38++) {
                    char c17 = (char) bArr[i28 + i38];
                    if (c17 < ' ' || c17 > '~') {
                        c17 = '.';
                    }
                    sb6.append(c17);
                }
            }
            if (i27 == 16 || i19 == 0) {
                sb6.append('\n');
                i27 = 0;
            }
            i17++;
        }
        return sb6.toString();
    }
}
