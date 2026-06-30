package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable */
/* loaded from: classes7.dex */
public class C12092x3a87b473 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1087x5c4d1e6.C12092x3a87b473> f34153x681a0c0c = new jc1.a();

    /* renamed from: d, reason: collision with root package name */
    public int f162399d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f162400e;

    public C12092x3a87b473(jc1.d dVar) {
        this.f162399d = dVar.f380436a;
        this.f162400e = dVar.f380437b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50915x9616526c() {
        return "AppBrandErrorInfoParcelable{errno=" + this.f162399d + ", errnoMsg='" + this.f162400e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f162399d);
        parcel.writeString(this.f162400e);
    }

    public C12092x3a87b473(android.os.Parcel parcel) {
        this.f162399d = parcel.readInt();
        this.f162400e = parcel.readString();
    }
}
