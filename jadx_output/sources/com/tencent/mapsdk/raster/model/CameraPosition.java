package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class CameraPosition implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mapsdk.raster.model.CameraPosition> CREATOR = new android.os.Parcelable.Creator<com.tencent.mapsdk.raster.model.CameraPosition>() { // from class: com.tencent.mapsdk.raster.model.CameraPosition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.mapsdk.raster.model.CameraPosition createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.mapsdk.raster.model.CameraPosition(new com.tencent.mapsdk.raster.model.LatLng(parcel.readFloat(), parcel.readFloat()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.mapsdk.raster.model.CameraPosition[] newArray(int i17) {
            return new com.tencent.mapsdk.raster.model.CameraPosition[i17];
        }
    };
    private static final int EMPTY_ZOOMLEVEL = -1;
    private float bearing;
    private float skew;
    private final com.tencent.mapsdk.raster.model.LatLng target;
    private float zoom;

    public CameraPosition(com.tencent.mapsdk.raster.model.LatLng latLng, float f17) {
        this(latLng, f17, 0.0f, 0.0f);
    }

    public static com.tencent.mapsdk.raster.model.CameraPosition.Builder builder() {
        return new com.tencent.mapsdk.raster.model.CameraPosition.Builder();
    }

    public static final com.tencent.mapsdk.raster.model.CameraPosition fromLatLngZoom(com.tencent.mapsdk.raster.model.LatLng latLng, float f17) {
        return new com.tencent.mapsdk.raster.model.CameraPosition(latLng, f17);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mapsdk.raster.model.CameraPosition)) {
            return false;
        }
        com.tencent.mapsdk.raster.model.CameraPosition cameraPosition = (com.tencent.mapsdk.raster.model.CameraPosition) obj;
        return getTarget().equals(cameraPosition.getTarget()) && java.lang.Float.floatToIntBits(getZoom()) == java.lang.Float.floatToIntBits(cameraPosition.getZoom());
    }

    public float getBearing() {
        return this.bearing;
    }

    public float getSkew() {
        return this.skew;
    }

    public com.tencent.mapsdk.raster.model.LatLng getTarget() {
        return this.target;
    }

    public float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public java.lang.String toString() {
        return "target" + this.target + com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM + this.zoom;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat((float) this.target.getLatitude());
        parcel.writeFloat((float) this.target.getLongitude());
        parcel.writeFloat(this.zoom);
        parcel.writeFloat(this.skew);
        parcel.writeFloat(this.bearing);
    }

    public CameraPosition(com.tencent.mapsdk.raster.model.LatLng latLng, float f17, float f18, float f19) {
        this.target = latLng;
        this.zoom = f17;
        this.skew = f18;
        this.bearing = f19;
    }

    public static com.tencent.mapsdk.raster.model.CameraPosition.Builder builder(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
        return new com.tencent.mapsdk.raster.model.CameraPosition.Builder(cameraPosition);
    }

    /* loaded from: classes13.dex */
    public static final class Builder {
        private com.tencent.mapsdk.raster.model.LatLng target;
        private float zoom = -1.0f;
        private float skew = 0.0f;
        private float bearing = 0.0f;

        public Builder() {
        }

        public com.tencent.mapsdk.raster.model.CameraPosition.Builder bearing(float f17) {
            this.bearing = f17;
            return this;
        }

        public com.tencent.mapsdk.raster.model.CameraPosition build() {
            return new com.tencent.mapsdk.raster.model.CameraPosition(this.target, this.zoom, this.skew, this.bearing);
        }

        public com.tencent.mapsdk.raster.model.CameraPosition.Builder skew(float f17) {
            this.skew = f17;
            return this;
        }

        public com.tencent.mapsdk.raster.model.CameraPosition.Builder target(com.tencent.mapsdk.raster.model.LatLng latLng) {
            this.target = latLng;
            return this;
        }

        public com.tencent.mapsdk.raster.model.CameraPosition.Builder zoom(float f17) {
            this.zoom = f17;
            return this;
        }

        public Builder(com.tencent.mapsdk.raster.model.CameraPosition cameraPosition) {
            target(cameraPosition.getTarget()).zoom(cameraPosition.getZoom());
        }
    }
}
