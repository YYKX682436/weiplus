package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareFileLockHelper */
/* loaded from: classes13.dex */
public class C26634x2c5b4cf4 implements java.io.Closeable {

    /* renamed from: LOCK_WAIT_EACH_TIME */
    public static final int f55859xf6ee0d95 = 10;

    /* renamed from: MAX_LOCK_ATTEMPTS */
    public static final int f55860x4a57001f = 3;
    private static final java.lang.String TAG = "Tinker.FileLockHelper";

    /* renamed from: fileLock */
    private final java.nio.channels.FileLock f55861xd42510c7;

    /* renamed from: outputStream */
    private final java.io.FileOutputStream f55862xf83acfe1;

    private C26634x2c5b4cf4(java.io.File file) {
        this.f55862xf83acfe1 = new java.io.FileOutputStream(file);
        java.nio.channels.FileLock fileLock = null;
        int i17 = 0;
        java.lang.Exception e17 = null;
        while (i17 < 3) {
            i17++;
            try {
                fileLock = this.f55862xf83acfe1.getChannel().lock();
                if (fileLock != null) {
                    break;
                }
            } catch (java.lang.Exception e18) {
                e17 = e18;
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getInfoLock Thread failed time:10", new java.lang.Object[0]);
            }
            try {
                java.lang.Thread.sleep(10L);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getInfoLock Thread sleep exception", e19);
            }
        }
        if (fileLock != null) {
            this.f55861xd42510c7 = fileLock;
        } else {
            throw new java.io.IOException("Tinker Exception:FileLockHelper lock file failed: " + file.getAbsolutePath(), e17);
        }
    }

    /* renamed from: getFileLock */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26634x2c5b4cf4 m104640x4fff4e3d(java.io.File file) {
        return new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26634x2c5b4cf4(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            java.nio.channels.FileLock fileLock = this.f55861xd42510c7;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            java.io.FileOutputStream fileOutputStream = this.f55862xf83acfe1;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}
