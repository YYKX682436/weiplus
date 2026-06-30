package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig */
/* loaded from: classes13.dex */
public class C26071xee247443 {

    /* renamed from: myLocationEnabled */
    private boolean f49640x53047a80 = false;

    /* renamed from: locationSource */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 f49637xf3999830 = null;

    /* renamed from: myLocationStyle */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 f49641xc820d0b0 = null;

    /* renamed from: myLocationClickListener */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener f49639xf4712a5b = null;

    /* renamed from: myLocationChangeListener */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener f49638xdb11c865 = null;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: myLocationConfig */
        private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 f49642x20603023;

        public Builder(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 c26071xee247443) {
            if (c26071xee247443 != null) {
                this.f49642x20603023 = c26071xee247443;
            } else {
                this.f49642x20603023 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443();
            }
        }

        /* renamed from: build */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 m99787x59bc66e() {
            return this.f49642x20603023;
        }

        /* renamed from: setLocationSource */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder m99788xaa27cd32(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e06450) {
            this.f49642x20603023.f49637xf3999830 = interfaceC25954xb7e06450;
            return this;
        }

        /* renamed from: setMyLocationChangeListener */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder m99789xbaeb22e7(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener onMyLocationChangeListener) {
            this.f49642x20603023.f49638xdb11c865 = onMyLocationChangeListener;
            return this;
        }

        /* renamed from: setMyLocationClickListener */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder m99790xdaa17799(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener onMyLocationClickListener) {
            this.f49642x20603023.f49639xf4712a5b = onMyLocationClickListener;
            return this;
        }

        /* renamed from: setMyLocationEnabled */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder m99791x81cf0e3e(boolean z17) {
            this.f49642x20603023.f49640x53047a80 = z17;
            return this;
        }

        /* renamed from: setMyLocationStyle */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder m99792xe3593bee(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890) {
            this.f49642x20603023.f49641xc820d0b0 = c26072x8cb38890;
            return this;
        }
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder m99779x3136c9db() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder(null);
    }

    /* renamed from: getLocationSource */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 m99781xe2316526() {
        return this.f49637xf3999830;
    }

    /* renamed from: getMyLocationChangeListener */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener m99782xb1e59db() {
        return this.f49638xdb11c865;
    }

    /* renamed from: getMyLocationClickListener */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener m99783xc4719225() {
        return this.f49639xf4712a5b;
    }

    /* renamed from: getMyLocationStyle */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 m99784xac82a27a() {
        return this.f49641xc820d0b0;
    }

    /* renamed from: isMyLocationEnabled */
    public boolean m99785xe6336676() {
        return this.f49640x53047a80;
    }

    /* renamed from: toString */
    public java.lang.String m99786x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MyLocationConfig{myLocationEnabled=");
        sb6.append(this.f49640x53047a80);
        sb6.append(", locationSource=");
        sb6.append(this.f49637xf3999830 != null);
        sb6.append(", myLocationStyle=");
        sb6.append(this.f49641xc820d0b0 != null);
        sb6.append(", myLocationClickListener=");
        sb6.append(this.f49639xf4712a5b != null);
        sb6.append(", myLocationChangeListener=");
        sb6.append(this.f49638xdb11c865 != null);
        sb6.append('}');
        return sb6.toString();
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder m99780x3136c9db(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 c26071xee247443) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.Builder(c26071xee247443);
    }
}
