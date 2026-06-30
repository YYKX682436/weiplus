package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class LatLng implements java.lang.Cloneable {

    /* renamed from: df, reason: collision with root package name */
    private static java.text.DecimalFormat f52490df = new java.text.DecimalFormat("0.000000", new java.text.DecimalFormatSymbols(java.util.Locale.US));
    private final double latitude;
    private final double longitude;

    public LatLng(double d17, double d18) {
        if (-180.0d > d18 || d18 >= 180.0d) {
            this.longitude = parseDouble(((((d18 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d);
        } else {
            this.longitude = parseDouble(d18);
        }
        this.latitude = parseDouble(java.lang.Math.max(-85.0d, java.lang.Math.min(85.0d, d17)));
    }

    private static double parseDouble(double d17) {
        return java.lang.Double.parseDouble(f52490df.format(d17));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mapsdk.raster.model.LatLng)) {
            return false;
        }
        com.tencent.mapsdk.raster.model.LatLng latLng = (com.tencent.mapsdk.raster.model.LatLng) obj;
        return java.lang.Double.doubleToLongBits(this.latitude) == java.lang.Double.doubleToLongBits(latLng.latitude) && java.lang.Double.doubleToLongBits(this.longitude) == java.lang.Double.doubleToLongBits(latLng.longitude);
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.latitude);
        int i17 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.longitude);
        return (i17 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public java.lang.String toString() {
        return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.mapsdk.raster.model.LatLng m45clone() {
        return new com.tencent.mapsdk.raster.model.LatLng(this.latitude, this.longitude);
    }
}
