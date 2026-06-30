package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public final class t implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.FileOutputStream f125594d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.channels.FileLock f125595e;

    public t(java.io.File file) {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        this.f125594d = fileOutputStream;
        try {
            java.nio.channels.FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f125595e = lock;
        } catch (java.lang.Throwable th6) {
            this.f125594d.close();
            throw th6;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.FileOutputStream fileOutputStream = this.f125594d;
        try {
            java.nio.channels.FileLock fileLock = this.f125595e;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            fileOutputStream.close();
        }
    }
}
