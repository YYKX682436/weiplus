package com.tencent.map.geolocation.sapp;

/* loaded from: classes13.dex */
public interface TencentLocationListener {
    public static final java.lang.String CELL = "cell";
    public static final java.lang.String GPS = "gps";

    @java.lang.Deprecated
    public static final java.lang.String RADIO = "radio";
    public static final int STATUS_DENIED = 2;
    public static final int STATUS_DISABLED = 0;
    public static final int STATUS_ENABLED = 1;
    public static final int STATUS_GPS_AVAILABLE = 3;
    public static final int STATUS_GPS_UNAVAILABLE = 4;
    public static final int STATUS_LOCATION_SWITCH_OFF = 5;
    public static final int STATUS_UNKNOWN = -1;
    public static final java.lang.String WIFI = "wifi";

    void onLocationChanged(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, int i17, java.lang.String str);

    void onStatusUpdate(java.lang.String str, int i17, java.lang.String str2);
}
