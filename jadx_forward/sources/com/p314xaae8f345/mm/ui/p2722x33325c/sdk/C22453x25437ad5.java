package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.AccessToken */
/* loaded from: classes12.dex */
public final class C22453x25437ad5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5> f39602x681a0c0c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Date f290687d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f290688e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f290689f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f290690g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f290691h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Date f290692i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f290693m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f290694n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Date f290695o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f290696p;

    static {
        new java.util.Date(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        new java.util.Date();
        f39602x681a0c0c = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.a();
    }

    public C22453x25437ad5(android.os.Parcel parcel) {
        this.f290687d = new java.util.Date(parcel.readLong());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readStringList(arrayList);
        this.f290688e = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f290689f = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f290690g = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList));
        this.f290691h = parcel.readString();
        this.f290692i = new java.util.Date(parcel.readLong());
        this.f290693m = parcel.readString();
        this.f290694n = parcel.readString();
        this.f290695o = new java.util.Date(parcel.readLong());
        this.f290696p = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m80789xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5 c22453x25437ad5 = (com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5) obj;
        if (this.f290687d.equals(c22453x25437ad5.f290687d) && this.f290688e.equals(c22453x25437ad5.f290688e) && this.f290689f.equals(c22453x25437ad5.f290689f) && this.f290690g.equals(c22453x25437ad5.f290690g) && this.f290691h.equals(c22453x25437ad5.f290691h) && this.f290692i.equals(c22453x25437ad5.f290692i)) {
            java.lang.String str = c22453x25437ad5.f290693m;
            java.lang.String str2 = this.f290693m;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f290694n.equals(c22453x25437ad5.f290694n) && this.f290695o.equals(c22453x25437ad5.f290695o)) {
                    java.lang.String str3 = c22453x25437ad5.f290696p;
                    java.lang.String str4 = this.f290696p;
                    if (str4 == null) {
                        if (str3 == null) {
                            return true;
                        }
                    } else if (str4.equals(str3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m80790x8cdac1b() {
        int hashCode = (((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f290687d.hashCode()) * 31) + this.f290688e.hashCode()) * 31) + this.f290689f.hashCode()) * 31) + this.f290690g.hashCode()) * 31) + this.f290691h.hashCode()) * 31) + this.f290692i.hashCode()) * 31;
        java.lang.String str = this.f290693m;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f290694n.hashCode()) * 31) + this.f290695o.hashCode()) * 31;
        java.lang.String str2 = this.f290696p;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m80791x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{AccessToken token:null permissions:");
        java.util.Set set = this.f290688e;
        if (set == null) {
            sb6.append("null");
        } else {
            sb6.append("[");
            sb6.append(android.text.TextUtils.join(", ", set));
            sb6.append("]");
        }
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f290687d.getTime());
        parcel.writeStringList(new java.util.ArrayList(this.f290688e));
        parcel.writeStringList(new java.util.ArrayList(this.f290689f));
        parcel.writeStringList(new java.util.ArrayList(this.f290690g));
        parcel.writeString(this.f290691h);
        parcel.writeLong(this.f290692i.getTime());
        parcel.writeString(this.f290693m);
        parcel.writeString(this.f290694n);
        parcel.writeLong(this.f290695o.getTime());
        parcel.writeString(this.f290696p);
    }
}
