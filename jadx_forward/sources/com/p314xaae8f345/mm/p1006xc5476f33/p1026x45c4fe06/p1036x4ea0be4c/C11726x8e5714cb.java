package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity */
/* loaded from: classes7.dex */
class C11726x8e5714cb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb> f33512x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f158318d;

    /* renamed from: e, reason: collision with root package name */
    public final int f158319e;

    public C11726x8e5714cb(java.lang.String str, int i17) {
        this.f158318d = str;
        this.f158319e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49906xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb c11726x8e5714cb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11726x8e5714cb) obj;
        return this.f158319e == c11726x8e5714cb.f158319e && java.util.Objects.equals(this.f158318d, c11726x8e5714cb.f158318d);
    }

    /* renamed from: hashCode */
    public int m49907x8cdac1b() {
        return java.util.Objects.hash(this.f158318d, java.lang.Integer.valueOf(this.f158319e));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158318d);
        parcel.writeInt(this.f158319e);
    }

    public C11726x8e5714cb(android.os.Parcel parcel) {
        this.f158318d = parcel.readString();
        this.f158319e = parcel.readInt();
    }
}
