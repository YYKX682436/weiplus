package com.p314xaae8f345.p3085x8ea91595.p3105x36f002;

/* renamed from: com.tencent.tmassistantsdk.util.QUABuilder */
/* loaded from: classes13.dex */
public final class C26779x571e923e {

    /* renamed from: mAdrRelease */
    public java.lang.String f56846x3d40eca5;

    /* renamed from: mBuildNo */
    public java.lang.String f56847xabdc9fa2;

    /* renamed from: mChannel */
    public java.lang.String f56848xca242fd6;

    /* renamed from: mChannelId */
    public java.lang.String f56849xd1d79b91;

    /* renamed from: mDeviceHeight */
    public int f56850x4ca71c2a;

    /* renamed from: mDeviceWidth */
    public int f56851x4da0b663;

    /* renamed from: mRootStatus */
    public int f56852x85ba83c1;
    public java.lang.String mUA;

    /* renamed from: mVersionName */
    public java.lang.String f56853xd31cf0d6;

    /* renamed from: getAppSpec */
    private java.lang.String m105517xe7a2946() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0");
        stringBuffer.append(this.f56853xd31cf0d6.subSequence(0, 1));
        stringBuffer.append(this.f56847xabdc9fa2);
        return stringBuffer.toString();
    }

    public java.lang.String get() {
        java.lang.String m105517xe7a2946 = m105517xe7a2946();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("TMASDK_");
        stringBuffer.append(this.f56853xd31cf0d6);
        if (!android.text.TextUtils.isEmpty(this.f56848xca242fd6)) {
            stringBuffer.append("_");
            stringBuffer.append(this.f56848xca242fd6);
        }
        stringBuffer.append("/");
        stringBuffer.append(m105517xe7a2946);
        stringBuffer.append("&NA/");
        stringBuffer.append(m105517xe7a2946);
        stringBuffer.append("&");
        stringBuffer.append(this.f56846x3d40eca5);
        stringBuffer.append("_");
        stringBuffer.append(this.f56852x85ba83c1);
        stringBuffer.append("&");
        stringBuffer.append(this.f56851x4da0b663 / 16);
        stringBuffer.append("_");
        stringBuffer.append(this.f56850x4ca71c2a / 16);
        stringBuffer.append("_14&");
        stringBuffer.append(this.mUA);
        stringBuffer.append("&");
        stringBuffer.append(this.f56849xd1d79b91);
        stringBuffer.append("&NA&V3");
        return stringBuffer.toString();
    }
}
