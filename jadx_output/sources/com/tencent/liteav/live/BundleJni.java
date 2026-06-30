package com.tencent.liteav.live;

/* loaded from: classes.dex */
public class BundleJni {
    public static android.os.Bundle appendBoolean(android.os.Bundle bundle, java.lang.String str, boolean z17) {
        bundle.putBoolean(str, z17);
        return bundle;
    }

    public static android.os.Bundle appendBundle(android.os.Bundle bundle, java.lang.String str, android.os.Bundle bundle2) {
        bundle.putBundle(str, bundle2);
        return bundle;
    }

    public static android.os.Bundle appendByteArray(android.os.Bundle bundle, java.lang.String str, byte[] bArr) {
        bundle.putByteArray(str, bArr);
        return bundle;
    }

    public static android.os.Bundle appendDouble(android.os.Bundle bundle, java.lang.String str, double d17) {
        bundle.putDouble(str, d17);
        return bundle;
    }

    public static android.os.Bundle appendFloat(android.os.Bundle bundle, java.lang.String str, float f17) {
        bundle.putFloat(str, f17);
        return bundle;
    }

    public static android.os.Bundle appendInt(android.os.Bundle bundle, java.lang.String str, int i17) {
        bundle.putInt(str, i17);
        return bundle;
    }

    public static android.os.Bundle appendLong(android.os.Bundle bundle, java.lang.String str, long j17) {
        bundle.putLong(str, j17);
        return bundle;
    }

    public static android.os.Bundle appendString(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        bundle.putString(str, str2);
        return bundle;
    }

    public static android.os.Bundle getBundle() {
        return new android.os.Bundle();
    }
}
