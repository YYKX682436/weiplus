package com.tencent.mm.opensdk.openapi;

/* loaded from: classes8.dex */
public class WXAPIFactory {
    private static final java.lang.String TAG = "MicroMsg.PaySdk.WXFactory";

    private WXAPIFactory() {
        throw new java.lang.RuntimeException(getClass().getSimpleName().concat(" should not be instantiated"));
    }

    public static com.tencent.mm.opensdk.openapi.IWXAPI createWXAPI(android.content.Context context, java.lang.String str) {
        return createWXAPI(context, str, true);
    }

    public static com.tencent.mm.opensdk.openapi.IWXAPI createWXAPI(android.content.Context context, java.lang.String str, boolean z17) {
        com.tencent.mm.opensdk.utils.Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z17);
        return createWXAPI(context, str, z17, 2);
    }

    public static com.tencent.mm.opensdk.openapi.IWXAPI createWXAPI(android.content.Context context, java.lang.String str, boolean z17, int i17) {
        com.tencent.mm.opensdk.utils.Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z17 + ", launchMode = " + i17);
        return new com.tencent.mm.opensdk.openapi.WXApiImplV10(context, str, z17, i17);
    }
}
