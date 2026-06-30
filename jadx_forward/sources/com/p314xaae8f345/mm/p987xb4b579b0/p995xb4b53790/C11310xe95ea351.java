package com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790;

/* renamed from: com.tencent.mm.opensdk.openapi.WXAPIFactory */
/* loaded from: classes8.dex */
public class C11310xe95ea351 {
    private static final java.lang.String TAG = "MicroMsg.PaySdk.WXFactory";

    private C11310xe95ea351() {
        throw new java.lang.RuntimeException(getClass().getSimpleName().concat(" should not be instantiated"));
    }

    /* renamed from: createWXAPI */
    public static com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0 m48546xe21697fd(android.content.Context context, java.lang.String str) {
        return m48547xe21697fd(context, str, true);
    }

    /* renamed from: createWXAPI */
    public static com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0 m48547xe21697fd(android.content.Context context, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z17);
        return m48548xe21697fd(context, str, z17, 2);
    }

    /* renamed from: createWXAPI */
    public static com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0 m48548xe21697fd(android.content.Context context, java.lang.String str, boolean z17, int i17) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z17 + ", launchMode = " + i17);
        return new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11313x21f2211c(context, str, z17, i17);
    }
}
