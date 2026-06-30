package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.util.UrlReader */
/* loaded from: classes7.dex */
public class C3782x5fca1af2 {

    /* renamed from: AVSEEK_SIZE */
    private static final int f14765xb80978d3 = 65536;

    /* renamed from: SEEK_CUR */
    private static final int f14766x6a1affd9 = 1;

    /* renamed from: SEEK_END */
    private static final int f14767x6a1b0674 = 2;

    /* renamed from: SEEK_SET */
    private static final int f14768x6a1b39fb = 0;
    private static final java.lang.String TAG = "UrlReader";

    /* renamed from: mFileSize */
    private int f14769xf925d32a;

    /* renamed from: mOffset */
    private long f14770x12a38b60;

    /* renamed from: mStream */
    private java.io.InputStream f14771x1a41764d;

    /* renamed from: mUri */
    private android.net.Uri f14772x32d9bf;

    public C3782x5fca1af2(java.lang.String str) {
        this.f14772x32d9bf = android.net.Uri.parse(str);
        m29566x34264a();
    }

    /* renamed from: open */
    private void m29566x34264a() {
        try {
            java.io.InputStream openInputStream = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getContentResolver().openInputStream(this.f14772x32d9bf);
            this.f14771x1a41764d = openInputStream;
            this.f14769xf925d32a = openInputStream.available();
        } catch (java.io.FileNotFoundException unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Fail to open uri " + this.f14772x32d9bf.toString(), new java.lang.Object[0]);
            this.f14771x1a41764d = null;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Fail to get file size " + e17.getMessage(), new java.lang.Object[0]);
            this.f14771x1a41764d = null;
        }
    }

    /* renamed from: seekFromBegin */
    private long m29567x8180c387(long j17) {
        if (j17 < 0) {
            return -1L;
        }
        m29570x5a5ddf8();
        m29566x34264a();
        java.io.InputStream inputStream = this.f14771x1a41764d;
        if (inputStream == null) {
            return -1L;
        }
        try {
            long skip = inputStream.skip(j17);
            this.f14770x12a38b60 = skip;
            return skip;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Fail to seek " + j17 + " exception " + e17.getMessage(), new java.lang.Object[0]);
            return -1L;
        }
    }

    /* renamed from: seekFromCurrent */
    private long m29568x7530c8d7(long j17) {
        if (j17 < 0) {
            return m29567x8180c387(this.f14770x12a38b60 + j17);
        }
        try {
            long skip = this.f14770x12a38b60 + this.f14771x1a41764d.skip(j17);
            this.f14770x12a38b60 = skip;
            return skip;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Fail to seek " + j17 + " exception " + e17.getMessage(), new java.lang.Object[0]);
            return -1L;
        }
    }

    /* renamed from: seekFromEnd */
    private long m29569x6d9ef339(long j17) {
        if (j17 > 0) {
            return -1L;
        }
        long j18 = this.f14769xf925d32a + j17;
        if (j18 < 0) {
            return -1L;
        }
        long j19 = this.f14770x12a38b60;
        if (j18 < j19) {
            return m29567x8180c387(j18);
        }
        try {
            long skip = j19 + this.f14771x1a41764d.skip(j18 - j19);
            this.f14770x12a38b60 = skip;
            return skip;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Fail to seek " + j17 + " exception " + e17.getMessage(), new java.lang.Object[0]);
            return -1L;
        }
    }

    /* renamed from: close */
    public void m29570x5a5ddf8() {
        java.io.InputStream inputStream = this.f14771x1a41764d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Close exception " + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        this.f14771x1a41764d = null;
        this.f14770x12a38b60 = 0L;
        this.f14769xf925d32a = 0;
    }

    /* renamed from: read */
    public int m29571x355996(byte[] bArr, int i17) {
        java.io.InputStream inputStream = this.f14771x1a41764d;
        int i18 = -1;
        if (inputStream == null) {
            return -1;
        }
        try {
            i18 = inputStream.read(bArr, 0, i17);
            this.f14770x12a38b60 += i18;
            return i18;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Read exception " + e17.getMessage(), new java.lang.Object[0]);
            return i18;
        }
    }

    /* renamed from: seek */
    public long m29572x35ce78(long j17, int i17) {
        if (this.f14771x1a41764d == null) {
            return -1L;
        }
        if (i17 == 0) {
            return m29567x8180c387(j17);
        }
        if (i17 == 1) {
            return m29568x7530c8d7(j17);
        }
        if (i17 == 2) {
            return m29569x6d9ef339(j17);
        }
        if (i17 != 65536) {
            return -1L;
        }
        return this.f14769xf925d32a;
    }
}
