package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface cc extends java.lang.Comparable<com.tencent.mapsdk.internal.cc> {

    /* loaded from: classes13.dex */
    public enum a {
        IDLE,
        WILL_ADD,
        WILL_UPDATE,
        WILL_REMOVE,
        PREPARING,
        ADD,
        SHOWING,
        REMOVE
    }

    java.lang.String a();

    java.lang.String a(boolean z17);

    void a(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor, boolean z17);

    boolean a(int i17, int i18);

    boolean a(com.tencent.mapsdk.internal.cc.a aVar);

    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b(boolean z17);

    com.tencent.tencentmap.mapsdk.maps.model.LatLng b();

    int c();

    com.tencent.mapsdk.internal.ge d();

    android.util.Pair<java.lang.Integer, java.lang.Integer> e();

    android.util.Pair<java.lang.Float, java.lang.Float> f();

    com.tencent.mapsdk.internal.cc.a g();
}
