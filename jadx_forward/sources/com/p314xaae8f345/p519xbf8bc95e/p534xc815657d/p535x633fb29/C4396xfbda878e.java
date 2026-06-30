package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.CircleOptions */
/* loaded from: classes13.dex */
public final class C4396xfbda878e {

    /* renamed from: id, reason: collision with root package name */
    private java.lang.String f134020id;

    /* renamed from: strokeColor */
    private int f17416x7197ec0b = -16777216;

    /* renamed from: strokeWidth */
    private float f17418x72aeea6e = 10.0f;

    /* renamed from: isVisible */
    private boolean f17413xf94337e8 = true;

    /* renamed from: radius */
    private double f17415xc80e6c92 = 0.0d;

    /* renamed from: zIndex */
    private float f17419xd4677478 = 0.0f;

    /* renamed from: point */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17414x65e5590 = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(39.908288d, 116.397572d);

    /* renamed from: fillColor */
    private int f17411xbbf043a0 = 0;

    /* renamed from: strokeDash */
    private boolean f17417xda5ffdea = false;

    /* renamed from: dashPathEffect */
    private android.graphics.DashPathEffect f17410x1bfb9748 = null;

    /* renamed from: iLevel */
    private int f17412xb78b849b = com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828;

    /* renamed from: center */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37137xaeb2cc55(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        this.f17414x65e5590 = c4406x873d1d26;
        return this;
    }

    /* renamed from: describeContents */
    public int m37138xa7e87b05() {
        return 0;
    }

    /* renamed from: fillColor */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37139xbbf043a0(int i17) {
        this.f17411xbbf043a0 = i17;
        return this;
    }

    /* renamed from: getCenter */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37140x13c9ef4b() {
        return this.f17414x65e5590;
    }

    /* renamed from: getFillColor */
    public int m37141xbb5db4ea() {
        return this.f17411xbbf043a0;
    }

    /* renamed from: getLevel */
    public int m37142x74bf41ce() {
        return this.f17412xb78b849b;
    }

    /* renamed from: getRadius */
    public double m37143x2d258f88() {
        return this.f17415xc80e6c92;
    }

    /* renamed from: getStrokeColor */
    public int m37144x4b6e32d5() {
        return this.f17416x7197ec0b;
    }

    /* renamed from: getStrokeDash */
    public boolean m37145xc8a0b5e0() {
        return this.f17417xda5ffdea;
    }

    /* renamed from: getStrokeDashPathEffect */
    public android.graphics.DashPathEffect m37146xb1c5416() {
        return this.f17410x1bfb9748;
    }

    /* renamed from: getStrokeWidth */
    public float m37147x4c853138() {
        return this.f17418x72aeea6e;
    }

    /* renamed from: getZIndex */
    public float m37148x397e976e() {
        return this.f17419xd4677478;
    }

    /* renamed from: isVisible */
    public boolean m37149xf94337e8() {
        return this.f17413xf94337e8;
    }

    /* renamed from: level */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37150x6219b84(int i17) {
        if (i17 >= com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17475xe09ee40a && i17 <= com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828) {
            this.f17412xb78b849b = i17;
        }
        return this;
    }

    /* renamed from: radius */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37151xc80e6c92(double d17) {
        this.f17415xc80e6c92 = d17;
        return this;
    }

    /* renamed from: strokeColor */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37152x7197ec0b(int i17) {
        this.f17416x7197ec0b = i17;
        return this;
    }

    /* renamed from: strokeDash */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37153xda5ffdea(boolean z17) {
        this.f17417xda5ffdea = z17;
        return this;
    }

    /* renamed from: strokeDashPathEffect */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37154x5d5097a0(android.graphics.DashPathEffect dashPathEffect) {
        this.f17410x1bfb9748 = dashPathEffect;
        return this;
    }

    /* renamed from: strokeWidth */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37155x72aeea6e(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.f17418x72aeea6e = f17;
        return this;
    }

    /* renamed from: visible */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37156x1bd1f072(boolean z17) {
        this.f17413xf94337e8 = z17;
        return this;
    }

    /* renamed from: writeToParcel */
    public void m37157x21de5f63(android.os.Parcel parcel, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26 = this.f17414x65e5590;
        if (c4406x873d1d26 != null) {
            bundle.putDouble("lat", c4406x873d1d26.m37195x2605e9e2());
            bundle.putDouble("lng", this.f17414x65e5590.m37196x79d7af9());
        }
        parcel.writeBundle(bundle);
        parcel.writeDouble(this.f17415xc80e6c92);
        parcel.writeFloat(this.f17418x72aeea6e);
        parcel.writeInt(this.f17416x7197ec0b);
        parcel.writeInt(this.f17411xbbf043a0);
        parcel.writeFloat(this.f17419xd4677478);
        parcel.writeByte(this.f17413xf94337e8 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f134020id);
    }

    /* renamed from: zIndex */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e m37158xd4677478(float f17) {
        this.f17419xd4677478 = f17;
        return this;
    }
}
