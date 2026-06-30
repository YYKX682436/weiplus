package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class nv extends com.tencent.map.lib.models.GroundOverlayInfo implements com.tencent.mapsdk.internal.ni {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions f50588a;

    public nv(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions) {
        if (groundOverlayOptions == null) {
            return;
        }
        this.f50588a = groundOverlayOptions;
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmap = groundOverlayOptions.getBitmap();
        if (bitmap != null) {
            android.graphics.Bitmap bitmap2 = bitmap.getBitmap(context);
            if (bitmap2 != null) {
                this.mBitmapWidth = bitmap2.getWidth();
                this.mBitmapHeight = bitmap2.getHeight();
            }
            this.mBitmap = bitmap2;
        }
        this.mAlpha = groundOverlayOptions.getAlpha();
        this.mVisibility = groundOverlayOptions.isVisible();
        this.mLevel = groundOverlayOptions.getLevel();
        this.mZIndex = groundOverlayOptions.getZIndex();
        if (groundOverlayOptions.getPosition() != null) {
            a();
        }
        if (groundOverlayOptions.getLatLngBounds() != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds = groundOverlayOptions.getLatLngBounds();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.writeParcelable(latLngBounds, 0);
            obtain.setDataPosition(0);
            android.os.Parcelable readParcelable = obtain.readParcelable(latLngBounds.getClass().getClassLoader());
            obtain.recycle();
            this.mLatLngBounds = (com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds) readParcelable;
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions b() {
        return this.f50588a;
    }

    public final void a() {
        if (this.f50588a.getPosition() == null) {
            return;
        }
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, this.f50588a.getAnchorU()));
        float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, this.f50588a.getAnchorV()));
        double pow = java.lang.Math.pow(2.0d, 20.0f - java.lang.Math.max(3.0f, java.lang.Math.min(22.0f, this.f50588a.getZoom())));
        com.tencent.mapsdk.internal.gg ggVar = new com.tencent.mapsdk.internal.gg(2.68435456E8d);
        com.tencent.mapsdk.internal.fu d17 = ggVar.d(this.f50588a.getPosition());
        this.mLatLngBounds = com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.builder().include(ggVar.b(new com.tencent.mapsdk.internal.fu(d17.f49467a - ((this.mBitmapWidth * max) * pow), d17.f49468b - ((this.mBitmapHeight * max2) * pow)))).include(ggVar.b(new com.tencent.mapsdk.internal.fu(d17.f49467a + (this.mBitmapWidth * (1.0d - max) * pow), d17.f49468b + (this.mBitmapHeight * (1.0d - max2) * pow)))).build();
    }
}
