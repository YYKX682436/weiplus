package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public class GeoPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mapsdk.raster.model.GeoPoint> CREATOR = new android.os.Parcelable.Creator<com.tencent.mapsdk.raster.model.GeoPoint>() { // from class: com.tencent.mapsdk.raster.model.GeoPoint.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.mapsdk.raster.model.GeoPoint createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.mapsdk.raster.model.GeoPoint(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.mapsdk.raster.model.GeoPoint[] newArray(int i17) {
            return new com.tencent.mapsdk.raster.model.GeoPoint[i17];
        }
    };
    private int e6Lat;
    private int e6Lon;

    public static com.tencent.mapsdk.raster.model.LatLng g2l(com.tencent.mapsdk.raster.model.GeoPoint geoPoint) {
        return new com.tencent.mapsdk.raster.model.LatLng((geoPoint.getLatitudeE6() * 1.0d) / 1000000.0d, (geoPoint.getLongitudeE6() * 1.0d) / 1000000.0d);
    }

    public com.tencent.mapsdk.raster.model.GeoPoint Copy() {
        return new com.tencent.mapsdk.raster.model.GeoPoint(this.e6Lat, this.e6Lon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        com.tencent.mapsdk.raster.model.GeoPoint geoPoint = (com.tencent.mapsdk.raster.model.GeoPoint) obj;
        return this.e6Lat == geoPoint.e6Lat && this.e6Lon == geoPoint.e6Lon;
    }

    public int getLatitudeE6() {
        return this.e6Lat;
    }

    public int getLongitudeE6() {
        return this.e6Lon;
    }

    public int hashCode() {
        return (this.e6Lon * 7) + (this.e6Lat * 11);
    }

    public void setLatitudeE6(int i17) {
        this.e6Lat = i17;
    }

    public void setLongitudeE6(int i17) {
        this.e6Lon = i17;
    }

    public java.lang.String toString() {
        return this.e6Lat + "," + this.e6Lon;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.e6Lat);
        parcel.writeInt(this.e6Lon);
    }

    public GeoPoint(int i17, int i18) {
        this.e6Lat = i17;
        this.e6Lon = i18;
    }

    private GeoPoint(android.os.Parcel parcel) {
        this.e6Lat = 0;
        this.e6Lon = 0;
        this.e6Lat = parcel.readInt();
        this.e6Lon = parcel.readInt();
    }
}
