package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.CircleOptions */
/* loaded from: classes13.dex */
public class C26017xfbda878e {

    /* renamed from: boVisible */
    private boolean f49416x4bdf7b65;

    /* renamed from: borderType */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e.CircleBorderType f49417x6cc68186;

    /* renamed from: dRadius */
    private double f49418x3b627e16;

    /* renamed from: fStrokeWidth */
    private float f49419xe6e07628;

    /* renamed from: iFillColor */
    private int f49420x6581c937;

    /* renamed from: iLevel */
    private int f49421xb78b849b;

    /* renamed from: iStrokeColor */
    private int f49422xfcde67e2;

    /* renamed from: iZindex */
    private int f49423x51fd9e61;

    /* renamed from: latlngCenter */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49424x4b3a6d1b;

    /* renamed from: mClickable */
    private boolean f49425x59ca0f5;

    /* renamed from: pattern */
    private java.util.List<java.lang.Integer> f49426xd0d8eb90;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.CircleOptions$CircleBorderType */
    /* loaded from: classes6.dex */
    public enum CircleBorderType {
        REALLINE_DEFAULT,
        DOTTEDLINE_SQUARE,
        DOTTEDLINE_CIRCLE
    }

    public C26017xfbda878e() {
        this.f49421xb78b849b = 2;
        this.f49424x4b3a6d1b = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(39.984253d, 116.307439d);
        this.f49418x3b627e16 = 1.0d;
        this.f49419xe6e07628 = 1.0f;
        this.f49422xfcde67e2 = -16777216;
        this.f49420x6581c937 = 0;
        this.f49423x51fd9e61 = 0;
        this.f49416x4bdf7b65 = true;
        this.f49417x6cc68186 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e.CircleBorderType.REALLINE_DEFAULT;
    }

    /* renamed from: borderType */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99386x6cc68186(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e.CircleBorderType circleBorderType) {
        this.f49417x6cc68186 = circleBorderType;
        return this;
    }

    /* renamed from: center */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99387xaeb2cc55(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f49424x4b3a6d1b = c26041x873d1d26;
        return this;
    }

    /* renamed from: clickable */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99388x8ae556e2(boolean z17) {
        this.f49425x59ca0f5 = z17;
        return this;
    }

    /* renamed from: fillColor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99389xbbf043a0(int i17) {
        this.f49420x6581c937 = i17;
        return this;
    }

    /* renamed from: getBorderType */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e.CircleBorderType m99390x5b07397c() {
        return this.f49417x6cc68186;
    }

    /* renamed from: getCenter */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99391x13c9ef4b() {
        return this.f49424x4b3a6d1b;
    }

    /* renamed from: getFillColor */
    public int m99392xbb5db4ea() {
        return this.f49420x6581c937;
    }

    /* renamed from: getLevel */
    public int m99393x74bf41ce() {
        return this.f49421xb78b849b;
    }

    /* renamed from: getPattern */
    public java.util.List<java.lang.Integer> m99394xea6275a() {
        return this.f49426xd0d8eb90;
    }

    /* renamed from: getRadius */
    public double m99395x2d258f88() {
        return this.f49418x3b627e16;
    }

    /* renamed from: getStrokeColor */
    public int m99396x4b6e32d5() {
        return this.f49422xfcde67e2;
    }

    /* renamed from: getStrokeWidth */
    public float m99397x4c853138() {
        return this.f49419xe6e07628;
    }

    /* renamed from: getZIndex */
    public int m99398x397e976e() {
        return this.f49423x51fd9e61;
    }

    /* renamed from: isClickable */
    public boolean m99399xd12298d8() {
        return this.f49425x59ca0f5;
    }

    /* renamed from: isVisible */
    public boolean m99400xf94337e8() {
        return this.f49416x4bdf7b65;
    }

    /* renamed from: level */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99401x6219b84(int i17) {
        if (i17 >= 0 && i17 <= 2) {
            this.f49421xb78b849b = i17;
        }
        return this;
    }

    /* renamed from: pattern */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99402xd0d8eb90(java.util.List<java.lang.Integer> list) {
        if (list != null && list.size() == 2) {
            this.f49426xd0d8eb90 = list;
        }
        return this;
    }

    /* renamed from: radius */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99403xc80e6c92(double d17) {
        this.f49418x3b627e16 = d17;
        return this;
    }

    /* renamed from: strokeColor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99404x7197ec0b(int i17) {
        this.f49422xfcde67e2 = i17;
        return this;
    }

    /* renamed from: strokeWidth */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99405x72aeea6e(float f17) {
        if (f17 < 0.0f) {
            this.f49419xe6e07628 = 1.0f;
        } else {
            this.f49419xe6e07628 = f17;
        }
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m99406x9616526c() {
        return "CircleOptions{latlngCenter=" + this.f49424x4b3a6d1b + ", dRadius=" + this.f49418x3b627e16 + ", fStrokeWidth=" + this.f49419xe6e07628 + ", iStrokeColor=" + this.f49422xfcde67e2 + ", iFillColor=" + this.f49420x6581c937 + ", iZindex=" + this.f49423x51fd9e61 + ", boVisible=" + this.f49416x4bdf7b65 + ", mClickable=" + this.f49425x59ca0f5 + ", pattern=" + this.f49426xd0d8eb90 + ", borderType=" + this.f49417x6cc68186 + ", iLevel=" + this.f49421xb78b849b + '}';
    }

    /* renamed from: visible */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99407x1bd1f072(boolean z17) {
        this.f49416x4bdf7b65 = z17;
        return this;
    }

    /* renamed from: writeToParcel */
    public void m99408x21de5f63(android.os.Parcel parcel, int i17) {
        if (parcel == null) {
            return;
        }
        parcel.writeDouble(this.f49418x3b627e16);
    }

    /* renamed from: zIndex */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e m99409xd4677478(int i17) {
        this.f49423x51fd9e61 = i17;
        return this;
    }

    public C26017xfbda878e(int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, double d17, float f17, int i18, int i19, int i27, boolean z17) {
        this.f49421xb78b849b = 2;
        new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(39.984253d, 116.307439d);
        this.f49424x4b3a6d1b = c26041x873d1d26;
        this.f49418x3b627e16 = d17;
        this.f49419xe6e07628 = f17;
        this.f49422xfcde67e2 = i18;
        this.f49420x6581c937 = i19;
        this.f49423x51fd9e61 = i27;
        this.f49416x4bdf7b65 = z17;
    }
}
