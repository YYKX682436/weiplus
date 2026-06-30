package com.tencent.map.sdk.utilities.visualization.datamodels;

/* loaded from: classes13.dex */
public class ScatterLatLng implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> CREATOR = new android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng.1
        private static com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng a(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[] newArray(int i17) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[i17];
        }

        private static com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[] a(int i17) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng[i17];
        }
    };
    private static final double DEFAULT_INTENSITY = 1.0d;
    private static final int DEFAULT_TYPE = 0;
    private double mIntensity;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mPoint;
    private int mType;

    public ScatterLatLng(android.os.Parcel parcel) {
        this.mPoint = (com.tencent.tencentmap.mapsdk.maps.model.LatLng) parcel.readParcelable(com.tencent.tencentmap.mapsdk.maps.model.LatLng.class.getClassLoader());
        this.mType = parcel.readInt();
        this.mIntensity = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mPoint;
        if (latLng != null) {
            com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng scatterLatLng = (com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng) obj;
            return latLng.equals(scatterLatLng.mPoint) && this.mType == scatterLatLng.mType && this.mIntensity == scatterLatLng.mIntensity;
        }
        com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng scatterLatLng2 = (com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng) obj;
        return scatterLatLng2.mPoint == null && this.mType == scatterLatLng2.mType && this.mIntensity == scatterLatLng2.mIntensity;
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getPoint() {
        return this.mPoint;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        int i17;
        double d17;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mPoint;
        if (latLng != null) {
            i17 = latLng.hashCode() + ((int) (this.mType * 1000000.0d));
            d17 = this.mIntensity;
        } else {
            i17 = (int) (this.mType * 1000000.0d);
            d17 = this.mIntensity;
        }
        return i17 + ((int) (d17 * 1000000.0d));
    }

    public void setIntensity(double d17) {
        this.mIntensity = d17;
    }

    public void setPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mPoint = latLng;
    }

    public void setType(int i17) {
        this.mType = i17;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.mPoint, i17);
        parcel.writeInt(this.mType);
        parcel.writeDouble(this.mIntensity);
    }

    public ScatterLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, int i17) {
        setPoint(latLng);
        setType(i17);
        setIntensity(1.0d);
    }

    public ScatterLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, double d17) {
        setPoint(latLng);
        setType(0);
        setIntensity(d17);
    }

    public ScatterLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, int i17, double d17) {
        setPoint(latLng);
        setType(i17);
        setIntensity(d17);
    }

    public ScatterLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this(latLng, 0, 1.0d);
    }
}
