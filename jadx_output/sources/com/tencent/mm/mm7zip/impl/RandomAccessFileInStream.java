package com.tencent.mm.mm7zip.impl;

/* loaded from: classes12.dex */
public class RandomAccessFileInStream implements com.tencent.mm.mm7zip.IInStream {
    private final java.io.RandomAccessFile randomAccessFile;

    public RandomAccessFileInStream(java.io.RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.randomAccessFile.close();
    }

    @Override // com.tencent.mm.mm7zip.ISequentialInStream
    public synchronized int read(byte[] bArr) {
        try {
            int read = this.randomAccessFile.read(bArr);
            if (read == -1) {
                return 0;
            }
            return read;
        } catch (java.io.IOException e17) {
            throw new com.tencent.mm.mm7zip.SevenZipException("Error reading random access file", e17);
        }
    }

    @Override // com.tencent.mm.mm7zip.ISeekableStream
    public synchronized long seek(long j17, int i17) {
        try {
            if (i17 == 0) {
                this.randomAccessFile.seek(j17);
            } else if (i17 == 1) {
                java.io.RandomAccessFile randomAccessFile = this.randomAccessFile;
                randomAccessFile.seek(randomAccessFile.getFilePointer() + j17);
            } else {
                if (i17 != 2) {
                    throw new java.lang.RuntimeException("Seek: unknown origin: " + i17);
                }
                java.io.RandomAccessFile randomAccessFile2 = this.randomAccessFile;
                randomAccessFile2.seek(randomAccessFile2.length() + j17);
            }
        } catch (java.io.IOException e17) {
            throw new com.tencent.mm.mm7zip.SevenZipException("Error while seek operation", e17);
        }
        return this.randomAccessFile.getFilePointer();
    }
}
