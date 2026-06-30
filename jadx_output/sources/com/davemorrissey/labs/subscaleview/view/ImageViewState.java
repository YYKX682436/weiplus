package com.davemorrissey.labs.subscaleview.view;

/* loaded from: classes15.dex */
public class ImageViewState implements java.io.Serializable {
    private float centerX;
    private float centerY;
    private int orientation;
    private float scale;

    public ImageViewState(float f17, android.graphics.PointF pointF, int i17) {
        this.scale = f17;
        this.centerX = pointF.x;
        this.centerY = pointF.y;
        this.orientation = i17;
    }

    public android.graphics.PointF getCenter() {
        return new android.graphics.PointF(this.centerX, this.centerY);
    }

    public int getOrientation() {
        return this.orientation;
    }

    public float getScale() {
        return this.scale;
    }
}
