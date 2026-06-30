package com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce;

/* renamed from: com.tencent.map.geolocation.sapp.TencentLocationManagerOptions */
/* loaded from: classes13.dex */
public class C4221x9c23eacb {

    /* renamed from: mKey */
    private static java.lang.String f16251x32b2b2 = "";

    /* renamed from: sLoadLibrary */
    private static boolean f16252xc38eba82 = true;

    /* renamed from: getKey */
    public static java.lang.String m34932xb5884f29() {
        return f16251x32b2b2;
    }

    /* renamed from: isLoadLibraryEnabled */
    public static boolean m34933x204ddf56() {
        return f16252xc38eba82;
    }

    /* renamed from: setKey */
    public static boolean m34934xca02769d(java.lang.String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        f16251x32b2b2 = str;
        return true;
    }

    /* renamed from: setLoadLibraryEnabled */
    public static void m34935xf827308e(boolean z17) {
        f16252xc38eba82 = z17;
    }
}
