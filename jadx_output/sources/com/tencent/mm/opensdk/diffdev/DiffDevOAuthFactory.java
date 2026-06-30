package com.tencent.mm.opensdk.diffdev;

/* loaded from: classes15.dex */
public class DiffDevOAuthFactory {
    public static final int MAX_SUPPORTED_VERSION = 1;
    private static final java.lang.String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
    public static final int VERSION_1 = 1;
    private static com.tencent.mm.opensdk.diffdev.IDiffDevOAuth v1Instance;

    private DiffDevOAuthFactory() {
    }

    public static com.tencent.mm.opensdk.diffdev.IDiffDevOAuth getDiffDevOAuth() {
        return getDiffDevOAuth(1);
    }

    public static com.tencent.mm.opensdk.diffdev.IDiffDevOAuth getDiffDevOAuth(int i17) {
        com.tencent.mm.opensdk.utils.Log.v(TAG, "getDiffDevOAuth, version = ".concat(java.lang.String.valueOf(i17)));
        if (i17 > 1) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "getDiffDevOAuth fail, unsupported version = ".concat(java.lang.String.valueOf(i17)));
            return null;
        }
        if (i17 != 1) {
            return null;
        }
        if (v1Instance == null) {
            v1Instance = new com.tencent.mm.opensdk.diffdev.a.a();
        }
        return v1Instance;
    }
}
