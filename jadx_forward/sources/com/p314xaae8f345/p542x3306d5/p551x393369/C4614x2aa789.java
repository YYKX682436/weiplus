package com.p314xaae8f345.p542x3306d5.p551x393369;

/* renamed from: com.tencent.mars.zstd.Zstd */
/* loaded from: classes13.dex */
public class C4614x2aa789 {
    /* renamed from: compress */
    public static native long m40624xdc47eb62(byte[] bArr, byte[] bArr2, int i17);

    /* renamed from: compress */
    public static byte[] m40629xdc47eb62(byte[] bArr) {
        return m40630xdc47eb62(bArr, 3);
    }

    /* renamed from: compressBound */
    public static native long m40632x66042b3c(long j17);

    /* renamed from: compressByteArray */
    public static native long m40633xee1668ef(byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27, int i28);

    /* renamed from: compressDirectByteBuffer */
    public static native long m40634x9b058fb3(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, int i28);

    /* renamed from: compressDirectByteBufferFastDict */
    public static native long m40635xe96f5b05(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61);

    /* renamed from: compressDirectByteBufferUsingDict */
    public static native long m40636x28f4c3e7(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, byte[] bArr, int i28);

    /* renamed from: compressFastDict */
    public static native long m40637x76ee97b4(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61);

    /* renamed from: compressUsingDict */
    public static native long m40638x4b5d1d18(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, byte[] bArr3, int i27);

    @java.lang.Deprecated
    /* renamed from: compressUsingDict */
    public static long m40639x4b5d1d18(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17) {
        return m40638x4b5d1d18(bArr, 0, bArr2, 0, bArr2.length, bArr3, i17);
    }

    /* renamed from: decompress */
    public static native long m40644xc7f7e6e3(byte[] bArr, byte[] bArr2);

    /* renamed from: decompress */
    public static byte[] m40649xc7f7e6e3(byte[] bArr, int i17) {
        byte[] bArr2 = new byte[i17];
        long m40644xc7f7e6e3 = m40644xc7f7e6e3(bArr2, bArr);
        if (m40663x7aad7efe(m40644xc7f7e6e3)) {
            throw new java.lang.RuntimeException(m40662x130eedfd(m40644xc7f7e6e3));
        }
        return m40644xc7f7e6e3 != ((long) i17) ? java.util.Arrays.copyOfRange(bArr2, 0, (int) m40644xc7f7e6e3) : bArr2;
    }

    /* renamed from: decompressByteArray */
    public static native long m40652xd232ce8e(byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27);

    /* renamed from: decompressDirectByteBuffer */
    public static native long m40653x7af86934(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27);

    /* renamed from: decompressDirectByteBufferFastDict */
    public static native long m40654x6ff52386(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322);

    /* renamed from: decompressDirectByteBufferUsingDict */
    public static native long m40655x73280b86(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, byte[] bArr);

    /* renamed from: decompressFastDict */
    public static native long m40656x12ef8235(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322);

    /* renamed from: decompressUsingDict */
    public static native long m40657x2f7982b7(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, byte[] bArr3);

