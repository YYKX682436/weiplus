package com.p314xaae8f345.mm.p2621x8fb0427b;

/* renamed from: com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject */
/* loaded from: classes12.dex */
public class C21048x22dc7cc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2621x8fb0427b.C21048x22dc7cc> f39203x681a0c0c = new com.p314xaae8f345.mm.p2621x8fb0427b.k3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f275237d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f275238e;

    public C21048x22dc7cc(java.lang.String str, java.lang.Object obj) {
        this.f275237d = str;
        if (obj instanceof java.util.LinkedHashMap) {
            this.f275238e = new com.p314xaae8f345.mm.p2621x8fb0427b.l3(obj);
        } else {
            this.f275238e = obj;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m77911x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type = ");
        sb6.append(this.f275237d);
        sb6.append(" object = ");
        java.lang.Object obj = this.f275238e;
        sb6.append(obj != null ? obj.toString() : "");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            parcel.writeString(this.f275237d);
            parcel.writeValue(this.f275238e);
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConfigFileStorageProxyMMKV", e17, "", new java.lang.Object[0]);
        }
    }

    public C21048x22dc7cc(android.os.Parcel parcel) {
        try {
            java.lang.String readString = parcel.readString();
            this.f275237d = readString;
            try {
                if (!android.text.TextUtils.equals(readString, java.util.HashMap.class.getSimpleName()) && !android.text.TextUtils.equals(readString, java.util.HashSet.class.getSimpleName())) {
                    android.text.TextUtils.equals(readString, java.util.LinkedHashMap.class.getSimpleName());
                }
                java.lang.Object readValue = parcel.readValue(null);
                if (readValue instanceof com.p314xaae8f345.mm.p2621x8fb0427b.l3) {
                    this.f275238e = ((com.p314xaae8f345.mm.p2621x8fb0427b.l3) readValue).f276616d;
                } else {
                    this.f275238e = readValue;
                }
            } catch (java.lang.Exception e17) {
                jx3.f.INSTANCE.mo68477x336bdfd8(1041L, 44L, 1L, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConfigFileStorageProxyMMKV", e17, "MMKVTypeObject readValue error", new java.lang.Object[0]);
            }
        } catch (java.lang.RuntimeException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConfigFileStorageProxyMMKV", e18, "", new java.lang.Object[0]);
        }
    }
}
