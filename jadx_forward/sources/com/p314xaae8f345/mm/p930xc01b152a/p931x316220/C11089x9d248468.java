package com.p314xaae8f345.mm.p930xc01b152a.p931x316220;

/* renamed from: com.tencent.mm.mm7zip.impl.RandomAccessFileInStream */
/* loaded from: classes12.dex */
public class C11089x9d248468 implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e {

    /* renamed from: randomAccessFile */
    private final java.io.RandomAccessFile f32503xa5b3b623;

    public C11089x9d248468(java.io.RandomAccessFile randomAccessFile) {
        this.f32503xa5b3b623 = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f32503xa5b3b623.close();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11059x8bb0b4d
    /* renamed from: read */
    public synchronized int mo47634x355996(byte[] bArr) {
        try {
            int read = this.f32503xa5b3b623.read(bArr);
            if (read == -1) {
                return 0;
            }
            return read;
        } catch (java.io.IOException e17) {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Error reading random access file", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11058xd0ed169b
    /* renamed from: seek */
    public synchronized long mo47633x35ce78(long j17, int i17) {
        try {
            if (i17 == 0) {
                this.f32503xa5b3b623.seek(j17);
            } else if (i17 == 1) {
                java.io.RandomAccessFile randomAccessFile = this.f32503xa5b3b623;
                randomAccessFile.seek(randomAccessFile.getFilePointer() + j17);
            } else {
                if (i17 != 2) {
                    throw new java.lang.RuntimeException("Seek: unknown origin: " + i17);
                }
                java.io.RandomAccessFile randomAccessFile2 = this.f32503xa5b3b623;
                randomAccessFile2.seek(randomAccessFile2.length() + j17);
            }
        } catch (java.io.IOException e17) {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Error while seek operation", e17);
        }
        return this.f32503xa5b3b623.getFilePointer();
    }
}
