package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class my extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv {

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my f131999b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f132000c = "com.tencent.tencentmap.mapsdk.maps.offlinemap";

    private my(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f131991a = context.getSharedPreferences(f132000c, 0);
        if (f131999b != null) {
            a(new java.lang.String[]{"taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon", "worldTileCount", "rttConfigVersion", "rttConfigMd5", "closeRoadSytleNomalModeVersion", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeVersion", "closeRoadStyleTrafficModeMd5", "offlineCityListVersion", "offlineCityListMd5"});
            java.lang.String a17 = a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130919e);
            if (a17 == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.b("4.1.0", a17) <= 0) {
                return;
            }
            a();
        }
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a(android.content.Context context) {
        if (f131999b == null) {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.class) {
                if (f131999b == null) {
                    f131999b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my(context);
                }
            }
        }
        return f131999b;
    }

    private void b() {
        if (f131999b == null) {
            return;
        }
        a(new java.lang.String[]{"taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon", "worldTileCount", "rttConfigVersion", "rttConfigMd5", "closeRoadSytleNomalModeVersion", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeVersion", "closeRoadStyleTrafficModeMd5", "offlineCityListVersion", "offlineCityListMd5"});
        java.lang.String a17 = a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130919e);
        if (a17 != null && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.b("4.1.0", a17) > 0) {
            a();
        }
    }
}
