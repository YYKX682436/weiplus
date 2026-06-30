package com.p314xaae8f345.mm.p930xc01b152a.p931x316220;

/* renamed from: com.tencent.mm.mm7zip.impl.RandomAccessFileOutStream */
/* loaded from: classes12.dex */
public class C11090xf1aeb96b implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11053x70861a25, java.io.Closeable {

    /* renamed from: randomAccessFile */
    private final java.io.RandomAccessFile f32504xa5b3b623;

    public C11090xf1aeb96b(java.io.RandomAccessFile randomAccessFile) {
        this.f32504xa5b3b623 = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32504xa5b3b623.close();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11058xd0ed169b
    /* renamed from: seek */
    public synchronized long mo47633x35ce78(long j17, int i17) {
        try {
            if (i17 == 0) {
                this.f32504xa5b3b623.seek(j17);
            } else if (i17 == 1) {
                java.io.RandomAccessFile randomAccessFile = this.f32504xa5b3b623;
                randomAccessFile.seek(randomAccessFile.getFilePointer() + j17);
            } else {
                if (i17 != 2) {
                    throw new java.lang.RuntimeException("Seek: unknown origin: " + i17);
                }
                java.io.RandomAccessFile randomAccessFile2 = this.f32504xa5b3b623;
                randomAccessFile2.seek(randomAccessFile2.length() + j17);
            }
        } catch (java.io.IOException e17) {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Error while seek operation", e17);
        }
        return this.f32504xa5b3b623.getFilePointer();
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11053x70861a25
    /* renamed from: setSize */
    public synchronized void mo47628x76500f83(long j17) {
        try {
            this.f32504xa5b3b623.setLength(j17);
        } catch (java.io.IOException e17) {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Error setting new length of the file", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26
    /* renamed from: write */
    public synchronized int mo47635x6c257df(byte[] bArr) {
        try {
            this.f32504xa5b3b623.write(bArr);
        } catch (java.io.IOException e17) {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("Error reading random access file", e17);
        }
        return bArr.length;
    }
}
