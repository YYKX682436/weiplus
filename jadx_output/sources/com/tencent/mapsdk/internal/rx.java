package com.tencent.mapsdk.internal;

/* loaded from: classes11.dex */
public final class rx {

    /* renamed from: a, reason: collision with root package name */
    public long f51299a = android.os.SystemClock.elapsedRealtime();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds f51300b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> f51301c;

    public rx(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list) {
        this.f51300b = latLngBounds;
        this.f51301c = list;
    }

    public final java.lang.String toString() {
        return "EventData{updateTime=" + this.f51299a + ", mBound=" + this.f51300b + ", mEvents=" + this.f51301c + '}';
    }
}
