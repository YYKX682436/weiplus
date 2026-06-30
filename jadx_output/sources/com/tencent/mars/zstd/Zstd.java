package com.tencent.mars.zstd;

/* loaded from: classes13.dex */
public class Zstd {
    public static native long compress(byte[] bArr, byte[] bArr2, int i17);

    public static byte[] compress(byte[] bArr) {
        return compress(bArr, 3);
    }

    public static native long compressBound(long j17);

    public static native long compressByteArray(byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27, int i28);

    public static native long compressDirectByteBuffer(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, int i28);

    public static native long compressDirectByteBufferFastDict(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress);

    public static native long compressDirectByteBufferUsingDict(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, byte[] bArr, int i28);

    public static native long compressFastDict(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress);

    public static native long compressUsingDict(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, byte[] bArr3, int i27);

    @java.lang.Deprecated
    public static long compressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i17);
    }

    public static native long decompress(byte[] bArr, byte[] bArr2);

    public static byte[] decompress(byte[] bArr, int i17) {
        byte[] bArr2 = new byte[i17];
        long decompress = decompress(bArr2, bArr);
        if (isError(decompress)) {
            throw new java.lang.RuntimeException(getErrorName(decompress));
        }
        return decompress != ((long) i17) ? java.util.Arrays.copyOfRange(bArr2, 0, (int) decompress) : bArr2;
    }

    public static native long decompressByteArray(byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27);

    public static native long decompressDirectByteBuffer(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27);

    public static native long decompressDirectByteBufferFastDict(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress);

    public static native long decompressDirectByteBufferUsingDict(java.nio.ByteBuffer byteBuffer, int i17, int i18, java.nio.ByteBuffer byteBuffer2, int i19, int i27, byte[] bArr);

    public static native long decompressFastDict(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress);

    public static native long decompressUsingDict(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, byte[] bArr3);

    @java.lang.Deprecated
    public static long decompressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static native long decompressedDirectByteBufferSize(java.nio.ByteBuffer byteBuffer, int i17, int i18);

    public static long decompressedSize(java.nio.ByteBuffer byteBuffer) {
        return decompressedDirectByteBufferSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static native long decompressedSize(byte[] bArr);

    public static native java.lang.String getErrorName(long j17);

    public static native boolean isError(long j17);

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2) {
        return trainFromBuffer(bArr, bArr2, false);
    }

    public static native long trainFromBuffer(byte[][] bArr, byte[] bArr2, boolean z17);

    public static long trainFromBufferDirect(java.nio.ByteBuffer byteBuffer, int[] iArr, java.nio.ByteBuffer byteBuffer2) {
        return trainFromBufferDirect(byteBuffer, iArr, byteBuffer2, false);
    }

    public static native long trainFromBufferDirect(java.nio.ByteBuffer byteBuffer, int[] iArr, java.nio.ByteBuffer byteBuffer2, boolean z17);

    public static byte[] compress(byte[] bArr, int i17) {
        long compressBound = compressBound(bArr.length);
        if (compressBound <= 2147483647L) {
            byte[] bArr2 = new byte[(int) compressBound];
            long compress = compress(bArr2, bArr, i17);
            if (!isError(compress)) {
                return java.util.Arrays.copyOfRange(bArr2, 0, (int) compress);
            }
            throw new java.lang.RuntimeException(getErrorName(compress));
        }
        throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
    }

    public static byte[] compressUsingDict(byte[] bArr, byte[] bArr2, int i17) {
        long compressBound = compressBound(bArr.length);
        if (compressBound <= 2147483647L) {
            byte[] bArr3 = new byte[(int) compressBound];
            long compressUsingDict = compressUsingDict(bArr3, 0, bArr, 0, bArr.length, bArr2, i17);
            if (!isError(compressUsingDict)) {
                return java.util.Arrays.copyOfRange(bArr3, 0, (int) compressUsingDict);
            }
            throw new java.lang.RuntimeException(getErrorName(compressUsingDict));
        }
        throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
    }

    public static int decompress(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long decompressDirectByteBuffer = decompressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
                if (!isError(decompressDirectByteBuffer)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i17 = (int) decompressDirectByteBuffer;
                    byteBuffer.position(byteBuffer.position() + i17);
                    return i17;
                }
                throw new java.lang.RuntimeException(getErrorName(decompressDirectByteBuffer));
            }
            throw new java.lang.IllegalArgumentException("dstBuf must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static int compress(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long compressDirectByteBuffer = compressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), i17);
                if (!isError(compressDirectByteBuffer)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i18 = (int) compressDirectByteBuffer;
                    byteBuffer.position(byteBuffer.position() + i18);
                    return i18;
                }
                throw new java.lang.RuntimeException(getErrorName(compressDirectByteBuffer));
            }
            throw new java.lang.IllegalArgumentException("dstBuf must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static java.nio.ByteBuffer decompress(java.nio.ByteBuffer byteBuffer, int i17) {
        if (byteBuffer.isDirect()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            long decompressDirectByteBuffer = decompressDirectByteBuffer(allocateDirect, 0, i17, byteBuffer, byteBuffer.position(), byteBuffer.limit());
            if (!isError(decompressDirectByteBuffer)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new java.lang.RuntimeException(getErrorName(decompressDirectByteBuffer));
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static java.nio.ByteBuffer compress(java.nio.ByteBuffer byteBuffer, int i17) {
        if (byteBuffer.isDirect()) {
            long compressBound = compressBound(byteBuffer.limit() - byteBuffer.position());
            if (compressBound <= 2147483647L) {
                int i18 = (int) compressBound;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
                long compressDirectByteBuffer = compressDirectByteBuffer(allocateDirect, 0, i18, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), i17);
                if (!isError(compressDirectByteBuffer)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) compressDirectByteBuffer);
                    return allocateDirect;
                }
                throw new java.lang.RuntimeException(getErrorName(compressDirectByteBuffer));
            }
            throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static byte[] decompress(byte[] bArr, com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress, int i17) {
        byte[] bArr2 = new byte[i17];
        long decompressFastDict = decompressFastDict(bArr2, 0, bArr, 0, bArr.length, zstdDictDecompress);
        if (isError(decompressFastDict)) {
            throw new java.lang.RuntimeException(getErrorName(decompressFastDict));
        }
        return decompressFastDict != ((long) i17) ? java.util.Arrays.copyOfRange(bArr2, 0, (int) decompressFastDict) : bArr2;
    }

    public static long decompress(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2, int i17) {
        byte[] bArr3 = new byte[i17];
        long decompressUsingDict = decompressUsingDict(bArr3, 0, bArr, 0, bArr.length, bArr2);
        if (isError(decompressUsingDict)) {
            throw new java.lang.RuntimeException(getErrorName(decompressUsingDict));
        }
        return decompressUsingDict != ((long) i17) ? java.util.Arrays.copyOfRange(bArr3, 0, (int) decompressUsingDict) : bArr3;
    }

    public static byte[] compress(byte[] bArr, com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress) {
        long compressBound = compressBound(bArr.length);
        if (compressBound <= 2147483647L) {
            byte[] bArr2 = new byte[(int) compressBound];
            long compressFastDict = compressFastDict(bArr2, 0, bArr, 0, bArr.length, zstdDictCompress);
            if (!isError(compressFastDict)) {
                return java.util.Arrays.copyOfRange(bArr2, 0, (int) compressFastDict);
            }
            throw new java.lang.RuntimeException(getErrorName(compressFastDict));
        }
        throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
    }

    public static int decompress(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, byte[] bArr) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long decompressDirectByteBufferUsingDict = decompressDirectByteBufferUsingDict(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), bArr);
                if (!isError(decompressDirectByteBufferUsingDict)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i17 = (int) decompressDirectByteBufferUsingDict;
                    byteBuffer.position(byteBuffer.position() + i17);
                    return i17;
                }
                throw new java.lang.RuntimeException(getErrorName(decompressDirectByteBufferUsingDict));
            }
            throw new java.lang.IllegalArgumentException("dstBuff must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuff must be a direct buffer");
    }

    public static long compress(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i17);
    }

    public static int compress(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, byte[] bArr, int i17) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long compressDirectByteBufferUsingDict = compressDirectByteBufferUsingDict(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), bArr, i17);
                if (!isError(compressDirectByteBufferUsingDict)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i18 = (int) compressDirectByteBufferUsingDict;
                    byteBuffer.limit(i18);
                    return i18;
                }
                throw new java.lang.RuntimeException(getErrorName(compressDirectByteBufferUsingDict));
            }
            throw new java.lang.IllegalArgumentException("dstBuf must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static java.nio.ByteBuffer decompress(java.nio.ByteBuffer byteBuffer, byte[] bArr, int i17) {
        if (byteBuffer.isDirect()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            long decompressDirectByteBufferUsingDict = decompressDirectByteBufferUsingDict(allocateDirect, 0, i17, byteBuffer, byteBuffer.position(), byteBuffer.limit(), bArr);
            if (!isError(decompressDirectByteBufferUsingDict)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new java.lang.RuntimeException(getErrorName(decompressDirectByteBufferUsingDict));
        }
        throw new java.lang.IllegalArgumentException("srcBuff must be a direct buffer");
    }

    public static java.nio.ByteBuffer compress(java.nio.ByteBuffer byteBuffer, byte[] bArr, int i17) {
        if (byteBuffer.isDirect()) {
            long compressBound = compressBound(byteBuffer.limit() - byteBuffer.position());
            if (compressBound <= 2147483647L) {
                int i18 = (int) compressBound;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
                long compressDirectByteBufferUsingDict = compressDirectByteBufferUsingDict(allocateDirect, 0, i18, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), bArr, i17);
                if (!isError(compressDirectByteBufferUsingDict)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) compressDirectByteBufferUsingDict);
                    return allocateDirect;
                }
                throw new java.lang.RuntimeException(getErrorName(compressDirectByteBufferUsingDict));
            }
            throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static int decompress(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long decompressDirectByteBufferFastDict = decompressDirectByteBufferFastDict(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), zstdDictDecompress);
                if (!isError(decompressDirectByteBufferFastDict)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i17 = (int) decompressDirectByteBufferFastDict;
                    byteBuffer.position(byteBuffer.position() + i17);
                    return i17;
                }
                throw new java.lang.RuntimeException(getErrorName(decompressDirectByteBufferFastDict));
            }
            throw new java.lang.IllegalArgumentException("dstBuff must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuff must be a direct buffer");
    }

    public static int compress(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress) {
        if (byteBuffer2.isDirect()) {
            if (byteBuffer.isDirect()) {
                long compressDirectByteBufferFastDict = compressDirectByteBufferFastDict(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position(), zstdDictCompress);
                if (!isError(compressDirectByteBufferFastDict)) {
                    byteBuffer2.position(byteBuffer2.limit());
                    int i17 = (int) compressDirectByteBufferFastDict;
                    byteBuffer.limit(i17);
                    return i17;
                }
                throw new java.lang.RuntimeException(getErrorName(compressDirectByteBufferFastDict));
            }
            throw new java.lang.IllegalArgumentException("dstBuf must be a direct buffer");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }

    public static java.nio.ByteBuffer decompress(java.nio.ByteBuffer byteBuffer, com.tencent.mars.zstd.ZstdDictDecompress zstdDictDecompress, int i17) {
        if (byteBuffer.isDirect()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            long decompressDirectByteBufferFastDict = decompressDirectByteBufferFastDict(allocateDirect, 0, i17, byteBuffer, byteBuffer.position(), byteBuffer.limit(), zstdDictDecompress);
            if (!isError(decompressDirectByteBufferFastDict)) {
                byteBuffer.position(byteBuffer.limit());
                return allocateDirect;
            }
            throw new java.lang.RuntimeException(getErrorName(decompressDirectByteBufferFastDict));
        }
        throw new java.lang.IllegalArgumentException("srcBuff must be a direct buffer");
    }

    public static java.nio.ByteBuffer compress(java.nio.ByteBuffer byteBuffer, com.tencent.mars.zstd.ZstdDictCompress zstdDictCompress) {
        if (byteBuffer.isDirect()) {
            long compressBound = compressBound(byteBuffer.limit() - byteBuffer.position());
            if (compressBound <= 2147483647L) {
                int i17 = (int) compressBound;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
                long compressDirectByteBufferFastDict = compressDirectByteBufferFastDict(allocateDirect, 0, i17, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), zstdDictCompress);
                if (!isError(compressDirectByteBufferFastDict)) {
                    byteBuffer.position(byteBuffer.limit());
                    allocateDirect.limit((int) compressDirectByteBufferFastDict);
                    return allocateDirect;
                }
                throw new java.lang.RuntimeException(getErrorName(compressDirectByteBufferFastDict));
            }
            throw new java.lang.RuntimeException("Max output size is greater than MAX_INT");
        }
        throw new java.lang.IllegalArgumentException("srcBuf must be a direct buffer");
    }
}
