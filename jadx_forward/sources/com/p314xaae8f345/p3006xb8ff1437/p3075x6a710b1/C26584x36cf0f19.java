package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPUrlAnalyzer */
/* loaded from: classes4.dex */
public class C26584x36cf0f19 {

    /* renamed from: TP_URL_PROTOCOL_TYPE_FILE */
    public static final int f55392xefe8fc8d = 4;

    /* renamed from: TP_URL_PROTOCOL_TYPE_HTTP */
    public static final int f55393xefea0f99 = 0;

    /* renamed from: TP_URL_PROTOCOL_TYPE_HTTPS */
    public static final int f55394xd57e3da = 1;

    /* renamed from: TP_URL_PROTOCOL_TYPE_RESOURCELOADER */
    public static final int f55395xc56b4372 = 5;

    /* renamed from: TP_URL_PROTOCOL_TYPE_RTMP */
    public static final int f55396xefee9a76 = 2;

    /* renamed from: TP_URL_PROTOCOL_TYPE_UNKNOWN */
    public static final int f55397xbbe28379 = -1;

    /* renamed from: TP_URL_PROTOCOL_TYPE_WEBRTC */
    public static final int f55398xb661c15e = 3;

    /* renamed from: mPrefixToTypeMap */
    private static java.util.Map<java.lang.String, java.lang.Integer> f55399x549a5628;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.utils.TPUrlAnalyzer$TPUrlType */
    /* loaded from: classes6.dex */
    public @interface TPUrlType {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f55399x549a5628 = hashMap;
        hashMap.put("http://", 0);
        f55399x549a5628.put("https://", 1);
        f55399x549a5628.put("rtmp://", 2);
        f55399x549a5628.put("webrtc://", 3);
        f55399x549a5628.put("file://", 4);
        f55399x549a5628.put("/", 4);
    }

    /* renamed from: getUrlProtocolType */
    public static int m104433x3d18c2cb(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        java.lang.String lowerCase = str.toLowerCase();
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : f55399x549a5628.entrySet()) {
            if (lowerCase.startsWith(entry.getKey())) {
                return entry.getValue().intValue();
            }
        }
        return new java.io.File(str).exists() ? 4 : -1;
    }
}
