package com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1;

/* renamed from: com.tencent.tavkit.utils.TAVBitmapUtils */
/* loaded from: classes10.dex */
public class C25929xfef9979 {
    /* renamed from: readImagePreferRotation */
    public static int m98857xc1afa73(java.lang.String str) {
        try {
            int attributeInt = new android.media.ExifInterface(str).getAttributeInt(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1);
            if (attributeInt == 3) {
                return 2;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 1;
            }
            return 3;
        } catch (java.io.IOException unused) {
            return 0;
        }
    }
}
