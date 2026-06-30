package com.google.protobuf;

/* loaded from: classes16.dex */
public final class lb extends com.google.protobuf.kb {
    @Override // com.google.protobuf.kb
    public java.lang.String a(byte[] bArr, int i17, int i18) {
        if ((i17 | i18 | ((bArr.length - i17) - i18)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        int i19 = i17 + i18;
        char[] cArr = new char[i18];
        int i27 = 0;
        while (i17 < i19) {
            byte b17 = bArr[i17];
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
            byte b18 = bArr[i17];
            if (b18 >= 0) {
                int i37 = i28 + 1;
                cArr[i28] = (char) b18;
                i17 = i29;
                while (true) {
                    i28 = i37;
                    if (i17 >= i19) {
                        break;
                    }
                    byte b19 = bArr[i17];
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
                            throw com.google.protobuf.y6.c();
                        }
                        int i38 = i29 + 1;
                        com.google.protobuf.jb.c(b18, bArr[i29], bArr[i38], cArr, i28);
                        i17 = i38 + 1;
                        i28++;
                    } else {
                        if (i29 >= i19 - 2) {
                            throw com.google.protobuf.y6.c();
                        }
                        int i39 = i29 + 1;
                        byte b27 = bArr[i29];
                        int i47 = i39 + 1;
                        com.google.protobuf.jb.a(b18, b27, bArr[i39], bArr[i47], cArr, i28);
                        i28 = i28 + 1 + 1;
                        i17 = i47 + 1;
                    }
                } else {
                    if (i29 >= i19) {
                        throw com.google.protobuf.y6.c();
                    }
                    com.google.protobuf.jb.b(b18, bArr[i29], cArr, i28);
                    i17 = i29 + 1;
                    i28++;
                }
            }
        }
        return new java.lang.String(cArr, 0, i28);
    }

    @Override // com.google.protobuf.kb
    public java.lang.String c(java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        return b(byteBuffer, i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.protobuf.kb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.lb.d(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r13[r14] > (-65)) goto L50;
     */
    @Override // com.google.protobuf.kb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.lb.e(int, byte[], int, int):int");
    }
}
