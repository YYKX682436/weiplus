package com.tencent.map.geolocation.sapp;

/* loaded from: classes13.dex */
public final class TencentLocationRequest {
    public static final int REQUEST_DOMAIN_MODE_COMMON = 0;
    public static final int REQUEST_DOMAIN_MODE_FOREGIN = 1;
    public static final int REQUEST_DOMAIN_MODE_IOT = 2;
    public static final int REQUEST_LEVEL_ADMIN_AREA = 3;
    public static final int REQUEST_LEVEL_GEO = 0;
    public static final int REQUEST_LEVEL_NAME = 1;
    public static final int REQUEST_LEVEL_POI = 4;
    private boolean mAllowCache;
    private boolean mAllowDirection;
    private boolean mAllowGps;
    private long mExpirationTime;
    private android.os.Bundle mExtras;
    private boolean mIndoorLocationMode;
    private long mInterval;
    private int mNumUpdates;
    private java.lang.String mOpenId;
    private java.lang.String mQQ;
    private int mRequestDomainMode;
    private int mRequestLevel;
    private java.lang.String mSmallAppKey;

    private TencentLocationRequest() {
    }

    public static void copy(com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest, com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest2) {
        tencentLocationRequest.mInterval = tencentLocationRequest2.mInterval;
        tencentLocationRequest.mRequestLevel = tencentLocationRequest2.mRequestLevel;
        tencentLocationRequest.mAllowCache = tencentLocationRequest2.mAllowCache;
        tencentLocationRequest.mAllowDirection = tencentLocationRequest2.mAllowDirection;
        tencentLocationRequest.mExpirationTime = tencentLocationRequest2.mExpirationTime;
        tencentLocationRequest.mNumUpdates = tencentLocationRequest2.mNumUpdates;
        tencentLocationRequest.mIndoorLocationMode = tencentLocationRequest2.mIndoorLocationMode;
        tencentLocationRequest.mRequestDomainMode = tencentLocationRequest2.mRequestDomainMode;
        tencentLocationRequest.mAllowGps = tencentLocationRequest2.mAllowGps;
        tencentLocationRequest.mQQ = tencentLocationRequest2.mQQ;
        tencentLocationRequest.mSmallAppKey = tencentLocationRequest2.mSmallAppKey;
        tencentLocationRequest.mOpenId = tencentLocationRequest2.mOpenId;
        tencentLocationRequest.mExtras.clear();
        tencentLocationRequest.mExtras.putAll(tencentLocationRequest2.mExtras);
    }

    public static com.tencent.map.geolocation.sapp.TencentLocationRequest create() {
        com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest = new com.tencent.map.geolocation.sapp.TencentLocationRequest();
        tencentLocationRequest.mInterval = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        tencentLocationRequest.mRequestLevel = 1;
        tencentLocationRequest.mAllowCache = true;
        tencentLocationRequest.mAllowDirection = false;
        tencentLocationRequest.mIndoorLocationMode = false;
        tencentLocationRequest.mRequestDomainMode = 0;
        tencentLocationRequest.mExpirationTime = 0L;
        tencentLocationRequest.mNumUpdates = Integer.MAX_VALUE;
        tencentLocationRequest.mAllowGps = true;
        tencentLocationRequest.mQQ = "";
        tencentLocationRequest.mOpenId = "";
        tencentLocationRequest.mSmallAppKey = "";
        tencentLocationRequest.mExtras = new android.os.Bundle();
        return tencentLocationRequest;
    }

    private boolean isAllowedLevel(int i17) {
        return i17 == 0 || i17 == 1 || i17 == 3 || i17 == 4 || i17 == 7;
    }

    public java.lang.String getAndroidId() {
        java.lang.String string = this.mExtras.getString("androidId");
        return string == null ? "" : string;
    }

    public android.os.Bundle getExtras() {
        return this.mExtras;
    }

    public long getInterval() {
        return this.mInterval;
    }

    public java.lang.String getOpenId() {
        return this.mOpenId;
    }

    public java.lang.String getQQ() {
        return this.mQQ;
    }

    public int getRequestDomainMode() {
        return this.mRequestDomainMode;
    }

    public int getRequestLevel() {
        return this.mRequestLevel;
    }

    public java.lang.String getSmallAppKey() {
        return this.mSmallAppKey;
    }

    public long getmExpirationTime() {
        return this.mExpirationTime;
    }

    public boolean isAllowCache() {
        return this.mAllowCache;
    }

    public boolean isAllowDirection() {
        return this.mAllowDirection;
    }

    public boolean isAllowGPS() {
        return this.mAllowGps;
    }

    public boolean isIndoorLocationMode() {
        return this.mIndoorLocationMode;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setAllowCache(boolean z17) {
        this.mAllowCache = z17;
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setAllowDirection(boolean z17) {
        this.mAllowDirection = z17;
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setAllowGPS(boolean z17) {
        this.mAllowGps = z17;
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setAndroidId(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.mExtras.putString("androidId", str);
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setIndoorLocationMode(boolean z17) {
        this.mIndoorLocationMode = z17;
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setInterval(long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("interval should >= 0");
        }
        this.mInterval = j17;
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setLocationDomainMode(int i17) {
        this.mRequestDomainMode = i17;
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setOpenId(java.lang.String str) {
        this.mOpenId = str;
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setQQ(java.lang.String str) {
        this.mQQ = str;
        return this;
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setRequestLevel(int i17) {
        if (isAllowedLevel(i17)) {
            this.mRequestLevel = i17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("request_level: " + i17 + " not supported!");
    }

    public com.tencent.map.geolocation.sapp.TencentLocationRequest setSmallAppKey(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.mSmallAppKey = str;
        }
        return this;
    }

    public void setmExpirationTime(long j17) {
        this.mExpirationTime = j17;
    }

    public java.lang.String toString() {
        return "TencentLocationRequest {interval=" + this.mInterval + "ms,level=" + this.mRequestLevel + ",allowCache=" + this.mAllowCache + ",allowGps=" + this.mAllowGps + ",allowDirection=" + this.mAllowDirection + ",QQ=" + this.mQQ + ",DomainMode=" + this.mRequestDomainMode + ",openId=" + this.mOpenId + "}";
    }

    public TencentLocationRequest(com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest) {
        this.mInterval = tencentLocationRequest.mInterval;
        this.mRequestLevel = tencentLocationRequest.mRequestLevel;
        this.mAllowCache = tencentLocationRequest.mAllowCache;
        this.mAllowDirection = tencentLocationRequest.mAllowDirection;
        this.mExpirationTime = tencentLocationRequest.mExpirationTime;
        this.mNumUpdates = tencentLocationRequest.mNumUpdates;
        this.mAllowGps = tencentLocationRequest.mAllowGps;
        this.mIndoorLocationMode = tencentLocationRequest.mIndoorLocationMode;
        this.mRequestDomainMode = tencentLocationRequest.mRequestDomainMode;
        this.mQQ = tencentLocationRequest.mQQ;
        this.mSmallAppKey = tencentLocationRequest.mSmallAppKey;
        this.mOpenId = tencentLocationRequest.mOpenId;
        android.os.Bundle bundle = new android.os.Bundle();
        this.mExtras = bundle;
        bundle.putAll(tencentLocationRequest.mExtras);
    }
}
