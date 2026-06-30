package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer */
/* loaded from: classes13.dex */
public final class C25964xb9d36a6b {

    /* renamed from: EXTRA_MAP */
    private static final java.util.Map<java.lang.String, java.lang.String> f49239x97127c6d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: KEY_AGREE_PRIVACY */
    public static final java.lang.String f49240x524f1eb5 = "privacy";

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer$LibraryName */
    /* loaded from: classes6.dex */
    public enum LibraryName {
        TENCENT_MAP_ENGINE(com.tencent.mapsdk.internal.hm.b.MAP_ENGINE),
        TENCENT_MAP_VISUALIZATION(com.tencent.mapsdk.internal.hm.b.MAP_VIS);

        final com.tencent.mapsdk.internal.hm.b lib;

        LibraryName(com.tencent.mapsdk.internal.hm.b bVar) {
            this.lib = bVar;
        }
    }

    /* renamed from: addExtra */
    public static synchronized void m99175xb4ea67ef(java.lang.String str, java.lang.String str2) {
        synchronized (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.class) {
            if (f49240x524f1eb5.equals(str) && !android.text.TextUtils.isEmpty(str2)) {
                f49239x97127c6d.put(f49240x524f1eb5, str2);
            } else if (m99180x38f72186()) {
                if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                    f49239x97127c6d.put(str, str2);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(str, str2);
                }
            }
        }
    }

    /* renamed from: getAgreePrivacy */
    public static synchronized boolean m99176xc74ac1b2() {
        boolean m99180x38f72186;
        synchronized (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.class) {
            m99180x38f72186 = m99180x38f72186();
            if (!m99180x38f72186) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("请设置同意隐私协议, 需要在初始化地图之前完成");
            }
        }
        return m99180x38f72186;
    }

    /* renamed from: getDuid */
    public static synchronized java.lang.String m99177xfb7ea1e2(android.content.Context context) {
        synchronized (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.class) {
            if (!m99180x38f72186()) {
                return "undefined";
            }
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.g(context);
        }
    }

    /* renamed from: getExtra */
    public static synchronized java.lang.String m99178x74653a5a(java.lang.String str) {
        synchronized (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.class) {
            if (m99180x38f72186() && !android.text.TextUtils.isEmpty(str)) {
                return f49239x97127c6d.get(str);
            }
            return null;
        }
    }

    /* renamed from: getSuid */
    public static synchronized java.lang.String m99179xfb857373(android.content.Context context) {
        synchronized (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.class) {
            if (!m99180x38f72186()) {
                return "undefined";
            }
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.f(context);
        }
    }

    /* renamed from: isAgreePrivacy */
    private static boolean m99180x38f72186() {
        return java.lang.Boolean.parseBoolean(f49239x97127c6d.get(f49240x524f1eb5));
    }

    /* renamed from: isPreLoadLibrarySuccess */
    public static boolean m99181xc28a2e47(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.LibraryName libraryName) {
        com.tencent.mapsdk.internal.hm.a aVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hm.a().f131313a.get(libraryName.lib);
        return aVar != null && aVar.f131319f == com.tencent.mapsdk.internal.hm.c.SUCCESS;
    }

    /* renamed from: preLoadLibrary */
    public static void m99182x5f38ca52(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.LibraryName libraryName, java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hm.a().a(libraryName.lib, str, "", "");
    }

    /* renamed from: setAgreePrivacy */
    public static synchronized void m99185xfd93bcbe(boolean z17) {
        synchronized (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.class) {
            f49239x97127c6d.put(f49240x524f1eb5, java.lang.String.valueOf(z17));
        }
    }

    /* renamed from: preLoadLibrary */
    public static void m99183x5f38ca52(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.LibraryName libraryName, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hm.a().a(libraryName.lib, str, str2, str3);
    }

    /* renamed from: preLoadLibrary */
    public static void m99184x5f38ca52(java.util.Map<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.LibraryName, java.lang.String> map) {
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.LibraryName libraryName : map.keySet()) {
            m99182x5f38ca52(libraryName, map.get(libraryName));
        }
    }
}
