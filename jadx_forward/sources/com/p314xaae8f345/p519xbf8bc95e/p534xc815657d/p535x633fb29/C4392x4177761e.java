package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.BitmapDescriptor */
/* loaded from: classes13.dex */
public final class C4392x4177761e implements java.lang.Cloneable {

    /* renamed from: h, reason: collision with root package name */
    int f134018h;

    /* renamed from: mBitmap */
    android.graphics.Bitmap f17399xfca517fc;

    /* renamed from: w, reason: collision with root package name */
    int f134019w;

    public C4392x4177761e(android.graphics.Bitmap bitmap) {
        this.f134019w = 0;
        this.f134018h = 0;
        if (bitmap != null) {
            this.f134019w = bitmap.getWidth();
            this.f134018h = bitmap.getHeight();
            this.f17399xfca517fc = bitmap;
        }
    }

    /* renamed from: getBitmap */
    public android.graphics.Bitmap m37085x12501425() {
        return this.f17399xfca517fc;
    }

    /* renamed from: getHeight */
    public int m37086x1c4fb41d() {
        return this.f134018h;
    }

    /* renamed from: getWidth */
    public int m37087x755bd410() {
        return this.f134019w;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37084x5a5dd5d() {
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e(android.graphics.Bitmap.createBitmap(this.f17399xfca517fc), this.f134019w, this.f134018h);
    }

    private C4392x4177761e(android.graphics.Bitmap bitmap, int i17, int i18) {
        this.f134019w = i17;
        this.f134018h = i18;
        this.f17399xfca517fc = bitmap;
    }
}
