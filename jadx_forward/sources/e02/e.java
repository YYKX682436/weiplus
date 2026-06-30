package e02;

/* loaded from: classes13.dex */
public abstract class e {
    public static android.util.Pair a(java.io.RandomAccessFile randomAccessFile, long j17) {
        if (j17 < 32) {
            throw new e02.d("APK too small for APK Signing Block. ZIP Central Directory offset: " + j17);
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(24);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        randomAccessFile.seek(j17 - allocate.capacity());
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
            throw new e02.d("No APK Signing Block before ZIP Central Directory");
        }
        long j18 = allocate.getLong(0);
        if (j18 < allocate.capacity() || j18 > 2147483639) {
            throw new e02.d("APK Signing Block size out of range: " + j18);
        }
        int i17 = (int) (8 + j18);
        long j19 = j17 - i17;
        if (j19 < 0) {
            throw new e02.d("APK Signing Block offset out of range: " + j19);
        }
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(i17);
        allocate2.order(byteOrder);
        randomAccessFile.seek(j19);
        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
        long j27 = allocate2.getLong(0);
        if (j27 == j18) {
            return android.util.Pair.create(allocate2, java.lang.Long.valueOf(j19));
        }
        throw new e02.d("APK Signing Block sizes in header and footer do not match: " + j27 + " vs " + j18);
    }

    public static e02.c b(java.io.RandomAccessFile randomAccessFile) {
        android.util.Pair e17 = e(randomAccessFile);
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) e17.first;
        long longValue = ((java.lang.Long) e17.second).longValue();
        if (e02.p.c(randomAccessFile, longValue)) {
            throw new e02.d("ZIP64 APK not supported");
        }
        long d17 = d(byteBuffer, longValue);
        android.util.Pair a17 = a(randomAccessFile, d17);
        java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) a17.first;
        long longValue2 = ((java.lang.Long) a17.second).longValue();
        if (byteBuffer2.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        java.nio.ByteBuffer f17 = f(byteBuffer2, 8, byteBuffer2.capacity() - 24);
        int i17 = 0;
        while (f17.hasRemaining()) {
            i17++;
            if (f17.remaining() < 8) {
                throw new e02.d("Insufficient data to read size of APK Signing Block entry #" + i17);
            }
            long j17 = f17.getLong();
            if (j17 < 4 || j17 > 2147483647L) {
                throw new e02.d("APK Signing Block entry #" + i17 + " size out of range: " + j17);
            }
            int i18 = (int) j17;
            int position = f17.position() + i18;
            if (i18 > f17.remaining()) {
                throw new e02.d("APK Signing Block entry #" + i17 + " size out of range: " + i18 + ", available: " + f17.remaining());
            }
            if (f17.getInt() == 1896449818) {
                return new e02.c(c(f17, i18 - 4), longValue2, d17, longValue, byteBuffer, null);
            }
            f17.position(position);
        }
        throw new e02.d("No APK Signature Scheme v2 block in APK Signing Block");
    }

    public static java.nio.ByteBuffer c(java.nio.ByteBuffer byteBuffer, int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("size: " + i17);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i18 = i17 + position;
        if (i18 < position || i18 > limit) {
            throw new java.nio.BufferUnderflowException();
        }
        byteBuffer.limit(i18);
        try {
            java.nio.ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i18);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static long d(java.nio.ByteBuffer byteBuffer, long j17) {
        e02.p.a(byteBuffer);
        long j18 = byteBuffer.getInt(byteBuffer.position() + 16) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        if (j18 < j17) {
            e02.p.a(byteBuffer);
            if ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & byteBuffer.getInt(byteBuffer.position() + 12)) + j18 == j17) {
                return j18;
            }
            throw new e02.d("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        throw new e02.d("ZIP Central Directory offset out of range: " + j18 + ". ZIP End of Central Directory offset: " + j17);
    }

    public static android.util.Pair e(java.io.RandomAccessFile randomAccessFile) {
        android.util.Pair b17;
        if (randomAccessFile.length() < 22) {
            b17 = null;
        } else {
            android.util.Pair b18 = e02.p.b(randomAccessFile, 0);
            b17 = b18 != null ? b18 : e02.p.b(randomAccessFile, 65535);
        }
        if (b17 != null) {
            return b17;
        }
        throw new e02.d("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static java.nio.ByteBuffer f(java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("start: " + i17);
        }
        if (i18 < i17) {
            throw new java.lang.IllegalArgumentException("end < start: " + i18 + " < " + i17);
        }
        int capacity = byteBuffer.capacity();
        if (i18 > byteBuffer.capacity()) {
            throw new java.lang.IllegalArgumentException("end > capacity: " + i18 + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i18);
            byteBuffer.position(i17);
            java.nio.ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }
}
