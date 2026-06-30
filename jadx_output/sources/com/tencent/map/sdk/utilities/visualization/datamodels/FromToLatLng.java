package com.tencent.map.sdk.utilities.visualization.datamodels;

/* loaded from: classes13.dex */
public class FromToLatLng implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng> CREATOR = new android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng.1
        private static com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng a(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[] newArray(int i17) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[i17];
        }

        private static com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[] a(int i17) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng[i17];
        }
    };
    private static final double DEFAULT_ARC = 45.0d;
    private double mArc;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mEndPoint;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mStartPoint;

    public FromToLatLng(android.os.Parcel parcel) {
        this.mStartPoint = (com.tencent.tencentmap.mapsdk.maps.model.LatLng) parcel.readParcelable(com.tencent.tencentmap.mapsdk.maps.model.LatLng.class.getClassLoader());
        this.mEndPoint = (com.tencent.tencentmap.mapsdk.maps.model.LatLng) parcel.readParcelable(com.tencent.tencentmap.mapsdk.maps.model.LatLng.class.getClassLoader());
        this.mArc = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mStartPoint;
        if (latLng == null || this.mEndPoint == null) {
            com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng fromToLatLng = (com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng) obj;
            return fromToLatLng.mStartPoint == null && this.mArc == fromToLatLng.mArc;
        }
        com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng fromToLatLng2 = (com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng) obj;
        return latLng.equals(fromToLatLng2.mStartPoint) && this.mEndPoint.equals(fromToLatLng2.mEndPoint) && this.mArc == fromToLatLng2.mArc;
    }

    public double getArc() {
        return this.mArc;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getEndPoint() {
        return this.mEndPoint;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getStartPoint() {
        return this.mStartPoint;
    }

    public int hashCode() {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mStartPoint;
        return (latLng == null || this.mEndPoint == null) ? (int) (this.mArc * 1000000.0d) : latLng.hashCode() + this.mEndPoint.hashCode() + ((int) (this.mArc * 1000000.0d));
    }

    public void setArc(double d17) {
        if (d17 <= 0.0d || d17 > 90.0d) {
            this.mArc = DEFAULT_ARC;
        } else {
            this.mArc = d17;
        }
    }

    public void setPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        this.mStartPoint = latLng;
        this.mEndPoint = latLng2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.mStartPoint, i17);
        parcel.writeParcelable(this.mEndPoint, i17);
        parcel.writeDouble(this.mArc);
    }

    private FromToLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, double d17) {
        setPoint(latLng, latLng2);
        setArc(d17);
    }

    public FromToLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        this(latLng, latLng2, DEFAULT_ARC);
    }
}