    @java.lang.Deprecated
    /* renamed from: decompressUsingDict */
    public static long m40658x2f7982b7(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return m40657x2f7982b7(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    /* renamed from: decompressedDirectByteBufferSize */
    public static native long m40659x7da3db4(java.nio.ByteBuffer byteBuffer, int i17, int i18);

    /* renamed from: decompressedSize */
    public static long m40660x261be9e3(java.nio.ByteBuffer byteBuffer) {
        return m40659x7da3db4(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    /* renamed from: decompressedSize */
    public static native long m40661x261be9e3(byte[] bArr);

    /* renamed from: getErrorName */
    public static native java.lang.String m40662x130eedfd(long j17);

    /* renamed from: isError */
    public static native boolean m40663x7aad7efe(long j17);

    /* renamed from: trainFromBuffer */
    public static long m40664xa86f94b2(byte[][] bArr, byte[] bArr2) {
        return m40665xa86f94b2(bArr, bArr2, false);
    }

    /* renamed from: trainFromBuffer */
    public static native long m40665xa86f94b2(byte[][] bArr, byte[] bArr2, boolean z17);

    /* renamed from: trainFromBufferDirect */
    public static long m40666xb58c4f3b(java.nio.ByteBuffer byteBuffer, int[] iArr, java.nio.ByteBuffer byteBuffer2) {
        return m40667xb58c4f3b(byteBuffer, iArr, byteBuffer2, false);
    }

    /* renamed from: trainFromBufferDirect */
    public static native long m40667xb58c4f3b(java.nio.ByteBuffer byteBuffer, int[] iArr, java.nio.ByteBuffer byteBuffer2, boolean z17);

    /* renamed from: compress */
    public static byte[] m40630xdc47eb62(byte[] bArr, int i17) {
        long m40632x66042b3c = m40632x66042b3c(bArr.length);
        if (m40632x66042b3c <= 2147483647L) {
            byte[] bArr2 = new byte[(int) m40632x66042b3c];
            long m40624xdc47eb62 = m40624xdc47eb62(bArr2, bArr, i17);
            if (!m40663x7aad7efe(m40624xdc47eb62)) {
                return java.util.Arrays.copyOfRange(bArr2, 0, (int) m40624xdc47eb62);
            }
            throw new java.lang.RuntimeException(m40662x130eedfd(m40624xdc47eb62));
        }
        throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
    }

    /* renamed from: compressUsingDict */
    public static byte[] m40640x4b5d1d18(byte[] bArr, byte[] bArr2, int i17) {
        long m40632x66042b3c = m40632x66042b3c(bArr.length);
        if (m40632x66042b3c <= 2147483647L) {
            byte[] bArr3 = new byte[(int) m40632x66042b3c];
            long m40638x4b5d1d18 = m40638x4b5d1d18(bArr3, 0, bArr, 0, bArr.length, bArr2, i17);
            if (!m40663x7aad7efe(m40638x4b5d1d18)) {
                return java.util.Arrays.copyOfRange(bArr3, 0, (int) m40638x4b5d1d18);
            }
            throw new java.lang.RuntimeException(m40662x130eedfd(m40638x4b5d1d18));
        }
        throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
    }

    /* renamed from: decompress */
    public static int m40641xc7f7e6e3(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long m40653x7af86934 = m40653x7af86934(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
                if (!m40663x7aad7efe(m40653x7af86934)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i17 = (int) m40653x7af86934;
                    byteBuffer.position(byteBuffer.position() + i17);
                    return i17;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40653x7af86934));
            }
            throw new java.lang.IllegalArgumentException("dstBuf must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    /* renamed from: compress */
    public static int m40621xdc47eb62(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long m40634x9b058fb3 = m40634x9b058fb3(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), i17);
                if (!m40663x7aad7efe(m40634x9b058fb3)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i18 = (int) m40634x9b058fb3;
                    byteBuffer.position(byteBuffer.position() + i18);
                    return i18;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40634x9b058fb3));
            }
            throw new java.lang.IllegalArgumentException("dstBuf must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    /* renamed from: decompress */
    public static java.nio.ByteBuffer m40646xc7f7e6e3(java.nio.ByteBuffer byteBuffer, int i17) {
        if (byteBuffer.isDirect()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            long m40653x7af86934 = m40653x7af86934(allocateDirect, 0, i17, byteBuffer, byteBuffer.position(), byteBuffer.limit());
            if (!m40663x7aad7efe(m40653x7af86934)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new java.lang.RuntimeException(m40662x130eedfd(m40653x7af86934));
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    /* renamed from: compress */
    public static java.nio.ByteBuffer m40626xdc47eb62(java.nio.ByteBuffer byteBuffer, int i17) {
        if (byteBuffer.isDirect()) {
            long m40632x66042b3c = m40632x66042b3c(byteBuffer.limit() - byteBuffer.position());
            if (m40632x66042b3c <= 2147483647L) {
                int i18 = (int) m40632x66042b3c;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
                long m40634x9b058fb3 = m40634x9b058fb3(allocateDirect, 0, i18, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), i17);
                if (!m40663x7aad7efe(m40634x9b058fb3)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) m40634x9b058fb3);
                    return allocateDirect;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40634x9b058fb3));
            }
            throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    /* renamed from: decompress */
    public static byte[] m40650xc7f7e6e3(byte[] bArr, com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322, int i17) {
        byte[] bArr2 = new byte[i17];
        long m40656x12ef8235 = m40656x12ef8235(bArr2, 0, bArr, 0, bArr.length, c4616x2a2b3322);
        if (m40663x7aad7efe(m40656x12ef8235)) {
            throw new java.lang.RuntimeException(m40662x130eedfd(m40656x12ef8235));
        }
        return m40656x12ef8235 != ((long) i17) ? java.util.Arrays.copyOfRange(bArr2, 0, (int) m40656x12ef8235) : bArr2;
    }

    /* renamed from: decompress */
    public static long m40645xc7f7e6e3(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return m40657x2f7982b7(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    /* renamed from: decompress */
    public static byte[] m40651xc7f7e6e3(byte[] bArr, byte[] bArr2, int i17) {
        byte[] bArr3 = new byte[i17];
        long m40657x2f7982b7 = m40657x2f7982b7(bArr3, 0, bArr, 0, bArr.length, bArr2);
        if (m40663x7aad7efe(m40657x2f7982b7)) {
            throw new java.lang.RuntimeException(m40662x130eedfd(m40657x2f7982b7));
        }
        return m40657x2f7982b7 != ((long) i17) ? java.util.Arrays.copyOfRange(bArr3, 0, (int) m40657x2f7982b7) : bArr3;
    }

    /* renamed from: compress */
    public static byte[] m40631xdc47eb62(byte[] bArr, com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61) {
        long m40632x66042b3c = m40632x66042b3c(bArr.length);
        if (m40632x66042b3c <= 2147483647L) {
            byte[] bArr2 = new byte[(int) m40632x66042b3c];
            long m40637x76ee97b4 = m40637x76ee97b4(bArr2, 0, bArr, 0, bArr.length, c4615xd30f3b61);
            if (!m40663x7aad7efe(m40637x76ee97b4)) {
                return java.util.Arrays.copyOfRange(bArr2, 0, (int) m40637x76ee97b4);
            }
            throw new java.lang.RuntimeException(m40662x130eedfd(m40637x76ee97b4));
        }
        throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
    }

    /* renamed from: decompress */
    public static int m40643xc7f7e6e3(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, byte[] bArr) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long m40655x73280b86 = m40655x73280b86(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), bArr);
                if (!m40663x7aad7efe(m40655x73280b86)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i17 = (int) m40655x73280b86;
                    byteBuffer.position(byteBuffer.position() + i17);
                    return i17;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40655x73280b86));
            }
            throw new java.lang.IllegalArgumentException("dstBuff must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuff must be a direct buffer");
    }

    /* renamed from: compress */
    public static long m40625xdc47eb62(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17) {
        return m40638x4b5d1d18(bArr, 0, bArr2, 0, bArr2.length, bArr3, i17);
    }

    /* renamed from: compress */
    public static int m40623xdc47eb62(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, byte[] bArr, int i17) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long m40636x28f4c3e7 = m40636x28f4c3e7(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), bArr, i17);
                if (!m40663x7aad7efe(m40636x28f4c3e7)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i18 = (int) m40636x28f4c3e7;
                    byteBuffer.limit(i18);
                    return i18;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40636x28f4c3e7));
            }
            throw new java.lang.IllegalArgumentException("dstBuf must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    /* renamed from: decompress */
    public static java.nio.ByteBuffer m40648xc7f7e6e3(java.nio.ByteBuffer byteBuffer, byte[] bArr, int i17) {
        if (byteBuffer.isDirect()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            long m40655x73280b86 = m40655x73280b86(allocateDirect, 0, i17, byteBuffer, byteBuffer.position(), byteBuffer.limit(), bArr);
            if (!m40663x7aad7efe(m40655x73280b86)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new java.lang.RuntimeException(m40662x130eedfd(m40655x73280b86));
        }
        throw new java.lang.IllegalArgumentException("srcBuff must be a direct buffer");
    }

    /* renamed from: compress */
    public static java.nio.ByteBuffer m40628xdc47eb62(java.nio.ByteBuffer byteBuffer, byte[] bArr, int i17) {
        if (byteBuffer.isDirect()) {
            long m40632x66042b3c = m40632x66042b3c(byteBuffer.limit() - byteBuffer.position());
            if (m40632x66042b3c <= 2147483647L) {
                int i18 = (int) m40632x66042b3c;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
                long m40636x28f4c3e7 = m40636x28f4c3e7(allocateDirect, 0, i18, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), bArr, i17);
                if (!m40663x7aad7efe(m40636x28f4c3e7)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) m40636x28f4c3e7);
                    return allocateDirect;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40636x28f4c3e7));
            }
            throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    /* renamed from: decompress */
    public static int m40642xc7f7e6e3(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long m40654x6ff52386 = m40654x6ff52386(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), c4616x2a2b3322);
                if (!m40663x7aad7efe(m40654x6ff52386)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i17 = (int) m40654x6ff52386;
                    byteBuffer.position(byteBuffer.position() + i17);
                    return i17;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40654x6ff52386));
            }
            throw new java.lang.IllegalArgumentException("dstBuff must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuff must be a direct buffer");
    }

    /* renamed from: compress */
    public static int m40622xdc47eb62(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long m40635xe96f5b05 = m40635xe96f5b05(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), c4615xd30f3b61);
                if (!m40663x7aad7efe(m40635xe96f5b05)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i17 = (int) m40635xe96f5b05;
                    byteBuffer.limit(i17);
                    return i17;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40635xe96f5b05));
            }
            throw new java.lang.IllegalArgumentException("dstBuf must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    /* renamed from: decompress */
    public static java.nio.ByteBuffer m40647xc7f7e6e3(java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p542x3306d5.p551x393369.C4616x2a2b3322 c4616x2a2b3322, int i17) {
        if (byteBuffer.isDirect()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            long m40654x6ff52386 = m40654x6ff52386(allocateDirect, 0, i17, byteBuffer, byteBuffer.position(), byteBuffer.limit(), c4616x2a2b3322);
            if (!m40663x7aad7efe(m40654x6ff52386)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new java.lang.RuntimeException(m40662x130eedfd(m40654x6ff52386));
        }
        throw new java.lang.IllegalArgumentException("srcBuff must be a direct buffer");
    }

    /* renamed from: compress */
    public static java.nio.ByteBuffer m40627xdc47eb62(java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p542x3306d5.p551x393369.C4615xd30f3b61 c4615xd30f3b61) {
        if (byteBuffer.isDirect()) {
            long m40632x66042b3c = m40632x66042b3c(byteBuffer.limit() - byteBuffer.position());
            if (m40632x66042b3c <= 2147483647L) {
                int i17 = (int) m40632x66042b3c;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
                long m40635xe96f5b05 = m40635xe96f5b05(allocateDirect, 0, i17, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), c4615xd30f3b61);
                if (!m40663x7aad7efe(m40635xe96f5b05)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) m40635xe96f5b05);
                    return allocateDirect;
                }
                throw new java.lang.RuntimeException(m40662x130eedfd(m40635xe96f5b05));
            }
            throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }
}
