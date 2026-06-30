package com.tencent.map.sdk.utilities.visualization.datamodels;

/* loaded from: classes13.dex */
public class WeightedLatLng implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> CREATOR = new android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng.1
        private static com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng a(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] newArray(int i17) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[i17];
        }

        private static com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[] a(int i17) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng[i17];
        }
    };
    private static final double DEFAULT_INTENSITY = 1.0d;
    private double mIntensity;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mPoint;

    public WeightedLatLng(android.os.Parcel parcel) {
        this.mPoint = (com.tencent.tencentmap.mapsdk.maps.model.LatLng) parcel.readParcelable(com.tencent.tencentmap.mapsdk.maps.model.LatLng.class.getClassLoader());
        this.mIntensity = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mPoint;
        if (latLng != null) {
            com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng weightedLatLng = (com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng) obj;
            return latLng.equals(weightedLatLng.mPoint) && this.mIntensity == weightedLatLng.mIntensity;
        }
        com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng weightedLatLng2 = (com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng) obj;
        return weightedLatLng2.mPoint == null && this.mIntensity == weightedLatLng2.mIntensity;
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getPoint() {
        return this.mPoint;
    }

    public int hashCode() {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mPoint;
        return latLng != null ? latLng.hashCode() + ((int) (this.mIntensity * 1000000.0d)) : (int) (this.mIntensity * 1000000.0d);
    }

    public void setIntensity(double d17) {
        if (d17 >= 0.0d) {
            this.mIntensity = d17;
        } else {
            this.mIntensity = 1.0d;
        }
    }

    public void setPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mPoint = latLng;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.mPoint, i17);
        parcel.writeDouble(this.mIntensity);
    }

    public WeightedLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, double d17) {
        setPoint(latLng);
        setIntensity(d17);
    }

    public WeightedLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this(latLng, 1.0d);
    }
}
