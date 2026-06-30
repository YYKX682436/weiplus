package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.BubbleOptions */
/* loaded from: classes13.dex */
public class C26013x2716a452 {

    /* renamed from: mContent */
    private java.lang.String f49364xd6cfe74c;

    /* renamed from: mContentView */
    private android.view.View f49365x92dc1011;

    /* renamed from: mMarker */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a f49367xef8bb07;

    /* renamed from: mPosition */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49373x519040b6;

    /* renamed from: mMarkerWidth */
    private int f49371xb7314eff = 0;

    /* renamed from: mMarkerHeight */
    private int f49370x1529970e = 0;

    /* renamed from: mMarkerAnchorU */
    private float f49368x2cc54b39 = 0.5f;

    /* renamed from: mMarkerAnchorV */
    private float f49369x2cc54b3a = 0.5f;

    /* renamed from: mDisplayLevel */
    private int f49366xf6c9d4ef = 0;

    /* renamed from: mBackground */
    private android.graphics.drawable.Drawable[] f49363x8cca4d7b = null;

    /* renamed from: mOnTapHidden */
    private boolean f49372xd9191161 = false;

    /* renamed from: background */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99355xb098552e(android.graphics.drawable.Drawable[] drawableArr) {
        this.f49363x8cca4d7b = drawableArr;
        return this;
    }

    /* renamed from: content */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99356x38b73479(java.lang.String str) {
        this.f49364xd6cfe74c = str;
        return this;
    }

    /* renamed from: contentView */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99357xe8cefebe(android.view.View view) {
        this.f49365x92dc1011 = view;
        return this;
    }

    /* renamed from: displayLevel */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99358x5f34bbe2(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        this.f49366xf6c9d4ef = i17;
        return this;
    }

    /* renamed from: getBackground */
    public android.graphics.drawable.Drawable[] m99359x9ed90d24() {
        return this.f49363x8cca4d7b;
    }

    /* renamed from: getContent */
    public java.lang.String m99360x76847043() {
        return this.f49364xd6cfe74c;
    }

    /* renamed from: getContentView */
    public android.view.View m99361xc2a54588() {
        return this.f49365x92dc1011;
    }

    /* renamed from: getDisplayLevel */
    public int m99362xc0274e58() {
        return this.f49366xf6c9d4ef;
    }

    /* renamed from: getMarker */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a m99363x24a3b730() {
        return this.f49367xef8bb07;
    }

    /* renamed from: getMarkerAnchorU */
    public float m99364x8f16fef0() {
        return this.f49368x2cc54b39;
    }

    /* renamed from: getMarkerAnchorV */
    public float m99365x8f16fef1() {
        return this.f49369x2cc54b3a;
    }

    /* renamed from: getMarkerHeight */
    public int m99366xde871077() {
        return this.f49370x1529970e;
    }

    /* renamed from: getMarkerWidth */
    public int m99367xe6fa8476() {
        return this.f49371xb7314eff;
    }

    /* renamed from: getOnTapHidden */
    public boolean m99368x8e246d8() {
        return this.f49372xd9191161;
    }

    /* renamed from: getPosition */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99369xa86cd69f() {
        return this.f49373x519040b6;
    }

    /* renamed from: marker */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99370xbf8c943a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a) {
        this.f49367xef8bb07 = interfaceC26059x88f1805a;
        m99373x2c929929(interfaceC26059x88f1805a.mo36440xa86cd69f());
        m99371x721eaf8f(interfaceC26059x88f1805a.mo36433xa62d00a(), interfaceC26059x88f1805a.mo36434xa62d00b());
        return this;
    }

    /* renamed from: markerAnchor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99371x721eaf8f(float f17, float f18) {
        this.f49368x2cc54b39 = f17;
        this.f49369x2cc54b3a = f18;
        return this;
    }

    /* renamed from: markerSize */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99372x427b3b5b(int i17, int i18) {
        this.f49371xb7314eff = i17;
        this.f49370x1529970e = i18;
        return this;
    }

    /* renamed from: position */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99373x2c929929(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f49373x519040b6 = c26041x873d1d26;
        return this;
    }

    /* renamed from: setOnTapHidden */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99374x9f47ba4c(boolean z17) {
        this.f49372xd9191161 = z17;
        return this;
    }

    /* renamed from: background */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26013x2716a452 m99354xb098552e(android.graphics.Bitmap[] bitmapArr) {
        if (bitmapArr != null) {
            this.f49363x8cca4d7b = new android.graphics.drawable.Drawable[4];
            int length = bitmapArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                this.f49363x8cca4d7b[i17] = new android.graphics.drawable.BitmapDrawable(bitmapArr[i17]);
            }
        }
        return this;
    }
}
