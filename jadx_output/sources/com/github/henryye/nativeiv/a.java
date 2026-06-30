package com.github.henryye.nativeiv;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f44070a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f44071b;

    static {
        int[] iArr = new int[com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.values().length];
        f44071b = iArr;
        try {
            iArr[com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.NO_REFERRER.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f44071b[com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.ORIGIN.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[android.graphics.Bitmap.Config.values().length];
        f44070a = iArr2;
        try {
            iArr2[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f44070a[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f44070a[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f44070a[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}
