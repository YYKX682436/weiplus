package com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0;

/* renamed from: com.tencent.mm.opensdk.diffdev.DiffDevOAuthFactory */
/* loaded from: classes15.dex */
public class C11225x8826c423 {

    /* renamed from: MAX_SUPPORTED_VERSION */
    public static final int f32848xe7d98fcc = 1;
    private static final java.lang.String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";

    /* renamed from: VERSION_1 */
    public static final int f32849x5239666a = 1;

    /* renamed from: v1Instance */
    private static com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0 f32850x1fe45c30;

    private C11225x8826c423() {
    }

    /* renamed from: getDiffDevOAuth */
    public static com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0 m48405x2125813d() {
        return m48406x2125813d(1);
    }

    /* renamed from: getDiffDevOAuth */
    public static com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0 m48406x2125813d(int i17) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.v(TAG, "getDiffDevOAuth, version = ".concat(java.lang.String.valueOf(i17)));
        if (i17 > 1) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "getDiffDevOAuth fail, unsupported version = ".concat(java.lang.String.valueOf(i17)));
            return null;
        }
        if (i17 != 1) {
            return null;
        }
        if (f32850x1fe45c30 == null) {
            f32850x1fe45c30 = new com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.a();
        }
        return f32850x1fe45c30;
    }
}
