package com.tencent.map.sdk.utilities.heatmap;

/* loaded from: classes13.dex */
public class WeightedLatLng extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng {
    public static final android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.heatmap.WeightedLatLng> CREATOR = new android.os.Parcelable.Creator<com.tencent.map.sdk.utilities.heatmap.WeightedLatLng>() { // from class: com.tencent.map.sdk.utilities.heatmap.WeightedLatLng.1
        private static com.tencent.map.sdk.utilities.heatmap.WeightedLatLng a(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.heatmap.WeightedLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.tencent.map.sdk.utilities.heatmap.WeightedLatLng createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.map.sdk.utilities.heatmap.WeightedLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.tencent.map.sdk.utilities.heatmap.WeightedLatLng[] newArray(int i17) {
            return new com.tencent.map.sdk.utilities.heatmap.WeightedLatLng[i17];
        }

        private static com.tencent.map.sdk.utilities.heatmap.WeightedLatLng[] a(int i17) {
            return new com.tencent.map.sdk.utilities.heatmap.WeightedLatLng[i17];
        }
    };

    public WeightedLatLng(android.os.Parcel parcel) {
        super(parcel);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.map.sdk.utilities.heatmap.WeightedLatLng)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng point = getPoint();
        double intensity = getIntensity();
        if (point != null) {
            com.tencent.map.sdk.utilities.heatmap.WeightedLatLng weightedLatLng = (com.tencent.map.sdk.utilities.heatmap.WeightedLatLng) obj;
            return point.equals(weightedLatLng.getPoint()) && intensity == weightedLatLng.getIntensity();
        }
        com.tencent.map.sdk.utilities.heatmap.WeightedLatLng weightedLatLng2 = (com.tencent.map.sdk.utilities.heatmap.WeightedLatLng) obj;
        return weightedLatLng2.getPoint() == null && intensity == weightedLatLng2.getIntensity();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
    }

    public WeightedLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, double d17) {
        super(latLng, d17);
    }

    public WeightedLatLng(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        super(latLng);
    }
}
