package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ir extends com.tencent.mapsdk.internal.im {

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.map.lib.models.GeoPoint f49923i = null;

    /* renamed from: j, reason: collision with root package name */
    private com.tencent.map.lib.models.GeoPoint f49924j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f49925k;

    public ir(com.tencent.map.lib.models.GeoPoint geoPoint) {
        this.f49924j = null;
        this.f49925k = false;
        if (geoPoint != null) {
            this.f49924j = new com.tencent.map.lib.models.GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
            this.f49925k = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        com.tencent.map.lib.models.GeoPoint geoPoint = this.f49924j;
        if (geoPoint == null || this.f49923i == null) {
            return;
        }
        int latitudeE6 = geoPoint.getLatitudeE6() - this.f49923i.getLatitudeE6();
        int longitudeE6 = this.f49924j.getLongitudeE6() - this.f49923i.getLongitudeE6();
        float interpolation = interpolator.getInterpolation(f17);
        int latitudeE62 = this.f49923i.getLatitudeE6() + ((int) (latitudeE6 * interpolation));
        int longitudeE62 = this.f49923i.getLongitudeE6() + ((int) (longitudeE6 * interpolation));
        if (1.0f - f17 < 1.0E-4d) {
            latitudeE62 = this.f49924j.getLatitudeE6();
            longitudeE62 = this.f49924j.getLongitudeE6();
        }
        com.tencent.mapsdk.internal.im.b bVar = this.f49910h;
        if (bVar != null) {
            bVar.a(latitudeE62, longitudeE62);
        }
    }

    @Override // com.tencent.mapsdk.internal.im
    public final boolean a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        if (!super.a((com.tencent.map.lib.models.GeoPoint) null, (com.tencent.map.lib.models.GeoPoint) null)) {
            return false;
        }
        if (geoPoint != null) {
            this.f49923i = new com.tencent.map.lib.models.GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        }
        if (this.f49925k || geoPoint2 == null) {
            return true;
        }
        this.f49924j = new com.tencent.map.lib.models.GeoPoint(geoPoint2.getLatitudeE6(), geoPoint2.getLongitudeE6());
        return true;
    }
}
