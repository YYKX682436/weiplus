package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class GLModelInfo extends com.tencent.map.lib.models.OverlayListenerInfo {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    private static final int DEFAULT_MIN_ZOOM = 3;
    protected double mAltitude;
    protected int mCoordType;
    protected com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds mLatLngBounds;
    protected java.lang.String mModelFilePath;
    protected com.tencent.tencentmap.mapsdk.maps.model.LatLng mPosition;
    protected float mRotationX;
    protected float mRotationY;
    protected float mRotationZ;
    protected double mScale = 1.0d;
    protected int mAnimate = 0;
    protected int mMinZoom = 3;
    protected int mMaxZoom = 22;
    protected float opacity = 1.0f;
    protected int level = 1;
    protected int zIndex = 0;
    protected boolean visible = true;
    protected float exposure = 1.0f;
    protected boolean buildingHidden = true;
    protected boolean clickEnabled = false;
    protected int mPixelWidth = 64;
    protected int mPixelHeight = 64;
    protected boolean unlit = false;

    public void enableClick(boolean z17) {
        this.clickEnabled = z17;
    }

    public float getExposure() {
        return this.exposure;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
        return this.mPosition;
    }

    public float getRotationX() {
        return this.mRotationX;
    }

    public float getRotationY() {
        return this.mRotationY;
    }

    public float getRotationZ() {
        return this.mRotationZ;
    }

    public double getScale() {
        return this.mScale;
    }

    public boolean getUnlit() {
        return this.unlit;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setCoordType(int i17) {
        this.mCoordType = i17;
    }

    public void setExposure(float f17) {
        this.exposure = f17;
    }

    public void setLevel(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.level = i17;
        }
    }

    public void setMaxZoom(int i17) {
        if (i17 <= 22) {
            this.mMaxZoom = i17;
        } else {
            this.mMaxZoom = 22;
        }
    }

    public void setMinZoom(int i17) {
        if (i17 >= 3) {
            this.mMinZoom = i17;
        } else {
            this.mMinZoom = 3;
        }
    }

    public void setModelPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mPosition = latLng;
        this.mAltitude = latLng.getAltitude();
    }

    public void setOpacity(float f17) {
        if (f17 > 1.0f) {
            this.opacity = 1.0f;
        } else if (f17 < 0.0f) {
            this.opacity = 0.0f;
        } else {
            this.opacity = f17;
        }
    }

    public void setPixelBound(int i17, int i18) {
        this.mPixelWidth = i17;
        this.mPixelHeight = i18;
    }

    public void setRotationX(float f17) {
        this.mRotationX = f17;
    }

    public void setRotationY(float f17) {
        this.mRotationY = f17;
    }

    public void setRotationZ(float f17) {
        this.mRotationZ = f17;
    }

    public void setScale(float f17) {
        this.mScale = f17;
    }

    public void setUnlit(boolean z17) {
        this.unlit = z17;
    }

    public void setVisible(boolean z17) {
        this.visible = z17;
    }

    public void setZoomLevelRange(int i17, int i18) {
        if (i17 <= i18) {
            setMinZoom(i17);
            setMaxZoom(i18);
        }
    }

    public void setzIndex(int i17) {
        this.zIndex = i17;
    }
}
