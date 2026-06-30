package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class kb {
    public abstract java.lang.String a(byte[] bArr, int i17, int i18);

    public final java.lang.String b(java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        if ((i17 | i18 | ((byteBuffer.limit() - i17) - i18)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        int i19 = i17 + i18;
        char[] cArr = new char[i18];
        int i27 = 0;
        while (i17 < i19) {
            byte b17 = byteBuffer.get(i17);
            if (!(b17 >= 0)) {
                break;
            }
            i17++;
            cArr[i27] = (char) b17;
            i27++;
        }
        int i28 = i27;
        while (i17 < i19) {
            int i29 = i17 + 1;
            byte b18 = byteBuffer.get(i17);
            if (b18 >= 0) {
                int i37 = i28 + 1;
                cArr[i28] = (char) b18;
                i17 = i29;
                while (true) {
                    i28 = i37;
                    if (i17 >= i19) {
                        break;
                    }
                    byte b19 = byteBuffer.get(i17);
                    if (!(b19 >= 0)) {
                        break;
                    }
                    i17++;
                    i37 = i28 + 1;
                    cArr[i28] = (char) b19;
                }
            } else {
                if (!(b18 < -32)) {
                    if (b18 < -16) {
                        if (i29 >= i19 - 1) {
                            throw com.p176xb6135e39.p283xc50a8b8b.y6.c();
                        }
                        int i38 = i29 + 1;
                        com.p176xb6135e39.p283xc50a8b8b.jb.c(b18, byteBuffer.get(i29), byteBuffer.get(i38), cArr, i28);
                        i17 = i38 + 1;
                        i28++;
                    } else {
                        if (i29 >= i19 - 2) {
                            throw com.p176xb6135e39.p283xc50a8b8b.y6.c();
                        }
                        int i39 = i29 + 1;
                        byte b27 = byteBuffer.get(i29);
                        int i47 = i39 + 1;
                        com.p176xb6135e39.p283xc50a8b8b.jb.a(b18, b27, byteBuffer.get(i39), byteBuffer.get(i47), cArr, i28);
                        i28 = i28 + 1 + 1;
                        i17 = i47 + 1;
                    }
                } else {
                    if (i29 >= i19) {
                        throw com.p176xb6135e39.p283xc50a8b8b.y6.c();
                    }
                    com.p176xb6135e39.p283xc50a8b8b.jb.b(b18, byteBuffer.get(i29), cArr, i28);
                    i17 = i29 + 1;
                    i28++;
                }
            }
        }
        return new java.lang.String(cArr, 0, i28);
    }

    public abstract java.lang.String c(java.nio.ByteBuffer byteBuffer, int i17, int i18);

    public abstract int d(java.lang.CharSequence charSequence, byte[] bArr, int i17, int i18);

    public abstract int e(int i17, byte[] bArr, int i18, int i19);
}
