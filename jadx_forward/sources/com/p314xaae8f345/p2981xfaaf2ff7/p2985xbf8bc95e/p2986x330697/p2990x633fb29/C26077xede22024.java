package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions */
/* loaded from: classes13.dex */
public class C26077xede22024 {

    /* renamed from: COLOR_DEFAULT_POLYGON */
    private static final int f49668x30f6e000 = android.graphics.Color.argb(200, 0, 163, 255);

    /* renamed from: pattern */
    private java.util.List<java.lang.Integer> f49678xd0d8eb90;

    /* renamed from: texture */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f49679xab7dd51b;

    /* renamed from: textureSpacing */
    private int f49680x1841c2a8;

    /* renamed from: iLevel */
    private int f49673xb78b849b = 2;

    /* renamed from: fStrokeWidth */
    private float f49670xe6e07628 = 1.0f;

    /* renamed from: iStrokeColor */
    private int f49674xfcde67e2 = -16777216;

    /* renamed from: mClickable */
    private boolean f49677x59ca0f5 = true;

    /* renamed from: iFillColor */
    private int f49672x6581c937 = f49668x30f6e000;

    /* renamed from: iZindex */
    private int f49675x51fd9e61 = 0;

    /* renamed from: boIsVisble */
    private boolean f49669xc92a0672 = true;

    /* renamed from: listPts */
    private final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> f49676xad85d71 = new java.util.ArrayList();

    /* renamed from: holePts */
    private final java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> f49671x41130e0f = new java.util.ArrayList();

    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 add(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (c26041x873d1d26 != null) {
            this.f49676xad85d71.add(c26041x873d1d26);
        }
        return this;
    }

    /* renamed from: addAll */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99827xab35b940(java.lang.Iterable<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> iterable) {
        if (iterable != null) {
            java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> it = iterable.iterator();
            while (it.hasNext()) {
                this.f49676xad85d71.add(it.next());
            }
        }
        return this;
    }

    /* renamed from: clickable */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99828x8ae556e2(boolean z17) {
        this.f49677x59ca0f5 = z17;
        return this;
    }

    /* renamed from: fillColor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99829xbbf043a0(int i17) {
        this.f49672x6581c937 = i17;
        return this;
    }

    /* renamed from: getFillColor */
    public int m99830xbb5db4ea() {
        return this.f49672x6581c937;
    }

    /* renamed from: getHolePoints */
    public java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> m99831xb66865b9() {
        return this.f49671x41130e0f;
    }

    /* renamed from: getLevel */
    public int m99832x74bf41ce() {
        return this.f49673xb78b849b;
    }

    /* renamed from: getPattern */
    public java.util.List<java.lang.Integer> m99833xea6275a() {
        return this.f49678xd0d8eb90;
    }

    /* renamed from: getPoints */
    public java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> m99834x2a837fd9() {
        return this.f49676xad85d71;
    }

    /* renamed from: getStrokeColor */
    public int m99835x4b6e32d5() {
        return this.f49674xfcde67e2;
    }

    /* renamed from: getStrokeWidth */
    public float m99836x4c853138() {
        return this.f49670xe6e07628;
    }

    /* renamed from: getTexture */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99837xe94b10e5() {
        return this.f49679xab7dd51b;
    }

    /* renamed from: getTextureSpacing */
    public int m99838x6d98f9e() {
        return this.f49680x1841c2a8;
    }

    /* renamed from: getZIndex */
    public float m99839x397e976e() {
        return this.f49675x51fd9e61;
    }

    /* renamed from: isClickable */
    public boolean m99840xd12298d8() {
        return this.f49677x59ca0f5;
    }

    /* renamed from: isValid */
    public boolean m99841x7b953cf2() {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list = this.f49676xad85d71;
        return list != null && list.size() > 2;
    }

    /* renamed from: isVisible */
    public boolean m99842xf94337e8() {
        return this.f49669xc92a0672;
    }

    /* renamed from: level */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99843x6219b84(int i17) {
        if (i17 >= 0 && i17 <= 2) {
            this.f49673xb78b849b = i17;
        }
        return this;
    }

    /* renamed from: pattern */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99844xd0d8eb90(java.util.List<java.lang.Integer> list) {
        this.f49678xd0d8eb90 = list;
        this.f49679xab7dd51b = null;
        return this;
    }

    /* renamed from: setHolePoints */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99845xe48cb3c5(java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> list) {
        this.f49671x41130e0f.clear();
        if (list == null) {
            return this;
        }
        this.f49671x41130e0f.addAll(list);
        return this;
    }

    /* renamed from: setPoints */
    public void m99846x1db8b3e5(java.lang.Iterable<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> iterable) {
        this.f49676xad85d71.clear();
        if (iterable == null) {
            return;
        }
        m99827xab35b940(iterable);
    }

    /* renamed from: strokeColor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99847x7197ec0b(int i17) {
        this.f49674xfcde67e2 = i17;
        this.f49679xab7dd51b = null;
        return this;
    }

    /* renamed from: strokeWidth */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99848x72aeea6e(float f17) {
        if (f17 < 0.0f) {
            this.f49670xe6e07628 = 1.0f;
        } else {
            this.f49670xe6e07628 = f17;
        }
        return this;
    }

    /* renamed from: texture */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99849xab7dd51b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e) {
        this.f49679xab7dd51b = c26010x4177761e;
        return this;
    }

    /* renamed from: textureSpacing */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99850x1841c2a8(int i17) {
        this.f49680x1841c2a8 = i17;
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m99851x9616526c() {
        return "PolygonOptions{listPts=" + this.f49676xad85d71 + ", iFillColor=" + this.f49672x6581c937 + ", iZindex=" + this.f49675x51fd9e61 + ", boIsVisble=" + this.f49669xc92a0672 + ", mClickable=" + this.f49677x59ca0f5 + ", holePts=" + this.f49671x41130e0f + ", fStrokeWidth=" + this.f49670xe6e07628 + ", iStrokeColor=" + this.f49674xfcde67e2 + ", pattern=" + this.f49678xd0d8eb90 + ", texture=" + this.f49679xab7dd51b + ", textureSpacing=" + this.f49680x1841c2a8 + ", iLevel=" + this.f49673xb78b849b + '}';
    }

    /* renamed from: visible */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99852x1bd1f072(boolean z17) {
        this.f49669xc92a0672 = z17;
        return this;
    }

    /* renamed from: zIndex */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 m99853xd4677478(int i17) {
        this.f49675x51fd9e61 = i17;
        return this;
    }

    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 add(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26... c26041x873d1d26Arr) {
        if (c26041x873d1d26Arr != null) {
            this.f49676xad85d71.addAll(java.util.Arrays.asList(c26041x873d1d26Arr));
        }
        return this;
    }

    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 add(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        if (list != null) {
            this.f49676xad85d71.addAll(list);
        }
        return this;
    }
}
