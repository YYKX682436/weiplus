package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
/* renamed from: org.chromium.base.ApkAssets */
/* loaded from: classes7.dex */
public class C29280xa993f49f {
    private static final java.lang.String TAG = "ApkAssets";

    /* renamed from: sLastError */
    private static java.lang.String f73121xab016ddf;

    /* renamed from: open */
    public static long[] m152185x34264a(java.lang.String str, java.lang.String str2) {
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        f73121xab016ddf = null;
        try {
            try {
                android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
                if (!android.text.TextUtils.isEmpty(str2) && org.p3343x72743996.p3344x2e06d1.C29286x5442992f.m152258x18c158c3(str2)) {
                    m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29286x5442992f.m152248x658e8c0a(m152349x6e669035, str2);
                }
                assetFileDescriptor = m152349x6e669035.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e17) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Unable to close AssetFileDescriptor", (java.lang.Throwable) e17);
                }
                return jArr;
            } catch (java.lang.Throwable th6) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (java.io.IOException e18) {
                        org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Unable to close AssetFileDescriptor", (java.lang.Throwable) e18);
                    }
                }
                throw th6;
            }
        } catch (java.io.IOException e19) {
            f73121xab016ddf = "Error while loading asset " + str + " from " + str2 + ": " + e19;
            if (!e19.getMessage().equals("") && !e19.getMessage().equals(str)) {
                org.p3343x72743996.p3344x2e06d1.Log.e(TAG, f73121xab016ddf);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e27) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Unable to close AssetFileDescriptor", (java.lang.Throwable) e27);
                }
            }
            return jArr2;
        }
    }

    /* renamed from: takeLastErrorString */
    private static java.lang.String m152186x63c4383c() {
        java.lang.String str = f73121xab016ddf;
        f73121xab016ddf = null;
        return str;
    }
}
