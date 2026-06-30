package com.p171xb5c11be3.p172x30254a24.p173x79eeb384;

/* renamed from: com.github.henryye.nativeiv.ImageDecodeConfig */
/* loaded from: classes7.dex */
public class C1592x888963ab {

    /* renamed from: mConfig */
    public android.graphics.Bitmap.Config f5274xfeabaa0f = android.graphics.Bitmap.Config.ARGB_8888;

    /* renamed from: mPremultiplyAlpha */
    public boolean f5278xefd30a64 = true;

    /* renamed from: mReferrerPolicy */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy f5279x6c8843fe = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.NOT_SET;

    /* renamed from: mPreferredWidth */
    public int f5277xa277e392 = 0;

    /* renamed from: mPreferredHeight */
    public int f5275x92b594db = 0;

    /* renamed from: mPreferredScale */
    public double f5276xa23cbf16 = 0.0d;

    /* renamed from: com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy */
    /* loaded from: classes7.dex */
    public enum ReferrerPolicy {
        NOT_SET,
        NO_REFERRER,
        ORIGIN
    }

    /* renamed from: createConfig */
    public static com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab m17121x3ff4635e(android.graphics.Bitmap.Config config, boolean z17) {
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab = new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab();
        c1592x888963ab.f5278xefd30a64 = z17;
        c1592x888963ab.f5274xfeabaa0f = config;
        return c1592x888963ab;
    }

    /* renamed from: getNativeConfig */
    public int m17123xd48ca4af() {
        int i17 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.a.f125603a[this.f5274xfeabaa0f.ordinal()];
        if (i17 == 2) {
            return 4;
        }
        if (i17 != 3) {
            return i17 != 4 ? 1 : 8;
        }
        return 7;
    }

    /* renamed from: getNativeReferrerPolicy */
    public int m17124xe1949e9e() {
        int i17 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.a.f125604b[this.f5279x6c8843fe.ordinal()];
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 0;
            }
        }
        return i18;
    }

    /* renamed from: toString */
    public java.lang.String m17125x9616526c() {
        return "ImageDecodeConfig{mConfig=" + this.f5274xfeabaa0f + ", mPremultiplyAlpha=" + this.f5278xefd30a64 + ", mReferrerPolicy=" + this.f5279x6c8843fe + ", mPreferredWidth=" + this.f5277xa277e392 + ", mPreferredHeight=" + this.f5275x92b594db + ", mPreferredScale=" + this.f5276xa23cbf16 + '}';
    }

    /* renamed from: createConfig */
    public static java.lang.Object m17122x3ff4635e(int i17, boolean z17, int i18, int i19, int i27, double d17) {
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab = new com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab();
        c1592x888963ab.f5278xefd30a64 = z17;
        if (i17 == 8) {
            c1592x888963ab.f5274xfeabaa0f = android.graphics.Bitmap.Config.ALPHA_8;
        } else if (i17 == 4) {
            c1592x888963ab.f5274xfeabaa0f = android.graphics.Bitmap.Config.RGB_565;
        } else if (i17 == 7) {
            c1592x888963ab.f5274xfeabaa0f = android.graphics.Bitmap.Config.ARGB_4444;
        } else if (i17 == 1) {
            c1592x888963ab.f5274xfeabaa0f = android.graphics.Bitmap.Config.ARGB_8888;
        } else {
            c1592x888963ab.f5274xfeabaa0f = android.graphics.Bitmap.Config.ARGB_8888;
        }
        if (i18 == 0) {
            c1592x888963ab.f5279x6c8843fe = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.NOT_SET;
        } else if (i18 == 1) {
            c1592x888963ab.f5279x6c8843fe = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.NO_REFERRER;
        } else if (i18 == 2) {
            c1592x888963ab.f5279x6c8843fe = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.ORIGIN;
        }
        c1592x888963ab.f5277xa277e392 = i19;
        c1592x888963ab.f5275x92b594db = i27;
        c1592x888963ab.f5276xa23cbf16 = d17;
        return c1592x888963ab;
    }
}
