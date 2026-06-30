package com.tencent.mm.plugin.appbrand.custom_loading;

/* loaded from: classes7.dex */
public class CustomLoadingAddHistoryRecordIPCData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingAddHistoryRecordIPCData> CREATOR = new n91.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77547d;

    /* renamed from: e, reason: collision with root package name */
    public int f77548e;

    /* renamed from: f, reason: collision with root package name */
    public int f77549f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f77550g;

    public CustomLoadingAddHistoryRecordIPCData(android.os.Parcel parcel) {
        this.f77547d = parcel.readString();
        this.f77548e = parcel.readInt();
        this.f77549f = parcel.readInt();
        this.f77550g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77547d);
        parcel.writeInt(this.f77548e);
        parcel.writeInt(this.f77549f);
        parcel.writeString(this.f77550g);
    }
}
