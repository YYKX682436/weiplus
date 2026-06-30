package com.google.protobuf;

/* loaded from: classes16.dex */
public final class nb extends com.google.protobuf.kb {
    public static int f(byte[] bArr, int i17, long j17, int i18) {
        if (i18 == 0) {
            com.google.protobuf.kb kbVar = com.google.protobuf.ob.f45371a;
            if (i17 > -12) {
                return -1;
            }
            return i17;
        }
        if (i18 == 1) {
            return com.google.protobuf.ob.c(i17, com.google.protobuf.ib.h(bArr, j17));
        }
        if (i18 == 2) {
            return com.google.protobuf.ob.d(i17, com.google.protobuf.ib.h(bArr, j17), com.google.protobuf.ib.h(bArr, j17 + 1));
        }
        throw new java.lang.AssertionError();
    }

    @Override // com.google.protobuf.kb
    public java.lang.String a(byte[] bArr, int i17, int i18) {
        if ((i17 | i18 | ((bArr.length - i17) - i18)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        int i19 = i17 + i18;
        char[] cArr = new char[i18];
        int i27 = 0;
        while (i17 < i19) {
            byte h17 = com.google.protobuf.ib.h(bArr, i17);
            if (!(h17 >= 0)) {
                break;
            }
            i17++;
            cArr[i27] = (char) h17;
            i27++;
        }
        int i28 = i27;
        while (i17 < i19) {
            int i29 = i17 + 1;
            byte h18 = com.google.protobuf.ib.h(bArr, i17);
            if (h18 >= 0) {
                int i37 = i28 + 1;
                cArr[i28] = (char) h18;
                i17 = i29;
                while (true) {
                    i28 = i37;
                    if (i17 >= i19) {
                        break;
                    }
                    byte h19 = com.google.protobuf.ib.h(bArr, i17);
                    if (!(h19 >= 0)) {
                        break;
                    }
                    i17++;
                    i37 = i28 + 1;
                    cArr[i28] = (char) h19;
                }
            } else {
                if (!(h18 < -32)) {
                    if (h18 < -16) {
                        if (i29 >= i19 - 1) {
                            throw com.google.protobuf.y6.c();
                        }
                        int i38 = i29 + 1;
                        com.google.protobuf.jb.c(h18, com.google.protobuf.ib.h(bArr, i29), com.google.protobuf.ib.h(bArr, i38), cArr, i28);
                        i17 = i38 + 1;
                        i28++;
                    } else {
                        if (i29 >= i19 - 2) {
                            throw com.google.protobuf.y6.c();
                        }
                        int i39 = i29 + 1;
                        byte h27 = com.google.protobuf.ib.h(bArr, i29);
                        int i47 = i39 + 1;
                        com.google.protobuf.jb.a(h18, h27, com.google.protobuf.ib.h(bArr, i39), com.google.protobuf.ib.h(bArr, i47), cArr, i28);
                        i28 = i28 + 1 + 1;
                        i17 = i47 + 1;
                    }
                } else {
                    if (i29 >= i19) {
                        throw com.google.protobuf.y6.c();
                    }
                    com.google.protobuf.jb.b(h18, com.google.protobuf.ib.h(bArr, i29), cArr, i28);
                    i17 = i29 + 1;
                    i28++;
                }
            }
        }
        return new java.lang.String(cArr, 0, i28);
    }

    @Override // com.google.protobuf.kb
    public java.lang.String c(java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        if ((i17 | i18 | ((byteBuffer.limit() - i17) - i18)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        long j17 = com.google.protobuf.ib.f45205d.j(byteBuffer, com.google.protobuf.ib.f45209h) + i17;
        long j18 = i18 + j17;
        char[] cArr = new char[i18];
        int i19 = 0;
        while (j17 < j18) {
            byte g17 = com.google.protobuf.ib.g(j17);
            if (!(g17 >= 0)) {
                break;
            }
            j17++;
            cArr[i19] = (char) g17;
            i19++;
        }
        int i27 = i19;
        while (j17 < j18) {
            long j19 = j17 + 1;
            byte g18 = com.google.protobuf.ib.g(j17);
            if (g18 >= 0) {
                cArr[i27] = (char) g18;
                i27++;
                j17 = j19;
                while (j17 < j18) {
                    byte g19 = com.google.protobuf.ib.g(j17);
                    if (!(g19 >= 0)) {
                        break;
                    }
                    j17++;
                    cArr[i27] = (char) g19;
                    i27++;
                }
            } else {
                if (!(g18 < -32)) {
                    if (g18 < -16) {
                        if (j19 >= j18 - 1) {
                            throw com.google.protobuf.y6.c();
                        }
                        long j27 = j19 + 1;
                        com.google.protobuf.jb.c(g18, com.google.protobuf.ib.g(j19), com.google.protobuf.ib.g(j27), cArr, i27);
                        j17 = j27 + 1;
                        i27++;
                    } else {
                        if (j19 >= j18 - 2) {
                            throw com.google.protobuf.y6.c();
                        }
                        long j28 = j19 + 1;
                        long j29 = j28 + 1;
                        com.google.protobuf.jb.a(g18, com.google.protobuf.ib.g(j19), com.google.protobuf.ib.g(j28), com.google.protobuf.ib.g(j29), cArr, i27);
                        i27 = i27 + 1 + 1;
                        j17 = j29 + 1;
                    }
                } else {
                    if (j19 >= j18) {
                        throw com.google.protobuf.y6.c();
                    }
                    com.google.protobuf.jb.b(g18, com.google.protobuf.ib.g(j19), cArr, i27);
                    i27++;
                    j17 = j19 + 1;
                }
            }
        }
        return new java.lang.String(cArr, 0, i27);
    }

    @Override // com.google.protobuf.kb
    public int d(java.lang.CharSequence charSequence, byte[] bArr, int i17, int i18) {
        char c17;
        long j17;
        long j18;
        long j19;
        char c18;
        int i19;
        char charAt;
        long j27 = i17;
        long j28 = i18 + j27;
        int length = charSequence.length();
        if (length > i18 || bArr.length - i18 < i17) {
            char charAt2 = charSequence.charAt(length - 1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
            sb6.append("Failed writing ");
            sb6.append(charAt2);
            sb6.append(" at index ");
            sb6.append(i17 + i18);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb6.toString());
        }
        int i27 = 0;
        while (true) {
            c17 = 128;
            j17 = 1;
            if (i27 >= length || (charAt = charSequence.charAt(i27)) >= 128) {
                break;
            }
            com.google.protobuf.ib.r(bArr, j27, (byte) charAt);
            i27++;
            j27 = 1 + j27;
        }
        if (i27 == length) {
            return (int) j27;
        }
        while (i27 < length) {
            char charAt3 = charSequence.charAt(i27);
            if (charAt3 < c17 && j27 < j28) {
                long j29 = j27 + j17;
                com.google.protobuf.ib.r(bArr, j27, (byte) charAt3);
                j19 = j17;
                j18 = j29;
                c18 = c17;
            } else if (charAt3 < 2048 && j27 <= j28 - 2) {
                long j37 = j27 + j17;
                com.google.protobuf.ib.r(bArr, j27, (byte) ((charAt3 >>> 6) | com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT));
                long j38 = j37 + j17;
                com.google.protobuf.ib.r(bArr, j37, (byte) ((charAt3 & '?') | 128));
                long j39 = j17;
                c18 = 128;
                j18 = j38;
                j19 = j39;
            } else {
                if ((charAt3 >= 55296 && 57343 >= charAt3) || j27 > j28 - 3) {
                    if (j27 > j28 - 4) {
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i19 = i27 + 1) == length || !java.lang.Character.isSurrogatePair(charAt3, charSequence.charAt(i19)))) {
                            throw new com.google.protobuf.mb(i27, length);
                        }
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(46);
                        sb7.append("Failed writing ");
                        sb7.append(charAt3);
                        sb7.append(" at index ");
                        sb7.append(j27);
                        throw new java.lang.ArrayIndexOutOfBoundsException(sb7.toString());
                    }
                    int i28 = i27 + 1;
                    if (i28 != length) {
                        char charAt4 = charSequence.charAt(i28);
                        if (java.lang.Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = java.lang.Character.toCodePoint(charAt3, charAt4);
                            long j47 = j27 + 1;
                            com.google.protobuf.ib.r(bArr, j27, (byte) ((codePoint >>> 18) | 240));
                            long j48 = j47 + 1;
                            c18 = 128;
                            com.google.protobuf.ib.r(bArr, j47, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j49 = j48 + 1;
                            com.google.protobuf.ib.r(bArr, j48, (byte) (((codePoint >>> 6) & 63) | 128));
                            j19 = 1;
                            j18 = j49 + 1;
                            com.google.protobuf.ib.r(bArr, j49, (byte) ((codePoint & 63) | 128));
                            i27 = i28;
                        } else {
                            i27 = i28;
                        }
                    }
                    throw new com.google.protobuf.mb(i27 - 1, length);
                }
                long j57 = j27 + j17;
                com.google.protobuf.ib.r(bArr, j27, (byte) ((charAt3 >>> '\f') | 480));
                long j58 = j57 + j17;
                com.google.protobuf.ib.r(bArr, j57, (byte) (((charAt3 >>> 6) & 63) | 128));
                com.google.protobuf.ib.r(bArr, j58, (byte) ((charAt3 & '?') | 128));
                j18 = j58 + 1;
                j19 = 1;
                c18 = 128;
            }
            i27++;
            c17 = c18;
            long j59 = j19;
            j27 = j18;
            j17 = j59;
        }
        return (int) j27;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (com.google.protobuf.ib.h(r23, r4) > (-65)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (com.google.protobuf.ib.h(r23, r4) > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        if (com.google.protobuf.ib.h(r23, r4) > (-65)) goto L53;
     */
    @Override // com.google.protobuf.kb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(int r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nb.e(int, byte[], int, int):int");
    }
}
