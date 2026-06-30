package com.p314xaae8f345.p3085x8ea91595.p3105x36f002;

/* renamed from: com.tencent.tmassistantsdk.util.QUASetting */
/* loaded from: classes13.dex */
public class C26780xbfb9b0f3 {

    /* renamed from: APP_VERSION */
    protected static final java.lang.String f56854x46b7bc7a = "100";

    /* renamed from: BUILD_NO */
    protected static final java.lang.String f56855xd9605552 = "100";

    /* renamed from: ROOT_STATUS_UNKNOWN */
    public static final int f56856xec4c65da = 0;

    /* renamed from: UN_DEFINED */
    protected static final java.lang.String f56857x5caef243 = "NA";

    /* renamed from: mChannelId */
    protected static java.lang.String f56858xd1d79b91 = "NA";

    /* renamed from: mContext */
    protected android.content.Context f56859xd6cfe882;

    public C26780xbfb9b0f3(android.content.Context context) {
        this.f56859xd6cfe882 = context;
    }

    /* renamed from: filter */
    private java.lang.StringBuffer m105518xb408cb78(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (android.text.TextUtils.isEmpty(str)) {
            stringBuffer.append(f56857x5caef243);
            return stringBuffer;
        }
        for (char c17 : str.toCharArray()) {
            if (c17 > ' ' && c17 != '/' && c17 != '_' && c17 != '&' && c17 != '|' && c17 != '-') {
                stringBuffer.append(c17);
            }
        }
        return stringBuffer;
    }

    /* renamed from: getAndroidVersion */
    private java.lang.String m105519x1737005f() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (android.text.TextUtils.isEmpty(str)) {
            stringBuffer.append(f56857x5caef243);
        } else {
            stringBuffer.append(str);
        }
        stringBuffer.append("_");
        stringBuffer.append(android.os.Build.VERSION.SDK_INT);
        return stringBuffer.toString();
    }

    /* renamed from: getBuildNo */
    public static java.lang.String m105520x4b912899() {
        return "100";
    }

    /* renamed from: getDeviceHeight */
    private int m105521x16049593() {
        return this.f56859xd6cfe882.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: getDeviceWidth */
    private int m105522x7d69ebda() {
        return this.f56859xd6cfe882.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: getRootStatus */
    private int m105523x97c9436a() {
        return 0;
    }

    /* renamed from: getUA */
    private java.lang.String m105524x5db1c62() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(m105518xb408cb78(android.os.Build.BRAND));
        stringBuffer.append("_");
        stringBuffer.append(m105518xb408cb78(wo.w0.m()));
        return stringBuffer.toString();
    }

    /* renamed from: buildQUA */
    public java.lang.String m105525xaab9b56f() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26779x571e923e c26779x571e923e = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26779x571e923e();
        c26779x571e923e.f56847xabdc9fa2 = m105520x4b912899();
        c26779x571e923e.f56848xca242fd6 = "";
        c26779x571e923e.f56849xd1d79b91 = f56858xd1d79b91;
        c26779x571e923e.f56846x3d40eca5 = m105519x1737005f();
        c26779x571e923e.f56850x4ca71c2a = m105521x16049593();
        c26779x571e923e.f56851x4da0b663 = m105522x7d69ebda();
        c26779x571e923e.f56852x85ba83c1 = m105523x97c9436a();
        c26779x571e923e.mUA = m105524x5db1c62();
        c26779x571e923e.f56853xd31cf0d6 = "100";
        return c26779x571e923e.get();
    }
}
