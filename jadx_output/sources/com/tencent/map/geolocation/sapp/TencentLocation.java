package com.tencent.map.geolocation.sapp;

/* loaded from: classes13.dex */
public interface TencentLocation {
    public static final int ERROR_BAD_JSON = 2;
    public static final int ERROR_NETWORK = 1;
    public static final int ERROR_OK = 0;
    public static final int ERROR_UNKNOWN = 404;
    public static final int ERROR_WGS84 = 4;
    public static final java.lang.String EXTRA_ADDRDESP_LANDMARK = "addrdesp.landmark";
    public static final java.lang.String EXTRA_ADDRDESP_OTHERS_RESULTS = "addrdesp.results";
    public static final java.lang.String EXTRA_ADDRDESP_SECOND_LANDMARK = "addrdesp.second_landmark";
    public static final java.lang.String EXTRA_DIRECTION = "direction";
    public static final java.lang.String EXTRA_RESP_JSON = "resp_json";
    public static final java.lang.String GPS_PROVIDER = "gps";
    public static final java.lang.String NETWORK_PROVIDER = "network";

    float getAccuracy();

    java.lang.String getAddress();

    double getAltitude();

    java.lang.Integer getAreaStat();

    float getBearing();

    java.lang.String getCity();

    java.lang.String getCityCode();

    int getCoordinateType();

    double getDirection();

    java.lang.String getDistrict();

    long getElapsedRealtime();

    android.os.Bundle getExtra();

    int getGPSRssi();

    java.lang.String getIndoorBuildingFloor();

    java.lang.String getIndoorBuildingId();

    int getIndoorLocationType();

    double getLatitude();

    double getLongitude();

    java.lang.String getName();

    java.lang.String getNation();

    java.util.List<com.tencent.map.geolocation.sapp.TencentPoi> getPoiList();

    java.lang.String getProvider();

    java.lang.String getProvince();

    float getSpeed();

    java.lang.String getStreet();

    java.lang.String getStreetNo();

    long getTime();

    java.lang.String getTown();

    java.lang.String getVillage();

    int isMockGps();
}
