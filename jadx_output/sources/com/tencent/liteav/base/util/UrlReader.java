package com.tencent.liteav.base.util;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes7.dex */
public class UrlReader {
    private static final int AVSEEK_SIZE = 65536;
    private static final int SEEK_CUR = 1;
    private static final int SEEK_END = 2;
    private static final int SEEK_SET = 0;
    private static final java.lang.String TAG = "UrlReader";
    private int mFileSize;
    private long mOffset;
    private java.io.InputStream mStream;
    private android.net.Uri mUri;

    public UrlReader(java.lang.String str) {
        this.mUri = android.net.Uri.parse(str);
        open();
    }

    private void open() {
        try {
            java.io.InputStream openInputStream = com.tencent.liteav.base.ContextUtils.getApplicationContext().getContentResolver().openInputStream(this.mUri);
            this.mStream = openInputStream;
            this.mFileSize = openInputStream.available();
        } catch (java.io.FileNotFoundException unused) {
            com.tencent.liteav.base.Log.e(TAG, "Fail to open uri " + this.mUri.toString(), new java.lang.Object[0]);
            this.mStream = null;
        } catch (java.io.IOException e17) {
            com.tencent.liteav.base.Log.e(TAG, "Fail to get file size " + e17.getMessage(), new java.lang.Object[0]);
            this.mStream = null;
        }
    }

    private long seekFromBegin(long j17) {
        if (j17 < 0) {
            return -1L;
        }
        close();
        open();
        java.io.InputStream inputStream = this.mStream;
        if (inputStream == null) {
            return -1L;
        }
        try {
            long skip = inputStream.skip(j17);
            this.mOffset = skip;
            return skip;
        } catch (java.io.IOException e17) {
            com.tencent.liteav.base.Log.e(TAG, "Fail to seek " + j17 + " exception " + e17.getMessage(), new java.lang.Object[0]);
            return -1L;
        }
    }

    private long seekFromCurrent(long j17) {
        if (j17 < 0) {
            return seekFromBegin(this.mOffset + j17);
        }
        try {
            long skip = this.mOffset + this.mStream.skip(j17);
            this.mOffset = skip;
            return skip;
        } catch (java.io.IOException e17) {
            com.tencent.liteav.base.Log.e(TAG, "Fail to seek " + j17 + " exception " + e17.getMessage(), new java.lang.Object[0]);
            return -1L;
        }
    }

    private long seekFromEnd(long j17) {
        if (j17 > 0) {
            return -1L;
        }
        long j18 = this.mFileSize + j17;
        if (j18 < 0) {
            return -1L;
        }
        long j19 = this.mOffset;
        if (j18 < j19) {
            return seekFromBegin(j18);
        }
        try {
            long skip = j19 + this.mStream.skip(j18 - j19);
            this.mOffset = skip;
            return skip;
        } catch (java.io.IOException e17) {
            com.tencent.liteav.base.Log.e(TAG, "Fail to seek " + j17 + " exception " + e17.getMessage(), new java.lang.Object[0]);
            return -1L;
        }
    }

    public void close() {
        java.io.InputStream inputStream = this.mStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e17) {
                com.tencent.liteav.base.Log.e(TAG, "Close exception " + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        this.mStream = null;
        this.mOffset = 0L;
        this.mFileSize = 0;
    }

    public int read(byte[] bArr, int i17) {
        java.io.InputStream inputStream = this.mStream;
        int i18 = -1;
        if (inputStream == null) {
            return -1;
        }
        try {
            i18 = inputStream.read(bArr, 0, i17);
            this.mOffset += i18;
            return i18;
        } catch (java.io.IOException e17) {
            com.tencent.liteav.base.Log.e(TAG, "Read exception " + e17.getMessage(), new java.lang.Object[0]);
            return i18;
        }
    }

    public long seek(long j17, int i17) {
        if (this.mStream == null) {
            return -1L;
        }
        if (i17 == 0) {
            return seekFromBegin(j17);
        }
        if (i17 == 1) {
            return seekFromCurrent(j17);
        }
        if (i17 == 2) {
            return seekFromEnd(j17);
        }
        if (i17 != 65536) {
            return -1L;
        }
        return this.mFileSize;
    }
}
