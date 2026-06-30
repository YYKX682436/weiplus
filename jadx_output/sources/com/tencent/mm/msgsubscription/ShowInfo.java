package com.tencent.mm.msgsubscription;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/ShowInfo;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ShowInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.msgsubscription.ShowInfo> CREATOR = new d31.b();

    /* renamed from: d, reason: collision with root package name */
    public final int f71770d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71771e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f71772f;

    public ShowInfo(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f71770d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        this.f71771e = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.f71772f = readString2 != null ? readString2 : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f71770d);
        parcel.writeString(this.f71771e);
        parcel.writeString(this.f71772f);
    }

    public ShowInfo(int i17, java.lang.String title, java.lang.String content) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(content, "content");
        this.f71770d = i17;
        this.f71771e = title;
        this.f71772f = content;
    }
}
