package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class GroundOverlayInfo {
    protected android.graphics.Bitmap mBitmap;
    protected int mBitmapHeight;
    protected int mBitmapWidth;
    protected com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds mLatLngBounds;
    protected int mZIndex;
    protected float mAlpha = 1.0f;
    protected boolean mVisibility = true;
    protected int mLevel = 1;

    public boolean checkValid() {
        return this.mBitmap != null;
    }

    public void setAlpha(float f17) {
        this.mAlpha = f17;
    }

    public void setBitmap(android.graphics.Bitmap bitmap) {
        this.mBitmap = bitmap;
        if (bitmap != null) {
            this.mBitmapWidth = bitmap.getWidth();
            this.mBitmapHeight = bitmap.getHeight();
        }
    }

    public void setLatLngBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds) {
        this.mLatLngBounds = latLngBounds;
    }

    public void setLevel(int i17) {
        this.mLevel = i17;
    }

    public void setVisibility(boolean z17) {
        this.mVisibility = z17;
    }

    public void setZIndex(int i17) {
        this.mZIndex = i17;
    }
}
