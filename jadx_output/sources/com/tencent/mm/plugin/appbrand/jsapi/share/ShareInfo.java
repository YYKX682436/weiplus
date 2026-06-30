package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class ShareInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.share.ShareInfo> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.share.p2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83094d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f83095e;

    public ShareInfo(java.lang.String str, java.lang.String str2) {
        this.f83094d = str;
        this.f83095e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f83094d);
        parcel.writeString(this.f83095e);
    }

    public ShareInfo(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.jsapi.share.p2 p2Var) {
        this.f83094d = parcel.readString();
        this.f83095e = parcel.readString();
    }
}
