package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public class LatLngBounds {
    private int mVersionCode;
    private com.tencent.mapsdk.raster.model.LatLng northeast;
    private com.tencent.mapsdk.raster.model.LatLng southwest;

    public LatLngBounds(int i17, com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
        com.tencent.mapsdk.raster.model.LatLngBounds.Builder include = new com.tencent.mapsdk.raster.model.LatLngBounds.Builder().include(latLng).include(latLng2);
        this.southwest = new com.tencent.mapsdk.raster.model.LatLng(include.mSouth, include.mWest);
        this.northeast = new com.tencent.mapsdk.raster.model.LatLng(include.mNorth, include.mEast);
        this.mVersionCode = i17;
    }

    public static com.tencent.mapsdk.raster.model.LatLngBounds.Builder builder() {
        return new com.tencent.mapsdk.raster.model.LatLngBounds.Builder();
    }

    private boolean containsLatitude(double d17) {
        return this.southwest.getLatitude() <= d17 && d17 <= this.northeast.getLatitude();
    }

    private boolean containsLongitude(double d17) {
        return this.southwest.getLongitude() <= this.northeast.getLongitude() ? this.southwest.getLongitude() <= d17 && d17 <= this.northeast.getLongitude() : this.southwest.getLongitude() <= d17 || d17 <= this.northeast.getLongitude();
    }

    private boolean intersect(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds) {
        com.tencent.mapsdk.raster.model.LatLng latLng;
        if (latLngBounds == null || (latLng = latLngBounds.northeast) == null || latLngBounds.southwest == null || this.northeast == null || this.southwest == null) {
            return false;
        }
        return java.lang.Math.abs(((latLng.getLongitude() + latLngBounds.southwest.getLongitude()) - this.northeast.getLongitude()) - this.southwest.getLongitude()) < ((this.northeast.getLongitude() - this.southwest.getLongitude()) + latLngBounds.northeast.getLongitude()) - latLngBounds.southwest.getLongitude() && java.lang.Math.abs(((latLngBounds.northeast.getLatitude() + latLngBounds.southwest.getLatitude()) - this.northeast.getLatitude()) - this.southwest.getLatitude()) < ((this.northeast.getLatitude() - this.southwest.getLatitude()) + latLngBounds.northeast.getLatitude()) - latLngBounds.southwest.getLatitude();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double longitudeDistanceHeadingEast(double d17, double d18) {
        return ((d18 - d17) + 360.0d) % 360.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double longitudeDistanceHeadingWest(double d17, double d18) {
        return ((d17 - d18) + 360.0d) % 360.0d;
    }

    public boolean contains(com.tencent.mapsdk.raster.model.LatLng latLng) {
        return containsLatitude(latLng.getLatitude()) && containsLongitude(latLng.getLongitude());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mapsdk.raster.model.LatLngBounds)) {
            return false;
        }
        com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds = (com.tencent.mapsdk.raster.model.LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public com.tencent.mapsdk.raster.model.LatLng getNortheast() {
        return this.northeast;
    }

    public com.tencent.mapsdk.raster.model.LatLng getSouthwest() {
        return this.southwest;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.southwest, this.northeast});
    }

    public com.tencent.mapsdk.raster.model.LatLngBounds including(com.tencent.mapsdk.raster.model.LatLng latLng) {
        double min = java.lang.Math.min(this.southwest.getLatitude(), latLng.getLatitude());
        double max = java.lang.Math.max(this.northeast.getLatitude(), latLng.getLatitude());
        double longitude = this.northeast.getLongitude();
        double longitude2 = this.southwest.getLongitude();
        double longitude3 = latLng.getLongitude();
        if (!containsLongitude(longitude3)) {
            if (longitudeDistanceHeadingWest(longitude2, longitude3) < longitudeDistanceHeadingEast(longitude, longitude3)) {
                longitude2 = longitude3;
            } else {
                longitude = longitude3;
            }
        }
        return new com.tencent.mapsdk.raster.model.LatLngBounds(new com.tencent.mapsdk.raster.model.LatLng(min, longitude2), new com.tencent.mapsdk.raster.model.LatLng(max, longitude));
    }

    public boolean intersects(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            return false;
        }
        return intersect(latLngBounds) || latLngBounds.intersect(this);
    }

    public java.lang.String toString() {
        return "southwest" + this.southwest + "northeast" + this.northeast;
    }

    public boolean contains(com.tencent.mapsdk.raster.model.LatLngBounds latLngBounds) {
        return latLngBounds != null && contains(latLngBounds.southwest) && contains(latLngBounds.northeast);
    }

    public LatLngBounds(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    /* loaded from: classes13.dex */
    public static final class Builder {
        private double mSouth = Double.POSITIVE_INFINITY;
        private double mNorth = Double.NEGATIVE_INFINITY;
        private double mWest = Double.NaN;
        private double mEast = Double.NaN;

        private boolean containsLongitude(double d17) {
            double d18 = this.mWest;
            double d19 = this.mEast;
            return d18 <= d19 ? d18 <= d17 && d17 <= d19 : d18 <= d17 || d17 <= d19;
        }

        public com.tencent.mapsdk.raster.model.LatLngBounds build() {
            return new com.tencent.mapsdk.raster.model.LatLngBounds(new com.tencent.mapsdk.raster.model.LatLng(this.mSouth, this.mWest), new com.tencent.mapsdk.raster.model.LatLng(this.mNorth, this.mEast));
        }

        public com.tencent.mapsdk.raster.model.LatLngBounds.Builder include(com.tencent.mapsdk.raster.model.LatLng latLng) {
            this.mSouth = java.lang.Math.min(this.mSouth, latLng.getLatitude());
            this.mNorth = java.lang.Math.max(this.mNorth, latLng.getLatitude());
            double longitude = latLng.getLongitude();
            if (java.lang.Double.isNaN(this.mWest)) {
                this.mWest = longitude;
                this.mEast = longitude;
            } else if (!containsLongitude(longitude)) {
                if (com.tencent.mapsdk.raster.model.LatLngBounds.longitudeDistanceHeadingWest(this.mWest, longitude) < com.tencent.mapsdk.raster.model.LatLngBounds.longitudeDistanceHeadingEast(this.mEast, longitude)) {
                    this.mWest = longitude;
                } else {
                    this.mEast = longitude;
                }
            }
            return this;
        }

        public com.tencent.mapsdk.raster.model.LatLngBounds.Builder include(java.lang.Iterable<com.tencent.mapsdk.raster.model.LatLng> iterable) {
            if (iterable != null) {
                java.util.Iterator<com.tencent.mapsdk.raster.model.LatLng> it = iterable.iterator();
                while (it.hasNext()) {
                    include(it.next());
                }
            }
            return this;
        }
    }
}
