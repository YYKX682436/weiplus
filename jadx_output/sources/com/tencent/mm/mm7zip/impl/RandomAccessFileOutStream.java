package com.tencent.mm.mm7zip.impl;

/* loaded from: classes12.dex */
public class RandomAccessFileOutStream implements com.tencent.mm.mm7zip.IOutStream, java.io.Closeable {
    private final java.io.RandomAccessFile randomAccessFile;

    public RandomAccessFileOutStream(java.io.RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.randomAccessFile.close();
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

    @Override // com.tencent.mm.mm7zip.IOutStream
    public synchronized void setSize(long j17) {
        try {
            this.randomAccessFile.setLength(j17);
        } catch (java.io.IOException e17) {
            throw new com.tencent.mm.mm7zip.SevenZipException("Error setting new length of the file", e17);
        }
    }

    @Override // com.tencent.mm.mm7zip.ISequentialOutStream
    public synchronized int write(byte[] bArr) {
        try {
            this.randomAccessFile.write(bArr);
        } catch (java.io.IOException e17) {
            throw new com.tencent.mm.mm7zip.SevenZipException("Error reading random access file", e17);
        }
        return bArr.length;
    }
}
