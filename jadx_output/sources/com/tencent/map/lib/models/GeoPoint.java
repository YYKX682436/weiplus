package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class GeoPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.map.lib.models.GeoPoint> CREATOR = new android.os.Parcelable.Creator<com.tencent.map.lib.models.GeoPoint>() { // from class: com.tencent.map.lib.models.GeoPoint.1
        private static com.tencent.map.lib.models.GeoPoint a(android.os.Parcel parcel) {
            return new com.tencent.map.lib.models.GeoPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.map.lib.models.GeoPoint createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.map.lib.models.GeoPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.map.lib.models.GeoPoint[] newArray(int i17) {
            return new com.tencent.map.lib.models.GeoPoint[i17];
        }

        private static com.tencent.map.lib.models.GeoPoint[] a(int i17) {
            return new com.tencent.map.lib.models.GeoPoint[i17];
        }
    };
    private int mLatitudeE6;
    private int mLongitudeE6;

    public static com.tencent.map.lib.models.GeoPoint formString(java.lang.String str) {
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint();
        if (str != null) {
            try {
                java.lang.String[] split = str.split(",");
                if (split != null && split.length == 2) {
                    geoPoint.mLatitudeE6 = java.lang.Integer.parseInt(split[0]);
                    geoPoint.mLongitudeE6 = java.lang.Integer.parseInt(split[1]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return geoPoint;
    }

    public static com.tencent.map.lib.models.GeoPoint from(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new com.tencent.map.lib.models.GeoPoint(latLng);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.map.lib.models.GeoPoint) {
            com.tencent.map.lib.models.GeoPoint geoPoint = (com.tencent.map.lib.models.GeoPoint) obj;
            if (this.mLatitudeE6 == geoPoint.mLatitudeE6 && this.mLongitudeE6 == geoPoint.mLongitudeE6) {
                return true;
            }
        }
        return false;
    }

    public int getLatitudeE6() {
        return this.mLatitudeE6;
    }

    public int getLongitudeE6() {
        return this.mLongitudeE6;
    }

    public void setGeoPoint(com.tencent.map.lib.models.GeoPoint geoPoint) {
        this.mLatitudeE6 = geoPoint.getLatitudeE6();
        this.mLongitudeE6 = geoPoint.getLongitudeE6();
    }

    public void setLatitudeE6(int i17) {
        this.mLatitudeE6 = i17;
    }

    public void setLongitudeE6(int i17) {
        this.mLongitudeE6 = i17;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng toLatLng() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.mLatitudeE6 / 1000000.0d, this.mLongitudeE6 / 1000000.0d);
    }

    public android.graphics.Point toPoint() {
        return new android.graphics.Point(getLongitudeE6(), getLatitudeE6());
    }

    public java.lang.String toString() {
        return this.mLatitudeE6 + "," + this.mLongitudeE6;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.mLatitudeE6);
        parcel.writeInt(this.mLongitudeE6);
    }

    public GeoPoint() {
        this.mLatitudeE6 = -85000001;
        this.mLongitudeE6 = -180000001;
    }

    public static java.util.List<com.tencent.map.lib.models.GeoPoint> from(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = list.get(i17);
                if (latLng != null) {
                    arrayList.add(from(latLng));
                }
            }
            return arrayList;
        }
        return new java.util.ArrayList(0);
    }

    public GeoPoint(com.tencent.map.lib.models.GeoPoint geoPoint) {
        this();
        this.mLatitudeE6 = geoPoint.mLatitudeE6;
        this.mLongitudeE6 = geoPoint.mLongitudeE6;
    }

    public GeoPoint(int i17, int i18) {
        this.mLatitudeE6 = i17;
        this.mLongitudeE6 = i18;
    }

    public GeoPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mLatitudeE6 = (int) (latLng.latitude * 1000000.0d);
        this.mLongitudeE6 = (int) (latLng.longitude * 1000000.0d);
    }

    private GeoPoint(android.os.Parcel parcel) {
        this.mLatitudeE6 = parcel.readInt();
        this.mLongitudeE6 = parcel.readInt();
    }
}
