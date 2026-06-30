package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class is extends com.tencent.mapsdk.internal.ib {

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.map.lib.models.GeoPoint f49926g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.map.lib.models.GeoPoint f49927h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f49928i = false;

    private is(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        this.f49926g = null;
        this.f49927h = null;
        if (geoPoint != null) {
            this.f49926g = new com.tencent.map.lib.models.GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        }
        if (geoPoint2 != null) {
            this.f49927h = new com.tencent.map.lib.models.GeoPoint(geoPoint2.getLatitudeE6(), geoPoint2.getLongitudeE6());
        }
    }

    @Override // com.tencent.mapsdk.internal.ib
    public final void a(float f17) {
        com.tencent.map.lib.models.GeoPoint geoPoint = this.f49927h;
        if (geoPoint == null || this.f49926g == null) {
            return;
        }
        int latitudeE6 = geoPoint.getLatitudeE6() - this.f49926g.getLatitudeE6();
        int longitudeE6 = this.f49927h.getLongitudeE6() - this.f49926g.getLongitudeE6();
        int latitudeE62 = this.f49926g.getLatitudeE6() + ((int) (latitudeE6 * f17));
        int longitudeE62 = this.f49926g.getLongitudeE6() + ((int) (longitudeE6 * f17));
        if (this.f49874f != null) {
            new com.tencent.map.lib.models.GeoPoint(latitudeE62, longitudeE62);
        }
    }
}
