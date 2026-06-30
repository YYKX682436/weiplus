package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.PolygonOptions */
/* loaded from: classes13.dex */
public final class C4413xede22024 {

    /* renamed from: pattern */
    private java.util.List<java.lang.Integer> f17479xd0d8eb90;

    /* renamed from: strokeColor */
    private int f17481x7197ec0b = -16777216;

    /* renamed from: fillColor */
    private int f17476xbbf043a0 = -16777216;

    /* renamed from: strokeWidth */
    private float f17482x72aeea6e = 10.0f;

    /* renamed from: isVisible */
    private boolean f17478xf94337e8 = true;

    /* renamed from: zIndex */
    private float f17483xd4677478 = 0.0f;

    /* renamed from: iLevel */
    private int f17477xb78b849b = com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828;

    /* renamed from: points */
    private final java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> f17480xc56c5ce3 = new java.util.ArrayList();

    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 add(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        if (c4406x873d1d26 == null) {
            return this;
        }
        this.f17480xc56c5ce3.add(c4406x873d1d26);
        return this;
    }

    /* renamed from: addAll */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 m37332xab35b940(java.lang.Iterable<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> iterable) {
        if (iterable == null) {
            return this;
        }
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> it = iterable.iterator();
        while (it.hasNext()) {
            this.f17480xc56c5ce3.add(it.next());
        }
        return this;
    }

    /* renamed from: fillColor */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 m37333xbbf043a0(int i17) {
        this.f17476xbbf043a0 = i17;
        return this;
    }

    /* renamed from: getFillColor */
    public int m37334xbb5db4ea() {
        return this.f17476xbbf043a0;
    }

    /* renamed from: getLevel */
    public int m37335x74bf41ce() {
        return this.f17477xb78b849b;
    }

    /* renamed from: getPattern */
    public java.util.List<java.lang.Integer> m37336xea6275a() {
        return this.f17479xd0d8eb90;
    }

    /* renamed from: getPoints */
    public java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26> m37337x2a837fd9() {
        return this.f17480xc56c5ce3;
    }

    /* renamed from: getStrokeColor */
    public int m37338x4b6e32d5() {
        return this.f17481x7197ec0b;
    }

    /* renamed from: getStrokeWidth */
    public float m37339x4c853138() {
        return this.f17482x72aeea6e;
    }

    /* renamed from: getZIndex */
    public float m37340x397e976e() {
        return this.f17483xd4677478;
    }

    /* renamed from: isVisible */
    public boolean m37341xf94337e8() {
        return this.f17478xf94337e8;
    }

    /* renamed from: level */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 m37342x6219b84(int i17) {
        if (i17 >= com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17475xe09ee40a && i17 <= com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828) {
            this.f17477xb78b849b = i17;
        }
        return this;
    }

    /* renamed from: pattern */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 m37343xd0d8eb90(java.util.List<java.lang.Integer> list) {
        this.f17479xd0d8eb90 = list;
        return this;
    }

    /* renamed from: strokeColor */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 m37344x7197ec0b(int i17) {
        this.f17481x7197ec0b = i17;
        return this;
    }

    /* renamed from: strokeWidth */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 m37345x72aeea6e(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.f17482x72aeea6e = f17;
        return this;
    }

    /* renamed from: visible */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 m37346x1bd1f072(boolean z17) {
        this.f17478xf94337e8 = z17;
        return this;
    }

    /* renamed from: zIndex */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 m37347xd4677478(float f17) {
        this.f17483xd4677478 = f17;
        return this;
    }

    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 add(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26... c4406x873d1d26Arr) {
        if (c4406x873d1d26Arr == null) {
            return this;
        }
        this.f17480xc56c5ce3.addAll(java.util.Arrays.asList(c4406x873d1d26Arr));
        return this;
    }
}
