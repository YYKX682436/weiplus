package com.facebook.soloader;

/* loaded from: classes13.dex */
public final class t implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.FileOutputStream f44061d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.channels.FileLock f44062e;

    public t(java.io.File file) {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        this.f44061d = fileOutputStream;
        try {
            java.nio.channels.FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f44062e = lock;
        } catch (java.lang.Throwable th6) {
            this.f44061d.close();
            throw th6;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.FileOutputStream fileOutputStream = this.f44061d;
        try {
            java.nio.channels.FileLock fileLock = this.f44062e;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            fileOutputStream.close();
        }
    }
}
