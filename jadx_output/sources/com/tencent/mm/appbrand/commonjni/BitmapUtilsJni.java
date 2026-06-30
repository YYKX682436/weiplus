package com.tencent.mm.appbrand.commonjni;

/* loaded from: classes7.dex */
public class BitmapUtilsJni {
    static {
        bl.d.f21674a.loadLibrary("wxa-runtime-binding");
    }

    public static native int nativeCheckBitmapIsBlank(android.graphics.Bitmap bitmap, float f17, com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails);
}
