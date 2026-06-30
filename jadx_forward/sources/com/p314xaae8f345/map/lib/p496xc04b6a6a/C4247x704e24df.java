package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.GeoPoint */
/* loaded from: classes13.dex */
public class C4247x704e24df implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> f16481x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df>() { // from class: com.tencent.map.lib.models.GeoPoint.1
        private static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[] newArray(int i17) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[i17];
        }

        private static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[] a(int i17) {
            return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[i17];
        }
    };

    /* renamed from: mLatitudeE6 */
    private int f16482xaa24424a;

    /* renamed from: mLongitudeE6 */
    private int f16483x666173d3;

    /* renamed from: formString */
    public static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df m35327xfb76b5f5(java.lang.String str) {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df();
        if (str != null) {
            try {
                java.lang.String[] split = str.split(",");
                if (split != null && split.length == 2) {
                    c4247x704e24df.f16482xaa24424a = java.lang.Integer.parseInt(split[0]);
                    c4247x704e24df.f16483x666173d3 = java.lang.Integer.parseInt(split[1]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return c4247x704e24df;
    }

    /* renamed from: from */
    public static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df m35328x3017aa(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (c26041x873d1d26 == null) {
            return null;
        }
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c26041x873d1d26);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m35330xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) obj;
            if (this.f16482xaa24424a == c4247x704e24df.f16482xaa24424a && this.f16483x666173d3 == c4247x704e24df.f16483x666173d3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getLatitudeE6 */
    public int m35331xbc3301f3() {
        return this.f16482xaa24424a;
    }

    /* renamed from: getLongitudeE6 */
    public int m35332x962aa94a() {
        return this.f16483x666173d3;
    }

    /* renamed from: setGeoPoint */
    public void m35333xe3065f41(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        this.f16482xaa24424a = c4247x704e24df.m35331xbc3301f3();
        this.f16483x666173d3 = c4247x704e24df.m35332x962aa94a();
    }

    /* renamed from: setLatitudeE6 */
    public void m35334xea574fff(int i17) {
        this.f16482xaa24424a = i17;
    }

    /* renamed from: setLongitudeE6 */
    public void m35335x2c901cbe(int i17) {
        this.f16483x666173d3 = i17;
    }

    /* renamed from: toLatLng */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35336x89192361() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(this.f16482xaa24424a / 1000000.0d, this.f16483x666173d3 / 1000000.0d);
    }

    /* renamed from: toPoint */
    public android.graphics.Point m35337xba582bd5() {
        return new android.graphics.Point(m35332x962aa94a(), m35331xbc3301f3());
    }

    /* renamed from: toString */
    public java.lang.String mo35338x9616526c() {
        return this.f16482xaa24424a + "," + this.f16483x666173d3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f16482xaa24424a);
        parcel.writeInt(this.f16483x666173d3);
    }

    public C4247x704e24df() {
        this.f16482xaa24424a = -85000001;
        this.f16483x666173d3 = -180000001;
    }

    /* renamed from: from */
    public static java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> m35329x3017aa(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i17 = 0; i17 < size; i17++) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = list.get(i17);
                if (c26041x873d1d26 != null) {
                    arrayList.add(m35328x3017aa(c26041x873d1d26));
                }
            }
            return arrayList;
        }
        return new java.util.ArrayList(0);
    }

    public C4247x704e24df(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        this();
        this.f16482xaa24424a = c4247x704e24df.f16482xaa24424a;
        this.f16483x666173d3 = c4247x704e24df.f16483x666173d3;
    }

    public C4247x704e24df(int i17, int i18) {
        this.f16482xaa24424a = i17;
        this.f16483x666173d3 = i18;
    }

    public C4247x704e24df(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f16482xaa24424a = (int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d);
        this.f16483x666173d3 = (int) (c26041x873d1d26.f49502x83009af * 1000000.0d);
    }

    private C4247x704e24df(android.os.Parcel parcel) {
        this.f16482xaa24424a = parcel.readInt();
        this.f16483x666173d3 = parcel.readInt();
    }
}
