package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.Guard */
/* loaded from: classes12.dex */
public class C26628x41f2e85 implements java.io.Closeable {

    /* renamed from: CLEANING_FLAG */
    private static final int f55608x460b22f2 = 1;

    /* renamed from: mLock */
    private final java.nio.channels.FileLock f55609x6243b38;

    /* renamed from: mStream */
    private final java.io.Closeable f55610x1a41764d;

    private C26628x41f2e85(java.io.Closeable closeable, java.nio.channels.FileLock fileLock) {
        if (closeable == null) {
            throw new java.lang.IllegalArgumentException("stream should not be null");
        }
        if (fileLock == null) {
            throw new java.lang.IllegalArgumentException("lock should not be null");
        }
        this.f55610x1a41764d = closeable;
        this.f55609x6243b38 = fileLock;
    }

    /* renamed from: acquireClean */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85 m104615xf0907b13(java.io.File file) {
        java.io.FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new java.io.FileOutputStream(file);
        } catch (java.io.IOException unused) {
        }
        try {
            java.nio.channels.FileLock tryLock = fileOutputStream.getChannel().tryLock();
            if (tryLock == null) {
                m104617x2c8e8789(fileOutputStream);
                return null;
            }
            try {
                fileOutputStream.write(1);
                return new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85(fileOutputStream, tryLock);
            } catch (java.io.IOException unused2) {
                m104618xb1fd9e9a(tryLock);
                m104617x2c8e8789(fileOutputStream);
                return null;
            }
        } catch (java.io.IOException unused3) {
            m104617x2c8e8789(fileOutputStream);
            return null;
        } catch (java.nio.channels.OverlappingFileLockException unused4) {
            m104617x2c8e8789(fileOutputStream);
            return null;
        }
    }

    /* renamed from: acquireUse */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85 m104616xa78b34d1(java.io.File file) {
        java.io.FileInputStream fileInputStream;
        try {
            fileInputStream = new java.io.FileInputStream(file);
        } catch (java.io.IOException unused) {
        }
        try {
            java.nio.channels.FileLock tryLock = fileInputStream.getChannel().tryLock(0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, true);
            if (tryLock == null) {
                m104617x2c8e8789(fileInputStream);
                return null;
            }
            try {
                if (fileInputStream.read() != 1) {
                    return new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85(fileInputStream, tryLock);
                }
                m104618xb1fd9e9a(tryLock);
                m104617x2c8e8789(fileInputStream);
                return null;
            } catch (java.io.IOException unused2) {
                m104618xb1fd9e9a(tryLock);
                m104617x2c8e8789(fileInputStream);
                return null;
            }
        } catch (java.io.IOException unused3) {
            m104617x2c8e8789(fileInputStream);
            return null;
        } catch (java.nio.channels.OverlappingFileLockException unused4) {
            m104617x2c8e8789(fileInputStream);
            return null;
        }
    }

    /* renamed from: closeSilence */
    private static void m104617x2c8e8789(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    /* renamed from: releaseSilence */
    private static void m104618xb1fd9e9a(java.nio.channels.FileLock fileLock) {
        if (fileLock == null) {
            return;
        }
        try {
            fileLock.release();
        } catch (java.io.IOException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m104618xb1fd9e9a(this.f55609x6243b38);
        m104617x2c8e8789(this.f55610x1a41764d);
    }
}
