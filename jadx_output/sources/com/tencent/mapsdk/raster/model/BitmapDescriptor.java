package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class BitmapDescriptor implements java.lang.Cloneable {

    /* renamed from: h, reason: collision with root package name */
    int f52485h;
    android.graphics.Bitmap mBitmap;

    /* renamed from: w, reason: collision with root package name */
    int f52486w;

    public BitmapDescriptor(android.graphics.Bitmap bitmap) {
        this.f52486w = 0;
        this.f52485h = 0;
        if (bitmap != null) {
            this.f52486w = bitmap.getWidth();
            this.f52485h = bitmap.getHeight();
            this.mBitmap = bitmap;
        }
    }

    public android.graphics.Bitmap getBitmap() {
        return this.mBitmap;
    }

    public int getHeight() {
        return this.f52485h;
    }

    public int getWidth() {
        return this.f52486w;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.mapsdk.raster.model.BitmapDescriptor m44clone() {
        return new com.tencent.mapsdk.raster.model.BitmapDescriptor(android.graphics.Bitmap.createBitmap(this.mBitmap), this.f52486w, this.f52485h);
    }

    private BitmapDescriptor(android.graphics.Bitmap bitmap, int i17, int i18) {
        this.f52486w = i17;
        this.f52485h = i18;
        this.mBitmap = bitmap;
    }
}
