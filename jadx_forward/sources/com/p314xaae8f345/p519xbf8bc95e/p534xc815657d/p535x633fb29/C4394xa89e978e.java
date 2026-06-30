package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.CameraPosition */
/* loaded from: classes13.dex */
public final class C4394xa89e978e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e> f17400x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e>() { // from class: com.tencent.mapsdk.raster.model.CameraPosition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(parcel.readFloat(), parcel.readFloat()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e[] newArray(int i17) {
            return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e[i17];
        }
    };

    /* renamed from: EMPTY_ZOOMLEVEL */
    private static final int f17401xab25a6df = -1;

    /* renamed from: bearing */
    private float f17402xf20877ae;

    /* renamed from: skew */
    private float f17403x35e50a;

    /* renamed from: target */
    private final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17404xcb7e7191;

    /* renamed from: zoom */
    private float f17405x3923d3;

    public C4394xa89e978e(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, float f17) {
        this(c4406x873d1d26, f17, 0.0f, 0.0f);
    }

    /* renamed from: builder */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder m37097xdc3ef9b() {
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder();
    }

    /* renamed from: fromLatLngZoom */
    public static final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e m37099x2bc6bd43(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, float f17) {
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e(c4406x873d1d26, f17);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m37100xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e)) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e) obj;
        return m37103x30959487().m37194xb2c87fbf(c4394xa89e978e.m37103x30959487()) && java.lang.Float.floatToIntBits(m37104xfb888c49()) == java.lang.Float.floatToIntBits(c4394xa89e978e.m37104xfb888c49());
    }

    /* renamed from: getBearing */
    public float m37101x2fd5b378() {
        return this.f17402xf20877ae;
    }

    /* renamed from: getSkew */
    public float m37102xfb854d80() {
        return this.f17403x35e50a;
    }

    /* renamed from: getTarget */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37103x30959487() {
        return this.f17404xcb7e7191;
    }

    /* renamed from: getZoom */
    public float m37104xfb888c49() {
        return this.f17405x3923d3;
    }

    /* renamed from: hashCode */
    public int m37105x8cdac1b() {
        return super.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m37106x9616526c() {
        return "target" + this.f17404xcb7e7191 + com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb + this.f17405x3923d3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat((float) this.f17404xcb7e7191.m37195x2605e9e2());
        parcel.writeFloat((float) this.f17404xcb7e7191.m37196x79d7af9());
        parcel.writeFloat(this.f17405x3923d3);
        parcel.writeFloat(this.f17403x35e50a);
        parcel.writeFloat(this.f17402xf20877ae);
    }

    public C4394xa89e978e(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, float f17, float f18, float f19) {
        this.f17404xcb7e7191 = c4406x873d1d26;
        this.f17405x3923d3 = f17;
        this.f17403x35e50a = f18;
        this.f17402xf20877ae = f19;
    }

    /* renamed from: builder */
    public static com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder m37098xdc3ef9b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
        return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder(c4394xa89e978e);
    }

    /* renamed from: com.tencent.mapsdk.raster.model.CameraPosition$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: target */
        private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17408xcb7e7191;

        /* renamed from: zoom */
        private float f17409x3923d3 = -1.0f;

        /* renamed from: skew */
        private float f17407x35e50a = 0.0f;

        /* renamed from: bearing */
        private float f17406xf20877ae = 0.0f;

        public Builder() {
        }

        /* renamed from: bearing */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder m37107xf20877ae(float f17) {
            this.f17406xf20877ae = f17;
            return this;
        }

        /* renamed from: build */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e m37108x59bc66e() {
            return new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e(this.f17408xcb7e7191, this.f17409x3923d3, this.f17407x35e50a, this.f17406xf20877ae);
        }

        /* renamed from: skew */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder m37109x35e50a(float f17) {
            this.f17407x35e50a = f17;
            return this;
        }

        /* renamed from: target */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder m37110xcb7e7191(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
            this.f17408xcb7e7191 = c4406x873d1d26;
            return this;
        }

        /* renamed from: zoom */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e.Builder m37111x3923d3(float f17) {
            this.f17409x3923d3 = f17;
            return this;
        }

        public Builder(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
            m37110xcb7e7191(c4394xa89e978e.m37103x30959487()).m37111x3923d3(c4394xa89e978e.m37104xfb888c49());
        }
    }
}
