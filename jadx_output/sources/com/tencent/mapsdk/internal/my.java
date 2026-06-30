package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class my extends com.tencent.mapsdk.internal.mv {

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.tencent.mapsdk.internal.my f50466b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f50467c = "com.tencent.tencentmap.mapsdk.maps.offlinemap";

    private my(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f50458a = context.getSharedPreferences(f50467c, 0);
        if (f50466b != null) {
            a(new java.lang.String[]{"taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon", "worldTileCount", "rttConfigVersion", "rttConfigMd5", "closeRoadSytleNomalModeVersion", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeVersion", "closeRoadStyleTrafficModeMd5", "offlineCityListVersion", "offlineCityListMd5"});
            java.lang.String a17 = a(com.tencent.mapsdk.internal.er.f49386e);
            if (a17 == null || com.tencent.mapsdk.internal.hn.b("4.1.0", a17) <= 0) {
                return;
            }
            a();
        }
    }

    public static com.tencent.mapsdk.internal.my a(android.content.Context context) {
        if (f50466b == null) {
            synchronized (com.tencent.mapsdk.internal.my.class) {
                if (f50466b == null) {
                    f50466b = new com.tencent.mapsdk.internal.my(context);
                }
            }
        }
        return f50466b;
    }

    private void b() {
        if (f50466b == null) {
            return;
        }
        a(new java.lang.String[]{"taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon", "worldTileCount", "rttConfigVersion", "rttConfigMd5", "closeRoadSytleNomalModeVersion", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeVersion", "closeRoadStyleTrafficModeMd5", "offlineCityListVersion", "offlineCityListMd5"});
        java.lang.String a17 = a(com.tencent.mapsdk.internal.er.f49386e);
        if (a17 != null && com.tencent.mapsdk.internal.hn.b("4.1.0", a17) > 0) {
            a();
        }
    }
}
