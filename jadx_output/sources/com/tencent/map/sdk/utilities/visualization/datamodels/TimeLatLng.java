package com.tencent.map.sdk.utilities.visualization.datamodels;

/* loaded from: classes13.dex */
public class TimeLatLng implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng> CREATOR = new android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng.1
        private static com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng a(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[] newArray(int i17) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[i17];
        }

        private static com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[] a(int i17) {
            return new com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng[i17];
        }
    };
    private static final int DEFAULT_TIME = 0;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mPoint;
    private int mTime;

    public TimeLatLng(android.os.Parcel parcel) {
        this.mPoint = (com.tencent.tencentmap.mapsdk.maps.model.LatLng) parcel.readParcelable(com.tencent.tencentmap.mapsdk.maps.model.LatLng.class.getClassLoader());
        this.mTime = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mPoint;
        if (latLng != null) {
            com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng timeLatLng = (com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng) obj;
            return latLng.equals(timeLatLng.mPoint) && this.mTime == timeLatLng.mTime;
        }
        com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng timeLatLng2 = (com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng) obj;
        return timeLatLng2.mPoint == null && this.mTime == timeLatLng2.mTime;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getPoint() {
        return this.mPoint;
    }

    public int getTime() {
        return this.mTime;
    }

    public int hashCode() {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.mPoint;
        return latLng != null ? latLng.hashCode() + ((int) (this.mTime * 1000000.0d)) : (int) (this.mTime * 1000000.0d);
    }

    public void setPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mPoint = latLng;
    }

    public void setTime(int i17) {
        if (i17 >= 0) {
            this.mTime = i17;
        } else {
            this.mTime = 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.mPoint, i17);
        parcel.writeInt(this.mTime);
    }

    public TimeLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, int i17) {
        setPoint(latLng);
        setTime(i17);
    }

    public TimeLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this(latLng, 0);
    }
}
