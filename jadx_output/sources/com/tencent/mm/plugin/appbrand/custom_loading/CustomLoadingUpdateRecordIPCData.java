package com.tencent.mm.plugin.appbrand.custom_loading;

/* loaded from: classes7.dex */
public class CustomLoadingUpdateRecordIPCData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingUpdateRecordIPCData> CREATOR = new n91.o();

    /* renamed from: d, reason: collision with root package name */
    public boolean f77553d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77554e;

    /* renamed from: f, reason: collision with root package name */
    public int f77555f;

    public CustomLoadingUpdateRecordIPCData(android.os.Parcel parcel) {
        this.f77554e = parcel.readString();
        this.f77555f = parcel.readInt();
        this.f77553d = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77554e);
        parcel.writeInt(this.f77555f);
        parcel.writeInt(this.f77553d ? 1 : 0);
    }
}
