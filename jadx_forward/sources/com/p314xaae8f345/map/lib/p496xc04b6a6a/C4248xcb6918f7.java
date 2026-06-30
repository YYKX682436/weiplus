package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.GroundOverlayInfo */
/* loaded from: classes13.dex */
public class C4248xcb6918f7 {

    /* renamed from: mBitmap */
    protected android.graphics.Bitmap f16485xfca517fc;

    /* renamed from: mBitmapHeight */
    protected int f16486x6f77a843;

    /* renamed from: mBitmapWidth */
    protected int f16487x14f1c32a;

    /* renamed from: mLatLngBounds */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b f16488x591cd068;

    /* renamed from: mZIndex */
    protected int f16491x23d39b45;

    /* renamed from: mAlpha */
    protected float f16484xbdc6fcf1 = 1.0f;

    /* renamed from: mVisibility */
    protected boolean f16490x4fe85b5f = true;

    /* renamed from: mLevel */
    protected int f16489xbe5ee717 = 1;

    /* renamed from: checkValid */
    public boolean m35339xe0939fd4() {
        return this.f16485xfca517fc != null;
    }

    /* renamed from: setAlpha */
    public void m35340x52b5721c(float f17) {
        this.f16484xbdc6fcf1 = f17;
    }

    /* renamed from: setBitmap */
    public void m35341x5854831(android.graphics.Bitmap bitmap) {
        this.f16485xfca517fc = bitmap;
        if (bitmap != null) {
            this.f16487x14f1c32a = bitmap.getWidth();
            this.f16486x6f77a843 = bitmap.getHeight();
        }
    }

    /* renamed from: setLatLngBounds */
    public void m35342x58c344dd(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b) {
        this.f16488x591cd068 = c26042xcb530b7b;
    }

    /* renamed from: setLevel */
    public void m35343x534d5c42(int i17) {
        this.f16489xbe5ee717 = i17;
    }

    /* renamed from: setVisibility */
    public void m35344x901b6914(boolean z17) {
        this.f16490x4fe85b5f = z17;
    }

    /* renamed from: setZIndex */
    public void m35345x2cb3cb7a(int i17) {
        this.f16491x23d39b45 = i17;
    }
}
