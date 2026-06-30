package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.Base64Utils */
/* loaded from: classes13.dex */
public final class C1988xf8f2482 {
    /* renamed from: decode */
    public static byte[] m18525xb06291ee(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 0);
    }

    /* renamed from: decodeUrlSafe */
    public static byte[] m18526xf43347ce(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 10);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: decodeUrlSafeNoPadding */
    public static byte[] m18527x714abae2(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 11);
    }

    /* renamed from: encode */
    public static java.lang.String m18528xb2963e16(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 0);
    }

    /* renamed from: encodeUrlSafe */
    public static java.lang.String m18529x27f51ea6(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 10);
    }

    /* renamed from: encodeUrlSafeNoPadding */
    public static java.lang.String m18530x6931170a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
